package X;

import android.text.TextUtils;
import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall;
import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.6Ch */
public final class AnonymousClass6Ch extends AnonymousClass5dE {
    /* renamed from: B */
    public final AnonymousClass6Cz f72940B;
    /* renamed from: C */
    private final AnonymousClass5cu f72941C;
    /* renamed from: D */
    private final Executor f72942D;

    public AnonymousClass6Ch(Executor executor, AnonymousClass6Cz anonymousClass6Cz, AnonymousClass5dW anonymousClass5dW, AnonymousClass5cu anonymousClass5cu) {
        super(AnonymousClass6Cq.m29461C(), anonymousClass5dW);
        this.f72942D = executor;
        this.f72941C = anonymousClass5cu;
        this.f72940B = anonymousClass6Cz;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void mo6391B(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        m29446C((RequestAutofillJSBridgeCall) instantExperiencesJSBridgeCall);
    }

    /* renamed from: C */
    public final void m29446C(RequestAutofillJSBridgeCall requestAutofillJSBridgeCall) {
        if (((Boolean) AnonymousClass0CC.eP.G()).booleanValue()) {
            AnonymousClass0Ox D;
            super.mo6391B(requestAutofillJSBridgeCall);
            String join = TextUtils.join(",", new ArrayList(requestAutofillJSBridgeCall.m29391E()));
            AnonymousClass6Cq.m29461C().m29468D(requestAutofillJSBridgeCall, AnonymousClass5dF.AUTOFILL_REQUESTED, new AnonymousClass5gY(this, join));
            AnonymousClass5cu anonymousClass5cu = this.f72941C;
            String str = (String) requestAutofillJSBridgeCall.m28150B("selectedAutoCompleteTag");
            Set E = requestAutofillJSBridgeCall.m29391E();
            AnonymousClass1Fk[] anonymousClass1FkArr = new AnonymousClass1Fk[2];
            AnonymousClass2UL anonymousClass2UL = new AnonymousClass2UL();
            AnonymousClass0GG.B(anonymousClass5cu.f67461E, new AnonymousClass5ct(anonymousClass5cu, new AnonymousClass6C3(anonymousClass5cu, str, anonymousClass2UL)), 31881504);
            anonymousClass1FkArr[0] = anonymousClass2UL;
            List arrayList = new ArrayList();
            if (NameAutofillData.f73946B.contains(str)) {
                arrayList.addAll(anonymousClass5cu.f67459C.m29457D());
            } else if (TelephoneAutofillData.f73947C.contains(str)) {
                arrayList.addAll(anonymousClass5cu.f67459C.m29458E());
            } else if (AddressAutofillData.f73944B.contains(str)) {
                arrayList.addAll(anonymousClass5cu.f67459C.m29455B());
            } else {
                arrayList.addAll(anonymousClass5cu.f67459C.m29456C());
            }
            anonymousClass1FkArr[1] = AnonymousClass1Ft.D(arrayList);
            Iterable asList = Arrays.asList(anonymousClass1FkArr);
            AnonymousClass1Cy.G(asList);
            if (asList instanceof Collection) {
                D = AnonymousClass0Ow.D((Collection) asList);
            } else {
                D = AnonymousClass0Ow.E(asList.iterator());
            }
            AnonymousClass1Fk anonymousClass1jm = new AnonymousClass1jm(D, true);
            AnonymousClass5cs anonymousClass5cs = new AnonymousClass5cs(anonymousClass5cu, E);
            Executor executor = anonymousClass5cu.f67460D;
            AnonymousClass1Cy.G(anonymousClass5cs);
            AnonymousClass1Fk anonymousClass2e6 = new AnonymousClass2e6(anonymousClass1jm, anonymousClass5cs);
            anonymousClass1jm.oB(anonymousClass2e6, AnonymousClass22m.B(executor, anonymousClass2e6));
            AnonymousClass1Ft.B(anonymousClass2e6, new AnonymousClass5gd(this, requestAutofillJSBridgeCall, join), this.f72942D);
        }
    }
}
