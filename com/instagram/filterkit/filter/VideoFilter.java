package com.instagram.filterkit.filter;

import X.AnonymousClass0Dc;
import X.AnonymousClass28h;
import X.AnonymousClass28j;
import X.AnonymousClass28k;
import X.AnonymousClass28m;
import X.AnonymousClass28p;
import X.AnonymousClass28q;
import X.AnonymousClass2Mf;
import X.AnonymousClass2Mk;
import X.AnonymousClass2Vg;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eF;
import X.AnonymousClass2eK;
import X.AnonymousClass2eL;
import X.AnonymousClass2eM;
import X.AnonymousClass2eO;
import X.AnonymousClass2eX;
import X.AnonymousClass3Oh;
import X.AnonymousClass3Ox;
import X.AnonymousClass3UU;
import android.content.Context;
import android.graphics.Color;
import android.opengl.GLES20;
import com.instagram.common.math.Matrix4;
import com.instagram.model.filterkit.TextureAsset;
import com.instagram.util.video.VideoBridge;
import java.nio.FloatBuffer;
import java.util.List;

public class VideoFilter extends BaseFilter {
    /* renamed from: p */
    public static final AnonymousClass2Mf f49558p = AnonymousClass2Mk.m15236B();
    /* renamed from: q */
    private static final int[] f49559q = new int[]{33985, 33986, 33987, 33988, 33989, 33990};
    /* renamed from: r */
    public static final Class f49560r = VideoFilter.class;
    /* renamed from: B */
    public AnonymousClass28h f49561B;
    /* renamed from: C */
    public int f49562C;
    /* renamed from: D */
    public float[] f49563D;
    /* renamed from: E */
    public AnonymousClass2eO f49564E;
    /* renamed from: F */
    public boolean f49565F;
    /* renamed from: G */
    public final Context f49566G;
    /* renamed from: H */
    public final AnonymousClass2Vh[] f49567H;
    /* renamed from: I */
    public AnonymousClass2Mf f49568I;
    /* renamed from: J */
    public boolean f49569J;
    /* renamed from: K */
    public AnonymousClass28h f49570K;
    /* renamed from: L */
    public final int f49571L;
    /* renamed from: M */
    public boolean f49572M;
    /* renamed from: N */
    public int f49573N;
    /* renamed from: O */
    public int f49574O;
    /* renamed from: P */
    public AnonymousClass2eM f49575P;
    /* renamed from: Q */
    public int f49576Q;
    /* renamed from: R */
    public int f49577R;
    /* renamed from: S */
    public float[] f49578S;
    /* renamed from: T */
    public AnonymousClass2eO f49579T;
    /* renamed from: U */
    public int f49580U;
    /* renamed from: V */
    public boolean f49581V;
    /* renamed from: W */
    private AnonymousClass3Oh f49582W;
    /* renamed from: X */
    private AnonymousClass2eL f49583X;
    /* renamed from: Y */
    private boolean f49584Y;
    /* renamed from: Z */
    private AnonymousClass2eL f49585Z;
    /* renamed from: a */
    private int f49586a;
    /* renamed from: b */
    private AnonymousClass2eL f49587b;
    /* renamed from: c */
    private int f49588c;
    /* renamed from: d */
    private AnonymousClass2eL f49589d;
    /* renamed from: e */
    private final String f49590e;
    /* renamed from: f */
    private AnonymousClass2eX f49591f;
    /* renamed from: g */
    private final List f49592g;
    /* renamed from: h */
    private AnonymousClass2eF f49593h;
    /* renamed from: i */
    private float[] f49594i;
    /* renamed from: j */
    private AnonymousClass2eF f49595j;
    /* renamed from: k */
    private AnonymousClass2eK f49596k;
    /* renamed from: l */
    private AnonymousClass2eK f49597l;
    /* renamed from: m */
    private Matrix4 f49598m;
    /* renamed from: n */
    private final AnonymousClass28p f49599n;
    /* renamed from: o */
    private AnonymousClass2eL f49600o;

    public final void invalidate() {
    }

    public VideoFilter(Context context, int i, String str, List list) {
        this.f49599n = new AnonymousClass28p();
        this.f49588c = 0;
        this.f49586a = Integer.MAX_VALUE;
        this.f49568I = AnonymousClass2Mk.m15236B();
        this.f49566G = context;
        this.f49571L = i;
        this.f49590e = str;
        this.f49592g = list;
        this.f49567H = new AnonymousClass2Vh[this.f49592g.size()];
        this.f49577R = 100;
        this.f49582W = null;
    }

