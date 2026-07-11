package com.app.todoApp.repository;

import com.app.todoApp.modals.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
