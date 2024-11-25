package com.codedifferently.lesson26.web;

import com.codedifferently.lesson26.library.Librarian;
import com.codedifferently.lesson26.library.Library;
import com.codedifferently.lesson26.library.MediaItem;
import com.codedifferently.lesson26.library.search.SearchCriteria;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

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

    // GET a single item by its ID
    @GetMapping("/items/{id}")
    public MediaItemResponse getItem(@PathVariable String id) {
        Optional<MediaItem> item = library.search(SearchCriteria.builder().id(id).build()).stream().findFirst();
        if (item.isPresent()) {
            return MediaItemResponse.from(item.get());
        } else {
            throw new IllegalArgumentException("Unknown media item ID: " + id);
        }
    }

    // POST a new item to /items
    @PostMapping("/items")
    public MediaItemResponse addItem(@RequestBody CreateMediaItemRequest request) {
        MediaItemRequest mediaItemRequest = request.getItem();
        MediaItem newItem = MediaItemRequest.asMediaItem(mediaItemRequest);
        library.addMediaItem(newItem, librarian); // Assuming the library has an addItem method
        return MediaItemResponse.from(newItem);
    }

    // DELETE an item by its ID
    @DeleteMapping("/items/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // No content when successfully deleted
    public void deleteItem(@PathVariable String id) {
        Set<MediaItem> items = library.search(SearchCriteria.builder().id(id).build());
        if (items.isEmpty()) {
            throw new IllegalArgumentException("This ID does not exsist to delete! ID: " + id);
        }
        MediaItem itemToDelete = items.iterator().next();
        library.removeMediaItem(itemToDelete, librarian); // Assuming the library has a removeItem method
    }
}
