package com.instagram.filterkit.filter.resize;

import X.AnonymousClass28e;
import X.AnonymousClass28f;
import X.AnonymousClass28h;
import X.AnonymousClass28j;
import X.AnonymousClass28k;
import X.AnonymousClass28m;
import X.AnonymousClass28p;
import X.AnonymousClass28q;
import X.AnonymousClass2FR;
import X.AnonymousClass2Mf;
import X.AnonymousClass2Mk;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eL;
import X.AnonymousClass2eP;
import X.AnonymousClass3Oq;
import X.AnonymousClass3Or;
import X.AnonymousClass3Ov;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.util.creation.ShaderBridge;

public class LanczosFilter extends BaseFilter {
    public static final Creator CREATOR = new AnonymousClass3Ov();
    /* renamed from: P */
    private static final AnonymousClass2Mf f49601P = AnonymousClass2Mk.m15236B();
    /* renamed from: B */
    private AnonymousClass2eP f49602B;
    /* renamed from: C */
    private int f49603C = Integer.MAX_VALUE;
    /* renamed from: D */
    private AnonymousClass28h f49604D;
    /* renamed from: E */
    private AnonymousClass28h f49605E;
    /* renamed from: F */
    private AnonymousClass3Or f49606F;
    /* renamed from: G */
    private AnonymousClass3Or f49607G;
    /* renamed from: H */
    private AnonymousClass2eL f49608H;
    /* renamed from: I */
    private AnonymousClass2eL f49609I;
    /* renamed from: J */
    private AnonymousClass2eL f49610J;
    /* renamed from: K */
    private AnonymousClass2eL f49611K;
    /* renamed from: L */
    private AnonymousClass2eL f49612L;
    /* renamed from: M */
    private AnonymousClass2eL f49613M;
    /* renamed from: N */
    private AnonymousClass28p f49614N = new AnonymousClass28p();
    /* renamed from: O */
    private AnonymousClass2eP f49615O;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    public final void QE(AnonymousClass28k anonymousClass28k) {
        AnonymousClass28h anonymousClass28h = this.f49604D;
        if (anonymousClass28h != null) {
            GLES20.glDeleteProgram(anonymousClass28h.f26592C);
            this.f49604D = null;
        }
        anonymousClass28h = this.f49605E;
        if (anonymousClass28h != null) {
            GLES20.glDeleteProgram(anonymousClass28h.f26592C);
            this.f49605E = null;
        }
    }

    public final void QPA(int i) {
        this.f49603C = i;
    }

