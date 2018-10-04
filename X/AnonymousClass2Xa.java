package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Xa */
public final class AnonymousClass2Xa {
    /* renamed from: B */
    public static boolean m16217B(AnonymousClass2XJ anonymousClass2XJ, String str, JsonParser jsonParser) {
        if ("max_lines".equals(str)) {
            anonymousClass2XJ.f31179F = jsonParser.getValueAsInt();
            return true;
        }
        String str2 = null;
        if ("capitalization_style".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2XJ.f31175B = str2;
            return true;
        } else if ("font_family".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2XJ.f31176C = str2;
            return true;
        } else if ("font_size".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2XJ.f31177D = str2;
            return true;
        } else if ("line_height".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2XJ.f31178E = str2;
            return true;
        } else if ("text_color".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2XJ.f31180G = str2;
            return true;
        } else if (!"word_kerning".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2XJ.f31181H = str2;
            return true;
        }
    }

    public static AnonymousClass2XJ parseFromJson(JsonParser jsonParser) {
        AnonymousClass2XJ anonymousClass2XJ = new AnonymousClass2XJ();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Xa.m16217B(anonymousClass2XJ, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2XJ;
    }
}
