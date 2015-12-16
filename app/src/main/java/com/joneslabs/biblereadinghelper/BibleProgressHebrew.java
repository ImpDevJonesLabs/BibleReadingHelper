package com.joneslabs.biblereadinghelper;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.*;

import java.util.Random;


public class BibleProgressHebrew extends ActionBarActivity {
    private InterstitialAd interstitial;
    CheckBox progressBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.bible_progress);
        // Create the interstitial.
        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId("ca-app-pub-6046646838255406/5057320779");

        // Create ad request.
        AdRequest adRequest = new AdRequest.Builder().build();

        // Begin loading your interstitial.
        interstitial.loadAd(adRequest);

        Bundle progressBundle = getIntent().getExtras();
        int positionBook = progressBundle.getInt("position");
        String selectedBook = progressBundle.getString("book");
        Log.e("selectedBook is", selectedBook);

        if (selectedBook.equals("Ge")) {

            for (int i = 0; i < 17; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ge) + " " + getResources().getStringArray(R.array.GenInt)[i]);
                progressBox.setId(i + 1);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Ex")) {
            for (int i = 0; i < 14; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ex) + " " + getResources().getStringArray(R.array.ExInt)[i]);
                progressBox.setId(i + 19);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Le")) {
            for (int i = 0; i < 10; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Le) + " " + getResources().getStringArray(R.array.LeInt)[i]);
                progressBox.setId(i + 33);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Nu")) {
            for (int i = 0; i < 12; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Num) + " " + getResources().getStringArray(R.array.NuInt)[i]);
                progressBox.setId(i + 43);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("De")) {
            for (int i = 0; i < 13; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Deu) + " " + getResources().getStringArray(R.array.DeInt)[i]);
                progressBox.setId(i + 55);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Jos")) {
            for (int i = 0; i < 8; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Jos) + " " + getResources().getStringArray(R.array.JosInt)[i]);
                progressBox.setId(i + 68);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Jg")) {
            for (int i = 0; i < 9; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Jg) + " " + getResources().getStringArray(R.array.JgInt)[i]);
                progressBox.setId(i + 76);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Ru")) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ru) + " " + getResources().getStringArray(R.array.RuInt)[i]);
                progressBox.setId(i + 85);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("1Sa")) {
            for (int i = 0; i < 11; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Sa1) + " " + getResources().getStringArray(R.array.Sa1Int)[i]);
                progressBox.setId(i + 86);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("2Sa")) {
            for (int i = 0; i < 10; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Sa2) + " " + getResources().getStringArray(R.array.Sa2Int)[i]);
                progressBox.setId(i + 97);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("1Ki")) {
            for (int i = 0; i < 11; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ki1) + " " + getResources().getStringArray(R.array.Ki1Int)[i]);
                progressBox.setId(i + 107);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("2Ki")) {
            for (int i = 0; i < 10; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ki2) + " " + getResources().getStringArray(R.array.Ki2Int)[i]);
                progressBox.setId(i + 118);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("1Ch")) {
            for (int i = 0; i < 11; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ch1) + " " + getResources().getStringArray(R.array.Ch1Int)[i]);
                progressBox.setId(i + 128);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("2Ch")) {
            for (int i = 0; i < 11; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ch2) + " " + getResources().getStringArray(R.array.Ch2Int)[i]);
                progressBox.setId(i + 139);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Ez")) {
            for (int i = 0; i < 3; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ez) + " " + getResources().getStringArray(R.array.EzInt)[i]);
                progressBox.setId(i + 150);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Ne")) {
            for (int i = 0; i < 5; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ne) + " " + getResources().getStringArray(R.array.NeInt)[i]);
                progressBox.setId(i + 153);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Es")) {
            for (int i = 0; i < 2; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Es) + " " + getResources().getStringArray(R.array.EsInt)[i]);
                progressBox.setId(i + 158);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Job")) {
            for (int i = 0; i < 11; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Job) + " " + getResources().getStringArray(R.array.JobInt)[i]);
                progressBox.setId(i + 160);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Ps")) {
            for (int i = 0; i < 29; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ps) + " " + getResources().getStringArray(R.array.PsInt)[i]);
                progressBox.setId(i + 171);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Pr")) {
            for (int i = 0; i < 8; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Pr) + " " + getResources().getStringArray(R.array.PrInt)[i]);
                progressBox.setId(i + 200);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Ec")) {
            for (int i = 0; i < 3; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ec) + " " + getResources().getStringArray(R.array.EcInt)[i]);
                progressBox.setId(i + 208);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("So")) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.So) + " " + getResources().getStringArray(R.array.SoInt)[i]);
                progressBox.setId(i + 211);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Isa")) {
            for (int i = 0; i < 18; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Isa) + " " + getResources().getStringArray(R.array.IsaInt)[i]);
                progressBox.setId(i + 212);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Jer")) {
            for (int i = 0; i < 19; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Jer) + " " + getResources().getStringArray(R.array.JerInt)[i]);
                progressBox.setId(i + 230);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("La")) {
            for (int i = 0; i < 2; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.La) + " " + getResources().getStringArray(R.array.LaInt)[i]);
                progressBox.setId(i + 249);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Eze")) {
            for (int i = 0; i < 19; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Eze) + " " + getResources().getStringArray(R.array.EzeInt)[i]);
                progressBox.setId(i + 251);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Da")) {
            for (int i = 0; i < 5; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Da) + " " + getResources().getStringArray(R.array.DaInt)[i]);
                progressBox.setId(i + 270);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Ho")) {
            for (int i = 0; i < 2; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ho) + " " + getResources().getStringArray(R.array.HoInt)[i]);
                progressBox.setId(i + 275);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Joe")) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Joe) + " " + getResources().getStringArray(R.array.JoeInt)[i]);
                progressBox.setId(i + 277);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Am")) {
            for (int i = 0; i < 2; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Am) + " " + getResources().getStringArray(R.array.AmInt)[i]);
                progressBox.setId(i + 278);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Ob") || selectedBook.equals("Jon")) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ob) + "/" + getResources().getString(R.string.Jon));
                progressBox.setId(i + 280);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Mic")) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Mic) + " " + getResources().getStringArray(R.array.MicInt)[i]);
                progressBox.setId(i + 281);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Na") || selectedBook.equals("Hab")) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Na) + "/" + getResources().getString(R.string.Hab));
                progressBox.setId(i + 282);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Zep") || selectedBook.equals("Hag")) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Zep) + "/" + getResources().getString(R.string.Hag));
                progressBox.setId(i + 301);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Zec")) {
            for (int i = 0; i < 3; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Zec) + " " + getResources().getStringArray(R.array.ZecInt)[i]);
                progressBox.setId(i + 302);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
        if (selectedBook.equals("Mal")) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Mal) + " " + getResources().getStringArray(R.array.MalInt)[i]);
                progressBox.setId(i + 305);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.BELOW, progressBox.getId() - 1);
                progressBox.setLayoutParams(params);
                progressBox.setOnCheckedChangeListener(new onCheckedChanged());
                int boxId = progressBox.getId();
                String boxString = Integer.toString(boxId);
                progressBox.setChecked(getFromSP(boxString));
                progressLayout.addView(progressBox);
            }
        }
    }

    private boolean getFromSP(String key){
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("HEBREW_BOOKS", android.content.Context.MODE_PRIVATE);
        return preferences.getBoolean(key, false);
    }
    private void saveInSp(int key,boolean value){
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("HEBREW_BOOKS", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        String keyString = Integer.toString(key);
        editor.putBoolean(keyString, value);
        editor.commit();
    }

    private class onCheckedChanged implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int checkId = buttonView.getId();
                saveInSp(checkId ,isChecked);

            }
        }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        displayInterstitial();
    }

    public void displayInterstitial() {
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
    }
