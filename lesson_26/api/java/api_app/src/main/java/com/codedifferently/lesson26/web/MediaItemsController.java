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
  public ResponseEntity<String> getItem(@PathVariable UUID id) {
    Set<MediaItem> items = library.search(SearchCriteria.builder().build());

    List<MediaItemResponse> responseItem =
        items.stream()
            .map(MediaItemResponse::from) // Transform the original objects
            .filter(item -> item.getId().equals(id))
            .toList();
    if (responseItem.size() == 0) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    if (responseItem.size() >= 1)
      return ResponseEntity.status(HttpStatus.OK).body("media item found");
    else return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }

  @DeleteMapping("/items/{id}")
  public ResponseEntity<Void> deleteItem(@PathVariable UUID id) {
    Set<MediaItem> items = library.search(SearchCriteria.builder().build());
    List<MediaItemResponse> itemToDelete =
        items.stream()
            .map(MediaItemResponse::from) // Transform the original objects
            .filter(item -> item.getId().equals(id))
            .toList();
    if (itemToDelete.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    if (!itemToDelete.isEmpty()) {
      library.removeMediaItem(id, librarian);
      return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }

  @PostMapping("/items")
  public ResponseEntity<?> addsItem(@RequestBody CreateMediaItemRequest mediaItemRequest) {
    if (null == mediaItemRequest.getItem() || null == mediaItemRequest) { 
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    MediaItem mediaItem = MediaItemRequest.asMediaItem(mediaItemRequest.getItem());
    if (null == mediaItem || null == mediaItem.getTitle()) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    
    library.addMediaItem(mediaItem, librarian);
    return ResponseEntity.status(HttpStatus.OK).body(mediaItemRequest);
  }
}
