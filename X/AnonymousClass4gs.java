package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.4gs */
public final class AnonymousClass4gs {
    /* renamed from: B */
    public static boolean m24786B(AnonymousClass4gr anonymousClass4gr, String str, JsonParser jsonParser) {
        if ("expiring_media_action_summary".equals(str)) {
            anonymousClass4gr.f56322B = AnonymousClass1dP.parseFromJson(jsonParser);
            return true;
        } else if ("media".equals(str)) {
            anonymousClass4gr.f56323C = AnonymousClass0P7.B(jsonParser, true);
            return true;
        } else if ("pending_media".equals(str)) {
            anonymousClass4gr.f56325E = AnonymousClass19Z.parseFromJson(jsonParser);
            return true;
        } else if ("seen_count".equals(str)) {
            anonymousClass4gr.f56326F = jsonParser.getValueAsInt();
            return true;
        } else if ("url_expire_at_secs".equals(str)) {
            anonymousClass4gr.f56324D = Long.valueOf(jsonParser.getValueAsLong());
            return true;
        } else if (!"view_mode".equals(str)) {
            return false;
        } else {
            anonymousClass4gr.f56327G = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        }
    }

    /* renamed from: C */
    public static void m24787C(JsonGenerator jsonGenerator, AnonymousClass4gr anonymousClass4gr, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass4gr.f56322B != null) {
            jsonGenerator.writeFieldName("expiring_media_action_summary");
            AnonymousClass1dP.C(jsonGenerator, anonymousClass4gr.f56322B, true);
        }
        if (anonymousClass4gr.f56323C != null) {
            jsonGenerator.writeFieldName("media");
            AnonymousClass11o.C(jsonGenerator, anonymousClass4gr.f56323C, true);
        }
        if (anonymousClass4gr.f56325E != null) {
            jsonGenerator.writeFieldName("pending_media");
            AnonymousClass19Z.C(jsonGenerator, anonymousClass4gr.f56325E, true);
        }
        jsonGenerator.writeNumberField("seen_count", anonymousClass4gr.f56326F);
        if (anonymousClass4gr.f56324D != null) {
            jsonGenerator.writeNumberField("url_expire_at_secs", anonymousClass4gr.f56324D.longValue());
        }
        if (anonymousClass4gr.f56327G != null) {
            jsonGenerator.writeStringField("view_mode", anonymousClass4gr.f56327G);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass4gr parseFromJson(JsonParser jsonParser) {
        AnonymousClass4gr anonymousClass4gr = new AnonymousClass4gr();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4gs.m24786B(anonymousClass4gr, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass4gr;
    }
}
