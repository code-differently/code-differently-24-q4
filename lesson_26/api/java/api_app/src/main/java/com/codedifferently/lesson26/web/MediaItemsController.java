package com.codedifferently.lesson26.web;

import com.codedifferently.lesson26.library.Librarian;
import com.codedifferently.lesson26.library.Library;
import com.codedifferently.lesson26.library.MediaItem;
import com.codedifferently.lesson26.library.search.SearchCriteria;
import jakarta.validation.Valid;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
    String stringId = id.toString();
    SearchCriteria searchCriteria = SearchCriteria.builder().id(stringId).build();

    Set<MediaItem> foundItems = library.search(searchCriteria);

    if (foundItems.isEmpty()) {
      return ResponseEntity.notFound().build();
    }

    MediaItem item = foundItems.iterator().next();
    MediaItemResponse response = MediaItemResponse.from(item);

    return ResponseEntity.ok(response);
  }

  @PostMapping("/items")
  public CreateMediaItemResponse createMediaItem(@RequestBody @Valid CreateMediaItemRequest request)
      throws MethodArgumentNotValidException {

    MediaItemRequest itemRequest = request.getItem();

    var item = MediaItemRequest.asMediaItem(itemRequest);

    library.addMediaItem(item, librarian);

    var response =
        CreateMediaItemResponse.builder().item(getItemById(item.getId()).getBody()).build();

    return response;
  }

  @DeleteMapping("/items/{id}")
  public ResponseEntity<Void> deleteItem(@PathVariable("id") UUID id) {

    SearchCriteria query = new SearchCriteria();
  Set<MediaItem> items = library.search(query);
  Optional<MediaItem> item = items.stream()
                                .filter(mediaItem -> mediaItem.getId().equals(id))
                                .findFirst();

    if (item.isEmpty()) {
      return ResponseEntity.notFound().build();
    }

    library.removeMediaItem(id, librarian);

    return ResponseEntity.noContent().build();
  }
}
