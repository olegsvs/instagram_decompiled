package X;

import android.content.Context;

/* renamed from: X.11N */
public abstract class AnonymousClass11N extends AnonymousClass11O {
    /* renamed from: B */
    private Object f13397B;

    public AnonymousClass11N(Context context) {
        super(context);
        if (this.f7442I) {
            mo2046D();
        } else {
            this.f7436C = true;
        }
    }

    /* renamed from: A */
    public final void mo2041A(Object obj) {
        this.f13397B = obj;
        if (this.f7442I) {
            super.mo2041A(obj);
        }
    }

    /* renamed from: E */
    public final void mo2042E() {
        super.mo2042E();
        this.f13397B = null;
    }

    /* renamed from: F */
    public final void mo2043F() {
        super.mo2043F();
        Object obj = this.f13397B;
        if (obj != null) {
            mo2041A(obj);
            return;
        }
        boolean z = this.f7436C;
        this.f7436C = false;
        this.f7440G |= z;
        if (z) {
            mo2046D();
        }
    }
}
