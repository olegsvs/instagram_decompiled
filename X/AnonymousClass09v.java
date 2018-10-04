package X;

/* renamed from: X.09v */
public final class AnonymousClass09v implements AnonymousClass00M {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Dm f1137B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0DD f1138C;

    public final void Yf() {
    }

    public final void xq() {
    }

    public final void yq() {
    }

    public AnonymousClass09v(AnonymousClass0Dm anonymousClass0Dm, AnonymousClass0DD anonymousClass0DD) {
        this.f1137B = anonymousClass0Dm;
        this.f1138C = anonymousClass0DD;
    }

    public final void uk() {
        synchronized (this.f1137B.f1928G) {
            if (!this.f1137B.f1927F) {
                this.f1138C.BWA(AnonymousClass1I8.NO_ANR_DETECTED);
            }
        }
    }

    public final void vk(String str, String str2) {
        synchronized (this.f1137B.f1928G) {
            if (this.f1137B.f1927F) {
                if (str != null) {
                    AnonymousClass0DE.m1118K("anr_system_error_msg", str);
                }
                if (str2 != null) {
                    AnonymousClass0DE.m1118K("anr_system_tag", str2);
                }
            }
        }
    }
}
