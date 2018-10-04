package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass2T6;
import X.AnonymousClass2TC;
import java.lang.ref.WeakReference;

public final class zzbck extends zzctp {
    /* renamed from: B */
    private final WeakReference f32157B;

    public zzbck(AnonymousClass2T6 anonymousClass2T6) {
        int I = AnonymousClass0cQ.I(this, -907342550);
        this.f32157B = new WeakReference(anonymousClass2T6);
        AnonymousClass0cQ.H(this, 2138176643, I);
    }

    public final void tXA(zzctx zzctx) {
        int i;
        int I = AnonymousClass0cQ.I(this, 334295843);
        AnonymousClass2T6 anonymousClass2T6 = (AnonymousClass2T6) this.f32157B.get();
        if (anonymousClass2T6 == null) {
            i = 1310997656;
        } else {
            anonymousClass2T6.f30698D.m16643A(new AnonymousClass2TC(this, anonymousClass2T6, anonymousClass2T6, zzctx));
            i = -1317502814;
        }
        AnonymousClass0cQ.H(this, i, I);
    }
}
