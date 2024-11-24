package com.codedifferently.lesson26.web;

import com.codedifferently.lesson26.library.Librarian;
import com.codedifferently.lesson26.library.Library;
import com.codedifferently.lesson26.library.MediaItem;
import com.codedifferently.lesson26.library.search.SearchCriteria;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.http.HttpStatus;
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
  public GetMediaItemsResponse getItem(@PathVariable UUID id) {
    Set<MediaItem> items = library.search(SearchCriteria.builder().build());
    List<MediaItemResponse> responseItem =
        items.stream()
            .map(MediaItemResponse::from) // Transform the original objects
            .filter(item -> item.getId().equals(id))
            .toList();
    var response = GetMediaItemsResponse.builder().items(responseItem).build();

    return response;
  }

  @DeleteMapping("/items/{id}")
  public ResponseEntity<Object> deleteItem(@PathVariable UUID id) {
    Set<MediaItem> items = library.search(SearchCriteria.builder().build());
    List<MediaItemResponse> itemToDelete =
        items.stream()
            .map(MediaItemResponse::from) // Transform the original objects
            .filter(item -> item.getId().equals(id))
            .toList();

    if (!itemToDelete.isEmpty()) {
      library.removeMediaItem(id, librarian);
      return ResponseEntity.status(HttpStatus.OK).body("media item deleted successfully");
    }
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Media deletion not successful");
  }

  @PostMapping("/items")
  public ResponseEntity<Object> addItem(@RequestBody MediaItemRequest mediaItemRequest) {

    MediaItem mediaItem = MediaItemRequest.asMediaItem(mediaItemRequest);
    library.addMediaItem(mediaItem, librarian);

    if (null == mediaItem) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body("media item creation not successful");
    }
    return ResponseEntity.status(HttpStatus.CREATED).body("new media item created successfully");
  }
}
