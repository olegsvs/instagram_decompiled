package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Os */
public final class AnonymousClass1Os {
    /* renamed from: B */
    public static boolean m11226B(AnonymousClass1Ot anonymousClass1Ot, String str, JsonParser jsonParser) {
        List list = null;
        if ("payload".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
            return true;
        } else if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18074h = r2;
            return true;
        } else if ("text".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18071e = r2;
            return true;
        } else if ("rich_text".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18067a = r2;
            return true;
        } else if ("sub_text".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18070d = r2;
            return true;
        } else if ("action_url".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18042B = r2;
            return true;
        } else if ("icon_url".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18055O = r2;
            return true;
        } else if ("profile_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18064X = r2;
            return true;
        } else if ("profile_image".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18065Y = r2;
            return true;
        } else if ("profile_name".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18066Z = r2;
            return true;
        } else if ("second_profile_image".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18068b = r2;
            return true;
        } else if ("profile_context".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18069c = r2;
            return true;
        } else if ("media".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass1P0 parseFromJson = AnonymousClass1Oz.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass1Ot.f18059S = list;
            return true;
        } else if ("timestamp".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18073g = r2;
            return true;
        } else if ("latest_reel_media".equals(str)) {
            anonymousClass1Ot.f18057Q = Long.valueOf(jsonParser.getValueAsLong());
            return true;
        } else if ("inline_follow".equals(str)) {
            anonymousClass1Ot.f18051K = AnonymousClass1Ox.parseFromJson(jsonParser);
            return true;
        } else if ("hashtag_follow".equals(str)) {
            anonymousClass1Ot.f18052L = AnonymousClass19n.parseFromJson(jsonParser);
            return true;
        } else if ("request_count".equals(str)) {
            anonymousClass1Ot.f18053M = jsonParser.getValueAsInt();
            return true;
        } else if ("links".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass1Ov parseFromJson2 = AnonymousClass1Ou.parseFromJson(jsonParser);
                    if (parseFromJson2 != null) {
                        list.add(parseFromJson2);
                    }
                }
            }
            anonymousClass1Ot.f18058R = list;
            return true;
        } else if ("thread_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18072f = r2;
            return true;
        } else if ("destination".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18047G = r2;
            return true;
        } else if ("media_destination".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18060T = r2;
            return true;
        } else if ("comment_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18046F = r2;
            return true;
        } else if ("comment_notif_type".equals(str)) {
            AnonymousClass1bo.m12008B(jsonParser.getValueAsString());
            return true;
        } else if ("clicked".equals(str)) {
            anonymousClass1Ot.f18045E = Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        } else if ("actions".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass1d6 parseFromJson3 = AnonymousClass1d6.parseFromJson(jsonParser);
                    if (parseFromJson3 != null) {
                        list.add(parseFromJson3);
                    }
                }
            }
            anonymousClass1Ot.f18043C = list;
            return true;
        } else if ("tuuid".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18075i = r2;
            return true;
        } else if ("canvas_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                r2 = jsonParser.getText();
            }
            anonymousClass1Ot.f18044D = r2;
            return true;
        } else if ("is_story".equals(str)) {
            anonymousClass1Ot.f18056P = jsonParser.getValueAsBoolean();
            return true;
        } else if ("poll_options".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass3VN parseFromJson4 = AnonymousClass3VO.parseFromJson(jsonParser);
                    if (parseFromJson4 != null) {
                        list.add(parseFromJson4);
                    }
                }
            }
            anonymousClass1Ot.f18063W = list;
            return true;
        } else if ("display_ufi".equals(str)) {
            anonymousClass1Ot.f18050J = Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        } else if (!"has_liked_comment".equals(str)) {
            return false;
        } else {
            anonymousClass1Ot.f18054N = Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        }
    }

    public static AnonymousClass1Ot parseFromJson(JsonParser jsonParser) {
        AnonymousClass1Ot anonymousClass1Ot = new AnonymousClass1Ot();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Os.m11226B(anonymousClass1Ot, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1Ot;
    }
}
