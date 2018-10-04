package X;

import android.app.Activity;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.63a */
public final class AnonymousClass63a implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass63b f71334B;
    /* renamed from: C */
    public final /* synthetic */ View f71335C;
    /* renamed from: D */
    public final /* synthetic */ View f71336D;

    public AnonymousClass63a(AnonymousClass63b anonymousClass63b, View view, View view2) {
        this.f71334B = anonymousClass63b;
        this.f71336D = view;
        this.f71335C = view2;
    }

    public final void run() {
        if (this.f71334B.f71337B == null) {
            AnonymousClass63b anonymousClass63b = this.f71334B;
            AnonymousClass173 C = new AnonymousClass173((Activity) this.f71336D.getContext(), new AnonymousClass174(this.f71336D.getContext().getResources().getString(C0164R.string.tag_products_tooltip))).C(this.f71335C);
            C.f14642H = AnonymousClass177.ABOVE_ANCHOR;
            C.f14646L = true;
            C.f14636B = true;
            C.f14640F = new AnonymousClass63Z(this);
            anonymousClass63b.f71337B = C.A();
        }
        this.f71334B.f71337B.C();
    }
}
