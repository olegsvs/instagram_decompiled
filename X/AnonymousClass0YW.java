package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.0YW */
public final class AnonymousClass0YW {
    /* renamed from: B */
    public static boolean m5300B(AnonymousClass0YV anonymousClass0YV, String str, JsonParser jsonParser) {
        if ("media".equals(str)) {
            anonymousClass0YV.f6270D = AnonymousClass0P7.m3742B(jsonParser, true);
            return true;
        }
        String str2 = null;
        if ("text".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0YV.f6275I = str2;
            return true;
        } else if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0YV.f6272F = str2;
            return true;
        } else if ("message".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0YV.f6271E = str2;
            return true;
        } else if ("is_linked".equals(str)) {
            anonymousClass0YV.f6268B = jsonParser.getValueAsBoolean();
            return true;
        } else if ("is_reel_persisted".equals(str)) {
            anonymousClass0YV.f6269C = jsonParser.getValueAsBoolean();
            return true;
        } else if ("reel_type".equals(str)) {
            anonymousClass0YV.f6274H = AnonymousClass0Zg.m5379B(jsonParser.getValueAsString());
            return true;
        } else if (!"reel_id".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0YV.f6273G = str2;
            return true;
        }
    }

    /* renamed from: C */
    public static void m5301C(JsonGenerator jsonGenerator, AnonymousClass0YV anonymousClass0YV, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass0YV.f6270D != null) {
            jsonGenerator.writeFieldName("media");
            AnonymousClass11o.m8826C(jsonGenerator, anonymousClass0YV.f6270D, true);
        }
        if (anonymousClass0YV.f6275I != null) {
            jsonGenerator.writeStringField("text", anonymousClass0YV.f6275I);
        }
        if (anonymousClass0YV.f6272F != null) {
            jsonGenerator.writeStringField(DialogModule.KEY_TITLE, anonymousClass0YV.f6272F);
        }
        if (anonymousClass0YV.f6271E != null) {
            jsonGenerator.writeStringField("message", anonymousClass0YV.f6271E);
        }
        jsonGenerator.writeBooleanField("is_linked", anonymousClass0YV.f6268B);
        jsonGenerator.writeBooleanField("is_reel_persisted", anonymousClass0YV.f6269C);
        if (anonymousClass0YV.f6274H != null) {
            jsonGenerator.writeStringField("reel_type", anonymousClass0YV.f6274H.m5380A());
        }
        if (anonymousClass0YV.f6273G != null) {
            jsonGenerator.writeStringField("reel_id", anonymousClass0YV.f6273G);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass0YV parseFromJson(JsonParser jsonParser) {
        AnonymousClass0YV anonymousClass0YV = new AnonymousClass0YV();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0YW.m5300B(anonymousClass0YV, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0YV;
    }
}
