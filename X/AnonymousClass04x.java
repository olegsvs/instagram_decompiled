package X;

import com.fasterxml.jackson.core.base.ParserMinimalBase;

/* renamed from: X.04x */
public final class AnonymousClass04x {
    /* renamed from: B */
    public static String m295B(int i) {
        switch (i) {
            case 1:
                return "RELAY_GROUPS_INIT_FETCH_TIME";
            case 2:
                return "RELAY_RELAY_PLAYGROUND_TTI";
            case 3:
                return "RELAY_PREFETCHER_FETCH_QUERY";
            default:
                switch (i) {
                    case ParserMinimalBase.INT_CR /*13*/:
                        return "RELAY_NETWORK_FETCH_QUERY_NATIVE";
                    case 14:
                        return "RELAY_RESPONSE_NORMALIZER_NORMALIZE_NATIVE";
                    case 15:
                        return "RELAY_RUNTIME_GC_NATIVE";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
