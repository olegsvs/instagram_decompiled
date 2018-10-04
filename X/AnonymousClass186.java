package X;

import android.text.Layout;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Locale;

/* renamed from: X.186 */
public final class AnonymousClass186 {
    /* renamed from: B */
    public static final CharSequence f14880B = "…";

    /* renamed from: B */
    public static CharSequence m9525B(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, AnonymousClass0qJ anonymousClass0qJ, boolean z, boolean z2) {
        int i2 = i;
        if (i >= 1) {
            CharSequence charSequence4 = charSequence;
            StringBuilder stringBuilder = new StringBuilder(charSequence);
            stringBuilder.append(charSequence2);
            AnonymousClass0qJ anonymousClass0qJ2 = anonymousClass0qJ;
            charSequence = anonymousClass0qJ.m7925A(stringBuilder);
            if (charSequence.getLineCount() > i) {
                CharSequence charSequence5 = charSequence3;
                charSequence2 = z2;
                if (z) {
                    return AnonymousClass186.m9526C(charSequence4, charSequence5, i2, anonymousClass0qJ2, stringBuilder, charSequence, charSequence2);
                }
                return AnonymousClass186.m9528E(charSequence4, charSequence5, i2, anonymousClass0qJ2, stringBuilder, charSequence, charSequence2);
            }
        }
        return charSequence2;
    }

    /* renamed from: C */
    public static java.lang.CharSequence m9526C(java.lang.CharSequence r19, java.lang.CharSequence r20, int r21, X.AnonymousClass0qJ r22, java.lang.StringBuilder r23, android.text.Layout r24, boolean r25) {
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
        r0 = r21 + -1;
        r1 = r24;
        r6 = r1.getLineStart(r0);
        r0 = r1.getLineEnd(r0);
        r4 = r23;
        r10 = r4.substring(r6, r0);
        r11 = r20;
        r7 = new java.lang.StringBuilder;
        r7.<init>(r10);
        r8 = r7.length();
        r7.append(r11);
        r2 = r22;
        r1 = r2.f10904E;
        r0 = r7.length();
        r9 = 0;
        r1 = r1.measureText(r7, r9, r0);
        r18 = 1;
        r3 = 1;
    L_0x0030:
        r0 = r2.f10905F;
        r0 = (float) r0;
        r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x00a4;
    L_0x0037:
        r17 = 3;
        r16 = 2;
        r1 = 4;
        if (r3 == 0) goto L_0x006d;
    L_0x003e:
        r0 = r11.length();
        r12 = java.lang.Character.codePointCount(r11, r9, r0);
        r13 = r7.codePointCount(r9, r8);
        if (r12 <= r13) goto L_0x006e;
    L_0x004c:
        r5 = "EllipsizeTextUtil.trimLineToFitSuffix#SuffixLongerThanContent";
        r14 = java.util.Locale.US;
        r3 = "Suffix longer than content: '%s', suffix: '%s', endOfLinePosition: %d trimCodePoints: %d";
        r0 = new java.lang.Object[r1];
        r0[r9] = r10;
        r0[r18] = r20;
        r15 = java.lang.Integer.valueOf(r8);
        r0[r16] = r15;
        r12 = java.lang.Integer.valueOf(r12);
        r0[r17] = r12;
        r0 = java.lang.String.format(r14, r3, r0);
        X.AnonymousClass0Gn.m1876C(r5, r0);
        r12 = r13;
        goto L_0x006e;
    L_0x006d:
        r12 = 1;
    L_0x006e:
        r0 = -r12;
        r8 = r7.offsetByCodePoints(r8, r0);	 Catch:{ IndexOutOfBoundsException -> 0x0085 }
        r7.setLength(r8);
        r7.append(r11);
        r1 = r2.f10904E;
        r0 = r7.length();
        r1 = r1.measureText(r7, r9, r0);
        r3 = 0;
        goto L_0x0030;
    L_0x0085:
        r5 = "EllipsizeTextUtil.trimLineToFitSuffix#IndexOutOfBoundsException";
        r3 = java.util.Locale.US;
        r2 = "Attempted to trim line: '%s', suffix: '%s', endOfLinePosition: %d trimCodePoints: %d";
        r1 = new java.lang.Object[r1];
        r1[r9] = r10;
        r1[r18] = r20;
        r0 = java.lang.Integer.valueOf(r8);
        r1[r16] = r0;
        r0 = java.lang.Integer.valueOf(r12);
        r1[r17] = r0;
        r0 = java.lang.String.format(r3, r2, r1);
        X.AnonymousClass0Gn.m1876C(r5, r0);
    L_0x00a4:
        r7.setLength(r8);
        r1 = r7.length();
        r1 = r1 + r6;
        r0 = r19.length();
        if (r1 >= r0) goto L_0x00b5;
    L_0x00b2:
        r0 = "";
        return r0;
    L_0x00b5:
        r2 = new java.lang.StringBuilder;
        r1 = r19.length();
        r0 = r7.length();
        r6 = r6 + r0;
        r0 = r4.subSequence(r1, r6);
        r2.<init>(r0);
        r1 = 0;
        if (r25 == 0) goto L_0x00cb;
    L_0x00ca:
        goto L_0x00d7;
    L_0x00cb:
        r0 = r19.length();
        r0 = r4.substring(r0);
        r1 = X.AnonymousClass186.m9527D(r0, r2, r1);
    L_0x00d7:
        r0 = r2.length();
        r0 = r0 - r1;
        r2.setLength(r0);
        r1 = r2.length();
    L_0x00e3:
        if (r1 <= 0) goto L_0x00f4;
    L_0x00e5:
        r0 = r1 + -1;
        r0 = r2.charAt(r0);
        r0 = java.lang.Character.isWhitespace(r0);
        if (r0 == 0) goto L_0x00f4;
    L_0x00f1:
        r1 = r1 + -1;
        goto L_0x00e3;
    L_0x00f4:
        r2.setLength(r1);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.186.C(java.lang.CharSequence, java.lang.CharSequence, int, X.0qJ, java.lang.StringBuilder, android.text.Layout, boolean):java.lang.CharSequence");
    }

