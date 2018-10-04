package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2bP */
public final class AnonymousClass2bP {
    /* renamed from: B */
    public static boolean m16412B(AnonymousClass2Fd anonymousClass2Fd, String str, JsonParser jsonParser) {
        if ("drawable_id".equals(str)) {
            anonymousClass2Fd.f28078D = jsonParser.getValueAsInt();
            return true;
        } else if ("center_x".equals(str)) {
            anonymousClass2Fd.f28076B = (float) jsonParser.getValueAsDouble();
            return true;
        } else if ("center_y".equals(str)) {
            anonymousClass2Fd.f28077C = (float) jsonParser.getValueAsDouble();
            return true;
        } else if ("width".equals(str)) {
            anonymousClass2Fd.f28086L = (float) jsonParser.getValueAsDouble();
            return true;
        } else if ("height".equals(str)) {
            anonymousClass2Fd.f28079E = (float) jsonParser.getValueAsDouble();
            return true;
        } else if ("normalized_center_x".equals(str)) {
            anonymousClass2Fd.f28080F = (float) jsonParser.getValueAsDouble();
            return true;
        } else if ("normalized_center_y".equals(str)) {
            anonymousClass2Fd.f28081G = (float) jsonParser.getValueAsDouble();
            return true;
        } else if ("normalized_width".equals(str)) {
            anonymousClass2Fd.f28083I = (float) jsonParser.getValueAsDouble();
            return true;
        } else if ("normalized_height".equals(str)) {
            anonymousClass2Fd.f28082H = (float) jsonParser.getValueAsDouble();
            return true;
        } else if ("video_position".equals(str)) {
            anonymousClass2Fd.f28085K = jsonParser.getValueAsInt();
            return true;
        } else if (!"rotation".equals(str)) {
            return false;
        } else {
            anonymousClass2Fd.f28084J = (float) jsonParser.getValueAsDouble();
            return true;
        }
    }

    public static AnonymousClass2Fd parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Fd anonymousClass2Fd = new AnonymousClass2Fd();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2bP.m16412B(anonymousClass2Fd, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Fd;
    }
}
