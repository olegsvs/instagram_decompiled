package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;

/* renamed from: X.1XB */
public final class AnonymousClass1XB {
    /* renamed from: B */
    public static boolean m11758B(AnonymousClass0mt anonymousClass0mt, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0mt.f9924D = str2;
            return true;
        } else if ("tracking_token".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0mt.f9930J = str2;
            return true;
        } else if ("sponsor".equals(str)) {
            anonymousClass0mt.f9928H = AnonymousClass0Ci.m980B(jsonParser);
            return true;
        } else if ("subtitle".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0mt.f9929I = str2;
            return true;
        } else if ("questions".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                r2 = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0mw parseFromJson = AnonymousClass3QT.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        r2.add(parseFromJson);
                    }
                }
            }
            anonymousClass0mt.f9926F = r2;
            return true;
        } else if ("hide_reasons_v2".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                r2 = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0yT parseFromJson2 = AnonymousClass129.parseFromJson(jsonParser);
                    if (parseFromJson2 != null) {
                        r2.add(parseFromJson2);
                    }
                }
            }
            anonymousClass0mt.f9923C = r2;
            return true;
        } else if ("learn_more_url".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0mt.f9925E = str2;
            return true;
        } else if ("show_learn_more".equals(str)) {
            anonymousClass0mt.f9927G = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"disclaimer_content".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0mt.f9922B = str2;
            return true;
        }
    }

    public static AnonymousClass0mt parseFromJson(JsonParser jsonParser) {
        AnonymousClass0mt anonymousClass0mt = new AnonymousClass0mt();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1XB.m11758B(anonymousClass0mt, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0mt;
    }
}
