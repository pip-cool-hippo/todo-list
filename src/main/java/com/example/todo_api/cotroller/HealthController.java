package com.example.todo_api.cotroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.example.todoApi.api.TodoApi;

@RestController
public class HealthController implements TodoApi {
    @Override
    public ResponseEntity<Void> healthGet() {
        return ResponseEntity.ok().build();
    }
}
