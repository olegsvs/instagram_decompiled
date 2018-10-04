package com.instagram.feed.widget;

import X.AnonymousClass0Ca;
import X.AnonymousClass0ca;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.C0164R;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;

public class LinkButton extends ImageWithTitleTextView {
    public LinkButton(Context context) {
        this(context, null, 0);
    }

    public LinkButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinkButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int color = getColor();
        ColorFilter B = AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), color));
        getBackground().mutate().setColorFilter(B);
        setTextColor(AnonymousClass0Ca.C(getContext(), color));
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.mutate().setColorFilter(B);
        }
    }

    private int getColor() {
        if (isEnabled() && (isSelected() || isPressed())) {
            return C0164R.color.blue_6;
        }
        return C0164R.color.blue_5;
    }
}
