package com.instagram.arlink.ui;

import X.AnonymousClass0Ca;
import X.AnonymousClass0cQ;
import X.AnonymousClass31H;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.ui.widget.nametag.UsernameTextView;

public class NametagCardHintView extends FrameLayout {
    /* renamed from: B */
    public AnimationDrawable f37032B;
    /* renamed from: C */
    public boolean f37033C;
    /* renamed from: D */
    public ShimmerFrameLayout f37034D;
    /* renamed from: E */
    private UsernameTextView f37035E;

    public NametagCardHintView(Context context) {
        super(context);
        m18223B();
    }

    public NametagCardHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18223B();
    }

    public NametagCardHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18223B();
    }

    /* renamed from: A */
    public final void m18224A(boolean z) {
        if (z) {
            this.f37032B.stop();
        } else {
            this.f37032B.setOneShot(true);
        }
        this.f37033C = true;
    }

    /* renamed from: B */
    private void m18223B() {
        inflate(getContext(), C0164R.layout.nametag_card_hint_layout, this);
        this.f37032B = (AnimationDrawable) AnonymousClass0Ca.E(getContext(), C0164R.drawable.scan_marks_animation);
        this.f37034D = (ShimmerFrameLayout) findViewById(C0164R.id.shimmer_layout);
        UsernameTextView usernameTextView = (UsernameTextView) findViewById(C0164R.id.username_hint_view);
        this.f37035E = usernameTextView;
        usernameTextView.setName(getContext().getString(C0164R.string.username_placeholder), null);
        this.f37035E.setTextColor(-1);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 438397667);
        super.onSizeChanged(i, i2, i3, i4);
        this.f37032B.setBounds(0, 0, i, i2);
        setBackground(this.f37032B);
        float f = (float) i;
        float f2 = (float) i2;
        this.f37035E.m20532A((int) (0.167f * f), (int) (0.067f * f2));
        this.f37035E.m20533B((f2 * 0.044f) - this.f37035E.getPaint().getFontMetrics().ascent, (int) (f * 0.967f));
        this.f37035E.post(new AnonymousClass31H(this));
        AnonymousClass0cQ.O(this, -854731255, N);
    }
}
