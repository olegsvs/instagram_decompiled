package com.instagram.creation.capture.quickcapture.faceeffectui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

public class SnapPickerRecyclerView extends RecyclerView {
    public SnapPickerRecyclerView(Context context) {
        super(context);
    }

    public SnapPickerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SnapPickerRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean canScrollHorizontally(int i) {
        int computeHorizontalScrollOffset = computeHorizontalScrollOffset();
        int computeHorizontalScrollRange = computeHorizontalScrollRange() - computeHorizontalScrollExtent();
        if (computeHorizontalScrollRange == 0) {
            return false;
        }
        if (i < 0) {
            if (computeHorizontalScrollOffset < 0) {
                return false;
            }
        } else if (computeHorizontalScrollOffset >= computeHorizontalScrollRange - 1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m19095e(int i, int i2) {
        double d = (double) i;
        Double.isNaN(d);
        return super.e((int) (d * 0.7d), i2);
    }
}
