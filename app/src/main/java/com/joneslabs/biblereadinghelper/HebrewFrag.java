package com.joneslabs.biblereadinghelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class HebrewFrag extends Fragment{
    String[] hebrewBooks;
    GridView hebrewGrid;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.hebrew_grid, container, false) ;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        hebrewGrid = (GridView) getActivity().findViewById(R.id.gv_hebrew);

        hebrewBooks = getActivity().getResources().getStringArray(R.array.bible_hebrew);

        ArrayAdapter hebrewAdapter = new ArrayAdapter(getActivity(), R.layout.grid_item, hebrewBooks);

        hebrewGrid.setAdapter(hebrewAdapter);

        hebrewGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle progressBundle = new Bundle();
                progressBundle.putInt("position", position);
                Intent newActivity = new Intent(getActivity(), BibleProgressHebrew.class);
                newActivity.putExtras(progressBundle);
                startActivity(newActivity);
            }
        });
    }
}