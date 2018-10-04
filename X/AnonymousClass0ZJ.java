package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0ZJ */
public final class AnonymousClass0ZJ {
    /* renamed from: B */
    public static boolean m5352B(AnonymousClass0X1 anonymousClass0X1, String str, JsonParser jsonParser) {
        if ("archived_media_timestamp".equals(str)) {
            anonymousClass0X1.f6082B = Long.valueOf(jsonParser.getValueAsLong());
            return true;
        }
        String str2 = null;
        if ("caption_list".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    Object text = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
                    if (text != null) {
                        arrayList.add(text);
                    }
                }
            } else {
                arrayList = null;
            }
            anonymousClass0X1.f6083C = arrayList;
            return true;
        } else if ("expiring_media_action_summary".equals(str)) {
            anonymousClass0X1.f6084D = AnonymousClass1dP.parseFromJson(jsonParser);
            return true;
        } else if ("media".equals(str)) {
            anonymousClass0X1.f6085E = AnonymousClass0P7.m3742B(jsonParser, true);
            return true;
        } else if ("playback_duration_secs".equals(str)) {
            anonymousClass0X1.f6087G = Long.valueOf(jsonParser.getValueAsLong());
            return true;
        } else if ("reply_type".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0X1.f6092L = str2;
            return true;
        } else if ("seen_count".equals(str)) {
            anonymousClass0X1.f6088H = jsonParser.getValueAsInt();
            return true;
        } else if ("tap_models".equals(str)) {
            List arrayList2;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList2 = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0ZF parseFromJson = AnonymousClass18f.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList2.add(parseFromJson);
                    }
                }
            }
            anonymousClass0X1.f6089I = arrayList2;
            return true;
        } else if ("url_expire_at_secs".equals(str)) {
            anonymousClass0X1.f6086F = Long.valueOf(jsonParser.getValueAsLong());
            return true;
        } else if ("view_mode".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0X1.f6090J = str2;
            return true;
        } else if (!"story_app_attribution".equals(str)) {
            return false;
        } else {
            anonymousClass0X1.f6091K = AnonymousClass4gj.parseFromJson(jsonParser);
            return true;
        }
    }

    /* renamed from: C */
    public static void m5353C(JsonGenerator jsonGenerator, AnonymousClass0X1 anonymousClass0X1, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass0X1.f6082B != null) {
            jsonGenerator.writeNumberField("archived_media_timestamp", anonymousClass0X1.f6082B.longValue());
        }
        if (anonymousClass0X1.f6083C != null) {
            jsonGenerator.writeFieldName("caption_list");
            jsonGenerator.writeStartArray();
            for (String str : anonymousClass0X1.f6083C) {
                if (str != null) {
                    jsonGenerator.writeString(str);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (anonymousClass0X1.f6084D != null) {
            jsonGenerator.writeFieldName("expiring_media_action_summary");
            AnonymousClass1dP.m12203C(jsonGenerator, anonymousClass0X1.f6084D, true);
        }
        if (anonymousClass0X1.f6085E != null) {
            jsonGenerator.writeFieldName("media");
            AnonymousClass11o.m8826C(jsonGenerator, anonymousClass0X1.f6085E, true);
        }
        if (anonymousClass0X1.f6087G != null) {
            jsonGenerator.writeNumberField("playback_duration_secs", anonymousClass0X1.f6087G.longValue());
        }
        if (anonymousClass0X1.f6092L != null) {
            jsonGenerator.writeStringField("reply_type", anonymousClass0X1.f6092L);
        }
        jsonGenerator.writeNumberField("seen_count", anonymousClass0X1.f6088H);
        if (anonymousClass0X1.f6089I != null) {
            jsonGenerator.writeFieldName("tap_models");
            jsonGenerator.writeStartArray();
            for (AnonymousClass0ZF anonymousClass0ZF : anonymousClass0X1.f6089I) {
                if (anonymousClass0ZF != null) {
                    AnonymousClass18f.m9634C(jsonGenerator, anonymousClass0ZF, true);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (anonymousClass0X1.f6086F != null) {
            jsonGenerator.writeNumberField("url_expire_at_secs", anonymousClass0X1.f6086F.longValue());
        }
        if (anonymousClass0X1.f6090J != null) {
            jsonGenerator.writeStringField("view_mode", anonymousClass0X1.f6090J);
        }
        if (anonymousClass0X1.f6091K != null) {
            jsonGenerator.writeFieldName("story_app_attribution");
            AnonymousClass4gi anonymousClass4gi = anonymousClass0X1.f6091K;
            jsonGenerator.writeStartObject();
            if (anonymousClass4gi.f56284E != null) {
                jsonGenerator.writeStringField("id", anonymousClass4gi.f56284E);
            }
            if (anonymousClass4gi.f56285F != null) {
                jsonGenerator.writeStringField("name", anonymousClass4gi.f56285F);
            }
            if (anonymousClass4gi.f56286G != null) {
                jsonGenerator.writeStringField("link", anonymousClass4gi.f56286G);
            }
            if (anonymousClass4gi.f56283D != null) {
                jsonGenerator.writeStringField("content_url", anonymousClass4gi.f56283D);
            }
            if (anonymousClass4gi.f56281B != null) {
                jsonGenerator.writeStringField("app_action_text", anonymousClass4gi.f56281B);
            }
            if (anonymousClass4gi.f56282C != null) {
                jsonGenerator.writeStringField("app_icon_url", anonymousClass4gi.f56282C);
            }
            jsonGenerator.writeEndObject();
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass0X1 parseFromJson(JsonParser jsonParser) {
        AnonymousClass0X1 anonymousClass0X1 = new AnonymousClass0X1();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0ZJ.m5352B(anonymousClass0X1, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0X1;
    }
}
