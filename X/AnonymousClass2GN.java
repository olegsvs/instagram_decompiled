package X;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView.BufferType;
import com.facebook.C0164R;

/* renamed from: X.2GN */
public final class AnonymousClass2GN {
    /* renamed from: B */
    public static void m14882B(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass2bd anonymousClass2bd, AnonymousClass2GD anonymousClass2GD, OnTouchListener onTouchListener, AnonymousClass2GM anonymousClass2GM) {
        if (anonymousClass2GD.m14876A() == -1) {
            anonymousClass2bd.f31465B.setBackgroundResource(C0164R.drawable.question_response_card_outline);
        } else {
            anonymousClass2bd.f31465B.setBackgroundResource(C0164R.drawable.question_response_card_background);
            anonymousClass2bd.f31465B.getBackground().mutate().setColorFilter(anonymousClass2GD.m14876A(), Mode.SRC);
        }
        View view = anonymousClass2bd.f31470G;
        int i = (anonymousClass2GD.f28230D.f16885B && ((Boolean) AnonymousClass0CC.lZ.H(anonymousClass0Cm)).booleanValue()) ? 0 : 8;
        view.setVisibility(i);
        anonymousClass2bd.f10370B.setOnTouchListener(onTouchListener);
        anonymousClass2bd.f31474K.E();
        anonymousClass2bd.f31466C = new AnonymousClass2GK(anonymousClass2GM, anonymousClass2GD);
        anonymousClass2bd.f31472I.setText(anonymousClass2GD.m14878C().uT());
        anonymousClass2bd.f31472I.setTextColor(anonymousClass2GD.m14880E());
        anonymousClass2bd.f31471H.setAvatarUser(anonymousClass2GD.m14878C());
        if (anonymousClass2GD.m14876A() == -1) {
            anonymousClass2bd.f31471H.setStrokeColor(0);
        } else {
            anonymousClass2bd.f31471H.setStrokeColor(anonymousClass2GD.m14876A());
        }
        anonymousClass2bd.f31473J.setText(anonymousClass2GD.m14879D(), BufferType.SPANNABLE);
        boolean z = anonymousClass2GD.m14876A() == -1;
        View view2 = anonymousClass2bd.f31473J;
        AnonymousClass0Nm.T(view2, new AnonymousClass2GL(view2, z, anonymousClass2GD.m14880E()));
        if (anonymousClass2bd.f31469F != null) {
            ((GradientDrawable) anonymousClass2bd.f31469F.getBackground().mutate()).setColor(AnonymousClass26h.m14462E(anonymousClass2GD.m14876A()));
        }
        if (anonymousClass2bd.f31468E != null) {
            int i2 = (anonymousClass2GD.f28230D.f16885B && ((Boolean) AnonymousClass0CC.lZ.H(anonymousClass0Cm)).booleanValue()) ? C0164R.string.question_response_card_cta_replied : C0164R.string.question_response_card_cta;
            anonymousClass2bd.f31468E.setText(i2);
            anonymousClass2bd.f31468E.setTextColor(anonymousClass2GD.m14880E());
        }
        anonymousClass2bd.f31467D.setColorFilter(anonymousClass2GD.m14880E());
    }
}
