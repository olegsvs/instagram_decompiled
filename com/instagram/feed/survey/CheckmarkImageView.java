package com.instagram.feed.survey;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

public class CheckmarkImageView extends ColorFilterAlphaImageView {
    public CheckmarkImageView(Context context) {
        super(context);
        this.f7195D = 0;
        this.f7194C = 0;
    }

    public CheckmarkImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7195D = 0;
        this.f7194C = 0;
    }

    public CheckmarkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7195D = 0;
        this.f7194C = 0;
    }

    /* renamed from: A */
    public final boolean m19493A() {
        return isSelected();
    }
}
