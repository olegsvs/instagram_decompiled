package X;

import com.facebook.location.FbLocationOperationParams;
import com.facebook.location.ImmutableLocation;
import com.facebook.wifiscan.WifiScanConfig;

/* renamed from: X.1Fq */
public final class AnonymousClass1Fq {
    /* renamed from: N */
    public static final AnonymousClass47P f16126N = AnonymousClass47P.f50484C;
    /* renamed from: B */
    public AnonymousClass1Fm f16127B;
    /* renamed from: C */
    public final ImmutableLocation f16128C;
    /* renamed from: D */
    public final boolean f16129D;
    /* renamed from: E */
    public final boolean f16130E;
    /* renamed from: F */
    public final boolean f16131F;
    /* renamed from: G */
    public final boolean f16132G;
    /* renamed from: H */
    public final Boolean f16133H;
    /* renamed from: I */
    public FbLocationOperationParams f16134I;
    /* renamed from: J */
    public final String f16135J;
    /* renamed from: K */
    public final String f16136K;
    /* renamed from: L */
    public WifiScanConfig f16137L;
    /* renamed from: M */
    public AnonymousClass1jP f16138M;

    public AnonymousClass1Fq(AnonymousClass1Fl anonymousClass1Fl) {
        FbLocationOperationParams fbLocationOperationParams;
        AnonymousClass1jP anonymousClass1jP;
        WifiScanConfig wifiScanConfig;
        AnonymousClass1Fm anonymousClass1Fm;
        AnonymousClass1Fl anonymousClass1Fl2 = anonymousClass1Fl;
        this.f16131F = anonymousClass1Fl2.f16091G;
        if (anonymousClass1Fl2.f16088D == null) {
            AnonymousClass1Fn anonymousClass1Fn = new AnonymousClass1Fn(f16126N);
            anonymousClass1Fn.f16111E = 5000;
            anonymousClass1Fn.f16109C = Long.valueOf(30000);
            anonymousClass1Fn.f16110D = 100.0f;
            anonymousClass1Fn.f16116J = 10000;
            fbLocationOperationParams = new FbLocationOperationParams(anonymousClass1Fn);
        } else {
            fbLocationOperationParams = anonymousClass1Fl2.f16088D;
        }
        r1.f16134I = fbLocationOperationParams;
        r1.f16128C = anonymousClass1Fl2.f16087C;
        r1.f16132G = anonymousClass1Fl2.f16092H;
        if (anonymousClass1Fl2.f16097M == null) {
            anonymousClass1jP = new AnonymousClass1jP(10000, 30000);
        } else {
            anonymousClass1jP = anonymousClass1Fl2.f16097M;
        }
        r1.f16138M = anonymousClass1jP;
        if (anonymousClass1Fl2.f16096L == null) {
            wifiScanConfig = new WifiScanConfig(true, 600000, 1800000, -1, -1, -85, 10, 50);
        } else {
            wifiScanConfig = anonymousClass1Fl2.f16096L;
        }
        r1.f16137L = wifiScanConfig;
        r1.f16129D = anonymousClass1Fl2.f16089E;
        if (anonymousClass1Fl2.f16086B == null) {
            anonymousClass1Fm = new AnonymousClass1Fm(500, 50);
        } else {
            anonymousClass1Fm = anonymousClass1Fl2.f16086B;
        }
        r1.f16127B = anonymousClass1Fm;
        r1.f16130E = anonymousClass1Fl2.f16090F;
        r1.f16135J = anonymousClass1Fl2.f16094J;
        r1.f16136K = anonymousClass1Fl2.f16095K;
        r1.f16133H = anonymousClass1Fl2.f16093I;
    }
}
