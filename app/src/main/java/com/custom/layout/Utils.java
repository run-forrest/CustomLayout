package com.custom.layout;

import android.content.res.Resources;
import android.util.TypedValue;

public class Utils {
    public static float dpToPixel(float dp) {
        // Resources.getSystem().getDisplayMetrics().density
        // 方法类似
        return  TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                Resources.getSystem().getDisplayMetrics());
    }
}
