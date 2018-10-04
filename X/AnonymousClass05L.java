package X;

import com.fasterxml.jackson.core.base.ParserMinimalBase;

/* renamed from: X.05L */
public final class AnonymousClass05L {
    /* renamed from: B */
    public static String m319B(int i) {
        if (i == 19) {
            return "TEST_MODULE_TWO_TEST_EVENT_ONE";
        }
        switch (i) {
            case ParserMinimalBase.INT_CR /*13*/:
                return "TEST_MODULE_TWO_TEST_EVENT_TWO";
            case 14:
                return "TEST_MODULE_TWO_TEST_EVENT_THREE";
            case 15:
                return "TEST_MODULE_TWO_TEST_EVENT_FOUR";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
