package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2XM */
public final class AnonymousClass2XM {
    /* renamed from: B */
    public static boolean m16203B(AnonymousClass2X8 anonymousClass2X8, String str, JsonParser jsonParser) {
        if ("linkType".equals(str)) {
            anonymousClass2X8.f31142D = jsonParser.getValueAsInt();
            return true;
        }
        String str2 = null;
        if ("app_package".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2X8.f31140B = str2;
            return true;
        } else if ("deeplinkUri".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2X8.f31141C = str2;
            return true;
        } else if (!"webUri".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2X8.f31143E = str2;
            return true;
        }
    }

    public static AnonymousClass2X8 parseFromJson(JsonParser jsonParser) {
        AnonymousClass2X8 anonymousClass2X8 = new AnonymousClass2X8();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2XM.m16203B(anonymousClass2X8, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2X8;
    }
}
