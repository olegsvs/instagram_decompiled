package com.fasterxml.jackson.core.io;

public final class NumberInput {
    public static final String MAX_LONG_STR = "9223372036854775807";
    public static final String MIN_LONG_STR_NO_SIGN = "-9223372036854775808".substring(1);

    public static boolean inLongRange(String str, boolean z) {
        String str2 = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str2.length();
        int length2 = str.length();
        boolean z2 = true;
        if (length2 >= length) {
            if (length2 > length) {
                return false;
            }
            int i = 0;
            while (i < length) {
                length2 = str.charAt(i) - str2.charAt(i);
                if (length2 == 0) {
                    i++;
                } else if (length2 >= 0) {
                    z2 = false;
                }
            }
        }
        return z2;
    }

    public static boolean inLongRange(char[] cArr, int i, int i2, boolean z) {
        String str = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str.length();
        boolean z2 = true;
        if (i2 >= length) {
            if (i2 > length) {
                return false;
            }
            int i3 = 0;
            while (i3 < length) {
                int charAt = cArr[i + i3] - str.charAt(i3);
                if (charAt == 0) {
                    i3++;
                } else if (charAt >= 0) {
                    z2 = false;
                }
            }
        }
        return z2;
    }

    public static double parseAsDouble(java.lang.String r1, double r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        if (r1 != 0) goto L_0x0003;
    L_0x0002:
        return r2;
    L_0x0003:
        r1 = r1.trim();
        r0 = r1.length();
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0002;
    L_0x000e:
        r0 = parseDouble(r1);	 Catch:{ NumberFormatException -> 0x0013 }
        return r0;	 Catch:{ NumberFormatException -> 0x0013 }
    L_0x0013:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(java.lang.String, double):double");
    }

