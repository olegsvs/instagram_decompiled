package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.64C */
public final class AnonymousClass64C {
    /* renamed from: B */
    public static boolean m28858B(AnonymousClass64B anonymousClass64B, String str, JsonParser jsonParser) {
        if ("more_available".equals(str)) {
            Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        } else if ("auto_load_more_enabled".equals(str)) {
            anonymousClass64B.f71417B = jsonParser.getValueAsBoolean();
            return true;
        } else {
            List list = null;
            if ("next_max_id".equals(str)) {
                String text;
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    text = jsonParser.getText();
                }
                anonymousClass64B.f71420E = text;
                return true;
            } else if ("broadcasts".equals(str)) {
                if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    list = new ArrayList();
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        AnonymousClass0Pm parseFromJson = AnonymousClass19k.parseFromJson(jsonParser);
                        if (parseFromJson != null) {
                            list.add(parseFromJson);
                        }
                    }
                }
                anonymousClass64B.f71418C = list;
                return true;
            } else if ("post_live_broadcasts".equals(str)) {
                if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    list = new ArrayList();
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        AnonymousClass19j parseFromJson2 = AnonymousClass0QA.parseFromJson(jsonParser);
                        if (parseFromJson2 != null) {
                            list.add(parseFromJson2);
                        }
                    }
                }
                anonymousClass64B.f71419D = list;
                return true;
            } else if (!"score_map".equals(str)) {
                return AnonymousClass0Pv.B(anonymousClass64B, str, jsonParser);
            } else {
                HashMap hashMap;
                if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                    hashMap = new HashMap();
                    while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                        String text2 = jsonParser.getText();
                        jsonParser.nextToken();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            hashMap.put(text2, null);
                        } else {
                            Double valueOf = Double.valueOf(jsonParser.getValueAsDouble());
                            if (valueOf != null) {
                                hashMap.put(text2, valueOf);
                            }
                        }
                    }
                } else {
                    hashMap = null;
                }
                anonymousClass64B.f71421F = hashMap;
                return true;
            }
        }
    }

    public static AnonymousClass64B parseFromJson(JsonParser jsonParser) {
        AnonymousClass64B anonymousClass64B = new AnonymousClass64B();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass64C.m28858B(anonymousClass64B, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass64B;
    }
}
