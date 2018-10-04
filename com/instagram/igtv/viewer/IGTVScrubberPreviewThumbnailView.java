package com.instagram.igtv.viewer;

import X.AnonymousClass0dw;
import X.AnonymousClass0vX;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.videothumbnail.ThumbView;

public class IGTVScrubberPreviewThumbnailView extends FrameLayout implements AnonymousClass0vX {
    /* renamed from: B */
    public FrameLayout f58582B;
    /* renamed from: C */
    public ThumbView f58583C;
    /* renamed from: D */
    public TextView f58584D;

    public final void RDA(int i, int i2) {
    }

    public IGTVScrubberPreviewThumbnailView(Context context) {
        this(context, null);
    }

    public IGTVScrubberPreviewThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IGTVScrubberPreviewThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(getContext()).inflate(C0164R.layout.igtv_scrubber_preview_thumbnail_view, this);
        this.f58582B = (FrameLayout) inflate.findViewById(C0164R.id.preview_container);
        this.f58583C = (ThumbView) inflate.findViewById(C0164R.id.preview_thumbnail);
        this.f58584D = (TextView) inflate.findViewById(C0164R.id.scrubber_timer_text);
        this.f58583C.setThumbRoundRadius(30);
    }

    public final void JUA(Bitmap bitmap, Rect rect, int i, int i2, double d) {
        LayoutParams layoutParams = this.f58583C.getLayoutParams();
        double d2 = (double) layoutParams.width;
        Double.isNaN(d2);
        layoutParams.height = (int) Math.round(d2 / d);
        int measuredWidth = getMeasuredWidth();
        int i3 = layoutParams.width / 2;
        double d3 = (double) measuredWidth;
        d2 = (double) i;
        Double.isNaN(d2);
        d2 *= 1.0d;
        double d4 = (double) i2;
        Double.isNaN(d4);
        d2 /= d4;
        Double.isNaN(d3);
        int i4 = (int) (d3 * d2);
        measuredWidth = i4 < i3 ? 0 : i4 >= measuredWidth - i3 ? measuredWidth - (i3 * 2) : i4 - i3;
        LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f58582B.getLayoutParams());
        layoutParams2.gravity = 8388691;
        layoutParams2.leftMargin = measuredWidth;
        this.f58582B.setLayoutParams(layoutParams2);
        this.f58584D.setText(AnonymousClass0dw.E((long) i));
        this.f58582B.setVisibility(0);
        this.f58583C.B();
    }
}
