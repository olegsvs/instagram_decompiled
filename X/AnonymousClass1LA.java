package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1LA */
public final class AnonymousClass1LA {
    /* renamed from: B */
    public static boolean m10810B(AnonymousClass1LB anonymousClass1LB, String str, JsonParser jsonParser) {
        if ("vote".equals(str)) {
            anonymousClass1LB.f17293B = (float) jsonParser.getValueAsDouble();
            return true;
        } else if (!"user".equals(str)) {
            return false;
        } else {
            anonymousClass1LB.f17294C = AnonymousClass0Ci.m980B(jsonParser);
            return true;
        }
    }

    /* renamed from: C */
    public static void m10811C(JsonGenerator jsonGenerator, AnonymousClass1LB anonymousClass1LB, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        jsonGenerator.writeNumberField("vote", anonymousClass1LB.f17293B);
        if (anonymousClass1LB.f17294C != null) {
            jsonGenerator.writeFieldName("user");
            AnonymousClass11v.m8835C(jsonGenerator, anonymousClass1LB.f17294C, true);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass1LB parseFromJson(JsonParser jsonParser) {
        AnonymousClass1LB anonymousClass1LB = new AnonymousClass1LB();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1LA.m10810B(anonymousClass1LB, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1LB;
    }
}
