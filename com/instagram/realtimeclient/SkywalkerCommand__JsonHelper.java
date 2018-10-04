package com.instagram.realtimeclient;

import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public final class SkywalkerCommand__JsonHelper {
    public static SkywalkerCommand parseFromJson(JsonParser jsonParser) {
        SkywalkerCommand skywalkerCommand = new SkywalkerCommand();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            processSingleField(skywalkerCommand, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return skywalkerCommand;
    }

    public static SkywalkerCommand parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return parseFromJson(createParser);
    }

    public static boolean processSingleField(SkywalkerCommand skywalkerCommand, String str, JsonParser jsonParser) {
        List arrayList;
        Object text;
        if ("sub".equals(str)) {
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
            skywalkerCommand.mSubscribeTopics = arrayList;
            return true;
        } else if ("unsub".equals(str)) {
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
            skywalkerCommand.mUnsubscribeTopics = arrayList;
            return true;
        } else if (!"pub".equals(str)) {
            return false;
        } else {
            HashMap hashMap;
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                hashMap = new HashMap();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    String text2 = jsonParser.getText();
                    jsonParser.nextToken();
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    JsonToken jsonToken = JsonToken.VALUE_NULL;
                    if (currentToken == jsonToken) {
                        hashMap.put(text2, null);
                    } else {
                        text = jsonParser.getCurrentToken() == jsonToken ? null : jsonParser.getText();
                        if (text != null) {
                            hashMap.put(text2, text);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            skywalkerCommand.mPublishTopicToPayload = hashMap;
            return true;
        }
    }

    public static String serializeToJson(SkywalkerCommand skywalkerCommand) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        serializeToJson(createGenerator, skywalkerCommand, true);
        createGenerator.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(JsonGenerator jsonGenerator, SkywalkerCommand skywalkerCommand, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (skywalkerCommand.mSubscribeTopics != null) {
            jsonGenerator.writeFieldName("sub");
            jsonGenerator.writeStartArray();
            for (String str : skywalkerCommand.mSubscribeTopics) {
                if (str != null) {
                    jsonGenerator.writeString(str);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (skywalkerCommand.mUnsubscribeTopics != null) {
            jsonGenerator.writeFieldName("unsub");
            jsonGenerator.writeStartArray();
            for (String str2 : skywalkerCommand.mUnsubscribeTopics) {
                if (str2 != null) {
                    jsonGenerator.writeString(str2);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (skywalkerCommand.mPublishTopicToPayload != null) {
            jsonGenerator.writeFieldName("pub");
            jsonGenerator.writeStartObject();
            for (Entry entry : skywalkerCommand.mPublishTopicToPayload.entrySet()) {
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
