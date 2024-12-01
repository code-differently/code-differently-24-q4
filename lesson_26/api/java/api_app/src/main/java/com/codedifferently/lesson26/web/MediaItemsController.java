package com.codedifferently.lesson26.web;

import com.codedifferently.lesson26.library.Librarian;
import com.codedifferently.lesson26.library.Library;
import com.codedifferently.lesson26.library.MediaItem;
import com.codedifferently.lesson26.library.search.SearchCriteria;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@CrossOrigin
public class MediaItemsController {
  private final Library library;
  private final Librarian librarian;

  public MediaItemsController(Library library) throws IOException {
    this.library = library;
    this.librarian = library.getLibrarians().stream().findFirst().orElseThrow();
  }

  @GetMapping("/items")
  public GetMediaItemsResponse getItems() {
    Set<MediaItem> items = library.search(SearchCriteria.builder().build());
    List<MediaItemResponse> responseItems = items.stream().map(MediaItemResponse::from).toList();
    var response = GetMediaItemsResponse.builder().items(responseItems).build();
    return response;
  }

  @PostMapping("/items")
  public MediaItemResponse postItem() {
    //UUID id = UUID.randomUUID();
    MediaItemRequest newItem = CreateMediaItemRequest.builder()
          .id(UUID.randomUUID())
          .type("Book")
          .isbn("13")
          .title("The Fall of the House of Usher")
          .authors(new String[] {"Edgar Allan Poe"})
          .edition("1st Edition")
          .pages(25)
          .build();

    CreateMediaItemRequest createRequest = CreateMediaItemRequest.builder()
          .item(newItem)
          .build();

      library.add(createRequest.getItem());
    
    return  MediaItemResponse.from(createRequest.getItem());
  }

  @GetMapping("/items/:{id}")
  public GetMediaItemsResponse getItemById(@PathVariable("id") String id) {
    Set<MediaItem> item = library.search(SearchCriteria.builder().id(id).build());
    MediaItemResponse responseItemById = item.stream().map(MediaItemResponse::from).toList().findFirst().orElseThrow();
    var response = GetMediaItemsResponse.builder().item(responseItemById).build();
    return response;
  }

  @DeleteMapping("/items/:{id}") 
  public MediaItemResponse deleteItemById(@PathVariable("id") String id) {
    Set<MediaItem> itemToDelete = library.search(SearchCriteria.builder().id(id).build());
    //MediaItemRequest deleteItem = CreateMediaItemRequest.builder().build();
    CreateMediaItemRequest createDeleteRequest = CreateMediaItemRequest.builder().deleteItem(itemToDelete).build();

    library.delete(createDeleteRequest.getItem());

    return MediaItemResponse.from(createDeleteRequest.getItem());
  }
}
