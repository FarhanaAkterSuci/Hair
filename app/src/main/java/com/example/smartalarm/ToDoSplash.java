package com.example.smartalarm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.smartalarm.Adapter.ToDoAdapter;
import com.example.smartalarm.Model.ToDoModel;

import java.util.ArrayList;
import java.util.List;

public class ToDoSplash extends AppCompatActivity {
    private RecyclerView tasksRecyclerView;
    private ToDoAdapter taskAdapter;

    private List<ToDoModel> taskList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_splash);
        getSupportActionBar().hide();
        taskList = new ArrayList<>();
        tasksRecyclerView = findViewById(R.id.tasksRecycleView);
        tasksRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        taskAdapter = new ToDoAdapter(ToDoSplash.this);
        tasksRecyclerView.setAdapter(taskAdapter);

        ToDoModel task = new ToDoModel();
        task.setTask("This is a Test Task");
        task.setStatus(0);
        task.setId(1);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskAdapter.setTasks(taskList);







    }
}