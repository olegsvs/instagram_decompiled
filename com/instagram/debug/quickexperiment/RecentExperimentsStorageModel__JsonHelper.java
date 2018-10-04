package com.instagram.debug.quickexperiment;

import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class RecentExperimentsStorageModel__JsonHelper {
    public static RecentExperimentsStorageModel parseFromJson(JsonParser jsonParser) {
        RecentExperimentsStorageModel recentExperimentsStorageModel = new RecentExperimentsStorageModel();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            processSingleField(recentExperimentsStorageModel, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return recentExperimentsStorageModel.postprocess();
    }

    public static RecentExperimentsStorageModel parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return parseFromJson(createParser);
    }

    public static boolean processSingleField(RecentExperimentsStorageModel recentExperimentsStorageModel, String str, JsonParser jsonParser) {
        List arrayList;
        Object text;
        if ("parameterNames".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    text = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
                    if (text != null) {
                        arrayList.add(text);
                    }
                }
            } else {
                arrayList = null;
            }
            recentExperimentsStorageModel.recentExperimentParameterNames = arrayList;
            return true;
        } else if (!"universeNames".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    text = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
                    if (text != null) {
                        arrayList.add(text);
                    }
                }
            } else {
                arrayList = null;
            }
            recentExperimentsStorageModel.recentUniverseNames = arrayList;
            return true;
        }
    }

    public static String serializeToJson(RecentExperimentsStorageModel recentExperimentsStorageModel) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        serializeToJson(createGenerator, recentExperimentsStorageModel, true);
        createGenerator.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(JsonGenerator jsonGenerator, RecentExperimentsStorageModel recentExperimentsStorageModel, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (recentExperimentsStorageModel.recentExperimentParameterNames != null) {
            jsonGenerator.writeFieldName("parameterNames");
            jsonGenerator.writeStartArray();
            for (String str : recentExperimentsStorageModel.recentExperimentParameterNames) {
                if (str != null) {
                    jsonGenerator.writeString(str);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (recentExperimentsStorageModel.recentUniverseNames != null) {
            jsonGenerator.writeFieldName("universeNames");
            jsonGenerator.writeStartArray();
            for (String str2 : recentExperimentsStorageModel.recentUniverseNames) {
                if (str2 != null) {
                    jsonGenerator.writeString(str2);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }
}
