package com.bluerosecoven.cfalertdialog.views;

import android.content.Context;
import android.graphics.Typeface;
import androidx.appcompat.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.Gravity;

import com.bluerosecoven.cfalertdialog.utils.ViewUtil;


/**
 * Created by Mr zombie
 */

public class CFPushButton extends AppCompatButton {

    public CFPushButton(Context context) {
        this(context, null, 0);
    }

    public CFPushButton(Context context, AttributeSet attrs) {
        this(context,attrs, 0);
    }

    public CFPushButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        initButton(context, attrs, defStyleAttr);
    }

    void initButton(Context context, AttributeSet attributeSet, int defStyleAttr) {

        // Set centered text alignment
        setGravity(Gravity.CENTER);
        ViewUtil.addBounceEffect(this);

        setTypeface(getTypeface(), Typeface.BOLD);
    }

}
