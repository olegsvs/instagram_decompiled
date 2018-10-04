package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.0mH */
public final class AnonymousClass0mH implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ Rect f9748B;
    /* renamed from: C */
    public final /* synthetic */ View f9749C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0IL f9750D;
    /* renamed from: E */
    public final /* synthetic */ boolean f9751E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0O7 f9752F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass0IL f9753G;

    public AnonymousClass0mH(AnonymousClass0IL anonymousClass0IL, AnonymousClass0IL anonymousClass0IL2, boolean z, AnonymousClass0O7 anonymousClass0O7, View view, Rect rect) {
        this.f9750D = anonymousClass0IL;
        this.f9753G = anonymousClass0IL2;
        this.f9751E = z;
        this.f9752F = anonymousClass0O7;
        this.f9749C = view;
        this.f9748B = rect;
    }

    public final void run() {
        AnonymousClass0mA.m7477D(this.f9750D, this.f9753G, this.f9751E, this.f9752F, false);
        View view = this.f9749C;
        if (view != null) {
            AnonymousClass0mD.m7500G(view, this.f9748B);
        }
    }
}
