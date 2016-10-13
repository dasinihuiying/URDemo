package com.example.lin.urdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private UltimateRecyclerView rcv;
    private List<String> mData;
    private MyAdapter mAdapter;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.i(TAG, "onCreate: ");


        getActionBar();
        this.getApplicationContext();
        initView();
        initData();
        setAdapter();

    }

    private void setAdapter() {
        rcv.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new MyAdapter(this,mData);
       // rcv.setAdapter(mAdapter);
    }

    private void initData() {
        mData = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            mData.add("item"+i);
        }
    }

    private void initView() {
        rcv = (UltimateRecyclerView) findViewById(R.id.rcv);












    }
}
