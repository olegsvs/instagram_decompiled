package com.instagram.user.follow;

import X.AnonymousClass0Ca;
import X.AnonymousClass0mc;
import X.AnonymousClass26y;
import X.AnonymousClass3lE;
import X.AnonymousClass3lG;
import X.AnonymousClass42K;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import com.facebook.C0164R;
import com.instagram.ui.widget.gradientspinner.SpinningGradientBorder;

public class DelayedInviteButton extends InviteButton {
    /* renamed from: B */
    public SpinningGradientBorder f48745B;

    public DelayedInviteButton(Context context) {
        super(context, null, 0);
    }

    public DelayedInviteButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public DelayedInviteButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: B */
    public final void m22244B(AnonymousClass0mc anonymousClass0mc, AnonymousClass42K anonymousClass42K, SpinningGradientBorder spinningGradientBorder) {
        AnonymousClass26y anonymousClass26y;
        DelayedInviteButton delayedInviteButton = this;
        setEnabled(anonymousClass0mc.ON() ^ 1);
        refreshDrawableState();
        this.f48745B = spinningGradientBorder;
        boolean ON = anonymousClass0mc.ON();
        setEnabled(ON ^ 1);
        if (ON) {
            anonymousClass26y = AnonymousClass26y.Invited;
            m22243D(delayedInviteButton, 0, C0164R.string.invite_button_invited, C0164R.drawable.bg_rounded_white, C0164R.color.grey_5, null);
        } else if (anonymousClass42K.lX(anonymousClass0mc.getId())) {
            anonymousClass26y = AnonymousClass26y.Inviting;
            setUndoState(this, anonymousClass42K, anonymousClass0mc);
        } else {
            anonymousClass26y = AnonymousClass26y.NotInvited;
            setInviteState(this, anonymousClass42K, anonymousClass0mc);
        }
        int C = m22242C(anonymousClass26y);
        if (C != 0) {
            setText(C);
        }
    }

    /* renamed from: C */
    public static int m22242C(AnonymousClass26y anonymousClass26y) {
        switch (anonymousClass26y.ordinal()) {
            case 0:
                return C0164R.string.invite_button_loading;
            case 1:
                return C0164R.string.invite_button_invite;
            case 2:
                return C0164R.string.invite_button_invited;
            case 3:
                return C0164R.string.invite_button_inviting;
            default:
                throw new UnsupportedOperationException("Unhandled invite type");
        }
    }

    /* renamed from: D */
    public static void m22243D(DelayedInviteButton delayedInviteButton, int i, int i2, int i3, int i4, OnClickListener onClickListener) {
        delayedInviteButton.setText(i2);
        delayedInviteButton.setTextColor(AnonymousClass0Ca.C(delayedInviteButton.getContext(), i4));
        delayedInviteButton.setBackgroundResource(i3);
        delayedInviteButton.f48745B.setSpinnerState(i);
        delayedInviteButton.setOnClickListener(onClickListener);
    }

    public static void setInviteState(DelayedInviteButton delayedInviteButton, AnonymousClass42K anonymousClass42K, AnonymousClass0mc anonymousClass0mc) {
        m22243D(delayedInviteButton, 0, C0164R.string.invite_button_invite, C0164R.drawable.primary_button_selector, C0164R.color.white, new AnonymousClass3lG(delayedInviteButton, anonymousClass42K, anonymousClass0mc));
    }

    public static void setUndoState(DelayedInviteButton delayedInviteButton, AnonymousClass42K anonymousClass42K, AnonymousClass0mc anonymousClass0mc) {
        m22243D(delayedInviteButton, 1, C0164R.string.invite_button_inviting, C0164R.drawable.bg_rounded_white, C0164R.color.black, new AnonymousClass3lE(delayedInviteButton, anonymousClass42K, anonymousClass0mc));
    }
}
