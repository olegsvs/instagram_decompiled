package X;

import android.view.View;

/* renamed from: X.0wq */
public final class AnonymousClass0wq implements AnonymousClass0wM {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0we f12336B;

    public AnonymousClass0wq(AnonymousClass0we anonymousClass0we) {
        this.f12336B = anonymousClass0we;
    }

    public final void sWA(String str, Object obj, int i) {
        this.f12336B.f12310D.put(str, obj);
    }

    public final void tWA(String str, Object obj, int i) {
        this.f12336B.f12311E.put(str, obj);
    }

    public final void uWA(String str, Object obj, View view, double d) {
        AnonymousClass0js B = AnonymousClass0we.m8432B(this.f12336B, obj);
        if (B != null) {
            B.bc(obj, view, d);
        }
    }
}
