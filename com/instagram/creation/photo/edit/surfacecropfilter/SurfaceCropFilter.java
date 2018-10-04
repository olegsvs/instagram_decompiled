package com.instagram.creation.photo.edit.surfacecropfilter;

import X.AnonymousClass25d;
import X.AnonymousClass25e;
import X.AnonymousClass28h;
import X.AnonymousClass28j;
import X.AnonymousClass28k;
import X.AnonymousClass2Mp;
import X.AnonymousClass2N8;
import X.AnonymousClass2N9;
import X.AnonymousClass2NA;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eF;
import X.AnonymousClass2eK;
import X.AnonymousClass3HH;
import X.AnonymousClass3HI;
import X.AnonymousClass3HJ;
import X.AnonymousClass3HK;
import X.AnonymousClass3HT;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.math.Matrix3;
import com.instagram.common.math.Matrix4;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.util.creation.ShaderBridge;

public class SurfaceCropFilter extends BaseSimpleFilter {
    public static final Creator CREATOR = new AnonymousClass3HH();
    /* renamed from: X */
    private static final AnonymousClass2N8[] f50070X = new AnonymousClass2N8[4];
    /* renamed from: Y */
    public static final AnonymousClass25e[] f50071Y = new AnonymousClass25e[4];
    /* renamed from: Z */
    public static final double f50072Z;
    /* renamed from: a */
    private static final double f50073a;
    /* renamed from: B */
    public float f50074B;
    /* renamed from: C */
    public float f50075C;
    /* renamed from: D */
    public Matrix4 f50076D;
    /* renamed from: E */
    public AnonymousClass3HJ f50077E;
    /* renamed from: F */
    public int f50078F;
    /* renamed from: G */
    public Matrix4 f50079G;
    /* renamed from: H */
    public boolean f50080H;
    /* renamed from: I */
    public boolean f50081I;
    /* renamed from: J */
    public boolean f50082J;
    /* renamed from: K */
    public Matrix4 f50083K;
    /* renamed from: L */
    public final AnonymousClass3HJ f50084L;
    /* renamed from: M */
    public AnonymousClass3HK f50085M;
    /* renamed from: N */
    private final float[] f50086N;
    /* renamed from: O */
    private int f50087O;
    /* renamed from: P */
    private int f50088P;
    /* renamed from: Q */
    private float f50089Q;
    /* renamed from: R */
    private final AnonymousClass3HI f50090R;
    /* renamed from: S */
    private final PointF f50091S;
    /* renamed from: T */
    private boolean f50092T;
    /* renamed from: U */
    private boolean f50093U;
    /* renamed from: V */
    private AnonymousClass2eF f50094V;
    /* renamed from: W */
    private AnonymousClass2eK f50095W;

    static {
        AnonymousClass2N8[] anonymousClass2N8Arr = f50070X;
        int i = 0;
        anonymousClass2N8Arr[0] = new AnonymousClass2N8(-1.0d, 1.0d);
        anonymousClass2N8Arr[1] = new AnonymousClass2N8(-1.0d, -1.0d);
        anonymousClass2N8Arr[2] = new AnonymousClass2N8(1.0d, -1.0d);
        anonymousClass2N8Arr[3] = new AnonymousClass2N8(1.0d, 1.0d);
        double d = anonymousClass2N8Arr[2].f29618B - anonymousClass2N8Arr[1].f29618B;
        f50072Z = d;
        f50073a = d * 1.001d;
        while (i < 4) {
            f50071Y[i] = new AnonymousClass25e((float) anonymousClass2N8Arr[i].f29618B, (float) anonymousClass2N8Arr[i].f29619C, 0.0f, 1.0f);
            i++;
        }
    }

    public SurfaceCropFilter() {
        this.f50082J = true;
        this.f50077E = new AnonymousClass3HJ();
        this.f50084L = new AnonymousClass3HJ();
        this.f50083K = new Matrix4();
        this.f50076D = new Matrix4();
        this.f50079G = new Matrix4();
        this.f50085M = new AnonymousClass3HK(this);
        this.f50074B = 1.0f;
        this.f50075C = 1.0f;
        this.f50091S = new PointF();
        this.f50090R = new AnonymousClass3HI();
        this.f50086N = new float[3];
    }

