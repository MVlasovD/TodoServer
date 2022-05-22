package ru.netology.javacore;

import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Todos {

    protected List<String> tasks;


    static Todos todos = new Todos();

    public void addTask(String task) {
        todos.getTasks().add(task);
    }

    public void removeTask(String task) {
        for (String todo : todos.tasks) {
            if (task.equals(todo)) {
                todos.getTasks().remove(task);
            }
        }
    }

    public String getAllTasks() {

        return null;
    }

}
