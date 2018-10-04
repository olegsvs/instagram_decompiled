package X;

import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.model.business.BusinessInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4Dl */
public final class AnonymousClass4Dl implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Dn f51652B;
    /* renamed from: C */
    public final /* synthetic */ BusinessInfo f51653C;
    /* renamed from: D */
    public final /* synthetic */ String f51654D;
    /* renamed from: E */
    public final /* synthetic */ String f51655E;
    /* renamed from: F */
    public final /* synthetic */ String f51656F;
    /* renamed from: G */
    public final /* synthetic */ String f51657G;

    public AnonymousClass4Dl(AnonymousClass4Dn anonymousClass4Dn, BusinessInfo businessInfo, String str, String str2, String str3, String str4) {
        this.f51652B = anonymousClass4Dn;
        this.f51653C = businessInfo;
        this.f51654D = str;
        this.f51656F = str2;
        this.f51655E = str3;
        this.f51657G = str4;
    }

    public final void run() {
        ((BusinessConversionActivity) this.f51652B.f51667H).a(this.f51653C);
        ((BusinessConversionActivity) this.f51652B.f51667H).f12415h = this.f51654D;
        ((BusinessConversionActivity) this.f51652B.f51667H).f12409b = this.f51656F;
        AnonymousClass34I anonymousClass34I = this.f51652B.f51667H;
        String str = this.f51655E;
        String str2 = this.f51656F;
        String str3 = this.f51657G;
        Map hashMap = new HashMap();
        hashMap.put("page_name", str2);
        hashMap.put("page_id", str);
        hashMap.put("subcategory_id", str3);
        anonymousClass34I.fb(AnonymousClass33Y.m18335J(hashMap));
    }
}
