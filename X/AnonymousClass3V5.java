package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3V5 */
public final class AnonymousClass3V5 {
    /* renamed from: B */
    public static boolean m19750B(AnonymousClass3V4 anonymousClass3V4, String str, JsonParser jsonParser) {
        if (DialogModule.KEY_ITEMS.equals(str)) {
            List list = null;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0r7 parseFromJson = AnonymousClass14E.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass3V4.f41708B = list;
            return true;
        } else if (!RealtimeProtocol.DIRECT_V2_UNSEEN_COUNT.equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3V4, str, jsonParser);
        } else {
            anonymousClass3V4.f41709C = jsonParser.getValueAsInt();
            return true;
        }
    }

    public static AnonymousClass3V4 parseFromJson(JsonParser jsonParser) {
        AnonymousClass3V4 anonymousClass3V4 = new AnonymousClass3V4();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3V5.m19750B(anonymousClass3V4, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3V4;
    }
}
