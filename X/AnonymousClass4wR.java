package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import com.instagram.igtv.viewer.IGTVViewerFragment;

/* renamed from: X.4wR */
public final class AnonymousClass4wR implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4wT f58655B;
    /* renamed from: C */
    public final /* synthetic */ OnDismissListener f58656C;
    /* renamed from: D */
    public final /* synthetic */ IGTVViewerFragment f58657D;

    public AnonymousClass4wR(AnonymousClass4wT anonymousClass4wT, IGTVViewerFragment iGTVViewerFragment, OnDismissListener onDismissListener) {
        this.f58655B = anonymousClass4wT;
        this.f58657D = iGTVViewerFragment;
        this.f58656C = onDismissListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IGTVViewerFragment.m27464L(this.f58657D);
        AnonymousClass0P7 G = this.f58655B.f58662C.G();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f58655B.f58670K);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = AnonymousClass0IE.E("media/%s/delete/?media_type=%s", new Object[]{G.getId(), G.TO()});
        AnonymousClass0GA H = anonymousClass0Pt.D("media_id", G.NO()).M(AnonymousClass0Pv.class).N().H();
        H.f2849B = new AnonymousClass4wS(this.f58655B, this.f58656C);
        AnonymousClass0Px.B(this.f58655B.f58661B, this.f58655B.f58666G, H);
    }
}
