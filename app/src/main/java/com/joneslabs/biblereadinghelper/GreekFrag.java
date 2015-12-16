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

public class GreekFrag extends Fragment {
    String[] greekBooks, greekDateComplete, DcArray;
    GridView greekGrid;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.greek_grid, container, false) ;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        greekGrid = (GridView) getActivity().findViewById(R.id.gv_greek);

        greekBooks = getActivity().getResources().getStringArray(R.array.bible_greek);
        greekDateComplete = getActivity().getResources().getStringArray(R.array.greek_dc);

        ArrayAdapter greekAdapter = new ArrayAdapter(getActivity(), R.layout.grid_item, greekDateComplete);

        greekGrid.setAdapter(greekAdapter);
        greekGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle progressBundle = new Bundle();
                DcArray = greekDateComplete.clone();
                String selectedBook = DcArray.clone()[position];
                progressBundle.putInt("position", position);
                progressBundle.putString("book", selectedBook);
                Intent newActivity = new Intent(getActivity(), BibleProgressGreek.class);
                newActivity.putExtras(progressBundle);
                startActivity(newActivity);
            }
        });
    }
}
