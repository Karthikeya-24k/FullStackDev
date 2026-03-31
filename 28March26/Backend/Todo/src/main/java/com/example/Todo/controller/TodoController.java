package com.example.Todo.controller;

import com.example.Todo.dto.ApiResponse;
import com.example.Todo.dto.RequestTodo;
import com.example.Todo.dto.ResponseTodo;
import com.example.Todo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @GetMapping
    public ApiResponse<List<ResponseTodo>> getAllTodos(){
        return new ApiResponse<>(true,"Todo fetched successfully",todoService.getAllTodo());
    }
    @GetMapping("/{id}")
    public ApiResponse<ResponseTodo> getTodoById(@PathVariable Long id){
        return new ApiResponse<>(true, "Todo fetched successfully",todoService.getTodoByID(id));
    }
    @PostMapping("/create")
    public ApiResponse<ResponseTodo> createTodo(@RequestBody RequestTodo request){
        return new ApiResponse<>(true, "Created todo successfully",todoService.createTodo(request));
    }
    @PostMapping("/update/{id}")
    public ApiResponse<ResponseTodo> updateTodo(@PathVariable Long id, @RequestBody RequestTodo req){
        return new ApiResponse<>(true,"Successfully updated the todo",todoService.updateTodo(id, req));
    }
    @PostMapping("/delete/{id}")
    public ApiResponse<ResponseTodo> deleteTodo(@PathVariable Long id){
        todoService.deleteTodo(id);
        return new ApiResponse<>(true,"Successfully deleted the todo",null);
    }


}
