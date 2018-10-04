package X;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;

/* renamed from: X.02g */
public final class AnonymousClass02g {
    /* renamed from: B */
    public static String m154B(int i) {
        switch (i) {
            case 10:
                return "FEED_PERMALINK_ON_CREATE_TO_LOAD";
            case 11:
                return "FEED_DB_FEED_LOAD_STORIES";
            default:
                switch (i) {
                    case 43:
                        return "FEED_HOT_AND_RENDER_TIME";
                    case ParserMinimalBase.INT_COMMA /*44*/:
                        return "FEED_HOT_AND_FRESH_RENDER_TIME";
                    default:
                        switch (i) {
                            case ParserMinimalBase.INT_SLASH /*47*/:
                                return "FEED_PERMALINK_ON_CREATE_TO_LOAD_IF_NO_NAVIGATIONAL_METRICS";
                            case 48:
                                return "FEED_PERMALINK_NOTIFICATION_LOAD";
                            case 49:
                                return "FEED_NNF_PERMALINK_ANDROID_NOTIFICATION_WARM_LOAD";
                            case 50:
                                return "NNFVisibleTailFetchTime";
                            default:
                                switch (i) {
                                    case 52:
                                        return "FEED_NNF_PERMALINK_ANDROID_NOTIFICATION_COLD_LOAD";
                                    case 53:
                                        return "NNFBackpressToFeed";
                                    case 54:
                                        return "NNFBackpressToFeedWithCreation";
                                    default:
                                        switch (i) {
                                            case 56:
                                                return "FEED_NNF_HOT_TTI";
                                            case 57:
                                                return "FEED_NNF_FRAGMENT_VIEW_CREATE_TAG";
                                            case ParserMinimalBase.INT_COLON /*58*/:
                                                return "FEED_NNF_FIRST_RUN_COLD_START_TAG";
                                            default:
                                                switch (i) {
                                                    case StartupQEsConfig.DEFAULT_FPS_EXPECTED_FPS /*60*/:
                                                        return "FEED_NNF_COLD_START_CHROME_LOAD_TIME_TAG";
                                                    case 61:
                                                        return "NNFNavigateToFeedWithCreation";
                                                    case 62:
                                                        return "FEED_NNF_FEED_TAIL_FETCH_TIME";
                                                    case 63:
                                                        return "FEED_NNF_FEED_TAIL_FETCH_RENDER_TIME";
                                                    case 64:
                                                        return "FEED_NNF_FEED_PULL_TO_REFRESH_NETWORK_TIME";
                                                    case 65:
                                                        return "NNFPullToRefreshNetworkAndRenderTime";
                                                    case 66:
                                                        return "FEED_NNF_FEED_TAIL_FETCH_NETWORK_CALL_TIME";
                                                    case 67:
                                                        return "FEED_NNF_FEED_TAIL_FETCH_NOT_CONNECTED_CALL_TIME";
                                                    case 68:
                                                        return "NNFNavigateToOtherFeed";
                                                    default:
                                                        switch (i) {
                                                            case 70:
                                                                return "FEED_NNF_WARM_DATA_FETCHED_TO_FIRST_RENDER_TAG";
                                                            case 71:
                                                                return "FEED_NNF_WARM_FRAGMENT_CREATE_TO_DATA_FETCHED_TAG";
                                                            case 72:
                                                                return "FEED_NNF_COLD_DATA_FETCHED_TO_FIRST_RENDER_TAG";
                                                            case 73:
                                                                return "FEED_NNF_HOT_AND_CACHED_RENDER_TIME";
                                                            case 74:
                                                                return "FEED_NNF_HOT_AND_FRESH_RENDER_TIME_NOT_VISIBLE";
                                                            default:
                                                                switch (i) {
                                                                    case 82:
                                                                        return "FEED_NNF_COLD_START_DB_CACHE_TAG";
                                                                    case 83:
                                                                        return "FEED_NNF_COLD_FRAGMENT_CREATE_TO_DATA_FETCHED_TAG";
                                                                    case 84:
                                                                        return "FEED_NNF_COLD_FRESH_CONTENT_START_TAG";
                                                                    case 85:
                                                                        return "FEED_NNF_FEED_PULL_TO_REFRESH_BEFORE_EXECUTE_TIME";
                                                                    default:
                                                                        switch (i) {
                                                                            case 90:
                                                                                return "FEED_NNF_COLD_MAINTAB_CREATE_TO_FEED_CREATE_TAG";
                                                                            case ParserMinimalBase.INT_LBRACKET /*91*/:
                                                                                return "FEED_NNF_WARM_MAINTAB_CREATE_TO_FEED_CREATE_TAG";
                                                                            default:
                                                                                switch (i) {
                                                                                    case 112:
                                                                                        return "FEED_NNF_FRESH_FETCH_TAG";
                                                                                    case 113:
                                                                                        return "FEED_NNF_COLD_TTI";
                                                                                    case ParserMinimalBase.INT_r /*114*/:
                                                                                        return "FEED_NNF_COLD_AND_RENDER_TIME";
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case ParserMinimalBase.INT_t /*116*/:
                                                                                                return "FEED_NNF_COLD_STATE";
                                                                                            case ParserMinimalBase.INT_u /*117*/:
                                                                                                return "FEED_NNF_WARM_STATE";
                                                                                            case 118:
                                                                                                return "FEED_NNF_NAVIGATE_STATE";
                                                                                            case 119:
                                                                                                return "FEED_NNF_NAVIGATE_OTHER_STATE";
                                                                                            case 120:
                                                                                                return "FEED_NNF_OTHER_STATE";
                                                                                            default:
                                                                                                switch (i) {
                                                                                                    case ParserMinimalBase.INT_RCURLY /*125*/:
                                                                                                        return "FEED_COLD_START_STEP";
                                                                                                    case 126:
                                                                                                        return "FEED_WARM_START_STEP";
                                                                                                    case 127:
                                                                                                        return "FEED_EVENTS_NETWORK_TIME";
                                                                                                    case 128:
                                                                                                        return "FEED_FRIEND_LIST_FEED_NEWTORK_TIME";
                                                                                                    default:
                                                                                                        switch (i) {
                                                                                                            case 130:
                                                                                                                return "FEED_GROUPS_NETWORK_TIME";
                                                                                                            case 131:
                                                                                                                return "FEED_HASHTAG_FEED_NETWORK_TIME";
                                                                                                            default:
                                                                                                                switch (i) {
                                                                                                                    case 135:
                                                                                                                        return "FEED_NNF_NETWORK_TIME";
                                                                                                                    case 136:
                                                                                                                        return "FEED_NNF_NETWORK_TIME_CHUNKED_REMAINDER";
                                                                                                                    case 137:
                                                                                                                        return "FEED_NNF_NETWORK_TIME_TAIL";
                                                                                                                    case 138:
                                                                                                                        return "FEED_NNF_NETWORK_TIME_UNSET";
                                                                                                                    case 139:
                                                                                                                        return "FEED_REACTION_FEED_NETWORK_TIME";
                                                                                                                    default:
                                                                                                                        switch (i) {
                                                                                                                            case 155:
                                                                                                                                return "FEED_COLD_LOAD_INLINE_COMPOSER_AFTER_LOGGED_IN";
                                                                                                                            case 156:
                                                                                                                                return "FEED_WARM_LOAD_INLINE_COMPOSER_AFTER_LOGGED_IN";
                                                                                                                            default:
                                                                                                                                switch (i) {
                                                                                                                                    case 165:
                                                                                                                                        return "FEED_FRESH_FEED_RERANK";
                                                                                                                                    case 166:
                                                                                                                                        return "FEED_INSPIRATIONCAMERA_COLD_TTI";
                                                                                                                                    case 167:
                                                                                                                                        return "FEED_INSPIRATIONCAMERA_WARM_TTI";
                                                                                                                                    default:
                                                                                                                                        switch (i) {
                                                                                                                                            case 171:
                                                                                                                                                return "FEED_INSPIRATION_DIVEBAR_FEED_TO_CAMERA";
                                                                                                                                            case 172:
                                                                                                                                                return "FEED_INSPIRATION_DIVEBAR_CAMERA_TO_FEED";
                                                                                                                                            case 173:
                                                                                                                                                return "FEED_COLD_FEED_UNIT_ADAPTER_INIT_TOTAL";
                                                                                                                                            case 174:
                                                                                                                                                return "FEED_TOUCH_LATENCY";
                                                                                                                                            case 175:
                                                                                                                                                return "FEED_POST_STARTUP";
                                                                                                                                            case 176:
                                                                                                                                                return "FEED_DB_CACHE_LOAD";
                                                                                                                                            default:
                                                                                                                                                switch (i) {
                                                                                                                                                    case 181:
                                                                                                                                                        return "FEED_POST_RESUME";
                                                                                                                                                    case 182:
                                                                                                                                                        return "FEED_INSPIRATION_FEED_NETWORK_TIME";
                                                                                                                                                    case 183:
                                                                                                                                                        return "FEED_PERMALINK_NOTIFICATION_FLYOUT_LOAD";
                                                                                                                                                    case 184:
                                                                                                                                                        return "FEED_NETWORK_FETCH";
                                                                                                                                                    case 185:
                                                                                                                                                        return "FEED_CACHE_FETCH";
                                                                                                                                                    case 186:
                                                                                                                                                        return "FEED_LOAD";
                                                                                                                                                    case 187:
                                                                                                                                                        return "FEED_AGGRESSIVE_FEEDUNIT_INFLATER";
                                                                                                                                                    case 188:
                                                                                                                                                        return "NNF_NETWORK_TIME_HEAD";
                                                                                                                                                    default:
                                                                                                                                                        switch (i) {
                                                                                                                                                            case 192:
                                                                                                                                                                return "FEED_PD_COMPAT_RENDER";
                                                                                                                                                            case 193:
                                                                                                                                                                return "FEED_CREATOR_APP_PAGE_FOLLOWING_FEED_NETWORK_TIME";
                                                                                                                                                            default:
                                                                                                                                                                switch (i) {
                                                                                                                                                                    case 195:
                                                                                                                                                                        return "FEED_LOAD_STORY_PERMALINK_FROM_ANYWHERE";
                                                                                                                                                                    case 196:
                                                                                                                                                                        return "FEED_TAIL_LOAD_TTI";
                                                                                                                                                                    case 197:
                                                                                                                                                                        return "FEED_LOAD_ANY_DESTINATION_FROM_NOTIFICATIONS";
                                                                                                                                                                    case 198:
                                                                                                                                                                        return "FEED_LOAD_THREADED_PERMALINK_FROM_ANYWHERE";
                                                                                                                                                                    default:
                                                                                                                                                                        switch (i) {
                                                                                                                                                                            case 201:
                                                                                                                                                                                return "FEED_STORY_DELIVERY";
                                                                                                                                                                            case 202:
                                                                                                                                                                                return "FEED_TAIL_NETWORK_FETCH";
                                                                                                                                                                            case 203:
                                                                                                                                                                                return "FEED_FEED_UNIT_EXISTS";
                                                                                                                                                                            default:
                                                                                                                                                                                switch (i) {
                                                                                                                                                                                    case 221:
                                                                                                                                                                                        return "FEED_CACHE_WRITE";
                                                                                                                                                                                    case 222:
                                                                                                                                                                                        return "FEED_ADS_CHANNEL_LOAD";
                                                                                                                                                                                    case 223:
                                                                                                                                                                                        return "FEED_ADS_CHANNEL_NETWORK_FETCH";
                                                                                                                                                                                    default:
                                                                                                                                                                                        switch (i) {
                                                                                                                                                                                            case 230:
                                                                                                                                                                                                return "FEED_SCROLL_PERF";
                                                                                                                                                                                            case 231:
                                                                                                                                                                                                return "FEED_LOAD_ANY_DESTINATION_FROM_PRELOAD_CAROUSEL";
                                                                                                                                                                                            case 232:
                                                                                                                                                                                                return "FEED_LOAD_STORY_PERMALINK_FROM_PRELOAD_CAROUSEL";
                                                                                                                                                                                            case 233:
                                                                                                                                                                                                return "FEED_LOAD_THREADED_PERMALINK_FROM_PRELOAD_CAROUSEL";
                                                                                                                                                                                            default:
                                                                                                                                                                                                switch (i) {
                                                                                                                                                                                                    case 238:
                                                                                                                                                                                                        return "FEED_FBLITE_IN_FB4A_HOT_TTI";
                                                                                                                                                                                                    case 239:
                                                                                                                                                                                                        return "FEED_FRESH_FEED_JS_ORDER_COLLECTION";
                                                                                                                                                                                                    case 240:
                                                                                                                                                                                                        return "FEED_QPL_FEED_SCROLLING";
                                                                                                                                                                                                    case 241:
                                                                                                                                                                                                        return "FEED_LIVE_VPV_ANDROID";
                                                                                                                                                                                                    default:
                                                                                                                                                                                                        switch (i) {
                                                                                                                                                                                                            case 244:
                                                                                                                                                                                                                return "FEED_LIVE_VPV_ELIGIBLE_ANDROID";
                                                                                                                                                                                                            case 245:
                                                                                                                                                                                                                return "FEED_IMAGE_REQUEST";
                                                                                                                                                                                                            default:
                                                                                                                                                                                                                switch (i) {
                                                                                                                                                                                                                    case 1:
                                                                                                                                                                                                                        return "FEED_NNF_COLD_START";
                                                                                                                                                                                                                    case 4:
                                                                                                                                                                                                                        return "NNFWarmStart";
                                                                                                                                                                                                                    case 8:
                                                                                                                                                                                                                        return "FEED_PERMALINK_FROM_FEED_LOAD";
                                                                                                                                                                                                                    case ParserMinimalBase.INT_CR /*13*/:
                                                                                                                                                                                                                        return "FEED_COLD_START_DB_CACHE";
                                                                                                                                                                                                                    case 15:
                                                                                                                                                                                                                        return "FEED_FRESH_FETCH";
                                                                                                                                                                                                                    case Process.SIGSTOP /*19*/:
                                                                                                                                                                                                                        return "FEED_WARM_TTI";
                                                                                                                                                                                                                    case 22:
                                                                                                                                                                                                                        return "NNFColdStartTTI";
                                                                                                                                                                                                                    case 30:
                                                                                                                                                                                                                        return "FEED_WARM_START";
                                                                                                                                                                                                                    case 32:
                                                                                                                                                                                                                        return "FEED_COLD_AND_RENDER_TIME";
                                                                                                                                                                                                                    case 35:
                                                                                                                                                                                                                        return "FEED_WARM_AND_RENDER_TIME";
                                                                                                                                                                                                                    case 77:
                                                                                                                                                                                                                        return "FEED_COLD_START_NETWORK";
                                                                                                                                                                                                                    case 88:
                                                                                                                                                                                                                        return "NNFNavigateToFeed";
                                                                                                                                                                                                                    case 122:
                                                                                                                                                                                                                        return "FEED_BIND_VIEW";
                                                                                                                                                                                                                    case 147:
                                                                                                                                                                                                                        return "FEED_PAGE_FEED_NETWORK_TIME";
                                                                                                                                                                                                                    case 150:
                                                                                                                                                                                                                        return "FEED_FEED_SCROLLING";
                                                                                                                                                                                                                    case 169:
                                                                                                                                                                                                                        return "FEED_INSPIRATION_DIVEBAR_CAMERA_TTI";
                                                                                                                                                                                                                    case 179:
                                                                                                                                                                                                                        return "FEED_FBLITE_IN_FB4A_COLD_TTI";
                                                                                                                                                                                                                    case 206:
                                                                                                                                                                                                                        return "FEED_CONSUMPTION_RESTORATION_ANDROID";
                                                                                                                                                                                                                    case 209:
                                                                                                                                                                                                                        return "FEED_FBLITE_IN_FB4A_WARM_TTI";
                                                                                                                                                                                                                    case 212:
                                                                                                                                                                                                                        return "FEED_PHOTOS_FEED_TTI";
                                                                                                                                                                                                                    case 219:
                                                                                                                                                                                                                        return "FEED_PERMALINK_FROM_NOTIF_HEAD_LOAD";
                                                                                                                                                                                                                    case 226:
                                                                                                                                                                                                                        return "FEED_IMAGE_LOG_FAKE_MOBILE_LAB_AVG_ANDROID";
                                                                                                                                                                                                                    case 248:
                                                                                                                                                                                                                        return "FEED_FEED_ANDROID_LOAD_DB";
                                                                                                                                                                                                                    default:
                                                                                                                                                                                                                        return "UNDEFINED_QPL_EVENT";
                                                                                                                                                                                                                }
                                                                                                                                                                                                        }
                                                                                                                                                                                                }
                                                                                                                                                                                        }
                                                                                                                                                                                }
                                                                                                                                                                        }
                                                                                                                                                                }
                                                                                                                                                        }
                                                                                                                                                }
                                                                                                                                        }
                                                                                                                                }
                                                                                                                        }
                                                                                                                }
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