    public SurfaceCropFilter(Parcel parcel) {
        super(parcel);
        this.f50082J = true;
        this.f50077E = new AnonymousClass3HJ();
        this.f50084L = new AnonymousClass3HJ();
        this.f50083K = new Matrix4();
        this.f50076D = new Matrix4();
        this.f50079G = new Matrix4();
        this.f50085M = new AnonymousClass3HK(this);
        this.f50074B = 1.0f;
        this.f50075C = 1.0f;
        this.f50091S = new PointF();
        this.f50090R = new AnonymousClass3HI();
        this.f50086N = new float[3];
        this.f50084L.f39780I = parcel.readFloat();
        this.f50084L.f39773B = parcel.readFloat();
        this.f50084L.f39774C = parcel.readFloat();
        this.f50084L.f39775D = parcel.readFloat();
        this.f50084L.f39777F = parcel.readFloat();
        this.f50084L.f39778G = parcel.readFloat();
        this.f50084L.f39779H = parcel.readFloat();
        this.f50084L.f39776E = parcel.readInt();
        this.f50081I = parcel.readByte() == (byte) 1;
        this.f50093U = true;
        this.f50077E.m19234A(this.f50084L);
    }

    /* renamed from: A */
    public final void mo5432A(AnonymousClass2Vi anonymousClass2Vi) {
        if (this.f50092T) {
            GLES20.glBindFramebuffer(36160, anonymousClass2Vi.QM());
            AnonymousClass28j.m14579B("SurfaceCropFilter.clearFrameBuffer:glBindFramebuffer");
            float[] fArr = this.f50086N;
            GLES20.glClearColor(fArr[0], fArr[1], fArr[2], 1.0f);
            GLES20.glClear(16384);
        }
    }

    /* renamed from: B */
    public final AnonymousClass28h mo5433B(AnonymousClass28k anonymousClass28k) {
        int compileProgram = ShaderBridge.compileProgram("Identity");
        if (compileProgram == 0) {
            return null;
        }
        AnonymousClass28h anonymousClass28h = new AnonymousClass28h(compileProgram);
        this.f50094V = (AnonymousClass2eF) anonymousClass28h.m14572B("u_enableVertexTransform");
        this.f50095W = (AnonymousClass2eK) anonymousClass28h.m14572B("u_vertexTransform");
        return anonymousClass28h;
    }

    /* renamed from: B */
    public static PointF m23024B(SurfaceCropFilter surfaceCropFilter) {
        return m23031I(surfaceCropFilter.f50083K, surfaceCropFilter.f50077E.f39774C, surfaceCropFilter.f50077E.f39775D);
    }

