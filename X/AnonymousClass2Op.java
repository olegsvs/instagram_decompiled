package X;

import android.animation.Animator;

/* renamed from: X.2Op */
public final class AnonymousClass2Op extends AnonymousClass1oZ {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1ob f29995B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0oo f29996C;
    /* renamed from: D */
    public final /* synthetic */ int f29997D;

    public AnonymousClass2Op(AnonymousClass1ob anonymousClass1ob, AnonymousClass0oo anonymousClass0oo, int i, int i2, float f, float f2, float f3, float f4, int i3, AnonymousClass0oo anonymousClass0oo2) {
        this.f29995B = anonymousClass1ob;
        this.f29997D = i3;
        this.f29996C = anonymousClass0oo2;
        super(anonymousClass0oo, i, i2, f, f2, f3, f4);
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.f22950G) {
            if (this.f29997D <= 0) {
                AnonymousClass1oW.m13276B(this.f29995B.f22974Q, this.f29996C);
            } else {
                this.f29995B.f22972O.add(this.f29996C.f10370B);
                this.f22949F = true;
                int i = this.f29997D;
                if (i > 0) {
                    AnonymousClass1ob anonymousClass1ob = this.f29995B;
                    anonymousClass1ob.f22974Q.post(new AnonymousClass1oS(anonymousClass1ob, this, i));
                }
            }
            if (this.f29995B.f22970M == this.f29996C.f10370B) {
                this.f29995B.m13308K(this.f29996C.f10370B);
            }
        }
    }
}
