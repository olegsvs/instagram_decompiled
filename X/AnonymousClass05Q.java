package X;

import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;

/* renamed from: X.05Q */
public final class AnonymousClass05Q {
    /* renamed from: B */
    public static String m324B(int i) {
        switch (i) {
            case 1:
                return "TIMELINE_TIMELINE_HEADER_TTI";
            case 2:
                return "TIMELINE_TIMELINE_INITIAL_UNITS_WAIT_TIME";
            case 5:
                return "TIMELINE_TIMELINE_RENDER_CORE_HEADER";
            case 9:
                return "TIMELINE_TIMELINE_RENDER_ENTIRE_HEADER";
            case 10:
                return "TIMELINE_TIMELINE_RENDER_ENTIRE_HEADER_FROM_SERVER";
            case 11:
                return "TIMELINE_TIMELINE_RENDER_ENTIRE_HEADER_FROM_DISK_CACHE";
            case ParserMinimalBase.INT_CR /*13*/:
                return "TIMELINE_TIMELINE_RENDER_LOWRES_HEADER_FROM_SERVER";
            case 14:
                return "TIMELINE_TIMELINE_RENDER_LOWRES_HEADER_FROM_DISK_CACHE";
            case 16:
                return "TIMELINE_TIMELINE_FIRST_UNITS_NETWORK_FETCH";
            case Process.SIGCONT /*18*/:
                return "TIMELINE_TIMELINE_LOAD_FIRST_SECTION";
            case Process.SIGSTOP /*19*/:
                return "TIMELINE_TIMELINE_LOAD_FIRST_SECTION_FROM_SERVER";
            case Process.SIGTSTP /*20*/:
                return "TIMELINE_TIMELINE_LOAD_FIRST_SECTION_FROM_CACHE";
            case 21:
                return "TIMELINE_TIMELINE_VISIBLE_SCROLL_FETCH_UNITS";
            case 22:
                return "TIMELINE_TIMELINE_LOAD_PROFILE_PIC_PREVIEW";
            case 23:
                return "TIMELINE_TIMELINE_LOAD_COVER_PHOTO_LOW_RES";
            case 24:
                return "TIMELINE_TIMELINE_LOAD_COVER_PHOTO";
            case 25:
                return "TIMELINE_TIMELINE_LOAD_PROFILE_PIC";
            case 26:
                return "TIMELINE_TIMELINE_RENDER_LOWRES_HEADER";
            case 27:
                return "TIMELINE_TIMELINE_RENDER_LOWRES_HEADER_COVERPHOTO_OPTIONAL";
            case 30:
                return "TIMELINE_COLLECTIONS_SUMMARY_LOAD_FIRST_SECTIONS";
            case 31:
                return "TIMELINE_TIMELINE_INITIAL_FETCH_UNITS";
            case 32:
                return "TIMELINE_TIMELINE_SCROLL_FETCH_UNITS";
            case ParserMinimalBase.INT_QUOTE /*34*/:
                return "TIMELINE_COLLECTIONS_COLLECTION_LOAD_FIRST_FETCHED_ITEMS";
            case 37:
                return "TIMELINE_LIFE_EVENT_TYPE_TTI";
            case 38:
                return "TIMELINE_TIMELINE_START_EARLY_FETCH";
            case 40:
                return "TIMELINE_PROTILES_WAIT_TIME";
            case 41:
                return "TIMELINE_PROTILES_NETWORK_FETCH";
            case ParserMinimalBase.INT_ASTERISK /*42*/:
                return "TIMELINE_TIMELINE_CONTEXT_ITEMS_NETWORK_FETCH";
            case 43:
                return "TIMELINE_COLLECTIONS_SUMMARY_LOAD_PRELIM_DATA";
            case ParserMinimalBase.INT_COMMA /*44*/:
                return "TIMELINE_COLLECTIONS_SECTION_LOAD_PRELIM_DATA";
            case 45:
                return "TIMELINE_COLLECTIONS_COLLECTION_LOAD_PRELIM_DATA";
            case 46:
                return "TIMELINE_COLLECTIONS_SUMMARY_LOAD_ALL_SECTIONS";
            case ParserMinimalBase.INT_SLASH /*47*/:
                return "TIMELINE_COLLECTIONS_SECTION_LOAD_ALL_COLLECTIONS";
            case 48:
                return "TIMELINE_COLLECTIONS_COLLECTION_LOAD_COLLECTION";
            case 49:
                return "TIMELINE_COLLECTIONS_SUMMARY_HAS_PRELIM_DATA";
            case 50:
                return "TIMELINE_COLLECTIONS_SUMMARY_NO_PRELIM_DATA";
            case 51:
                return "TIMELINE_COLLECTIONS_SECTION_HAS_PRELIM_DATA";
            case 52:
                return "TIMELINE_COLLECTIONS_SECTION_NO_PRELIM_DATA";
            case 53:
                return "TIMELINE_COLLECTIONS_COLLECTION_HAS_PRELIM_DATA";
            case 54:
                return "TIMELINE_COLLECTIONS_COLLECTION_NO_PRELIM_DATA";
            case 61:
                return "TIMELINE_FETCH_STORIES";
            case 63:
                return "TIMELINE_TIMELINE_SPINNER_VISIBLE_FETCHING_STORIES";
            case 64:
                return "TIMELINE_PROTILES_WAIT_TO_RENDER_TIME";
            case 67:
                return "Additional Content Restoration Time";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