    /* renamed from: C */
    public static PointF m23025C(SurfaceCropFilter surfaceCropFilter, float f, float f2) {
        Matrix3 matrix3 = new Matrix3();
        float[] fArr = surfaceCropFilter.f50083K.f18004B;
        float[] fArr2 = matrix3.f25776B;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[3];
        fArr2[3] = fArr[4];
        fArr2[4] = fArr[5];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[12];
        fArr2[7] = fArr[13];
        fArr2[8] = fArr[15];
        AnonymousClass25d anonymousClass25d = new AnonymousClass25d(f, f2, 1.0f);
        float[] fArr3 = matrix3.f25776B;
        f2 = ((fArr3[0] * ((fArr3[4] * fArr3[8]) - (fArr3[7] * fArr3[5]))) + (fArr3[3] * ((fArr3[7] * fArr3[2]) - (fArr3[1] * fArr3[8])))) + (fArr3[6] * ((fArr3[1] * fArr3[5]) - (fArr3[4] * fArr3[2])));
        r6 = new float[9];
        fArr3 = matrix3.f25776B;
        int i = 0;
        r6[0] = (fArr3[4] * fArr3[8]) - (fArr3[7] * fArr3[5]);
        r6[1] = (fArr3[7] * fArr3[2]) - (fArr3[1] * fArr3[8]);
        r6[2] = (fArr3[1] * fArr3[5]) - (fArr3[4] * fArr3[2]);
        r6[3] = (fArr3[6] * fArr3[5]) - (fArr3[3] * fArr3[8]);
        r6[4] = (fArr3[0] * fArr3[8]) - (fArr3[6] * fArr3[2]);
        r6[5] = (fArr3[3] * fArr3[2]) - (fArr3[0] * fArr3[5]);
        r6[6] = (fArr3[3] * fArr3[7]) - (fArr3[6] * fArr3[4]);
        r6[7] = (fArr3[6] * fArr3[1]) - (fArr3[0] * fArr3[7]);
        r6[8] = (fArr3[0] * fArr3[4]) - (fArr3[3] * fArr3[1]);
        while (i < 9) {
            matrix3.f25776B[i] = r6[i] / f2;
            i++;
        }
        AnonymousClass25d anonymousClass25d2 = new AnonymousClass25d();
        anonymousClass25d2.f25778B = ((matrix3.f25776B[0] * anonymousClass25d.f25778B) + (matrix3.f25776B[3] * anonymousClass25d.f25779C)) + (matrix3.f25776B[6] * anonymousClass25d.f25780D);
        anonymousClass25d2.f25779C = ((matrix3.f25776B[1] * anonymousClass25d.f25778B) + (matrix3.f25776B[4] * anonymousClass25d.f25779C)) + (matrix3.f25776B[7] * anonymousClass25d.f25780D);
        anonymousClass25d2.f25780D = ((matrix3.f25776B[2] * anonymousClass25d.f25778B) + (matrix3.f25776B[5] * anonymousClass25d.f25779C)) + (matrix3.f25776B[8] * anonymousClass25d.f25780D);
        return new PointF(anonymousClass25d2.f25778B / anonymousClass25d2.f25780D, anonymousClass25d2.f25779C / anonymousClass25d2.f25780D);
    }

    /* renamed from: D */
    public static synchronized void m23026D(SurfaceCropFilter surfaceCropFilter, float f, float f2) {
        synchronized (surfaceCropFilter) {
            surfaceCropFilter.f50077E.f39774C = f;
            surfaceCropFilter.f50077E.f39775D = f2;
            surfaceCropFilter.f50077E.f39773B = m23029G(surfaceCropFilter, surfaceCropFilter.f50083K, surfaceCropFilter.f50077E.f39774C, surfaceCropFilter.f50077E.f39775D);
        }
    }

    /* renamed from: E */
    public final synchronized void mo5436E(AnonymousClass28h anonymousClass28h, AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        anonymousClass28h.m14576F("image", anonymousClass2Vh.getTextureId());
        this.f50094V.m16728C(true);
        this.f50095W.m16735C(this.f50079G.f18005C);
    }

    /* renamed from: E */
    public static synchronized void m23027E(SurfaceCropFilter surfaceCropFilter) {
        synchronized (surfaceCropFilter) {
            surfaceCropFilter.f50085M.f39784E = false;
            surfaceCropFilter.f50085M.f39781B = false;
            surfaceCropFilter.f50085M.f39782C = true;
            surfaceCropFilter.f50085M.f39783D = true;
            surfaceCropFilter.f50085M.f39785F = true;
            m23028F(surfaceCropFilter);
        }
    }

