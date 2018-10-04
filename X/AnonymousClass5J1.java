package X;

/* renamed from: X.5J1 */
public final class AnonymousClass5J1 implements AnonymousClass1Ar {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1MJ f61930B;

    public AnonymousClass5J1(AnonymousClass1MJ anonymousClass1MJ) {
        this.f61930B = anonymousClass1MJ;
    }

    public final void onPageScrollStateChanged(int i) {
        for (AnonymousClass1Ar onPageScrollStateChanged : this.f61930B.f17592C) {
            onPageScrollStateChanged.onPageScrollStateChanged(i);
        }
    }

    public final void onPageScrolled(int i, float f, int i2) {
        for (AnonymousClass1Ar onPageScrolled : this.f61930B.f17592C) {
            onPageScrolled.onPageScrolled(i, f, i2);
        }
    }

    public final void onPageSelected(int i) {
        for (AnonymousClass1Ar onPageSelected : this.f61930B.f17592C) {
            onPageSelected.onPageSelected(i);
        }
    }
}
