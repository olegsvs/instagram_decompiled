package com.instagram.ui.widget.textview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.widget.TextView;

public class IgTransparentTextView extends TextView {
    public IgTransparentTextView(Context context) {
        this(context, null);
    }

    public IgTransparentTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IgTransparentTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setTextColor(Color.argb(255, 0, 0, 0));
        getPaint().setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        setLayerType(2, null);
    }
}
