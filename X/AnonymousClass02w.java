package X;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.core.base.ParserMinimalBase;

/* renamed from: X.02w */
public final class AnonymousClass02w {
    /* renamed from: B */
    public static String m170B(int i) {
        switch (i) {
            case 1:
                return "GRAPHQL_TRIM_TO_MINIMUM";
            case 2:
                return "GRAPHQL_TRIM_TO_NOTHING";
            case 3:
                return "GRAPHQL_CONSISTENCY_MODEL_UPDATER";
            case 8:
                return "GRAPHQL_CACHEPOLICY_NETWORK_ONLY_POLICY";
            case 9:
                return "GRAPHQL_CACHEPOLICY_FETCH_AND_FILL";
            case 10:
                return "GRAPHQL_CACHEPOLICY_CACHE_ONLY_POLICY";
            case 12:
                return "GRAPHQL_PERF_MARKER_MUTATION";
            case ParserMinimalBase.INT_CR /*13*/:
                return "GRAPHQL_PERF_MARKER_SUBSCRIPTION_PUSH";
            case 14:
                return "GRAPHQL_PERF_MARKER_PUT_1000_FRIENDS";
            case 15:
                return "GRAPHQL_PERF_MARKER_GET_1000_FRIENDS";
            case 16:
                return "GRAPHQL_PERF_EVENT_CACHE_HIT";
            case 17:
                return "GRAPHQL_PERF_EVENT_CACHE_MISS";
            case 21:
                return "GRAPHQL_FETCH_MSG_FAIL";
            case 22:
                return "GRAPHQL_PERF_MARKER_PUT_100_MAPS";
            case 23:
                return "GRAPHQL_PERF_MARKER_GET_100_MAPS";
            case 27:
                return "GRAPHQL_CONSISTENCY_BENCHMARK_DISK_READ";
            case 28:
                return "GRAPHQL_CONSISTENCY_BENCHMARK_UPDATE_FROM_CACHE";
            case 29:
                return "GRAPHQL_BENCHMARK_RMT_TOGGLE_LIKE";
            case 30:
                return "GRAPHQL_FETCH_FROM_DB";
            case 31:
                return "GRAPHQL_UPDATE_MODEL_FROM_CACHE";
            case 35:
                return "GRAPHQL_UPDATE_DB";
            case 36:
                return "GRAPHQL_BENCHMARK_READ_CONSISTENT_FIELDS";
            case 37:
                return "GRAPHQL_BENCHMARK_READ_CONSISTENT_FIELDS_FLATBUFFER";
            case 38:
                return "GRAPHQL_GRAPHQL_READ_QUERY";
            case ParserMinimalBase.INT_APOSTROPHE /*39*/:
                return "GRAPHQL_GRAPHQL_BATCH_QUERY";
            case 41:
                return "GRAPHQL_GRAPHQL_MUTATION";
            case 43:
                return "GRAPHQL_TRIM_ON_BACKGROUND";
            case 46:
                return "GRAPHQL_CONSISTENT_FIELDS_QUERY";
            case ParserMinimalBase.INT_SLASH /*47*/:
                return "GRAPHQL_LIVE_QUERY_SUBSCRIBE";
            case 48:
                return "GRAPHQL_LIVE_QUERY_RETRY";
            case 49:
                return "GRAPHQL_LIVE_QUERY_CANCEL";
            case 50:
                return "GRAPHQL_LIVE_QUERY_RECEIVE";
            case 51:
                return "GRAPHQL_LIVE_QUERY_ERROR";
            case 52:
                return "GRAPHQL_GRAPHSERVICE_CONSISTENCY_CONFIRMED";
            case 53:
                return "GRAPHQL_GRAPHSERVICE_CONSISTENCY_OPTIMISTIC_START";
            case 54:
                return "GRAPHQL_GRAPHSERVICE_CONSISTENCY_OPTIMISTIC_CANCEL";
            case 55:
                return "GRAPHQL_AB_VISITOR_APPLY";
            case 56:
                return "GRAPHQL_CONSISTENT_FIELDS_TUPLE_QUERY";
            case 57:
                return "GRAPHQL_GRAPHSERVICE_READ_QUERY";
            case ParserMinimalBase.INT_COLON /*58*/:
                return "GRAPHQL_GRAPHSERVICE_QUERY_EXECUTOR";
            case 59:
                return "GRAPHQL_GRAPHSERVICE_LOAD_PAGE";
            case StartupQEsConfig.DEFAULT_FPS_EXPECTED_FPS /*60*/:
                return "GRAPHQL_REPLACE_NODE_IMPL";
            case 61:
                return "GRAPHQL_GRAPHSERVICE_MUTATION";
            case 62:
                return "GRAPHQL_GRAPHSERVICE_LOAD_NEXT_PAGE";
            case 63:
                return "GRAPHQL_GRAPHSERVICE_LOAD_PREVIOUS_PAGE";
            case 64:
                return "GRAPHQL_GRAPHSERVICE_RESET_PAGE";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
