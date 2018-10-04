package com.facebook.react.views.text;

import android.text.Spannable;

public final class ReactTextUpdate {
    private final boolean mContainsImages;
    private final int mJsEventCounter;
    private final float mPaddingBottom;
    private final float mPaddingLeft;
    private final float mPaddingRight;
    private final float mPaddingTop;
    private final Spannable mText;
    private final int mTextAlign;
    private final int mTextBreakStrategy;

    public ReactTextUpdate(Spannable spannable, int i, boolean z, float f, float f2, float f3, float f4, int i2, int i3) {
        this.mText = spannable;
        this.mJsEventCounter = i;
        this.mContainsImages = z;
        this.mPaddingLeft = f;
        this.mPaddingTop = f2;
        this.mPaddingRight = f3;
        this.mPaddingBottom = f4;
        this.mTextAlign = i2;
        this.mTextBreakStrategy = i3;
    }

    public final boolean containsImages() {
        return this.mContainsImages;
    }

    public final int getJsEventCounter() {
        return this.mJsEventCounter;
    }

    public final float getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public final float getPaddingLeft() {
        return this.mPaddingLeft;
    }

    public final float getPaddingRight() {
        return this.mPaddingRight;
    }

    public final float getPaddingTop() {
        return this.mPaddingTop;
    }

    public final Spannable getText() {
        return this.mText;
    }

    public final int getTextAlign() {
        return this.mTextAlign;
    }

    public final int getTextBreakStrategy() {
        return this.mTextBreakStrategy;
    }
}
