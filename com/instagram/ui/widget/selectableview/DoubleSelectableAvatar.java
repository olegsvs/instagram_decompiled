package com.instagram.ui.widget.selectableview;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Nm;
import X.AnonymousClass0ca;
import X.AnonymousClass0eS;
import X.AnonymousClass3jt;
import X.AnonymousClass3jy;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public class DoubleSelectableAvatar extends AnonymousClass3jy {
    /* renamed from: B */
    private CircularImageView f48719B;
    /* renamed from: C */
    private CircularImageView f48720C;
    /* renamed from: D */
    private ImageView f48721D;
    /* renamed from: E */
    private int f48722E;

    public DoubleSelectableAvatar(Context context) {
        super(context);
        m22226B(context, null);
    }

    public DoubleSelectableAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22226B(context, attributeSet);
    }

    public DoubleSelectableAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m22226B(context, attributeSet);
    }

    /* renamed from: B */
    private void m22226B(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.DoubleSelectableAvatar);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0164R.dimen.avatar_size_large);
        this.f48722E = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(0)) {
            this.f48722E = obtainStyledAttributes.getDimensionPixelSize(0, this.f48722E);
        }
        boolean z = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getBoolean(1, true) : true;
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(getContext()).inflate(C0164R.layout.selectable_avatar_double, this, true);
        this.f48720C = (CircularImageView) inflate.findViewById(C0164R.id.selectable_avatar_front);
        this.f48719B = (CircularImageView) inflate.findViewById(C0164R.id.selectable_avatar_back);
        ImageView imageView = (ImageView) inflate.findViewById(C0164R.id.select_check_mark);
        this.f48721D = imageView;
        imageView.setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), C0164R.color.white)));
        if (this.f48722E != dimensionPixelSize) {
            this.f48722E = (int) Math.floor((double) ((this.f48722E * dimensionPixelSize) / getContext().getResources().getDimensionPixelSize(C0164R.dimen.avatar_size_extra_large)));
            this.f48720C.getLayoutParams().width = this.f48722E;
            this.f48720C.getLayoutParams().height = this.f48722E;
            this.f48719B.getLayoutParams().width = this.f48722E;
            this.f48719B.getLayoutParams().height = this.f48722E;
            View findViewById = inflate.findViewById(C0164R.id.selectable_avatar_front_container);
            dimensionPixelSize = (int) Math.floor((double) ((((int) AnonymousClass0Nm.E(getResources().getDisplayMetrics(), 10)) * this.f48722E) / dimensionPixelSize));
            MarginLayoutParams marginLayoutParams = new MarginLayoutParams(findViewById.getLayoutParams());
            marginLayoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, 0, 0);
            LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams);
            layoutParams.gravity = 0;
            findViewById.setLayoutParams(layoutParams);
            inflate = inflate.findViewById(C0164R.id.selectable_avatar_front_background);
            dimensionPixelSize = this.f48722E + (getContext().getResources().getDimensionPixelSize(C0164R.dimen.selectable_view_stroke_width) * 2);
            inflate.getLayoutParams().width = dimensionPixelSize;
            inflate.getLayoutParams().height = dimensionPixelSize;
        }
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.f48719B.getLayoutParams();
        if (z) {
            int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(C0164R.dimen.selectable_view_stroke_width);
            marginLayoutParams2.setMargins(dimensionPixelSize2, dimensionPixelSize2, 0, 0);
        } else {
            this.f43886D = 0;
            marginLayoutParams2.setMargins(0, 0, 0, 0);
        }
        this.f43885C = getStrokeDrawable();
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int disabledAlpha = this.f43884B ? getDisabledAlpha() : 255;
        this.f48720C.setAlpha(disabledAlpha);
        this.f48719B.setAlpha(disabledAlpha);
    }

    public Drawable getStrokeDrawable() {
        return new AnonymousClass3jt(getContext().getResources().getDimensionPixelSize(C0164R.dimen.selectable_view_stroke_width), AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5), this.f48722E, getContext().getResources().getDimensionPixelSize(C0164R.dimen.selectable_view_stroke_padding));
    }

    public void setCheckmark(boolean z) {
        if (z) {
            ColorFilter B = AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), C0164R.color.black_60_transparent));
            this.f48720C.setColorFilter(B);
            this.f48719B.setColorFilter(B);
            this.f48721D.setVisibility(0);
            return;
        }
        this.f48720C.setColorFilter(null);
        this.f48719B.setColorFilter(null);
        this.f48721D.setVisibility(8);
    }

    public void setUrls(String str, String str2) {
        if (str != null) {
            this.f48720C.setUrl(str);
        } else {
            this.f48720C.A();
        }
        if (str2 != null) {
            this.f48719B.setUrl(str2);
        } else {
            this.f48719B.A();
        }
    }
}
