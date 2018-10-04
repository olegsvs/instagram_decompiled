package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Version;
import java.util.regex.Pattern;

public final class VersionUtil {
    private static final Pattern VERSION_SEPARATOR = Pattern.compile("[-_./;:]");
    private final Version _version;

    public VersionUtil() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.<init>();
        r0 = r3.getClass();	 Catch:{ Exception -> 0x000c }
        r0 = versionFor(r0);	 Catch:{ Exception -> 0x000c }
        goto L_0x0030;	 Catch:{ Exception -> 0x000c }
    L_0x000c:
        r2 = java.lang.System.err;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "ERROR: Failed to load Version information for bundle (via ";
        r1.append(r0);
        r0 = r3.getClass();
        r0 = r0.getName();
        r1.append(r0);
        r0 = ").";
        r1.append(r0);
        r0 = r1.toString();
        r2.println(r0);
        r0 = 0;
    L_0x0030:
        if (r0 != 0) goto L_0x0036;
    L_0x0032:
        r0 = com.fasterxml.jackson.core.Version.unknownVersion();
    L_0x0036:
        r3._version = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.VersionUtil.<init>():void");
    }

    private static com.fasterxml.jackson.core.Version doReadVersion(java.io.Reader r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = new java.io.BufferedReader;
        r3.<init>(r4);
        r0 = 0;
        r2 = r3.readLine();	 Catch:{ IOException -> 0x0021, all -> 0x001c }
        if (r2 == 0) goto L_0x0017;	 Catch:{ IOException -> 0x0021, all -> 0x001c }
    L_0x000c:
        r1 = r3.readLine();	 Catch:{ IOException -> 0x0017, all -> 0x001c }
        if (r1 == 0) goto L_0x0018;	 Catch:{ IOException -> 0x0017, all -> 0x001c }
    L_0x0012:
        r0 = r3.readLine();	 Catch:{ IOException -> 0x0018, all -> 0x001c }
        goto L_0x0018;	 Catch:{ IOException -> 0x0018, all -> 0x001c }
    L_0x0017:
        r1 = r0;
    L_0x0018:
        r3.close();	 Catch:{ IOException -> 0x0024 }
        goto L_0x0024;	 Catch:{ IOException -> 0x0024 }
    L_0x001c:
        r0 = move-exception;
        r3.close();	 Catch:{ IOException -> 0x0020 }
    L_0x0020:
        throw r0;
    L_0x0021:
        r2 = r0;
        r1 = r0;
        goto L_0x0018;
    L_0x0024:
        if (r1 == 0) goto L_0x002a;
    L_0x0026:
        r1 = r1.trim();
    L_0x002a:
        if (r0 == 0) goto L_0x0030;
    L_0x002c:
        r0 = r0.trim();
    L_0x0030:
        r0 = parseVersion(r2, r1, r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.VersionUtil.doReadVersion(java.io.Reader):com.fasterxml.jackson.core.Version");
    }

    public static com.fasterxml.jackson.core.Version packageVersionFor(java.lang.Class r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = 0;
        r0 = r4.getPackage();	 Catch:{ Exception -> 0x008a }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x008a }
        r0 = r0.getName();	 Catch:{ Exception -> 0x008a }
        r1.<init>(r0);	 Catch:{ Exception -> 0x008a }
        r0 = ".";	 Catch:{ Exception -> 0x008a }
        r1.append(r0);	 Catch:{ Exception -> 0x008a }
        r0 = "PackageVersion";	 Catch:{ Exception -> 0x008a }
        r1.append(r0);	 Catch:{ Exception -> 0x008a }
        r2 = r1.toString();	 Catch:{ Exception -> 0x008a }
        r1 = 1;	 Catch:{ Exception -> 0x008a }
        r0 = r4.getClassLoader();	 Catch:{ Exception -> 0x008a }
        r4 = java.lang.Class.forName(r2, r1, r0);	 Catch:{ Exception -> 0x008a }
        if (r4 != 0) goto L_0x0028;	 Catch:{ Exception -> 0x008a }
    L_0x0027:
        return r3;	 Catch:{ Exception -> 0x008a }
    L_0x0028:
        r1 = r4.newInstance();	 Catch:{ RuntimeException -> 0x0088, Exception -> 0x0060 }
        r0 = r1 instanceof com.fasterxml.jackson.core.Versioned;
        if (r0 == 0) goto L_0x0037;
    L_0x0030:
        r1 = (com.fasterxml.jackson.core.Versioned) r1;
        r0 = r1.version();
        return r0;
    L_0x0037:
        r2 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Bad version class ";
        r1.append(r0);
        r0 = r4.getName();
        r1.append(r0);
        r0 = ": does not implement ";
        r1.append(r0);
        r0 = com.fasterxml.jackson.core.Versioned.class;
        r0 = r0.getName();
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x0060:
        r3 = move-exception;
        r2 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Failed to instantiate ";
        r1.append(r0);
        r0 = r4.getName();
        r1.append(r0);
        r0 = " to find version information, problem: ";
        r1.append(r0);
        r0 = r3.getMessage();
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0, r3);
        throw r2;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.VersionUtil.packageVersionFor(java.lang.Class):com.fasterxml.jackson.core.Version");
    }

    public static Version parseVersion(String str, String str2, String str3) {
        String str4 = null;
        if (str != null) {
            CharSequence trim = str.trim();
            if (trim.length() != 0) {
                String[] split = VERSION_SEPARATOR.split(trim);
                int parseVersionPart = parseVersionPart(split[0]);
                int parseVersionPart2 = split.length > 1 ? parseVersionPart(split[1]) : 0;
                int parseVersionPart3 = split.length > 2 ? parseVersionPart(split[2]) : 0;
                if (split.length > 3) {
                    str4 = split[3];
                }
                return new Version(parseVersionPart, parseVersionPart2, parseVersionPart3, str4, str2, str3);
            }
        }
        return null;
    }

    public static int parseVersionPart(String str) {
        str = str.toString();
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt > '9') {
                break;
            } else if (charAt < '0') {
                break;
            } else {
                i2 = (i2 * 10) + (charAt - 48);
                i++;
            }
        }
        return i2;
    }

    public static final void throwInternal() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public static com.fasterxml.jackson.core.Version versionFor(java.lang.Class r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = packageVersionFor(r2);
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return r0;
    L_0x0007:
        r0 = "VERSION.txt";
        r2 = r2.getResourceAsStream(r0);
        if (r2 != 0) goto L_0x0014;
    L_0x000f:
        r0 = com.fasterxml.jackson.core.Version.unknownVersion();
        return r0;
    L_0x0014:
        r1 = new java.io.InputStreamReader;	 Catch:{ UnsupportedEncodingException -> 0x0034 }
        r0 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x0034 }
        r1.<init>(r2, r0);	 Catch:{ UnsupportedEncodingException -> 0x0034 }
        r0 = doReadVersion(r1);	 Catch:{ all -> 0x002d }
        r1.close();	 Catch:{ IOException -> 0x0022 }
    L_0x0022:
        r2.close();	 Catch:{ IOException -> 0x0026 }
        goto L_0x0006;	 Catch:{ IOException -> 0x0026 }
    L_0x0026:
        r1 = move-exception;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r1);
        throw r0;
    L_0x002d:
        r0 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x0031 }
    L_0x0031:
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0034 }
    L_0x0032:
        r0 = move-exception;
        goto L_0x0043;
    L_0x0034:
        r0 = com.fasterxml.jackson.core.Version.unknownVersion();	 Catch:{ all -> 0x0032 }
        r2.close();	 Catch:{ IOException -> 0x003c }
        goto L_0x0006;	 Catch:{ IOException -> 0x003c }
    L_0x003c:
        r1 = move-exception;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r1);
        throw r0;
    L_0x0043:
        r2.close();	 Catch:{ IOException -> 0x0047 }
        throw r0;
    L_0x0047:
        r1 = move-exception;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.VersionUtil.versionFor(java.lang.Class):com.fasterxml.jackson.core.Version");
    }
}
