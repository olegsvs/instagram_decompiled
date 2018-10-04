package com.instagram.ui.widget.selectableview;

import X.AnonymousClass0Ca;
import X.AnonymousClass0ca;
import X.AnonymousClass0eS;
import X.AnonymousClass3jv;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.util.ArrayList;
import java.util.List;

public class RoundedCornerCheckMarkSelectableImageView extends AnonymousClass3jv {
    /* renamed from: B */
    private final List f48723B = new ArrayList();
    /* renamed from: C */
    private int f48724C;
    /* renamed from: D */
    private RoundedCornerMediaFrameLayout f48725D;
    /* renamed from: E */
    private ImageView f48726E;

    public RoundedCornerCheckMarkSelectableImageView(Context context) {
        super(context);
        m22227B(context, null);
    }

    public RoundedCornerCheckMarkSelectableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22227B(context, attributeSet);
    }

    public RoundedCornerCheckMarkSelectableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m22227B(context, attributeSet);
    }

    /* renamed from: A */
    public final void m22228A() {
        ((IgImageView) this.f48723B.get(0)).setImageDrawable(null);
        ((IgImageView) this.f48723B.get(0)).setBackgroundResource(C0164R.color.grey_0);
    }

    /* renamed from: B */
    private void m22227B(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.RoundedCornerCheckMarkSelectableImageView);
        if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.hasValue(1)) {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                this.f48724C = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            }
            obtainStyledAttributes.recycle();
            this.f48725D = (RoundedCornerMediaFrameLayout) LayoutInflater.from(getContext()).inflate(C0164R.layout.rounded_corner_check_mark_selectable_image_view, this, false);
            if (dimensionPixelSize != 0) {
                this.f48725D.getLayoutParams().width = dimensionPixelSize;
                this.f48725D.getLayoutParams().height = dimensionPixelSize2;
            }
            this.f48725D.setRadius(this.f48724C);
            this.f48723B.add((IgImageView) this.f48725D.findViewById(C0164R.id.selectable_image));
            ImageView imageView = (ImageView) this.f48725D.findViewById(C0164R.id.select_check_mark);
            this.f48726E = imageView;
            imageView.setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), C0164R.color.white)));
            addView(this.f48725D);
            return;
        }
        throw new RuntimeException("Width and height required");
    }

    public List getImageViews() {
        return this.f48723B;
    }

    public ImageView getOverlayImage() {
        return this.f48726E;
    }

    public void setImageDrawable(Drawable drawable) {
        ((IgImageView) this.f48723B.get(0)).setImageDrawable(drawable);
    }

    public void setUrl(String str) {
        ((IgImageView) this.f48723B.get(0)).setUrl(str);
    }
}
