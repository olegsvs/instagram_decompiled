package com.instagram.user.follow;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.C0164R;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;

public class UpdatableButton extends ImageWithTitleTextView {
    /* renamed from: C */
    private static final int[] f12862C = new int[]{C0164R.attr.state_blue};
    /* renamed from: D */
    private static final int[] f12863D = new int[]{C0164R.attr.state_grey};
    /* renamed from: B */
    private boolean f12864B = false;

    public UpdatableButton(Context context) {
        super(context, null, 0);
    }

    public UpdatableButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public UpdatableButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f12864B) {
            mergeDrawableStates(onCreateDrawableState, f12862C);
        } else {
            mergeDrawableStates(onCreateDrawableState, f12863D);
        }
        return onCreateDrawableState;
    }

    public void setBlueButton(boolean z) {
        this.f12864B = z;
    }
}
