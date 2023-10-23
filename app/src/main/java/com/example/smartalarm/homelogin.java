package com.example.smartalarm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class homelogin extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homelogin);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for(int i=0;i<mainGrid.getChildCount();i++){
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
           cardView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if (finalI == 0) {

                       Intent intent = new Intent(homelogin.this, Alarm1.class);
                       startActivity(intent);


                   }
                   else if (finalI == 1) {

                       Intent intent = new Intent(homelogin.this, Alarm1.class);
                       startActivity(intent);


                   }
                   else if (finalI == 2) {

                       Intent intent = new Intent(homelogin.this, Alarm1.class);
                       startActivity(intent);


                   }
                   else if (finalI == 3) {

                       Intent intent = new Intent(homelogin.this, Alarm1.class);
                       startActivity(intent);


                   }
                   else if (finalI == 4) {

                       Intent intent = new Intent(homelogin.this, Alarm1.class);
                       startActivity(intent);


                   }
                   else if (finalI == 5) {

                       Intent intent = new Intent(homelogin.this, Alarm1.class);
                       startActivity(intent);


                   }
               }
           });
            }
        }
    }
