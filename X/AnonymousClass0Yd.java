package X;

import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Yd */
public final class AnonymousClass0Yd {
    /* renamed from: B */
    public static boolean m5305B(AnonymousClass0UF anonymousClass0UF, String str, JsonParser jsonParser) {
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
            anonymousClass0UF.f5405D = arrayList;
            return true;
        } else if (TraceFieldType.BroadcastId.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0UF.f5403B = str2;
            return true;
        } else if (!"live_viewer_invite".equals(str)) {
            return AnonymousClass0XV.m5237B(anonymousClass0UF, str, jsonParser);
        } else {
            anonymousClass0UF.f5404C = AnonymousClass0Yc.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass0UF parseFromJson(JsonParser jsonParser) {
        AnonymousClass0UF anonymousClass0UF = new AnonymousClass0UF();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0Yd.m5305B(anonymousClass0UF, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0UF;
    }
}
