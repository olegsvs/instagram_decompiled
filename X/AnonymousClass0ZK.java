package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0ZK */
public final class AnonymousClass0ZK {
    /* renamed from: B */
    public static boolean m5354B(AnonymousClass0UV anonymousClass0UV, String str, JsonParser jsonParser) {
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
            anonymousClass0UV.f5459C = arrayList;
            return true;
        } else if ("direct_visual_media".equals(str)) {
            anonymousClass0UV.f5458B = AnonymousClass0ZJ.parseFromJson(jsonParser);
            return true;
        } else if ("visual_message_thread_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0UV.f5461E = str2;
            return true;
        } else if (!"visual_message_item_id".equals(str)) {
            return AnonymousClass0XV.m5237B(anonymousClass0UV, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0UV.f5460D = str2;
            return true;
        }
    }

    public static AnonymousClass0UV parseFromJson(JsonParser jsonParser) {
        AnonymousClass0UV anonymousClass0UV = new AnonymousClass0UV();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0ZK.m5354B(anonymousClass0UV, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0UV;
    }
}
