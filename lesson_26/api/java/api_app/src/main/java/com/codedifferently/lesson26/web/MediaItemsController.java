package com.codedifferently.lesson26.web;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedifferently.lesson26.library.Librarian;
import com.codedifferently.lesson26.library.Library;
import com.codedifferently.lesson26.library.MediaItem;
import com.codedifferently.lesson26.library.search.SearchCriteria;

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
  public CreateMediaItemResponse createItem(@RequestBody CreateMediaItemRequest request) {
    if (request == null || request.getItem() == null) {
      throw new IllegalArgumentException("Invalid request body");
    }
  MediaItem newItem = request.toMediaItem();
  library.addItem(newItem);
  return new CreateMediaItemResponse(newItem);
  }
  @GetMapping("/items/{id}")
  public MediaItemResponse getItemById(@PathVariable String id) {
    MediaItem item = library.getItemById(id);
    if (item == null) {
      throw new MediaItemNotFoundException("Media item not found");
    }
    return MediaItemResponse.from(item);
  }
  @DeleteMapping("/items/{id}")
  public ResponseEntity<Void> deleteItem(@PathVariable String id) {
    boolean deleted = library.deleteItem(id);
    if (!deleted) {
      throw new MediaItemNotFoundException("Item not found");
    }
    return ResponseEntity.noContent().build();
  }
}
