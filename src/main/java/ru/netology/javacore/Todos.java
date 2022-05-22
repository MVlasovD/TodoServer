package ru.netology.javacore;

import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Todos {

    protected List<String> tasks;


    public void addTask(String task) {
        Todos todo = new Todos();
        todo.getTasks().add(task);
    }

    public void removeTask(String task) {
     Todos todos = new Todos();
     for (String todo : todos.tasks) {
         if (task.equals(todo)){
             todos.getTasks().remove(task);
         }
     }
    }

    public String getAllTasks() {
        return  null;
    }

}
