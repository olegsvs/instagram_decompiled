package com.instagram.debug.quickexperiment.storage;

import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.debug.quickexperiment.storage.QuickExperimentBisectStoreModel.ExperimentModel;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public final class QuickExperimentBisectStoreModel__JsonHelper {
    public static QuickExperimentBisectStoreModel parseFromJson(JsonParser jsonParser) {
        QuickExperimentBisectStoreModel quickExperimentBisectStoreModel = new QuickExperimentBisectStoreModel();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            processSingleField(quickExperimentBisectStoreModel, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return quickExperimentBisectStoreModel;
    }

    public static QuickExperimentBisectStoreModel parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return parseFromJson(createParser);
    }

    public static boolean processSingleField(QuickExperimentBisectStoreModel quickExperimentBisectStoreModel, String str, JsonParser jsonParser) {
        List list = null;
        if ("experiment_list".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    ExperimentModel parseFromJson = QuickExperimentBisectStoreModel_ExperimentModel__JsonHelper.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            quickExperimentBisectStoreModel.mBisectExperiments = list;
            return true;
        } else if (!"universe_index_map".equals(str)) {
            return false;
        } else {
            HashMap hashMap;
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                hashMap = new HashMap();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    String text = jsonParser.getText();
                    jsonParser.nextToken();
                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                        hashMap.put(text, null);
                    } else {
                        Integer valueOf = Integer.valueOf(jsonParser.getValueAsInt());
                        if (valueOf != null) {
                            hashMap.put(text, valueOf);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            quickExperimentBisectStoreModel.mUniverseToIndex = hashMap;
            return true;
        }
    }

    public static String serializeToJson(QuickExperimentBisectStoreModel quickExperimentBisectStoreModel) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        serializeToJson(createGenerator, quickExperimentBisectStoreModel, true);
        createGenerator.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(JsonGenerator jsonGenerator, QuickExperimentBisectStoreModel quickExperimentBisectStoreModel, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (quickExperimentBisectStoreModel.mBisectExperiments != null) {
            jsonGenerator.writeFieldName("experiment_list");
            jsonGenerator.writeStartArray();
            for (ExperimentModel experimentModel : quickExperimentBisectStoreModel.mBisectExperiments) {
                if (experimentModel != null) {
                    QuickExperimentBisectStoreModel_ExperimentModel__JsonHelper.serializeToJson(jsonGenerator, experimentModel, true);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (quickExperimentBisectStoreModel.mUniverseToIndex != null) {
            jsonGenerator.writeFieldName("universe_index_map");
            jsonGenerator.writeStartObject();
            for (Entry entry : quickExperimentBisectStoreModel.mUniverseToIndex.entrySet()) {
                jsonGenerator.writeFieldName(((String) entry.getKey()).toString());
                if (entry.getValue() == null) {
                    jsonGenerator.writeNull();
                } else {
                    jsonGenerator.writeNumber(((Integer) entry.getValue()).intValue());
                }
            }
            jsonGenerator.writeEndObject();
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }
}
