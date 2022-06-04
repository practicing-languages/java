package com.CoelhoRafael.todolistapi.services;


import com.CoelhoRafael.todolistapi.models.Task;
import com.CoelhoRafael.todolistapi.models.dtos.TaskDTO;
import com.CoelhoRafael.todolistapi.repositories.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@SuppressWarnings("unused")
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    @Autowired
    private TasksRepository tasksRepository;

    public Task createTask(TaskDTO body) {
        Task newTask = new Task(
                body.getTitle(),
                body.getDate(),
                body.getDescription()
        );


tasksRepository.save(newTask);

        return newTask;
    }

    public List<Task> getTasks() {
        return (List<Task>) tasksRepository.findAll();
    }

    public Task getTaskById(UUID id) {
       Optional<Task> task = tasksRepository.findById(id);

        if (task.isEmpty()) {
            return null;
        }
        return task.get();
    }

    public boolean deleteTaskById(UUID id) {
     Task taskToDelete = getTaskById(id);

     if(taskToDelete == null){
         return false;
              }
     tasksRepository.deleteById(id);
     return true;
    }

    public Task updateTask(UUID id, TaskDTO body) {
        Task taskToUpdate = getTaskById(id);

        if (taskToUpdate == null) {
            return null;


        }
        taskToUpdate.setTitle(body.getTitle());
        taskToUpdate.setDate(body.getDate());
        taskToUpdate.setDescription(body.getDescription());

        tasksRepository.save(taskToUpdate);

        return taskToUpdate;
    }
}



    


