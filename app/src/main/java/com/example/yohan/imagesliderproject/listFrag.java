package com.example.yohan.imagesliderproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class listFrag extends ListFragment {


    ArrayList<Plant> data;
    getItem activity;
    Context context;

    public interface getItem{

        void ItemSelected(int index);
    }

    public listFrag(){

    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        activity = (getItem) context;


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        data = new ArrayList<Plant>();

        Plant plant1 = new Plant("ulex","Ulex Europaeus");

        Plant plant2 = new Plant("Blue","Aristea ecklonii(Blue Stars)");

        Plant plant3 = new Plant("plant","Ageratina riparia (Mist Flower)");

        data.add(plant1);
        data.add(plant2);
        data.add(plant3);

        plantAdapter plantAdapter = new plantAdapter(getActivity(),data);

        setListAdapter(plantAdapter);

      // setListAdapter(new ArrayAdapter<Plant>(getActivity(),android.R.layout.simple_list_item_1,data));




    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        activity.ItemSelected(position);
    }


}
