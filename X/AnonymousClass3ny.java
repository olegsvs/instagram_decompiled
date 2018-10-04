package X;

/* renamed from: X.3ny */
public final class AnonymousClass3ny implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3nz f44661B;

    public AnonymousClass3ny(AnonymousClass3nz anonymousClass3nz) {
        this.f44661B = anonymousClass3nz;
    }

    public final void run() {
        int B = this.f44661B.f44664D.getAdapter().B();
        int i = 0;
        if (B > 0) {
            i = ((B - 1) * this.f44661B.f44665E) + ((this.f44661B.f44666F * B) + 0);
        }
        float max = Math.max(Math.min((((float) (this.f44661B.f44664D.getWidth() - i)) / 2.0f) - ((float) this.f44661B.f44664D.getPaddingStart()), (float) (((this.f44661B.f44664D.getWidth() - this.f44661B.f44664D.getPaddingEnd()) - i) - this.f44661B.f44664D.getPaddingStart())), 0.0f);
        if (this.f44661B.f44662B) {
            max = -max;
        }
        if (this.f44661B.f44663C == 0) {
            this.f44661B.f44664D.animate().cancel();
            this.f44661B.f44664D.setTranslationX(max);
        } else {
            this.f44661B.f44664D.animate().setDuration(this.f44661B.f44664D.getItemAnimator().f13323B).translationX(max);
        }
        this.f44661B.f44663C = B;
    }
}
