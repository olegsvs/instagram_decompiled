package com.instagram.ui.mediaactions;

import X.AnonymousClass0vX;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.C0164R;
import com.instagram.ui.videothumbnail.ThumbView;

public class ScrubberPreviewThumbnailView extends FrameLayout implements AnonymousClass0vX {
    /* renamed from: B */
    public LinearLayout f12098B;
    /* renamed from: C */
    public ThumbView f12099C;

    public final void RDA(int i, int i2) {
    }

    public ScrubberPreviewThumbnailView(Context context) {
        this(context, null);
    }

    public ScrubberPreviewThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrubberPreviewThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(getContext()).inflate(C0164R.layout.scrubber_preview_thumbnail_view, this);
        this.f12098B = (LinearLayout) inflate.findViewById(C0164R.id.preview_container);
        this.f12099C = (ThumbView) inflate.findViewById(C0164R.id.preview_thumbnail);
    }

    public final void JUA(Bitmap bitmap, Rect rect, int i, int i2, double d) {
        LayoutParams layoutParams = this.f12099C.getLayoutParams();
        double d2 = (double) layoutParams.width;
        Double.isNaN(d2);
        layoutParams.height = (int) Math.round(d2 * d);
        int measuredWidth = getMeasuredWidth();
        int i3 = layoutParams.width / 2;
        double d3 = (double) measuredWidth;
        double d4 = (double) i;
        Double.isNaN(d4);
        d4 *= 1.0d;
        d2 = (double) i2;
        Double.isNaN(d2);
        d4 /= d2;
        Double.isNaN(d3);
        int i4 = (int) (d3 * d4);
        measuredWidth = i4 < i3 ? 0 : i4 >= measuredWidth - i3 ? measuredWidth - (i3 * 2) : i4 - i3;
        LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f12098B.getLayoutParams());
        layoutParams2.gravity = 8388691;
        layoutParams2.leftMargin = measuredWidth;
        this.f12098B.setLayoutParams(layoutParams2);
        this.f12098B.setVisibility(0);
        this.f12099C.m8342B();
    }
}
