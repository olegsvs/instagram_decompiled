package com.instagram.feed.ui.text;

import X.AnonymousClass0Nm;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.TextView.BufferType;

public class BulletAwareTextView extends TextView {
    /* renamed from: B */
    private final float f12734B = AnonymousClass0Nm.m3425D(getContext().getResources().getDisplayMetrics(), 0.5f);
    /* renamed from: C */
    private boolean f12735C = false;
    /* renamed from: D */
    private int f12736D;

    public BulletAwareTextView(Context context) {
        super(context);
        m8623C(null);
    }

    public BulletAwareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8623C(attributeSet);
    }

    public BulletAwareTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8623C(attributeSet);
    }

    /* renamed from: B */
    private void m8622B() {
        if (getText() instanceof Spannable) {
            ImageSpan[] imageSpanArr = (ImageSpan[]) ((Spannable) getText()).getSpans(0, 1, ImageSpan.class);
            if (imageSpanArr.length != 0) {
                Drawable drawable = imageSpanArr[0].getDrawable();
                Rect bounds = drawable.getBounds();
                drawable.setBounds(bounds.left, 0, bounds.right, drawable.getIntrinsicHeight() + getOffset());
            }
        }
    }

    /* renamed from: C */
    private void m8623C(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.BulletAwareTextView);
            this.f12736D = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
            setLineSpacing((float) this.f12736D, 1.0f);
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    private int getOffset() {
        if (getLineCount() == 1) {
            if (VERSION.SDK_INT >= 21) {
                return 0;
            }
        }
        return (int) (((float) this.f12736D) - (getLineCount() > 1 ? this.f12734B : 0.0f));
    }

    public final void onMeasure(int i, int i2) {
        int N = AnonymousClass0cQ.m5864N(this, 24093417);
        super.onMeasure(i, i2);
        m8622B();
        AnonymousClass0cQ.m5865O(this, -1612750587, N);
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        if (!this.f12735C && VERSION.SDK_INT >= 21) {
            this.f12735C = true;
            i4 += this.f12736D;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setSpacingAdd(int i) {
        int paddingBottom = getPaddingBottom();
        if (this.f12735C) {
            paddingBottom -= this.f12736D;
            this.f12735C = false;
        }
        this.f12736D = i;
        setLineSpacing((float) i, 1.0f);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), paddingBottom);
        m8622B();
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (getLineCount() != 0) {
            m8622B();
        }
    }
}
