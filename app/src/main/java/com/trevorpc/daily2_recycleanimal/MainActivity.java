package com.trevorpc.daily2_recycleanimal;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    RecyclerView rvRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRecyclerView = findViewById(R.id.rvRecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, animalList());
        rvRecyclerView.setLayoutManager(layoutManager);
        rvRecyclerView.setAdapter(recyclerViewAdapter);
    }
    public ArrayList<Animal> animalList() {

        ArrayList<Animal> returnList = new ArrayList<>();
        returnList.add(new Animal("dog","dog","Man's Best Friend!"));
        returnList.add(new Animal("cat","cat","Man's Best Passive/Aggressive Roommate"));
        returnList.add(new Animal("dragonfly","dragonfly", "no comment"));


        return returnList;
    }


}


