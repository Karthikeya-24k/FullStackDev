package com.example.taskmanager.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.taskmanager.dto.TaskRequest;
import com.example.taskmanager.dto.TaskResponse;
import com.example.taskmanager.entity.TaskEntity;
import com.example.taskmanager.repository.TaskRepository;

@Service
public class TaskServices {
    private final TaskRepository taskRepository;

    public TaskServices(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    
    public List<TaskResponse> gettaskResponses(List<TaskRequest> requests){
        List<TaskEntity> task = requests.stream().map(
            req ->{
                TaskEntity ent = new TaskEntity();
                ent.setTitle(req.getTitle());
                ent.setDescription(req.getTitle());
                ent.setPriority(req.getPriority());
                return ent;
            }
        ).collect(Collectors.toList());

        List<TaskEntity> saveTask = taskRepository.saveAll(task);

        return saveTask.stream().map(
            taskss -> {
                TaskResponse res = new TaskResponse();
                res.setId(taskss.getId());
                res.setName(taskss.getTitle());
                res.setDescription(taskss.getDescription());
                res.setPriority(taskss.getPriority());
                return res;
            }
        ).collect(Collectors.toList());
    }
    public Page<TaskEntity> getTask(Pageable pageable){
        return taskRepository.findAll(pageable);
    }
}
