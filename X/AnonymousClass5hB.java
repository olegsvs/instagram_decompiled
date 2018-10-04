package X;

import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.5hB */
public final class AnonymousClass5hB implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6Cz f68188B;

    public AnonymousClass5hB(AnonymousClass6Cz anonymousClass6Cz) {
        this.f68188B = anonymousClass6Cz;
    }

    public final void run() {
        View view = this.f68188B.f72973B.f72936B;
        if (view != null) {
            AnonymousClass173 anonymousClass173 = new AnonymousClass173(this.f68188B.getActivity(), new AnonymousClass174(this.f68188B.getResources().getString(C0164R.string.instant_experiences_from_your_fb_profile)));
            anonymousClass173.f14642H = AnonymousClass177.ABOVE_ANCHOR;
            AnonymousClass173 B = anonymousClass173.B(0, this.f68188B.getResources().getDimensionPixelSize(C0164R.dimen.instant_experiences_tooltip_offset), true, view);
            B.f14648N = AnonymousClass178.f14657H;
            B.f14636B = true;
            B.A().C();
            this.f68188B.f72976E = true;
            AnonymousClass6Cq.m29461C().m29465A(this.f68188B.f72974C, AnonymousClass5dF.AUTOFILL_BAR_TOOLTIP_SHOWN);
        }
    }
}
