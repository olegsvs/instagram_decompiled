package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4qf */
public final class AnonymousClass4qf {
    /* renamed from: B */
    public static boolean m25200B(AnonymousClass4qe anonymousClass4qe, String str, JsonParser jsonParser) {
        List list = null;
        if ("ig_user_id".equals(str)) {
            String text;
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass4qe.f57852C = text;
            return true;
        } else if ("meta_data".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass4qb parseFromJson = AnonymousClass4qh.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass4qe.f57851B = list;
            return true;
        } else if (!"should_include_notif_in_count".equals(str)) {
            return false;
        } else {
            anonymousClass4qe.f57853D = jsonParser.getValueAsBoolean();
            return true;
        }
    }

    public static AnonymousClass4qe parseFromJson(JsonParser jsonParser) {
        AnonymousClass4qe anonymousClass4qe = new AnonymousClass4qe();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4qf.m25200B(anonymousClass4qe, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass4qe;
    }
}
