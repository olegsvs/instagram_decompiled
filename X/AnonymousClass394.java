package X;

import java.lang.ref.WeakReference;

/* renamed from: X.394 */
public final class AnonymousClass394 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass11d f38315B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass11c f38316C;

    public AnonymousClass394(AnonymousClass11d anonymousClass11d, AnonymousClass11c anonymousClass11c) {
        this.f38315B = anonymousClass11d;
        this.f38316C = anonymousClass11c;
    }

    public final void onFailInBackground(AnonymousClass0fq anonymousClass0fq) {
        int I = AnonymousClass0cQ.I(this, -1447579);
        this.f38315B.f13435B.remove(this.f38316C.f13429C);
        for (WeakReference weakReference : this.f38316C.f13428B) {
            if (weakReference.get() != null) {
                AnonymousClass11d.C(this.f38315B, new AnonymousClass393(this, weakReference));
            }
        }
        AnonymousClass0cQ.H(this, 223177174, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1090634067);
        AnonymousClass2XD anonymousClass2XD = (AnonymousClass2XD) obj;
        int I2 = AnonymousClass0cQ.I(this, 317574583);
        this.f38315B.f13435B.remove(this.f38316C.f13429C);
        this.f38315B.C(anonymousClass2XD);
        AnonymousClass11d.B(this.f38315B, this.f38316C);
        AnonymousClass0cQ.H(this, -1864545985, I2);
        AnonymousClass0cQ.H(this, 914590838, I);
    }
}
