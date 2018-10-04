package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2US */
public final class AnonymousClass2US {
    /* renamed from: B */
    public static boolean m16034B(AnonymousClass0NM anonymousClass0NM, String str, JsonParser jsonParser) {
        if (!"module_name".equals(str)) {
            return false;
        }
        anonymousClass0NM.f3550B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }

    /* renamed from: C */
    public static void m16035C(JsonGenerator jsonGenerator, AnonymousClass0NM anonymousClass0NM, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass0NM.f3550B != null) {
            jsonGenerator.writeStringField("module_name", anonymousClass0NM.f3550B);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass0NM parseFromJson(JsonParser jsonParser) {
        AnonymousClass0NM anonymousClass0NM = new AnonymousClass0NM();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2US.m16034B(anonymousClass0NM, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0NM;
    }
}
