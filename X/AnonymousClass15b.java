package X;

import android.graphics.Bitmap;

/* renamed from: X.15b */
public final class AnonymousClass15b implements AnonymousClass0yy {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Pj f14312B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0QE f14313C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass14s f14314D;
    /* renamed from: E */
    public final /* synthetic */ String f14315E;

    public AnonymousClass15b(AnonymousClass0Pj anonymousClass0Pj, String str, AnonymousClass14s anonymousClass14s, AnonymousClass0QE anonymousClass0QE) {
        this.f14312B = anonymousClass0Pj;
        this.f14315E = str;
        this.f14314D = anonymousClass14s;
        this.f14313C = anonymousClass0QE;
    }

    public final void kp(Bitmap bitmap) {
        if (this.f14312B.m3888l()) {
            if (bitmap != null) {
                AnonymousClass3pJ.C(this.f14312B.f4134F, this.f14315E);
            } else {
                AnonymousClass3pJ.B(this.f14312B.f4134F, this.f14315E);
            }
        }
        boolean z = true;
        this.f14314D.f14078F = bitmap != null;
        AnonymousClass0QE anonymousClass0QE = this.f14313C;
        if (bitmap == null) {
            z = false;
        }
        anonymousClass0QE.XGA(z, this.f14312B, this.f14314D);
    }
}
