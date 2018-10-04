package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.6C2 */
public final class AnonymousClass6C2 implements AnonymousClass5cx {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5cu f72856B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2UL f72857C;

    public AnonymousClass6C2(AnonymousClass5cu anonymousClass5cu, AnonymousClass2UL anonymousClass2UL) {
        this.f72856B = anonymousClass5cu;
        this.f72857C = anonymousClass2UL;
    }

    public final void zd(List list, List list2, List list3, List list4) {
        HashMap hashMap = new HashMap();
        String str = "name-autofill-data";
        hashMap.put(str, AnonymousClass5cu.m28134B(this.f72856B, str, list));
        str = "telephone-autofill-data";
        hashMap.put(str, AnonymousClass5cu.m28134B(this.f72856B, str, list2));
        str = "address-autofill-data";
        hashMap.put(str, AnonymousClass5cu.m28134B(this.f72856B, str, list3));
        str = "email-autofill-data";
        hashMap.put(str, AnonymousClass5cu.m28134B(this.f72856B, str, list4));
        this.f72857C.B(hashMap);
    }
}