    /* renamed from: F */
    public static synchronized void m23028F(SurfaceCropFilter surfaceCropFilter) {
        synchronized (surfaceCropFilter) {
            float f;
            if (surfaceCropFilter.f50085M.f39784E) {
                surfaceCropFilter.f50083K.F();
                float[] fArr = new float[16];
                Matrix.frustumM(fArr, 0, -0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 4.0f);
                surfaceCropFilter.f50083K.B(fArr);
                Matrix4 matrix4 = new Matrix4();
                Matrix.translateM(matrix4.f18004B, 0, 0.0f, 0.0f, -2.0f);
                surfaceCropFilter.f50083K.A(matrix4);
                float f2 = -surfaceCropFilter.f50077E.f39779H;
                Matrix4 matrix42 = new Matrix4();
                matrix42.D(f2);
                surfaceCropFilter.f50083K.A(matrix42);
                float f3 = surfaceCropFilter.f50077E.f39778G;
                matrix42 = new Matrix4();
                Matrix.rotateM(matrix42.f18004B, 0, f3, 0.0f, 1.0f, 0.0f);
                surfaceCropFilter.f50083K.A(matrix42);
                f3 = surfaceCropFilter.f50077E.f39777F;
                matrix42 = new Matrix4();
                Matrix.rotateM(matrix42.f18004B, 0, f3, 1.0f, 0.0f, 0.0f);
                surfaceCropFilter.f50083K.A(matrix42);
                f2 = (float) (surfaceCropFilter.f50077E.f39776E + surfaceCropFilter.f50078F);
                matrix42 = new Matrix4();
                matrix42.D(f2);
                surfaceCropFilter.f50083K.A(matrix42);
                float f4 = surfaceCropFilter.f50074B;
                if (f4 < 1.0f) {
                    matrix42 = Matrix4.B(f4, 1.0f, 1.0f);
                } else {
                    matrix42 = Matrix4.B(1.0f, 1.0f / f4, 1.0f);
                }
                surfaceCropFilter.f50083K.A(matrix42);
                f = Float.MAX_VALUE;
                for (int i = 0; i < 4; i++) {
                    AnonymousClass25e C = surfaceCropFilter.f50083K.C(f50071Y[i]);
                    f = Math.min(f, Math.min(1.0f / Math.abs(C.f25782C / C.f25781B), 1.0f / Math.abs(C.f25783D / C.f25781B)));
                }
                matrix42 = Matrix4.B(f, f, 1.0f);
                matrix42.A(surfaceCropFilter.f50083K);
                surfaceCropFilter.f50083K = matrix42;
            }
            if (surfaceCropFilter.f50085M.f39781B) {
                float G = m23029G(surfaceCropFilter, surfaceCropFilter.f50083K, surfaceCropFilter.f50077E.f39774C, surfaceCropFilter.f50077E.f39775D);
                AnonymousClass3HJ anonymousClass3HJ = surfaceCropFilter.f50077E;
                anonymousClass3HJ.f39780I *= G / surfaceCropFilter.f50077E.f39773B;
                surfaceCropFilter.f50077E.f39773B = G;
            }
            if (surfaceCropFilter.f50085M.f39782C) {
                PointF B = m23024B(surfaceCropFilter);
                surfaceCropFilter.f50076D.F();
                if (surfaceCropFilter.f50075C < 1.0f) {
                    surfaceCropFilter.f50076D.E(surfaceCropFilter.f50077E.f39780I / surfaceCropFilter.f50075C, surfaceCropFilter.f50077E.f39780I, 1.0f);
                } else {
                    surfaceCropFilter.f50076D.E(surfaceCropFilter.f50077E.f39780I, surfaceCropFilter.f50077E.f39780I * surfaceCropFilter.f50075C, 1.0f);
                }
                f = -B.x;
                f3 = -B.y;
                Matrix4 matrix43 = new Matrix4();
                Matrix.translateM(matrix43.f18004B, 0, f, f3, 0.0f);
                surfaceCropFilter.f50076D.A(matrix43);
            }
            if (surfaceCropFilter.f50085M.f39783D) {
                surfaceCropFilter.f50079G.G(surfaceCropFilter.f50076D);
                surfaceCropFilter.f50079G.A(surfaceCropFilter.f50083K);
                surfaceCropFilter.f50079G.A(Matrix4.B(surfaceCropFilter.f50081I ? -1.0f : 1.0f, -1.0f, 1.0f));
            }
            if (surfaceCropFilter.f50085M.f39785F) {
                surfaceCropFilter.invalidate();
            }
            AnonymousClass3HK anonymousClass3HK = surfaceCropFilter.f50085M;
            anonymousClass3HK.f39784E = false;
            anonymousClass3HK.f39781B = false;
            anonymousClass3HK.f39782C = false;
            anonymousClass3HK.f39783D = false;
            anonymousClass3HK.f39785F = false;
        }
    }

