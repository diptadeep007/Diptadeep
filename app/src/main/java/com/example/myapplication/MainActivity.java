package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends Activity {
    ListView list;
    String[] name = {
            "Johnny Depp",
            "Amber Heard",
            "Robert Downey Jr",
            "Emma Watson"

    } ;
    String[] relation = {
            "Father",
            "Mother",
            "Brother",
            "Sister"

    } ;
    Integer[] imageId = {
            R.drawable.f,
            R.drawable.m,
            R.drawable.b,
            R.drawable.s,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        comp adapter = new comp(MainActivity.this, name, relation, imageId);
        list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);
    }

}