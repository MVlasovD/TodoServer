package ru.netology.javacore;

import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Todos {

    protected String type;
    protected String task;

    static StringBuilder tasks = new StringBuilder();
    static Todos todos = new Todos();

    public void addTask(String task) {
        tasks.append(getTask());
    }

    public void removeTask(String task) {


    }

    public String getAllTasks() {

        return null;
    }

}