    /* renamed from: F */
    public final synchronized boolean m23041F(AnonymousClass3HI anonymousClass3HI) {
        float min;
        PointF pointF;
        AnonymousClass2N8[] K = m23033K(this.f50079G);
        boolean C = AnonymousClass2N9.m15296C(K, f50070X);
        float f = this.f50077E.f39780I;
        if (!C) {
            min = Math.min(m23032J(K), this.f50089Q);
        } else if (f <= this.f50089Q) {
            return false;
        } else {
            min = this.f50089Q;
        }
        this.f50077E.f39780I = min;
        m23036N();
        AnonymousClass2N8[] K2 = m23033K(this.f50079G);
        boolean C2 = AnonymousClass2N9.m15296C(K2, f50070X);
        this.f50091S.set(0.0f, 0.0f);
        if (!C2) {
            pointF = this.f50091S;
            AnonymousClass2N8[] E = AnonymousClass2N9.m15298E(K2, f50072Z);
            if (E.length != 0) {
                AnonymousClass2N8 D = AnonymousClass2N9.m15297D(new AnonymousClass2N8(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED), E);
                pointF.x = (float) D.f29618B;
                pointF.y = (float) D.f29619C;
            } else {
                pointF.x = 0.0f;
                pointF.y = 0.0f;
            }
        }
        pointF = m23024B(this);
        PointF C3 = m23025C(this, pointF.x + (this.f50091S.x / this.f50077E.f39780I), pointF.y + (this.f50091S.y / this.f50077E.f39780I));
        this.f50077E.f39780I = f;
        m23036N();
        anonymousClass3HI.f39772D = min;
        anonymousClass3HI.f39770B = C3.x;
        anonymousClass3HI.f39771C = C3.y;
        return true;
    }

    /* renamed from: G */
    public static float m23029G(SurfaceCropFilter surfaceCropFilter, Matrix4 matrix4, float f, float f2) {
        PointF I = m23031I(matrix4, f, f2);
        float f3 = surfaceCropFilter.f50075C;
        if (f3 > 1.0f) {
            I.x /= surfaceCropFilter.f50075C;
        } else if (f3 < 1.0f) {
            I.y *= surfaceCropFilter.f50075C;
        }
        PointF[] pointFArr = new PointF[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            PointF I2 = m23031I(matrix4, f50071Y[i2].f25782C, f50071Y[i2].f25783D);
            f3 = surfaceCropFilter.f50075C;
            if (f3 > 1.0f) {
                I2.x /= surfaceCropFilter.f50075C;
            } else if (f3 < 1.0f) {
                I2.y *= surfaceCropFilter.f50075C;
            }
            pointFArr[i2] = I2;
        }
        float f4 = Float.MAX_VALUE;
        while (i < 4) {
            i++;
            int i3 = i % 4;
            f4 = Math.min(f4, m23030H(pointFArr[i].x, pointFArr[i].y, pointFArr[i3].x, pointFArr[i3].y, I.x, I.y));
        }
        return 1.0f / f4;
    }

    /* renamed from: G */
    public final Point m23042G() {
        int i;
        int i2;
        int i3 = this.f50088P;
        int i4 = this.f50087O;
        if (i3 > i4) {
            i = (int) ((((float) i3) / this.f50077E.f39780I) + 0.5f);
            i2 = (int) ((((float) this.f50088P) / (this.f50077E.f39780I * this.f50075C)) + 0.5f);
        } else {
            i2 = (int) ((((float) i4) / this.f50077E.f39780I) + 0.5f);
            i = (int) (((this.f50075C * ((float) this.f50087O)) / this.f50077E.f39780I) + 0.5f);
        }
        if (!this.f50080H) {
            if (!AnonymousClass2Mp.m15244C(((float) i) / ((float) i2))) {
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("size:%d x %d  input:%d x %d  scale:%f cropAspectRatio:%f", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f50088P), Integer.valueOf(this.f50087O), Float.valueOf(this.f50077E.f39780I), Float.valueOf(this.f50075C)});
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Aspect ratio error: ");
                stringBuilder.append(formatStrLocaleSafe);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return new Point(i, i2);
    }

