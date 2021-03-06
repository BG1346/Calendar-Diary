package com.applandeo.materialcalendarsampleapp.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

import androidx.core.content.ContextCompat;

import com.applandeo.materialcalendarsampleapp.R;
import com.applandeo.materialcalendarview.CalendarUtils;

/**
 * Created by Mateusz Kornakiewicz on 02.08.2018.
 */

public final class DrawableUtils {

    public static Drawable getCircleDrawableWithText(Context context, String string) {
        return getCircleDrawableWithText(context, Integer.parseInt(string));
    }

    public static Drawable getCircleDrawableWithText(Context context, int string) {
        Drawable background = ContextCompat.getDrawable(context, R.drawable.sample_circle);
        Drawable text;
        if(string > 10)
            text = CalendarUtils.getDrawableText(context, Integer.toString(10) + "+", null, android.R.color.white, 8);
        else
            text = CalendarUtils.getDrawableText(context, Integer.toString(string), null, android.R.color.white, 12);



        Drawable[] layers = {background, text};
        return new LayerDrawable(layers);
    }

    public static Drawable getThreeDots(Context context){
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.sample_three_icons);

        //Add padding to too large icon
        return new InsetDrawable(drawable, 100, 0, 100, 0);
    }

    private DrawableUtils() {
    }
}
