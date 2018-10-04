package X;

import android.os.Bundle;

/* renamed from: X.603 */
public final class AnonymousClass603 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass605 f70754B;

    public AnonymousClass603(AnonymousClass605 anonymousClass605) {
        this.f70754B = anonymousClass605;
    }

    public final void run() {
        if (this.f70754B.f70755B.f73264D.isResumed()) {
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f70754B.f70755B.f73262B);
            String uT = this.f70754B.f70756C.uT();
            String F = this.f70754B.f70756C.DC.F();
            Bundle bundle = new Bundle();
            bundle.putString("SchoolDirectoryUserReportTombstoneFragment.reportee_user_name", uT);
            bundle.putString("SchoolDirectoryUserReportTombstoneFragment.school_short_name", F);
            AnonymousClass0IL anonymousClass60P = new AnonymousClass60P();
            anonymousClass60P.setArguments(bundle);
            anonymousClass0IZ.f2754D = anonymousClass60P;
            anonymousClass0IZ.B();
        }
    }
}
