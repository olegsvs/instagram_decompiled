package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2b7 */
public final class AnonymousClass2b7 {
    /* renamed from: B */
    public static boolean m16385B(AnonymousClass2En anonymousClass2En, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("username".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2En.f27929C = str2;
            return true;
        } else if (!"prototype".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2En.f27928B = str2;
            return true;
        }
    }

    /* renamed from: C */
    public static void m16386C(JsonGenerator jsonGenerator, AnonymousClass2En anonymousClass2En, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass2En.f27929C != null) {
            jsonGenerator.writeStringField("username", anonymousClass2En.f27929C);
        }
        if (anonymousClass2En.f27928B != null) {
            jsonGenerator.writeStringField("prototype", anonymousClass2En.f27928B);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass2En parseFromJson(JsonParser jsonParser) {
        AnonymousClass2En anonymousClass2En = new AnonymousClass2En();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2b7.m16385B(anonymousClass2En, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2En;
    }

    public static AnonymousClass2En parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass2b7.parseFromJson(createParser);
    }
}
