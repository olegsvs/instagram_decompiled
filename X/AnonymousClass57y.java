package X;

import android.app.Activity;
import android.net.Uri;

/* renamed from: X.57y */
public final class AnonymousClass57y extends AnonymousClass3TL {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass584 f60391B;

    public AnonymousClass57y(AnonymousClass584 anonymousClass584, Activity activity, AnonymousClass2Na anonymousClass2Na, AnonymousClass0EE anonymousClass0EE, AnonymousClass3TK anonymousClass3TK, String str, AnonymousClass2Ds anonymousClass2Ds, Uri uri) {
        this.f60391B = anonymousClass584;
        super(activity, anonymousClass2Na, anonymousClass0EE, anonymousClass3TK, str, anonymousClass2Ds, uri);
    }

    /* renamed from: C */
    public final void m25805C(AnonymousClass2aG anonymousClass2aG) {
        int I = AnonymousClass0cQ.I(this, 1714282709);
        super.C(anonymousClass2aG);
        AnonymousClass0cQ.H(this, -1680875852, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1231156852);
        super.onFinish();
        this.f60391B.f60406K.B();
        AnonymousClass0cQ.H(this, 92798605, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -91482114);
        super.onStart();
        this.f60391B.f60406K.C();
        AnonymousClass0cQ.H(this, 1132085589, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1493713128);
        m25805C((AnonymousClass2aG) obj);
        AnonymousClass0cQ.H(this, 992499451, I);
    }
}
