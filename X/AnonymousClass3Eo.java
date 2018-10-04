package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.creation.capture.quickcapture.faceeffectui.FaceEffectOutlineView;

/* renamed from: X.3Eo */
public final class AnonymousClass3Eo implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1U9 f39361B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass36h f39362C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass3Es f39363D;

    public AnonymousClass3Eo(AnonymousClass1U9 anonymousClass1U9, AnonymousClass3Es anonymousClass3Es, AnonymousClass36h anonymousClass36h) {
        this.f39361B = anonymousClass1U9;
        this.f39363D = anonymousClass3Es;
        this.f39362C = anonymousClass36h;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 528552458);
        int E = this.f39363D.E();
        int i = this.f39361B.f39350H;
        AnonymousClass3Ei anonymousClass3Ei = this.f39361B;
        anonymousClass3Ei.f39350H = E;
        anonymousClass3Ei.f39346D.nc(this.f39362C, E);
        if (!(this.f39362C.m18538D() || E == 0)) {
            this.f39362C.f37887Q = true;
            if (!this.f39361B.f19055C) {
                FaceEffectOutlineView faceEffectOutlineView = this.f39363D.f39370D;
                if (!faceEffectOutlineView.f39374B.isRunning()) {
                    faceEffectOutlineView.f39374B.start();
                }
            }
            this.f39361B.f39346D.Nk();
        }
        if (this.f39363D.f39371E.getVisibility() == 0) {
            this.f39363D.m19081V(true);
        }
        this.f39361B.C(i);
        this.f39361B.C(E);
        AnonymousClass0cQ.L(this, -1406607845, M);
    }
}
