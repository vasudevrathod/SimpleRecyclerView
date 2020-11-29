package com.example.simplerecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simplerecyclerview.R;
import com.example.simplerecyclerview.model.CustomModel;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>  {

    private final ArrayList<CustomModel> nameList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTvName;

        public ViewHolder(View view) {
            super(view);

            mTvName = view.findViewById(R.id.tvName);
        }
    }


    public CustomAdapter(ArrayList<CustomModel> nameList) {
        this.nameList = nameList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_name_layout, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        CustomModel list = nameList.get(position);

        viewHolder.mTvName.setText(list.getName());
    }


    @Override
    public int getItemCount() {
        return nameList.size();
    }
}
