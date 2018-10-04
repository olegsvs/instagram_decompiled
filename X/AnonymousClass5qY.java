package X;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.5qY */
public final class AnonymousClass5qY implements AnonymousClass0oF {
    /* renamed from: B */
    private final AnonymousClass0IL f69333B;
    /* renamed from: C */
    private final AnonymousClass0Cm f69334C;

    public AnonymousClass5qY(AnonymousClass0IL anonymousClass0IL, AnonymousClass0Cm anonymousClass0Cm) {
        this.f69333B = anonymousClass0IL;
        this.f69334C = anonymousClass0Cm;
    }

    public final void iU(Uri uri, Bundle bundle) {
        AnonymousClass5QX anonymousClass5QX;
        if ("after_launch".equals(uri.getQueryParameter("mode"))) {
            anonymousClass5QX = AnonymousClass5QX.f63258D;
        } else {
            anonymousClass5QX = AnonymousClass5QX.f63259E;
        }
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f69333B.getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass5QZ.f63270B.mo5909A().m27785A(anonymousClass5QX, this.f69334C.f1759C, this.f69334C.B().uT());
        anonymousClass0IZ.B();
    }
}
