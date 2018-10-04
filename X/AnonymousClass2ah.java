package X;

import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2ah */
public final class AnonymousClass2ah {
    /* renamed from: B */
    public static boolean m16359B(AnonymousClass0VH anonymousClass0VH, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("share_targets".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    DirectShareTarget parseFromJson = AnonymousClass0YK.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            anonymousClass0VH.f5682N = arrayList;
            return true;
        } else if (TraceFieldType.ContentType.equals(str)) {
            anonymousClass0VH.f5672D = AnonymousClass0V0.valueOf(jsonParser.getText());
            return true;
        } else if ("content_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0VH.f5671C = str2;
            return true;
        } else if ("client_context".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0VH.f5670B = str2;
            return true;
        } else if ("media_type".equals(str)) {
            anonymousClass0VH.f5677I = AnonymousClass0ON.B(jsonParser.getValueAsInt());
            return true;
        } else if ("text".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0VH.f5683O = str2;
            return true;
        } else if ("entry_point".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0VH.f5673E = str2;
            return true;
        } else if ("video_offset".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0VH.f5684P = str2;
            return true;
        } else if ("is_reaction".equals(str)) {
            anonymousClass0VH.f5676H = jsonParser.getValueAsBoolean();
            return true;
        } else if ("reaction_name".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0VH.f5679K = str2;
            return true;
        } else if ("reel_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0VH.f5680L = str2;
            return true;
        } else if (!"post_share_source".equals(str)) {
            return false;
        } else {
            anonymousClass0VH.f5681M = AnonymousClass0Yg.B(jsonParser.getText());
            return true;
        }
    }

    public static AnonymousClass0VH parseFromJson(JsonParser jsonParser) {
        AnonymousClass0VH anonymousClass0VH = new AnonymousClass0VH();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2ah.m16359B(anonymousClass0VH, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0VH;
    }
}
