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
import org.springframework.web.bind.annotation.RequestBody;

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
  public MediaItemResponse addItemById(@RequestBody CreateMediaItemRequest createRequest) {
    if (createRequest.getItem().getId() == null) {
      createRequest.getItem().setId(UUID.randomUUID());
    }
    
      library.add(createRequest.getItem());
    
    return  MediaItemResponse.from(createRequest.getItem());
  }

  @GetMapping("/items/:{id}")
  public MediaItemResponse getItemById(@PathVariable("id") UUID id) {
    MediaItem item = library.search(SearchCriteria.builder().id(id.toString()).build()).stream().findFirst().orElseThrow();
   
    return MediaItemResponse.from(item);
  }

  @DeleteMapping("/items/:{id}") 
  public MediaItemResponse deleteItemById(@PathVariable("id") UUID id) {
    MediaItem itemToDelete = library.search(SearchCriteria.builder().id(id.toString()).build()).stream().findFirst().orElseThrow();
    Librarian librarian = library.getLibrarians().stream().findFirst().orElseThrow();
    library.removeMediaItem(itemToDelete, librarian);

    return MediaItemResponse.from(itemToDelete);
  }
}
