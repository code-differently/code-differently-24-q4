package com.codedifferently.lesson26.web;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedifferently.lesson26.library.Librarian;
import com.codedifferently.lesson26.library.Library;
import com.codedifferently.lesson26.library.MediaItem;
import com.codedifferently.lesson26.library.exceptions.MediaItemCheckedOutException;
import com.codedifferently.lesson26.library.search.SearchCriteria;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

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
  public ResponseEntity<MediaItemResponse> getItemById(@PathVariable("id") String id) {
    Set <MediaItem> items = library.search(SearchCriteria.builder().id(id).build());
    if (items.isEmpty()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    MediaItem item = items.iterator().next();
    MediaItemResponse response = MediaItemResponse.from(item);
    return ResponseEntity.ok(response);
  }

  @PostMapping("/items")
public ResponseEntity<?> addItem(@Valid @RequestBody MediaItemRequest request) {
    if (request == null) {
        return ResponseEntity.badRequest().body(Map.of("errors", List.of("Missing required fields")));
    }

    MediaItem newItem;
    try {
        newItem = MediaItemRequest.asMediaItem(request);
    } catch (IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(Map.of("errors", List.of("Unknown media item type: " + request.getType())));
    }

    library.addMediaItem(newItem, new Librarian("Jane Doe", "JaneDoe@gmail.com")); 

    return ResponseEntity.ok(Map.of("item", Map.of("id", newItem.getId().toString())));
}

@DeleteMapping("/items/{id}")
  public ResponseEntity<Map<String, List<String>>> deleteItem(@PathVariable("id") String id) {
    Set <MediaItem> items = library.search(SearchCriteria.builder().id(id).build());
    if (items.isEmpty()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    
    MediaItem item = items.iterator().next();

    try {
      library.removeMediaItem(item, librarian);
    } catch (MediaItemCheckedOutException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(Map.of("errors", List.of(e.getMessage())));
    }

    return ResponseEntity.noContent().build();
 }
}
