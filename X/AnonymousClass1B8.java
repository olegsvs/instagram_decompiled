package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.model.people.PeopleTag.UserInfo;

/* renamed from: X.1B8 */
public final class AnonymousClass1B8 {
    /* renamed from: B */
    public static boolean m9785B(UserInfo userInfo, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("username".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            userInfo.f15367E = str2;
            return true;
        }
        if (!(MemoryDumpUploadJob.EXTRA_USER_ID.equals(str) || "pk".equals(str))) {
            if (!"id".equals(str)) {
                if ("full_name".equals(str)) {
                    if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                        str2 = jsonParser.getText();
                    }
                    userInfo.f15364B = str2;
                    return true;
                } else if (!"profile_pic_url".equals(str)) {
                    return false;
                } else {
                    if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                        str2 = jsonParser.getText();
                    }
                    userInfo.f15365C = str2;
                    return true;
                }
            }
        }
        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
            str2 = jsonParser.getText();
        }
        userInfo.f15366D = str2;
        return true;
    }

    public static UserInfo parseFromJson(JsonParser jsonParser) {
        UserInfo userInfo = new UserInfo();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1B8.m9785B(userInfo, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return userInfo;
    }
}
