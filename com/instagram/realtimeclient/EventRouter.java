package com.instagram.realtimeclient;

import java.util.HashMap;
import java.util.Map;

public class EventRouter {
    public static String fill(String str, Map map) {
        str = str.split("/");
        StringBuilder stringBuilder = new StringBuilder();
        for (String str2 : str) {
            if (str2.startsWith(":")) {
                stringBuilder.append((String) map.get(str2.substring(1)));
            } else {
                stringBuilder.append(str2);
            }
            stringBuilder.append("/");
        }
        String str22 = stringBuilder.toString();
        return str22.substring(0, str22.length() - 1);
    }

    public static Map match(String str, String str2) {
        String str3 = "/";
        String[] split = str.split(str3);
        str = str2.split(str3);
        if (split.length <= str.length) {
            if (split.length >= str.length || split[split.length - 1].equals("*")) {
                Map hashMap = new HashMap();
                for (int i = 0; i < split.length; i++) {
                    if (!split[i].equals("*")) {
                        if (split[i].startsWith(":")) {
                            hashMap.put(split[i].substring(1), str[i]);
                        } else if (split[i].equals(str[i])) {
                        }
                    }
                }
                return hashMap;
            }
        }
        return null;
    }
}
