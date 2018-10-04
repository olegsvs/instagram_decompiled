package com.instagram.creation.base.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.facebook.C0164R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

public class TagPeopleDrawable extends ColorFilterAlphaImageView {
    /* renamed from: B */
    private int f39103B;
    /* renamed from: C */
    private final Paint f39104C = new Paint(1);
    /* renamed from: D */
    private int f39105D;

    public TagPeopleDrawable(Context context) {
        super(context);
        m19031C();
    }

    public TagPeopleDrawable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19031C();
    }

    public TagPeopleDrawable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19031C();
    }

    /* renamed from: C */
    private void m19031C() {
        this.f39104C.setTextAlign(Align.CENTER);
        this.f39104C.setTextSize((float) getResources().getDimensionPixelSize(C0164R.dimen.font_xsmall));
        this.f39104C.setTypeface(Typeface.DEFAULT_BOLD);
        this.f39105D = getResources().getDimensionPixelOffset(C0164R.dimen.people_tag_pill_text_padding);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f39103B > 0) {
            int intrinsicWidth = getDrawable().getIntrinsicWidth();
            int intrinsicHeight = getDrawable().getIntrinsicHeight();
            if (isEnabled() && A()) {
                this.f39104C.setColorFilter(getActiveColorFilter());
            } else {
                this.f39104C.setColorFilter(getNormalColorFilter());
            }
            canvas.drawText(String.valueOf(this.f39103B), ((float) intrinsicWidth) / 2.0f, (float) (intrinsicHeight - this.f39105D), this.f39104C);
        }
    }

    public void setNumPeopleTagged(int i) {
        this.f39103B = i;
        if (i == 0) {
            setImageResource(C0164R.drawable.people_tag_edit_16);
        } else {
            setImageResource(C0164R.drawable.people_tag_edit_empty_16);
        }
        refreshDrawableState();
    }
}
