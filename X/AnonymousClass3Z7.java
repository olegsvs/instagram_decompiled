package X;

import android.text.TextUtils;

/* renamed from: X.3Z7 */
public final class AnonymousClass3Z7 implements AnonymousClass2FA {
    /* renamed from: B */
    private final AnonymousClass0Cm f42282B;

    public final String getName() {
        return "CalculateImageHashing";
    }

    public AnonymousClass3Z7(AnonymousClass0Cm anonymousClass0Cm) {
        this.f42282B = anonymousClass0Cm;
    }

    /* renamed from: B */
    private boolean m20003B(AnonymousClass0OA anonymousClass0OA) {
        if (!((Boolean) AnonymousClass0CC.fX.H(this.f42282B)).booleanValue()) {
            return false;
        }
        if (anonymousClass0OA.gB != AnonymousClass0ON.PHOTO) {
            return false;
        }
        if (TextUtils.isEmpty(anonymousClass0OA.qB) || !TextUtils.isEmpty(anonymousClass0OA.rB)) {
            return false;
        }
        return true;
    }

    public final X.AnonymousClass2FC kVA(X.AnonymousClass2FE r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r2 = r2.f27997G;
        r0 = r1.m20003B(r2);
        if (r0 != 0) goto L_0x000b;
    L_0x0008:
        r0 = X.AnonymousClass2FC.SKIP;
        return r0;
    L_0x000b:
        r1 = new com.instagram.pdqhashing.PDQHashingBridge;	 Catch:{ Exception -> 0x001a }
        r0 = "pdqhashing";	 Catch:{ Exception -> 0x001a }
        r1.<init>(r0);	 Catch:{ Exception -> 0x001a }
        r0 = r2.qB;	 Catch:{ Exception -> 0x001a }
        r0 = r1.getHash(r0);	 Catch:{ Exception -> 0x001a }
        r2.rB = r0;	 Catch:{ Exception -> 0x001a }
    L_0x001a:
        r0 = X.AnonymousClass2FC.SUCCESS;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3Z7.kVA(X.2FE):X.2FC");
    }
}
