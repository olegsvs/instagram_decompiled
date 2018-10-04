package com.instagram.ui.widget.stackedavatar;

import X.AnonymousClass0ca;
import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public class StackedAvatarView extends FrameLayout {
    /* renamed from: B */
    private CircularImageView f62155B;
    /* renamed from: C */
    private CircularImageView f62156C;
    /* renamed from: D */
    private ViewGroup f62157D;
    /* renamed from: E */
    private int f62158E;
    /* renamed from: F */
    private View f62159F;
    /* renamed from: G */
    private View f62160G;
    /* renamed from: H */
    private boolean f62161H;

    public StackedAvatarView(Context context) {
        super(context);
        m26245C(context, null);
    }

    public StackedAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26245C(context, attributeSet);
    }

    public StackedAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26245C(context, attributeSet);
    }

    /* renamed from: B */
    private void m26244B(boolean z) {
        int floor;
        int i;
        int i2;
        this.f62155B.setVisibility(z ? 0 : 8);
        if (z) {
            floor = (int) Math.floor((double) ((getResources().getDimensionPixelSize(C0164R.dimen.stacked_avatar_offset_size) * this.f62158E) / getResources().getDimensionPixelSize(C0164R.dimen.avatar_size_small)));
            i = floor;
            i2 = 0;
        } else {
            floor = 0;
            i = 0;
            i2 = 17;
        }
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(this.f62157D.getLayoutParams());
        marginLayoutParams.setMargins(floor, i, 0, 0);
        LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams);
        layoutParams.gravity = i2;
        this.f62157D.setLayoutParams(layoutParams);
    }

    /* renamed from: C */
    private void m26245C(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.StackedAvatarView);
        try {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.avatar_size_small);
            this.f62158E = dimensionPixelSize;
            if (obtainStyledAttributes.hasValue(0)) {
                this.f62158E = obtainStyledAttributes.getDimensionPixelSize(0, this.f62158E);
            }
            this.f62161H = obtainStyledAttributes.getBoolean(3, true);
            View inflate = LayoutInflater.from(getContext()).inflate(C0164R.layout.stacked_avatar, this, true);
            this.f62156C = (CircularImageView) inflate.findViewById(C0164R.id.avatar_front);
            this.f62155B = (CircularImageView) inflate.findViewById(C0164R.id.avatar_back);
            this.f62160G = inflate.findViewById(C0164R.id.avatar_front_background);
            this.f62159F = inflate.findViewById(C0164R.id.avatar_back_background);
            this.f62157D = (ViewGroup) inflate.findViewById(C0164R.id.avatar_front_container);
            if (this.f62158E != dimensionPixelSize) {
                this.f62156C.getLayoutParams().width = this.f62158E;
                this.f62156C.getLayoutParams().height = this.f62158E;
                this.f62155B.getLayoutParams().width = this.f62158E;
                this.f62155B.getLayoutParams().height = this.f62158E;
                m26244B(true);
                dimensionPixelSize = this.f62158E + (obtainStyledAttributes.getDimensionPixelSize(1, context.getResources().getDimensionPixelSize(C0164R.dimen.stacked_avatar_stroke_size)) * 2);
                this.f62160G.getLayoutParams().width = dimensionPixelSize;
                this.f62160G.getLayoutParams().height = dimensionPixelSize;
                this.f62159F.getLayoutParams().width = dimensionPixelSize;
                this.f62159F.getLayoutParams().height = dimensionPixelSize;
            }
            View view = this.f62159F;
            dimensionPixelSize = 0;
            if (!obtainStyledAttributes.getBoolean(2, false)) {
                dimensionPixelSize = 8;
            }
            view.setVisibility(dimensionPixelSize);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setRingColor(int i) {
        ColorFilter B = AnonymousClass0ca.B(i);
        this.f62160G.getBackground().setColorFilter(B);
        this.f62159F.getBackground().setColorFilter(B);
    }

    public void setUrls(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f62156C.A();
        } else {
            this.f62156C.setUrl(str);
        }
        if (TextUtils.isEmpty(str2)) {
            this.f62155B.A();
            m26244B(this.f62161H);
            return;
        }
        this.f62155B.setUrl(str2);
        m26244B(true);
    }
}
