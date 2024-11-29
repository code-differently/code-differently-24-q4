package com.codedifferently.fullstack_demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Data
@Getter
@Setter
public class Todo {

    private long id;
    private String text;
    private boolean completed;
}
