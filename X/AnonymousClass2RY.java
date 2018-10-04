package X;

import com.facebook.proxygen.TraceFieldType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2RY */
public final class AnonymousClass2RY extends AnonymousClass1vO implements AnonymousClass1vM {
    /* renamed from: B */
    public AnonymousClass2RV[] f30440B;
    /* renamed from: C */
    public float f30441C;
    /* renamed from: D */
    public float f30442D;
    /* renamed from: E */
    public AnonymousClass2Ra f30443E;
    /* renamed from: F */
    public AnonymousClass2Re f30444F;
    /* renamed from: G */
    public AnonymousClass2RY[] f30445G;
    /* renamed from: H */
    public int f30446H;
    /* renamed from: I */
    private String[] f30447I;
    /* renamed from: J */
    private List f30448J;

    /* renamed from: B */
    public static AnonymousClass2RY m15739B(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            if (AnonymousClass1vN.m13757M(byteBuffer, "KEYF")) {
                AnonymousClass2RY anonymousClass2RY = new AnonymousClass2RY();
                anonymousClass2RY.GW(byteBuffer, AnonymousClass1vN.m13754J(byteBuffer));
                int parseInt = Integer.parseInt("2.7.0".split("\\.")[1]);
                if (anonymousClass2RY.f30446H <= parseInt) {
                    return anonymousClass2RY;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Supported Version:");
                stringBuilder.append(parseInt);
                stringBuilder.append(" Required Version:");
                stringBuilder.append(anonymousClass2RY.f30446H);
                throw new UnsupportedOperationException(stringBuilder.toString());
            }
        }
        return null;
    }

    /* renamed from: C */
    private void m15740C() {
        if (this.f30447I != null) {
            this.f30448J = new ArrayList();
            AnonymousClass2Ra anonymousClass2Ra = this.f30443E;
            List list = this.f30448J;
            String[] strArr = this.f30447I;
            Map hashMap = new HashMap();
            hashMap.put(TraceFieldType.Duration, Float.valueOf(this.f30441C));
            anonymousClass2Ra.m15743A(list, strArr, hashMap);
        }
    }

    /* renamed from: D */
    public final void mo3007D() {
        List<AnonymousClass2Rc> list = this.f30448J;
        if (list != null) {
            for (AnonymousClass2Rc D : list) {
                D.mo3007D();
            }
        }
        AnonymousClass2RY[] anonymousClass2RYArr = this.f30445G;
        if (anonymousClass2RYArr != null) {
            for (AnonymousClass1vO D2 : anonymousClass2RYArr) {
                D2.mo3007D();
            }
        }
    }

    /* renamed from: E */
    public final void mo3008E() {
        List<AnonymousClass2Rc> list = this.f30448J;
        if (list != null) {
            for (AnonymousClass2Rc E : list) {
                E.mo3008E();
            }
        }
        AnonymousClass2RY[] anonymousClass2RYArr = this.f30445G;
        if (anonymousClass2RYArr != null) {
            for (AnonymousClass1vO E2 : anonymousClass2RYArr) {
                E2.mo3008E();
            }
        }
    }

    public final void GW(ByteBuffer byteBuffer, int i) {
        AnonymousClass2Re anonymousClass2Re = new AnonymousClass2Re();
        this.f30444F = anonymousClass2Re;
        anonymousClass2Re.GW(byteBuffer, AnonymousClass1vN.m13752H(byteBuffer, i, 0));
        this.f30442D = AnonymousClass1vN.m13748D(byteBuffer, i, 1, 0.0f);
        this.f30441C = AnonymousClass1vN.m13748D(byteBuffer, i, 2, 0.0f);
        this.f30446H = AnonymousClass1vN.m13750F(byteBuffer, i, 3, 0);
        this.f30443E = (AnonymousClass2Ra) AnonymousClass1vN.m13758N(byteBuffer, i, 4, AnonymousClass2Ra.class);
        this.f30440B = (AnonymousClass2RV[]) AnonymousClass1vN.m13759O(byteBuffer, i, 5, AnonymousClass2RV.class);
        this.f30445G = (AnonymousClass2RY[]) AnonymousClass1vN.m13759O(byteBuffer, i, 6, AnonymousClass2RY.class);
        this.f30447I = AnonymousClass1vN.m13756L(byteBuffer, i, 7);
        m15740C();
    }
}
