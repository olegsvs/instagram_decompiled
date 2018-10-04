package X;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.0UA */
public final class AnonymousClass0UA implements AnonymousClass0U2 {
    /* renamed from: E */
    public static final AnonymousClass0U3 f5381E = new AnonymousClass0YN();
    /* renamed from: B */
    public final Context f5382B;
    /* renamed from: C */
    public final AnonymousClass0Tw f5383C;
    /* renamed from: D */
    public final AnonymousClass0Cm f5384D;

    public AnonymousClass0UA(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Tw anonymousClass0Tw) {
        this.f5382B = context;
        this.f5384D = anonymousClass0Cm;
        this.f5383C = anonymousClass0Tw;
    }

    public final /* bridge */ /* synthetic */ void BV(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0VN anonymousClass0VN) {
        AnonymousClass0YO.m5295B(this.f5382B, this.f5384D, (AnonymousClass0U9) anonymousClass0U0, anonymousClass0VN);
    }

    public final void CV(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass0U9 anonymousClass0U9 = (AnonymousClass0U9) anonymousClass0U0;
    }

    public final /* bridge */ /* synthetic */ void KMA(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0db anonymousClass0db, AnonymousClass0XZ anonymousClass0XZ) {
        AnonymousClass0U9 anonymousClass0U9 = (AnonymousClass0U9) anonymousClass0U0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Integer num = null;
        AnonymousClass0YJ anonymousClass0YJ = anonymousClass0U9.f5377L;
        AnonymousClass0P7 anonymousClass0P7 = anonymousClass0YJ.f6256E;
        String str9 = anonymousClass0YJ.f6263L;
        String str10 = anonymousClass0U9.f5373H;
        String str11 = anonymousClass0U9.f5369D;
        String str12 = anonymousClass0U9.f5368C;
        String str13 = anonymousClass0U9.f5372G;
        String str14 = anonymousClass0U9.f5380O;
        String str15 = anonymousClass0U9.f5371F;
        String str16 = anonymousClass0U9.f5379N;
        String str17 = anonymousClass0U9.f5370E;
        Integer num2 = anonymousClass0U9.f5374I;
        List singletonList = Collections.singletonList(anonymousClass0U9.f5378M);
        AnonymousClass0V0 F = anonymousClass0U9.mo1289F();
        String id = anonymousClass0P7.getId();
        AnonymousClass0ON TO = anonymousClass0P7.TO();
        String str18 = anonymousClass0U9.f5319B;
        String str19 = anonymousClass0U9.f5367B;
        String str20 = anonymousClass0U9.f5375J;
        if (str10 != null) {
            z = true;
            str = str10;
        }
        if (str11 != null) {
            str2 = str11;
        }
        if (str12 != null) {
            str3 = str12;
        }
        if (str13 != null) {
            str4 = str13;
        }
        if (str17 != null) {
            str7 = str17;
        }
        if (str15 != null) {
            str5 = str15;
        }
        if (str16 != null) {
            str8 = str16;
        }
        if (str14 != null) {
            str6 = str14;
        }
        if (num2 != null) {
            num = Integer.valueOf(num2.intValue());
        }
        AnonymousClass0Cm anonymousClass0Cm = this.f5384D;
        AnonymousClass0VH anonymousClass0VH = new AnonymousClass0VH();
        anonymousClass0VH.f5682N = singletonList;
        anonymousClass0VH.f5672D = F;
        anonymousClass0VH.f5671C = id;
        anonymousClass0VH.f5677I = TO;
        if (str18 == null) {
            str18 = UUID.randomUUID().toString();
        }
        anonymousClass0VH.f5670B = str18;
        anonymousClass0VH.f5683O = str9;
        anonymousClass0VH.f5673E = str19;
        anonymousClass0VH.f5684P = null;
        anonymousClass0VH.f5676H = z;
        anonymousClass0VH.f5679K = str;
        anonymousClass0VH.f5675G = str2;
        anonymousClass0VH.f5674F = str3;
        anonymousClass0VH.f5678J = str4;
        anonymousClass0VH.f5686R = str5;
        anonymousClass0VH.f5689U = str6;
        anonymousClass0VH.f5685Q = str7;
        anonymousClass0VH.f5688T = str8;
        anonymousClass0VH.f5687S = num;
        anonymousClass0VH.f5680L = str20;
        AnonymousClass0YO.m5296C(anonymousClass0Cm, anonymousClass0U9, anonymousClass0VH, true, anonymousClass0db, anonymousClass0XZ);
    }

    public final /* bridge */ /* synthetic */ boolean UC(AnonymousClass0U0 anonymousClass0U0) {
        return AnonymousClass0Xa.m5250B(this.f5384D.m1037B(), this.f5383C, (AnonymousClass0U9) anonymousClass0U0);
    }

    public final /* bridge */ /* synthetic */ void mJA(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass0Xa.m5254F(this.f5383C, (AnonymousClass0U9) anonymousClass0U0);
    }
}
