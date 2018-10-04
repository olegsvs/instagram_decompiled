package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2VU */
public final class AnonymousClass2VU {
    /* renamed from: B */
    public static boolean m16138B(AnonymousClass28J anonymousClass28J, String str, JsonParser jsonParser) {
        List list = null;
        if ("audio_src".equals(str)) {
            String text;
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass28J.f26493C = text;
            return true;
        } else if ("audio_duration_ms".equals(str)) {
            anonymousClass28J.f26492B = jsonParser.getValueAsLong();
            return true;
        } else if ("waveform_sampling_frequency_hz".equals(str)) {
            anonymousClass28J.f26495E = jsonParser.getValueAsInt();
            return true;
        } else if (!"waveform_data".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    list.add(new Float(jsonParser.getValueAsDouble()));
                }
            }
            anonymousClass28J.f26494D = list;
            return true;
        }
    }

    public static AnonymousClass28J parseFromJson(JsonParser jsonParser) {
        AnonymousClass28J anonymousClass28J = new AnonymousClass28J();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2VU.m16138B(anonymousClass28J, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass28J;
    }
}
