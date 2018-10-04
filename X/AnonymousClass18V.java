package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.18V */
public final class AnonymousClass18V {
    /* renamed from: B */
    public static boolean m9614B(AnonymousClass0WR anonymousClass0WR, String str, JsonParser jsonParser) {
        if ("version".equals(str)) {
            anonymousClass0WR.f5983K = jsonParser.getValueAsInt();
            return true;
        } else if ("seq_id".equals(str)) {
            anonymousClass0WR.f5978F = jsonParser.getValueAsLong();
            return true;
        } else if ("snapshot_at_ms".equals(str)) {
            anonymousClass0WR.f5982J = jsonParser.getValueAsLong();
            return true;
        } else if ("pending_request_count".equals(str)) {
            anonymousClass0WR.f5981I = jsonParser.getValueAsInt();
            return true;
        } else if ("most_recent_inviter".equals(str)) {
            anonymousClass0WR.f5980H = AnonymousClass1FN.parseFromJson(jsonParser);
            return true;
        } else {
            List list = null;
            if ("inbox_oldest_cursor".equals(str)) {
                String text;
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    text = jsonParser.getText();
                }
                anonymousClass0WR.f5976D = text;
                return true;
            } else if ("inbox_has_older".equals(str)) {
                anonymousClass0WR.f5979G = jsonParser.getValueAsBoolean();
                return true;
            } else if ("experiment_parameter_values".equals(str)) {
                if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    list = new ArrayList();
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        AnonymousClass18U parseFromJson = AnonymousClass4gX.parseFromJson(jsonParser);
                        if (parseFromJson != null) {
                            list.add(parseFromJson);
                        }
                    }
                }
                anonymousClass0WR.f5974B = list;
                return true;
            } else if ("inbox_prev_key".equals(str)) {
                anonymousClass0WR.f5977E = AnonymousClass1Ea.parseFromJson(jsonParser);
                return true;
            } else if (!"inbox_next_key".equals(str)) {
                return false;
            } else {
                anonymousClass0WR.f5975C = AnonymousClass1Ea.parseFromJson(jsonParser);
                return true;
            }
        }
    }

    /* renamed from: C */
    public static String m9615C(AnonymousClass0WR anonymousClass0WR) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        createGenerator.writeStartObject();
        createGenerator.writeNumberField("version", anonymousClass0WR.f5983K);
        createGenerator.writeNumberField("seq_id", anonymousClass0WR.f5978F);
        createGenerator.writeNumberField("snapshot_at_ms", anonymousClass0WR.f5982J);
        createGenerator.writeNumberField("pending_request_count", anonymousClass0WR.f5981I);
        if (anonymousClass0WR.f5980H != null) {
            createGenerator.writeFieldName("most_recent_inviter");
            AnonymousClass1FN.m10350C(createGenerator, anonymousClass0WR.f5980H, true);
        }
        if (anonymousClass0WR.f5976D != null) {
            createGenerator.writeStringField("inbox_oldest_cursor", anonymousClass0WR.f5976D);
        }
        createGenerator.writeBooleanField("inbox_has_older", anonymousClass0WR.f5979G);
        if (anonymousClass0WR.f5974B != null) {
            createGenerator.writeFieldName("experiment_parameter_values");
            createGenerator.writeStartArray();
            for (AnonymousClass18U anonymousClass18U : anonymousClass0WR.f5974B) {
                if (anonymousClass18U != null) {
                    createGenerator.writeStartObject();
                    if (anonymousClass18U.f14984C != null) {
                        createGenerator.writeStringField("universe", anonymousClass18U.f14984C);
                    }
                    if (anonymousClass18U.f14983B != null) {
                        createGenerator.writeStringField("name", anonymousClass18U.f14983B);
                    }
                    if (anonymousClass18U.f14985D != null) {
                        createGenerator.writeStringField("value", anonymousClass18U.f14985D);
                    }
                    createGenerator.writeEndObject();
                }
            }
            createGenerator.writeEndArray();
        }
        if (anonymousClass0WR.f5977E != null) {
            createGenerator.writeFieldName("inbox_prev_key");
            AnonymousClass1Ea.m10212C(createGenerator, anonymousClass0WR.f5977E, true);
        }
        if (anonymousClass0WR.f5975C != null) {
            createGenerator.writeFieldName("inbox_next_key");
            AnonymousClass1Ea.m10212C(createGenerator, anonymousClass0WR.f5975C, true);
        }
        createGenerator.writeEndObject();
        createGenerator.close();
        return stringWriter.toString();
    }

    public static AnonymousClass0WR parseFromJson(JsonParser jsonParser) {
        AnonymousClass0WR anonymousClass0WR = new AnonymousClass0WR();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass18V.m9614B(anonymousClass0WR, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0WR;
    }

    public static AnonymousClass0WR parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass18V.parseFromJson(createParser);
    }
}
