package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0fi */
public final class AnonymousClass0fi {
    /* renamed from: B */
    public static boolean m6546B(AnonymousClass0fs anonymousClass0fs, String str, JsonParser jsonParser) {
        if ("multiple_question_survey".equals(str)) {
            anonymousClass0fs.f8007H = AnonymousClass0m6.parseFromJson(jsonParser);
            return true;
        } else if ("megaphone".equals(str)) {
            anonymousClass0fs.f8006G = AnonymousClass11a.parseFromJson(jsonParser);
            return true;
        } else {
            String str2 = null;
            List arrayList;
            if ("feed_items".equals(str)) {
                if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        AnonymousClass0fH B = AnonymousClass0fH.m6520B(jsonParser);
                        if (B != null) {
                            arrayList.add(B);
                        }
                    }
                }
                anonymousClass0fs.f8003D = arrayList;
                return true;
            } else if ("client_gap_enforcer_matrix".equals(str)) {
                if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        AnonymousClass11f parseFromJson = AnonymousClass11e.parseFromJson(jsonParser);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                anonymousClass0fs.f8004E = arrayList;
                return true;
            } else if ("client_session_id".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass0fs.f8002C = str2;
                return true;
            } else if ("view_state_version".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass0fs.f8011L = str2;
                return true;
            } else if ("client_feed_changelist_applied".equals(str)) {
                anonymousClass0fs.f8001B = Boolean.valueOf(jsonParser.getValueAsBoolean());
                return true;
            } else if ("suggested_users".equals(str)) {
                anonymousClass0fs.f8010K = AnonymousClass11h.parseFromJson(jsonParser);
                return true;
            } else if ("pagination_info".equals(str)) {
                anonymousClass0fs.f8008I = AnonymousClass11i.parseFromJson(jsonParser);
                return true;
            } else if (!"startup_prefetch_configs".equals(str)) {
                return AnonymousClass11j.m8822B(anonymousClass0fs, str, jsonParser);
            } else {
                anonymousClass0fs.f8009J = AnonymousClass3UE.parseFromJson(jsonParser);
                return true;
            }
        }
    }

    public static AnonymousClass0fs parseFromJson(JsonParser jsonParser) {
        AnonymousClass0fs anonymousClass0fs = new AnonymousClass0fs();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0fi.m6546B(anonymousClass0fs, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0fs.m6572J();
    }
}
