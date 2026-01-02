package com.getTask.rest;

import com.example.todoApi.api.SearchApi;
import com.example.todoApi.model.TodoListResponseDTO;
import com.getTask.service.GetTaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GetTaskController implements SearchApi {

    private final GetTaskService Service;

    @Override
    public ResponseEntity<TodoListResponseDTO> searchTodoList(String userId,Long status) {
        TodoListResponseDTO responseDTO = Service.searchTodoList(userId, status);

        return ResponseEntity.ok(responseDTO);
    }
}
