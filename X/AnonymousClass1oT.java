package X;

/* renamed from: X.1oT */
public final class AnonymousClass1oT implements AnonymousClass12t {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1ob f22938B;

    public AnonymousClass1oT(AnonymousClass1ob anonymousClass1ob) {
        this.f22938B = anonymousClass1ob;
    }

    public final int Pn(int i, int i2) {
        if (this.f22938B.f22970M != null) {
            int i3 = this.f22938B.f22971N;
            if (i3 == -1) {
                i3 = this.f22938B.f22974Q.indexOfChild(this.f22938B.f22970M);
                this.f22938B.f22971N = i3;
            }
            if (i2 == i - 1) {
                return i3;
            }
            if (i2 >= i3) {
                i2++;
            }
        }
        return i2;
    }
}
