package com.app.todoApp.services;

import com.app.todoApp.modals.Task;
import com.app.todoApp.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private  final TaskRepository taskrepo;

    public TaskService(TaskRepository taskrepo) {
        this.taskrepo = taskrepo;
    }

    public List<Task> getAllTask() {
        return taskrepo.findAll();
    }

    public void createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setComplete(false);
        taskrepo.save(task);
    }

    public void deleteTask(Long id) {
        taskrepo.deleteById(id);
    }

    public void toggleTask(Long id) {
        Task task =taskrepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Task"));
        task.setComplete(!task.isComplete());
        taskrepo.save(task);
    }
}
