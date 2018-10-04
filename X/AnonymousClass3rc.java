package X;

import android.text.TextUtils;
import java.io.File;

/* renamed from: X.3rc */
public abstract class AnonymousClass3rc implements AnonymousClass2hN {
    /* renamed from: G */
    private static final String f45438G = "ModelCacheAssetStorageAdapter";
    /* renamed from: B */
    private final AnonymousClass2hN f45439B;
    /* renamed from: C */
    private final AnonymousClass0G4 f45440C;
    /* renamed from: D */
    private final AnonymousClass3xT f45441D;
    /* renamed from: E */
    private volatile AnonymousClass2hA f45442E;
    /* renamed from: F */
    private final Object f45443F = new Object();

    /* renamed from: A */
    public abstract AnonymousClass2hA mo5428A(AnonymousClass3xW anonymousClass3xW);

    /* renamed from: B */
    public abstract String mo5116B(AnonymousClass2gu anonymousClass2gu);

    /* renamed from: D */
    public abstract int mo5117D();

    public AnonymousClass3rc(AnonymousClass2hN anonymousClass2hN, AnonymousClass0G4 anonymousClass0G4, AnonymousClass3xY anonymousClass3xY, AnonymousClass3xT anonymousClass3xT) {
        this.f45439B = anonymousClass2hN;
        this.f45440C = anonymousClass0G4;
        this.f45441D = anonymousClass3xT;
        m20953C();
    }

    /* renamed from: C */
    public final AnonymousClass2hA m20953C() {
        if (this.f45442E == null) {
            synchronized (this.f45443F) {
                if (this.f45442E == null) {
                    AnonymousClass3xW anonymousClass3xW = (AnonymousClass3xW) this.f45440C.get();
                    if (anonymousClass3xW != null) {
                        this.f45442E = mo5428A(anonymousClass3xW);
                        try {
                            this.f45442E.trimExceptVersion(mo5117D());
                        } catch (Throwable e) {
                            this.f45441D.m21716A(f45438G, "Failed to trim the cache", e, false);
                        }
                    }
                }
            }
        }
        return this.f45442E;
    }

    public final void VWA(AnonymousClass2gu anonymousClass2gu) {
        this.f45439B.VWA(anonymousClass2gu);
    }

    public final void WJA(AnonymousClass2gu anonymousClass2gu) {
        this.f45439B.WJA(anonymousClass2gu);
    }

    public final File XJ(AnonymousClass2gu anonymousClass2gu, AnonymousClass3rJ anonymousClass3rJ, boolean z) {
        if (z) {
            return anonymousClass2gu.m16908A() > 0 ? AnonymousClass2hO.m16932G(mo5116B(anonymousClass2gu)) : null;
        } else {
            return this.f45439B.XJ(anonymousClass2gu, anonymousClass3rJ, z);
        }
    }

    public final boolean hLA(File file, AnonymousClass2gu anonymousClass2gu, AnonymousClass3rJ anonymousClass3rJ, boolean z) {
        if (!z) {
            return this.f45439B.hLA(file, anonymousClass2gu, anonymousClass3rJ, z);
        }
        file = m20953C();
        if (file == null) {
            return false;
        }
        return file.addModelForVersionIfInCache(anonymousClass2gu.m16908A(), anonymousClass2gu.f32457C, anonymousClass2gu.f32459E);
    }

    public final long nK(AnonymousClass2h2 anonymousClass2h2) {
        return this.f45439B.nK(anonymousClass2h2);
    }

    public final boolean qW(AnonymousClass2gu anonymousClass2gu, boolean z) {
        if (z) {
            return anonymousClass2gu.m16908A() > 0 ? TextUtils.isEmpty(mo5116B(anonymousClass2gu)) ^ 1 : false;
        } else {
            return this.f45439B.qW(anonymousClass2gu, z);
        }
    }
}
