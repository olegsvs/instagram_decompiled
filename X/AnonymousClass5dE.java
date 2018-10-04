package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.5dE */
public abstract class AnonymousClass5dE {
    /* renamed from: D */
    private static final String f67524D = "InstantExperiencesJSBridgeCallHandler";
    /* renamed from: B */
    private final AnonymousClass6Cq f67525B;
    /* renamed from: C */
    private final AnonymousClass5dW f67526C;

    public AnonymousClass5dE(AnonymousClass6Cq anonymousClass6Cq, AnonymousClass5dW anonymousClass5dW) {
        this.f67526C = anonymousClass5dW;
        this.f67525B = anonymousClass6Cq;
    }

    /* renamed from: A */
    public void mo6393A(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        if (instantExperiencesJSBridgeCall.f67517D == null) {
            instantExperiencesJSBridgeCall.m28151C(new InstantExperienceGenericErrorResult(AnonymousClass5dA.INTERNAL_ERROR, "Internal error"));
            AnonymousClass0Dc.V(f67524D, "Result missing for call id: %s", new Object[]{instantExperiencesJSBridgeCall.mo6306A()});
        }
        this.f67525B.m29468D(instantExperiencesJSBridgeCall, AnonymousClass5dF.NATIVE_BRIDGE_RESULT, new AnonymousClass5dC(this, instantExperiencesJSBridgeCall.f67517D.f67511C));
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AnonymousClass5dE.m28153B(this, instantExperiencesJSBridgeCall);
        } else {
            AnonymousClass0OR.D(new Handler(Looper.getMainLooper()), new AnonymousClass5dD(this, instantExperiencesJSBridgeCall), 810424190);
        }
    }

    /* renamed from: B */
    public static void m28153B(AnonymousClass5dE anonymousClass5dE, InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        if (AnonymousClass5dE.m28154C(instantExperiencesJSBridgeCall.f67516C, anonymousClass5dE.f67526C.getUrl())) {
            AnonymousClass5dW anonymousClass5dW = anonymousClass5dE.f67526C;
            anonymousClass5dE = instantExperiencesJSBridgeCall.f67517D;
            StringBuilder stringBuilder = new StringBuilder("%s(%s, '%s'");
            instantExperiencesJSBridgeCall = null;
            for (int i = 0; i < anonymousClass5dE.f67513E.size(); i++) {
                stringBuilder.append(", '%s'");
            }
            stringBuilder.append(");");
            if (AnonymousClass0Ip.B(anonymousClass5dE.f67512D)) {
                throw new RuntimeException("Invalid state: Missing callback handler name");
            } else if (AnonymousClass0Ip.B(anonymousClass5dE.f67510B)) {
                throw new RuntimeException("Invalid state: Missing callback id");
            } else {
                Collection arrayList = new ArrayList(anonymousClass5dE.f67513E.size());
                for (String C : anonymousClass5dE.f67513E) {
                    arrayList.add(AnonymousClass1tL.C(C, true));
                }
                ArrayList arrayList2 = new ArrayList(anonymousClass5dE.f67513E.size() + 3);
                arrayList2.add(anonymousClass5dE.f67512D);
                if (anonymousClass5dE.f67511C == null) {
                    instantExperiencesJSBridgeCall = true;
                }
                arrayList2.add(Boolean.valueOf(instantExperiencesJSBridgeCall));
                arrayList2.add(anonymousClass5dE.f67510B);
                arrayList2.addAll(arrayList);
                anonymousClass5dW.m28159A(StringFormatUtil.formatStrLocaleSafe(stringBuilder.toString(), arrayList2.toArray()));
            }
        }
    }

    /* renamed from: B */
    public void mo6391B(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        this.f67525B.m29467C(instantExperiencesJSBridgeCall, AnonymousClass5dF.NATIVE_BRIDGE_CALLED);
        instantExperiencesJSBridgeCall.mo6307D();
    }

    /* renamed from: C */
    private static boolean m28154C(String str, String str2) {
        if (!AnonymousClass0Ip.B(str)) {
            if (!AnonymousClass0Ip.B(str2)) {
                Uri parse = Uri.parse(str);
                Uri parse2 = Uri.parse(str2);
                if (!(parse == null || parse2 == null || AnonymousClass0Ip.B(parse.getScheme()) || !parse.getScheme().equals(parse2.getScheme()) || parse.getPort() != parse2.getPort() || AnonymousClass0Ip.B(parse.getAuthority()) || !parse.getAuthority().equals(parse2.getAuthority()))) {
                    return true;
                }
            }
        }
        return false;
    }
}
