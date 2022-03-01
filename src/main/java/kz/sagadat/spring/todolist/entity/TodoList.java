package kz.sagadat.spring.todolist.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "todo_lists")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "name")
    String name;

    @Column(name = "date")
    String date;

    @Column(name = "priority")
    String priority;

    @Column(name = "description")
    String description;

    @Column(name = "is_done")
    boolean done;
}