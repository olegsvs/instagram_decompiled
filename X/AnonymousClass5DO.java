package X;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: X.5DO */
public final class AnonymousClass5DO implements OnGlobalLayoutListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass153 f61272B;
    /* renamed from: C */
    public final /* synthetic */ int f61273C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Pj f61274D;

    public AnonymousClass5DO(AnonymousClass153 anonymousClass153, int i, AnonymousClass0Pj anonymousClass0Pj) {
        this.f61272B = anonymousClass153;
        this.f61273C = i;
        this.f61274D = anonymousClass0Pj;
    }

    public final void onGlobalLayout() {
        this.f61272B.f14164M.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.f61272B.f14164M.getWidth() > (this.f61272B.f14200w.getWidth() - this.f61272B.f14200w.getPaddingLeft()) - this.f61272B.f14159H.getWidth()) {
            int i = this.f61273C;
            if (i > 0) {
                AnonymousClass15R.J(this.f61272B, this.f61274D, i - 1);
            }
        }
    }
}
