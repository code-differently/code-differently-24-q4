package com.codedifferently.lesson26.web;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.hibernate.validator.constraints.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codedifferently.lesson26.library.Librarian;
import com.codedifferently.lesson26.library.Library;
import com.codedifferently.lesson26.library.MediaItem;
import com.codedifferently.lesson26.library.search.SearchCriteria;

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

  @PostMapping("/items")
  public ResponseEntity<CreateMediaItemResponse> postItems(
      @Valid @RequestBody CreateMediaItemRequest request) {
    MediaItemRequest itemRequest = request.getItem();
    MediaItem item = MediaItemRequest.asMediaItem(itemRequest);
    library.addMediaItem(item, librarian);
    MediaItemResponse response = MediaItemResponse.from(item);
    return ResponseEntity.ok(CreateMediaItemResponse.builder().item(response).build());
  }

  @GetMapping("/items/{id}")
  public ResponseEntity<GetMediaItemsResponse> getItemsId(@PathVariable String id) {
    Set<MediaItem> items = library.search(SearchCriteria.builder().id(id).build());
    if (items.isEmpty()) {
      return ResponseEntity.notFound().build();
    }
    MediaItemResponse responseItem = items.stream().map(MediaItemResponse::from).iterator().next();
    return ResponseEntity.ok(GetMediaItemsResponse.builder().item(responseItem).build());
  }

  @DeleteMapping("/items/{id}")
  public ResponseEntity<Void> deletebById(@PathVariable UUID id) {
    Set<MediaItem> items = library.search(SearchCriteria.builder().id(id.toString()).build());
    MediaItem item = items.iterator().next();
    if(items.isEmpty()){
      return ResponseEntity.notFound().build();
    }
    library.removeMediaItem(item, librarian);
    return ResponseEntity.noContent().build();
  }
}
