package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.pendingmedia.model.VideoUploadUrl;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.util.Date;

/* renamed from: X.2bH */
public final class AnonymousClass2bH {
    /* renamed from: B */
    public static boolean m16399B(VideoUploadUrl videoUploadUrl, String str, JsonParser jsonParser) {
        String str2 = null;
        if (IgReactNavigatorModule.URL.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            videoUploadUrl.f27963D = str2;
            return true;
        } else if ("job".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            videoUploadUrl.f27962C = str2;
            return true;
        } else if (!"expires".equals(str)) {
            return false;
        } else {
            videoUploadUrl.f27961B = new Date(jsonParser.getLongValue() * 1000);
            return true;
        }
    }

    public static VideoUploadUrl parseFromJson(JsonParser jsonParser) {
        VideoUploadUrl videoUploadUrl = new VideoUploadUrl();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2bH.m16399B(videoUploadUrl, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return videoUploadUrl;
    }
}
