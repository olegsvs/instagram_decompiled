package com.facebook.react.util;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Pattern;

public final class JSStackTrace {
    private static final Pattern mJsModuleIdPattern = Pattern.compile("(?:^|[/\\\\])(\\d+\\.js)$");

    public static String format(String str, ReadableArray readableArray) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append(", stack:\n");
        for (int i = 0; i < readableArray.size(); i++) {
            str = readableArray.getMap(i);
            stringBuilder.append(str.getString("methodName"));
            stringBuilder.append("@");
            stringBuilder.append(stackFrameToModuleId(str));
            stringBuilder.append(str.getInt("lineNumber"));
            if (str.hasKey("column") && !str.isNull("column") && str.getType("column") == ReadableType.Number) {
                stringBuilder.append(":");
                stringBuilder.append(str.getInt("column"));
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    private static String stackFrameToModuleId(ReadableMap readableMap) {
        if (readableMap.hasKey("file") && !readableMap.isNull("file") && readableMap.getType("file") == ReadableType.String) {
            readableMap = mJsModuleIdPattern.matcher(readableMap.getString("file"));
            if (readableMap.find()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(readableMap.group(1));
                stringBuilder.append(":");
                return stringBuilder.toString();
            }
        }
        return JsonProperty.USE_DEFAULT_NAME;
    }
}
