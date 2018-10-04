package X;

/* renamed from: X.42u */
public final class AnonymousClass42u implements AnonymousClass3oX {
    /* renamed from: B */
    public int f48902B;
    /* renamed from: C */
    private AnonymousClass3oX[] f48903C;

    public AnonymousClass42u(AnonymousClass3oX[] anonymousClass3oXArr) {
        this.f48903C = anonymousClass3oXArr;
    }

    /* renamed from: A */
    public final boolean m22294A(AnonymousClass3oX anonymousClass3oX) {
        return this.f48903C[this.f48902B] == anonymousClass3oX;
    }

    public final void QLA(int i, int i2) {
        int i3 = 0;
        while (true) {
            AnonymousClass3oX[] anonymousClass3oXArr = this.f48903C;
            if (i3 < anonymousClass3oXArr.length) {
                anonymousClass3oXArr[i3].QLA(i, i2);
                i3++;
            } else {
                return;
            }
        }
    }

    public final void iH() {
        int i = 0;
        while (true) {
            AnonymousClass3oX[] anonymousClass3oXArr = this.f48903C;
            if (i < anonymousClass3oXArr.length) {
                anonymousClass3oXArr[i].iH();
                i++;
            } else {
                return;
            }
        }
    }

    public final void tV(int i, int i2) {
        int i3 = 0;
        while (true) {
            AnonymousClass3oX[] anonymousClass3oXArr = this.f48903C;
            if (i3 < anonymousClass3oXArr.length) {
                anonymousClass3oXArr[i3].tV(i, i2);
                i3++;
            } else {
                return;
            }
        }
    }

    public final void zJA(AnonymousClass2Vi anonymousClass2Vi) {
        this.f48903C[this.f48902B].zJA(anonymousClass2Vi);
    }
}
