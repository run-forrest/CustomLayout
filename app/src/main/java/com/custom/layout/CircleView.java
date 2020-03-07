package com.custom.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;



public class CircleView extends View {
    private static final int RADIUS = (int) Utils.dpToPixel(80);
    private static final int PADDING = (int) Utils.dpToPixel(30);

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CircleView(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = (PADDING + RADIUS) * 2;
        int height = (PADDING + RADIUS) * 2;
        // 通过measureSpec，自动计算出宽高，内置API
        width = resolveSizeAndState(width, widthMeasureSpec, 0);
        height = resolveSizeAndState(height, widthMeasureSpec, 0);
        setMeasuredDimension(width, height);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.RED);
        canvas.drawCircle(PADDING + RADIUS, PADDING + RADIUS, RADIUS, paint);
    }
}
