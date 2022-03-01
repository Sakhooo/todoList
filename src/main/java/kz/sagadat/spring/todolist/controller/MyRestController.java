package kz.sagadat.spring.todolist.controller;

import kz.sagadat.spring.todolist.entity.TodoList;
import kz.sagadat.spring.todolist.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    private TodoListService todoListService;

    @GetMapping("/todoLists")
    public List<TodoList> showAllTodolist(){
        List<TodoList> allTodoList = todoListService.getAllTodoList();
        return allTodoList;
    }
    @GetMapping("/todoLists/{id}")
    public TodoList getTodoList(@PathVariable int id){
        TodoList todoList = todoListService.updateTodoList(id);
        return  todoList;
    }
    @PostMapping("/todoLists")
    public TodoList addNewTodoList(@RequestBody TodoList todoList){
        todoListService.saveTodoList(todoList);
        return todoList;
    }

    @PutMapping("/todoList")
    public TodoList updateTodoList(@RequestBody TodoList todoList){
        todoListService.saveTodoList(todoList);
        return todoList;
    }
    @DeleteMapping("/todoList/{id}")
    public String deleteTodoList(@PathVariable int id){
        TodoList todoList = todoListService.updateTodoList(id);
        return "TodoList wuth id = " + id + " was deleted";
    }
}