    public final void yJA(AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        int compileProgram;
        int compileProgram2;
        Object obj;
        boolean B;
        GLES20.glFlush();
        AnonymousClass28k anonymousClass28k2 = anonymousClass28k;
        LanczosFilter lanczosFilter = this;
        anonymousClass28k = true;
        if (!anonymousClass28k2.m14591C(this)) {
            compileProgram = ShaderBridge.compileProgram("LanczosX");
            if (compileProgram == 0) {
                AnonymousClass2FR.m14830C(true);
                compileProgram = ShaderBridge.compileProgram("LanczosXFixed");
            }
            if (compileProgram != 0) {
                compileProgram2 = ShaderBridge.compileProgram("LanczosY");
                if (compileProgram2 == 0) {
                    AnonymousClass2FR.m14830C(true);
                    compileProgram2 = ShaderBridge.compileProgram("LanczosYFixed");
                }
                if (compileProgram2 != 0) {
                    this.f49604D = new AnonymousClass28h(compileProgram);
                    this.f49605E = new AnonymousClass28h(compileProgram2);
                    this.f49615O = (AnonymousClass2eP) this.f49604D.m14572B("srcWidth");
                    this.f49602B = (AnonymousClass2eP) this.f49605E.m14572B("srcHeight");
                    this.f49612L = (AnonymousClass2eL) this.f49604D.m14572B("scale");
                    this.f49608H = (AnonymousClass2eL) this.f49604D.m14572B("lanczosFactor");
                    this.f49610J = (AnonymousClass2eL) this.f49604D.m14572B("srcLanczosFactor");
                    this.f49613M = (AnonymousClass2eL) this.f49605E.m14572B("scale");
                    this.f49609I = (AnonymousClass2eL) this.f49605E.m14572B("lanczosFactor");
                    this.f49611K = (AnonymousClass2eL) this.f49605E.m14572B("srcLanczosFactor");
                    this.f49606F = new AnonymousClass3Or(this.f49604D);
                    this.f49607G = new AnonymousClass3Or(this.f49605E);
                    anonymousClass28k2.m14593E(this);
                }
            }
            throw new AnonymousClass3Oq();
        }
        AnonymousClass2Vh anonymousClass2Vh2 = anonymousClass2Vh;
        compileProgram2 = anonymousClass2Vh2.getHeight();
        compileProgram = anonymousClass2Vh2.getWidth();
        AnonymousClass2Vi anonymousClass2Vi2 = anonymousClass2Vi;
        int hQ = anonymousClass2Vi2.hQ();
        int jQ = anonymousClass2Vi2.jQ();
        lanczosFilter.f49615O.m16749C(compileProgram);
        float f = ((float) compileProgram) / ((float) jQ);
        lanczosFilter.f49612L.m16738C(f);
        lanczosFilter.f49608H.m16738C(2.0f);
        lanczosFilter.f49610J.m16738C(f * 2.0f);
        lanczosFilter.f49604D.m14574D("position", 2, 8, f49601P.f29571C);
        lanczosFilter.f49604D.m14574D("transformedTextureCoordinate", 2, 8, f49601P.f29572D);
        lanczosFilter.f49604D.m14574D("staticTextureCoordinate", 2, 8, f49601P.f29572D);
        lanczosFilter.f49604D.m14577G("image", anonymousClass2Vh2.getTextureId(), AnonymousClass28f.NEAREST, AnonymousClass28e.CLAMP);
        AnonymousClass28q C = AnonymousClass28m.m14600C(jQ, compileProgram2);
        GLES20.glBindFramebuffer(36160, C.QM());
        boolean B2 = AnonymousClass28j.m14579B("glBindFramebuffer");
        C.RU(lanczosFilter.f49614N);
        if (!B2) {
            if (!lanczosFilter.f49606F.m19522A(lanczosFilter.f49614N, lanczosFilter.f49603C)) {
                obj = null;
                if (obj != null) {
                    lanczosFilter.f49602B.m16749C(compileProgram2);
                    float f2 = ((float) compileProgram2) / ((float) hQ);
                    lanczosFilter.f49613M.m16738C(f2);
                    lanczosFilter.f49609I.m16738C(2.0f);
                    lanczosFilter.f49611K.m16738C(f2 * 2.0f);
                    lanczosFilter.f49605E.m14574D("position", 2, 8, f49601P.f29571C);
                    lanczosFilter.f49605E.m14574D("transformedTextureCoordinate", 2, 8, f49601P.f29572D);
                    lanczosFilter.f49605E.m14574D("staticTextureCoordinate", 2, 8, f49601P.f29572D);
                    lanczosFilter.f49605E.m14577G("image", C.getTextureId(), AnonymousClass28f.NEAREST, AnonymousClass28e.CLAMP);
                    GLES20.glBindTexture(3553, C.getTextureId());
                    GLES20.glTexParameteri(3553, 10241, 9728);
                    GLES20.glTexParameteri(3553, 10240, 9728);
                    GLES20.glBindFramebuffer(36160, anonymousClass2Vi2.QM());
                    B = AnonymousClass28j.m14579B("glBindFramebuffer");
                    anonymousClass2Vi2.RU(lanczosFilter.f49614N);
                    if (!B) {
                        if (lanczosFilter.f49607G.m19522A(lanczosFilter.f49614N, lanczosFilter.f49603C)) {
                            anonymousClass28k = null;
                        }
                    }
                    cb();
                    C.cleanup();
                    anonymousClass28k2.m14596H(anonymousClass2Vh2, null);
                    if (anonymousClass28k != null) {
                        lanczosFilter.f48221B = false;
                    }
                    anonymousClass28k2.m14596H(anonymousClass2Vi2, null);
                    anonymousClass28k2.m14590B(lanczosFilter);
                    throw new AnonymousClass3Oq();
                }
                GLES20.glBindTexture(3553, anonymousClass2Vh2.getTextureId());
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                C.cleanup();
                anonymousClass28k2.m14590B(lanczosFilter);
                throw new AnonymousClass3Oq();
            }
        }
        obj = 1;
        if (obj != null) {
            GLES20.glBindTexture(3553, anonymousClass2Vh2.getTextureId());
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            C.cleanup();
            anonymousClass28k2.m14590B(lanczosFilter);
            throw new AnonymousClass3Oq();
        }
        lanczosFilter.f49602B.m16749C(compileProgram2);
        float f22 = ((float) compileProgram2) / ((float) hQ);
        lanczosFilter.f49613M.m16738C(f22);
        lanczosFilter.f49609I.m16738C(2.0f);
        lanczosFilter.f49611K.m16738C(f22 * 2.0f);
        lanczosFilter.f49605E.m14574D("position", 2, 8, f49601P.f29571C);
        lanczosFilter.f49605E.m14574D("transformedTextureCoordinate", 2, 8, f49601P.f29572D);
        lanczosFilter.f49605E.m14574D("staticTextureCoordinate", 2, 8, f49601P.f29572D);
        lanczosFilter.f49605E.m14577G("image", C.getTextureId(), AnonymousClass28f.NEAREST, AnonymousClass28e.CLAMP);
        GLES20.glBindTexture(3553, C.getTextureId());
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glBindFramebuffer(36160, anonymousClass2Vi2.QM());
        B = AnonymousClass28j.m14579B("glBindFramebuffer");
        anonymousClass2Vi2.RU(lanczosFilter.f49614N);
        if (B) {
            if (lanczosFilter.f49607G.m19522A(lanczosFilter.f49614N, lanczosFilter.f49603C)) {
                anonymousClass28k = null;
            }
        }
        cb();
        C.cleanup();
        anonymousClass28k2.m14596H(anonymousClass2Vh2, null);
        if (anonymousClass28k != null) {
            anonymousClass28k2.m14596H(anonymousClass2Vi2, null);
            anonymousClass28k2.m14590B(lanczosFilter);
            throw new AnonymousClass3Oq();
        }
        lanczosFilter.f48221B = false;
    }
}
