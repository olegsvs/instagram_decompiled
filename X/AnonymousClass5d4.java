package X;

import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.5d4 */
public final class AnonymousClass5d4 implements AnonymousClass1Fs {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5d5 f67468B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2UL f67469C;
    /* renamed from: D */
    public final /* synthetic */ Map f67470D;

    public AnonymousClass5d4(AnonymousClass5d5 anonymousClass5d5, Map map, AnonymousClass2UL anonymousClass2UL) {
        this.f67468B = anonymousClass5d5;
        this.f67470D = map;
        this.f67469C = anonymousClass2UL;
    }

    /* renamed from: A */
    public final void m28145A(Map map) {
        AnonymousClass5cy anonymousClass5cy = this.f67468B.f67473D;
        Map map2 = this.f67470D;
        Object<BrowserExtensionsAutofillData> arrayList = new ArrayList();
        arrayList.addAll(AnonymousClass5cy.m28139E(map2));
        arrayList.addAll(anonymousClass5cy.m28143A(map2));
        arrayList.addAll(AnonymousClass5cy.m28137C(map2));
        arrayList.addAll(AnonymousClass5cy.m28138D(map2));
        if (arrayList == null) {
            this.f67469C.B(null);
            return;
        }
        List arrayList2 = new ArrayList();
        if (map == null) {
            arrayList2.addAll(arrayList);
            this.f67469C.B(arrayList2);
            return;
        }
        for (BrowserExtensionsAutofillData browserExtensionsAutofillData : arrayList) {
            List arrayList3 = new ArrayList();
            List list = (List) map.get(browserExtensionsAutofillData.mo6776B());
            if (list != null) {
                arrayList3.addAll(list);
            }
            if (!(AnonymousClass5d5.m28146B(browserExtensionsAutofillData, arrayList3).booleanValue() || arrayList3.contains(browserExtensionsAutofillData) || arrayList2.contains(browserExtensionsAutofillData))) {
                arrayList2.add(browserExtensionsAutofillData);
            }
        }
        this.f67469C.B(arrayList2);
    }

    public final void jl(Throwable th) {
        this.f67469C.C(th);
    }

    public final /* bridge */ /* synthetic */ void uBA(Object obj) {
        m28145A((Map) obj);
    }
}
