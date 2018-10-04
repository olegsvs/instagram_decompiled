package X;

import android.view.Surface;

/* renamed from: X.2e7 */
public final class AnonymousClass2e7 implements AnonymousClass1sm, AnonymousClass2Pr {
    /* renamed from: B */
    public AnonymousClass3qH f31943B;
    /* renamed from: C */
    private final AnonymousClass2Q1 f31944C;
    /* renamed from: D */
    private final AnonymousClass2Q1 f31945D;
    /* renamed from: E */
    private boolean f31946E = true;
    /* renamed from: F */
    private final int f31947F;

    /* renamed from: B */
    private static int m16721B(boolean z, int i) {
        if (!z) {
            if (i == 0) {
                return 8;
            }
            if (i == 90) {
                return 16;
            }
            if (i == 270) {
                return 4;
            }
        }
        return 0;
    }

    public final String qN() {
        return "IgFrameBufferOutput";
    }

    public AnonymousClass2e7(boolean z, AnonymousClass1sj anonymousClass1sj) {
        this.f31945D = new AnonymousClass2Q1(anonymousClass1sj.f23727C, anonymousClass1sj.f23726B);
        this.f31944C = new AnonymousClass2Q1(anonymousClass1sj.f23727C, anonymousClass1sj.f23726B);
        this.f31947F = AnonymousClass2e7.m16721B(z, anonymousClass1sj.f23731G);
    }

    /* renamed from: A */
    public final AnonymousClass2Q1 m16722A() {
        return this.f31946E ? this.f31945D : this.f31944C;
    }

    public final AnonymousClass1xq CP() {
        return this.f31945D.CP();
    }

    public final AnonymousClass1sn DN() {
        return m16722A().DN();
    }

    public final int IR() {
        return this.f31947F;
    }

    public final AnonymousClass1xp KM() {
        return AnonymousClass1xp.DEFAULT;
    }

    public final void LW(AnonymousClass1ui anonymousClass1ui, Surface surface) {
        this.f31944C.LW(anonymousClass1ui, surface);
        this.f31945D.LW(anonymousClass1ui, surface);
    }

    public final void TCA() {
        AnonymousClass1uu A = m16722A().m15649A();
        AnonymousClass3qH anonymousClass3qH = this.f31943B;
        if (anonymousClass3qH != null && A != null) {
            int i = A.f24087C;
            if (anonymousClass3qH.f45206B.f45210E) {
                AnonymousClass3qJ anonymousClass3qJ = anonymousClass3qH.f45206B;
                AnonymousClass0LH.F(anonymousClass3qJ.f45212G, "ARRenderListener has not been set!");
                AnonymousClass2Vh anonymousClass2Vh = anonymousClass3qJ.f45208C;
                if (anonymousClass2Vh == null || anonymousClass2Vh.getTextureId() != i) {
                    anonymousClass3qJ.f45208C = AnonymousClass28m.m14599B(i, anonymousClass3qJ.f45211F.f23727C, anonymousClass3qJ.f45211F.f23726B);
                }
                anonymousClass3qJ.f45212G.pc(anonymousClass3qJ.f45208C);
                return;
            }
            AnonymousClass3qJ anonymousClass3qJ2 = anonymousClass3qH.f45206B;
            synchronized (anonymousClass3qJ2.f45213H) {
                if (anonymousClass3qJ2.f45207B) {
                    AnonymousClass0Gn.C("IG-CameraCoreRenderer", "Skipped a frame");
                }
                if (anonymousClass3qJ2.f45208C == null || anonymousClass3qJ2.f45208C.getTextureId() != i) {
                    anonymousClass3qJ2.f45208C = AnonymousClass28m.m14599B(i, anonymousClass3qJ2.f45211F.f23727C, anonymousClass3qJ2.f45211F.f23726B);
                }
                anonymousClass3qJ2.f45207B = true;
                anonymousClass3qJ2.f45213H.notifyAll();
            }
        }
    }

    public final void destroy() {
        this.f31945D.destroy();
        this.f31944C.destroy();
    }

    public final int getHeight() {
        return m16722A().getHeight();
    }

    public final int getWidth() {
        return m16722A().getWidth();
    }

    public final boolean kD() {
        return this.f31945D.kD() && this.f31944C.kD();
    }

    public final void makeCurrent() {
        m16722A().makeCurrent();
    }

    public final void release() {
        this.f31945D.release();
        this.f31944C.release();
    }

    public final void swapBuffers() {
        m16722A().swapBuffers();
        this.f31946E ^= 1;
    }

    public final void vV(AnonymousClass2Ps anonymousClass2Ps, AnonymousClass2Pt anonymousClass2Pt) {
        AnonymousClass2Pt.m15630B(anonymousClass2Ps.f30231B, 31, this);
    }
}
