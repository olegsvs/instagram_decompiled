package X;

import com.facebook.cameracore.assets.model.ARRequestAsset;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2ga */
public final class AnonymousClass2ga {
    /* renamed from: G */
    private static final AtomicInteger f32405G = new AtomicInteger(0);
    /* renamed from: B */
    public final int f32406B;
    /* renamed from: C */
    public boolean f32407C;
    /* renamed from: D */
    public final ARRequestAsset f32408D;
    /* renamed from: E */
    public AnonymousClass2gZ f32409E = AnonymousClass2gZ.NOT_STARTED;
    /* renamed from: F */
    public final AnonymousClass3rI f32410F;

    public AnonymousClass2ga(boolean z, ARRequestAsset aRRequestAsset, AnonymousClass2ge anonymousClass2ge, AnonymousClass3rI anonymousClass3rI) {
        this.f32407C = z;
        this.f32408D = aRRequestAsset;
        this.f32410F = anonymousClass3rI;
        this.f32406B = f32405G.incrementAndGet();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final void m16880A(X.AnonymousClass2gZ r3) {
        /*
        r2 = this;
        r0 = X.AnonymousClass2gZ.NOT_STARTED;
        if (r3 == r0) goto L_0x006d;
    L_0x0004:
        r0 = r2.f32409E;
        if (r3 == r0) goto L_0x0056;
    L_0x0008:
        r0 = r2.f32409E;
        r0 = r0.ordinal();
        switch(r0) {
            case 0: goto L_0x004b;
            case 1: goto L_0x0053;
            case 2: goto L_0x0040;
            case 3: goto L_0x0029;
            case 4: goto L_0x0012;
            default: goto L_0x0011;
        };
    L_0x0011:
        goto L_0x0053;
    L_0x0012:
        r2 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Already cancelled, cannot change to ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x0029:
        r2 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Already finished, cannot change to ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x0040:
        r0 = X.AnonymousClass2gZ.FINISHED;
        if (r3 == r0) goto L_0x0045;
    L_0x0044:
        goto L_0x0053;
    L_0x0045:
        r0 = new java.lang.IllegalArgumentException;
        r0.<init>();
        throw r0;
    L_0x004b:
        r0 = X.AnonymousClass2gZ.FINISHED;
        if (r3 == r0) goto L_0x0045;
    L_0x004f:
        r0 = X.AnonymousClass2gZ.PAUSED;
        if (r3 == r0) goto L_0x0045;
    L_0x0053:
        r2.f32409E = r3;
        return;
    L_0x0056:
        r2 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Already in state: ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x006d:
        r1 = new java.lang.IllegalArgumentException;
        r0 = "Cannot set to NOT_STARTED";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2ga.A(X.2gZ):void");
    }
}
