package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.View;
import android.view.Window;

/* renamed from: X.0e3 */
public final class AnonymousClass0e3 extends AnonymousClass0e4 implements Factory {
    /* renamed from: B */
    public final Activity f7573B;
    /* renamed from: C */
    private final AnonymousClass0c0 f7574C;
    /* renamed from: D */
    private final AnonymousClass0c6 f7575D;
    /* renamed from: E */
    private final LayoutInflater f7576E;

    /* renamed from: V */
    public final void mo1491V() {
    }

    public AnonymousClass0e3(Activity activity, AnonymousClass0c6 anonymousClass0c6, AnonymousClass0c0 anonymousClass0c0) {
        super(activity);
        this.f7573B = activity;
        this.f7575D = anonymousClass0c6;
        this.f7574C = anonymousClass0c0;
        LayoutInflater from = LayoutInflater.from(activity);
        this.f7576E = from;
        if (from.getFactory() == null) {
            this.f7576E.setFactory(this);
        }
    }

    /* renamed from: B */
    public final View mo1436B(int i) {
        return this.f7573B.findViewById(i);
    }

    /* renamed from: C */
    public final boolean mo1437C() {
        Window window = this.f7573B.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    /* renamed from: K */
    public final void mo1480K(AnonymousClass0IL anonymousClass0IL) {
        AnonymousClass0c6 anonymousClass0c6 = this.f7575D;
        anonymousClass0c6.f6987H.nd(this.f7574C, anonymousClass0IL);
    }

    /* renamed from: M */
    public final /* bridge */ /* synthetic */ Object mo1482M() {
        return this.f7573B;
    }

    /* renamed from: N */
    public final LayoutInflater mo1483N() {
        return this.f7576E;
    }

    /* renamed from: R */
    public final boolean mo1487R(AnonymousClass0IL anonymousClass0IL) {
        return this.f7573B.isFinishing() ^ 1;
    }

    /* renamed from: T */
    public final void mo1489T(AnonymousClass0IL anonymousClass0IL, Intent intent, int i, Bundle bundle) {
        this.f7575D.m5686H(anonymousClass0IL, intent, i, bundle);
    }
}
