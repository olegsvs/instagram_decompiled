package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.4q1 */
public final class AnonymousClass4q1 implements AnonymousClass1MW {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1MV f57771B;

    public AnonymousClass4q1(AnonymousClass1MV anonymousClass1MV) {
        this.f57771B = anonymousClass1MV;
    }

    /* renamed from: A */
    public final void m25183A(View view, AnonymousClass1e0 anonymousClass1e0, int i, int i2) {
        if (this.f57771B.isResumed()) {
            AnonymousClass1e0 anonymousClass1e02 = anonymousClass1e0;
            AnonymousClass4n6 H = this.f57771B.f17675B.m27375H(anonymousClass1e0);
            H.f57274B++;
            AnonymousClass0db B = AnonymousClass1MV.B(this.f57771B);
            AnonymousClass0EE anonymousClass0EE = this.f57771B;
            AnonymousClass4pE.m25150C(anonymousClass0EE, anonymousClass0EE.f17690Q, "explore_home_click", anonymousClass1e02, i, i2, B);
            AnonymousClass4nD.m25079B(this.f57771B.f17695V, this.f57771B.getActivity(), anonymousClass1e02, this.f57771B.getModuleName(), AnonymousClass3Jr.EXPLORE, B, null, null, this.f57771B.f17686M);
        }
    }

    public final void XFA(View view, Object obj, int i, int i2) {
        if (obj instanceof AnonymousClass1e0) {
            m25183A(view, (AnonymousClass1e0) obj, i, i2);
        }
    }

    public final boolean Xf(View view, MotionEvent motionEvent, AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        return this.f57771B.f17689P.A(view, motionEvent, anonymousClass0P7, (i * this.f57771B.f17683J.f21066B) + i2);
    }
}
