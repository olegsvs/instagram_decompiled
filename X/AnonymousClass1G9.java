package X;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.location.ImmutableLocation;
import com.facebook.location.signalpackage.LocationSignalPackage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1G9 */
public final class AnonymousClass1G9 implements AnonymousClass0EJ, AnonymousClass0G2 {
    /* renamed from: B */
    private final Context f16204B;
    /* renamed from: C */
    private final String f16205C;
    /* renamed from: D */
    private final AnonymousClass1Fx f16206D;
    /* renamed from: E */
    private final AnonymousClass1Fy f16207E;
    /* renamed from: F */
    private final Handler f16208F = new Handler(Looper.getMainLooper());
    /* renamed from: G */
    private ImmutableLocation f16209G;
    /* renamed from: H */
    private long f16210H;
    /* renamed from: I */
    private final AnonymousClass1G1 f16211I = new AnonymousClass1I5(this);
    /* renamed from: J */
    private final AnonymousClass1i2 f16212J;
    /* renamed from: K */
    private final AnonymousClass1Fh f16213K;
    /* renamed from: L */
    private final float f16214L;
    /* renamed from: M */
    private final long f16215M;
    /* renamed from: N */
    private boolean f16216N;
    /* renamed from: O */
    private final long f16217O;
    /* renamed from: P */
    private final Runnable f16218P = new AnonymousClass1i1(this);
    /* renamed from: Q */
    private AnonymousClass0Cm f16219Q;

    public AnonymousClass1G9(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        this.f16204B = context;
        this.f16219Q = anonymousClass0Cm;
        AnonymousClass1Fh B = AnonymousClass1Fh.m10366B(context);
        this.f16213K = B;
        this.f16206D = B.m10373F();
        this.f16205C = AnonymousClass0Dt.f1941C.m1312A(context);
        boolean booleanValue = ((Boolean) AnonymousClass0CC.WM.m846H(anonymousClass0Cm)).booleanValue();
        this.f16214L = (float) ((Integer) AnonymousClass0CC.XM.m846H(anonymousClass0Cm)).intValue();
        this.f16215M = (long) ((Integer) AnonymousClass0CC.ZM.m846H(anonymousClass0Cm)).intValue();
        this.f16217O = (long) ((Integer) AnonymousClass0CC.aM.m846H(anonymousClass0Cm)).intValue();
        this.f16212J = new AnonymousClass1i2(((Integer) AnonymousClass0CC.YM.m846H(anonymousClass0Cm)).intValue());
        AnonymousClass1Fz anonymousClass1Fz = new AnonymousClass1Fz(booleanValue ? AnonymousClass47P.f50485D : AnonymousClass47P.f50484C);
        anonymousClass1Fz.f16174G = this.f16215M * 1000;
        this.f16207E = new AnonymousClass1Fy(anonymousClass1Fz);
    }

    /* renamed from: B */
    public static void m10427B(AnonymousClass1G9 anonymousClass1G9, boolean z, LocationSignalPackage locationSignalPackage) {
        anonymousClass1G9.f16212J.add(locationSignalPackage);
        if (z) {
            AnonymousClass1G9.m10430E(anonymousClass1G9);
        } else {
            anonymousClass1G9.m10431F();
        }
    }

    /* renamed from: C */
    public static void m10428C(AnonymousClass1G9 anonymousClass1G9, ImmutableLocation immutableLocation) {
        boolean z;
        ImmutableLocation immutableLocation2 = anonymousClass1G9.f16209G;
        if (immutableLocation2 != null) {
            float[] fArr = new float[1];
            Location.distanceBetween(immutableLocation2.m10413F(), immutableLocation2.m10420G(), immutableLocation.m10413F(), immutableLocation.m10420G(), fArr);
            float f = fArr[0];
            Float D = immutableLocation.m10417D(anonymousClass1G9.f16209G);
            if (f >= anonymousClass1G9.f16214L) {
                z = true;
                anonymousClass1G9.f16209G = immutableLocation;
                if (((Boolean) AnonymousClass0CC.uc.m846H(anonymousClass1G9.f16219Q)).booleanValue()) {
                    AnonymousClass47e anonymousClass47e = new AnonymousClass47e();
                    anonymousClass47e.f50527L = immutableLocation;
                    AnonymousClass1G9.m10427B(anonymousClass1G9, z, anonymousClass47e.A());
                    return;
                }
                AnonymousClass1Fk G = anonymousClass1G9.f16213K.m10374G();
                AnonymousClass1Fl anonymousClass1Fl = new AnonymousClass1Fl();
                anonymousClass1Fl.f16089E = true;
                anonymousClass1Fl.f16092H = true;
                anonymousClass1Fl.f16090F = false;
                anonymousClass1Fl.f16091G = false;
                anonymousClass1Fl.f16087C = immutableLocation;
                G.m10376C(new AnonymousClass1Fq(anonymousClass1Fl), "ForegroundLocation");
                AnonymousClass1Ft.m10389B(G, new AnonymousClass1i5(anonymousClass1G9, z, immutableLocation), anonymousClass1G9.f16213K.m10371D());
            } else if (D != null && D.floatValue() <= ((float) (anonymousClass1G9.f16215M * 1000))) {
                return;
            }
        }
        z = false;
        anonymousClass1G9.f16209G = immutableLocation;
        if (((Boolean) AnonymousClass0CC.uc.m846H(anonymousClass1G9.f16219Q)).booleanValue()) {
            AnonymousClass47e anonymousClass47e2 = new AnonymousClass47e();
            anonymousClass47e2.f50527L = immutableLocation;
            AnonymousClass1G9.m10427B(anonymousClass1G9, z, anonymousClass47e2.A());
            return;
        }
        AnonymousClass1Fk G2 = anonymousClass1G9.f16213K.m10374G();
        AnonymousClass1Fl anonymousClass1Fl2 = new AnonymousClass1Fl();
        anonymousClass1Fl2.f16089E = true;
        anonymousClass1Fl2.f16092H = true;
        anonymousClass1Fl2.f16090F = false;
        anonymousClass1Fl2.f16091G = false;
        anonymousClass1Fl2.f16087C = immutableLocation;
        G2.m10376C(new AnonymousClass1Fq(anonymousClass1Fl2), "ForegroundLocation");
        AnonymousClass1Ft.m10389B(G2, new AnonymousClass1i5(anonymousClass1G9, z, immutableLocation), anonymousClass1G9.f16213K.m10371D());
    }

