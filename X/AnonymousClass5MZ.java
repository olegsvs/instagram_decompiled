package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5MZ */
public final class AnonymousClass5MZ {
    /* renamed from: B */
    public static boolean m26337B(AnonymousClass5MY anonymousClass5MY, String str, JsonParser jsonParser) {
        List list = null;
        if ("comments".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass5ag parseFromJson = AnonymousClass5NX.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass5MY.f62628B = list;
            return true;
        } else if ("system_comments".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass5ai parseFromJson2 = AnonymousClass5NY.parseFromJson(jsonParser);
                    if (parseFromJson2 != null) {
                        list.add(parseFromJson2);
                    }
                }
            }
            anonymousClass5MY.f62632F = list;
            return true;
        } else if ("comment_count".equals(str)) {
            jsonParser.getValueAsInt();
            return true;
        } else if ("pinned_comment".equals(str)) {
            anonymousClass5MY.f62630D = AnonymousClass5NX.parseFromJson(jsonParser);
            return true;
        } else if ("live_seconds_per_comment".equals(str)) {
            anonymousClass5MY.f62631E = jsonParser.getValueAsInt();
            return true;
        } else if (!"comment_muted".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass5MY, str, jsonParser);
        } else {
            anonymousClass5MY.f62629C = jsonParser.getValueAsBoolean();
            return true;
        }
    }

    public static AnonymousClass5MY parseFromJson(JsonParser jsonParser) {
        AnonymousClass5MY anonymousClass5MY = new AnonymousClass5MY();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5MZ.m26337B(anonymousClass5MY, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        if (anonymousClass5MY.f62628B == null) {
            anonymousClass5MY.f62628B = new ArrayList();
        }
        if (anonymousClass5MY.f62632F == null) {
            anonymousClass5MY.f62632F = new ArrayList();
        }
        return anonymousClass5MY;
    }
}
