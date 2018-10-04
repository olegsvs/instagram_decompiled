package com.instagram.debug.quickexperiment.storage;

import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.debug.quickexperiment.storage.QuickExperimentBisectStoreModel.ExperimentModel;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map.Entry;

public final class QuickExperimentBisectStoreModel_ExperimentModel__JsonHelper {
    public static ExperimentModel parseFromJson(JsonParser jsonParser) {
        ExperimentModel experimentModel = new ExperimentModel();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            processSingleField(experimentModel, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return experimentModel;
    }

    public static ExperimentModel parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return parseFromJson(createParser);
    }

    public static boolean processSingleField(ExperimentModel experimentModel, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("universe".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            experimentModel.mUniverse = str2;
            return true;
        } else if (!"mapping".equals(str)) {
            return false;
        } else {
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
            experimentModel.mParamValueMap = hashMap;
            return true;
        }
    }

    public static String serializeToJson(ExperimentModel experimentModel) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        serializeToJson(createGenerator, experimentModel, true);
        createGenerator.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(JsonGenerator jsonGenerator, ExperimentModel experimentModel, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (experimentModel.mUniverse != null) {
            jsonGenerator.writeStringField("universe", experimentModel.mUniverse);
        }
        if (experimentModel.mParamValueMap != null) {
            jsonGenerator.writeFieldName("mapping");
            jsonGenerator.writeStartObject();
            for (Entry entry : experimentModel.mParamValueMap.entrySet()) {
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
