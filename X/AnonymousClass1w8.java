package X;

import com.facebook.phonenumbers.PhoneNumberUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Character.UnicodeBlock;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1w8 */
public final class AnonymousClass1w8 implements Iterator {
    /* renamed from: J */
    private static final Pattern[] f24341J = new Pattern[]{Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};
    /* renamed from: K */
    private static final Pattern f24342K;
    /* renamed from: L */
    private static final Pattern f24343L;
    /* renamed from: M */
    private static final Pattern f24344M;
    /* renamed from: N */
    private static final Pattern f24345N = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    /* renamed from: O */
    private static final Pattern f24346O = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    /* renamed from: P */
    private static final Pattern f24347P = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
    /* renamed from: Q */
    private static final Pattern f24348Q = Pattern.compile(":[0-5]\\d");
    /* renamed from: B */
    public AnonymousClass1w6 f24349B = null;
    /* renamed from: C */
    public AnonymousClass1w7 f24350C = AnonymousClass1w7.NOT_READY;
    /* renamed from: D */
    private final AnonymousClass1wB f24351D;
    /* renamed from: E */
    private long f24352E;
    /* renamed from: F */
    private final PhoneNumberUtil f24353F;
    /* renamed from: G */
    private final String f24354G;
    /* renamed from: H */
    private int f24355H = 0;
    /* renamed from: I */
    private final CharSequence f24356I;

    static {
        String str = "(\\[（［";
        String str2 = ")\\]）］";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[^");
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append("]");
        String stringBuilder2 = stringBuilder.toString();
        String I = AnonymousClass1w8.m13825I(0, 3);
        stringBuilder = new StringBuilder();
        stringBuilder.append("(?:[");
        stringBuilder.append(str);
        stringBuilder.append("])?");
        stringBuilder.append("(?:");
        stringBuilder.append(stringBuilder2);
        stringBuilder.append("+");
        stringBuilder.append("[");
        stringBuilder.append(str2);
        stringBuilder.append("])?");
        stringBuilder.append(stringBuilder2);
        stringBuilder.append("+");
        stringBuilder.append("(?:[");
        stringBuilder.append(str);
        stringBuilder.append("]");
        stringBuilder.append(stringBuilder2);
        stringBuilder.append("+[");
        stringBuilder.append(str2);
        stringBuilder.append("])");
        stringBuilder.append(I);
        stringBuilder.append(stringBuilder2);
        stringBuilder.append("*");
        f24343L = Pattern.compile(stringBuilder.toString());
        stringBuilder2 = AnonymousClass1w8.m13825I(0, 2);
        String I2 = AnonymousClass1w8.m13825I(0, 4);
        String I3 = AnonymousClass1w8.m13825I(0, 20);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]");
        stringBuilder3.append(I2);
        I = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append("\\p{Nd}");
        stringBuilder3.append(AnonymousClass1w8.m13825I(1, 20));
        String stringBuilder4 = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str);
        stringBuilder3.append("+＋");
        String stringBuilder5 = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append("[");
        stringBuilder3.append(stringBuilder5);
        stringBuilder3.append("]");
        I2 = stringBuilder3.toString();
        f24342K = Pattern.compile(I2);
        StringBuilder stringBuilder6 = new StringBuilder();
        String str3 = "(?:";
        stringBuilder6.append(str3);
        stringBuilder6.append(I2);
        stringBuilder6.append(I);
        stringBuilder6.append(")");
        stringBuilder6.append(stringBuilder2);
        stringBuilder6.append(stringBuilder4);
        stringBuilder6.append(str3);
        stringBuilder6.append(I);
        stringBuilder6.append(stringBuilder4);
        stringBuilder6.append(")");
        stringBuilder6.append(I3);
        stringBuilder6.append(str3);
        stringBuilder6.append(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#");
        stringBuilder6.append(")?");
        f24344M = Pattern.compile(stringBuilder6.toString(), 66);
    }

