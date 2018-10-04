package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Shader.TileMode;
import java.util.Map;

/* renamed from: X.2RS */
public final class AnonymousClass2RS extends AnonymousClass1vB {
    /* renamed from: B */
    private Paint f30419B;
    /* renamed from: C */
    private LinearGradient[] f30420C;
    /* renamed from: D */
    private Path f30421D;
    /* renamed from: E */
    private byte f30422E;
    /* renamed from: F */
    private byte f30423F;
    /* renamed from: G */
    private Paint f30424G;

    /* renamed from: B */
    public final boolean mo3000B() {
        return false;
    }

    public AnonymousClass2RS(AnonymousClass2Ra anonymousClass2Ra, AnonymousClass2RV[] anonymousClass2RVArr, AnonymousClass2RY[] anonymousClass2RYArr, Map map, float f, float f2) {
        super(anonymousClass2Ra, anonymousClass2RVArr, anonymousClass2RYArr, map, f, f2);
        if (this.f24129H.f30458G != null) {
            this.f30420C = new LinearGradient[(((int) (this.f24132K * (this.f24141T - this.f24128G))) + 1)];
        }
        this.f30422E = this.f24129H.f30469R;
        this.f30423F = this.f24129H.f30470S;
    }

    /* renamed from: D */
    public static void m15731D(AnonymousClass2RS anonymousClass2RS, float f) {
        AnonymousClass1vB anonymousClass1vB = anonymousClass2RS;
        AnonymousClass2RZ anonymousClass2RZ = anonymousClass2RS.f24129H.f30458G;
        AnonymousClass2dS anonymousClass2dS = anonymousClass2RS.f24129H.f30456E;
        if (anonymousClass2RZ == null) {
            if (anonymousClass2dS == null) {
                return;
            }
        }
        if (anonymousClass2RS.f30419B == null) {
            anonymousClass2RS.f30419B = new Paint(1);
        }
        float f2 = f;
        if (anonymousClass2RZ != null) {
            int length = f >= anonymousClass2RS.f24141T ? anonymousClass2RS.f30420C.length - 1 : (int) ((f - anonymousClass2RS.f24128G) * anonymousClass2RS.f24132K);
            LinearGradient[] linearGradientArr = anonymousClass2RS.f30420C;
            if (linearGradientArr[length] == null) {
                float f3 = anonymousClass2RS.f24138Q;
                float f4 = anonymousClass2RS.f24139R;
                float f5 = anonymousClass2RS.f24127F;
                AnonymousClass2RW B = AnonymousClass1vH.m13741B(anonymousClass2RZ.f30450C, f2, f5);
                int argb = Color.argb(B.f30432B, B.f30435E, B.f30434D, B.f30433C);
                B = AnonymousClass1vH.m13741B(anonymousClass2RZ.f30449B, f2, f5);
                anonymousClass2RS = Color.argb(B.f30432B, B.f30435E, B.f30434D, B.f30433C);
                AnonymousClass2Rd B2 = AnonymousClass1vJ.m13743B(anonymousClass2RZ.f30452E, f2, f5);
                float f6 = B2.f30483B * f3;
                float f7 = B2.f30484C * f4;
                B2 = AnonymousClass1vJ.m13743B(anonymousClass2RZ.f30451D, f2, f5);
                linearGradientArr[length] = new LinearGradient(f6, f7, B2.f30483B * f3, B2.f30484C * f4, argb, anonymousClass2RS, TileMode.CLAMP);
            }
            anonymousClass1vB.f30419B.setShader(anonymousClass1vB.f30420C[length]);
        }
        if (anonymousClass2dS != null) {
            B = AnonymousClass1vH.m13741B(anonymousClass2dS, f2, anonymousClass1vB.f24127F);
            if (B != null) {
                anonymousClass1vB.f30419B.setARGB(B.f30432B, B.f30435E, B.f30434D, B.f30433C);
                anonymousClass1vB.f30419B.setStyle(Style.FILL);
            }
        }
    }

    /* renamed from: E */
    public static void m15732E(AnonymousClass2RS anonymousClass2RS, float f) {
        AnonymousClass2dS anonymousClass2dS = anonymousClass2RS.f24129H.f30468Q;
        AnonymousClass2dV anonymousClass2dV = anonymousClass2RS.f24129H.f30471T;
        AnonymousClass2dV anonymousClass2dV2 = anonymousClass2RS.f24129H.f30460I;
        if (anonymousClass2dS == null) {
            if (anonymousClass2dV == null) {
                return;
            }
        }
        if (anonymousClass2RS.f30424G == null) {
            Paint paint = new Paint(1);
            anonymousClass2RS.f30424G = paint;
            paint.setStrokeCap(Cap.values()[anonymousClass2RS.f30422E]);
            anonymousClass2RS.f30424G.setStrokeJoin(Join.values()[anonymousClass2RS.f30423F]);
        }
        if (anonymousClass2dS != null) {
            AnonymousClass2RW B = AnonymousClass1vH.m13741B(anonymousClass2dS, f, anonymousClass2RS.f24127F);
            if (B != null) {
                anonymousClass2RS.f30424G.setARGB(B.f30432B, B.f30435E, B.f30434D, B.f30433C);
                anonymousClass2RS.f30424G.setStyle(Style.STROKE);
            }
        }
        if (anonymousClass2dV != null) {
            anonymousClass2RS.f30424G.setStrokeWidth(anonymousClass2RS.m13730I(AnonymousClass1vL.m13745B(anonymousClass2dV, f, anonymousClass2RS.f24127F)));
        }
        if (anonymousClass2dV2 != null) {
            anonymousClass2RS.f30424G.setStrokeMiter(anonymousClass2RS.m13730I(AnonymousClass1vL.m13745B(anonymousClass2dV2, f, anonymousClass2RS.f24127F)));
        }
    }

    /* renamed from: E */
    public final void mo3001E(Canvas canvas) {
        Path path = this.f30421D;
        if (path != null) {
            Paint paint = this.f30419B;
            if (paint != null) {
                canvas.drawPath(path, paint);
            }
            Paint paint2 = this.f30424G;
            if (paint2 != null) {
                canvas.drawPath(this.f30421D, paint2);
            }
        }
    }

    /* renamed from: G */
    public final void mo3002G(float f, float f2) {
        super.mo3002G(f, f2);
        if (this.f30420C != null) {
            int i = 0;
            while (true) {
                LinearGradient[] linearGradientArr = this.f30420C;
                if (i >= linearGradientArr.length) {
                    break;
                }
                linearGradientArr[i] = null;
                i++;
            }
        }
        this.f30421D = null;
    }

    /* renamed from: H */
    public final void mo3003H(float f) {
        this.f30421D = AnonymousClass1vT.m13772C(f, this.f24129H.f30462K, this.f30421D, this.f24127F, this.f24138Q, this.f24139R);
        AnonymousClass2RS.m15731D(this, f);
        AnonymousClass2RS.m15732E(this, f);
        if (this.f24133L != 255) {
            Paint paint = this.f30419B;
            if (paint != null) {
                paint.setAlpha(this.f24133L);
            }
            paint = this.f30424G;
            if (paint != null) {
                paint.setAlpha(this.f24133L);
            }
        }
    }
}
