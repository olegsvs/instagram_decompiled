package X;

import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.5G8 */
public final class AnonymousClass5G8 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5G9 f61643B;

    public AnonymousClass5G8(AnonymousClass5G9 anonymousClass5G9) {
        this.f61643B = anonymousClass5G9;
    }

    public final void run() {
        AnonymousClass0IG.G(this.f61643B.f61644B.getContext(), C0164R.string.switch_back_success_toast);
        AnonymousClass0SZ.B(this.f61643B.f61644B.getActivity(), this.f61643B.f61645C, "1128775337177422");
        AnonymousClass0Cn anonymousClass0Cn = this.f61643B.f61645C;
        if (AnonymousClass0a2.G(anonymousClass0Cn)) {
            String str = JsonProperty.USE_DEFAULT_NAME;
            AnonymousClass2H3.C(anonymousClass0Cn, new AnonymousClass2HM(str, str, str));
            return;
        }
        AnonymousClass0FO.G(anonymousClass0Cn, false);
    }
}
