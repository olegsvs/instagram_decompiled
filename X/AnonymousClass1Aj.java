package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.model.venue.Venue;

/* renamed from: X.1Aj */
public final class AnonymousClass1Aj {
    /* renamed from: B */
    public static boolean m9755B(AnonymousClass1Ak anonymousClass1Ak, String str, JsonParser jsonParser) {
        if ("location".equals(str)) {
            anonymousClass1Ak.f15312E = Venue.parseFromJson(jsonParser, true);
            return true;
        }
        String str2 = null;
        if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Ak.f15311D = str2;
            return true;
        } else if ("subtitle".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Ak.f15310C = str2;
            return true;
        } else if (!"search_subtitle".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Ak.f15309B = str2;
            return true;
        }
    }

    /* renamed from: C */
    public static void m9756C(JsonGenerator jsonGenerator, AnonymousClass1Ak anonymousClass1Ak, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass1Ak.f15312E != null) {
            jsonGenerator.writeFieldName("location");
            AnonymousClass18p.m9639C(jsonGenerator, anonymousClass1Ak.f15312E, true);
        }
        if (anonymousClass1Ak.f15311D != null) {
            jsonGenerator.writeStringField(DialogModule.KEY_TITLE, anonymousClass1Ak.f15311D);
        }
        if (anonymousClass1Ak.f15310C != null) {
            jsonGenerator.writeStringField("subtitle", anonymousClass1Ak.f15310C);
        }
        if (anonymousClass1Ak.f15309B != null) {
            jsonGenerator.writeStringField("search_subtitle", anonymousClass1Ak.f15309B);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass1Ak parseFromJson(JsonParser jsonParser) {
        AnonymousClass1Ak anonymousClass1Ak = new AnonymousClass1Ak();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Aj.m9755B(anonymousClass1Ak, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1Ak;
    }

    public static AnonymousClass1Ak parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass1Aj.parseFromJson(createParser);
    }
}
