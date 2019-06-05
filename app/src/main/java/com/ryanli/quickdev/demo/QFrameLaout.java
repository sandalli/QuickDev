package com.ryanli.quickdev.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * auther:sharehi
 * data: 2019-04-04-06:42
 * des:
 */
public class QFrameLaout extends FrameLayout {
    public QFrameLaout(@NonNull Context context) {
        super(context);
    }

    public QFrameLaout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public QFrameLaout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("QFrameLayout", ev.getAction()+"dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("QFrameLayout", ev.getAction()+"onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("QFrameLayout", event.getAction()+"onTouchEvent");
        return super.onTouchEvent(event);
    }
}
