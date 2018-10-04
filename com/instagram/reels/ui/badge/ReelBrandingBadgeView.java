package com.instagram.reels.ui.badge;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Zc;
import X.AnonymousClass0ya;
import X.AnonymousClass16T;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.C0164R;
import com.instagram.ui.widget.badgeicon.BadgeIconView;

public class ReelBrandingBadgeView extends BadgeIconView {
    /* renamed from: B */
    private final int[] f12801B;
    /* renamed from: C */
    private final int[] f12802C;

    public ReelBrandingBadgeView(Context context) {
        this(context, null);
    }

    public ReelBrandingBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReelBrandingBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        r7 = new int[5];
        AnonymousClass16T.m9429C(context, null, C0164R.style.GradientPatternStyle, r7);
        int C = AnonymousClass0Ca.m937C(getContext(), C0164R.color.grey_3);
        this.f12801B = new int[]{r7[1], r7[3]};
        this.f12802C = new int[]{C, C};
        setBackgroundColorGradient(this.f12801B);
        AnonymousClass16T.m9429C(context, null, C0164R.style.CloseFriendsGradientPatternStyle, r7);
        int[] iArr = new int[]{r7[1], r7[3]};
        m8642A((float) getMeasuredWidth(), (float) getMeasuredHeight());
    }

    /* renamed from: B */
    public final void m8641B(AnonymousClass0ya anonymousClass0ya) {
        int i;
        switch (anonymousClass0ya.ordinal()) {
            case 1:
                i = C0164R.drawable.reel_location_branding_icon;
                break;
            case 2:
                i = C0164R.drawable.reel_hash_branding_icon;
                break;
            case 3:
                i = C0164R.drawable.reel_sticker_branding_icon;
                break;
            case 4:
                i = C0164R.drawable.reel_pbia_branding_icon;
                break;
            default:
                i = 0;
                break;
        }
        setIconDrawable(i);
    }

    /* renamed from: B */
    public static boolean m8640B(AnonymousClass0Zc anonymousClass0Zc) {
        return anonymousClass0Zc.DJ() != AnonymousClass0ya.NONE;
    }

    public void setActiveColorState(boolean z) {
        Object obj = this.f12803B == this.f12801B ? 1 : null;
        if (!z || obj == null) {
            if (z || obj != null) {
                setBackgroundColorGradient(z ? this.f12801B : this.f12802C);
            }
        }
    }
}
