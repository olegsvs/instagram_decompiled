package com.fasterxml.jackson.databind;

public class PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy extends PropertyNamingStrategy$PropertyNamingStrategyBase {
    public String translate(String str) {
        if (str == null) {
            return str;
        }
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length * 2);
        int i = 0;
        Object obj = null;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (i2 > 0 || charAt != '_') {
                if (Character.isUpperCase(charAt)) {
                    if (obj == null && i > 0 && stringBuilder.charAt(i - 1) != '_') {
                        stringBuilder.append('_');
                        i++;
                    }
                    charAt = Character.toLowerCase(charAt);
                    obj = 1;
                } else {
                    obj = null;
                }
                stringBuilder.append(charAt);
                i++;
            }
        }
        if (i > 0) {
            return stringBuilder.toString();
        }
        return str;
    }
}
