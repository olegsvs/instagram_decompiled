package X;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.model.explore.ExploreChainingItem;

/* renamed from: X.5ch */
public final class AnonymousClass5ch extends AnonymousClass5bn {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1MV f67386B;

    public AnonymousClass5ch(AnonymousClass1MV anonymousClass1MV) {
        this.f67386B = anonymousClass1MV;
    }

    /* renamed from: A */
    public final void mo6190A(AnonymousClass3JH anonymousClass3JH, int i, int i2) {
        Toast.makeText(this.f67386B.getActivity(), C0164R.string.hidden_live_toast, 0).show();
    }

    /* renamed from: B */
    public final void mo6187B(AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        Toast.makeText(this.f67386B.getActivity(), C0164R.string.hidden_media_toast, 0).show();
    }

    /* renamed from: C */
    public final void mo6191C(AnonymousClass3JH anonymousClass3JH, int i, int i2, RectF rectF) {
        AnonymousClass0EE anonymousClass0EE = this.f67386B;
        AnonymousClass4pE.m25152E(anonymousClass0EE, anonymousClass0EE.f17690Q, "explore_home_click", anonymousClass3JH.f40019B.f15174D, (AnonymousClass0Pm) anonymousClass3JH.f40019B.f15172B.get(0), i, i2, AnonymousClass1MV.B(this.f67386B));
        AnonymousClass1MV anonymousClass1MV = this.f67386B;
        AnonymousClass0MI I = AnonymousClass0Jd.f2931B.M(anonymousClass1MV.f17694U).I(anonymousClass3JH.f40019B);
        AnonymousClass1MV.C(anonymousClass1MV).E(I, -1, null, rectF, new AnonymousClass4pz(anonymousClass1MV, I), false, AnonymousClass0Qf.EXPLORE_LIVE);
    }

    /* renamed from: D */
    public final void mo6188D(AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        if (this.f67386B.isResumed()) {
            AnonymousClass0EE anonymousClass0EE = this.f67386B;
            AnonymousClass4pE.m25151D(anonymousClass0EE, anonymousClass0EE.f17690Q, "explore_home_click", anonymousClass0P7, false, i, i2, AnonymousClass1MV.B(this.f67386B));
            ExploreChainingItem exploreChainingItem = new ExploreChainingItem(anonymousClass0P7.getId(), anonymousClass0P7.TO().A(), anonymousClass0P7.MA().getId(), anonymousClass0P7.a());
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f67386B.getActivity());
            anonymousClass0IZ.f2754D = AnonymousClass0Ib.f2781B.B().A(exploreChainingItem, "topical_explore", this.f67386B.f17690Q, this.f67386B.f17684K, this.f67386B.f17692S);
            anonymousClass0IZ.f2757G = this.f67386B.f17686M;
            anonymousClass0IZ.B();
            if (((Boolean) AnonymousClass0E6.D(AnonymousClass0CC.ed, this.f67386B.f17694U)).booleanValue()) {
                this.f67386B.f17684K = true;
            }
        }
    }

    /* renamed from: E */
    public final boolean mo6189E(View view, MotionEvent motionEvent, AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        return this.f67386B.f17689P.A(view, motionEvent, anonymousClass0P7, (i * this.f67386B.f17683J.f21066B) + i2);
    }

    /* renamed from: F */
    public final void mo6192F(AnonymousClass3Jj anonymousClass3Jj, int i, int i2) {
        if (this.f67386B.isResumed()) {
            AnonymousClass0EE anonymousClass0EE = this.f67386B;
            AnonymousClass4pE.m25154G(anonymousClass0EE, anonymousClass0EE.f17690Q, "explore_home_click", anonymousClass3Jj, i, i2, AnonymousClass1MV.B(this.f67386B));
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f67386B.getActivity());
            anonymousClass0IZ.f2754D = AnonymousClass3Qs.f41179B.A().m25253A(anonymousClass3Jj.f40084B);
            anonymousClass0IZ.B();
        }
    }
}
