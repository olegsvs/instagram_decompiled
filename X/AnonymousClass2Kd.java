package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Kd */
public final class AnonymousClass2Kd extends AnonymousClass0Iw {
    /* renamed from: B */
    private final boolean f29029B;
    /* renamed from: C */
    private final AnonymousClass2c0 f29030C;

    public AnonymousClass2Kd(AnonymousClass2c0 anonymousClass2c0, boolean z) {
        this.f29030C = anonymousClass2c0;
        this.f29029B = z;
    }

    /* renamed from: A */
    public final void m15098A() {
        AnonymousClass2c0 anonymousClass2c0 = this.f29030C;
        List arrayList = new ArrayList();
        arrayList.add(AnonymousClass2LR.m15160B("Pen"));
        arrayList.add(AnonymousClass2LR.m15160B("Marker"));
        arrayList.add(AnonymousClass2LR.m15160B("Neon"));
        arrayList.add(AnonymousClass2LR.m15160B("Eraser"));
        if (((Boolean) AnonymousClass0CC.Ag.G()).booleanValue()) {
            arrayList.add(AnonymousClass2LR.m15160B(AnonymousClass2fT.f32213B));
        }
        if (((Boolean) AnonymousClass0CC.Jf.G()).booleanValue()) {
            arrayList.add(AnonymousClass2LR.m15160B(AnonymousClass2fN.f32207B));
        }
        anonymousClass2c0.m16464A(arrayList);
    }

    /* renamed from: B */
    public static void m15097B(AnonymousClass2Kd anonymousClass2Kd, List list) {
        List arrayList = new ArrayList();
        for (AnonymousClass2LR anonymousClass2LR : list) {
            if (anonymousClass2LR.f29278C.booleanValue() || anonymousClass2Kd.f29029B) {
                arrayList.add(anonymousClass2LR);
            }
        }
        anonymousClass2Kd.f29030C.m16464A(arrayList);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -2024354747);
        AnonymousClass2Kd.m15097B(this, new ArrayList());
        AnonymousClass0cQ.H(this, 1906808545, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -856424111);
        AnonymousClass2LO anonymousClass2LO = (AnonymousClass2LO) obj;
        int I2 = AnonymousClass0cQ.I(this, 1599772152);
        AnonymousClass2Kd.m15097B(this, anonymousClass2LO.f29251B);
        AnonymousClass0cQ.H(this, 9821436, I2);
        AnonymousClass0cQ.H(this, 262671488, I);
    }
}
