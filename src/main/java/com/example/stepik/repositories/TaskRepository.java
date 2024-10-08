package com.example.stepik.repositories;

import com.example.stepik.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findAllById(Long id);

    List<Task> findAllByUser_Id(Long id);
}
