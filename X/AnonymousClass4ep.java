package X;

import android.text.SpannableStringBuilder;
import java.util.List;

/* renamed from: X.4ep */
public final class AnonymousClass4ep {
    /* renamed from: B */
    public static void m24665B(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5WQ anonymousClass5WQ, AnonymousClass4gT anonymousClass4gT, AnonymousClass5bQ anonymousClass5bQ) {
        CharSequence charSequence;
        Object obj = anonymousClass5WQ.f65618B.f5876F;
        int i = anonymousClass5WQ.f65627K.f56243D ^ 1;
        if (obj instanceof String) {
            charSequence = (String) obj;
        } else if (obj instanceof AnonymousClass0P7) {
            charSequence = ((AnonymousClass0P7) obj).f4044s;
        } else if (obj instanceof AnonymousClass0X0) {
            charSequence = ((AnonymousClass0X0) obj).f6081C;
        } else {
            charSequence = null;
        }
        if (charSequence != null && !charSequence.isEmpty() && anonymousClass5WQ.f65620D == null) {
            if (i == 0) {
                anonymousClass5WQ.f65620D = charSequence;
                return;
            }
            AnonymousClass4gS anonymousClass4gS;
            if (anonymousClass5WQ.f65618B.S(anonymousClass0Cm.B())) {
                anonymousClass4gS = anonymousClass4gT.f56263B;
            } else {
                anonymousClass4gS = anonymousClass4gT.f56264C;
            }
            AnonymousClass0ps C = new AnonymousClass0ps(new SpannableStringBuilder(charSequence), anonymousClass5WQ.f65621E).C(anonymousClass5bQ);
            C.f10770I = anonymousClass4gS.f56251F;
            AnonymousClass0ps B = C.B(anonymousClass5bQ);
            B.f10764C = anonymousClass4gS.f56248C;
            B.f10773L = anonymousClass5bQ;
            B.f10781T = true;
            B.f10763B = anonymousClass4gS.f56247B;
            B.f10777P = anonymousClass5bQ;
            B.f10782U = true;
            B.f10779R = anonymousClass4gS.f56253H;
            B.f10774M = new AnonymousClass1B2(anonymousClass5bQ, anonymousClass5WQ.f65618B);
            anonymousClass5WQ.f65620D = B.A();
        }
    }

    /* renamed from: C */
    public static void m24666C(AnonymousClass5WQ anonymousClass5WQ) {
        if (!anonymousClass5WQ.f65627K.f56243D) {
            AnonymousClass0W7 anonymousClass0W7 = anonymousClass5WQ.f65618B;
            AnonymousClass1YM anonymousClass1YM = anonymousClass5WQ.f65621E;
            if ((anonymousClass0W7.f5876F instanceof String) && anonymousClass1YM == null) {
                String str = (String) anonymousClass0W7.f5876F;
                AnonymousClass3OU anonymousClass3OU = new AnonymousClass3OU();
                try {
                    anonymousClass3OU.f40749C = (List) AnonymousClass0LH.E(AnonymousClass188.C(str));
                    anonymousClass3OU.f40750D = (List) AnonymousClass0LH.E(AnonymousClass188.D(str));
                    anonymousClass3OU.f40748B = (List) AnonymousClass0LH.E(AnonymousClass188.B(str));
                    anonymousClass3OU.f40751E = (List) AnonymousClass0LH.E(AnonymousClass188.E(str));
                } catch (Throwable e) {
                    AnonymousClass0Gn.E("error_linkifying", "Unable to linkify", e);
                }
                anonymousClass5WQ.f65621E = new AnonymousClass1YM(anonymousClass3OU);
            }
        }
    }
}
