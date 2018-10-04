package com.instagram.debug.quickexperiment.storage;

import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreModel.QuickExperimentOverrideModel;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreModel_QuickExperimentOverrideModel__JsonHelper */
public final class C0033xfbae7577 {
    public static QuickExperimentOverrideModel parseFromJson(JsonParser jsonParser) {
        QuickExperimentOverrideModel quickExperimentOverrideModel = new QuickExperimentOverrideModel();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            C0033xfbae7577.processSingleField(quickExperimentOverrideModel, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return quickExperimentOverrideModel;
    }

    public static QuickExperimentOverrideModel parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return C0033xfbae7577.parseFromJson(createParser);
    }

    public static boolean processSingleField(QuickExperimentOverrideModel quickExperimentOverrideModel, String str, JsonParser jsonParser) {
        if (!"parameters".equals(str)) {
            return false;
        }
        HashMap hashMap;
        if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
            hashMap = new HashMap();
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                String text = jsonParser.getText();
                jsonParser.nextToken();
                JsonToken currentToken = jsonParser.getCurrentToken();
                JsonToken jsonToken = JsonToken.VALUE_NULL;
                if (currentToken == jsonToken) {
                    hashMap.put(text, null);
                } else {
                    Object text2 = jsonParser.getCurrentToken() == jsonToken ? null : jsonParser.getText();
                    if (text2 != null) {
                        hashMap.put(text, text2);
                    }
                }
            }
        } else {
            hashMap = null;
        }
        quickExperimentOverrideModel.mParameters = hashMap;
        return true;
    }

    public static String serializeToJson(QuickExperimentOverrideModel quickExperimentOverrideModel) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        C0033xfbae7577.serializeToJson(createGenerator, quickExperimentOverrideModel, true);
        createGenerator.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(JsonGenerator jsonGenerator, QuickExperimentOverrideModel quickExperimentOverrideModel, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (quickExperimentOverrideModel.mParameters != null) {
            jsonGenerator.writeFieldName("parameters");
            jsonGenerator.writeStartObject();
            for (Entry entry : quickExperimentOverrideModel.mParameters.entrySet()) {
                jsonGenerator.writeFieldName(((String) entry.getKey()).toString());
                if (entry.getValue() == null) {
                    jsonGenerator.writeNull();
                } else {
                    jsonGenerator.writeString((String) entry.getValue());
                }
            }
            jsonGenerator.writeEndObject();
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }
}
