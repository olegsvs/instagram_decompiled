package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.4dk */
public final class AnonymousClass4dk {
    /* renamed from: B */
    public static boolean m24624B(AnonymousClass4db anonymousClass4db, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass4db.f55860C = str2;
            return true;
        } else if (IgReactNavigatorModule.URL.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass4db.f55862E = str2;
            return true;
        } else if ("width".equals(str)) {
            anonymousClass4db.f55864G = (float) jsonParser.getValueAsDouble();
            return true;
        } else if ("height".equals(str)) {
            anonymousClass4db.f55859B = (float) jsonParser.getValueAsDouble();
            return true;
        } else if ("is_random".equals(str)) {
            anonymousClass4db.f55861D = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"user".equals(str)) {
            return false;
        } else {
            anonymousClass4db.f55863F = AnonymousClass4dj.parseFromJson(jsonParser);
            return true;
        }
    }

    /* renamed from: C */
    public static void m24625C(JsonGenerator jsonGenerator, AnonymousClass4db anonymousClass4db, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass4db.f55860C != null) {
            jsonGenerator.writeStringField("id", anonymousClass4db.f55860C);
        }
        if (anonymousClass4db.f55862E != null) {
            jsonGenerator.writeStringField(IgReactNavigatorModule.URL, anonymousClass4db.f55862E);
        }
        jsonGenerator.writeNumberField("width", anonymousClass4db.f55864G);
        jsonGenerator.writeNumberField("height", anonymousClass4db.f55859B);
        jsonGenerator.writeBooleanField("is_random", anonymousClass4db.f55861D);
        if (anonymousClass4db.f55863F != null) {
            jsonGenerator.writeFieldName("user");
            AnonymousClass4dj.m24623C(jsonGenerator, anonymousClass4db.f55863F, true);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass4db parseFromJson(JsonParser jsonParser) {
        AnonymousClass4db anonymousClass4db = new AnonymousClass4db();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4dk.m24624B(anonymousClass4db, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass4db;
    }
}
