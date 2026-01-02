package com.getTask.service;

import com.common.entity.TasksEntity;
import com.common.repository.TasksRepository;

import com.example.todoApi.model.TodoDTO;
import com.example.todoApi.model.TodoListResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class GetTaskService {
    private final TasksRepository repository;

    /**
     * タスクを検索します。
     * @param userId ユーザId
     * @param status ステータス
     * @return TodoListResponseDTO
     */
    public TodoListResponseDTO searchTodoList(String userId, Long status){

        List<TasksEntity> entityList;

        // タスクを検索
        if (Objects.isNull(status)) {
            entityList = repository.findByUserId(userId);
        } else {
           entityList = repository.findByUserIdAndStatus(userId, status);
        }

        List<TodoDTO> dtoList = new ArrayList<>();

        if (Objects.nonNull(entityList)) {
            // レスポンスDTOに詰め替える
            dtoList = entityList.stream()
                .map(e -> new TodoDTO(
                    e.getId(),
                    e.getUserId(), // ValueVarchar → String
                    e.getTitle(),
                    e.getStatus(),
                    e.getEmphasisFlg()
                ))
                .toList();
        }

        return new TodoListResponseDTO(dtoList);
    }
}
