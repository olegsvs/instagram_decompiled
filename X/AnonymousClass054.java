package X;

import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;

/* renamed from: X.054 */
public final class AnonymousClass054 {
    /* renamed from: B */
    public static String m302B(int i) {
        switch (i) {
            case 11:
                return "SEARCH_KEYWORD_SEARCH_PERFORMANCE";
            case 12:
                return "SEARCH_KEYWORD_SEARCH_RESULT_PAGE_LOAD";
            case ParserMinimalBase.INT_CR /*13*/:
                return "SEARCH_KEYWORD_SEARCH_RESULT_PAGE_LOAD_MORE";
            case 14:
                return "SEARCH_SEARCH_ENTRY";
            case 15:
                return "SEARCH_GRAPH_SEARCH_RESULT_FETCH";
            case 16:
                return "SEARCH_SEARCH_TYPEAHEAD";
            case 17:
                return "SEARCH_SEARCH_WATERFALL";
            case Process.SIGCONT /*18*/:
                return "SEARCH_SIMPLE_SEARCH_LOCAL_SUGGESTIONS_TYPEAHEAD";
            case Process.SIGSTOP /*19*/:
                return "SEARCH_SIMPLE_SEARCH_REMOTE_SUGGESTIONS_TYPEAHEAD";
            case Process.SIGTSTP /*20*/:
                return "SEARCH_SEARCH_ENTITIES_TIME_TO_DISPLAY_SUGGESTION";
            case 21:
                return "SEARCH_NULL_STATE";
            case 22:
                return "SEARCH_SEARCH_DB_BOOTSTRAP_LOAD";
            case 23:
                return "SEARCH_SEARCH_DB_BOOTSTRAP_FETCH";
            case 24:
                return "SEARCH_SEARCH_DB_BOOTSTRAP_INDEX_LOAD";
            case 25:
                return "SEARCH_SEARCH_DB_BOOTSTRAP_PREFETCH_LOAD";
            case 26:
                return "SEARCH_SEARCH_DB_BOOTSTRAP_DELTA_LOAD";
            case 27:
                return "SEARCH_SEARCH_DB_BOOTSTRAP_RECENT_SEARCH_DELTA";
            case 30:
                return "SEARCH_GRAPH_SEARCH_REMOTE_SUGGESTIONS_TYPEAHEAD";
            case 31:
                return "SEARCH_GRAPH_SEARCH_LOCAL_SUGGESTIONS_TYPEAHEAD";
            case 32:
                return "SEARCH_SUGGESTIONS_END_TO_END";
            case 33:
                return "SEARCH_GRAPH_SEARCH_REMOTE_KEYWORD_SUGGESTIONS_TYPEAHEAD";
            case ParserMinimalBase.INT_QUOTE /*34*/:
                return "SEARCH_GRAPH_SEARCH_REMOTE_ENTITY_SUGGESTIONS_TYPEAHEAD";
            case 37:
                return "SEARCH_SERP_SUGGESTIONS_END_TO_END";
            case 41:
                return "SEARCH_KEYWORD_SEARCH_RESULT_PAGE_DISLAY_DONE";
            case ParserMinimalBase.INT_ASTERISK /*42*/:
                return "SEARCH_SERP_PREPROCESS";
            case 43:
                return "SEARCH_SERP_POSTPROCESS";
            case ParserMinimalBase.INT_COMMA /*44*/:
                return "SEARCH_SERP_NETWORK";
            case 45:
                return "SEARCH_SERP_TTI";
            case 46:
                return "SEARCH_FETCH_BOOTSTRAP_KEYWORD_QUERY";
            case ParserMinimalBase.INT_SLASH /*47*/:
                return "SEARCH_SEARCH_SNIPPET_LAYOUT_ANDROID";
            case 48:
                return "SEARCH_RESULTS_NT_BG_PARSE_ANDROID";
            case 49:
                return "SEARCH_RESULTS_NT_FG_WAIT_ANDROID";
            case 50:
                return "SEARCH_PAGE_SURFACE_INITIAL_LOAD_LATENCY";
            case 51:
                return "SEARCH_SERP_TTRC_ANDROID";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
