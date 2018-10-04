package X;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.C0164R;

/* renamed from: X.0oG */
public final class AnonymousClass0oG implements AnonymousClass0oF {
    /* renamed from: B */
    private final AnonymousClass0IL f10278B;
    /* renamed from: C */
    private final AnonymousClass0Cm f10279C;

    public AnonymousClass0oG(AnonymousClass0IL anonymousClass0IL, AnonymousClass0Cm anonymousClass0Cm) {
        this.f10278B = anonymousClass0IL;
        this.f10279C = anonymousClass0Cm;
    }

    public final void iU(Uri uri, Bundle bundle) {
        AnonymousClass0Il.getInstance().newReactNativeLauncher(this.f10279C, "IgBrandedContentOnboardingApp").LSA(this.f10278B.getString(C0164R.string.branded_content)).cVA(this.f10278B.getActivity()).m2308B();
    }
}
