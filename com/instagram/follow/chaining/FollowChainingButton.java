package com.instagram.follow.chaining;

import X.AnonymousClass0Ca;
import X.AnonymousClass0G5;
import X.AnonymousClass0ca;
import X.AnonymousClass3P8;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.C0164R;

public class FollowChainingButton extends FrameLayout {
    /* renamed from: B */
    private ImageView f40819B;
    /* renamed from: C */
    private ProgressBar f40820C;

    public FollowChainingButton(Context context) {
        super(context);
        m19540B();
    }

    public FollowChainingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19540B();
    }

    public FollowChainingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19540B();
    }

    /* renamed from: A */
    public final void m19542A(AnonymousClass3P8 anonymousClass3P8, boolean z) {
        if (z) {
            m19541C(anonymousClass3P8, C0164R.color.grey_9, C0164R.color.grey_2, C0164R.drawable.secondary_button_selector);
        } else {
            m19541C(anonymousClass3P8, C0164R.color.white, AnonymousClass0G5.F(getContext(), C0164R.attr.primaryButtonBackgroundSelectedColor), AnonymousClass0G5.F(getContext(), C0164R.attr.primaryButtonBackground));
        }
    }

    /* renamed from: B */
    private void m19540B() {
        LayoutInflater.from(getContext()).inflate(C0164R.layout.chaining_button, this, true);
        this.f40820C = (ProgressBar) findViewById(C0164R.id.chaining_button_progress_bar);
        this.f40819B = (ImageView) findViewById(C0164R.id.chaining_button);
    }

    /* renamed from: C */
    private void m19541C(AnonymousClass3P8 anonymousClass3P8, int i, int i2, int i3) {
        this.f40819B.setBackgroundResource(i3);
        if (anonymousClass3P8 == AnonymousClass3P8.Open) {
            this.f40819B.setImageDrawable(AnonymousClass0Ca.E(getContext(), C0164R.drawable.downward_triangle_white));
            this.f40820C.setVisibility(4);
            this.f40819B.setBackgroundResource(C0164R.drawable.rounded_layout_border_fill);
            this.f40819B.getBackground().mutate().setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), i2)));
        } else if (anonymousClass3P8 == AnonymousClass3P8.Loading) {
            this.f40819B.setImageDrawable(null);
            this.f40820C.setVisibility(0);
        } else if (anonymousClass3P8 == AnonymousClass3P8.Closed) {
            this.f40819B.setImageDrawable(AnonymousClass0Ca.E(getContext(), C0164R.drawable.downward_triangle_white));
            this.f40820C.setVisibility(4);
        }
        ColorFilter B = AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), i));
        if (this.f40819B.getDrawable() != null) {
            this.f40819B.getDrawable().mutate().setColorFilter(B);
        }
        this.f40820C.getIndeterminateDrawable().setColorFilter(B);
    }
}
