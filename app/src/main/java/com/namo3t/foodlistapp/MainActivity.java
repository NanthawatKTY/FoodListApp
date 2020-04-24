package com.namo3t.foodlistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] food_menu;
    int[] arrImg;
    private TypedArray img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Ref to parent class
        setContentView(R.layout.activity_main);

        img = getResources().obtainTypedArray(R.array.images);
        food_menu = getResources().getStringArray(R.array.foods);

        ListView listViewMenu ;
        listViewMenu = findViewById(R.id.foodListView);

        DesignList adapter = new DesignList(MainActivity.this, food_menu,img);
        listViewMenu.setAdapter(adapter);

    }
}
