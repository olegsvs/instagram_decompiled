package com.instagram.ui.widget.segmentedprogressbar;

import X.AnonymousClass0e8;
import X.AnonymousClass14H;
import X.AnonymousClass2Lv;
import X.AnonymousClass2cV;
import X.AnonymousClass2cW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.C0164R;

public class ProgressAnchorContainer extends LinearLayout {
    /* renamed from: B */
    public AnonymousClass2Lv f29465B;
    /* renamed from: C */
    public final boolean f29466C;
    /* renamed from: D */
    public final SegmentedProgressBar f29467D;

    public ProgressAnchorContainer(Context context) {
        this(context, null);
    }

    public ProgressAnchorContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressAnchorContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        LayoutInflater.from(context).inflate(C0164R.layout.layout_progress_anchor_container, this, true);
        this.f29467D = (SegmentedProgressBar) findViewById(C0164R.id.segment_progress_bar);
        this.f29466C = AnonymousClass0e8.D(context);
        this.f29467D.setPositionAnchorDelegate(new AnonymousClass2cV(this));
    }

    /* renamed from: B */
    public static void m15187B(ProgressAnchorContainer progressAnchorContainer, boolean z) {
        int currentSegment;
        int segments = progressAnchorContainer.f29467D.getSegments();
        if (progressAnchorContainer.f29466C) {
            currentSegment = (segments - progressAnchorContainer.f29467D.getCurrentSegment()) - 1;
        } else {
            currentSegment = progressAnchorContainer.f29467D.getCurrentSegment();
        }
        if (segments > 1) {
            AnonymousClass14H J = AnonymousClass14H.C(progressAnchorContainer).J();
            J.f13849O = new AnonymousClass2cW(progressAnchorContainer, z, segments, currentSegment);
            J.K(true).N();
        }
        if (progressAnchorContainer.f29465B == null) {
            return;
        }
        if (z) {
            AnonymousClass14H.E(true, new View[]{r2});
            return;
        }
        AnonymousClass14H.H(true, new View[]{r2});
    }

    public final void addView(View view) {
        if (!(view instanceof AnonymousClass2Lv)) {
            if (!(view instanceof SegmentedProgressBar)) {
                throw new IllegalArgumentException("Can only attach views that extend from ProgressAnchorView");
            }
        }
        super.addView(view);
    }

    public AnonymousClass2Lv getAnchorView() {
        return this.f29465B;
    }

    public SegmentedProgressBar getSegmentedProgressBar() {
        return this.f29467D;
    }

    public void setAnchorView(AnonymousClass2Lv anonymousClass2Lv) {
        View view = this.f29465B;
        if (view != null) {
            removeView(view);
        }
        addView(anonymousClass2Lv);
        this.f29465B = anonymousClass2Lv;
    }
}
