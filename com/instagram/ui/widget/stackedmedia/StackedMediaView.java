package com.instagram.ui.widget.stackedmedia;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public class StackedMediaView extends FrameLayout {
    /* renamed from: B */
    private IgImageView f62162B;
    /* renamed from: C */
    private IgImageView f62163C;

    public StackedMediaView(Context context) {
        super(context);
        m26246B();
    }

    public StackedMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26246B();
    }

    public StackedMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26246B();
    }

    /* renamed from: B */
    private void m26246B() {
        View inflate = LayoutInflater.from(getContext()).inflate(C0164R.layout.stacked_media, this, true);
        this.f62163C = (IgImageView) inflate.findViewById(C0164R.id.media_front);
        this.f62162B = (IgImageView) inflate.findViewById(C0164R.id.media_back);
    }

    public void setUrls(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f62163C.A();
        } else {
            this.f62163C.setUrl(str);
        }
        if (TextUtils.isEmpty(str2)) {
            this.f62162B.A();
        } else {
            this.f62162B.setUrl(str2);
        }
    }
}
