package com.instagram.realtimeclient;

import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.StringWriter;
import java.io.Writer;

public final class RealtimeUnsubscribeCommand__JsonHelper {
    public static RealtimeUnsubscribeCommand parseFromJson(JsonParser jsonParser) {
        RealtimeUnsubscribeCommand realtimeUnsubscribeCommand = new RealtimeUnsubscribeCommand();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            processSingleField(realtimeUnsubscribeCommand, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return realtimeUnsubscribeCommand;
    }

    public static RealtimeUnsubscribeCommand parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return parseFromJson(createParser);
    }

    public static boolean processSingleField(RealtimeUnsubscribeCommand realtimeUnsubscribeCommand, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("command".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            realtimeUnsubscribeCommand.command = str2;
            return true;
        } else if (!"topic".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            realtimeUnsubscribeCommand.topic = str2;
            return true;
        }
    }

    public static String serializeToJson(RealtimeUnsubscribeCommand realtimeUnsubscribeCommand) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        serializeToJson(createGenerator, realtimeUnsubscribeCommand, true);
        createGenerator.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(JsonGenerator jsonGenerator, RealtimeUnsubscribeCommand realtimeUnsubscribeCommand, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (realtimeUnsubscribeCommand.command != null) {
            jsonGenerator.writeStringField("command", realtimeUnsubscribeCommand.command);
        }
        if (realtimeUnsubscribeCommand.topic != null) {
            jsonGenerator.writeStringField("topic", realtimeUnsubscribeCommand.topic);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }
}
