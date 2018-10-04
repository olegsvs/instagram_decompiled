package X;

import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.login.api.RegistrationFlowExtras;
import com.instagram.model.business.BusinessInfo;
import java.util.List;

/* renamed from: X.365 */
public final class AnonymousClass365 {
    /* renamed from: B */
    public static void m18510B(AnonymousClass34I anonymousClass34I, FragmentActivity fragmentActivity, Handler handler, String str, BusinessInfo businessInfo, RegistrationFlowExtras registrationFlowExtras) {
        if (anonymousClass34I != null) {
            anonymousClass34I.gb(registrationFlowExtras.m14750G(), ConversionStep.EDIT_USERNAME, false);
        } else {
            AnonymousClass0OR.D(handler, new AnonymousClass364(fragmentActivity, AnonymousClass0Ir.f2848B.A().C(str, businessInfo, registrationFlowExtras.m14750G())), 533508456);
        }
    }

    /* renamed from: C */
    public static void m18511C(AnonymousClass34I anonymousClass34I, FragmentActivity fragmentActivity, Handler handler, String str, BusinessInfo businessInfo, RegistrationFlowExtras registrationFlowExtras) {
        if (anonymousClass34I != null) {
            anonymousClass34I.gb(registrationFlowExtras.m14750G(), ConversionStep.SIGNUP_CONFIRMATION, false);
        } else {
            AnonymousClass0OR.D(handler, new AnonymousClass363(fragmentActivity, AnonymousClass0Ir.f2848B.A().D(str, businessInfo, registrationFlowExtras.m14750G())), 17590732);
        }
    }

    /* renamed from: D */
    public static boolean m18512D(AnonymousClass2Em anonymousClass2Em, RegistrationFlowExtras registrationFlowExtras) {
        AnonymousClass2El anonymousClass2El = anonymousClass2Em.f27927C;
        List list = anonymousClass2Em.f27926B;
        if ((list == null || list.isEmpty()) && (anonymousClass2El == null || anonymousClass2El.m14794A() == null || anonymousClass2El.m14794A().isEmpty())) {
            return false;
        }
        registrationFlowExtras.f27673Z = list;
        registrationFlowExtras.f27674a = anonymousClass2El.f27924C;
        return true;
    }
}
