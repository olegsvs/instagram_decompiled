package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1MB */
public final class AnonymousClass1MB {
    /* renamed from: B */
    public static boolean m10943B(AnonymousClass0oj anonymousClass0oj, String str, JsonParser jsonParser) {
        List list = null;
        String text;
        if ("userId".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass0oj.f10335I = text;
            return true;
        } else if ("promotionId".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass0oj.f10332F = text;
            return true;
        } else if ("primaryActionTimes".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    r0 = Long.valueOf(jsonParser.getValueAsLong());
                    if (r0 != null) {
                        list.add(r0);
                    }
                }
            }
            anonymousClass0oj.f10331E = list;
            return true;
        } else if ("secondaryActionTimes".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    r0 = Long.valueOf(jsonParser.getValueAsLong());
                    if (r0 != null) {
                        list.add(r0);
                    }
                }
            }
            anonymousClass0oj.f10333G = list;
            return true;
        } else if ("dismissActionTimes".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    r0 = Long.valueOf(jsonParser.getValueAsLong());
                    if (r0 != null) {
                        list.add(r0);
                    }
                }
            }
            anonymousClass0oj.f10329C = list;
            return true;
        } else if ("impressionTimes".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    r0 = Long.valueOf(jsonParser.getValueAsLong());
                    if (r0 != null) {
                        list.add(r0);
                    }
                }
            }
            anonymousClass0oj.f10328B = list;
            return true;
        } else if ("totalDismissTimes".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    r0 = Long.valueOf(jsonParser.getValueAsLong());
                    if (r0 != null) {
                        list.add(r0);
                    }
                }
            }
            anonymousClass0oj.f10334H = list;
            return true;
        } else if (!"endTime".equals(str)) {
            return false;
        } else {
            anonymousClass0oj.f10330D = Long.valueOf(jsonParser.getValueAsLong());
            return true;
        }
    }

    public static AnonymousClass0oj parseFromJson(JsonParser jsonParser) {
        AnonymousClass0oj anonymousClass0oj = new AnonymousClass0oj();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1MB.m10943B(anonymousClass0oj, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        AnonymousClass0LH.m2927E(anonymousClass0oj.f10335I);
        AnonymousClass0LH.m2927E(anonymousClass0oj.f10332F);
        AnonymousClass0LH.m2927E(anonymousClass0oj.f10330D);
        return anonymousClass0oj;
    }
}
