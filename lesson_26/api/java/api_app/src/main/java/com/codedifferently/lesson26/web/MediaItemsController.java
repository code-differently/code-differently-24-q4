package com.codedifferently.lesson26.web;

import com.codedifferently.lesson26.library.Librarian;
import com.codedifferently.lesson26.library.Library;
import com.codedifferently.lesson26.library.MediaItem;
import com.codedifferently.lesson26.library.search.SearchCriteria;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

  // Get item
  @GetMapping("/items/{id}")
  public ResponseEntity<MediaItemResponse> getItem(@PathVariable String id) {
    SearchCriteria criteria = SearchCriteria.builder().id(id).build();
    Set<MediaItem> items = library.search(criteria);
    if (items.isEmpty()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    {
      MediaItem item = items.iterator().next();
      return ResponseEntity.ok(MediaItemResponse.from(item));
    }
  }

  // post item
  @PostMapping("/items")
  public ResponseEntity<?> addsItem(@RequestBody CreateMediaItemRequest request) {
    if (request == null || request.getItem() == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Missing item in the body");
    }
    try {
      MediaItem newItem = MediaItemRequest.asMediaItem(request.getItem());

      library.addMediaItem(newItem, librarian);

      return ResponseEntity.ok(Map.of("item", MediaItemResponse.from(newItem)));
    } catch (IllegalArgumentException e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
  }
}

  // Delete
