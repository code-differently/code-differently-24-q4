package com.codedifferently.lesson26.web;

import com.codedifferently.lesson26.library.Librarian;
import com.codedifferently.lesson26.library.Library;
import com.codedifferently.lesson26.library.MediaItem;
import com.codedifferently.lesson26.library.exceptions.MediaItemCheckedOutException;
import com.codedifferently.lesson26.library.search.SearchCriteria;
import jakarta.validation.Valid;
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
  public ResponseEntity<MediaItemResponse> getItem(@PathVariable UUID id) {
    SearchCriteria criteria = SearchCriteria.builder().id(id.toString()).build();
    Set<MediaItem> items = library.search(criteria);
    if (items.isEmpty()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    {
      MediaItem item = items.iterator().next();
      return ResponseEntity.ok(MediaItemResponse.from(item));
    }
  }

  @PostMapping("/items")
  public CreateMediaItemResponse addsItem(@Valid @RequestBody CreateMediaItemRequest request) {
    MediaItemRequest itemRequest = request.getItem();
    MediaItem item = MediaItemRequest.asMediaItem(itemRequest);
    library.addMediaItem(item, librarian);

    CreateMediaItemResponse response =
        CreateMediaItemResponse.builder().item(getItem(item.getId()).getBody()).build();

    return response;
  }

  @DeleteMapping("/items/{id}")
  public ResponseEntity<Void> deleteItem(@PathVariable String id) {
    SearchCriteria criteria = SearchCriteria.builder().id(id).build();
    Set<MediaItem> items = library.search(criteria);

    if (items.isEmpty()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    MediaItem item = items.iterator().next();

    try {
      library.removeMediaItem(item, librarian);
      return ResponseEntity.noContent().build();
    } catch (MediaItemCheckedOutException e) {
      return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
    }
  }
}
