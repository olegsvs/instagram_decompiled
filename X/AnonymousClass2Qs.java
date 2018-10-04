package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Qs */
public final class AnonymousClass2Qs {
    /* renamed from: B */
    public static boolean m15705B(AnonymousClass1uV anonymousClass1uV, String str, JsonParser jsonParser) {
        if ("startInvoked".equals(str)) {
            anonymousClass1uV.f24018D = jsonParser.getValueAsBoolean();
            return true;
        } else if ("endInvoked".equals(str)) {
            anonymousClass1uV.f24016B = jsonParser.getValueAsBoolean();
            return true;
        } else {
            List list = null;
            if ("streamId".equals(str)) {
                String text;
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    text = jsonParser.getText();
                }
                anonymousClass1uV.f24019E = text;
                return true;
            } else if ("uploadJobResult".equals(str)) {
                anonymousClass1uV.f24021G = AnonymousClass2Qt.parseFromJson(jsonParser);
                return true;
            } else if ("segments".equals(str)) {
                if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    list = new ArrayList();
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        r0 = AnonymousClass2Qr.parseFromJson(jsonParser);
                        if (r0 != null) {
                            list.add(r0);
                        }
                    }
                }
                anonymousClass1uV.f24017C = list;
                return true;
            } else if (!"transferredSegments".equals(str)) {
                return false;
            } else {
                if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    list = new ArrayList();
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        r0 = AnonymousClass2Qr.parseFromJson(jsonParser);
                        if (r0 != null) {
                            list.add(r0);
                        }
                    }
                }
                anonymousClass1uV.f24020F = list;
                return true;
            }
        }
    }

    public static AnonymousClass1uV parseFromJson(JsonParser jsonParser) {
        AnonymousClass1uV anonymousClass1uV = new AnonymousClass1uV();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Qs.m15705B(anonymousClass1uV, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1uV;
    }

    public static AnonymousClass1uV parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass2Qs.parseFromJson(createParser);
    }
}
