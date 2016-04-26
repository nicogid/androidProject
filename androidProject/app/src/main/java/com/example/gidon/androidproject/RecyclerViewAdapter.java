package com.example.gidon.androidproject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by gidon on 26/04/16.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private String[] mDataset;

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        public TextView mTextView;
        public ViewHolder(View v){
            super(v);
            mTextView =(TextView)v.findViewById(R.id.title);
        }
    }

    public RecyclerViewAdapter(String[] myDataset){
        mDataset = myDataset;
    }

    @Override

    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cell,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override

    public void onBindViewHolder(ViewHolder holder,int position){
        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount(){
        return mDataset.length;
    }
}
