package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.1NE */
public final class AnonymousClass1NE {
    /* renamed from: B */
    public static boolean m11037B(AnonymousClass1NF anonymousClass1NF, String str, JsonParser jsonParser) {
        if ("width".equals(str)) {
            anonymousClass1NF.f17780D = jsonParser.getValueAsInt();
            return true;
        } else if ("height".equals(str)) {
            anonymousClass1NF.f17778B = jsonParser.getValueAsInt();
            return true;
        } else if (!IgReactNavigatorModule.URL.equals(str)) {
            return false;
        } else {
            anonymousClass1NF.f17779C = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        }
    }

    /* renamed from: C */
    public static void m11038C(JsonGenerator jsonGenerator, AnonymousClass1NF anonymousClass1NF, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        jsonGenerator.writeNumberField("width", anonymousClass1NF.f17780D);
        jsonGenerator.writeNumberField("height", anonymousClass1NF.f17778B);
        if (anonymousClass1NF.f17779C != null) {
            jsonGenerator.writeStringField(IgReactNavigatorModule.URL, anonymousClass1NF.f17779C);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass1NF parseFromJson(JsonParser jsonParser) {
        AnonymousClass1NF anonymousClass1NF = new AnonymousClass1NF();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1NE.m11037B(anonymousClass1NF, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1NF;
    }
}
