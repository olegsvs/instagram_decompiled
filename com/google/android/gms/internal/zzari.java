package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass6CO;
import X.AnonymousClass6CQ;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public final class zzari extends zzard {
    /* renamed from: B */
    private /* synthetic */ AnonymousClass6CQ f74113B;

    public zzari(AnonymousClass6CQ anonymousClass6CQ) {
        this.f74113B = anonymousClass6CQ;
        AnonymousClass0cQ.H(this, 726799220, AnonymousClass0cQ.I(this, 1453707396));
    }

    public final void DYA(Status status) {
        int I = AnonymousClass0cQ.I(this, 1159355196);
        this.f74113B.H(new AnonymousClass6CO(status, null));
        AnonymousClass0cQ.H(this, -1080191653, I);
    }

    public final void QXA(Status status, Credential credential) {
        int I = AnonymousClass0cQ.I(this, 1712096412);
        this.f74113B.H(new AnonymousClass6CO(status, credential));
        AnonymousClass0cQ.H(this, -2032917329, I);
    }
}