    public AnonymousClass1w8(PhoneNumberUtil phoneNumberUtil, CharSequence charSequence, String str, AnonymousClass1wB anonymousClass1wB, long j) {
        if (phoneNumberUtil == null || anonymousClass1wB == null) {
            throw new NullPointerException();
        } else if (j >= 0) {
            this.f24353F = phoneNumberUtil;
            if (charSequence == null) {
                charSequence = JsonProperty.USE_DEFAULT_NAME;
            }
            this.f24356I = charSequence;
            this.f24354G = str;
            this.f24351D = anonymousClass1wB;
            this.f24352E = j;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: B */
    public static boolean m13818B(AnonymousClass1wP anonymousClass1wP, String str, PhoneNumberUtil phoneNumberUtil) {
        int i = 0;
        while (i < str.length() - 1) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt == 'X') {
                int i2 = i + 1;
                charAt = str.charAt(i2);
                if (charAt != 'x') {
                    if (charAt != 'X') {
                        if (!PhoneNumberUtil.m13840M(str.substring(i)).equals(anonymousClass1wP.f24497D)) {
                            return false;
                        }
                    }
                }
                if (phoneNumberUtil.m13862K(anonymousClass1wP, str.substring(i2)) != AnonymousClass1wC.NSN_MATCH) {
                    return false;
                }
                i = i2;
            }
            i++;
        }
        return true;
    }

