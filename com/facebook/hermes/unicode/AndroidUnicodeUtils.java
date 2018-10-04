package com.facebook.hermes.unicode;

import java.text.Collator;
import java.text.DateFormat;

public class AndroidUnicodeUtils {
    public static String dateFormat(double d, boolean z, boolean z2) {
        DateFormat dateTimeInstance;
        if (z && z2) {
            dateTimeInstance = DateFormat.getDateTimeInstance(2, 2);
        } else if (z) {
            dateTimeInstance = DateFormat.getDateInstance(2);
        } else if (z2) {
            dateTimeInstance = DateFormat.getTimeInstance(2);
        } else {
            throw new RuntimeException("Bad dateFormat configuration");
        }
        return dateTimeInstance.format(Long.valueOf((long) d)).toString();
    }

    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }
}
