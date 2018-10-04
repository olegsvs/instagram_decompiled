package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3dY */
public final class AnonymousClass3dY {
    /* renamed from: B */
    public static boolean m20257B(SavedCollection savedCollection, String str, JsonParser jsonParser) {
        List list = null;
        String text;
        if ("collection_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            savedCollection.f12480B = text;
            return true;
        } else if ("collection_name".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            savedCollection.f12481C = text;
            return true;
        } else if ("cover_media".equals(str)) {
            savedCollection.f12482D = AnonymousClass0P7.B(jsonParser, true);
            return true;
        } else if ("collection_type".equals(str)) {
            savedCollection.f12485G = AnonymousClass3dX.m20254B(jsonParser.getValueAsString());
            return true;
        } else if ("cover_media_list".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0P7 B = AnonymousClass0P7.B(jsonParser, true);
                    if (B != null) {
                        list.add(B);
                    }
                }
            }
            savedCollection.f12483E = list;
            return true;
        } else if (!"product_cover_image_list".equals(str)) {
            return AnonymousClass0Pv.B(savedCollection, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass2EX parseFromJson = AnonymousClass2ar.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            savedCollection.f12484F = list;
            return true;
        }
    }

    public static SavedCollection parseFromJson(JsonParser jsonParser) {
        SavedCollection savedCollection = new SavedCollection();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3dY.m20257B(savedCollection, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return savedCollection;
    }
}
