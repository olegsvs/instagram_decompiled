package X;

import android.graphics.Point;

/* renamed from: X.2mf */
public final class AnonymousClass2mf implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Nc f33930B;
    /* renamed from: C */
    public final /* synthetic */ Point f33931C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass2nU f33932D;

    public AnonymousClass2mf(AnonymousClass0Nc anonymousClass0Nc, AnonymousClass2nU anonymousClass2nU, Point point) {
        this.f33930B = anonymousClass0Nc;
        this.f33932D = anonymousClass2nU;
        this.f33931C = point;
    }

    public final void run() {
        if (this.f33930B.f3610P != null) {
            this.f33930B.f3610P.am(this.f33932D, this.f33931C);
        }
    }
}
