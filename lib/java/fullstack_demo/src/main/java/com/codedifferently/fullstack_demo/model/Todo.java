package com.codedifferently.fullstack_demo.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Todo {

    private long id;
    private String text;
    private boolean completed;
}
