package X;

import android.text.TextUtils;
import com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall;
import com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.6Ci */
public final class AnonymousClass6Ci extends AnonymousClass5dE {
    /* renamed from: B */
    public AnonymousClass6Cz f72943B;
    /* renamed from: C */
    private boolean f72944C = true;
    /* renamed from: D */
    private Executor f72945D;
    /* renamed from: E */
    private AnonymousClass5d5 f72946E;

    public AnonymousClass6Ci(AnonymousClass6Cz anonymousClass6Cz, AnonymousClass5dW anonymousClass5dW, Executor executor, AnonymousClass5d5 anonymousClass5d5) {
        super(AnonymousClass6Cq.m29461C(), anonymousClass5dW);
        this.f72943B = anonymousClass6Cz;
        this.f72945D = executor;
        this.f72946E = anonymousClass5d5;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void mo6391B(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        m29448C((SaveAutofillDataJSBridgeCall) instantExperiencesJSBridgeCall);
    }

    /* renamed from: C */
    public final void m29448C(SaveAutofillDataJSBridgeCall saveAutofillDataJSBridgeCall) {
        if (((Boolean) AnonymousClass0CC.eP.G()).booleanValue()) {
            super.mo6391B(saveAutofillDataJSBridgeCall);
            String join = TextUtils.join(",", new ArrayList(saveAutofillDataJSBridgeCall.m29400E().keySet()));
            AnonymousClass6Cq.m29461C().m29468D(saveAutofillDataJSBridgeCall, AnonymousClass5dF.SAVE_AUTOFILL_REQUESTED, new AnonymousClass5ge(this, join));
            if (!saveAutofillDataJSBridgeCall.f67518E.mL().lW()) {
                saveAutofillDataJSBridgeCall.m28151C(new InstantExperienceGenericErrorResult(AnonymousClass5dA.FEATURE_UNAVAILABLE, "This feature is not available at this time"));
            } else if (this.f72944C) {
                AnonymousClass5d5 anonymousClass5d5 = this.f72946E;
                Map E = saveAutofillDataJSBridgeCall.m29400E();
                AnonymousClass1Fk anonymousClass2UL = new AnonymousClass2UL();
                AnonymousClass5cu anonymousClass5cu = anonymousClass5d5.f67471B;
                AnonymousClass1Fk anonymousClass2UL2 = new AnonymousClass2UL();
                AnonymousClass0GG.B(anonymousClass5cu.f67461E, new AnonymousClass5ct(anonymousClass5cu, new AnonymousClass6C2(anonymousClass5cu, anonymousClass2UL2)), 31881504);
                AnonymousClass1Ft.B(anonymousClass2UL2, new AnonymousClass5d4(anonymousClass5d5, E, anonymousClass2UL), anonymousClass5d5.f67474E);
                AnonymousClass1Ft.B(anonymousClass2UL, new AnonymousClass5gg(this, saveAutofillDataJSBridgeCall, join), this.f72945D);
            }
        }
    }
}
