package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;

/* renamed from: X.2Yo */
public final class AnonymousClass2Yo {
    /* renamed from: B */
    public static boolean m16258B(AnonymousClass2YQ anonymousClass2YQ, String str, JsonParser jsonParser) {
        if ("is_custom_question".equals(str)) {
            anonymousClass2YQ.f31254G = jsonParser.getValueAsBoolean();
            return true;
        } else if ("is_editable".equals(str)) {
            anonymousClass2YQ.f31255H = jsonParser.getValueAsBoolean();
            return true;
        } else if ("is_required".equals(str)) {
            anonymousClass2YQ.f31256I = jsonParser.getValueAsBoolean();
            return true;
        } else {
            String str2 = null;
            if ("field_key".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass2YQ.f31250C = str2;
                return true;
            } else if ("name".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass2YQ.f31257J = str2;
                return true;
            } else if ("place_holder".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass2YQ.f31258K = str2;
                return true;
            } else if ("field_type".equals(str)) {
                anonymousClass2YQ.f31251D = AnonymousClass2Bv.m14629B(jsonParser.getValueAsString());
                return true;
            } else if ("input_domain".equals(str)) {
                anonymousClass2YQ.f31252E = AnonymousClass2Bw.m14630B(jsonParser.getValueAsString());
                return true;
            } else if ("input_type".equals(str)) {
                anonymousClass2YQ.f31253F = AnonymousClass2Bx.m14631B(jsonParser.getValueAsString());
                return true;
            } else if ("validation_spec".equals(str)) {
                AnonymousClass2Yn.parseFromJson(jsonParser);
                return true;
            } else if ("customized_tokens".equals(str)) {
                if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    r2 = new ArrayList();
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        r0 = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
                        if (r0 != null) {
                            r2.add(r0);
                        }
                    }
                } else {
                    r2 = null;
                }
                anonymousClass2YQ.f31249B = r2;
                return true;
            } else if ("values".equals(str)) {
                if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    r2 = new ArrayList();
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        r0 = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
                        if (r0 != null) {
                            r2.add(r0);
                        }
                    }
                } else {
                    r2 = null;
                }
                anonymousClass2YQ.f31259L = r2;
                return true;
            } else {
                if ("dependent_questions_dynamic_info".equals(str)) {
                    if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                        r2 = new ArrayList();
                        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                            AnonymousClass2ek parseFromJson = AnonymousClass2Ye.parseFromJson(jsonParser);
                            if (parseFromJson != null) {
                                r2.add(parseFromJson);
                            }
                        }
                    }
                } else if (!"dependent_questions_static_info".equals(str)) {
                    return false;
                } else {
                    if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                        r2 = new ArrayList();
                        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                            AnonymousClass2YO parseFromJson2 = AnonymousClass2Ym.parseFromJson(jsonParser);
                            if (parseFromJson2 != null) {
                                r2.add(parseFromJson2);
                            }
                        }
                    }
                }
                return true;
            }
        }
    }

    public static AnonymousClass2YQ parseFromJson(JsonParser jsonParser) {
        AnonymousClass2YQ anonymousClass2YQ = new AnonymousClass2YQ();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Yo.m16258B(anonymousClass2YQ, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2YQ;
    }
}
