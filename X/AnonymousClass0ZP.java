package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.model.direct.DirectVisualMessageTarget;
import com.instagram.pendingmedia.model.PendingRecipient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0ZP */
public final class AnonymousClass0ZP {
    /* renamed from: B */
    public static boolean m5367B(DirectVisualMessageTarget directVisualMessageTarget, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("pending_recipients".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    PendingRecipient parseFromJson = AnonymousClass1FN.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            directVisualMessageTarget.f6337C = arrayList;
            return true;
        } else if ("thread_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            directVisualMessageTarget.f6338D = str2;
            return true;
        } else if ("thread_title".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            directVisualMessageTarget.f6339E = str2;
            return true;
        } else if (!"is_canonical".equals(str)) {
            return false;
        } else {
            directVisualMessageTarget.f6336B = jsonParser.getValueAsBoolean();
            return true;
        }
    }

    /* renamed from: C */
    public static void m5368C(JsonGenerator jsonGenerator, DirectVisualMessageTarget directVisualMessageTarget, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (directVisualMessageTarget.f6337C != null) {
            jsonGenerator.writeFieldName("pending_recipients");
            jsonGenerator.writeStartArray();
            for (PendingRecipient pendingRecipient : directVisualMessageTarget.f6337C) {
                if (pendingRecipient != null) {
                    AnonymousClass1FN.m10350C(jsonGenerator, pendingRecipient, true);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (directVisualMessageTarget.f6338D != null) {
            jsonGenerator.writeStringField("thread_id", directVisualMessageTarget.f6338D);
        }
        if (directVisualMessageTarget.f6339E != null) {
            jsonGenerator.writeStringField("thread_title", directVisualMessageTarget.f6339E);
        }
        jsonGenerator.writeBooleanField("is_canonical", directVisualMessageTarget.f6336B);
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static DirectVisualMessageTarget parseFromJson(JsonParser jsonParser) {
        DirectVisualMessageTarget directVisualMessageTarget = new DirectVisualMessageTarget();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0ZP.m5367B(directVisualMessageTarget, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        List list = directVisualMessageTarget.f6337C;
        if (list != null) {
            Collections.sort(list, DirectVisualMessageTarget.f6335F);
        }
        return directVisualMessageTarget;
    }
}
