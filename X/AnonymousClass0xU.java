package X;

import android.os.SystemClock;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0xU */
public final class AnonymousClass0xU {
    /* renamed from: b */
    public static final AnonymousClass0xU f12560b = new AnonymousClass0xU();
    /* renamed from: B */
    public final AtomicLong f12561B = new AtomicLong(-1);
    /* renamed from: C */
    public final AtomicLong f12562C = new AtomicLong(-1);
    /* renamed from: D */
    public final AtomicLong f12563D = new AtomicLong(-1);
    /* renamed from: E */
    public final AtomicLong f12564E = new AtomicLong(-1);
    /* renamed from: F */
    public final AtomicLong f12565F = new AtomicLong(-1);
    /* renamed from: G */
    public final AtomicLong f12566G = new AtomicLong(-1);
    /* renamed from: H */
    public final AtomicLong f12567H = new AtomicLong(-1);
    /* renamed from: I */
    public final AtomicLong f12568I = new AtomicLong(-1);
    /* renamed from: J */
    public final AtomicLong f12569J = new AtomicLong(-1);
    /* renamed from: K */
    public final AtomicLong f12570K = new AtomicLong(-1);
    /* renamed from: L */
    public final AtomicLong f12571L = new AtomicLong(-1);
    /* renamed from: M */
    public final AtomicLong f12572M = new AtomicLong(-1);
    /* renamed from: N */
    public final AtomicLong f12573N = new AtomicLong(-1);
    /* renamed from: O */
    public final AtomicLong f12574O = new AtomicLong(-1);
    /* renamed from: P */
    public final AtomicLong f12575P = new AtomicLong(-1);
    /* renamed from: Q */
    public final AtomicLong f12576Q = new AtomicLong(-1);
    /* renamed from: R */
    public final AtomicLong f12577R = new AtomicLong(-1);
    /* renamed from: S */
    public final AtomicLong f12578S = new AtomicLong(-1);
    /* renamed from: T */
    public final AtomicInteger f12579T = new AtomicInteger(-1);
    /* renamed from: U */
    public final AtomicInteger f12580U = new AtomicInteger(-1);
    /* renamed from: V */
    private AnonymousClass0xW f12581V;
    /* renamed from: W */
    private final AtomicLong f12582W = new AtomicLong(-1);
    /* renamed from: X */
    private final AtomicLong f12583X = new AtomicLong(-1);
    /* renamed from: Y */
    private AnonymousClass0xV f12584Y;
    /* renamed from: Z */
    private final AtomicLong f12585Z = new AtomicLong(-1);
    /* renamed from: a */
    private String f12586a;

    /* renamed from: A */
    public final synchronized boolean m8552A() {
        return this.f12584Y != null;
    }

    /* renamed from: B */
    private static long m8549B(AtomicLong atomicLong, AtomicLong atomicLong2) {
        return (atomicLong.get() == -1 || atomicLong2.get() == -1) ? 0 : atomicLong2.get() - atomicLong.get();
    }

