package com.example.simplerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.simplerecyclerview.adapter.CustomAdapter;
import com.example.simplerecyclerview.model.CustomModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRvNameList;
    private final ArrayList<CustomModel> nameList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init () {
        mRvNameList = findViewById(R.id.rvNameList);

        setNameList();
    }

    private void setNameList() {
        nameList.clear();
        nameList.add(new CustomModel("James"));
        nameList.add(new CustomModel("Tony"));
        nameList.add(new CustomModel("Jack"));
        nameList.add(new CustomModel("Monika"));
        nameList.add(new CustomModel("Rachel"));
        nameList.add(new CustomModel("Louise"));
        nameList.add(new CustomModel("Russell"));
        nameList.add(new CustomModel("Alan"));
        nameList.add(new CustomModel("Jordan"));
        nameList.add(new CustomModel("Robert"));
        nameList.add(new CustomModel("Harry"));

        mRvNameList.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter customAdapter = new CustomAdapter(nameList);
        mRvNameList.setAdapter(customAdapter);

    }
}