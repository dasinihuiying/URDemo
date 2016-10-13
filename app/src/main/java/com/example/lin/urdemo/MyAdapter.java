package com.example.lin.urdemo;

import android.content.Context;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.marshalchen.ultimaterecyclerview.UltimateRecyclerviewViewHolder;
import com.marshalchen.ultimaterecyclerview.UltimateViewAdapter;

import java.util.List;

/**
 * Created by lin on 2016/10/12.
 */


public class MyAdapter extends UltimateViewAdapter<MyAdapter.MyHolder> {
    private Context context;
    private List<String> mData;
    public MyAdapter( Context context,List<String> mData){
        this.mData = mData;
        this.context = context;
    }

    @Override
    public MyHolder newFooterHolder(View view) {
        return null;
    }

    @Override
    public MyHolder newHeaderHolder(View view) {
        //LayoutInflater.from(context).inflate(R.layout.header,null);
        return null;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent) {
        MyHolder holder = new MyHolder(LayoutInflater.from(context).inflate(R.layout.item,parent,false));
        return holder;
    }

    @Override
    public int getAdapterItemCount() {
        return mData.size();
    }

    @Override
    public long generateHeaderId(int position) {
        return 0;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

    }

    @Override
    public RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup parent) {
        return null;
    }

    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder, int position) {

    }


    class MyHolder extends UltimateRecyclerviewViewHolder{
        private TextView tv;
        public MyHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv);
        }
    }
}
