package X;

import android.graphics.PointF;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.model.fbfriend.FbFriend;
import com.instagram.model.fbfriend.FbFriendTag;
import com.instagram.tagging.model.Tag;

/* renamed from: X.2Eq */
public final class AnonymousClass2Eq {
    /* renamed from: B */
    public static FbFriendTag m14798B(JsonParser jsonParser) {
        String str = null;
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        Tag fbFriendTag = new FbFriendTag();
        String str2 = null;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if ("full_name".equals(currentName)) {
                str = jsonParser.getText();
            } else if ("fb_id".equals(currentName)) {
                str2 = jsonParser.getText();
            } else if ("position".equals(currentName)) {
                jsonParser.nextToken();
                float floatValue = jsonParser.getFloatValue();
                jsonParser.nextToken();
                fbFriendTag.f15363B = new PointF(floatValue, jsonParser.getFloatValue());
                jsonParser.nextToken();
            } else if (currentName != null) {
                jsonParser.skipChildren();
            }
        }
        if (!(str == null || str2 == null)) {
            FbFriend fbFriend = fbFriendTag.f27813B;
            if (fbFriend != null) {
                fbFriend.f9869C = str;
            }
            fbFriendTag.C().XOA(str2);
        }
        return fbFriendTag;
    }
}
