package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1XF */
public final class AnonymousClass1XF {
    /* renamed from: B */
    public static boolean m11759B(AnonymousClass3QK anonymousClass3QK, String str, JsonParser jsonParser) {
        if ("enable_navigation".equals(str)) {
            anonymousClass3QK.f41114C = jsonParser.getValueAsBoolean();
            return true;
        } else if ("enable_indexing".equals(str)) {
            anonymousClass3QK.f41113B = jsonParser.getValueAsBoolean();
            return true;
        } else if ("has_submit".equals(str)) {
            anonymousClass3QK.f41117F = jsonParser.getValueAsBoolean();
            return true;
        } else if ("vertical_padding".equals(str)) {
            anonymousClass3QK.f41119H = jsonParser.getValueAsInt();
            return true;
        } else if ("extra_question".equals(str)) {
            anonymousClass3QK.f41115D = AnonymousClass3QT.parseFromJson(jsonParser);
            return true;
        } else if ("questions".equals(str)) {
            List list = null;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0mw parseFromJson = AnonymousClass3QT.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass3QK.f41118G = list;
            return true;
        } else if (!"log_on_each_answer".equals(str)) {
            return false;
        } else {
            anonymousClass3QK.f41116E = jsonParser.getValueAsBoolean();
            return true;
        }
    }

    public static AnonymousClass3QK parseFromJson(JsonParser jsonParser) {
        AnonymousClass3QK anonymousClass3QK = new AnonymousClass3QK();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1XF.m11759B(anonymousClass3QK, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        AnonymousClass0mw anonymousClass0mw = anonymousClass3QK.f41115D;
        if (anonymousClass0mw != null) {
            anonymousClass0mw.f9939C = true;
        }
        List list = anonymousClass3QK.f41118G;
        if (list != null) {
            ((AnonymousClass0mw) list.get(list.size() - 1)).f9940D = true;
        }
        return anonymousClass3QK;
    }
}
