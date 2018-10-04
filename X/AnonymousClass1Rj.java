package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Rj */
public final class AnonymousClass1Rj {
    /* renamed from: B */
    public static boolean m11442B(AnonymousClass0qp anonymousClass0qp, String str, JsonParser jsonParser) {
        List list = null;
        String text;
        if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass0qp.f11018C = text;
            return true;
        } else if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass0qp.f11024I = text;
            return true;
        } else if ("subtitle".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass0qp.f11021F = text;
            return true;
        } else if (TraceFieldType.ContentType.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass0qp.f11017B = text;
            return true;
        } else if ("style".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass0qp.f11020E = text;
            return true;
        } else if (DialogModule.KEY_ITEMS.equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0fH B = AnonymousClass0fH.m6520B(jsonParser);
                    if (B != null) {
                        list.add(B);
                    }
                }
            }
            anonymousClass0qp.f11019D = list;
            return true;
        } else if (!"button".equals(str)) {
            return false;
        } else {
            anonymousClass0qp.f11023H = AnonymousClass3MO.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass0qp parseFromJson(JsonParser jsonParser) {
        AnonymousClass0qp anonymousClass0qp = new AnonymousClass0qp();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Rj.m11442B(anonymousClass0qp, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        List<AnonymousClass0fH> list = anonymousClass0qp.f11019D;
        if (list != null) {
            for (AnonymousClass0fH anonymousClass0fH : list) {
                if (!(anonymousClass0fH.m6524C() == null || anonymousClass0fH.m6524C().eY())) {
                    anonymousClass0qp.f11022G.add(anonymousClass0fH);
                }
            }
        }
        return anonymousClass0qp;
    }
}