    public static int parseAsInt(java.lang.String r5, int r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        if (r5 != 0) goto L_0x0003;
    L_0x0002:
        return r6;
    L_0x0003:
        r5 = r5.trim();
        r4 = r5.length();
        if (r4 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0002;
    L_0x000e:
        r3 = 0;
        r2 = 1;
        if (r4 <= 0) goto L_0x0028;
    L_0x0012:
        r1 = r5.charAt(r3);
        r0 = 43;
        if (r1 != r0) goto L_0x0023;
    L_0x001a:
        r5 = r5.substring(r2);
        r4 = r5.length();
        goto L_0x0028;
    L_0x0023:
        r0 = 45;
        if (r1 != r0) goto L_0x0028;
    L_0x0027:
        r3 = 1;
    L_0x0028:
        if (r3 >= r4) goto L_0x0041;
    L_0x002a:
        r1 = r5.charAt(r3);
        r0 = 57;
        if (r1 > r0) goto L_0x003a;
    L_0x0032:
        r0 = 48;
        if (r1 >= r0) goto L_0x0037;
    L_0x0036:
        goto L_0x003a;
    L_0x0037:
        r3 = r3 + 1;
        goto L_0x0028;
    L_0x003a:
        r0 = parseDouble(r5);	 Catch:{ NumberFormatException -> 0x0040 }
        r0 = (int) r0;	 Catch:{ NumberFormatException -> 0x0040 }
        return r0;	 Catch:{ NumberFormatException -> 0x0040 }
    L_0x0040:
        return r6;
    L_0x0041:
        r0 = java.lang.Integer.parseInt(r5);	 Catch:{ NumberFormatException -> 0x0046 }
        return r0;	 Catch:{ NumberFormatException -> 0x0046 }
    L_0x0046:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberInput.parseAsInt(java.lang.String, int):int");
    }

    public static long parseAsLong(java.lang.String r5, long r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        if (r5 != 0) goto L_0x0003;
    L_0x0002:
        return r6;
    L_0x0003:
        r5 = r5.trim();
        r4 = r5.length();
        if (r4 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0002;
    L_0x000e:
        r3 = 0;
        r2 = 1;
        if (r4 <= 0) goto L_0x0028;
    L_0x0012:
        r1 = r5.charAt(r3);
        r0 = 43;
        if (r1 != r0) goto L_0x0023;
    L_0x001a:
        r5 = r5.substring(r2);
        r4 = r5.length();
        goto L_0x0028;
    L_0x0023:
        r0 = 45;
        if (r1 != r0) goto L_0x0028;
    L_0x0027:
        r3 = 1;
    L_0x0028:
        if (r3 >= r4) goto L_0x0041;
    L_0x002a:
        r1 = r5.charAt(r3);
        r0 = 57;
        if (r1 > r0) goto L_0x003a;
    L_0x0032:
        r0 = 48;
        if (r1 >= r0) goto L_0x0037;
    L_0x0036:
        goto L_0x003a;
    L_0x0037:
        r3 = r3 + 1;
        goto L_0x0028;
    L_0x003a:
        r2 = parseDouble(r5);	 Catch:{ NumberFormatException -> 0x0040 }
        r0 = (long) r2;	 Catch:{ NumberFormatException -> 0x0040 }
        return r0;	 Catch:{ NumberFormatException -> 0x0040 }
    L_0x0040:
        return r6;
    L_0x0041:
        r0 = java.lang.Long.parseLong(r5);	 Catch:{ NumberFormatException -> 0x0046 }
        return r0;	 Catch:{ NumberFormatException -> 0x0046 }
    L_0x0046:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberInput.parseAsLong(java.lang.String, long):long");
    }

    public static double parseDouble(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    public static int parseInt(String str) {
        int i = 0;
        int charAt = str.charAt(0);
        int length = str.length();
        int i2 = 1;
        if (charAt == 45) {
            i = 1;
        }
        int i3;
        char charAt2;
        if (i == 0) {
            if (length > 9) {
            }
            if (charAt <= 57) {
                if (charAt < 48) {
                    charAt -= 48;
                    if (i2 < length) {
                        i3 = i2 + 1;
                        charAt2 = str.charAt(i2);
                        if (charAt2 <= '9') {
                            if (charAt2 < '0') {
                                charAt = (charAt * 10) + (charAt2 - 48);
                                if (i3 < length) {
                                    i2 = i3 + 1;
                                    charAt2 = str.charAt(i3);
                                    if (charAt2 <= '9') {
                                        if (charAt2 < '0') {
                                            charAt = (charAt * 10) + (charAt2 - 48);
                                            if (i2 < length) {
                                                while (true) {
                                                    i3 = i2 + 1;
                                                    charAt2 = str.charAt(i2);
                                                    if (charAt2 <= '9') {
                                                        if (charAt2 < '0') {
                                                            break;
                                                        }
                                                        charAt = (charAt * 10) + (charAt2 - 48);
                                                        if (i3 >= length) {
                                                            break;
                                                        }
                                                        i2 = i3;
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i != 0) {
                        charAt = -charAt;
                    }
                    return charAt;
                }
            }
        } else if (length != 1) {
            if (length <= 10) {
                charAt = str.charAt(1);
                i2 = 2;
                if (charAt <= 57) {
                    if (charAt < 48) {
                        charAt -= 48;
                        if (i2 < length) {
                            i3 = i2 + 1;
                            charAt2 = str.charAt(i2);
                            if (charAt2 <= '9') {
                                if (charAt2 < '0') {
                                    charAt = (charAt * 10) + (charAt2 - 48);
                                    if (i3 < length) {
                                        i2 = i3 + 1;
                                        charAt2 = str.charAt(i3);
                                        if (charAt2 <= '9') {
                                            if (charAt2 < '0') {
                                                charAt = (charAt * 10) + (charAt2 - 48);
                                                if (i2 < length) {
                                                    while (true) {
                                                        i3 = i2 + 1;
                                                        charAt2 = str.charAt(i2);
                                                        if (charAt2 <= '9') {
                                                            break;
                                                        } else if (charAt2 < '0') {
                                                            break;
                                                        } else {
                                                            charAt = (charAt * 10) + (charAt2 - 48);
                                                            if (i3 >= length) {
                                                                break;
                                                            }
                                                            i2 = i3;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (i != 0) {
                            charAt = -charAt;
                        }
                        return charAt;
                    }
                }
            }
        }
        return Integer.parseInt(str);
    }

    public static int parseInt(char[] cArr, int i, int i2) {
        int i3 = cArr[i] - 48;
        i2 += i;
        int i4 = i + 1;
        if (i4 >= i2) {
            return i3;
        }
        i3 = (i3 * 10) + (cArr[i4] - 48);
        i4++;
        if (i4 >= i2) {
            return i3;
        }
        i3 = (i3 * 10) + (cArr[i4] - 48);
        i4++;
        if (i4 >= i2) {
            return i3;
        }
        i3 = (i3 * 10) + (cArr[i4] - 48);
        i4++;
        if (i4 >= i2) {
            return i3;
        }
        i3 = (i3 * 10) + (cArr[i4] - 48);
        i4++;
        if (i4 >= i2) {
            return i3;
        }
        i3 = (i3 * 10) + (cArr[i4] - 48);
        i4++;
        if (i4 >= i2) {
            return i3;
        }
        i3 = (i3 * 10) + (cArr[i4] - 48);
        i4++;
        if (i4 >= i2) {
            return i3;
        }
        i3 = (i3 * 10) + (cArr[i4] - 48);
        int i5 = i4 + 1;
        return i5 < i2 ? (i3 * 10) + (cArr[i5] - 48) : i3;
    }

    public static long parseLong(String str) {
        if (str.length() <= 9) {
            return (long) parseInt(str);
        }
        return Long.parseLong(str);
    }

    public static long parseLong(char[] cArr, int i, int i2) {
        i2 -= 9;
        return (((long) parseInt(cArr, i, i2)) * 1000000000) + ((long) parseInt(cArr, i + i2, 9));
    }
}
