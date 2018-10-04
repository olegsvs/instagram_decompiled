package X;

import com.facebook.common.dextricks.DexStore;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Qx */
public final class AnonymousClass2Qx implements Runnable {
    /* renamed from: B */
    public Map f30383B;
    /* renamed from: C */
    public AnonymousClass2Qg f30384C;
    /* renamed from: D */
    public AnonymousClass2Qe f30385D;
    /* renamed from: E */
    public AnonymousClass1uZ f30386E;
    /* renamed from: F */
    public AnonymousClass1uS f30387F;
    /* renamed from: G */
    public AnonymousClass1uT f30388G;

    public AnonymousClass2Qx(AnonymousClass1uT anonymousClass1uT, AnonymousClass1uS anonymousClass1uS, Map map, AnonymousClass3ZJ anonymousClass3ZJ, AnonymousClass1uZ anonymousClass1uZ) {
        this.f30388G = anonymousClass1uT;
        this.f30387F = anonymousClass1uS;
        this.f30384C = new AnonymousClass2Qg(anonymousClass3ZJ);
        this.f30383B = map;
        this.f30386E = anonymousClass1uZ;
    }

    public final void run() {
        try {
            AnonymousClass1u4 anonymousClass1u4 = new AnonymousClass1u4(2, 100, 30000);
            Map hashMap = new HashMap();
            hashMap.put("X_FB_VIDEO_WATERFALL_ID", this.f30388G.f24008B);
            hashMap.putAll(this.f30383B);
            this.f30385D = this.f30384C.m15678A(new AnonymousClass1u8(new File(this.f30387F.f24005C), this.f30387F.f24004B), new AnonymousClass1u6(this.f30388G.f24012F, hashMap, anonymousClass1u4, new AnonymousClass1u1(false, DexStore.LOAD_RESULT_MIXED_MODE, "SHA256"), null, this.f30388G.f24011E, this.f30388G.f24013G, this.f30388G.f24010D), new AnonymousClass2Qw(this.f30387F, this.f30386E));
            this.f30384C.m15679B(this.f30385D);
        } catch (AnonymousClass1uU e) {
            this.f30386E.il(e);
        } catch (Throwable e2) {
            this.f30386E.il(new AnonymousClass1uU("Transfer Operation failed", e2));
        }
    }
}
