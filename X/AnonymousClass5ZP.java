package X;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import java.util.Set;

/* renamed from: X.5ZP */
public enum AnonymousClass5ZP extends AnonymousClass564 {
    public AnonymousClass5ZP(String str, int i) {
        super(str, i);
    }

    /* renamed from: A */
    public final boolean mo5841A(AnonymousClass5ZN anonymousClass5ZN, String str) {
        return PhoneNumberUtils.compare(str, anonymousClass5ZN.mo6064F());
    }

    /* renamed from: B */
    public final void mo5842B(Context context, AnonymousClass0Fz anonymousClass0Fz, String str, Set set, String str2, AnonymousClass0Iw anonymousClass0Iw) {
        AnonymousClass0GA C = AnonymousClass2Eh.C(str, set, str2);
        C.f2849B = anonymousClass0Iw;
        AnonymousClass0Px.B(context, anonymousClass0Fz, C);
    }
}
