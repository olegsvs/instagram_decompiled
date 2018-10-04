package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.0Yc */
public final class AnonymousClass0Yc {
    /* renamed from: B */
    public static boolean m5303B(AnonymousClass0Yb anonymousClass0Yb, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("text".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0Yb.f6280E = str2;
            return true;
        } else if ("broadcast".equals(str)) {
            anonymousClass0Yb.f6279D = AnonymousClass19k.parseFromJson(jsonParser);
            return true;
        } else if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0Yb.f6278C = str2;
            return true;
        } else if (!"message".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0Yb.f6277B = str2;
            return true;
        }
    }

    /* renamed from: C */
    public static void m5304C(JsonGenerator jsonGenerator, AnonymousClass0Yb anonymousClass0Yb, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass0Yb.f6280E != null) {
            jsonGenerator.writeStringField("text", anonymousClass0Yb.f6280E);
        }
        if (anonymousClass0Yb.f6279D != null) {
            jsonGenerator.writeFieldName("broadcast");
            AnonymousClass19k.m9698C(jsonGenerator, anonymousClass0Yb.f6279D, true);
        }
        if (anonymousClass0Yb.f6278C != null) {
            jsonGenerator.writeStringField(DialogModule.KEY_TITLE, anonymousClass0Yb.f6278C);
        }
        if (anonymousClass0Yb.f6277B != null) {
            jsonGenerator.writeStringField("message", anonymousClass0Yb.f6277B);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass0Yb parseFromJson(JsonParser jsonParser) {
        AnonymousClass0Yb anonymousClass0Yb = new AnonymousClass0Yb();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0Yc.m5303B(anonymousClass0Yb, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0Yb;
    }
}
