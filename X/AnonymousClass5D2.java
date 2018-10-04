package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.common.graphics.IgBitmapReferenceFactory;
import java.util.HashMap;

/* renamed from: X.5D2 */
public final class AnonymousClass5D2 implements AnonymousClass0QD, AnonymousClass0RL, ComponentCallbacks2 {
    /* renamed from: B */
    public AnonymousClass5D1 f61218B;
    /* renamed from: C */
    public final HashMap f61219C = new HashMap();
    /* renamed from: D */
    private final double f61220D;
    /* renamed from: E */
    private final Context f61221E;
    /* renamed from: F */
    private final int f61222F;
    /* renamed from: G */
    private final int f61223G;
    /* renamed from: H */
    private final HashMap f61224H = new HashMap();
    /* renamed from: I */
    private final String f61225I;
    /* renamed from: J */
    private final AnonymousClass5Cx f61226J;
    /* renamed from: K */
    private final int f61227K;

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
    }

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    public final boolean GTA() {
        return false;
    }

    public final void JGA(AnonymousClass0Pj anonymousClass0Pj, AnonymousClass14b anonymousClass14b) {
    }

    public final void Kz(int i) {
    }

    public final boolean Lc() {
        return false;
    }

    public final void Lz(int i, int i2) {
    }

    public final int OR() {
        return 0;
    }

    public final boolean OY() {
        return false;
    }

    public final void Oz(int i, int i2) {
    }

    public final void Pz() {
    }

    public final void Rp(int i) {
    }

    public final void St() {
    }

    public final boolean ZCA() {
        return false;
    }

    public final boolean fCA() {
        return false;
    }

    public final void fFA() {
    }

    public final void gFA() {
    }

    public final void gi() {
    }

    public final void gx() {
    }

    public final void jFA() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void po(AnonymousClass0MI anonymousClass0MI) {
    }

    public final boolean xCA() {
        return false;
    }

    public final void xc(int i, int i2, Intent intent) {
    }

    public AnonymousClass5D2(Context context, AnonymousClass5Cx anonymousClass5Cx, String str) {
        this.f61221E = context;
        this.f61226J = anonymousClass5Cx;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(":ReelViewerBitmapReferenceManager");
        this.f61225I = stringBuilder.toString();
        this.f61227K = ((Integer) AnonymousClass0CC.jg.G()).intValue();
        this.f61220D = ((Double) AnonymousClass0CC.fg.G()).doubleValue();
        DisplayMetrics displayMetrics = this.f61221E.getResources().getDisplayMetrics();
        this.f61223G = (displayMetrics.heightPixels * displayMetrics.widthPixels) * 3;
        this.f61222F = ((Integer) AnonymousClass0CC.gg.G()).intValue();
    }

    /* renamed from: A */
    public final void m25990A(AnonymousClass14t anonymousClass14t) {
        if (anonymousClass14t == null) {
            return;
        }
        if (AnonymousClass5D2.m25988B()) {
            AnonymousClass5D1 anonymousClass5D1;
            if (this.f61220D > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED || this.f61222F > 0) {
                Runtime runtime = Runtime.getRuntime();
                long totalMemory = runtime.totalMemory() - runtime.freeMemory();
                long maxMemory = runtime.maxMemory();
                long j = maxMemory - totalMemory;
                long j2 = (long) (this.f61223G * this.f61222F);
                Object[] objArr = new Object[]{Float.valueOf(r10), Double.valueOf(this.f61220D), Integer.valueOf(this.f61222F), Float.valueOf(((float) j2) / 1048576.0f), Float.valueOf(((float) j) / 1048576.0f)};
                if (((double) (((float) j) / ((float) maxMemory))) >= this.f61220D) {
                    if (j < j2) {
                    }
                }
                this.f61224H.clear();
                this.f61219C.clear();
                anonymousClass5D1 = this.f61218B;
                if (anonymousClass5D1 != null) {
                    anonymousClass5D1.Jw();
                }
                return;
            }
            this.f61224H.clear();
            this.f61224H.putAll(this.f61219C);
            this.f61219C.clear();
            int H = this.f61226J.m25978H(anonymousClass14t);
            if (((Boolean) AnonymousClass0CC.ig.G()).booleanValue() && !AnonymousClass5D2.m25989C(this, H, -1)) {
                AnonymousClass5D2.m25989C(this, H - 1, 0);
            }
            AnonymousClass5D2.m25989C(this, H, 0);
            if (!AnonymousClass5D2.m25989C(this, H, 1)) {
                AnonymousClass5D2.m25989C(this, H + 1, 0);
            }
            this.f61224H.clear();
            anonymousClass5D1 = this.f61218B;
            if (anonymousClass5D1 == null) {
                return;
            }
            anonymousClass5D1.Jw();
        }
    }

    /* renamed from: B */
    public static boolean m25988B() {
        if (!AnonymousClass0aj.C()) {
            if (!IgBitmapReferenceFactory.isIgBitmapReferenceSupported()) {
                if (AnonymousClass0Gs.f2431j.f2443M.B().f6518B != AnonymousClass0Gr.JavaBitmapStrongReference) {
                    int i = VERSION.SDK_INT;
                    if ((i < 24 && i > 26) || ((Integer) AnonymousClass0CC.qO.G()).intValue() != 2) {
                        if (((Boolean) AnonymousClass0CC.hg.G()).booleanValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    private static boolean m25989C(AnonymousClass5D2 anonymousClass5D2, int i, int i2) {
        AnonymousClass14t D = anonymousClass5D2.f61226J.m25974D(i);
        if (D != null) {
            if (!D.N()) {
                int i3 = D.f14107L + i2;
                if (i3 >= 0) {
                    if (i3 < D.P()) {
                        AnonymousClass0Pj F = D.F(i3);
                        String S = F.S(anonymousClass5D2.f61221E);
                        if (S != null) {
                            anonymousClass5D2.f61219C.put(F.getId(), new AnonymousClass5D0());
                            AnonymousClass0RJ D2 = AnonymousClass0Gs.f2431j.D(S);
                            D2.f4647R = true;
                            D2.f4646Q = F;
                            D2 = D2.C(anonymousClass5D2);
                            D2.f4645P = anonymousClass5D2.f61225I;
                            D2.B();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void Di(AnonymousClass14b anonymousClass14b, AnonymousClass0Pj anonymousClass0Pj) {
        m25990A(this.f61226J.m25975E(anonymousClass0Pj.f4136H));
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        AnonymousClass0Pj anonymousClass0Pj = (AnonymousClass0Pj) anonymousClass0aa.f6576M;
        String id = anonymousClass0Pj.getId();
        if (this.f61219C.containsKey(id)) {
            ((AnonymousClass5D0) this.f61219C.get(id)).f61217B = bitmap;
            AnonymousClass5D1 anonymousClass5D1 = this.f61218B;
            if (anonymousClass5D1 != null) {
                anonymousClass5D1.Te(id, anonymousClass0Pj.q());
            }
        }
    }

    public final void onTrimMemory(int i) {
        if (i >= this.f61227K) {
            Integer.valueOf(i);
            this.f61219C.clear();
            this.f61224H.clear();
        }
    }
}
