package com.example.todobackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    @Id
    private String id;
    private String text;
    private boolean complete;
}

/*
  id ->
  text ->
  complete ->
 */