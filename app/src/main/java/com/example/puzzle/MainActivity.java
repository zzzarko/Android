package com.example.puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.media.Image;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Pozivamo sve  redom Layout-e
        // Nadjemo ih preko id-a. Meni je ID isti kao ime promenljive
        // poz_11 je meni LinearLayout na poziciji 11(prvi red, prva kolona)
        LinearLayout poz_11 = (LinearLayout)findViewById(R.id.poz_11);
        // Prvi red, druga kolona
        LinearLayout poz_12 = (LinearLayout)findViewById(R.id.poz_12);
        LinearLayout poz_13 = (LinearLayout)findViewById(R.id.poz_13);

        LinearLayout poz_21 = (LinearLayout)findViewById(R.id.poz_21);
        LinearLayout poz_22 = (LinearLayout)findViewById(R.id.poz_22);
        LinearLayout poz_23 = (LinearLayout)findViewById(R.id.poz_23);
        // Treci red, prva kolona itd. ...
        LinearLayout poz_31 = (LinearLayout)findViewById(R.id.poz_31);
        LinearLayout poz_32 = (LinearLayout)findViewById(R.id.poz_32);
        LinearLayout poz_33 = (LinearLayout)findViewById(R.id.poz_33);

        LinearLayout poz_41 = (LinearLayout)findViewById(R.id.poz_41);
        LinearLayout poz_42 = (LinearLayout)findViewById(R.id.poz_42);
        LinearLayout poz_43 = (LinearLayout)findViewById(R.id.poz_43);
        //-----------------------------------------------------------
        // Nadjemo slike preko ID-a, ima ih 12 ukupno
        ImageView slk1 = (ImageView) findViewById(R.id.android00);
        ImageView slk2 = (ImageView) findViewById(R.id.android01);
        ImageView slk3 = (ImageView) findViewById(R.id.android02);
        ImageView slk4 = (ImageView) findViewById(R.id.android10);
        ImageView slk5 = (ImageView) findViewById(R.id.android11);
        ImageView slk6 = (ImageView) findViewById(R.id.android12);
        ImageView slk7 = (ImageView) findViewById(R.id.android20);
        ImageView slk8 = (ImageView) findViewById(R.id.android21);
        ImageView slk9 = (ImageView) findViewById(R.id.android22);
        ImageView slk10 = (ImageView) findViewById(R.id.android30);
        ImageView slk11 = (ImageView) findViewById(R.id.android31);
        ImageView slk12 = (ImageView) findViewById(R.id.android32);

//-----------------------------------------------------------------------------------

        //Svakoj slici setujemo touchListener, u konstruktoru
        // je instanca klase TouchListener u nasem slucaju se
        // zove isto TouchListener

        slk1.setOnTouchListener(new TouchListener());
        slk2.setOnTouchListener(new TouchListener());
        slk3.setOnTouchListener(new TouchListener());
        slk4.setOnTouchListener(new TouchListener());
        slk5.setOnTouchListener(new TouchListener());
        slk6.setOnTouchListener(new TouchListener());
        slk7.setOnTouchListener(new TouchListener());
        slk8.setOnTouchListener(new TouchListener());
        slk9.setOnTouchListener(new TouchListener());
        slk10.setOnTouchListener(new TouchListener());
        slk11.setOnTouchListener(new TouchListener());
        slk12.setOnTouchListener(new TouchListener());

// Svakom layoutu setujemo DragListener, u konstruktu je instanca klase koja se kod nas zove
        // takojde DragListener
        poz_11.setOnDragListener(new DragListener());
        poz_12.setOnDragListener(new DragListener());
        poz_13.setOnDragListener(new DragListener());

        poz_21.setOnDragListener(new DragListener());
        poz_22.setOnDragListener(new DragListener());
        poz_23.setOnDragListener(new DragListener());

        poz_31.setOnDragListener(new DragListener());
        poz_32.setOnDragListener(new DragListener());
        poz_33.setOnDragListener(new DragListener());

        poz_41.setOnDragListener(new DragListener());
        poz_42.setOnDragListener(new DragListener());
        poz_43.setOnDragListener(new DragListener());

    }





}
