package X;

import android.view.View;
import android.widget.ImageView;

/* renamed from: X.1ZX */
public final class AnonymousClass1ZX implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass15V f20233B;
    /* renamed from: C */
    public final /* synthetic */ ImageView f20234C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0ZF f20235D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Pj f20236E;

    public AnonymousClass1ZX(AnonymousClass15V anonymousClass15V, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass0ZF anonymousClass0ZF, ImageView imageView) {
        this.f20233B = anonymousClass15V;
        this.f20236E = anonymousClass0Pj;
        this.f20235D = anonymousClass0ZF;
        this.f20234C = imageView;
    }

    public final void run() {
        AnonymousClass15V anonymousClass15V = this.f20233B;
        AnonymousClass0Pj anonymousClass0Pj = this.f20236E;
        AnonymousClass0ZF anonymousClass0ZF = this.f20235D;
        View view = this.f20234C;
        if (view.getVisibility() == 0) {
            AnonymousClass1dZ.m12222E(view, anonymousClass0ZF, anonymousClass15V.f14304E.getWidth(), anonymousClass15V.f14304E.getHeight(), anonymousClass0Pj.m3854D(), true);
        }
    }
}
