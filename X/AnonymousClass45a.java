package X;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.45a */
public final class AnonymousClass45a extends AnonymousClass44C {
    /* renamed from: C */
    public static final Pattern f49960C = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
    /* renamed from: B */
    public final StringBuilder f49961B = new StringBuilder();

    public AnonymousClass45a() {
        super("SubripDecoder");
    }

    /* renamed from: D */
    public static long m22933D(Matcher matcher, int i) {
        return ((((((Long.parseLong(matcher.group(i + 1)) * 60) * 60) * 1000) + ((Long.parseLong(matcher.group(i + 2)) * 60) * 1000)) + (Long.parseLong(matcher.group(i + 3)) * 1000)) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ X.AnonymousClass2xP mo5380G(byte[] r9, int r10, boolean r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r3 = new X.2yW;
        r3.<init>();
        r5 = new X.2yc;
        r5.<init>(r9, r10);
    L_0x000f:
        r6 = r5.m18049E();
        if (r6 == 0) goto L_0x00c9;
    L_0x0015:
        r0 = r6.length();
        if (r0 != 0) goto L_0x001c;
    L_0x001b:
        goto L_0x000f;
    L_0x001c:
        java.lang.Integer.parseInt(r6);	 Catch:{ NumberFormatException -> 0x00b1 }
        r6 = r5.m18049E();
        if (r6 != 0) goto L_0x002e;
    L_0x0025:
        r1 = "SubripDecoder";
        r0 = "Unexpected end";
        android.util.Log.w(r1, r0);
        goto L_0x00c9;
    L_0x002e:
        r0 = f49960C;
        r7 = r0.matcher(r6);
        r0 = r7.matches();
        if (r0 == 0) goto L_0x0099;
    L_0x003a:
        r2 = 1;
        r0 = X.AnonymousClass45a.m22933D(r7, r2);
        r3.m18023A(r0);
        r1 = 6;
        r0 = r7.group(r1);
        r0 = android.text.TextUtils.isEmpty(r0);
        r6 = 0;
        if (r0 != 0) goto L_0x0056;
    L_0x004e:
        r0 = X.AnonymousClass45a.m22933D(r7, r1);
        r3.m18023A(r0);
        goto L_0x0057;
    L_0x0056:
        r2 = 0;
    L_0x0057:
        r0 = r8.f49961B;
        r0.setLength(r6);
    L_0x005c:
        r6 = r5.m18049E();
        r0 = android.text.TextUtils.isEmpty(r6);
        if (r0 != 0) goto L_0x007f;
    L_0x0066:
        r0 = r8.f49961B;
        r0 = r0.length();
        if (r0 <= 0) goto L_0x0075;
    L_0x006e:
        r1 = r8.f49961B;
        r0 = "<br>";
        r1.append(r0);
    L_0x0075:
        r1 = r8.f49961B;
        r0 = r6.trim();
        r1.append(r0);
        goto L_0x005c;
    L_0x007f:
        r0 = r8.f49961B;
        r0 = r0.toString();
        r1 = android.text.Html.fromHtml(r0);
        r0 = new X.2xO;
        r0.<init>(r1);
        r4.add(r0);
        if (r2 == 0) goto L_0x000f;
    L_0x0093:
        r0 = 0;
        r4.add(r0);
        goto L_0x000f;
    L_0x0099:
        r2 = "SubripDecoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Skipping invalid timing: ";
        r1.append(r0);
        r1.append(r6);
        r0 = r1.toString();
        android.util.Log.w(r2, r0);
        goto L_0x000f;
    L_0x00b1:
        r2 = "SubripDecoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Skipping invalid index: ";
        r1.append(r0);
        r1.append(r6);
        r0 = r1.toString();
        android.util.Log.w(r2, r0);
        goto L_0x000f;
    L_0x00c9:
        r0 = r4.size();
        r2 = new X.AnonymousClass2xO[r0];
        r4.toArray(r2);
        r1 = r3.f36525C;
        r0 = r3.f36524B;
        r1 = java.util.Arrays.copyOf(r1, r0);
        r0 = new X.3wL;
        r0.<init>(r2, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45a.G(byte[], int, boolean):X.2xP");
    }
}
