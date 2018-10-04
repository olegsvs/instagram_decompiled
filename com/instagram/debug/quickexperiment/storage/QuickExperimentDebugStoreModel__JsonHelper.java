package com.instagram.debug.quickexperiment.storage;

import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreModel.QuickExperimentOverrideModel;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreModel.TrackedQuickExperimentStoreModel;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map.Entry;

public final class QuickExperimentDebugStoreModel__JsonHelper {
    public static QuickExperimentDebugStoreModel parseFromJson(JsonParser jsonParser) {
        QuickExperimentDebugStoreModel quickExperimentDebugStoreModel = new QuickExperimentDebugStoreModel();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            processSingleField(quickExperimentDebugStoreModel, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return quickExperimentDebugStoreModel;
    }

    public static QuickExperimentDebugStoreModel parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return parseFromJson(createParser);
    }

    public static boolean processSingleField(QuickExperimentDebugStoreModel quickExperimentDebugStoreModel, String str, JsonParser jsonParser) {
        HashMap hashMap;
        String text;
        if ("overridden_experiments".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                hashMap = new HashMap();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    text = jsonParser.getText();
                    jsonParser.nextToken();
                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                        hashMap.put(text, null);
                    } else {
                        QuickExperimentOverrideModel parseFromJson = C0033xfbae7577.parseFromJson(jsonParser);
                        if (parseFromJson != null) {
                            hashMap.put(text, parseFromJson);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            quickExperimentDebugStoreModel.mOverriddenExperiments = hashMap;
            return true;
        } else if (!"tracked_experiments".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                hashMap = new HashMap();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    text = jsonParser.getText();
                    jsonParser.nextToken();
                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                        hashMap.put(text, null);
                    } else {
                        TrackedQuickExperimentStoreModel parseFromJson2 = C0034x743abe0c.parseFromJson(jsonParser);
                        if (parseFromJson2 != null) {
                            hashMap.put(text, parseFromJson2);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            quickExperimentDebugStoreModel.mTrackedExperiments = hashMap;
            return true;
        }
    }

    public static String serializeToJson(QuickExperimentDebugStoreModel quickExperimentDebugStoreModel) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        serializeToJson(createGenerator, quickExperimentDebugStoreModel, true);
        createGenerator.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(JsonGenerator jsonGenerator, QuickExperimentDebugStoreModel quickExperimentDebugStoreModel, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (quickExperimentDebugStoreModel.mOverriddenExperiments != null) {
            jsonGenerator.writeFieldName("overridden_experiments");
            jsonGenerator.writeStartObject();
            for (Entry entry : quickExperimentDebugStoreModel.mOverriddenExperiments.entrySet()) {
                jsonGenerator.writeFieldName(((String) entry.getKey()).toString());
                if (entry.getValue() == null) {
                    jsonGenerator.writeNull();
                } else {
                    C0033xfbae7577.serializeToJson(jsonGenerator, (QuickExperimentOverrideModel) entry.getValue(), true);
                }
            }
            jsonGenerator.writeEndObject();
        }
        if (quickExperimentDebugStoreModel.mTrackedExperiments != null) {
            jsonGenerator.writeFieldName("tracked_experiments");
            jsonGenerator.writeStartObject();
            for (Entry entry2 : quickExperimentDebugStoreModel.mTrackedExperiments.entrySet()) {
                jsonGenerator.writeFieldName(((String) entry2.getKey()).toString());
                if (entry2.getValue() == null) {
                    jsonGenerator.writeNull();
                } else {
                    C0034x743abe0c.serializeToJson(jsonGenerator, (TrackedQuickExperimentStoreModel) entry2.getValue(), true);
                }
            }
            jsonGenerator.writeEndObject();
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }
}
