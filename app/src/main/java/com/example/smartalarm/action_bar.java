package com.example.smartalarm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.GridLayout;

public class action_bar extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
    }
    public boolean onCreateOptionMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nav_menu,menu);
        return true;
    }



    private void setSingleEvent(GridLayout mainGrid) {
        for(int i=0;i<mainGrid.getChildCount();i++){
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI == 0) {

                        Intent intent = new Intent(action_bar.this, Alarm1.class);
                        startActivity(intent);


                    }
                    else if (finalI == 1) {

                        Intent intent = new Intent(action_bar.this, stopwatch.class);
                        startActivity(intent);


                    }
                    else if (finalI == 2) {

                        Intent intent = new Intent(action_bar.this, Alarm1.class);
                        startActivity(intent);


                    }
                    else if (finalI == 3) {

                        Intent intent = new Intent(action_bar.this, SpashTodo.class);
                        startActivity(intent);


                    }
                    else if (finalI == 4) {

                        Intent intent = new Intent(action_bar.this, Alarm1.class);
                        startActivity(intent);


                    }
                    else if (finalI == 5) {

                        Intent intent = new Intent(action_bar.this, navbar_display.class);
                        startActivity(intent);


                    }
                }
            });
        }
    }
}

