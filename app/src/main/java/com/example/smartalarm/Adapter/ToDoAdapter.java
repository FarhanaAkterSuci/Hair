package com.example.smartalarm.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smartalarm.Model.ToDoModel;
import com.example.smartalarm.R;
import com.example.smartalarm.ToDoSplash;

import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ViewHolder> {

    private List<ToDoModel> todoList;
    private ToDoSplash activity;
    public ToDoAdapter(ToDoSplash activity){
        this.activity = activity;
    }
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_layout,parent,false);
        return new ViewHolder(itemView);


        }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ToDoModel item = todoList.get(position);
        holder.task.setText(item.getTask());
        holder.task.setChecked(toBoolean(item.getStatus()));
    }


    public int getItemCount()
    {


        return todoList.size();




    }



    private boolean toBoolean(int n)
    {
        return n!=0;
    }

    public void setTasks(List<ToDoModel> todoList){
        this.todoList = todoList;
        notifyDataSetChanged();




    }




    public static class ViewHolder extends RecyclerView.ViewHolder {

        CheckBox task;
        ViewHolder (View view) {

            super(view);
            task = view.findViewById(R.id.todoCheckbox);




        }






        }



    }












