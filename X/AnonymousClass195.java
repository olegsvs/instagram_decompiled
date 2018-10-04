package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.195 */
public final class AnonymousClass195 {
    /* renamed from: B */
    public static boolean m9643B(AnonymousClass196 anonymousClass196, String str, JsonParser jsonParser) {
        if ("viewer_can_vote".equals(str)) {
            anonymousClass196.f15066C = jsonParser.getValueAsBoolean();
            return true;
        } else if ("slider_vote_count".equals(str)) {
            anonymousClass196.f15073J = jsonParser.getValueAsInt();
            return true;
        } else if ("viewer_vote".equals(str)) {
            anonymousClass196.f15071H = (float) jsonParser.getValueAsDouble();
            return true;
        } else if ("slider_vote_average".equals(str)) {
            anonymousClass196.f15072I = (float) jsonParser.getValueAsDouble();
            return true;
        } else {
            String str2 = null;
            if ("background_color".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass196.f15065B = str2;
                return true;
            } else if ("emoji".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass196.f15067D = str2;
                return true;
            } else if ("slider_id".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass196.f15068E = str2;
                return true;
            } else if ("question".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass196.f15069F = str2;
                return true;
            } else if (!"text_color".equals(str)) {
                return false;
            } else {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass196.f15070G = str2;
                return true;
            }
        }
    }

    /* renamed from: C */
    public static void m9644C(JsonGenerator jsonGenerator, AnonymousClass196 anonymousClass196, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        jsonGenerator.writeBooleanField("viewer_can_vote", anonymousClass196.f15066C);
        jsonGenerator.writeNumberField("slider_vote_count", anonymousClass196.f15073J);
        jsonGenerator.writeNumberField("viewer_vote", anonymousClass196.f15071H);
        jsonGenerator.writeNumberField("slider_vote_average", anonymousClass196.f15072I);
        if (anonymousClass196.f15065B != null) {
            jsonGenerator.writeStringField("background_color", anonymousClass196.f15065B);
        }
        if (anonymousClass196.f15067D != null) {
            jsonGenerator.writeStringField("emoji", anonymousClass196.f15067D);
        }
        if (anonymousClass196.f15068E != null) {
            jsonGenerator.writeStringField("slider_id", anonymousClass196.f15068E);
        }
        if (anonymousClass196.f15069F != null) {
            jsonGenerator.writeStringField("question", anonymousClass196.f15069F);
        }
        if (anonymousClass196.f15070G != null) {
            jsonGenerator.writeStringField("text_color", anonymousClass196.f15070G);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass196 parseFromJson(JsonParser jsonParser) {
        AnonymousClass196 anonymousClass196 = new AnonymousClass196();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass195.m9643B(anonymousClass196, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass196;
    }
}
