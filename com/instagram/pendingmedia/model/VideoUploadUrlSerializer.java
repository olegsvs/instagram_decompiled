package com.instagram.pendingmedia.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.util.Date;

public final class VideoUploadUrlSerializer {
    /* renamed from: B */
    public static VideoUploadUrl m14802B(JsonParser jsonParser) {
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        VideoUploadUrl videoUploadUrl = new VideoUploadUrl();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (IgReactNavigatorModule.URL.equals(currentName)) {
                videoUploadUrl.f27963D = jsonParser.getText();
            } else if ("job".equals(currentName)) {
                videoUploadUrl.f27962C = jsonParser.getText();
            } else if ("expires".equals(currentName)) {
                videoUploadUrl.f27961B = new Date(jsonParser.getLongValue());
            } else {
                jsonParser.skipChildren();
            }
        }
        return videoUploadUrl;
    }
}
