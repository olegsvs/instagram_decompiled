package X;

import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.15g */
public final class AnonymousClass15g {
    /* renamed from: B */
    public static void m9330B(AnonymousClass15O anonymousClass15O, AnonymousClass2Fy anonymousClass2Fy, AnonymousClass0Cm anonymousClass0Cm) {
        if (anonymousClass15O.f14281C == null) {
            ViewGroup viewGroup = (ViewGroup) anonymousClass15O.f14283E.inflate();
            anonymousClass15O.f14281C = viewGroup;
            TextView textView = (TextView) viewGroup.findViewById(C0164R.id.reel_music_attribution_label);
            anonymousClass15O.f14280B = textView;
            textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelSize(C0164R.dimen.reel_music_attribution_icon_padding));
        }
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(anonymousClass2Fy.f28168G);
        if (anonymousClass2Fy.f28169H != null) {
            spannableStringBuilder.setSpan(new AnonymousClass0yF(), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.append(" • ");
        spannableStringBuilder.append(anonymousClass2Fy.f28174M);
        anonymousClass15O.f14280B.setText(spannableStringBuilder);
        anonymousClass15O.f14280B.setCompoundDrawablesRelativeWithIntrinsicBounds(((Boolean) AnonymousClass0CC.hf.m846H(anonymousClass0Cm)).booleanValue() ? anonymousClass15O.f14285G : anonymousClass15O.f14284F, null, anonymousClass2Fy.f28170I ? anonymousClass15O.f14282D : null, null);
        anonymousClass15O.f14281C.setVisibility(0);
    }

    /* renamed from: C */
    public static boolean m9331C(AnonymousClass15O anonymousClass15O, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass0QE anonymousClass0QE, View view, AnonymousClass0Cm anonymousClass0Cm) {
        if (!anonymousClass0Pj.m3879c()) {
            return false;
        }
        AnonymousClass2Fy anonymousClass2Fy = ((AnonymousClass0ZF) anonymousClass0Pj.m3864N(AnonymousClass15c.MUSIC_OVERLAY).get(0)).f6306N;
        AnonymousClass15g.m9330B(anonymousClass15O, anonymousClass2Fy, anonymousClass0Cm);
        if (anonymousClass2Fy.f28169H != null) {
            anonymousClass15O.f14281C.setOnClickListener(new AnonymousClass1ZU(anonymousClass0QE, anonymousClass15O, anonymousClass0Pj, anonymousClass2Fy));
        } else {
            anonymousClass15O.f14281C.setOnClickListener(null);
        }
        view.post(AnonymousClass5Bw.B(view, anonymousClass15O.f14281C, new Rect()));
        return true;
    }
}
