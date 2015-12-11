package com.joneslabs.biblereadinghelper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.util.Log;

public class DeleteDialog extends DialogPreference
{
    public DeleteDialog(Context oContext, AttributeSet attrs)
    {

        super(oContext, attrs);
    }
    @Override
    protected void onDialogClosed(boolean positiveResult) {
        super.onDialogClosed(positiveResult);
        if(positiveResult){
            SharedPreferences sharedPreferencesHebrews = getContext().getSharedPreferences("HEBREW_BOOKS", android.content.Context.MODE_PRIVATE);
            SharedPreferences sharedPreferencesGreek = getContext().getSharedPreferences("GREEK_BOOKS", Context.MODE_PRIVATE);
            sharedPreferencesHebrews.getAll().clear();
            sharedPreferencesGreek.getAll().clear();
            SharedPreferences.Editor editorH = sharedPreferencesHebrews.edit();
            SharedPreferences.Editor editorG = sharedPreferencesGreek.edit();
            editorG.clear().apply();
            editorH.clear().apply();
        }

    }
}
