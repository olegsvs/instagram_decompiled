package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse;
import com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse.JobStatus;

/* renamed from: X.1QB */
public final class AnonymousClass1QB {
    /* renamed from: B */
    public static boolean m11329B(DataDownloadStatusCheckResponse dataDownloadStatusCheckResponse, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("message_header".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            dataDownloadStatusCheckResponse.f43021D = str2;
            return true;
        } else if ("message_body".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            dataDownloadStatusCheckResponse.f43020C = str2;
            return true;
        } else if ("email_hint".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            dataDownloadStatusCheckResponse.f43019B = str2;
            return true;
        } else if (!"content_status".equals(str)) {
            return AnonymousClass0Pv.m3947B(dataDownloadStatusCheckResponse, str, jsonParser);
        } else {
            dataDownloadStatusCheckResponse.f43022E = JobStatus.B(jsonParser.getValueAsString());
            return true;
        }
    }

    public static DataDownloadStatusCheckResponse parseFromJson(JsonParser jsonParser) {
        DataDownloadStatusCheckResponse dataDownloadStatusCheckResponse = new DataDownloadStatusCheckResponse();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1QB.m11329B(dataDownloadStatusCheckResponse, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return dataDownloadStatusCheckResponse;
    }
}
