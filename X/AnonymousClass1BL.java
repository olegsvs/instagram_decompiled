package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1BL */
public final class AnonymousClass1BL {
    /* renamed from: B */
    public static boolean m9799B(AnonymousClass1Cu anonymousClass1Cu, String str, JsonParser jsonParser) {
        List list = null;
        String text;
        if ("continuation_token".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass1Cu.f15592G = text;
            return true;
        } else if ("auto_load_more_enabled".equals(str)) {
            anonymousClass1Cu.f15588C = jsonParser.getValueAsBoolean();
            return true;
        } else if ("next_max_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass1Cu.f15603R = text;
            return true;
        } else if ("last_checked".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass1Cu.f15599N = text;
            return true;
        } else if ("counts".equals(str)) {
            anonymousClass1Cu.f15607V = AnonymousClass1On.parseFromJson(jsonParser);
            return true;
        } else if ("megaphone_stories".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    r0 = AnonymousClass1Op.parseFromJson(jsonParser);
                    if (r0 != null) {
                        list.add(r0);
                    }
                }
            }
            anonymousClass1Cu.f15601P = list;
            return true;
        } else if ("copyright_stories".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    r0 = AnonymousClass1Op.parseFromJson(jsonParser);
                    if (r0 != null) {
                        list.add(r0);
                    }
                }
            }
            anonymousClass1Cu.f15593H = list;
            return true;
        } else if ("friend_request_stories".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    r0 = AnonymousClass1Op.parseFromJson(jsonParser);
                    if (r0 != null) {
                        list.add(r0);
                    }
                }
            }
            anonymousClass1Cu.f15597L = list;
            return true;
        } else if ("new_stories".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    r0 = AnonymousClass1Op.parseFromJson(jsonParser);
                    if (r0 != null) {
                        list.add(r0);
                    }
                }
            }
            anonymousClass1Cu.f15602Q = list;
            return true;
        } else if ("old_stories".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    r0 = AnonymousClass1Op.parseFromJson(jsonParser);
                    if (r0 != null) {
                        list.add(r0);
                    }
                }
            }
            anonymousClass1Cu.f15604S = list;
            return true;
        } else if ("aymf".equals(str)) {
            anonymousClass1Cu.f15606U = AnonymousClass1Ds.parseFromJson(jsonParser);
            return true;
        } else if ("inline_su_count".equals(str)) {
            anonymousClass1Cu.f15598M = jsonParser.getValueAsInt();
            return true;
        } else if ("expand_su_on_follow".equals(str)) {
            anonymousClass1Cu.f15596K = jsonParser.getValueAsBoolean();
            return true;
        } else if ("expand_su_on_dismiss".equals(str)) {
            anonymousClass1Cu.f15595J = jsonParser.getValueAsBoolean();
            return true;
        } else if ("expand_su_on_click".equals(str)) {
            anonymousClass1Cu.f15594I = jsonParser.getValueAsBoolean();
            return true;
        } else if ("megaphone".equals(str)) {
            anonymousClass1Cu.f15600O = AnonymousClass11a.parseFromJson(jsonParser);
            return true;
        } else if ("ads_manager".equals(str)) {
            anonymousClass1Cu.f15587B = AnonymousClass1f0.parseFromJson(jsonParser);
            return true;
        } else if ("branded_content".equals(str)) {
            anonymousClass1Cu.f15589D = AnonymousClass3VG.parseFromJson(jsonParser);
            return true;
        } else if ("business_conversion_reminder".equals(str)) {
            anonymousClass1Cu.f15590E = AnonymousClass3VI.parseFromJson(jsonParser);
            return true;
        } else if (!"partition".equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass1Cu, str, jsonParser);
        } else {
            anonymousClass1Cu.f15605T = AnonymousClass3VQ.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass1Cu parseFromJson(JsonParser jsonParser) {
        AnonymousClass1Cu anonymousClass1Cu = new AnonymousClass1Cu();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1BL.m9799B(anonymousClass1Cu, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        AnonymousClass1Cu.m9943B(anonymousClass1Cu.f15601P, "megaphone_stories");
        AnonymousClass1Cu.m9943B(anonymousClass1Cu.f15593H, "copyright_stories");
        AnonymousClass1Cu.m9943B(anonymousClass1Cu.f15597L, "friend_request_stories");
        AnonymousClass1Cu.m9943B(anonymousClass1Cu.f15602Q, "new_stories");
        AnonymousClass1Cu.m9943B(anonymousClass1Cu.f15604S, "old_stories");
        return anonymousClass1Cu;
    }
}