    /* renamed from: C */
    public static boolean m13819C(char c) {
        if (!Character.isLetter(c) && Character.getType(c) != 6) {
            return false;
        }
        UnicodeBlock of = UnicodeBlock.of(c);
        if (of.equals(UnicodeBlock.BASIC_LATIN) || of.equals(UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(UnicodeBlock.LATIN_EXTENDED_A) || of.equals(UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(UnicodeBlock.LATIN_EXTENDED_B) || of.equals(UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public static boolean m13820D(AnonymousClass1wP anonymousClass1wP, PhoneNumberUtil phoneNumberUtil) {
        if (anonymousClass1wP.f24495B == AnonymousClass1wO.FROM_DEFAULT_COUNTRY) {
            AnonymousClass1wL G = phoneNumberUtil.m13834G(phoneNumberUtil.m13859H(anonymousClass1wP.f24496C));
            if (G != null) {
                AnonymousClass1wK A = phoneNumberUtil.m13852A(G.f24471o, PhoneNumberUtil.m13831D(anonymousClass1wP));
                if (A != null && A.f24429G.length() > 0) {
                    if (!A.f24430H) {
                        Object obj;
                        CharSequence charSequence = A.f24429G;
                        if (charSequence.length() != 0) {
                            Pattern H = PhoneNumberUtil.m13835H("getFirstGroupOnlyPrefixPattern()", PhoneNumberUtil.f24402M, "\\(?\\$1\\)?");
                            PhoneNumberUtil.f24402M = H;
                            if (!H.matcher(charSequence).matches()) {
                                obj = null;
                                if (obj != null) {
                                    return phoneNumberUtil.m13870S(new StringBuilder(PhoneNumberUtil.m13840M(anonymousClass1wP.f24510Q)), G, null);
                                }
                            }
                        }
                        obj = 1;
                        if (obj != null) {
                            return phoneNumberUtil.m13870S(new StringBuilder(PhoneNumberUtil.m13840M(anonymousClass1wP.f24510Q)), G, null);
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: E */
    private static AnonymousClass1w6 m13821E(AnonymousClass1w8 anonymousClass1w8, String str, int i) {
        for (Pattern matcher : f24341J) {
            Matcher matcher2 = matcher.matcher(str);
            Object obj = 1;
            while (matcher2.find() && anonymousClass1w8.f24352E > 0) {
                AnonymousClass1w6 J;
                if (obj != null) {
                    J = AnonymousClass1w8.m13826J(anonymousClass1w8, AnonymousClass1w8.m13827K(PhoneNumberUtil.m13833F(), str.substring(0, matcher2.start())).toString(), i);
                    if (J != null) {
                        return J;
                    }
                    anonymousClass1w8.f24352E--;
                    obj = null;
                }
                J = AnonymousClass1w8.m13826J(anonymousClass1w8, AnonymousClass1w8.m13827K(PhoneNumberUtil.m13833F(), matcher2.group(1)).toString(), matcher2.start(1) + i);
                if (J != null) {
                    return J;
                }
                anonymousClass1w8.f24352E--;
            }
        }
        return null;
    }

    /* renamed from: F */
    private static AnonymousClass1w6 m13822F(AnonymousClass1w8 anonymousClass1w8, CharSequence charSequence, int i) {
        if (!f24346O.matcher(charSequence).find()) {
            if (f24347P.matcher(charSequence).find()) {
                if (f24348Q.matcher(anonymousClass1w8.f24356I.toString().substring(charSequence.length() + i)).lookingAt()) {
                }
            }
            String charSequence2 = charSequence.toString();
            AnonymousClass1w6 J = AnonymousClass1w8.m13826J(anonymousClass1w8, charSequence2, i);
            if (J != null) {
                return J;
            }
            return AnonymousClass1w8.m13821E(anonymousClass1w8, charSequence2, i);
        }
        return null;
    }

    /* renamed from: G */
    private AnonymousClass1w6 m13823G(int i) {
        Matcher matcher = f24344M.matcher(this.f24356I);
        while (this.f24352E > 0 && matcher.find(r6)) {
            i = matcher.start();
            CharSequence subSequence = this.f24356I.subSequence(i, matcher.end());
            Pattern H = PhoneNumberUtil.m13835H("getSecondNumberStartPattern()", PhoneNumberUtil.f24405P, "[\\\\/] *x");
            PhoneNumberUtil.f24405P = H;
            CharSequence K = AnonymousClass1w8.m13827K(H, subSequence);
            AnonymousClass1w6 F = AnonymousClass1w8.m13822F(this, K, i);
            if (F != null) {
                return F;
            }
            i += K.length();
            this.f24352E--;
        }
        return null;
    }

    /* renamed from: H */
    private static boolean m13824H(char c) {
        if (c != '%') {
            if (Character.getType(c) != '\u001a') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    private static String m13825I(int i, int i2) {
        if (i < 0 || i2 <= 0 || i2 < i) {
            throw new IllegalArgumentException();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        stringBuilder.append(i);
        stringBuilder.append(",");
        stringBuilder.append(i2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: J */
    private static X.AnonymousClass1w6 m13826J(X.AnonymousClass1w8 r9, java.lang.String r10, int r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = 0;
        r0 = f24343L;	 Catch:{ 1w5 -> 0x00c3 }
        r4 = r10;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r0.matcher(r10);	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r0.matches();	 Catch:{ 1w5 -> 0x00c3 }
        if (r0 == 0) goto L_0x0047;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x000e:
        r0 = f24345N;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r0.matcher(r10);	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r0.find();	 Catch:{ 1w5 -> 0x00c3 }
        if (r0 == 0) goto L_0x001b;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x001a:
        goto L_0x0047;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x001b:
        r1 = r9.f24351D;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = X.AnonymousClass1wB.VALID;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r1.compareTo(r0);	 Catch:{ 1w5 -> 0x00c3 }
        if (r0 < 0) goto L_0x0068;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x0025:
        if (r11 <= 0) goto L_0x0048;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x0027:
        r0 = f24342K;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r0.matcher(r10);	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r0.lookingAt();	 Catch:{ 1w5 -> 0x00c3 }
        if (r0 != 0) goto L_0x0048;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x0033:
        r1 = r9.f24356I;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r11 + -1;	 Catch:{ 1w5 -> 0x00c3 }
        r1 = r1.charAt(r0);	 Catch:{ 1w5 -> 0x00c3 }
        r0 = X.AnonymousClass1w8.m13824H(r1);	 Catch:{ 1w5 -> 0x00c3 }
        if (r0 != 0) goto L_0x0047;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x0041:
        r0 = X.AnonymousClass1w8.m13819C(r1);	 Catch:{ 1w5 -> 0x00c3 }
        if (r0 == 0) goto L_0x0048;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x0047:
        return r2;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x0048:
        r1 = r10.length();	 Catch:{ 1w5 -> 0x00c3 }
        r1 = r1 + r11;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r9.f24356I;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r0.length();	 Catch:{ 1w5 -> 0x00c3 }
        if (r1 >= r0) goto L_0x0068;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x0055:
        r0 = r9.f24356I;	 Catch:{ 1w5 -> 0x00c3 }
        r1 = r0.charAt(r1);	 Catch:{ 1w5 -> 0x00c3 }
        r0 = X.AnonymousClass1w8.m13824H(r1);	 Catch:{ 1w5 -> 0x00c3 }
        if (r0 != 0) goto L_0x0047;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x0061:
        r0 = X.AnonymousClass1w8.m13819C(r1);	 Catch:{ 1w5 -> 0x00c3 }
        if (r0 == 0) goto L_0x0068;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x0067:
        goto L_0x0047;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x0068:
        r3 = r9.f24353F;	 Catch:{ 1w5 -> 0x00c3 }
        r5 = r9.f24354G;	 Catch:{ 1w5 -> 0x00c3 }
        r8 = new X.1wP;	 Catch:{ 1w5 -> 0x00c3 }
        r8.<init>();	 Catch:{ 1w5 -> 0x00c3 }
        r6 = 1;	 Catch:{ 1w5 -> 0x00c3 }
        r7 = 1;	 Catch:{ 1w5 -> 0x00c3 }
        com.facebook.phonenumbers.PhoneNumberUtil.m13841N(r3, r4, r5, r6, r7, r8);	 Catch:{ 1w5 -> 0x00c3 }
        r1 = r9.f24353F;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r8.f24496C;	 Catch:{ 1w5 -> 0x00c3 }
        r1 = r1.m13859H(r0);	 Catch:{ 1w5 -> 0x00c3 }
        r0 = "IL";	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r1.equals(r0);	 Catch:{ 1w5 -> 0x00c3 }
        if (r0 == 0) goto L_0x00a2;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x0086:
        r0 = com.facebook.phonenumbers.PhoneNumberUtil.m13831D(r8);	 Catch:{ 1w5 -> 0x00c3 }
        r1 = r0.length();	 Catch:{ 1w5 -> 0x00c3 }
        r0 = 4;	 Catch:{ 1w5 -> 0x00c3 }
        if (r1 != r0) goto L_0x00a2;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x0091:
        if (r11 == 0) goto L_0x0047;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x0093:
        if (r11 <= 0) goto L_0x00a2;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x0095:
        r1 = r9.f24356I;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r11 + -1;	 Catch:{ 1w5 -> 0x00c3 }
        r1 = r1.charAt(r0);	 Catch:{ 1w5 -> 0x00c3 }
        r0 = 42;	 Catch:{ 1w5 -> 0x00c3 }
        if (r1 == r0) goto L_0x00a2;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x00a1:
        goto L_0x0047;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x00a2:
        r1 = r9.f24351D;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r9.f24353F;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = r1.mo3017A(r8, r10, r0);	 Catch:{ 1w5 -> 0x00c3 }
        if (r0 == 0) goto L_0x00c3;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x00ac:
        r8.m13878A();	 Catch:{ 1w5 -> 0x00c3 }
        r0 = 0;	 Catch:{ 1w5 -> 0x00c3 }
        r8.f24505L = r0;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = "";	 Catch:{ 1w5 -> 0x00c3 }
        r8.f24510Q = r0;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = 0;	 Catch:{ 1w5 -> 0x00c3 }
        r8.f24504K = r0;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = "";	 Catch:{ 1w5 -> 0x00c3 }
        r8.f24509P = r0;	 Catch:{ 1w5 -> 0x00c3 }
        r0 = new X.1w6;	 Catch:{ 1w5 -> 0x00c3 }
        r0.<init>(r11, r10, r8);	 Catch:{ 1w5 -> 0x00c3 }
        return r0;	 Catch:{ 1w5 -> 0x00c3 }
    L_0x00c3:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1w8.J(X.1w8, java.lang.String, int):X.1w6");
    }

    /* renamed from: K */
    private static CharSequence m13827K(Pattern pattern, CharSequence charSequence) {
        pattern = pattern.matcher(charSequence);
        return pattern.find() ? charSequence.subSequence(0, pattern.start()) : charSequence;
    }

    public final boolean hasNext() {
        if (this.f24350C == AnonymousClass1w7.NOT_READY) {
            AnonymousClass1w6 G = m13823G(this.f24355H);
            this.f24349B = G;
            if (G == null) {
                this.f24350C = AnonymousClass1w7.DONE;
            } else {
                this.f24355H = G.m13817A();
                this.f24350C = AnonymousClass1w7.READY;
            }
        }
        return this.f24350C == AnonymousClass1w7.READY;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            AnonymousClass1w6 anonymousClass1w6 = this.f24349B;
            this.f24349B = null;
            this.f24350C = AnonymousClass1w7.NOT_READY;
            return anonymousClass1w6;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
