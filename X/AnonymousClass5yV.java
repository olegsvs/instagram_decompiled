package X;

import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5yV */
public final class AnonymousClass5yV implements AnonymousClass0nn {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5yf f70512B;
    /* renamed from: C */
    public final /* synthetic */ boolean f70513C;
    /* renamed from: D */
    public final /* synthetic */ boolean f70514D;

    public final void Hr(AnonymousClass0fq anonymousClass0fq) {
    }

    public final void Ir() {
    }

    public final void Jr() {
    }

    public AnonymousClass5yV(AnonymousClass5yf anonymousClass5yf, boolean z, boolean z2) {
        this.f70512B = anonymousClass5yf;
        this.f70513C = z;
        this.f70514D = z2;
    }

    public final void Gr(AnonymousClass0Q6 anonymousClass0Q6) {
        AnonymousClass0rF.B(this.f70512B.f70524B, -2006106771);
        if (AnonymousClass5yf.m28694B(this.f70512B)) {
            Toast.makeText(this.f70512B.getActivity(), C0164R.string.could_not_refresh_feed, 0).show();
        }
        AnonymousClass5yf.m28697E(this.f70512B);
    }

    public final /* bridge */ /* synthetic */ void Kr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass41c anonymousClass41c = (AnonymousClass41c) anonymousClass0Pn;
        if (this.f70513C) {
            AnonymousClass5yf anonymousClass5yf = this.f70512B;
            boolean z = anonymousClass5yf.f70529G == AnonymousClass2Gi.COLLECTION_FEED && !this.f70512B.f70524B.dX() && anonymousClass41c.f48501D;
            anonymousClass5yf.f70531I = z;
            this.f70512B.f70524B.f42821K = this.f70512B.f70531I;
            AnonymousClass5yf.m28696D(this.f70512B, false);
            if (this.f70514D && anonymousClass41c.F() && AnonymousClass5yf.m28694B(this.f70512B)) {
                AnonymousClass1Se.B(this.f70512B.getContext(), anonymousClass41c.f42864B);
            }
            AnonymousClass3cx anonymousClass3cx = this.f70512B.f70524B;
            AnonymousClass3cw anonymousClass3cw = anonymousClass3cx.f42820J;
            anonymousClass3cw.f42809E.clear();
            anonymousClass3cw.f42808D.clear();
            anonymousClass3cw.f42806B.clear();
            anonymousClass3cx.f42818H.clear();
            anonymousClass3cx.f42814D.clear();
            if ((AnonymousClass0ew.B(this.f70512B.f70532J).D() > 0 ? 1 : null) != null) {
                AnonymousClass3cx anonymousClass3cx2 = this.f70512B.f70524B;
                AnonymousClass0el B = AnonymousClass0ew.B(this.f70512B.f70532J);
                List<AnonymousClass3dS> arrayList = new ArrayList();
                ArrayList E = B.E();
                int size = E.size();
                for (int i = 0; i < size; i++) {
                    AnonymousClass3gm anonymousClass3gm = (AnonymousClass3gm) E.get(i);
                    AnonymousClass0xE anonymousClass0xE = anonymousClass3gm.f43326G;
                    if (anonymousClass0xE == null) {
                        anonymousClass0xE = AnonymousClass0xE.MEDIA;
                    }
                    if (anonymousClass0xE == AnonymousClass0xE.MEDIA) {
                        Object A = AnonymousClass107.f13182C.A(anonymousClass3gm.f43325F);
                        if (A != null && B.S(A)) {
                            arrayList.add(new AnonymousClass3dS(A));
                        }
                    }
                }
                for (AnonymousClass3dS B2 : arrayList) {
                    anonymousClass3cx2.f42820J.B(B2);
                }
                AnonymousClass3cx.C(anonymousClass3cx2);
            }
        }
        if (!anonymousClass41c.f48499B.isEmpty()) {
            anonymousClass3cx = this.f70512B.f70524B;
            anonymousClass3cx.f42820J.A(anonymousClass41c.f48499B);
            AnonymousClass3cx.C(anonymousClass3cx);
        }
        if (!(this.f70512B.f70525C == null || this.f70512B.f70528F)) {
            this.f70512B.f70528F = true;
            SavedCollection savedCollection = this.f70512B.f70525C;
            AnonymousClass0xB.E(savedCollection.f12480B, savedCollection.f12481C, this.f70512B, null);
        }
        AnonymousClass3cx anonymousClass3cx3 = this.f70512B.f70524B;
        anonymousClass3cx3.f42815E = true;
        AnonymousClass3cx.C(anonymousClass3cx3);
        AnonymousClass5yf.m28697E(this.f70512B);
    }

    public final void Lr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass41c anonymousClass41c = (AnonymousClass41c) anonymousClass0Pn;
    }
}
