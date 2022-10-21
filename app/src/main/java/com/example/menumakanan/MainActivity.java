package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcmenu;
    private ArrayList<menu> listmenu;
    private menuAdapter menuadapter;
    private ConstraintLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcmenu = findViewById(R.id.rcmenu);
        init();

        menuadapter = new menuAdapter(this, listmenu);
        RecyclerView.LayoutManager layManager = new LinearLayoutManager(MainActivity.this);
        rcmenu.setLayoutManager(layManager);
        rcmenu.setAdapter(menuadapter);


    }

    private void init(){
        this.listmenu = new ArrayList<>();
        listmenu.add(new menu("Bestik","Rp. 30.000",R.drawable.ic_launcher_background));
    }

}