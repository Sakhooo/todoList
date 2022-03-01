package kz.sagadat.spring.todolist.dao;

import kz.sagadat.spring.todolist.entity.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoList,Integer> {
}
