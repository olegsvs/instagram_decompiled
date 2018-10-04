package com.fasterxml.jackson.databind;

public class PropertyNamingStrategy$PascalCaseStrategy extends PropertyNamingStrategy$PropertyNamingStrategyBase {
    public String translate(String str) {
        if (str != null) {
            if (str.length() != 0) {
                char charAt = str.charAt(0);
                if (!Character.isUpperCase(charAt)) {
                    StringBuilder stringBuilder = new StringBuilder(str);
                    stringBuilder.setCharAt(0, Character.toUpperCase(charAt));
                    return stringBuilder.toString();
                }
            }
        }
        return str;
    }
}
