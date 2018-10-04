package com.google.android.gms.internal;

import X.AnonymousClass0OR;
import X.AnonymousClass0cQ;
import X.AnonymousClass1Ew;
import X.AnonymousClass1yr;
import X.AnonymousClass1ys;
import X.AnonymousClass1za;
import X.AnonymousClass20a;
import X.AnonymousClass20b;
import X.AnonymousClass216;
import X.AnonymousClass2ST;
import X.AnonymousClass2du;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

public final class zzbej extends zzctp implements AnonymousClass1yr, AnonymousClass1ys {
    /* renamed from: J */
    private static AnonymousClass2ST f32158J = AnonymousClass216.f25271D;
    /* renamed from: B */
    public final Context f32159B;
    /* renamed from: C */
    public final Handler f32160C;
    /* renamed from: D */
    public final AnonymousClass2ST f32161D;
    /* renamed from: E */
    public AnonymousClass1za f32162E;
    /* renamed from: F */
    public AnonymousClass2du f32163F;
    /* renamed from: G */
    public final boolean f32164G;
    /* renamed from: H */
    public AnonymousClass20b f32165H;
    /* renamed from: I */
    public Set f32166I;

    public zzbej(Context context, Handler handler) {
        int I = AnonymousClass0cQ.I(this, 1515835644);
        this.f32159B = context;
        this.f32160C = handler;
        this.f32161D = f32158J;
        this.f32164G = true;
        AnonymousClass0cQ.H(this, -577521869, I);
    }

    public zzbej(Context context, Handler handler, AnonymousClass1za anonymousClass1za, AnonymousClass2ST anonymousClass2ST) {
        int I = AnonymousClass0cQ.I(this, -1889990418);
        this.f32159B = context;
        this.f32160C = handler;
        this.f32162E = (AnonymousClass1za) AnonymousClass1Ew.E(anonymousClass1za, "ClientSettings must not be null");
        this.f32166I = anonymousClass1za.f25083B;
        this.f32161D = anonymousClass2ST;
        this.f32164G = false;
        AnonymousClass0cQ.H(this, 111920137, I);
    }

    public final void Xh(Bundle bundle) {
        int I = AnonymousClass0cQ.I(this, -2103502965);
        this.f32163F.iXA(this);
        AnonymousClass0cQ.H(this, -1091858895, I);
    }

    public final void bh(ConnectionResult connectionResult) {
        int I = AnonymousClass0cQ.I(this, 2098955968);
        this.f32165H.KYA(connectionResult);
        AnonymousClass0cQ.H(this, 689426962, I);
    }

    public final void fh(int i) {
        int I = AnonymousClass0cQ.I(this, -1791357772);
        this.f32163F.gG();
        AnonymousClass0cQ.H(this, 557759701, I);
    }

    public final void tXA(zzctx zzctx) {
        int I = AnonymousClass0cQ.I(this, 504067823);
        AnonymousClass0OR.D(this.f32160C, new AnonymousClass20a(this, zzctx), 1809613998);
        AnonymousClass0cQ.H(this, 1427025749, I);
    }
}
