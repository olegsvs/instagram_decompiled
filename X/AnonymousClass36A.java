package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Hashtable;
import java.util.Map;

/* renamed from: X.36A */
public final class AnonymousClass36A {
    /* renamed from: B */
    public final Map f37798B = new Hashtable();
    /* renamed from: C */
    public AnonymousClass369 f37799C;
    /* renamed from: D */
    public final String f37800D;
    /* renamed from: E */
    public final AnonymousClass33X f37801E;
    /* renamed from: F */
    public final String f37802F;
    /* renamed from: G */
    public final String f37803G;

    public AnonymousClass36A(AnonymousClass369 anonymousClass369, String str, String str2, String str3, AnonymousClass33X anonymousClass33X) {
        this.f37799C = anonymousClass369;
        AnonymousClass0LH.E(anonymousClass369);
        this.f37803G = str;
        this.f37800D = str2;
        this.f37802F = str3;
        this.f37801E = anonymousClass33X;
    }

    /* renamed from: A */
    public final void m18513A(String str, AnonymousClass368 anonymousClass368, AnonymousClass0IJ anonymousClass0IJ, AnonymousClass0Cm anonymousClass0Cm, String str2) {
        AnonymousClass36A anonymousClass36A = this;
        Map map = this.f37798B;
        String str3 = str;
        AnonymousClass368 anonymousClass3682 = anonymousClass368;
        if (map.containsKey(str)) {
            anonymousClass36A.f37799C.yl((AnonymousClass2Xw) anonymousClass36A.f37798B.get(str), anonymousClass368, str);
            return;
        }
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        AnonymousClass0GA B = AnonymousClass1Dj.C(anonymousClass0Cm).C(new AnonymousClass2Ak(StringFormatUtil.formatStrLocaleSafe("{\"%s\":\"%s\"}", "0", str))).D(AnonymousClass2CF.ADS).B(AnonymousClass1Dk.ADS);
        B.f2849B = new AnonymousClass366(anonymousClass36A, anonymousClass3682, str3, str2, anonymousClass0Cm2, anonymousClass0IJ);
        anonymousClass0IJ.schedule(B);
    }

    /* renamed from: B */
    public final void m18514B(String str, AnonymousClass0IJ anonymousClass0IJ, AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0GA B = AnonymousClass1Dj.C(anonymousClass0Cm).C(new AnonymousClass2Ab(StringFormatUtil.formatStrLocaleSafe("{\"%s\":{\"%s\":\"%s\",\"%s\":\"%s\"}}", new Object[]{"0", "page_name", str, "num_result", Integer.valueOf(5)}))).D(AnonymousClass2CF.ADS).B(AnonymousClass1Dk.ADS);
        B.f2849B = new AnonymousClass367(this, str, anonymousClass0Cm, anonymousClass0IJ);
        anonymousClass0IJ.schedule(B);
    }
}