    /* renamed from: B */
    public final synchronized void m8553B() {
        if (m8552A() && m8551D()) {
            String str = JsonProperty.USE_DEFAULT_NAME;
            String str2 = JsonProperty.USE_DEFAULT_NAME;
            long B = AnonymousClass0xU.m8549B(this.f12562C, this.f12561B);
            if (this.f12584Y == AnonymousClass0xV.ReactNative) {
                str = B == 0 ? "warm" : "cold";
                if (this.f12581V != null) {
                    str2 = this.f12581V.f12593B;
                }
            }
            AnonymousClass0NN C = AnonymousClass0NN.m3291B("ig_react_native_view", null).m3298F("view", this.f12586a).m3298F("tag", this.f12584Y.f12590B).m3298F("config", str2).m3295C("plugin_init_time", AnonymousClass0xU.m8549B(this.f12583X, this.f12582W)).m3295C("bridge_init_time", B).m3298F("bridge_init_state", str).m3295C("time_to_js", AnonymousClass0xU.m8549B(this.f12585Z, this.f12575P)).m3295C("js_app_require_time", Math.max(this.f12567H.get(), 0)).m3295C("js_time", Math.max(this.f12568I.get(), 0)).m3295C("idle_time", Math.max(this.f12566G.get(), 0)).m3295C("tti_time", AnonymousClass0xU.m8549B(this.f12585Z, this.f12574O)).m3295C("time_to_unpacker_check", AnonymousClass0xU.m8549B(this.f12585Z, this.f12577R)).m3295C("unpacker_check_time", AnonymousClass0xU.m8549B(this.f12577R, this.f12576Q)).m3295C("unpacking_time", AnonymousClass0xU.m8549B(this.f12577R, this.f12578S)).m3295C("run_js_bundle_time", AnonymousClass0xU.m8549B(this.f12573N, this.f12572M)).m3295C("create_ui_manager_module_time", AnonymousClass0xU.m8549B(this.f12564E, this.f12563D)).m3295C("jsc_block_size", Math.max(this.f12569J.get(), 0)).m3295C("jsc_malloc_size", Math.max(this.f12570K.get(), 0)).m3295C("jsc_object_size", Math.max(this.f12571L.get(), 0)).m3295C("fetch_relay_query", Math.max(this.f12565F.get(), 0));
            if (this.f12579T.get() != -1) {
                C.m3294B("used_relay_modern", this.f12579T.get());
            }
            if (this.f12580U.get() != -1) {
                C.m3294B("used_relay_prefetcher", this.f12580U.get());
            }
            if (this.f12584Y == AnonymousClass0xV.ReactNative) {
                C.m3294B("ota", AnonymousClass0Il.getInstance().getReactInstanceHolder().f2827C == AnonymousClass1Ps.OTA ? 1 : 0);
            }
            if (AnonymousClass0Dc.m1247J(3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Name: ");
                stringBuilder.append(C.f3556F);
                stringBuilder.append("; ModuleName: ");
                stringBuilder.append(C.f3555E);
                stringBuilder.append("; Extra: ");
                stringBuilder.append(C.f3552B.toString());
                AnonymousClass0Dc.m1253P("AnalyticsEvent", stringBuilder.toString());
            }
            C.m3310R();
            m8550C();
        }
    }

    /* renamed from: C */
    private void m8550C() {
        this.f12584Y = null;
        this.f12581V = null;
        this.f12585Z.set(-1);
        this.f12583X.set(-1);
        this.f12582W.set(-1);
        this.f12562C.set(-1);
        this.f12561B.set(-1);
        this.f12574O.set(-1);
        this.f12567H.set(-1);
        this.f12575P.set(-1);
        this.f12568I.set(-1);
        this.f12566G.set(-1);
        this.f12577R.set(-1);
        this.f12576Q.set(-1);
        this.f12578S.set(-1);
        this.f12573N.set(-1);
        this.f12572M.set(-1);
        this.f12564E.set(-1);
        this.f12563D.set(-1);
        this.f12569J.set(-1);
        this.f12570K.set(-1);
        this.f12571L.set(-1);
        this.f12565F.set(-1);
        this.f12579T.set(-1);
        this.f12580U.set(-1);
    }

    /* renamed from: C */
    public final synchronized void m8554C(AnonymousClass0xV anonymousClass0xV, String str, AnonymousClass0xW anonymousClass0xW) {
        m8550C();
        this.f12584Y = anonymousClass0xV;
        this.f12586a = str;
        this.f12581V = anonymousClass0xW;
        this.f12585Z.set(SystemClock.uptimeMillis());
    }

    /* renamed from: D */
    private boolean m8551D() {
        if (this.f12584Y.equals(AnonymousClass0xV.ReactNative)) {
            if (this.f12574O.get() > -1 && this.f12568I.get() > -1 && this.f12566G.get() > -1) {
                return true;
            }
        } else if (this.f12574O.get() > -1) {
            return true;
        }
        return false;
    }
}
