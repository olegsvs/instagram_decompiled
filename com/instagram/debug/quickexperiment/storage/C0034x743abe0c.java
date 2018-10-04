package com.instagram.debug.quickexperiment.storage;

import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreModel.TrackedQuickExperimentStoreModel;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreModel_TrackedQuickExperimentStoreModel__JsonHelper */
public final class C0034x743abe0c {
    public static TrackedQuickExperimentStoreModel parseFromJson(JsonParser jsonParser) {
        TrackedQuickExperimentStoreModel trackedQuickExperimentStoreModel = new TrackedQuickExperimentStoreModel();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            C0034x743abe0c.processSingleField(trackedQuickExperimentStoreModel, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return trackedQuickExperimentStoreModel;
    }

    public static TrackedQuickExperimentStoreModel parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return C0034x743abe0c.parseFromJson(createParser);
    }

    public static boolean processSingleField(TrackedQuickExperimentStoreModel trackedQuickExperimentStoreModel, String str, JsonParser jsonParser) {
        if (!"parameters".equals(str)) {
            return false;
        }
        Set hashSet;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            hashSet = new HashSet();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                Object text = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
                if (text != null) {
                    hashSet.add(text);
                }
            }
        } else {
            hashSet = null;
        }
        trackedQuickExperimentStoreModel.mParameters = hashSet;
        return true;
    }

    public static String serializeToJson(TrackedQuickExperimentStoreModel trackedQuickExperimentStoreModel) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        C0034x743abe0c.serializeToJson(createGenerator, trackedQuickExperimentStoreModel, true);
        createGenerator.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(JsonGenerator jsonGenerator, TrackedQuickExperimentStoreModel trackedQuickExperimentStoreModel, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (trackedQuickExperimentStoreModel.mParameters != null) {
            jsonGenerator.writeFieldName("parameters");
            jsonGenerator.writeStartArray();
            for (String str : trackedQuickExperimentStoreModel.mParameters) {
                if (str != null) {
                    jsonGenerator.writeString(str);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }
}