    /* renamed from: D */
    private static int m9527D(CharSequence charSequence, CharSequence charSequence2, int i) {
        String charSequence3 = charSequence2.toString();
        String charSequence4 = charSequence.toString();
        int length = charSequence2.length() - i;
        int lastIndexOf = charSequence3.lastIndexOf(64);
        if (lastIndexOf == -1 || AnonymousClass0IE.m2140H(charSequence4, lastIndexOf) <= length) {
            lastIndexOf = charSequence3.lastIndexOf(35);
            if (lastIndexOf == -1 || AnonymousClass189.m9535C(charSequence4, lastIndexOf) <= length) {
                return 0;
            }
        }
        return length - lastIndexOf;
    }

    /* renamed from: E */
    private static CharSequence m9528E(CharSequence charSequence, CharSequence charSequence2, int i, AnonymousClass0qJ anonymousClass0qJ, StringBuilder stringBuilder, Layout layout, boolean z) {
        CharSequence concat;
        int lineEnd = layout.getLineEnd(i - 1) + 1;
        if (lineEnd + 2 <= stringBuilder.length()) {
            concat = TextUtils.concat(new CharSequence[]{stringBuilder.subSequence(0, lineEnd + 2), charSequence2});
        } else {
            concat = TextUtils.concat(new CharSequence[]{stringBuilder, charSequence2});
        }
        if (lineEnd - charSequence2.length() >= charSequence.length()) {
            lineEnd -= charSequence2.length();
        }
        lineEnd--;
        int length = charSequence.length();
        if (!TextUtils.isEmpty(stringBuilder) && lineEnd >= length) {
            while (lineEnd >= length && Character.isWhitespace(stringBuilder.charAt(lineEnd))) {
                lineEnd--;
            }
            stringBuilder.setLength(lineEnd + Character.charCount(stringBuilder.codePointAt(lineEnd)));
        }
        CharSequence concat2 = TextUtils.concat(new CharSequence[]{stringBuilder, charSequence2});
        length = stringBuilder.length();
        while (length > 0 && anonymousClass0qJ.m7925A(concat2).getLineCount() > i) {
            if (length < 2) {
                String str = "EllipsizeTextUtil error while truncating";
                AnonymousClass0Gn.m1876C(str, String.format(Locale.US, "lineCount: %d, maxLineCount: %d, content: %s", new Object[]{Integer.valueOf(anonymousClass0qJ.m7925A(concat2).getLineCount()), Integer.valueOf(i), concat2}));
                break;
            }
            length -= 2;
            stringBuilder.setLength(length);
            concat2 = TextUtils.concat(new CharSequence[]{stringBuilder, charSequence2});
        }
        if (z) {
            length = 0;
        } else {
            length = AnonymousClass186.m9527D(concat, concat2, charSequence2.length());
        }
        int length2 = (concat2.length() - charSequence2.length()) - length;
        if (charSequence.length() <= length2) {
            return concat2.subSequence(charSequence.length(), length2);
        }
        str = "EllipsizeTextUtil truncated past content";
        AnonymousClass0Gn.m1876C(str, String.format(Locale.US, "maxLines: %d contentStart: %d, contentEnd: %d, content: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(charSequence.length()), Integer.valueOf(length2), concat2}));
        return JsonProperty.USE_DEFAULT_NAME;
    }
}