    /* renamed from: H */
    private static float m23030H(float f, float f2, float f3, float f4, float f5, float f6) {
        if (Math.abs(f - f3) < 1.0E-7f) {
            return Math.abs(f5 - f);
        }
        f4 = (f4 - f2) / (f3 - f);
        float f7 = Float.MAX_VALUE;
        if (Math.abs(f4 - 1.0f) > 1.0E-7f) {
            f7 = Math.min(Float.MAX_VALUE, Math.abs((((f2 - (f4 * f)) - (f6 - f5)) / (1.0f - f4)) - f5));
        }
        float f8 = 1.0f + f4;
        if (Math.abs(f8) > 1.0E-7f) {
            f7 = Math.min(f7, Math.abs(((((f4 * f) - f2) + (f6 + f5)) / f8) - f5));
        }
        return f7;
    }

    /* renamed from: H */
    public final synchronized void m23043H(AnonymousClass3HI anonymousClass3HI) {
        anonymousClass3HI.f39772D = this.f50077E.f39780I;
        anonymousClass3HI.f39770B = this.f50077E.f39774C;
        anonymousClass3HI.f39771C = this.f50077E.f39775D;
    }

    /* renamed from: I */
    private static PointF m23031I(Matrix4 matrix4, float f, float f2) {
        f = matrix4.C(new AnonymousClass25e(f, f2, 0.0f, 1.0f));
        return new PointF(f.f25782C / f.f25781B, f.f25783D / f.f25781B);
    }

    /* renamed from: I */
    public final synchronized void m23044I(AnonymousClass3HJ anonymousClass3HJ) {
        anonymousClass3HJ.m19234A(this.f50077E);
    }

    /* renamed from: J */
    private float m23032J(AnonymousClass2N8[] anonymousClass2N8Arr) {
        double d;
        AnonymousClass2N8[] anonymousClass2N8Arr2 = anonymousClass2N8Arr;
        int length = anonymousClass2N8Arr2.length;
        double d2 = -1.7976931348623157E308d;
        double d3 = Double.MAX_VALUE;
        double d4 = Double.MAX_VALUE;
        double d5 = -1.7976931348623157E308d;
        for (int i = 0; i < length; i++) {
            AnonymousClass2N8 anonymousClass2N8 = anonymousClass2N8Arr[i];
            d4 = Math.min(d4, anonymousClass2N8.f29618B);
            d5 = Math.max(d5, anonymousClass2N8.f29618B);
            d3 = Math.min(d3, anonymousClass2N8.f29619C);
            d2 = Math.max(d2, anonymousClass2N8.f29619C);
        }
        d5 = Math.min(d5 - d4, d2 - d3);
        d2 = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        AnonymousClass2N8[] E = AnonymousClass2N9.m15298E(anonymousClass2N8Arr2, d5);
        if (E.length > 0) {
            d2 = d5;
        }
        while (d5 - d2 > AnonymousClass2N9.f29620B) {
            d = (d5 + d2) / 2.0d;
            AnonymousClass2N8[] E2 = AnonymousClass2N9.m15298E(anonymousClass2N8Arr2, d);
            if (E2.length > 0) {
                E = E2;
                d2 = d;
            } else {
                d5 = d;
            }
        }
        AnonymousClass2N8 anonymousClass2N82 = new AnonymousClass2N8();
        for (int i2 = 0; i2 < E.length; i2++) {
            anonymousClass2N82.f29618B += E[i2].f29618B;
            anonymousClass2N82.f29619C += E[i2].f29619C;
        }
        d5 = anonymousClass2N82.f29618B;
        d = (double) E.length;
        Double.isNaN(d);
        anonymousClass2N82.f29618B = d5 / d;
        d5 = anonymousClass2N82.f29619C;
        d = (double) E.length;
        Double.isNaN(d);
        anonymousClass2N82.f29619C = d5 / d;
        d2 /= 2.0d;
        AnonymousClass2NA anonymousClass2NA = new AnonymousClass2NA(anonymousClass2N82.f29618B - d2, anonymousClass2N82.f29619C - d2, anonymousClass2N82.f29618B + d2, anonymousClass2N82.f29619C + d2);
        double max = Math.max(anonymousClass2NA.f29623D - anonymousClass2NA.f29622C, anonymousClass2NA.f29621B - anonymousClass2NA.f29624E);
        double d6 = f50073a;
        SurfaceCropFilter surfaceCropFilter = this;
        if (max >= d6) {
            return surfaceCropFilter.f50077E.f39780I;
        }
        return surfaceCropFilter.f50077E.f39780I * ((float) (d6 / max));
    }

