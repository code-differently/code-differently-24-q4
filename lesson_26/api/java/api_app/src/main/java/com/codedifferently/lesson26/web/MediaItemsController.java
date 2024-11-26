package com.codedifferently.lesson26.web;

import com.codedifferently.lesson26.library.Librarian;
import com.codedifferently.lesson26.library.Library;
import com.codedifferently.lesson26.library.MediaItem;
import com.codedifferently.lesson26.library.search.SearchCriteria;
import jakarta.validation.Valid;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

  @GetMapping("/items/{id}")
  public ResponseEntity<MediaItemResponse> getItemById(@PathVariable("id") UUID id) {
    SearchCriteria searchCriteria = SearchCriteria.builder().id(id.toString()).build();

    Set<MediaItem> foundItem = library.search(searchCriteria);

    if (foundItem.isEmpty()) {
      return ResponseEntity.notFound().build();
    }
    MediaItem item = foundItem.iterator().next();
    MediaItemResponse response = MediaItemResponse.from(item);

    return ResponseEntity.ok(response);
  }

  @DeleteMapping("/items/{id}")
  public ResponseEntity<Void> deleteItem(@PathVariable("id") UUID id) {
    SearchCriteria searchCriteria = SearchCriteria.builder().id(id.toString()).build();

    Set<MediaItem> foundItem = library.search(searchCriteria);
    if (foundItem.isEmpty()) {
      return ResponseEntity.notFound().build();
    }
    MediaItem item = foundItem.iterator().next();
    library.removeMediaItem(item, librarian);
    return ResponseEntity.noContent().build();
  }

  @PostMapping("/items")
  public CreateMediaItemResponse addsItem(@Valid @RequestBody CreateMediaItemRequest request) {
    MediaItemRequest itemRequest = request.getItem();
    MediaItem item = MediaItemRequest.asMediaItem(itemRequest);
    library.addMediaItem(item, librarian);
    CreateMediaItemResponse response =
        CreateMediaItemResponse.builder().item(getItemById(item.getId()).getBody()).build();
    return response;
  }
}