    /* renamed from: D */
    public static void m10429D(AnonymousClass1G9 anonymousClass1G9) {
        if (!anonymousClass1G9.f16216N) {
            if (!AnonymousClass0Fj.f2192B.m1668C()) {
                if (AnonymousClass0JI.isLocationEnabled(anonymousClass1G9.f16204B)) {
                    if (AnonymousClass0JI.isLocationPermitted(anonymousClass1G9.f16204B)) {
                        anonymousClass1G9.f16206D.m10404C(anonymousClass1G9.f16207E, anonymousClass1G9.f16211I, "ForegroundLocation");
                        anonymousClass1G9.f16216N = true;
                    }
                }
            }
        }
    }

    /* renamed from: E */
    public static void m10430E(AnonymousClass1G9 anonymousClass1G9) {
        if (anonymousClass1G9.f16219Q == null) {
            AnonymousClass0Dc.m1243F("ForegroundLocation", "Can't upload locations without a user session");
            return;
        }
        if (!anonymousClass1G9.f16212J.isEmpty()) {
            if (AnonymousClass0MM.m3152H(anonymousClass1G9.f16204B)) {
                AnonymousClass0GA A;
                List arrayList = new ArrayList(anonymousClass1G9.f16212J);
                anonymousClass1G9.f16212J.clear();
                int size = arrayList.size();
                anonymousClass1G9.f16210H = SystemClock.elapsedRealtime();
                boolean K = AnonymousClass0a2.m5426K(anonymousClass1G9.f16219Q);
                AnonymousClass1Di B = AnonymousClass1i6.m12652B(K ? AnonymousClass0a2.m5424I(anonymousClass1G9.f16219Q) : null, arrayList, anonymousClass1G9.f16205C);
                if (K) {
                    A = AnonymousClass1Dj.m10096B(AnonymousClass0a2.m5417B(anonymousClass1G9.f16219Q)).m10100C(B).m10098A();
                } else {
                    A = AnonymousClass1Dj.m10097C(anonymousClass1G9.f16219Q).m10100C(B).m10099B(AnonymousClass1Dk.ADS);
                }
                A.f2849B = new AnonymousClass1I6(anonymousClass1G9, size);
                AnonymousClass0Ix.m2384D(A);
            }
        }
    }

    /* renamed from: F */
    private void m10431F() {
        if (this.f16219Q != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f16210H;
            long j = this.f16217O * 1000;
            AnonymousClass0OR.m3627G(this.f16208F, this.f16218P, -1192296572);
            AnonymousClass0OR.m3626F(this.f16208F, this.f16218P, Math.max(0, j - elapsedRealtime), -11161332);
        }
    }

    /* renamed from: G */
    private void m10432G() {
        if (this.f16216N) {
            this.f16206D.m10407F();
            this.f16216N = false;
        }
    }

    public final void onAppBackgrounded() {
        m10432G();
        AnonymousClass0OR.m3627G(this.f16208F, this.f16218P, -406655781);
        AnonymousClass1G9.m10430E(this);
    }

    public final void onAppForegrounded() {
        AnonymousClass1G9.m10429D(this);
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0OR.m3627G(this.f16208F, this.f16218P, -2009513980);
        this.f16212J.clear();
        m10432G();
        AnonymousClass0Fj.f2192B.m1669D(this);
        this.f16219Q = null;
    }
}
