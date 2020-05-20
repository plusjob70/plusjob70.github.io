package com.example.weatherforecastapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ForecastFragment extends Fragment {
    private ArrayList<String> list;
    private ListView listView;
    private ArrayAdapter adapter;
    private String[] city = {"Seoul", "Daejeon", "Taegu", "Busan"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view_item, container, false);
        list = new ArrayList<String>();
        listView = (ListView) view.findViewById(R.id.list_item_forecast_textview);
        adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        for(String i : city){ list.add(""+i); }

        adapter.notifyDataSetChanged();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                startActivity(intent);
            }
        }) ;
        return view;
    }


}
