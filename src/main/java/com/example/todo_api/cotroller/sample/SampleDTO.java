package com.example.todo_api.cotroller.sample;

import lombok.Value;

import java.time.LocalDateTime;

@Value
public class SampleDTO {
    String content;
    LocalDateTime timestamp;
}
