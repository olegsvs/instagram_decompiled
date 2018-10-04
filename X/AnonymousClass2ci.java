package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.2ci */
public final class AnonymousClass2ci {
    /* renamed from: B */
    public static boolean m16551B(AnonymousClass2MQ anonymousClass2MQ, String str, JsonParser jsonParser) {
        if ("native_flow".equals(str)) {
            anonymousClass2MQ.f29548F = jsonParser.getValueAsBoolean();
            return true;
        }
        String str2 = null;
        if (IgReactNavigatorModule.URL.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2MQ.f29549G = str2;
            return true;
        } else if ("lock".equals(str)) {
            anonymousClass2MQ.f29546D = jsonParser.getValueAsBoolean();
            return true;
        } else if ("api_path".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2MQ.f29544B = str2;
            return true;
        } else if ("logout".equals(str)) {
            anonymousClass2MQ.f29547E = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"hide_webview_header".equals(str)) {
            return false;
        } else {
            anonymousClass2MQ.f29545C = jsonParser.getValueAsBoolean();
            return true;
        }
    }

    public static AnonymousClass2MQ parseFromJson(JsonParser jsonParser) {
        AnonymousClass2MQ anonymousClass2MQ = new AnonymousClass2MQ();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2ci.m16551B(anonymousClass2MQ, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2MQ;
    }
}
