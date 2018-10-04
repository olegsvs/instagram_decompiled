package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1Ew;
import X.AnonymousClass203;
import com.google.android.gms.location.LocationSettingsResult;

public final class zzcdm extends zzcdc {
    /* renamed from: B */
    private AnonymousClass203 f73962B;

    public zzcdm(AnonymousClass203 anonymousClass203) {
        int I = AnonymousClass0cQ.I(this, 1012723567);
        AnonymousClass1Ew.F(anonymousClass203 != null, "listener can't be null.");
        this.f73962B = anonymousClass203;
        AnonymousClass0cQ.H(this, -1389139634, I);
    }

    public final void lXA(LocationSettingsResult locationSettingsResult) {
        int I = AnonymousClass0cQ.I(this, -1537345177);
        this.f73962B.IRA(locationSettingsResult);
        this.f73962B = null;
        AnonymousClass0cQ.H(this, -2057487298, I);
    }
}
