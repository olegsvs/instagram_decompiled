package X;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.C0164R;

/* renamed from: X.5qV */
public final class AnonymousClass5qV implements AnonymousClass0oF {
    /* renamed from: B */
    public AnonymousClass0IL f69329B;
    /* renamed from: C */
    public AnonymousClass0Cm f69330C;

    public AnonymousClass5qV(AnonymousClass0IL anonymousClass0IL, AnonymousClass0Cm anonymousClass0Cm) {
        this.f69329B = anonymousClass0IL;
        this.f69330C = anonymousClass0Cm;
    }

    public final void iU(Uri uri, Bundle bundle) {
        AnonymousClass0IL anonymousClass0IL = this.f69329B;
        AnonymousClass5GT.m26104B(anonymousClass0IL, this.f69330C, anonymousClass0IL.getString(C0164R.string.send_feedback), this.f69329B.getString(C0164R.string.improve), "appirater_feedback");
    }
}
