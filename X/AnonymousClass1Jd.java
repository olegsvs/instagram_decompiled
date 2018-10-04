package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Jd */
public final class AnonymousClass1Jd extends LinkedHashMap {
    /* renamed from: G */
    private static final char[] f17094G = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    /* renamed from: H */
    public static String f17095H = "\n";
    /* renamed from: B */
    public AnonymousClass1Jd f17096B;
    /* renamed from: C */
    public ArrayList f17097C;
    /* renamed from: D */
    public Throwable f17098D;
    /* renamed from: E */
    public Map f17099E = new LinkedHashMap();
    /* renamed from: F */
    public boolean f17100F;

    /* renamed from: A */
    public final String m10723A(String str) {
        String str2 = (String) super.get(str);
        if (str2 != null) {
            return str2;
        }
        AnonymousClass1Jd anonymousClass1Jd = this.f17096B;
        return anonymousClass1Jd != null ? anonymousClass1Jd.m10723A(str) : str2;
    }

    /* renamed from: B */
    public final synchronized void m10724B(InputStream inputStream) {
        if (inputStream != null) {
            Reader inputStreamReader;
            InputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(Integer.MAX_VALUE);
            boolean D = AnonymousClass1Jd.m10722D(bufferedInputStream);
            bufferedInputStream.reset();
            if (D) {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } else {
                inputStreamReader = new InputStreamReader(bufferedInputStream, "ISO8859-1");
            }
            m10725C(inputStreamReader);
        } else {
            throw new NullPointerException();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static void m10720B(java.lang.Appendable r6, java.lang.String r7, boolean r8) {
        /*
        r4 = r7.length();
        r3 = 0;
        r2 = 32;
        if (r8 != 0) goto L_0x0017;
    L_0x0009:
        if (r4 <= 0) goto L_0x0017;
    L_0x000b:
        r0 = r7.charAt(r3);
        if (r0 != r2) goto L_0x0017;
    L_0x0011:
        r0 = "\\ ";
        r6.append(r0);
        r3 = 1;
    L_0x0017:
        if (r3 >= r4) goto L_0x0088;
    L_0x0019:
        r5 = r7.charAt(r3);
        switch(r5) {
            case 9: goto L_0x0039;
            case 10: goto L_0x0033;
            case 11: goto L_0x0020;
            case 12: goto L_0x002d;
            case 13: goto L_0x0027;
            default: goto L_0x0020;
        };
    L_0x0020:
        r1 = 92;
        if (r8 == 0) goto L_0x003f;
    L_0x0024:
        if (r5 == r2) goto L_0x004d;
    L_0x0026:
        goto L_0x003f;
    L_0x0027:
        r0 = "\\r";
        r6.append(r0);
        goto L_0x0085;
    L_0x002d:
        r0 = "\\f";
        r6.append(r0);
        goto L_0x0085;
    L_0x0033:
        r0 = "\\n";
        r6.append(r0);
        goto L_0x0085;
    L_0x0039:
        r0 = "\\t";
        r6.append(r0);
        goto L_0x0085;
    L_0x003f:
        if (r5 == r1) goto L_0x004d;
    L_0x0041:
        r0 = 35;
        if (r5 == r0) goto L_0x004d;
    L_0x0045:
        r0 = 33;
        if (r5 == r0) goto L_0x004d;
    L_0x0049:
        r0 = 58;
        if (r5 != r0) goto L_0x0050;
    L_0x004d:
        r6.append(r1);
    L_0x0050:
        if (r5 < r2) goto L_0x005a;
    L_0x0052:
        r0 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r5 > r0) goto L_0x005a;
    L_0x0056:
        r6.append(r5);
        goto L_0x0085;
    L_0x005a:
        r0 = "\\u";
        r6.append(r0);
        r1 = f17094G;
        r0 = r5 >>> 12;
        r0 = r0 & 15;
        r0 = r1[r0];
        r6.append(r0);
        r0 = r5 >>> 8;
        r0 = r0 & 15;
        r0 = r1[r0];
        r6.append(r0);
        r0 = r5 >>> 4;
        r0 = r0 & 15;
        r0 = r1[r0];
        r6.append(r0);
        r0 = r5 >>> 0;
        r0 = r0 & 15;
        r0 = r1[r0];
        r6.append(r0);
    L_0x0085:
        r3 = r3 + 1;
        goto L_0x0017;
    L_0x0088:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Jd.B(java.lang.Appendable, java.lang.String, boolean):void");
    }

    /* renamed from: C */
    public static java.io.Writer m10721C(java.io.OutputStream r2) {
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
        r1 = new java.io.OutputStreamWriter;	 Catch:{ UnsupportedEncodingException -> 0x0008 }
        r0 = "ISO8859_1";	 Catch:{ UnsupportedEncodingException -> 0x0008 }
        r1.<init>(r2, r0);	 Catch:{ UnsupportedEncodingException -> 0x0008 }
        return r1;	 Catch:{ UnsupportedEncodingException -> 0x0008 }
    L_0x0008:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Jd.C(java.io.OutputStream):java.io.Writer");
    }

    /* renamed from: C */
    public final synchronized void m10725C(Reader reader) {
        Object obj = new char[40];
        BufferedReader bufferedReader = new BufferedReader(reader);
        int i = 2;
        Object obj2 = 1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = 0;
        while (true) {
            reader = true;
            while (true) {
                IllegalArgumentException illegalArgumentException;
                int read = bufferedReader.read();
                String str;
                String substring;
                Object substring2;
                StringBuilder stringBuilder;
                if (read == -1) {
                    if (i4 == 2) {
                        if (i5 > 4) {
                            illegalArgumentException = new IllegalArgumentException("luni.08");
                        }
                    }
                    if (i6 == -1 && i3 > 0) {
                        i6 = i3;
                    }
                    if (i6 >= 0) {
                        str = new String(obj, 0, i3);
                        substring = str.substring(0, i6);
                        substring2 = str.substring(i6);
                        if (i4 == 1) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(substring2);
                            stringBuilder.append("\u0000");
                            substring2 = stringBuilder.toString();
                        }
                        put(substring, substring2);
                    }
                    return;
                } else if (read == 0) {
                    if (i4 == 2) {
                        if (i5 > 4) {
                            illegalArgumentException = new IllegalArgumentException("luni.08");
                        }
                    }
                    i6 = i3;
                    if (i6 >= 0) {
                        str = new String(obj, 0, i3);
                        substring = str.substring(0, i6);
                        substring2 = str.substring(i6);
                        if (i4 == 1) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(substring2);
                            stringBuilder.append("\u0000");
                            substring2 = stringBuilder.toString();
                        }
                        put(substring, substring2);
                    }
                    return;
                } else {
                    char c = (char) read;
                    if (i3 == obj.length) {
                        Object obj3 = new char[(obj.length * 2)];
                        System.arraycopy(obj, i2, obj3, i2, i3);
                        obj = obj3;
                    }
                    if (i4 == i) {
                        read = Character.digit(c, 16);
                        if (read >= 0) {
                            i7 = (i7 << 4) + read;
                            i5++;
                            if (i5 < 4) {
                                i = 2;
                                i2 = 0;
                            }
                        } else if (i5 <= 4) {
                            illegalArgumentException = new IllegalArgumentException("luni.09");
                        }
                        i4 = i3 + 1;
                        obj[i3] = (char) i7;
                        if (c == '\n' || c == '') {
                            i3 = i4;
                            i4 = 0;
                        } else {
                            i3 = i4;
                            i = 2;
                            i2 = 0;
                            i4 = 0;
                        }
                    }
                    if (i4 == obj2) {
                        if (c != '\n') {
                            if (c == '\r') {
                                i = 2;
                                i2 = 0;
                                i4 = 3;
                            } else if (c == 'b') {
                                c = '\b';
                            } else if (c == 'f') {
                                c = '\f';
                            } else if (c == 'n') {
                                c = '\n';
                            } else if (c != 'r') {
                                if (c != '') {
                                    switch (c) {
                                        case ParserMinimalBase.INT_t /*116*/:
                                            c = '\t';
                                            break;
                                        case ParserMinimalBase.INT_u /*117*/:
                                            i = 2;
                                            i2 = 0;
                                            i4 = 2;
                                            i5 = 0;
                                            i7 = 0;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            } else {
                                c = '\r';
                            }
                        }
                        i = 2;
                        i2 = 0;
                        i4 = 5;
                    } else {
                        if (c != '\n') {
                            if (c != '\r') {
                                if (c == '!' || c == '#') {
                                    if (reader != null) {
                                        char c2;
                                        do {
                                            read = bufferedReader.read();
                                            if (read != -1) {
                                                c2 = (char) read;
                                                if (!(c2 == '\r' || c2 == '\n')) {
                                                }
                                            }
                                            i = 2;
                                            obj2 = 1;
                                            i2 = 0;
                                        } while (c2 != '');
                                        i = 2;
                                        obj2 = 1;
                                        i2 = 0;
                                    }
                                } else if (c == ':' || c == '=') {
                                    if (i6 == -1) {
                                        i6 = i3;
                                        i = 2;
                                        obj2 = 1;
                                        i2 = 0;
                                        i4 = 0;
                                    }
                                } else if (c == '\\') {
                                    if (i4 == 4) {
                                        i6 = i3;
                                    }
                                    i = 2;
                                    obj2 = 1;
                                    i2 = 0;
                                    i4 = 1;
                                } else if (c != '') {
                                }
                                if (Character.isWhitespace(c)) {
                                    if (i4 == 3) {
                                        i4 = 5;
                                    }
                                    if (!(i3 == 0 || i3 == i6)) {
                                        read = 5;
                                        if (i4 != 5) {
                                            if (i6 == -1) {
                                                i = 2;
                                                obj2 = 1;
                                                i2 = 0;
                                                i4 = 4;
                                            }
                                        }
                                    }
                                    i = 2;
                                    obj2 = 1;
                                    i2 = 0;
                                } else {
                                    read = 5;
                                }
                                if (i4 != read) {
                                    if (i4 == 3) {
                                    }
                                    if (i4 == 4) {
                                        i6 = i3;
                                        i4 = 0;
                                    }
                                    read = i3 + 1;
                                    obj[i3] = c;
                                    i3 = read;
                                    i = 2;
                                    obj2 = 1;
                                    i2 = 0;
                                    reader = null;
                                }
                            }
                        } else if (i4 == 3) {
                            i = 2;
                            obj2 = 1;
                            i2 = 0;
                            i4 = 5;
                        }
                        if (i3 > 0 || (i3 == 0 && i6 == 0)) {
                            if (i6 == -1) {
                                i6 = i3;
                            }
                            String str2 = new String(obj, 0, i3);
                            put(str2.substring(0, i6), str2.substring(i6));
                        }
                        i3 = 0;
                        i = 2;
                        obj2 = 1;
                        i2 = 0;
                        i4 = 0;
                        i6 = -1;
                    }
                    i4 = 0;
                    if (i4 == 4) {
                        i6 = i3;
                        i4 = 0;
                    }
                    read = i3 + 1;
                    obj[i3] = c;
                    i3 = read;
                    i = 2;
                    obj2 = 1;
                    i2 = 0;
                    reader = null;
                }
                throw illegalArgumentException;
            }
        }
    }

    /* renamed from: D */
    public final String m10726D(String str, String str2, Writer writer) {
        String str3 = !this.f17100F ? (String) put(str, str2) : null;
        if (writer != null) {
            synchronized (this) {
                String str4 = str.toString();
                if (str2 == null) {
                    str2 = JsonProperty.USE_DEFAULT_NAME;
                }
                int length = (str4.length() + str2.length()) + 1;
                Appendable stringBuilder = new StringBuilder(length + (length / 5));
                AnonymousClass1Jd.m10720B(stringBuilder, str4, true);
                stringBuilder.append('=');
                AnonymousClass1Jd.m10720B(stringBuilder, str2, false);
                stringBuilder.append(f17095H);
                writer.write(stringBuilder.toString());
                writer.flush();
            }
        }
        return str3;
    }

    /* renamed from: D */
    private static boolean m10722D(BufferedInputStream bufferedInputStream) {
        byte read;
        do {
            read = (byte) bufferedInputStream.read();
            if (!(read == (byte) -1 || read == (byte) 35 || read == (byte) 10)) {
                if (read == (byte) 61) {
                }
            }
            return false;
        } while (read != (byte) 21);
        return true;
    }
}
