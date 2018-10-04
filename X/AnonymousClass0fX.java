package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0fX */
public final class AnonymousClass0fX {
    /* renamed from: B */
    public static boolean m6541B(AnonymousClass0GE anonymousClass0GE, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("operations".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0fa parseFromJson = AnonymousClass0fc.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            anonymousClass0GE.f2325B = arrayList;
            return true;
        } else if (!"view_state_version".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0GE.f2326C = str2;
            return true;
        }
    }

    /* renamed from: C */
    public static String m6542C(AnonymousClass0GE anonymousClass0GE) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        createGenerator.writeStartObject();
        if (anonymousClass0GE.f2325B != null) {
            createGenerator.writeFieldName("operations");
            createGenerator.writeStartArray();
            for (AnonymousClass0fa anonymousClass0fa : anonymousClass0GE.f2325B) {
                if (anonymousClass0fa != null) {
                    createGenerator.writeStartObject();
                    if (anonymousClass0fa.f7956D != null) {
                        createGenerator.writeStringField("media_id", anonymousClass0fa.f7956D);
                    }
                    if (anonymousClass0fa.f7957E != null) {
                        createGenerator.writeStringField("operation_type", anonymousClass0fa.f7957E);
                    }
                    createGenerator.writeNumberField("timestamp_ms", anonymousClass0fa.f7960H);
                    if (anonymousClass0fa.f7955C != null) {
                        createGenerator.writeStringField("item_type", anonymousClass0fa.f7955C);
                    }
                    if (anonymousClass0fa.f7959G != null) {
                        createGenerator.writeFieldName("operation_metadata");
                        AnonymousClass0fd anonymousClass0fd = anonymousClass0fa.f7959G;
                        createGenerator.writeStartObject();
                        if (anonymousClass0fd.f7963B != null) {
                            createGenerator.writeStringField("after_media_id", anonymousClass0fd.f7963B);
                        }
                        createGenerator.writeEndObject();
                    }
                    if (anonymousClass0fa.f7954B != null) {
                        createGenerator.writeFieldName("item_metadata");
                        AnonymousClass0fe anonymousClass0fe = anonymousClass0fa.f7954B;
                        createGenerator.writeStartObject();
                        if (anonymousClass0fe.f7964B != null) {
                            createGenerator.writeStringField("source", anonymousClass0fe.f7964B);
                        }
                        createGenerator.writeEndObject();
                    }
                    if (anonymousClass0fa.f7958F != null) {
                        createGenerator.writeStringField("operation_id", anonymousClass0fa.f7958F);
                    }
                    createGenerator.writeEndObject();
                }
            }
            createGenerator.writeEndArray();
        }
        if (anonymousClass0GE.f2326C != null) {
            createGenerator.writeStringField("view_state_version", anonymousClass0GE.f2326C);
        }
        createGenerator.writeEndObject();
        createGenerator.close();
        return stringWriter.toString();
    }

    public static AnonymousClass0GE parseFromJson(JsonParser jsonParser) {
        AnonymousClass0GE anonymousClass0GE = new AnonymousClass0GE();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0fX.m6541B(anonymousClass0GE, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0GE;
    }

    public static AnonymousClass0GE parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass0fX.parseFromJson(createParser);
    }
}
