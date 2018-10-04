package X;

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.315 */
public final class AnonymousClass315 {
    /* renamed from: B */
    public static boolean m18210B(AnonymousClass1Ph anonymousClass1Ph, String str, JsonParser jsonParser) {
        if ("user".equals(str)) {
            anonymousClass1Ph.f18196E = AnonymousClass0Ci.B(jsonParser);
            return true;
        } else if ("confidence".equals(str)) {
            anonymousClass1Ph.f18193B = (float) jsonParser.getValueAsDouble();
            return true;
        } else if ("failure_code".equals(str)) {
            anonymousClass1Ph.f18194C = jsonParser.getValueAsInt();
            return true;
        } else if (!"username".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass1Ph, str, jsonParser);
        } else {
            anonymousClass1Ph.f18197F = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        }
    }

    public static AnonymousClass1Ph parseFromJson(JsonParser jsonParser) {
        AnonymousClass0Pn anonymousClass1Ph = new AnonymousClass1Ph();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass315.m18210B(anonymousClass1Ph, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (anonymousClass1Ph.f18194C > 0) {
            stringBuilder.append("[");
            stringBuilder.append(anonymousClass1Ph.f18194C);
            stringBuilder.append("]");
        }
        if (!TextUtils.isEmpty(anonymousClass1Ph.f4180F)) {
            stringBuilder.append(" ");
            stringBuilder.append(anonymousClass1Ph.f4180F);
        } else if (!TextUtils.isEmpty(anonymousClass1Ph.f18197F)) {
            stringBuilder.append(" ");
            stringBuilder.append(anonymousClass1Ph.f18197F);
        }
        anonymousClass1Ph.f18195D = stringBuilder.toString();
        return anonymousClass1Ph;
    }
}
