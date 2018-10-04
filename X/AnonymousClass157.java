package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.157 */
public final class AnonymousClass157 {
    /* renamed from: B */
    public static boolean m9290B(AnonymousClass0n8 anonymousClass0n8, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0n8.f10006B = str2;
            return true;
        } else if ("type".equals(str)) {
            anonymousClass0n8.f10014J = AnonymousClass13f.m9115B(jsonParser.getValueAsString());
            return true;
        } else if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0n8.f10013I = str2;
            return true;
        } else if (DialogModule.KEY_ITEMS.equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0P7 B = AnonymousClass0P7.m3742B(jsonParser, true);
                    if (B != null) {
                        arrayList.add(B);
                    }
                }
            }
            anonymousClass0n8.f10007C = arrayList;
            return true;
        } else if ("max_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0n8.f10008D = str2;
            return true;
        } else if ("user_dict".equals(str)) {
            anonymousClass0n8.f10015K = AnonymousClass0Ci.m980B(jsonParser);
            return true;
        } else if (!"seen_state".equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass0n8, str, jsonParser);
        } else {
            HashMap hashMap;
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                hashMap = new HashMap();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    String text = jsonParser.getText();
                    jsonParser.nextToken();
                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                        hashMap.put(text, null);
                    } else {
                        AnonymousClass15B parseFromJson = AnonymousClass15A.parseFromJson(jsonParser);
                        if (parseFromJson != null) {
                            hashMap.put(text, parseFromJson);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            anonymousClass0n8.f10012H = hashMap;
            return true;
        }
    }

    public static AnonymousClass0n8 parseFromJson(JsonParser jsonParser) {
        AnonymousClass0n8 anonymousClass0n8 = new AnonymousClass0n8();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass157.m9290B(anonymousClass0n8, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        Iterator it = anonymousClass0n8.f10007C.iterator();
        while (it.hasNext()) {
            AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) it.next();
            if (AnonymousClass0n8.m7602B(anonymousClass0P7)) {
                anonymousClass0n8.f10009E.put(anonymousClass0P7.getId(), anonymousClass0P7);
                AnonymousClass15B anonymousClass15B = (AnonymousClass15B) anonymousClass0n8.f10012H.get(anonymousClass0P7.EA());
                if (anonymousClass15B != null) {
                    AnonymousClass15C.f14219B.put(anonymousClass0P7.EA(), Integer.valueOf(anonymousClass15B.f14218B));
                }
            } else {
                it.remove();
            }
        }
        return anonymousClass0n8;
    }
}
