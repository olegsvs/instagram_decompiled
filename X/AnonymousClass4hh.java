package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.4hh */
public final class AnonymousClass4hh {
    /* renamed from: B */
    public static boolean m24815B(AnonymousClass4hg anonymousClass4hg, String str, JsonParser jsonParser) {
        if (!"thread".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass4hg, str, jsonParser);
        }
        anonymousClass4hg.f56366B = AnonymousClass1HB.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass4hg parseFromJson(JsonParser jsonParser) {
        AnonymousClass4hg anonymousClass4hg = new AnonymousClass4hg();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4hh.m24815B(anonymousClass4hg, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass4hg;
    }
}
