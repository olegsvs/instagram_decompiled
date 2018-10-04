package com.google.android.exoplayer.text.subrip;

import X.AnonymousClass2sx;
import java.util.regex.Pattern;

public final class SubripParser implements AnonymousClass2sx {
    /* renamed from: C */
    private static final Pattern f46600C = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+),(\\d+)");
    /* renamed from: D */
    public static final Pattern f46601D = Pattern.compile("(\\S*)\\s*-->\\s*(\\S*)");
    /* renamed from: B */
    public final StringBuilder f46602B = new StringBuilder();

    /* renamed from: B */
    public static long m21414B(String str) {
        str = f46600C.matcher(str);
        if (str.matches()) {
            return ((((((Long.parseLong(str.group(1)) * 60) * 60) * 1000) + ((Long.parseLong(str.group(2)) * 60) * 1000)) + (Long.parseLong(str.group(3)) * 1000)) + Long.parseLong(str.group(4))) * 1000;
        }
        throw new NumberFormatException("has invalid format");
    }

    public final boolean pD(String str) {
        return "application/x-subrip".equals(str);
    }

    public final /* bridge */ /* synthetic */ X.AnonymousClass2sw zGA(byte[] r9, int r10, int r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r3 = new X.2ti;
        r3.<init>();
        r5 = new X.2tw;
        r11 = r11 + r10;
        r5.<init>(r9, r11);
        r5.m17638O(r10);
    L_0x0013:
        r6 = r5.m17628E();
        if (r6 == 0) goto L_0x00ca;
    L_0x0019:
        r0 = r6.length();
        if (r0 != 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0013;
    L_0x0020:
        java.lang.Integer.parseInt(r6);	 Catch:{ NumberFormatException -> 0x00b2 }
        r6 = r5.m17628E();
        r0 = f46601D;
        r7 = r0.matcher(r6);
        r0 = r7.find();
        if (r0 == 0) goto L_0x009a;
    L_0x0033:
        r2 = 1;
        r0 = r7.group(r2);
        r0 = m21414B(r0);
        r3.m17607A(r0);
        r1 = 2;
        r0 = r7.group(r1);
        r0 = android.text.TextUtils.isEmpty(r0);
        r6 = 0;
        if (r0 != 0) goto L_0x0057;
    L_0x004b:
        r0 = r7.group(r1);
        r0 = m21414B(r0);
        r3.m17607A(r0);
        goto L_0x0058;
    L_0x0057:
        r2 = 0;
    L_0x0058:
        r0 = r8.f46602B;
        r0.setLength(r6);
    L_0x005d:
        r6 = r5.m17628E();
        r0 = android.text.TextUtils.isEmpty(r6);
        if (r0 != 0) goto L_0x0080;
    L_0x0067:
        r0 = r8.f46602B;
        r0 = r0.length();
        if (r0 <= 0) goto L_0x0076;
    L_0x006f:
        r1 = r8.f46602B;
        r0 = "<br>";
        r1.append(r0);
    L_0x0076:
        r1 = r8.f46602B;
        r0 = r6.trim();
        r1.append(r0);
        goto L_0x005d;
    L_0x0080:
        r0 = r8.f46602B;
        r0 = r0.toString();
        r1 = android.text.Html.fromHtml(r0);
        r0 = new X.2sv;
        r0.<init>(r1);
        r4.add(r0);
        if (r2 == 0) goto L_0x0013;
    L_0x0094:
        r0 = 0;
        r4.add(r0);
        goto L_0x0013;
    L_0x009a:
        r2 = "SubripParser";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Skipping invalid timing: ";
        r1.append(r0);
        r1.append(r6);
        r0 = r1.toString();
        android.util.Log.w(r2, r0);
        goto L_0x0013;
    L_0x00b2:
        r2 = "SubripParser";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Skipping invalid index: ";
        r1.append(r0);
        r1.append(r6);
        r0 = r1.toString();
        android.util.Log.w(r2, r0);
        goto L_0x0013;
    L_0x00ca:
        r0 = r4.size();
        r2 = new X.AnonymousClass2sv[r0];
        r4.toArray(r2);
        r1 = r3.f35479C;
        r0 = r3.f35478B;
        r1 = java.util.Arrays.copyOf(r1, r0);
        r0 = new X.3ud;
        r0.<init>(r2, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.text.subrip.SubripParser.zGA(byte[], int, int):X.2sw");
    }
}