    /* renamed from: J */
    public final boolean m23045J() {
        if (this.f50077E.f39777F == 0.0f && this.f50077E.f39778G == 0.0f) {
            if (this.f50077E.f39779H == 0.0f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: K */
    public final synchronized void m23046K(float f, float f2) {
        PointF B = m23024B(this);
        B.x += ((-f) * 2.0f) / this.f50077E.f39780I;
        B.y += (f2 * 2.0f) / this.f50077E.f39780I;
        PointF C = m23025C(this, B.x, B.y);
        m23026D(this, C.x, C.y);
        m23027E(this);
    }

    /* renamed from: K */
    private static AnonymousClass2N8[] m23033K(Matrix4 matrix4) {
        AnonymousClass2N8[] anonymousClass2N8Arr = new AnonymousClass2N8[4];
        for (int i = 0; i < 4; i++) {
            AnonymousClass25e C = matrix4.C(f50071Y[i]);
            anonymousClass2N8Arr[i] = new AnonymousClass2N8((double) (C.f25782C / C.f25781B), (double) (C.f25783D / C.f25781B));
        }
        AnonymousClass2N9.m15300G(anonymousClass2N8Arr);
        return anonymousClass2N8Arr;
    }

    /* renamed from: L */
    private synchronized void m23034L() {
        this.f50085M.f39784E = true;
        this.f50085M.f39781B = true;
        this.f50085M.f39782C = true;
        this.f50085M.f39783D = true;
        this.f50085M.f39785F = true;
        m23028F(this);
    }

    /* renamed from: L */
    public final synchronized void m23047L(int i, int i2, Rect rect, int i3) {
        this.f50082J = false;
        float f = (float) i;
        float f2 = (float) i2;
        this.f50074B = f / f2;
        m23037O();
        AnonymousClass3HT anonymousClass3HT = new AnonymousClass3HT(f, f2, rect);
        this.f50077E.f39780I = 1.0f;
        PointF C = m23025C(this, anonymousClass3HT.f39808B, -anonymousClass3HT.f39809C);
        m23026D(this, C.x, C.y);
        m23036N();
        this.f50077E.f39780I = anonymousClass3HT.f39810D;
        m23027E(this);
        this.f50089Q = ((float) (i > i2 ? i : i2)) / 320.0f;
        this.f50089Q = Math.max(this.f50077E.f39780I * 3.8f, this.f50089Q);
        if (i3 != 0) {
            if (!this.f50081I) {
                i3 = -i3;
            }
            this.f50078F = i3;
        }
        if (this.f50078F % 180 == 0) {
            this.f50088P = i;
            this.f50087O = i2;
            this.f50075C = ((float) rect.width()) / ((float) rect.height());
        } else {
            this.f50088P = i2;
            this.f50087O = i;
            this.f50075C = ((float) rect.height()) / ((float) rect.width());
        }
        if (this.f50093U) {
            this.f50093U = false;
            this.f50077E.m19234A(this.f50084L);
        }
        synchronized (this) {
            this.f50085M.f39784E = true;
            this.f50085M.f39781B = false;
            this.f50085M.f39782C = true;
            this.f50085M.f39783D = true;
            this.f50085M.f39785F = true;
            m23028F(this);
        }
    }

    /* renamed from: M */
    private synchronized void m23035M() {
        m23034L();
        if (this.f50077E.f39780I > this.f50089Q) {
            m23041F(this.f50090R);
            m23049N(this.f50090R, false);
        }
        invalidate();
    }

    /* renamed from: M */
    public final synchronized void m23048M(AnonymousClass3HI anonymousClass3HI) {
        m23049N(anonymousClass3HI, true);
    }

    /* renamed from: N */
    private synchronized void m23036N() {
        this.f50085M.f39784E = false;
        this.f50085M.f39781B = false;
        this.f50085M.f39782C = true;
        this.f50085M.f39783D = true;
        this.f50085M.f39785F = false;
        m23028F(this);
    }

    /* renamed from: N */
    public final synchronized void m23049N(AnonymousClass3HI anonymousClass3HI, boolean z) {
        this.f50077E.f39780I = anonymousClass3HI.f39772D;
        m23026D(this, anonymousClass3HI.f39770B, anonymousClass3HI.f39771C);
        this.f50085M.f39784E = false;
        this.f50085M.f39781B = false;
        this.f50085M.f39782C = true;
        this.f50085M.f39783D = true;
        this.f50085M.f39785F = z;
        m23028F(this);
    }

    /* renamed from: O */
    private synchronized void m23037O() {
        this.f50085M.f39784E = true;
        this.f50085M.f39781B = true;
        this.f50085M.f39782C = false;
        this.f50085M.f39783D = false;
        this.f50085M.f39785F = false;
        m23028F(this);
    }

    /* renamed from: O */
    public final synchronized void m23050O(boolean z) {
        this.f50081I = z;
        m23034L();
    }

    /* renamed from: P */
    public final synchronized void m23051P(int i) {
        this.f50077E.f39776E = i;
        m23034L();
    }

    /* renamed from: Q */
    public final synchronized void m23052Q(float f) {
        if (this.f50077E.f39777F != f) {
            this.f50077E.f39777F = f;
            m23035M();
        }
    }

    /* renamed from: R */
    public final synchronized void m23053R(float f) {
        if (this.f50077E.f39778G != f) {
            this.f50077E.f39778G = f;
            m23035M();
        }
    }

    /* renamed from: S */
    public final synchronized void m23054S(float f) {
        if (this.f50077E.f39779H != f) {
            this.f50077E.f39779H = f;
            m23035M();
        }
    }

    /* renamed from: T */
    public final synchronized void m23055T(AnonymousClass3HJ anonymousClass3HJ) {
        this.f50077E.f39777F = anonymousClass3HJ.f39777F;
        this.f50077E.f39778G = anonymousClass3HJ.f39778G;
        this.f50077E.f39779H = anonymousClass3HJ.f39779H;
        this.f50077E.f39776E = anonymousClass3HJ.f39776E;
        m23037O();
        this.f50077E.f39780I = anonymousClass3HJ.f39780I;
        this.f50077E.f39773B = anonymousClass3HJ.f39773B;
        this.f50077E.f39774C = anonymousClass3HJ.f39774C;
        this.f50077E.f39775D = anonymousClass3HJ.f39775D;
        m23027E(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f50077E.f39780I);
        parcel.writeFloat(this.f50077E.f39773B);
        parcel.writeFloat(this.f50077E.f39774C);
        parcel.writeFloat(this.f50077E.f39775D);
        parcel.writeFloat(this.f50077E.f39777F);
        parcel.writeFloat(this.f50077E.f39778G);
        parcel.writeFloat(this.f50077E.f39779H);
        parcel.writeInt(this.f50077E.f39776E);
        parcel.writeByte((byte) this.f50081I);
    }
}
