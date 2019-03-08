package com.example.yohan.imagesliderproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class plantAdapter extends ArrayAdapter<Plant> {
    private final Context context;
    private final ArrayList<Plant> values;

    public plantAdapter(@NonNull Context context, ArrayList<Plant> values) {
        super(context, R.layout.row_layout, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_layout,parent,false);

        TextView tvPlantName = rowView.findViewById(R.id.tvPlant);
        ImageView ivPlant = rowView.findViewById(R.id.ivPlant);

        tvPlantName.setText(values.get(position).getTypeName());

        if(values.get(position).getType().equals("ulex")){
            ivPlant.setImageResource(R.mipmap.ulex_);
        }else if(values.get(position).getType().equals("Blue")) {
            ivPlant.setImageResource(R.mipmap.blue_);
        }else if(values.get(position).getType().equals("plant")) {
            ivPlant.setImageResource(R.mipmap.plant_);
        }

        return rowView;

    }
}
