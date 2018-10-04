package com.instagram.ui.widget.selectableview;

import X.AnonymousClass0Ca;
import X.AnonymousClass0ca;
import X.AnonymousClass0eS;
import X.AnonymousClass0h8;
import X.AnonymousClass3jy;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public class SingleSelectableAvatar extends AnonymousClass3jy {
    /* renamed from: B */
    private CircularImageView f48727B;
    /* renamed from: C */
    private ImageView f48728C;

    public SingleSelectableAvatar(Context context) {
        super(context);
        m22229B(context, null);
    }

    public SingleSelectableAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22229B(context, attributeSet);
    }

    public SingleSelectableAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m22229B(context, attributeSet);
    }

    /* renamed from: B */
    private void m22229B(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.SingleSelectableAvatar);
        int i = 0;
        if (obtainStyledAttributes.hasValue(0)) {
            i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        }
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(getContext()).inflate(C0164R.layout.selectable_avatar_single, this, true);
        this.f48727B = (CircularImageView) inflate.findViewById(C0164R.id.selectable_avatar);
        ImageView imageView = (ImageView) inflate.findViewById(C0164R.id.select_check_mark);
        this.f48728C = imageView;
        imageView.setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), C0164R.color.white)));
        if (i != 0) {
            this.f48727B.getLayoutParams().width = i;
            this.f48727B.getLayoutParams().height = i;
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f48727B.setAlpha(this.f43884B ? getDisabledAlpha() : 255);
    }

    public Drawable getStrokeDrawable() {
        return new AnonymousClass0h8(getContext().getResources().getDimensionPixelSize(C0164R.dimen.selectable_view_stroke_width), AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5));
    }

    public void setCheckmark(boolean z) {
        if (z) {
            this.f48727B.setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), C0164R.color.black_60_transparent)));
            this.f48728C.setVisibility(0);
            return;
        }
        this.f48727B.setColorFilter(null);
        this.f48728C.setVisibility(8);
    }

    public void setImageDrawable(Drawable drawable) {
        this.f48727B.setImageDrawable(drawable);
    }

    public void setUrl(String str) {
        this.f48727B.setUrl(str);
    }
}
