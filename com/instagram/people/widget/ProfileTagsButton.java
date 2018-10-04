package com.instagram.people.widget;

import X.AnonymousClass14F;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

public class ProfileTagsButton extends FrameLayout {
    /* renamed from: B */
    private TextView f42395B;
    /* renamed from: C */
    private ColorFilterAlphaImageView f42396C;

    public ProfileTagsButton(Context context) {
        super(context);
        m20060B();
    }

    public ProfileTagsButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20060B();
    }

    public ProfileTagsButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20060B();
    }

    /* renamed from: B */
    private void m20060B() {
        LayoutInflater.from(getContext()).inflate(C0164R.layout.layout_button_profile_tags, this);
        this.f42396C = (ColorFilterAlphaImageView) findViewById(C0164R.id.button_profile_tags_imageview);
        this.f42395B = (TextView) findViewById(C0164R.id.button_profile_tags_textview);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f42396C.setOnClickListener(onClickListener);
    }

    public void setPhotosOfYouCount(int i) {
        if (i > 0) {
            this.f42395B.setVisibility(0);
            AnonymousClass14F.B(this.f42395B, i < 100 ? String.valueOf(i) : "•••");
            return;
        }
        this.f42395B.setVisibility(8);
    }
}
