package X;

import android.util.Pair;

/* renamed from: X.289 */
public final class AnonymousClass289 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ String f26479B;

    public AnonymousClass289(String str) {
        this.f26479B = str;
    }

    /* renamed from: A */
    public final void m14539A(AnonymousClass2Ek anonymousClass2Ek) {
        int I = AnonymousClass0cQ.I(this, 672848857);
        if (anonymousClass2Ek.f27920E) {
            String str = this.f26479B;
            AnonymousClass0LH.E(str);
            AnonymousClass0LH.E(anonymousClass2Ek);
            AnonymousClass28A.f26480B = new Pair(str, anonymousClass2Ek);
            AnonymousClass0cQ.H(this, 246709142, I);
            return;
        }
        AnonymousClass0cQ.H(this, -919970276, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1870850813);
        m14539A((AnonymousClass2Ek) obj);
        AnonymousClass0cQ.H(this, -1667908275, I);
    }
}
