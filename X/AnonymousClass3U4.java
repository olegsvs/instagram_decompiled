package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3U4 */
public final class AnonymousClass3U4 {
    /* renamed from: B */
    public static boolean m19723B(AnonymousClass3U3 anonymousClass3U3, String str, JsonParser jsonParser) {
        if (!DialogModule.KEY_ITEMS.equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3U3, str, jsonParser);
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass0P7 B = AnonymousClass0P7.B(jsonParser, true);
                if (B != null) {
                    list.add(B);
                }
            }
        }
        anonymousClass3U3.f41573B = list;
        return true;
    }

    public static AnonymousClass3U3 parseFromJson(JsonParser jsonParser) {
        AnonymousClass3U3 anonymousClass3U3 = new AnonymousClass3U3();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3U4.m19723B(anonymousClass3U3, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3U3;
    }
}
