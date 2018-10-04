package X;

import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.2e6 */
public final class AnonymousClass2e6 extends AnonymousClass2UJ {
    public AnonymousClass2e6(AnonymousClass1Fk anonymousClass1Fk, AnonymousClass5cs anonymousClass5cs) {
        super(anonymousClass1Fk, anonymousClass5cs);
    }

    /* renamed from: E */
    public final Object mo3580E(Object obj, Object obj2) {
        AnonymousClass5cs anonymousClass5cs = (AnonymousClass5cs) obj;
        List<List> list = (List) obj2;
        List arrayList = new ArrayList();
        Set set = anonymousClass5cs.f67455B;
        for (List<FbAutofillData> it : list) {
            for (FbAutofillData gE : it) {
                FbAutofillData gE2 = gE.gE(set);
                if (gE2 != null && gE2.KF()) {
                    AnonymousClass5cu.C(gE2, arrayList);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: F */
    public final void mo3581F(Object obj) {
        B(obj);
    }
}
