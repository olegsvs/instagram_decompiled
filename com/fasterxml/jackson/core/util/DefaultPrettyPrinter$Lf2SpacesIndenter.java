package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;

public final class DefaultPrettyPrinter$Lf2SpacesIndenter extends DefaultPrettyPrinter$NopIndenter {
    public static final char[] SPACES;
    private static final String SYS_LF;
    public static final DefaultPrettyPrinter$Lf2SpacesIndenter instance = new DefaultPrettyPrinter$Lf2SpacesIndenter();

    public final boolean isInline() {
        return false;
    }

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Lf2SpacesIndenter;
        r0.<init>();
        instance = r0;
        r0 = "line.separator";	 Catch:{ Throwable -> 0x000e }
        r0 = java.lang.System.getProperty(r0);	 Catch:{ Throwable -> 0x000e }
        goto L_0x000f;	 Catch:{ Throwable -> 0x000e }
    L_0x000e:
        r0 = 0;
    L_0x000f:
        if (r0 != 0) goto L_0x0013;
    L_0x0011:
        r0 = "\n";
    L_0x0013:
        SYS_LF = r0;
        r0 = 64;
        r1 = new char[r0];
        SPACES = r1;
        r0 = 32;
        java.util.Arrays.fill(r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Lf2SpacesIndenter.<clinit>():void");
    }

    public final void writeIndentation(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.writeRaw(SYS_LF);
        if (i > 0) {
            i += i;
            while (i > 64) {
                char[] cArr = SPACES;
                jsonGenerator.writeRaw(cArr, 0, 64);
                i -= cArr.length;
            }
            jsonGenerator.writeRaw(SPACES, 0, i);
        }
    }
}
