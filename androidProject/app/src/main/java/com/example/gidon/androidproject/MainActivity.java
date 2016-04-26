package com.example.gidon.androidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] myDataset ={"Lundi",
            "Mardi",
            "Lundi",
            "Mardi",
            "Lundi",
            "Mardi",
            "Lundi",
            "Mardi",
            "Lundi",
            "Mardi",
            "Lundi",
            "Mardi",
            "Lundi",
            "Mardi",
            "Lundi",
            "Mardi",
            "Lundi",
            "Mardi",
            "Lundi",
            "Mardi",
            "Lundi",
            "Mardi",
            "Lundi",
            "Mardi"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView =(RecyclerView)findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new RecyclerViewAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}
