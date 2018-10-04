package com.instagram.user.follow;

import X.AnonymousClass0eS;
import X.AnonymousClass0mc;
import X.AnonymousClass26y;
import X.AnonymousClass3lX;
import X.AnonymousClass3lY;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.facebook.C0164R;

public class InviteButton extends UpdatableButton {
    /* renamed from: B */
    private static final Typeface f44191B = Typeface.create("sans-serif-medium", 0);
    /* renamed from: C */
    private static final Typeface f44192C = Typeface.create("sans-serif", 0);

    public InviteButton(Context context) {
        this(context, null, 0);
    }

    public InviteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InviteButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.FollowButton, i, 0).recycle();
        setBlueButton(true);
    }

    /* renamed from: A */
    public final void m20605A(AnonymousClass0mc anonymousClass0mc, AnonymousClass3lY anonymousClass3lY) {
        if (anonymousClass0mc != null) {
            setEnabled(anonymousClass0mc.ON() ^ 1);
            refreshDrawableState();
            boolean ON = anonymousClass0mc.ON();
            setEnabled(ON ^ 1);
            int B = m20604B(ON ? AnonymousClass26y.Invited : AnonymousClass26y.NotInvited);
            if (B != 0) {
                setText(B);
            }
            setOnClickListener(new AnonymousClass3lX(this, anonymousClass0mc, anonymousClass3lY));
        }
    }

    /* renamed from: B */
    public static int m20604B(AnonymousClass26y anonymousClass26y) {
        switch (anonymousClass26y.ordinal()) {
            case 0:
                return C0164R.string.invite_button_loading;
            case 1:
                return C0164R.string.invite_button_invite;
            case 2:
                return C0164R.string.invite_button_invited;
            default:
                throw new UnsupportedOperationException("Unhandled invite type");
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setTypeface(z ? f44191B : f44192C);
    }
}
