package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5hS */
public final class AnonymousClass5hS {
    /* renamed from: B */
    public static boolean m28283B(AnonymousClass5hR anonymousClass5hR, String str, JsonParser jsonParser) {
        if ("do_base_hashes_match".equals(str)) {
            anonymousClass5hR.f68230C = jsonParser.getValueAsBoolean();
            return true;
        }
        String str2 = null;
        if ("server_contact_hashes".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass6D5 parseFromJson = AnonymousClass5hL.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            anonymousClass5hR.f68231D = arrayList;
            return true;
        } else if ("session_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass5hR.f68232E = str2;
            return true;
        } else if (!"setting".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass5hR, str, jsonParser);
        } else {
            anonymousClass5hR.f68229B = AnonymousClass5hP.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass5hR parseFromJson(JsonParser jsonParser) {
        AnonymousClass5hR anonymousClass5hR = new AnonymousClass5hR();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5hS.m28283B(anonymousClass5hR, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5hR;
    }
}
