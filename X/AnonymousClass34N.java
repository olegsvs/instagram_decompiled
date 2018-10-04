package X;

import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import java.util.List;

/* renamed from: X.34N */
public final class AnonymousClass34N {
    /* renamed from: B */
    public static BusinessConversionFlowStatus m18421B(BusinessConversionFlowStatus businessConversionFlowStatus, AnonymousClass34Q anonymousClass34Q) {
        if (!businessConversionFlowStatus.m18420E()) {
            return AnonymousClass34N.m18427H(businessConversionFlowStatus);
        }
        if (businessConversionFlowStatus.m18416A().f37535B == anonymousClass34Q) {
            return new BusinessConversionFlowStatus(businessConversionFlowStatus.f37530C, businessConversionFlowStatus.f37529B + 1);
        }
        return new BusinessConversionFlowStatus(AnonymousClass34N.m18426G(businessConversionFlowStatus, new BusinessConversionStep(businessConversionFlowStatus.m18416A().f37536C, anonymousClass34Q), businessConversionFlowStatus.f37529B, false), businessConversionFlowStatus.f37529B + 1);
    }

    /* renamed from: C */
    public static BusinessConversionFlowStatus m18422C(BusinessConversionFlowStatus businessConversionFlowStatus) {
        return new BusinessConversionFlowStatus(businessConversionFlowStatus.f37530C, businessConversionFlowStatus.f37529B - 1);
    }

    /* renamed from: D */
    public static BusinessConversionFlowStatus m18423D(BusinessConversionFlowStatus businessConversionFlowStatus, List list, int i, int i2) {
        boolean z = businessConversionFlowStatus != null && i >= 0 && i <= businessConversionFlowStatus.f37530C.size();
        AnonymousClass0LH.H(z);
        AnonymousClass1jJ anonymousClass1jJ = new AnonymousClass1jJ();
        for (int i3 = 0; i3 < i; i3++) {
            anonymousClass1jJ.E(businessConversionFlowStatus.f37530C.get(i3));
        }
        if (!(list == null || list.isEmpty())) {
            anonymousClass1jJ.F(list);
        }
        return new BusinessConversionFlowStatus(anonymousClass1jJ.H(), i2);
    }

    /* renamed from: E */
    public static BusinessConversionFlowStatus m18424E(BusinessConversionFlowStatus businessConversionFlowStatus) {
        AnonymousClass0LH.H(businessConversionFlowStatus.m18418C());
        return AnonymousClass34N.m18425F(businessConversionFlowStatus, businessConversionFlowStatus.f37529B + 1, businessConversionFlowStatus.f37529B);
    }

    /* renamed from: F */
    public static BusinessConversionFlowStatus m18425F(BusinessConversionFlowStatus businessConversionFlowStatus, int i, int i2) {
        AnonymousClass0LH.H(businessConversionFlowStatus != null);
        if (i >= 0) {
            if (i < businessConversionFlowStatus.f37530C.size()) {
                AnonymousClass1jJ anonymousClass1jJ = new AnonymousClass1jJ();
                for (int i3 = 0; i3 < businessConversionFlowStatus.f37530C.size(); i3++) {
                    if (i3 != i) {
                        anonymousClass1jJ.E(businessConversionFlowStatus.f37530C.get(i3));
                    }
                }
                return new BusinessConversionFlowStatus(anonymousClass1jJ.H(), i2);
            }
        }
        return businessConversionFlowStatus;
    }

    /* renamed from: G */
    public static AnonymousClass0Ow m18426G(BusinessConversionFlowStatus businessConversionFlowStatus, BusinessConversionStep businessConversionStep, int i, boolean z) {
        AnonymousClass1jJ anonymousClass1jJ = new AnonymousClass1jJ();
        for (int i2 = 0; i2 < businessConversionFlowStatus.f37530C.size(); i2++) {
            if (i2 == i) {
                anonymousClass1jJ.E(businessConversionStep);
            }
            if (i2 != i || z) {
                anonymousClass1jJ.E(businessConversionFlowStatus.f37530C.get(i2));
            }
        }
        return anonymousClass1jJ.H();
    }

    /* renamed from: H */
    public static BusinessConversionFlowStatus m18427H(BusinessConversionFlowStatus businessConversionFlowStatus) {
        if (businessConversionFlowStatus.m18420E()) {
            return businessConversionFlowStatus;
        }
        return new BusinessConversionFlowStatus(businessConversionFlowStatus.f37530C, 0);
    }
}
