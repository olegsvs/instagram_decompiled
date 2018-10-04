package X;

import android.content.Context;
import android.graphics.Point;
import com.fasterxml.jackson.databind.JsonMappingException;

/* renamed from: X.2Ms */
public final class AnonymousClass2Ms {
    /* renamed from: B */
    public Point f29589B;
    /* renamed from: C */
    private final AnonymousClass2Mm f29590C;
    /* renamed from: D */
    private final Context f29591D;
    /* renamed from: E */
    private final AnonymousClass0OA f29592E;

    public AnonymousClass2Ms(AnonymousClass0OA anonymousClass0OA, Context context) {
        this.f29591D = context;
        this.f29592E = anonymousClass0OA;
        this.f29589B = AnonymousClass2Mv.m15263B(context, this.f29592E.f3795I, this.f29592E.bC.f17224U);
        AnonymousClass2Mm anonymousClass2Mm = new AnonymousClass2Mm();
        if (anonymousClass0OA.PB) {
            anonymousClass2Mm.f29580F = ((Double) AnonymousClass0CC.Jb.G()).doubleValue();
            anonymousClass2Mm.f29578D = ((Double) AnonymousClass0CC.hk.f1491B).doubleValue();
            anonymousClass2Mm.f29579E = ((Double) AnonymousClass0CC.Jb.G()).doubleValue();
            anonymousClass2Mm.f29577C = ((Double) AnonymousClass0CC.Bj.f1491B).doubleValue();
            anonymousClass2Mm.f29576B = ((Double) AnonymousClass0CC.Aj.f1491B).doubleValue();
        } else {
            anonymousClass2Mm.f29580F = ((Double) AnonymousClass0CC.jk.G()).doubleValue();
            anonymousClass2Mm.f29578D = ((Double) AnonymousClass0CC.hk.G()).doubleValue();
            anonymousClass2Mm.f29579E = ((Double) AnonymousClass0CC.ik.G()).doubleValue();
            anonymousClass2Mm.f29577C = ((Double) AnonymousClass0CC.Bj.G()).doubleValue();
            anonymousClass2Mm.f29576B = ((Double) AnonymousClass0CC.Aj.G()).doubleValue();
        }
        this.f29590C = anonymousClass2Mm;
    }

    /* renamed from: A */
    public final int m15257A() {
        int i = this.f29589B.x;
        int i2 = this.f29589B.y;
        String str = this.f29592E.bC.f17219P;
        Context context = this.f29591D;
        float f = this.f29592E.f3795I;
        Point B = AnonymousClass2Mv.m15263B(context, f, AnonymousClass2Mu.m15259B(context, f, Integer.MAX_VALUE));
        AnonymousClass2Mm anonymousClass2Mm = this.f29590C;
        float f2 = (float) anonymousClass2Mm.f29580F;
        float f3 = ((float) i) / ((float) i2);
        if (((double) f3) < anonymousClass2Mm.f29576B) {
            if (i2 < i) {
                f2 = (float) anonymousClass2Mm.f29580F;
                f2 += Math.min(Math.max((f3 - 1.0f) / 0.7777778f, 0.0f), 1.0f) * (((float) anonymousClass2Mm.f29578D) - f2);
            } else if (i2 > i) {
                f2 = (float) anonymousClass2Mm.f29580F;
                f2 += Math.min(Math.max((f3 - 1.0f) / -0.4375f, 0.0f), 1.0f) * (((float) anonymousClass2Mm.f29579E) - f2);
            }
        }
        if ("boomerang".equals(str)) {
            double d = (double) f2;
            double d2 = anonymousClass2Mm.f29577C;
            Double.isNaN(d);
            f2 = (float) (d * d2);
        }
        int round = Math.round(((float) (i * i2)) * f2);
        int round2 = Math.round(((float) (B.x * B.y)) * f2);
        return (round2 <= round || !((Boolean) AnonymousClass0CC.ol.G()).booleanValue()) ? round : round2;
    }

    /* renamed from: B */
    public final int m15258B() {
        if (this.f29592E.q()) {
            return ((Integer) AnonymousClass0CC.tL.G()).intValue();
        }
        int B = this.f29592E.bC.B();
        int A = m15257A();
        if (this.f29592E.PB) {
            int intValue = ((Integer) AnonymousClass0CC.ql.G()).intValue();
            if (intValue > 0) {
                return intValue;
            }
            A = AnonymousClass2Mr.m15256B(this.f29591D, (A * ((Integer) AnonymousClass0CC.pl.G()).intValue()) / 100, this.f29592E, this.f29589B.x, this.f29589B.y);
        }
        if (B > 0) {
            if (this.f29592E.PB && ((Boolean) AnonymousClass0CC.al.G()).booleanValue()) {
                A = Math.max(Math.min(A, B), m15257A());
            } else if (((Boolean) AnonymousClass0CC.kl.G()).booleanValue()) {
                A = Math.max(Math.min(A, (int) (((float) B) * (((float) ((Integer) AnonymousClass0CC.ml.G()).intValue()) / 100.0f))), ((Integer) AnonymousClass0CC.ll.G()).intValue() * JsonMappingException.MAX_REFS_TO_LIST);
            }
        }
        return A;
    }
}
