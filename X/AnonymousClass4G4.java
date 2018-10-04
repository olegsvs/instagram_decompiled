package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4G4 */
public final class AnonymousClass4G4 {
    /* renamed from: B */
    public static boolean m23677B(AnonymousClass4G3 anonymousClass4G3, String str, JsonParser jsonParser) {
        if ("parent_comment".equals(str)) {
            AnonymousClass122.parseFromJson(jsonParser);
            return true;
        }
        String str2 = null;
        if ("child_comments".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0SK parseFromJson = AnonymousClass122.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            anonymousClass4G3.f52054B = arrayList;
            return true;
        } else if ("next_min_child_cursor".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass4G3.f52058F = str2;
            return true;
        } else if ("next_max_child_cursor".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass4G3.f52057E = str2;
            return true;
        } else if ("has_more_tail_child_comments".equals(str)) {
            anonymousClass4G3.f52056D = jsonParser.getValueAsBoolean();
            return true;
        } else if ("has_more_head_child_comments".equals(str)) {
            anonymousClass4G3.f52055C = jsonParser.getValueAsBoolean();
            return true;
        } else if ("num_head_child_comments".equals(str)) {
            anonymousClass4G3.f52059G = jsonParser.getValueAsInt();
            return true;
        } else if (!"num_tail_child_comments".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass4G3, str, jsonParser);
        } else {
            anonymousClass4G3.f52060H = jsonParser.getValueAsInt();
            return true;
        }
    }

    public static AnonymousClass4G3 parseFromJson(JsonParser jsonParser) {
        AnonymousClass4G3 anonymousClass4G3 = new AnonymousClass4G3();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4G4.m23677B(anonymousClass4G3, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass4G3;
    }
}
