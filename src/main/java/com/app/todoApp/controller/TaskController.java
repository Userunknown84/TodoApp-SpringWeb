package com.app.todoApp.controller;

import org.springframework.ui.Model;
import com.app.todoApp.modals.Task;
import com.app.todoApp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskservice;

    public TaskController(TaskService taskservice) {
        this.taskservice = taskservice;
    }
    @GetMapping
    public String getTasks(Model model) {
        List<Task> tasks = taskservice.getAllTask();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
    @PostMapping
    public String crateTask(@RequestParam String title) {
        taskservice.createTask(title);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id ) {
        taskservice.deleteTask(id);
        return "redirect:/";
    }
    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id ) {
        taskservice.toggleTask(id);
        return "redirect:/";
    }

}
