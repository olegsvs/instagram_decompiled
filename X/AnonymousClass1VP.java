package X;

import android.view.MotionEvent;

/* renamed from: X.1VP */
public final class AnonymousClass1VP extends AnonymousClass1AL implements AnonymousClass0jh {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3LK f19349B;

    public final boolean Uy(AnonymousClass0vl anonymousClass0vl) {
        return true;
    }

    public AnonymousClass1VP(AnonymousClass3LK anonymousClass3LK) {
        this.f19349B = anonymousClass3LK;
    }

    /* renamed from: B */
    public final void mo2186B(MotionEvent motionEvent) {
        this.f19349B.f40298B.SAA(this.f19349B.f40302F, this.f19349B.f40304H, this.f19349B.f40303G, this.f19349B.f40300D);
    }

    public final boolean ay(AnonymousClass0vl anonymousClass0vl) {
        this.f19349B.f40304H.m7464Q(true);
        this.f19349B.f40298B.sg(anonymousClass0vl, this.f19349B.f40302F, this.f19349B.f40304H, this.f19349B.f40303G, this.f19349B.f40300D);
        return true;
    }

    public final void dy(AnonymousClass0vl anonymousClass0vl) {
        this.f19349B.f40304H.m7464Q(false);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.f19349B.f40298B.yi(this.f19349B.f40302F, this.f19349B.f40304H, this.f19349B.f40303G, this.f19349B.f40300D);
        return true;
    }
}
