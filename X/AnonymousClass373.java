package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.373 */
public final class AnonymousClass373 implements AnonymousClass1so {
    /* renamed from: B */
    public final AnonymousClass383 f37981B;
    /* renamed from: C */
    public AnonymousClass1uo f37982C;
    /* renamed from: D */
    public final AnonymousClass4MM f37983D;
    /* renamed from: E */
    public final AtomicInteger f37984E = new AtomicInteger(0);
    /* renamed from: F */
    public long f37985F = 50000000;
    /* renamed from: G */
    public final List f37986G;
    /* renamed from: H */
    public int f37987H;
    /* renamed from: I */
    public volatile boolean f37988I;
    /* renamed from: J */
    public final String f37989J;
    /* renamed from: K */
    public final AtomicInteger f37990K;
    /* renamed from: L */
    public final String f37991L;
    /* renamed from: M */
    public int f37992M;
    /* renamed from: N */
    private final AnonymousClass2db f37993N;
    /* renamed from: O */
    private long f37994O = 71000000;
    /* renamed from: P */
    private long f37995P;
    /* renamed from: Q */
    private final AnonymousClass2SA f37996Q = new AnonymousClass2SA();
    /* renamed from: R */
    private final float[] f37997R = new float[16];

    public final void um(AnonymousClass2dG anonymousClass2dG) {
    }

    public AnonymousClass373(String str, int i, String str2, AnonymousClass4MM anonymousClass4MM) {
        this.f37989J = str;
        this.f37990K = new AtomicInteger(i);
        this.f37991L = str2;
        this.f37983D = anonymousClass4MM;
        this.f37986G = new ArrayList();
        this.f37993N = new AnonymousClass2db();
        this.f37995P = 0;
        this.f37981B = new AnonymousClass383();
        Matrix.setIdentityM(this.f37997R, 0);
        AnonymousClass1xt.m13927E(this.f37997R);
    }

    /* renamed from: B */
    public static void m18587B(AnonymousClass373 anonymousClass373, boolean z) {
        anonymousClass373.f37981B.f38145D.sendEmptyMessage(3);
        anonymousClass373.f37981B.f38145D.sendEmptyMessage(4);
        anonymousClass373.release();
        if (!z) {
            File file = new File(anonymousClass373.f37991L);
            if (file.exists()) {
                file.deleteOnExit();
            }
        }
    }

    public final boolean BTA(AnonymousClass2dG anonymousClass2dG, long j) {
        return this.f37984E.get() == 1 && j - this.f37995P >= this.f37994O;
    }

    /* renamed from: C */
    public static void m18588C(AnonymousClass373 anonymousClass373, boolean z) {
        AnonymousClass4MM anonymousClass4MM = anonymousClass373.f37983D;
        AnonymousClass0OR.D(anonymousClass4MM.f53204B.f64222E, new AnonymousClass4ML(anonymousClass4MM, z, new AnonymousClass2nq(anonymousClass373.f37992M, anonymousClass373.f37987H, anonymousClass373.f37991L, 0, anonymousClass4MM.f53204B.f64219B != null ? anonymousClass4MM.f53204B.f64219B.f33989B : -1)), 1258314231);
    }

    /* renamed from: D */
    public static void m18589D(AnonymousClass373 anonymousClass373, int i, int i2) {
        long j = anonymousClass373.f37985F * ((long) (i2 - 1));
        anonymousClass373.f37982C.makeCurrent();
        GLES20.glViewport(0, 0, anonymousClass373.f37992M, anonymousClass373.f37987H);
        anonymousClass373.f37993N.sj(anonymousClass373.f37996Q.m15770D(((AnonymousClass1uk) anonymousClass373.f37986G.get(i)).f24047E, null, anonymousClass373.f37997R, null, j), j);
        anonymousClass373.f37982C.cQA(j);
        anonymousClass373.f37982C.swapBuffers();
        anonymousClass373.f37981B.f38145D.sendEmptyMessage(2);
    }

    public final AnonymousClass1uk PM(int i, int i2) {
        return new AnonymousClass1uk(i, i2);
    }

    public final void qm(AnonymousClass2dG anonymousClass2dG, long j, AnonymousClass1uk anonymousClass1uk) {
        this.f37995P = j;
        this.f37986G.add(anonymousClass1uk);
        int size = this.f37986G.size();
        if (!this.f37988I) {
            AnonymousClass373.m18589D(this, size - 1, size);
            AnonymousClass4MM anonymousClass4MM = this.f37983D;
            String str = this.f37989J;
            int i = this.f37990K.get();
            anonymousClass4MM.f53204B.f64221D.set(size);
            AnonymousClass0OR.D(anonymousClass4MM.f53204B.f64222E, new AnonymousClass4MJ(anonymousClass4MM, str, size, i), -42175539);
        }
        if (size >= this.f37990K.get() || this.f37988I) {
            this.f37984E.set(2);
            if (this.f37988I) {
                this.f37983D.m23995A(this.f37989J, false, 0);
                AnonymousClass373.m18587B(this, false);
            } else {
                this.f37983D.m23995A(this.f37989J, true, 0);
                size = this.f37986G.size();
                int i2 = (size * 2) - 2;
                double d = (double) (((long) i2) * this.f37985F);
                Double.isNaN(d);
                i2 *= Math.max((int) Math.ceil(3.0E9d / d), 3);
                int i3 = size - 1;
                int i4 = i3;
                loop0:
                while (true) {
                    Object obj = null;
                    while (!this.f37988I && size <= i2) {
                        i4 += obj != null ? 1 : -1;
                        size++;
                        AnonymousClass373.m18589D(this, i4, size);
                        if (i4 == 0) {
                            obj = 1;
                        } else if (i4 == i3) {
                        }
                    }
                }
                AnonymousClass373.m18587B(this, this.f37988I ^ true);
            }
            anonymousClass2dG.f31770B.nJA(anonymousClass2dG);
        }
    }

    public final void release() {
        this.f37984E.set(3);
        for (AnonymousClass1uk A : this.f37986G) {
            A.m13685A();
        }
        this.f37986G.clear();
        this.f37993N.RCA();
        AnonymousClass1uo anonymousClass1uo = this.f37982C;
        if (anonymousClass1uo != null) {
            anonymousClass1uo.release();
            this.f37982C = null;
        }
        this.f37981B.f38145D.sendEmptyMessage(4);
    }

    public final void xV(AnonymousClass1ui anonymousClass1ui, AnonymousClass2R4 anonymousClass2R4, int i, int i2, AnonymousClass2Pt anonymousClass2Pt) {
        this.f37992M = i;
        this.f37987H = i2;
        this.f37993N.OCA(anonymousClass2R4);
        this.f37981B.f38152K = new AnonymousClass3xL(this);
        int i3 = this.f37992M;
        int i4 = this.f37987H;
        double d = (double) (i3 * i4);
        double d2 = (double) this.f37985F;
        Double.isNaN(d2);
        double d3 = 1.0E9d / d2;
        Double.isNaN(d);
        if (this.f37981B.m18651A(i3, i4, (int) (((d * d3) * 4.0d) * 0.07d))) {
            this.f37982C = anonymousClass1ui.nF(this.f37981B.f38146E);
            this.f37981B.m18652B(this.f37991L, 0);
            this.f37984E.set(1);
            return;
        }
        this.f37984E.set(-1);
        this.f37983D.m23995A(this.f37989J, false, 0);
    }
}
