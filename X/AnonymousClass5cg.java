package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.model.explore.ExploreChainingItem;

/* renamed from: X.5cg */
public final class AnonymousClass5cg extends AnonymousClass5bn {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5XX f67385B;

    public AnonymousClass5cg(AnonymousClass5XX anonymousClass5XX) {
        this.f67385B = anonymousClass5XX;
    }

    /* renamed from: B */
    public final void mo6187B(AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        Toast.makeText(this.f67385B.getActivity(), C0164R.string.hidden_media_toast, 0).show();
    }

    /* renamed from: D */
    public final void mo6188D(AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        if (this.f67385B.isResumed()) {
            AnonymousClass0EE anonymousClass0EE = this.f67385B;
            AnonymousClass4pE.m25151D(anonymousClass0EE, anonymousClass0EE.f65904S, "explore_home_click", anonymousClass0P7, false, i, i2, null);
            if (((Boolean) AnonymousClass0CC.kd.H(this.f67385B.f65905T)).booleanValue()) {
                ExploreChainingItem exploreChainingItem = new ExploreChainingItem(anonymousClass0P7.getId(), anonymousClass0P7.TO().A(), anonymousClass0P7.MA().getId(), anonymousClass0P7.a());
                AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f67385B.getActivity());
                anonymousClass0IZ.f2754D = AnonymousClass0Ib.f2781B.B().A(exploreChainingItem, "explore", this.f67385B.f65904S, this.f67385B.f65894I, null);
                anonymousClass0IZ.B();
                if (((Boolean) AnonymousClass0E6.D(AnonymousClass0CC.ed, this.f67385B.f65905T)).booleanValue()) {
                    this.f67385B.f65894I = true;
                    return;
                }
                return;
            }
            this.f67385B.f65903R.E();
            this.f67385B.f65890E.A(anonymousClass0P7);
        }
    }

    /* renamed from: E */
    public final boolean mo6189E(View view, MotionEvent motionEvent, AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        return this.f67385B.f65898M.A(view, motionEvent, anonymousClass0P7, (i * this.f67385B.f65893H.f21066B) + i2);
    }
}
