package X;

import android.content.Context;

/* renamed from: X.0Xr */
public abstract class AnonymousClass0Xr {
    /* renamed from: B */
    private final Context f6206B;
    /* renamed from: C */
    private final int f6207C;
    /* renamed from: D */
    private AnonymousClass1aI f6208D;

    /* renamed from: B */
    public abstract void mo2256B(int i, Class cls);

    /* renamed from: C */
    public abstract void mo2257C(AnonymousClass0Xt anonymousClass0Xt, Class cls);

    public AnonymousClass0Xr(Context context, int i) {
        this.f6206B = context;
        this.f6207C = i;
    }

    /* renamed from: A */
    public final void m5268A(int i) {
        mo2256B(i, m5266B(i));
    }

    /* renamed from: B */
    private Class m5266B(int i) {
        Class cls = (Class) m5267C().f20328D.get(i);
        if (cls != null) {
            return cls;
        }
        boolean z = m5267C().f20327C;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("jobId: ");
        stringBuilder.append(i);
        stringBuilder.append(" was not found. buildOutOfSync: ");
        stringBuilder.append(z);
        throw new RuntimeException(stringBuilder.toString());
    }

    /* renamed from: C */
    private synchronized AnonymousClass1aI m5267C() {
        if (this.f6208D == null) {
            this.f6208D = AnonymousClass1aI.m11915B(this.f6206B, this.f6207C);
        }
        return this.f6208D;
    }

    /* renamed from: D */
    public final void m5271D(AnonymousClass0Xt anonymousClass0Xt) {
        mo2257C(anonymousClass0Xt, m5266B(anonymousClass0Xt.f6220D));
    }
}
