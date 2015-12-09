package com.joneslabs.biblereadinghelper;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.*;

public class BibleProgressGreek extends ActionBarActivity {
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

        if(positionBook == 0) {

            for (int i = 0; i < 10; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Mt) + " " + getResources().getStringArray(R.array.MtInt)[i]);
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
        if (positionBook == 1) {
            for (int i = 0; i < 6; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Mr)+ " " + getResources().getStringArray(R.array.MrInt)[i]);
                progressBox.setId(i + 11);
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
        if (positionBook == 2) {
            for (int i = 0; i < 10; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Lu) + " " + getResources().getStringArray(R.array.LuInt)[i]);
                progressBox.setId(i + 17);
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
        if (positionBook == 3) {
            for (int i = 0; i < 8; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Joh) + " " + getResources().getStringArray(R.array.JohInt)[i]);
                progressBox.setId(i + 27);
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
        if (positionBook == 4) {
            for (int i = 0; i < 11; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ac) + " " + getResources().getStringArray(R.array.AcInt)[i]);
                progressBox.setId(i + 35);
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
        if (positionBook == 5) {
            for (int i = 0; i < 4; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ro) + " " + getResources().getStringArray(R.array.RoInt)[i]);
                progressBox.setId(i + 46);
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
        if (positionBook == 6) {
            for (int i = 0; i < 4; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Co1) + " " + getResources().getStringArray(R.array.Co1Int)[i]);
                progressBox.setId(i + 50);
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
        if (positionBook == 7) {
            for (int i = 0; i < 3; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Co2) + " " + getResources().getStringArray(R.array.Co2Int)[i]);
                progressBox.setId(i + 54);
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
        if (positionBook == 8) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ga) + " " + getResources().getStringArray(R.array.GaInt)[i]);
                progressBox.setId(i + 57);
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
        if (positionBook == 9) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Eph) + " " + getResources().getStringArray(R.array.EphInt)[i]);
                progressBox.setId(i + 58);
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
        if (positionBook == 10) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Php) + " " + getResources().getStringArray(R.array.PhpInt)[i]);
                progressBox.setId(i + 59);
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
        if (positionBook == 11) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Col) + " " + getResources().getStringArray(R.array.ColInt)[i]);
                progressBox.setId(i + 60);
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
        if (positionBook == 12) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Th1) + " " + getResources().getStringArray(R.array.Th1Int)[i]);
                progressBox.setId(i + 61);
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
        if (positionBook == 13) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Th2) + " " + getResources().getStringArray(R.array.Th2Int)[i]);
                progressBox.setId(i + 62);
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
        if (positionBook == 14) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ti1) + " " + getResources().getStringArray(R.array.Ti1Int)[i]);
                progressBox.setId(i + 63);
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
        if (positionBook == 15) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Ti2) + " " + getResources().getStringArray(R.array.Ti2Int)[i]);
                progressBox.setId(i + 64);
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
        if (positionBook == 16) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Tit) + "/" + getResources().getString(R.string.Phm));
                progressBox.setId(i + 65);
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
        if (positionBook == 17) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Tit) + "/" + getResources().getString(R.string.Phm));
                progressBox.setId(i + 65);
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
        if (positionBook == 18) {
            for (int i = 0; i < 3; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Heb) + " " + getResources().getStringArray(R.array.HebInt)[i]);
                progressBox.setId(i + 66);
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
        if (positionBook == 19) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Jas) + " " + getResources().getStringArray(R.array.JasInt)[i]);
                progressBox.setId(i + 69);
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
        if (positionBook == 20) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Pe1) + " " + getResources().getStringArray(R.array.Pe1Int)[i]);
                progressBox.setId(i + 70);
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
        if (positionBook == 21) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Pe2) + " " + getResources().getStringArray(R.array.Pe2Int)[i]);
                progressBox.setId(i + 71);
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
        if (positionBook == 22) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Jo1) + " " + getResources().getStringArray(R.array.Jo1Int)[i]);
                progressBox.setId(i + 72);
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
        if (positionBook == 23) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Jo2) + "/" + getResources().getString(R.string.Jo3) + "/" + getResources().getString(R.string.Ju));
                progressBox.setId(i + 73);
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
        if (positionBook == 24) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Jo2) + "/" + getResources().getString(R.string.Jo3) + "/" + getResources().getString(R.string.Ju));
                progressBox.setId(i + 73);
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
        if (positionBook == 25) {
            for (int i = 0; i < 1; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Jo2) + "/" + getResources().getString(R.string.Jo3) + "/" + getResources().getString(R.string.Ju));
                progressBox.setId(i + 73);
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
        if (positionBook == 26) {
            for (int i = 0; i < 5; i++) {
                RelativeLayout progressLayout = (RelativeLayout) findViewById(R.id.progress_layout);
                progressBox = new CheckBox(this);
                progressBox.setText(getResources().getString(R.string.Re) + " " + getResources().getStringArray(R.array.ReInt)[i]);
                progressBox.setId(i + 74);
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
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("GREEK_BOOKS", android.content.Context.MODE_PRIVATE);
        return preferences.getBoolean(key, false);
    }
    private void saveInSp(int key,boolean value){
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("GREEK_BOOKS", android.content.Context.MODE_PRIVATE);
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

