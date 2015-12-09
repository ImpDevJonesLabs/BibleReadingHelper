package com.joneslabs.biblereadinghelper;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

public class Utils
{
    private static int sTheme;
    public final static int THEME_BLUE = 0;
    public final static int THEME_RED = 1;
    public final static int THEME_GREEN = 2;
    public final static int THEME_AMBER = 3;
    public final static int THEME_PURPLE = 4;
    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, int theme)
    {
        SharedPreferences preferences = activity.getSharedPreferences("PREFERENCES", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("theme", theme);
        sTheme = theme;
        editor.commit();
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }
    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(Activity activity) {
        SharedPreferences preferences = activity.getSharedPreferences("PREFERENCES", android.content.Context.MODE_PRIVATE);
        sTheme = preferences.getInt("theme", 0);
        switch (sTheme) {
            case THEME_BLUE:
                activity.setTheme(R.style.BlueTheme);
                if (Build.VERSION.SDK_INT >= 21) {
                    Window window = activity.getWindow();
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                    window.setStatusBarColor(activity.getResources().getColor(R.color.Dark_Blue));
                }
                break;
            case THEME_RED:
                activity.setTheme(R.style.RedTheme);
                if (Build.VERSION.SDK_INT >= 21) {
                    Window window = activity.getWindow();
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                    window.setStatusBarColor(activity.getResources().getColor(R.color.Dark_Red));
                }
                break;
            case THEME_GREEN:
                activity.setTheme(R.style.GreenTheme);
                if (Build.VERSION.SDK_INT >= 21) {
                    Window window = activity.getWindow();
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                    window.setStatusBarColor(activity.getResources().getColor(R.color.Dark_Green));
                }
                break;
            case THEME_AMBER:
                activity.setTheme(R.style.AmberTheme);
                if (Build.VERSION.SDK_INT >= 21) {
                    Window window = activity.getWindow();
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                    window.setStatusBarColor(activity.getResources().getColor(R.color.Dark_Amber));
                }
                break;
            case THEME_PURPLE:
                activity.setTheme(R.style.PurpleTheme);
                if (Build.VERSION.SDK_INT >= 21) {
                    Window window = activity.getWindow();
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                    window.setStatusBarColor(activity.getResources().getColor(R.color.Dark_Purple));
                }
                break;
        }
    }

    }

