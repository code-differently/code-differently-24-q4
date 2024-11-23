package com.codedifferently.lesson26.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateMediaItemRequest {
  @NotNull(message = "item is required") @Valid
  @JsonProperty("item")
  private MediaItemRequest item;
}
