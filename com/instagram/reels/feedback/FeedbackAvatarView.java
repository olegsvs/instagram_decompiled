package com.instagram.reels.feedback;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Ci;
import X.AnonymousClass0e8;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public class FeedbackAvatarView extends LinearLayout {
    /* renamed from: B */
    public final CircularImageView f60761B;
    /* renamed from: C */
    public int f60762C;
    /* renamed from: D */
    public final TextView f60763D;
    /* renamed from: E */
    private Drawable f60764E;
    /* renamed from: F */
    private int f60765F;
    /* renamed from: G */
    private int f60766G;

    public FeedbackAvatarView(Context context) {
        this(context, null);
    }

    public FeedbackAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedbackAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        inflate(getContext(), C0164R.layout.story_reaction_avatar, this);
        this.f60761B = (CircularImageView) findViewById(C0164R.id.reaction_avatar_view);
        this.f60763D = (TextView) findViewById(C0164R.id.reaction_username);
        this.f60766G = context.getResources().getDimensionPixelOffset(C0164R.dimen.story_reaction_icon_size);
        this.f60765F = context.getResources().getDimensionPixelOffset(C0164R.dimen.story_reaction_icon_padding);
        this.f60762C = context.getResources().getDimensionPixelOffset(C0164R.dimen.story_reaction_icon_margin_vertical);
    }

    /* renamed from: A */
    public final void m25901A(AnonymousClass0Ci anonymousClass0Ci, int i) {
        this.f60764E = AnonymousClass0Ca.E(getContext(), i);
        this.f60761B.setUrl(anonymousClass0Ci.DQ());
        this.f60763D.setText(anonymousClass0Ci.uT());
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f60764E.draw(canvas);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int left;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (AnonymousClass0e8.D(getContext())) {
            left = this.f60761B.getLeft() + this.f60765F;
            i5 = this.f60766G + left;
        } else {
            i5 = this.f60761B.getRight() - this.f60765F;
            left = i5 - this.f60766G;
        }
        int bottom = this.f60761B.getBottom() + this.f60765F;
        this.f60764E.setBounds(left, bottom - this.f60766G, i5, bottom);
    }
}