    public VideoFilter(Context context, AnonymousClass3UU anonymousClass3UU) {
        this(context, anonymousClass3UU, null);
    }

    public VideoFilter(Context context, AnonymousClass3UU anonymousClass3UU, AnonymousClass3Oh anonymousClass3Oh) {
        this.f49599n = new AnonymousClass28p();
        boolean z = false;
        this.f49588c = 0;
        this.f49586a = Integer.MAX_VALUE;
        this.f49568I = AnonymousClass2Mk.m15236B();
        this.f49571L = anonymousClass3UU.f41614D;
        this.f49590e = anonymousClass3UU.f41618H;
        List list = anonymousClass3UU.f41619I;
        this.f49592g = list;
        this.f49567H = new AnonymousClass2Vh[list.size()];
        this.f49566G = context;
        this.f49577R = 100;
        if (anonymousClass3UU == AnonymousClass3Ox.m19525B().m19527B(-1)) {
            z = true;
        }
        this.f49569J = z;
        this.f49582W = anonymousClass3Oh;
    }

    /* renamed from: A */
    public final int m22723A() {
        if (this.f49574O == 0) {
            try {
                this.f49574O = VideoBridge.compileProgram(this.f49590e, this.f49581V, this.f49572M);
                this.f49570K = new AnonymousClass28h(this.f49574O);
                GLES20.glUseProgram(this.f49574O);
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f49574O, "image"), 0);
                this.f49583X = (AnonymousClass2eL) this.f49570K.m14572B("u_filterStrength");
                if (this.f49583X != null) {
                    this.f49583X.m16738C(1.0f);
                }
                this.f49595j = (AnonymousClass2eF) this.f49570K.m14572B("u_enableTransformMatrix");
                this.f49596k = (AnonymousClass2eK) this.f49570K.m14572B("u_transformMatrix");
                m22730H(this.f49594i);
                this.f49593h = (AnonymousClass2eF) this.f49570K.m14572B("u_enableVertexTransform");
                this.f49597l = (AnonymousClass2eK) this.f49570K.m14572B("u_vertexTransform");
                m22731I(this.f49598m);
                this.f49589d = (AnonymousClass2eL) this.f49570K.m14572B("u_min");
                this.f49587b = (AnonymousClass2eL) this.f49570K.m14572B("u_max");
                m22729G(this.f49588c, this.f49586a);
                this.f49600o = (AnonymousClass2eL) this.f49570K.m14572B("u_width");
                this.f49585Z = (AnonymousClass2eL) this.f49570K.m14572B("u_height");
                this.f49573N = GLES20.glGetAttribLocation(this.f49574O, "position");
                this.f49580U = GLES20.glGetAttribLocation(this.f49574O, "transformedTextureCoordinate");
                this.f49576Q = GLES20.glGetAttribLocation(this.f49574O, "staticTextureCoordinate");
                mo5437B();
                int i = 0;
                while (i < this.f49592g.size()) {
                    TextureAsset textureAsset = (TextureAsset) this.f49592g.get(i);
                    int i2 = i + 1;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f49574O, textureAsset.f41632B), i2);
                    this.f49567H[i] = AnonymousClass28j.m14583F(this.f49566G, textureAsset.f41633C);
                    i = i2;
                }
            } catch (Exception e) {
                AnonymousClass0Dc.D(f49560r, "Error initializing %s program: ", new Object[]{this.f49590e, e});
            }
            Integer.valueOf(this.f49574O);
        }
        return this.f49574O;
    }

    /* renamed from: B */
    public void mo5437B() {
        AnonymousClass3Oh anonymousClass3Oh = this.f49582W;
        if (anonymousClass3Oh != null) {
            anonymousClass3Oh.oF(this.f49570K);
        }
    }

    /* renamed from: B */
    public static float[] m22720B(int i) {
        return new float[]{((float) Color.red(i)) / 255.0f, ((float) Color.green(i)) / 255.0f, ((float) Color.blue(i)) / 255.0f};
    }

    /* renamed from: C */
    private void m22721C() {
        for (AnonymousClass28q anonymousClass28q : this.f49567H) {
            if (anonymousClass28q != null) {
                anonymousClass28q.cleanup();
            }
        }
        AnonymousClass28q anonymousClass28q2 = this.f49591f;
        if (anonymousClass28q2 != null) {
            anonymousClass28q2.cleanup();
        }
        int i = this.f49574O;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.f49574O = 0;
        }
        i = this.f49562C;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.f49562C = 0;
        }
    }

    /* renamed from: C */
    public void mo5438C(AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        AnonymousClass3Oh anonymousClass3Oh = this.f49582W;
        if (anonymousClass3Oh != null) {
            anonymousClass3Oh.Qu(this.f49570K, anonymousClass2Vh, anonymousClass2Vi, this.f49567H);
        }
    }

    /* renamed from: D */
    public void mo5439D(AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        AnonymousClass3Oh anonymousClass3Oh = this.f49582W;
        if (anonymousClass3Oh != null) {
            anonymousClass3Oh.Su(this.f49570K, anonymousClass2Vh, anonymousClass2Vi, this.f49567H);
        }
    }

    /* renamed from: D */
    private void m22722D(Matrix4 matrix4) {
        AnonymousClass2eF anonymousClass2eF = this.f49593h;
        if (anonymousClass2eF != null) {
            anonymousClass2eF.m16728C(matrix4 != null);
        }
        if (matrix4 != null) {
            AnonymousClass2eK anonymousClass2eK = this.f49597l;
            if (anonymousClass2eK != null) {
                anonymousClass2eK.m16735C(matrix4.f18005C);
            }
        }
    }

    /* renamed from: E */
    public final void m22727E(AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi, boolean z, boolean z2, AnonymousClass2Mf anonymousClass2Mf) {
        FloatBuffer floatBuffer;
        AnonymousClass2Vi anonymousClass2Vi2 = anonymousClass2Vi;
        GLES20.glBindFramebuffer(36160, anonymousClass2Vi.QM());
        VideoFilter videoFilter = this;
        GLES20.glUseProgram(m22723A());
        GLES20.glActiveTexture(33984);
        AnonymousClass2Vh anonymousClass2Vh2 = anonymousClass2Vh;
        if (this.f49581V) {
            GLES20.glBindTexture(36197, anonymousClass2Vh.getTextureId());
        } else {
            GLES20.glBindTexture(3553, anonymousClass2Vh.getTextureId());
        }
        if (z2) {
            m22722D(this.f49598m);
        } else {
            m22722D(null);
        }
        if (this.f49569J) {
            floatBuffer = anonymousClass2Mf.f29570B;
        } else {
            floatBuffer = anonymousClass2Mf.f29572D;
        }
        if (z) {
            AnonymousClass2eL anonymousClass2eL = this.f49583X;
            if (anonymousClass2eL != null) {
                anonymousClass2eL.m16738C(((float) videoFilter.f49577R) / 100.0f);
            }
        } else {
            this.f49583X.m16738C(0.0f);
        }
        GLES20.glEnableVertexAttribArray(videoFilter.f49573N);
        GLES20.glVertexAttribPointer(videoFilter.f49573N, 2, 5126, false, 8, anonymousClass2Mf.f29571C);
        GLES20.glEnableVertexAttribArray(videoFilter.f49580U);
        GLES20.glVertexAttribPointer(videoFilter.f49580U, 2, 5126, false, 8, floatBuffer);
        int i = videoFilter.f49576Q;
        if (i != -1) {
            GLES20.glEnableVertexAttribArray(i);
            GLES20.glVertexAttribPointer(videoFilter.f49576Q, 2, 5126, null, 8, floatBuffer);
        }
        AnonymousClass2eL anonymousClass2eL2 = videoFilter.f49600o;
        if (!(anonymousClass2eL2 == null || videoFilter.f49585Z == null)) {
            anonymousClass2eL2.m16738C((float) anonymousClass2Vi2.jQ());
            videoFilter.f49585Z.m16738C((float) anonymousClass2Vi2.hQ());
        }
        m22730H(videoFilter.f49594i);
        for (i = 0; i < videoFilter.f49567H.length; i++) {
            GLES20.glActiveTexture(f49559q[i]);
            GLES20.glBindTexture(3553, videoFilter.f49567H[i].getTextureId());
        }
        anonymousClass2Vi2.RU(videoFilter.f49599n);
        GLES20.glViewport(videoFilter.f49599n.f26617D, videoFilter.f49599n.f26618E, videoFilter.f49599n.f26616C, videoFilter.f49599n.f26615B);
        mo5439D(anonymousClass2Vh2, anonymousClass2Vi2);
        videoFilter.f49570K.m14571A();
        GLES20.glDrawArrays(5, 0, 4);
        mo5438C(anonymousClass2Vh2, anonymousClass2Vi2);
        GLES20.glDisableVertexAttribArray(videoFilter.f49573N);
        GLES20.glDisableVertexAttribArray(videoFilter.f49580U);
        int i2 = videoFilter.f49576Q;
        if (i2 != -1) {
            GLES20.glDisableVertexAttribArray(i2);
        }
    }

    /* renamed from: F */
    public final void m22728F(int i, int i2) {
        this.f49584Y = true;
        this.f49578S = m22720B(i);
        this.f49563D = m22720B(i2);
    }

    /* renamed from: G */
    public final void m22729G(int i, int i2) {
        this.f49588c = i;
        AnonymousClass2eL anonymousClass2eL = this.f49589d;
        if (anonymousClass2eL != null) {
            anonymousClass2eL.m16738C((float) i);
        }
        this.f49586a = i2;
        anonymousClass2eL = this.f49587b;
        if (anonymousClass2eL != null) {
            anonymousClass2eL.m16738C((float) i2);
        }
    }

    /* renamed from: H */
    public final void m22730H(float[] fArr) {
        this.f49594i = fArr;
        AnonymousClass2eF anonymousClass2eF = this.f49595j;
        if (anonymousClass2eF != null) {
            anonymousClass2eF.m16728C(this.f49594i != null);
        }
        float[] fArr2 = this.f49594i;
        if (fArr2 != null) {
            AnonymousClass2Vg anonymousClass2Vg = this.f49596k;
            if (anonymousClass2Vg != null) {
                anonymousClass2Vg.f31963B = FloatBuffer.wrap(fArr2);
                anonymousClass2Vg.m16149B();
            }
        }
    }

    /* renamed from: I */
    public final void m22731I(Matrix4 matrix4) {
        this.f49598m = matrix4;
        m22722D(matrix4);
    }

    public final void QE(AnonymousClass28k anonymousClass28k) {
        m22721C();
    }

    public final void finalize() {
        m22721C();
    }

    public final String toString() {
        return this.f49590e;
    }

    public void yJA(AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        AnonymousClass2Vi anonymousClass2Vi2 = anonymousClass2Vi;
        GLES20.glBindFramebuffer(36160, anonymousClass2Vi2.QM());
        if (this.f49565F) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
        }
        AnonymousClass2Vh anonymousClass2Vh2 = anonymousClass2Vh;
        if (r10.f49584Y) {
            if (r10.f49591f == null) {
                r10.f49591f = AnonymousClass28m.m14600C(anonymousClass2Vi2.getWidth(), anonymousClass2Vi2.getWidth());
            }
            AnonymousClass28q anonymousClass28q = r10.f49591f;
            GLES20.glBindFramebuffer(36160, anonymousClass28q.QM());
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            int width = anonymousClass28q.getWidth();
            int height = anonymousClass28q.getHeight();
            if (r10.f49562C == 0) {
                try {
                    r10.f49562C = VideoBridge.compileProgram("GradientBackground", false, r10.f49572M);
                    r10.f49561B = new AnonymousClass28h(r10.f49562C);
                    GLES20.glUseProgram(r10.f49562C);
                    r10.f49579T = (AnonymousClass2eO) r10.f49561B.m14572B("topColor");
                    r10.f49564E = (AnonymousClass2eO) r10.f49561B.m14572B("bottomColor");
                    r10.f49575P = (AnonymousClass2eM) r10.f49561B.m14572B("resolution");
                    r10.f49579T.m16747D(r10.f49578S[0], r10.f49578S[1], r10.f49578S[2], 1.0f);
                    r10.f49564E.m16747D(r10.f49563D[0], r10.f49563D[1], r10.f49563D[2], 1.0f);
                    r10.f49575P.m16740C((float) width, (float) height);
                } catch (Exception e) {
                    AnonymousClass0Dc.D(f49560r, "Error initializing %s program: ", new Object[]{"GradientBackground", e});
                }
                Integer.valueOf(r10.f49562C);
            }
            GLES20.glUseProgram(r10.f49562C);
            r10.f49561B.m14574D("position", 2, 8, r10.f49568I.f29571C);
            r10.f49561B.m14573C();
            r10.f49561B.m14571A();
            GLES20.glDrawArrays(5, 0, 4);
            m22727E(anonymousClass2Vh2, r10.f49591f, false, true, r10.f49568I);
            m22727E(r10.f49591f, anonymousClass2Vi2, true, null, f49558p);
            return;
        }
        m22727E(anonymousClass2Vh2, anonymousClass2Vi2, true, true, r10.f49568I);
    }
}
