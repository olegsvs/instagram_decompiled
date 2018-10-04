package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Um */
public final class AnonymousClass1Um {
    /* renamed from: B */
    public static boolean m11611B(AnonymousClass3mV anonymousClass3mV, String str, JsonParser jsonParser) {
        if (!DialogModule.KEY_ITEMS.equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass3mV, str, jsonParser);
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass0mW parseFromJson = AnonymousClass18i.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass3mV.f44336B = list;
        return true;
    }

    public static AnonymousClass3mV parseFromJson(JsonParser jsonParser) {
        AnonymousClass3mV anonymousClass3mV = new AnonymousClass3mV();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Um.m11611B(anonymousClass3mV, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3mV;
    }
}
