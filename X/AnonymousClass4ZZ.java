package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectVisualMessageTarget;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4ZZ */
public final class AnonymousClass4ZZ {
    /* renamed from: B */
    public static boolean m24509B(AnonymousClass0VF anonymousClass0VF, String str, JsonParser jsonParser) {
        Set set = null;
        if ("direct_share_targets".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                set = new HashSet();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    DirectShareTarget parseFromJson = AnonymousClass0YK.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        set.add(parseFromJson);
                    }
                }
            }
            anonymousClass0VF.f5667B = set;
            return true;
        } else if (!"targets".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                set = new HashSet();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    DirectVisualMessageTarget parseFromJson2 = AnonymousClass0ZP.parseFromJson(jsonParser);
                    if (parseFromJson2 != null) {
                        set.add(parseFromJson2);
                    }
                }
            }
            anonymousClass0VF.f5668C = set;
            return true;
        }
    }

    public static AnonymousClass0VF parseFromJson(JsonParser jsonParser) {
        AnonymousClass0VF anonymousClass0VF = new AnonymousClass0VF();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4ZZ.m24509B(anonymousClass0VF, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        if (anonymousClass0VF.f5668C != null) {
            anonymousClass0VF.f5667B = new HashSet();
            for (DirectVisualMessageTarget A : anonymousClass0VF.f5668C) {
                anonymousClass0VF.f5667B.add(A.A());
            }
            anonymousClass0VF.f5668C = null;
        }
        return anonymousClass0VF;
    }

    public static AnonymousClass0VF parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass4ZZ.parseFromJson(createParser);
    }
}
