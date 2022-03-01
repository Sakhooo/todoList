package kz.sagadat.spring.todolist.service.impl;

import kz.sagadat.spring.todolist.dao.TodoListRepository;
import kz.sagadat.spring.todolist.entity.TodoList;
import kz.sagadat.spring.todolist.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TodoListServiceImpl implements TodoListService {
    @Autowired
    private TodoListRepository todoListRepository;

    @Override
    public List<TodoList> getAllTodoList() {
        List<TodoList> allTodoList = todoListRepository.findAll();
        return allTodoList;
    }

    @Override
    public void saveTodoList(TodoList todoList) {
    todoListRepository.save(todoList);
    }

    @Override
    public TodoList updateTodoList(int id) {
        TodoList todoList = null;
        Optional<TodoList> optional =todoListRepository.findById(id);
        if (optional.isPresent()){
            todoList = optional.get();
        }
        return todoList;
    }

    @Override
    public void deleteTodoList(int id) {
        todoListRepository.deleteById(id);
    }
}
