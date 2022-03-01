package kz.sagadat.spring.todolist.service;


import kz.sagadat.spring.todolist.entity.TodoList;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TodoListService {
    public List<TodoList> getAllTodoList();
    public void saveTodoList(TodoList todoList);
    public TodoList updateTodoList(int id);
    public void deleteTodoList(int id);

}
