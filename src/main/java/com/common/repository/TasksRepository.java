package com.common.repository;

import com.common.entity.TasksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TasksRepository extends JpaRepository<TasksEntity, Long> {
    List<TasksEntity> findByUserId(String userId);
    List<TasksEntity> findByUserIdAndStatus(String userId, Long status);
}
