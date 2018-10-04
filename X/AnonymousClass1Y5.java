package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.model.business.BusinessInfo;

/* renamed from: X.1Y5 */
public class AnonymousClass1Y5 extends AnonymousClass0Iw {
    /* renamed from: B */
    public BusinessInfo f19932B;
    /* renamed from: C */
    public String f19933C;
    /* renamed from: D */
    public AnonymousClass33X f19934D;
    /* renamed from: E */
    public String f19935E;
    /* renamed from: F */
    public String f19936F;
    /* renamed from: G */
    public AnonymousClass0Cm f19937G;
    /* renamed from: H */
    private String f19938H;

    public AnonymousClass1Y5(Context context, AnonymousClass0Cm anonymousClass0Cm, BusinessInfo businessInfo, String str, String str2, String str3, String str4, AnonymousClass33X anonymousClass33X) {
        this.f19937G = anonymousClass0Cm;
        this.f19932B = businessInfo;
        this.f19933C = str;
        this.f19936F = str2;
        this.f19938H = str3;
        this.f19935E = str4;
        this.f19934D = anonymousClass33X;
    }

    /* renamed from: A */
    public void m11809A(AnonymousClass3cZ anonymousClass3cZ) {
        int I = AnonymousClass0cQ.m5859I(this, -1729441496);
        AnonymousClass0F4.f2058E.m1505B(new AnonymousClass1ga(this.f19937G.f1759C, this.f19932B.f27751K == null));
        AnonymousClass0HV.m2008D(this.f19937G).eA(true);
        AnonymousClass0Ci anonymousClass0Ci = anonymousClass3cZ.f17816C;
        AnonymousClass0Cg.f1704B.m977A(anonymousClass0Ci);
        anonymousClass0Ci.m987D();
        AnonymousClass2H3.C(this.f19937G, new AnonymousClass2HM(anonymousClass0Ci.lB, anonymousClass0Ci.mB, this.f19938H));
        AnonymousClass33X anonymousClass33X = this.f19934D;
        if (anonymousClass33X != null) {
            AnonymousClass33X.B(anonymousClass33X, this.f19935E, "submit", AnonymousClass33Y.B(this.f19932B, null, null));
        }
        String str = this.f19933C;
        AnonymousClass0wt.BUSINESS_CONVERSION_SUBMIT.m8449A().m3298F("entry_point", str).m3298F("step", this.f19936F).m3298F("fb_user_id", AnonymousClass0a2.m5424I(this.f19937G)).m3296D("selected_values", AnonymousClass33Z.B(this.f19932B.f27751K, AnonymousClass1Y5.m11808C(this), this.f19932B.f27750J, AnonymousClass1Y5.m11807B(this), this.f19932B.f27749I)).m3310R();
        AnonymousClass0cQ.m5858H(this, -1821986212, I);
    }

    /* renamed from: B */
    public static String m11807B(AnonymousClass1Y5 anonymousClass1Y5) {
        if (anonymousClass1Y5.f19932B.f27742B != null) {
            return anonymousClass1Y5.f19932B.f27742B.f27740E;
        }
        return null;
    }

    /* renamed from: C */
    public static String m11808C(AnonymousClass1Y5 anonymousClass1Y5) {
        if (anonymousClass1Y5.f19932B.f27752L == null || TextUtils.isEmpty(anonymousClass1Y5.f19932B.f27752L.f27763E)) {
            return null;
        }
        return anonymousClass1Y5.f19932B.f27752L.f27763E;
    }

    public void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, -310181475);
        super.onFail(anonymousClass0Q6);
        AnonymousClass0cQ.m5858H(this, 1742598850, I);
    }

    public void onFinish() {
        int I = AnonymousClass0cQ.m5859I(this, 77196212);
        super.onFinish();
        AnonymousClass0cQ.m5858H(this, -1475775508, I);
    }

    public void onStart() {
        int I = AnonymousClass0cQ.m5859I(this, 265142311);
        super.onStart();
        AnonymousClass0cQ.m5858H(this, 1029787681, I);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 2121285658);
        m11809A((AnonymousClass3cZ) obj);
        AnonymousClass0cQ.m5858H(this, -1727546090, I);
    }
}
