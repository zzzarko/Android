package com.example.puzzle;

import android.content.ClipData;
import android.view.MotionEvent;
import android.view.View;

/* Cela klasa prekopirana sa https://www.vogella.com/tutorials/AndroidDragAndDrop/article.html
    Kreira senku (transparentnu slicicu) prilikom privlacenja
 */

class TouchListener implements View.OnTouchListener {
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(
                    view);
            view.startDrag(data, shadowBuilder, view, 0);
            view.setVisibility(View.INVISIBLE);
            return true;
        } else {
            return false;
        }
    }
}