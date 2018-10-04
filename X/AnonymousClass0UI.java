package X;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.0UI */
public final class AnonymousClass0UI implements AnonymousClass0U2 {
    /* renamed from: E */
    public static final AnonymousClass0U3 f5414E = new AnonymousClass0Yj();
    /* renamed from: B */
    public final Context f5415B;
    /* renamed from: C */
    public final AnonymousClass0Tw f5416C;
    /* renamed from: D */
    public final AnonymousClass0Cm f5417D;

    public AnonymousClass0UI(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Tw anonymousClass0Tw) {
        this.f5415B = context;
        this.f5417D = anonymousClass0Cm;
        this.f5416C = anonymousClass0Tw;
    }

    public final /* bridge */ /* synthetic */ void BV(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0VN anonymousClass0VN) {
        AnonymousClass0YO.m5295B(this.f5415B, this.f5417D, (AnonymousClass0UH) anonymousClass0U0, anonymousClass0VN);
    }

    public final void CV(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass0UH anonymousClass0UH = (AnonymousClass0UH) anonymousClass0U0;
    }

    public final /* bridge */ /* synthetic */ void KMA(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0db anonymousClass0db, AnonymousClass0XZ anonymousClass0XZ) {
        AnonymousClass0UH anonymousClass0UH = (AnonymousClass0UH) anonymousClass0U0;
        AnonymousClass0Yg anonymousClass0Yg = null;
        AnonymousClass0X0 anonymousClass0X0 = anonymousClass0UH.f5411B;
        AnonymousClass0P7 anonymousClass0P7 = anonymousClass0X0.f6080B;
        List unmodifiableList = Collections.unmodifiableList(anonymousClass0UH.f5413D);
        AnonymousClass0V0 F = anonymousClass0UH.mo1289F();
        String id = anonymousClass0P7.getId();
        AnonymousClass0ON TO = anonymousClass0P7.TO();
        String str = anonymousClass0UH.f5319B;
        String str2 = anonymousClass0X0.f6081C;
        if (anonymousClass0UH.f5412C != null) {
            anonymousClass0Yg = anonymousClass0UH.f5412C;
        }
        AnonymousClass0VH anonymousClass0VH = new AnonymousClass0VH();
        anonymousClass0VH.f5682N = unmodifiableList;
        anonymousClass0VH.f5672D = F;
        anonymousClass0VH.f5671C = id;
        anonymousClass0VH.f5677I = TO;
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        anonymousClass0VH.f5670B = str;
        anonymousClass0VH.f5683O = str2;
        anonymousClass0VH.f5673E = null;
        anonymousClass0VH.f5684P = null;
        anonymousClass0VH.f5676H = false;
        anonymousClass0VH.f5679K = null;
        anonymousClass0VH.f5675G = null;
        anonymousClass0VH.f5674F = null;
        anonymousClass0VH.f5678J = null;
        anonymousClass0VH.f5686R = null;
        anonymousClass0VH.f5689U = null;
        anonymousClass0VH.f5685Q = null;
        anonymousClass0VH.f5688T = null;
        anonymousClass0VH.f5687S = null;
        anonymousClass0VH.f5680L = null;
        if (anonymousClass0Yg != null) {
            anonymousClass0VH.f5681M = anonymousClass0Yg;
        }
        AnonymousClass0YO.m5296C(this.f5417D, anonymousClass0UH, anonymousClass0VH, true, anonymousClass0db, anonymousClass0XZ);
    }

    public final /* bridge */ /* synthetic */ boolean UC(AnonymousClass0U0 anonymousClass0U0) {
        return AnonymousClass0Xa.m5250B(this.f5417D.m1037B(), this.f5416C, (AnonymousClass0UH) anonymousClass0U0);
    }

    public final /* bridge */ /* synthetic */ void mJA(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass0Xa.m5254F(this.f5416C, (AnonymousClass0UH) anonymousClass0U0);
    }
}
