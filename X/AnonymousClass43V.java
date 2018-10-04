package X;

import com.facebook.exoplayer.ipc.VpsCacheErrorEvent;

/* renamed from: X.43V */
public final class AnonymousClass43V implements AnonymousClass3uo {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2p3 f49069B;
    /* renamed from: C */
    private final AnonymousClass3uo f49070C;
    /* renamed from: D */
    private boolean f49071D;
    /* renamed from: E */
    private final AnonymousClass3tC f49072E;

    public AnonymousClass43V(AnonymousClass2p3 anonymousClass2p3, AnonymousClass3uo anonymousClass3uo, AnonymousClass3tC anonymousClass3tC) {
        this.f49069B = anonymousClass2p3;
        this.f49070C = anonymousClass3uo;
        this.f49072E = anonymousClass3tC;
    }

    public final void LBA(AnonymousClass2tW anonymousClass2tW, String str, long j, long j2) {
        this.f49070C.LBA(anonymousClass2tW, str, j, j2);
    }

    public final void sAA(AnonymousClass2tW anonymousClass2tW, AnonymousClass2tZ anonymousClass2tZ) {
        this.f49070C.sAA(anonymousClass2tW, anonymousClass2tZ);
    }

    public final void sk(String str, String str2, int i, int i2) {
        String str3 = str;
        str = str2;
        str2 = i;
        i = i2;
        this.f49070C.sk(str3, str, str2, i2);
        AnonymousClass3tC anonymousClass3tC = this.f49072E;
        if (anonymousClass3tC != null) {
            anonymousClass3tC.m21169A(AnonymousClass2l3.CACHE_ERROR, new VpsCacheErrorEvent(str3, AnonymousClass2p6.m17334C(str), str, str2, i));
        }
    }

    public final void tAA(AnonymousClass2tW anonymousClass2tW, AnonymousClass2tZ anonymousClass2tZ) {
        if (!(this.f49071D || this.f49069B.f34402L == null)) {
            this.f49069B.f34402L.logCacheEvictEvent(anonymousClass2tZ.f35457D, String.valueOf(anonymousClass2tZ.f35461H), String.valueOf(anonymousClass2tZ.f35459F), this.f49069B.f34398H, false);
        }
        this.f49070C.tAA(anonymousClass2tW, anonymousClass2tZ);
    }

    public final void uAA(AnonymousClass2tW anonymousClass2tW, AnonymousClass2tZ anonymousClass2tZ, AnonymousClass2tZ anonymousClass2tZ2) {
        this.f49071D = true;
        this.f49070C.uAA(anonymousClass2tW, anonymousClass2tZ, anonymousClass2tZ2);
        this.f49071D = false;
    }
}
