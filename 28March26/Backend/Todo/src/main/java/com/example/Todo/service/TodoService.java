package com.example.Todo.service;

import com.example.Todo.dto.RequestTodo;
import com.example.Todo.dto.ResponseTodo;
import com.example.Todo.entity.TodoEntity;
import com.example.Todo.exception.ResourceNotFoundException;
import com.example.Todo.repository.TodoRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {
    private final TodoRepo todoRepo;

    public TodoService(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }
    //Get all the list of todos
    public List<ResponseTodo> getAllTodo(){
        return todoRepo.findAll().stream().map(this::mapToResponse).collect(Collectors.toList());
    }
    //Get by id
    public ResponseTodo getTodoByID(Long id){
        TodoEntity todo = todoRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found by the id: "+id));
    return mapToResponse(todo);
    }
//Creating the new todo
public ResponseTodo createTodo(RequestTodo request){
        TodoEntity todo = new TodoEntity();
        todo.setTitle(request.getTitle());
        todo.setDescription(request.getDescription());
        TodoEntity saved = todoRepo.save(todo);
        return mapToResponse(saved);
}
//Update todo
    public ResponseTodo updateTodo(Long id, RequestTodo request){
        TodoEntity todo = todoRepo.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Todo not found with the id"+id));
        todo.setTitle(request.getTitle());
        todo.setDescription(request.getDescription());
        TodoEntity updatedTodo = todoRepo.save(todo);
        return mapToResponse(updatedTodo);
    }
//    Delete todo
    public ResponseTodo deleteTodo(Long id){
        TodoEntity todo = todoRepo.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Todo not found with id: " + id));
        todoRepo.deleteById(id);
        return new ResponseTodo(

        );
    }
    //Mapper (Maps to entity and response)
    private ResponseTodo mapToResponse(TodoEntity todo){
        return new ResponseTodo(
          todo.getId(),
          todo.getTitle(),
          todo.getDescription()
        );
    }
}
