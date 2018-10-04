package com.instagram.debug.memorydump;

import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.realtimeclient.RealtimeConstants;

public final class MemoryDumpUploadResponse__JsonHelper {
    public static MemoryDumpUploadResponse parseFromJson(JsonParser jsonParser) {
        MemoryDumpUploadResponse memoryDumpUploadResponse = new MemoryDumpUploadResponse();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            processSingleField(memoryDumpUploadResponse, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return memoryDumpUploadResponse;
    }

    public static MemoryDumpUploadResponse parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return parseFromJson(createParser);
    }

    public static boolean processSingleField(MemoryDumpUploadResponse memoryDumpUploadResponse, String str, JsonParser jsonParser) {
        if (!RealtimeConstants.SEND_SUCCESS.equals(str)) {
            return false;
        }
        memoryDumpUploadResponse.success = jsonParser.getValueAsBoolean();
        return true;
    }
}
