package com.facebook.phonenumbers;

import X.AnonymousClass1w3;
import X.AnonymousClass1w4;
import X.AnonymousClass1w5;
import X.AnonymousClass1wA;
import X.AnonymousClass1wD;
import X.AnonymousClass1wE;
import X.AnonymousClass1wF;
import X.AnonymousClass1wG;
import X.AnonymousClass1wH;
import X.AnonymousClass1wJ;
import X.AnonymousClass1wK;
import X.AnonymousClass1wL;
import X.AnonymousClass1wN;
import X.AnonymousClass1wO;
import X.AnonymousClass1wP;
import X.AnonymousClass1wS;
import X.AnonymousClass2Rt;
import X.AnonymousClass2Ru;
import X.AnonymousClass2Rv;
import X.AnonymousClass2Rw;
import X.AnonymousClass2Rx;
import X.AnonymousClass2Ry;
import X.AnonymousClass2Rz;
import android.content.Context;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PhoneNumberUtil {
    /* renamed from: H */
    public static final AnonymousClass1wF f24397H = new AnonymousClass2Rv();
    /* renamed from: I */
    private static final AnonymousClass1wF f24398I = new AnonymousClass2Rw();
    /* renamed from: J */
    public static final AnonymousClass1wF f24399J = new AnonymousClass2Ru();
    /* renamed from: K */
    public static Pattern f24400K;
    /* renamed from: L */
    public static Pattern f24401L;
    /* renamed from: M */
    public static Pattern f24402M;
    /* renamed from: N */
    public static Pattern f24403N;
    /* renamed from: O */
    private static Pattern f24404O;
    /* renamed from: P */
    public static Pattern f24405P;
    /* renamed from: Q */
    public static Pattern f24406Q;
    /* renamed from: R */
    private static Pattern f24407R;
    /* renamed from: S */
    public static Pattern f24408S;
    /* renamed from: T */
    public static Pattern f24409T;
    /* renamed from: U */
    public static Pattern f24410U;
    /* renamed from: V */
    public static PhoneNumberUtil f24411V = null;
    /* renamed from: W */
    private static final Logger f24412W = Logger.getLogger(PhoneNumberUtil.class.getName());
    /* renamed from: B */
    public final AnonymousClass1wJ f24413B;
    /* renamed from: C */
    public final AnonymousClass1wS f24414C = new AnonymousClass1wS(100);
    /* renamed from: D */
    private final Map f24415D = Collections.synchronizedMap(new HashMap());
    /* renamed from: E */
    private final String f24416E;
    /* renamed from: F */
    private final AnonymousClass1w3 f24417F;
    /* renamed from: G */
    private final Map f24418G = Collections.synchronizedMap(new HashMap());

    /* renamed from: K */
    public final X.AnonymousClass1wC m13862K(X.AnonymousClass1wP r8, java.lang.String r9) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 2, insn: 0x003a: INVOKE  (r2 com.facebook.phonenumbers.PhoneNumberUtil), (r3 java.lang.String), (r4 java.lang.String), (r5 boolean), (r6 boolean), (r7 X.1wP) com.facebook.phonenumbers.PhoneNumberUtil.N(com.facebook.phonenumbers.PhoneNumberUtil, java.lang.String, java.lang.String, boolean, boolean, X.1wP):void type: STATIC, block:B:15:0x0032, method: com.facebook.phonenumbers.PhoneNumberUtil.K(X.1wP, java.lang.String):X.1wC
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:168)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:132)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
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
        r7 = this;
        r2 = r7;	 Catch:{ 1w5 -> 0x000d }
        r3 = r9;	 Catch:{ 1w5 -> 0x000d }
        r0 = "ZZ";	 Catch:{ 1w5 -> 0x000d }
        r0 = m13871T(r9, r0);	 Catch:{ 1w5 -> 0x000d }
        r0 = m13861J(r8, r0);	 Catch:{ 1w5 -> 0x000d }
        return r0;	 Catch:{ 1w5 -> 0x000d }
    L_0x000d:
        r0 = move-exception;
        r1 = r0.f24332B;
        r0 = X.AnonymousClass1w4.INVALID_COUNTRY_CODE;
        if (r1 != r0) goto L_0x0042;
    L_0x0014:
        r0 = r8.f24496C;
        r1 = m13859H(r0);
        r0 = "ZZ";	 Catch:{ 1w5 -> 0x0042 }
        r0 = r1.equals(r0);	 Catch:{ 1w5 -> 0x0042 }
        if (r0 != 0) goto L_0x0032;	 Catch:{ 1w5 -> 0x0042 }
    L_0x0022:
        r0 = m13871T(r9, r1);	 Catch:{ 1w5 -> 0x0042 }
        r1 = m13861J(r8, r0);	 Catch:{ 1w5 -> 0x0042 }
        r0 = X.AnonymousClass1wC.EXACT_MATCH;	 Catch:{ 1w5 -> 0x0042 }
        if (r1 != r0) goto L_0x0031;	 Catch:{ 1w5 -> 0x0042 }
    L_0x002e:
        r0 = X.AnonymousClass1wC.NSN_MATCH;	 Catch:{ 1w5 -> 0x0042 }
        return r0;	 Catch:{ 1w5 -> 0x0042 }
    L_0x0031:
        return r1;	 Catch:{ 1w5 -> 0x0042 }
    L_0x0032:
        r7 = new X.1wP;	 Catch:{ 1w5 -> 0x0042 }
        r7.<init>();	 Catch:{ 1w5 -> 0x0042 }
        r4 = 0;	 Catch:{ 1w5 -> 0x0042 }
        r5 = 0;	 Catch:{ 1w5 -> 0x0042 }
        r6 = 0;	 Catch:{ 1w5 -> 0x0042 }
        m13841N(r2, r3, r4, r5, r6, r7);	 Catch:{ 1w5 -> 0x0042 }
        r0 = r2.m13861J(r8, r7);	 Catch:{ 1w5 -> 0x0042 }
        return r0;	 Catch:{ 1w5 -> 0x0042 }
    L_0x0042:
        r0 = X.AnonymousClass1wC.NOT_A_NUMBER;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.K(X.1wP, java.lang.String):X.1wC");
    }

    static {
        AnonymousClass2Rt anonymousClass2Rt = new AnonymousClass2Rt();
        AnonymousClass2Rx anonymousClass2Rx = new AnonymousClass2Rx();
        AnonymousClass2Ry anonymousClass2Ry = new AnonymousClass2Ry();
    }

    public PhoneNumberUtil(String str, AnonymousClass1w3 anonymousClass1w3, AnonymousClass1wJ anonymousClass1wJ, Context context) {
        this.f24416E = str;
        this.f24417F = anonymousClass1w3;
        this.f24413B = anonymousClass1wJ;
    }

    /* renamed from: A */
    public final AnonymousClass1wK m13852A(List list, String str) {
        for (AnonymousClass1wK anonymousClass1wK : list) {
            int size = anonymousClass1wK.f24428F.size();
            if (size != 0) {
                if (!this.f24414C.m13886A((String) anonymousClass1wK.f24428F.get(size - 1)).matcher(str).lookingAt()) {
                    continue;
                }
            }
            if (this.f24414C.m13886A(anonymousClass1wK.f24431I).matcher(str).matches()) {
                return anonymousClass1wK;
            }
        }
        return null;
    }

    /* renamed from: B */
    public final int m13853B(StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        if (stringBuilder.length() != 0) {
            if (stringBuilder.charAt(0) != '0') {
                int length = stringBuilder.length();
                int i = 1;
                while (i <= 3 && i <= length) {
                    int parseInt = Integer.parseInt(stringBuilder.substring(0, i));
                    if (this.f24413B.m13876D(parseInt)) {
                        stringBuilder2.append(stringBuilder.substring(i));
                        return parseInt;
                    }
                    i++;
                }
            }
        }
        return 0;
    }

    /* renamed from: B */
    public static String m13829B(String str) {
        Pattern H = m13835H("getValidStartCharPattern()", f24410U, "[+＋\\p{Nd}]");
        f24410U = H;
        Matcher matcher = H.matcher(str);
        if (!matcher.find()) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        str = str.substring(matcher.start());
        matcher = m13833F().matcher(str);
        if (matcher.find()) {
            str = str.substring(0, matcher.start());
            Logger logger = f24412W;
            Level level = Level.FINER;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Stripped trailing characters: ");
            stringBuilder.append(str);
            logger.log(level, stringBuilder.toString());
        }
        H = m13835H("getSecondNumberStartPattern()", f24405P, "[\\\\/] *x");
        f24405P = H;
        matcher = H.matcher(str);
        if (matcher.find()) {
            str = str.substring(0, matcher.start());
        }
        return str;
    }

    /* renamed from: C */
    public static synchronized PhoneNumberUtil m13830C(Context context) {
        PhoneNumberUtil phoneNumberUtil;
        synchronized (PhoneNumberUtil.class) {
            if (f24411V == null) {
                Context applicationContext = context.getApplicationContext();
                AnonymousClass1w3 anonymousClass2Rz = new AnonymousClass2Rz(applicationContext);
                if (anonymousClass2Rz != null) {
                    PhoneNumberUtil phoneNumberUtil2 = new PhoneNumberUtil("PhoneNumberMetadataProto", anonymousClass2Rz, new AnonymousClass1wJ(), applicationContext);
                    synchronized (PhoneNumberUtil.class) {
                        f24411V = phoneNumberUtil2;
                    }
                } else {
                    throw new IllegalArgumentException("metadataLoader could not be null.");
                }
            }
            phoneNumberUtil = f24411V;
        }
        return phoneNumberUtil;
    }

    /* renamed from: C */
    public final String m13854C(AnonymousClass1wP anonymousClass1wP, AnonymousClass1wD anonymousClass1wD) {
        if (anonymousClass1wP.f24507N == 0 && anonymousClass1wP.f24505L) {
            String str = anonymousClass1wP.f24510Q;
            if (str.length() > 0) {
                return str;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(20);
        m13855D(anonymousClass1wP, anonymousClass1wD, stringBuilder);
        return stringBuilder.toString();
    }

    /* renamed from: D */
    public static final String m13831D(AnonymousClass1wP anonymousClass1wP) {
        StringBuilder stringBuilder = new StringBuilder();
        if (anonymousClass1wP.f24506M) {
            char[] cArr = new char[anonymousClass1wP.f24508O];
            Arrays.fill(cArr, '0');
            stringBuilder.append(new String(cArr));
        }
        stringBuilder.append(anonymousClass1wP.f24507N);
        return stringBuilder.toString();
    }

    /* renamed from: D */
    public final void m13855D(AnonymousClass1wP anonymousClass1wP, AnonymousClass1wD anonymousClass1wD, StringBuilder stringBuilder) {
        stringBuilder.setLength(0);
        int i = anonymousClass1wP.f24496C;
        String D = m13831D(anonymousClass1wP);
        AnonymousClass1wD anonymousClass1wD2 = AnonymousClass1wD.E164;
        if (anonymousClass1wD == anonymousClass1wD2) {
            stringBuilder.append(D);
            m13851X(i, anonymousClass1wD2, stringBuilder);
        } else if (this.f24413B.m13876D(i)) {
            List list;
            AnonymousClass1wK A;
            Object obj;
            Matcher matcher;
            AnonymousClass1wD anonymousClass1wD3;
            Pattern H;
            Matcher matcher2;
            CharSequence replaceFirst;
            AnonymousClass1wL R = m13845R(this, i, m13859H(i));
            if (R.f24461e.size() != 0) {
                if (anonymousClass1wD != AnonymousClass1wD.NATIONAL) {
                    list = R.f24461e;
                    A = m13852A(list, D);
                    if (A == null) {
                        obj = A.f24425C;
                        matcher = this.f24414C.m13886A(A.f24431I).matcher(D);
                        anonymousClass1wD3 = AnonymousClass1wD.NATIONAL;
                        D = A.f24429G;
                        if (anonymousClass1wD == anonymousClass1wD3 || D == null || D.length() <= 0) {
                            D = matcher.replaceAll(obj);
                        } else {
                            H = m13835H("getFirstGroupPattern()", f24403N, "(\\$\\d)");
                            f24403N = H;
                            D = matcher.replaceAll(H.matcher(obj).replaceFirst(D));
                        }
                        if (anonymousClass1wD == AnonymousClass1wD.RFC3966) {
                            H = m13835H("getSeparatorPattern()", f24406Q, "[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
                            f24406Q = H;
                            matcher2 = H.matcher(D);
                            if (matcher2.lookingAt()) {
                                replaceFirst = matcher2.replaceFirst(JsonProperty.USE_DEFAULT_NAME);
                            }
                            D = matcher2.reset(replaceFirst).replaceAll("-");
                        }
                    }
                    stringBuilder.append(D);
                    if (anonymousClass1wP.f24500G && anonymousClass1wP.f24497D.length() > 0) {
                        if (anonymousClass1wD == AnonymousClass1wD.RFC3966) {
                            stringBuilder.append(";ext=");
                            stringBuilder.append(anonymousClass1wP.f24497D);
                        } else if (R.f24449S) {
                            stringBuilder.append(" ext. ");
                            stringBuilder.append(anonymousClass1wP.f24497D);
                        } else {
                            stringBuilder.append(R.f24474r);
                            stringBuilder.append(anonymousClass1wP.f24497D);
                        }
                    }
                    m13851X(i, anonymousClass1wD, stringBuilder);
                }
            }
            list = R.f24471o;
            A = m13852A(list, D);
            if (A == null) {
                obj = A.f24425C;
                matcher = this.f24414C.m13886A(A.f24431I).matcher(D);
                anonymousClass1wD3 = AnonymousClass1wD.NATIONAL;
                D = A.f24429G;
                if (anonymousClass1wD == anonymousClass1wD3) {
                }
                D = matcher.replaceAll(obj);
                if (anonymousClass1wD == AnonymousClass1wD.RFC3966) {
                    H = m13835H("getSeparatorPattern()", f24406Q, "[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
                    f24406Q = H;
                    matcher2 = H.matcher(D);
                    if (matcher2.lookingAt()) {
                        replaceFirst = matcher2.replaceFirst(JsonProperty.USE_DEFAULT_NAME);
                    }
                    D = matcher2.reset(replaceFirst).replaceAll("-");
                }
            }
            stringBuilder.append(D);
            if (anonymousClass1wD == AnonymousClass1wD.RFC3966) {
                stringBuilder.append(";ext=");
                stringBuilder.append(anonymousClass1wP.f24497D);
            } else if (R.f24449S) {
                stringBuilder.append(" ext. ");
                stringBuilder.append(anonymousClass1wP.f24497D);
            } else {
                stringBuilder.append(R.f24474r);
                stringBuilder.append(anonymousClass1wP.f24497D);
            }
            m13851X(i, anonymousClass1wD, stringBuilder);
        } else {
            stringBuilder.append(D);
        }
    }

    /* renamed from: E */
    public final int m13856E(String str) {
        if (this.f24413B.m13877E(str)) {
            return m13844Q(this, str);
        }
        Logger logger = f24412W;
        Level level = Level.WARNING;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        stringBuilder.append(str);
        stringBuilder.append(") provided.");
        logger.log(level, stringBuilder.toString());
        return 0;
    }

    /* renamed from: E */
    public static Pattern m13832E() {
        Pattern H = m13835H("getPlusCharsPattern()", f24404O, "[+＋]+");
        f24404O = H;
        return H;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: F */
    public final X.AnonymousClass1wL m13857F(int r5) {
        /*
        r4 = this;
        r3 = r4.f24415D;
        monitor-enter(r3);
        r0 = r4.f24413B;	 Catch:{ all -> 0x0031 }
        r0 = r0.m13876D(r5);	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x000e;
    L_0x000b:
        r0 = 0;
        monitor-exit(r3);	 Catch:{ all -> 0x0031 }
        return r0;
    L_0x000e:
        r1 = r4.f24415D;	 Catch:{ all -> 0x0031 }
        r0 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0031 }
        r0 = r1.containsKey(r0);	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x0023;
    L_0x001a:
        r2 = r4.f24416E;	 Catch:{ all -> 0x0031 }
        r1 = "001";
        r0 = r4.f24417F;	 Catch:{ all -> 0x0031 }
        r4.m13867P(r2, r1, r5, r0);	 Catch:{ all -> 0x0031 }
    L_0x0023:
        monitor-exit(r3);	 Catch:{ all -> 0x0031 }
        r1 = r4.f24415D;
        r0 = java.lang.Integer.valueOf(r5);
        r0 = r1.get(r0);
        r0 = (X.AnonymousClass1wL) r0;
        return r0;
    L_0x0031:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0031 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.F(int):X.1wL");
    }

    /* renamed from: F */
    public static final Pattern m13833F() {
        Pattern H = m13835H("getUnwantedEndCharPattern()", f24407R, "[[\\P{N}&&\\P{L}]&&[^#]]+$");
        f24407R = H;
        return H;
    }

    /* renamed from: G */
    public final AnonymousClass1wL m13858G(String str) {
        if (!this.f24413B.m13877E(str)) {
            return null;
        }
        synchronized (this.f24418G) {
            if (!this.f24418G.containsKey(str)) {
                m13867P(this.f24416E, str, 0, this.f24417F);
            }
        }
        return (AnonymousClass1wL) this.f24418G.get(str);
    }

    /* renamed from: G */
    public static boolean m13834G(String str) {
        if (str.length() < 2) {
            return false;
        }
        Pattern I = m13836I("getValidPhoneNumberPattern()", f24409T, "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\\p{Nd}]*(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[,xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)?", 66);
        f24409T = I;
        return I.matcher(str).matches();
    }

    /* renamed from: H */
    public final String m13859H(int i) {
        i = AnonymousClass1wH.m13872B(i);
        if (i >= 0) {
            return AnonymousClass1wH.f24420C[i];
        }
        return "ZZ";
    }

    /* renamed from: H */
    public static Pattern m13835H(String str, Pattern pattern, String str2) {
        return m13836I(str, pattern, str2, 0);
    }

    /* renamed from: I */
    public final String m13860I(AnonymousClass1wP anonymousClass1wP) {
        int i = anonymousClass1wP.f24496C;
        List C = this.f24413B.m13875C(i);
        if (C == null) {
            String D = m13831D(anonymousClass1wP);
            Logger logger = f24412W;
            Level level = Level.WARNING;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Missing/invalid country_code (");
            stringBuilder.append(i);
            stringBuilder.append(") for number ");
            stringBuilder.append(D);
            logger.log(level, stringBuilder.toString());
            return null;
        } else if (C.size() == 1) {
            return (String) C.get(0);
        } else {
            return m13847T(anonymousClass1wP, C);
        }
    }

    /* renamed from: I */
    public static Pattern m13836I(String str, Pattern pattern, String str2, int i) {
        return pattern != null ? pattern : Pattern.compile(str2, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: J */
    public final X.AnonymousClass1wC m13861J(X.AnonymousClass1wP r4, X.AnonymousClass1wP r5) {
        /*
        r3 = this;
        r3 = new X.1wP;
        r3.<init>();
        r3.m13880C(r4);
        r4 = new X.1wP;
        r4.<init>();
        r4.m13880C(r5);
        r0 = 0;
        r3.f24505L = r0;
        r1 = "";
        r3.f24510Q = r1;
        r3.m13878A();
        r0 = 0;
        r3.f24504K = r0;
        r3.f24509P = r1;
        r0 = 0;
        r4.f24505L = r0;
        r4.f24510Q = r1;
        r4.m13878A();
        r0 = 0;
        r4.f24504K = r0;
        r4.f24509P = r1;
        r0 = r3.f24500G;
        if (r0 == 0) goto L_0x003d;
    L_0x0030:
        r0 = r3.f24497D;
        r0 = r0.length();
        if (r0 != 0) goto L_0x003d;
    L_0x0038:
        r0 = 0;
        r3.f24500G = r0;
        r3.f24497D = r1;
    L_0x003d:
        r0 = r4.f24500G;
        if (r0 == 0) goto L_0x004e;
    L_0x0041:
        r0 = r4.f24497D;
        r0 = r0.length();
        if (r0 != 0) goto L_0x004e;
    L_0x0049:
        r0 = 0;
        r4.f24500G = r0;
        r4.f24497D = r1;
    L_0x004e:
        r0 = r3.f24500G;
        if (r0 == 0) goto L_0x0063;
    L_0x0052:
        r0 = r4.f24500G;
        if (r0 == 0) goto L_0x0063;
    L_0x0056:
        r1 = r3.f24497D;
        r0 = r4.f24497D;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0063;
    L_0x0060:
        r0 = X.AnonymousClass1wC.NO_MATCH;
        return r0;
    L_0x0063:
        r2 = r3.f24496C;
        r1 = r4.f24496C;
        if (r2 == 0) goto L_0x007f;
    L_0x0069:
        if (r1 == 0) goto L_0x007f;
    L_0x006b:
        r0 = r3.m13879B(r4);
        if (r0 == 0) goto L_0x0074;
    L_0x0071:
        r0 = X.AnonymousClass1wC.EXACT_MATCH;
        return r0;
    L_0x0074:
        if (r2 != r1) goto L_0x0060;
    L_0x0076:
        r0 = m13848U(r3, r4);
        if (r0 == 0) goto L_0x0060;
    L_0x007c:
        r0 = X.AnonymousClass1wC.SHORT_NSN_MATCH;
        return r0;
    L_0x007f:
        r3.m13881D(r1);
        r0 = r3.m13879B(r4);
        if (r0 == 0) goto L_0x0076;
    L_0x0088:
        r0 = X.AnonymousClass1wC.NSN_MATCH;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.J(X.1wP, X.1wP):X.1wC");
    }

    /* renamed from: J */
    public static final String m13837J(StringBuilder stringBuilder) {
        Pattern I = m13836I("getExtnPattern()", f24401L, "(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[,xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)$", 66);
        f24401L = I;
        Matcher matcher = I.matcher(stringBuilder);
        if (matcher.find() && m13834G(stringBuilder.substring(0, matcher.start()))) {
            int groupCount = matcher.groupCount();
            for (int i = 1; i <= groupCount; i++) {
                if (matcher.group(i) != null) {
                    String group = matcher.group(i);
                    stringBuilder.delete(matcher.start(), stringBuilder.length());
                    return group;
                }
            }
        }
        return JsonProperty.USE_DEFAULT_NAME;
    }

    /* renamed from: K */
    public static String m13838K(String str) {
        Pattern H = m13835H("getValidAlphaPhonePattern()", f24408S, "(?:.*?[A-Za-z]){3}.*");
        f24408S = H;
        if (!H.matcher(str).matches()) {
            return m13840M(str);
        }
        AnonymousClass1wF anonymousClass1wF = f24398I;
        StringBuilder stringBuilder = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char xH = anonymousClass1wF.xH(Character.toUpperCase(str.charAt(i)), '?');
            if (xH != '?') {
                stringBuilder.append(xH);
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: L */
    public static void m13839L(StringBuilder stringBuilder) {
        stringBuilder.replace(0, stringBuilder.length(), m13838K(stringBuilder.toString()));
    }

    /* renamed from: L */
    public final boolean m13863L(String str, AnonymousClass1wN anonymousClass1wN) {
        return this.f24414C.m13886A(anonymousClass1wN.f24489G).matcher(str).matches() && this.f24414C.m13886A(anonymousClass1wN.f24488F).matcher(str).matches();
    }

    /* renamed from: M */
    public final AnonymousClass1wG m13864M(AnonymousClass1wP anonymousClass1wP) {
        String D = m13831D(anonymousClass1wP);
        int i = anonymousClass1wP.f24496C;
        if (!this.f24413B.m13876D(i)) {
            return AnonymousClass1wG.INVALID_COUNTRY_CODE;
        }
        return m13842O(this.f24414C.m13886A(m13845R(this, i, m13859H(i)).f24436F.f24489G), D);
    }

    /* renamed from: M */
    public static String m13840M(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.length());
        for (char digit : str.toCharArray()) {
            int digit2 = Character.digit(digit, 10);
            if (digit2 != -1) {
                stringBuilder.append(digit2);
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: N */
    public static void m13841N(PhoneNumberUtil phoneNumberUtil, String str, String str2, boolean z, boolean z2, AnonymousClass1wP anonymousClass1wP) {
        int i;
        if (str == null) {
            throw new AnonymousClass1w5(AnonymousClass1w4.NOT_A_NUMBER, "The phone number supplied was null.");
        } else if (str.length() <= 250) {
            int indexOf;
            CharSequence stringBuilder = new StringBuilder();
            int indexOf2 = str.indexOf(";phone-context=");
            if (indexOf2 > 0) {
                i = 15 + indexOf2;
                if (str.charAt(i) == '+') {
                    int indexOf3 = str.indexOf(59, i);
                    if (indexOf3 > 0) {
                        stringBuilder.append(str.substring(i, indexOf3));
                    } else {
                        stringBuilder.append(str.substring(i));
                    }
                }
                indexOf = str.indexOf("tel:");
                stringBuilder.append(str.substring(indexOf >= 0 ? indexOf + 4 : 0, indexOf2));
            } else {
                stringBuilder.append(m13829B(str));
            }
            indexOf = stringBuilder.indexOf(";isub=");
            if (indexOf > 0) {
                stringBuilder.delete(indexOf, stringBuilder.length());
            }
            if (m13834G(stringBuilder.toString())) {
                PhoneNumberUtil phoneNumberUtil2 = phoneNumberUtil;
                if (z2) {
                    if (!phoneNumberUtil.m13843P(stringBuilder.toString(), str2)) {
                        throw new AnonymousClass1w5(AnonymousClass1w4.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
                    }
                }
                boolean z3 = z;
                AnonymousClass1wP anonymousClass1wP2 = anonymousClass1wP;
                if (z) {
                    anonymousClass1wP2.m13885H(str);
                }
                String J = m13837J(stringBuilder);
                if (J.length() > 0) {
                    anonymousClass1wP2.m13883F(J);
                }
                AnonymousClass1wL G = phoneNumberUtil2.m13834G(str2);
                StringBuilder stringBuilder2 = new StringBuilder();
                try {
                    i = phoneNumberUtil2.m13868Q(stringBuilder.toString(), G, stringBuilder2, z3, anonymousClass1wP2);
                } catch (AnonymousClass1w5 e) {
                    Matcher matcher = m13832E().matcher(stringBuilder.toString());
                    if (e.f24332B == AnonymousClass1w4.INVALID_COUNTRY_CODE && matcher.lookingAt()) {
                        i = phoneNumberUtil2.m13868Q(stringBuilder.substring(matcher.end()), G, stringBuilder2, z3, anonymousClass1wP2);
                        if (i == 0) {
                            throw new AnonymousClass1w5(AnonymousClass1w4.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                        }
                    }
                    throw new AnonymousClass1w5(e.f24332B, e.getMessage());
                }
                if (i != 0) {
                    J = phoneNumberUtil2.m13859H(i);
                    if (!J.equals(str2)) {
                        G = m13845R(phoneNumberUtil2, i, J);
                    }
                } else {
                    m13839L(stringBuilder);
                    stringBuilder2.append(stringBuilder);
                    if (str2 != null) {
                        anonymousClass1wP2.m13881D(G.f24433C);
                    } else if (z) {
                        anonymousClass1wP2.m13878A();
                    }
                }
                if (stringBuilder2.length() >= 2) {
                    if (G != null) {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        StringBuilder stringBuilder4 = new StringBuilder(stringBuilder2);
                        phoneNumberUtil2.m13870S(stringBuilder4, G, stringBuilder3);
                        if ((m13842O(phoneNumberUtil2.f24414C.m13886A(G.f24436F.f24489G), stringBuilder4.toString()) == AnonymousClass1wG.TOO_SHORT ? 1 : null) == null) {
                            if (z) {
                                anonymousClass1wP2.m13884G(stringBuilder3.toString());
                            }
                            stringBuilder2 = stringBuilder4;
                        }
                    }
                    indexOf = stringBuilder2.length();
                    if (indexOf >= 2) {
                        if (indexOf <= 17) {
                            String stringBuilder5 = stringBuilder2.toString();
                            if (stringBuilder5.length() > 1 && stringBuilder5.charAt(0) == '0') {
                                anonymousClass1wP2.f24501H = true;
                                anonymousClass1wP2.f24506M = true;
                                indexOf = 1;
                                while (indexOf < stringBuilder5.length() - 1 && stringBuilder5.charAt(indexOf) == '0') {
                                    indexOf++;
                                }
                                if (indexOf != 1) {
                                    anonymousClass1wP2.f24503J = true;
                                    anonymousClass1wP2.f24508O = indexOf;
                                }
                            }
                            long parseLong = Long.parseLong(stringBuilder2.toString());
                            anonymousClass1wP2.f24502I = true;
                            anonymousClass1wP2.f24507N = parseLong;
                            return;
                        }
                        throw new AnonymousClass1w5(AnonymousClass1w4.TOO_LONG, "The string supplied is too long to be a phone number.");
                    }
                }
                throw new AnonymousClass1w5(AnonymousClass1w4.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
            }
            throw new AnonymousClass1w5(AnonymousClass1w4.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        } else {
            throw new AnonymousClass1w5(AnonymousClass1w4.TOO_LONG, "The string supplied was too long to parse.");
        }
    }

    /* renamed from: N */
    public final boolean m13865N(AnonymousClass1wP anonymousClass1wP) {
        return m13866O(anonymousClass1wP, m13860I(anonymousClass1wP));
    }

    /* renamed from: O */
    public static AnonymousClass1wG m13842O(Pattern pattern, String str) {
        str = pattern.matcher(str);
        if (str.matches() != null) {
            return AnonymousClass1wG.IS_POSSIBLE;
        }
        if (str.lookingAt() != null) {
            return AnonymousClass1wG.TOO_LONG;
        }
        return AnonymousClass1wG.TOO_SHORT;
    }

    /* renamed from: O */
    public final boolean m13866O(AnonymousClass1wP anonymousClass1wP, String str) {
        int i = anonymousClass1wP.f24496C;
        AnonymousClass1wL R = m13845R(this, i, str);
        if (R == null) {
            return false;
        }
        if (!"001".equals(str) && i != m13844Q(this, str)) {
            return false;
        }
        if (m13846S(this, m13831D(anonymousClass1wP), R) != AnonymousClass1wE.UNKNOWN) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public final void m13867P(String str, String str2, int i, AnonymousClass1w3 anonymousClass1w3) {
        boolean equals = "001".equals(str2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("libphone_data/");
        stringBuilder.append(str);
        stringBuilder.append("_");
        stringBuilder.append(equals ? String.valueOf(i) : str2);
        String stringBuilder2 = stringBuilder.toString();
        InputStream NZ = anonymousClass1w3.NZ(stringBuilder2);
        Logger logger;
        Level level;
        StringBuilder stringBuilder3;
        String str3;
        if (NZ != null) {
            try {
                List list = m13849V(new ObjectInputStream(NZ)).f24483B;
                if (list.isEmpty()) {
                    logger = f24412W;
                    level = Level.SEVERE;
                    stringBuilder3 = new StringBuilder();
                    str3 = "empty metadata: ";
                    stringBuilder3.append(str3);
                    stringBuilder3.append(stringBuilder2);
                    logger.log(level, stringBuilder3.toString());
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str3);
                    stringBuilder.append(stringBuilder2);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                if (list.size() > 1) {
                    Logger logger2 = f24412W;
                    Level level2 = Level.WARNING;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("invalid metadata (too many entries): ");
                    stringBuilder.append(stringBuilder2);
                    logger2.log(level2, stringBuilder.toString());
                }
                AnonymousClass1wL anonymousClass1wL = (AnonymousClass1wL) list.get(0);
                if (equals) {
                    this.f24415D.put(Integer.valueOf(i), anonymousClass1wL);
                    return;
                } else {
                    this.f24418G.put(str2, anonymousClass1wL);
                    return;
                }
            } catch (Throwable e) {
                logger = f24412W;
                level = Level.SEVERE;
                stringBuilder3 = new StringBuilder();
                str3 = "cannot load/parse metadata: ";
                stringBuilder3.append(str3);
                stringBuilder3.append(stringBuilder2);
                logger.log(level, stringBuilder3.toString(), e);
                stringBuilder = new StringBuilder();
                stringBuilder.append(str3);
                stringBuilder.append(stringBuilder2);
                throw new RuntimeException(stringBuilder.toString(), e);
            }
        }
        logger = f24412W;
        level = Level.SEVERE;
        stringBuilder3 = new StringBuilder();
        str3 = "missing metadata: ";
        stringBuilder3.append(str3);
        stringBuilder3.append(stringBuilder2);
        logger.log(level, stringBuilder3.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append(str3);
        stringBuilder.append(stringBuilder2);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: P */
    private boolean m13843P(String str, String str2) {
        return this.f24413B.m13877E(str2) || !(str == null || str.length() == 0 || !m13832E().matcher(str).lookingAt());
    }

    /* renamed from: Q */
    private static int m13844Q(PhoneNumberUtil phoneNumberUtil, String str) {
        int B = phoneNumberUtil.f24413B.m13874B(str, -1);
        if (B != -1) {
            return B;
        }
        AnonymousClass1wL G = phoneNumberUtil.m13834G(str);
        if (G != null) {
            phoneNumberUtil.f24413B.m13873A(str, G.f24433C);
            return G.f24433C;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid region code: ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: Q */
    public final int m13868Q(String str, AnonymousClass1wL anonymousClass1wL, StringBuilder stringBuilder, boolean z, AnonymousClass1wP anonymousClass1wP) {
        if (str.length() == 0) {
            return 0;
        }
        int i;
        Object stringBuilder2 = new StringBuilder(str);
        String str2 = "NonMatch";
        if (anonymousClass1wL != null) {
            str2 = anonymousClass1wL.f24460d;
        }
        AnonymousClass1wO R = m13869R(stringBuilder2, str2);
        if (z) {
            anonymousClass1wP.m13882E(R);
        }
        if (R == AnonymousClass1wO.FROM_DEFAULT_COUNTRY) {
            if (anonymousClass1wL != null) {
                i = anonymousClass1wL.f24433C;
                String valueOf = String.valueOf(i);
                String stringBuilder3 = stringBuilder2.toString();
                if (stringBuilder3.startsWith(valueOf)) {
                    StringBuilder stringBuilder4 = new StringBuilder(stringBuilder3.substring(valueOf.length()));
                    AnonymousClass1wN anonymousClass1wN = anonymousClass1wL.f24436F;
                    Pattern A = this.f24414C.m13886A(anonymousClass1wN.f24488F);
                    m13870S(stringBuilder4, anonymousClass1wL, null);
                    Pattern A2 = this.f24414C.m13886A(anonymousClass1wN.f24489G);
                    if ((!A.matcher(stringBuilder2).matches() && A.matcher(stringBuilder4).matches()) || m13842O(A2, stringBuilder2.toString()) == AnonymousClass1wG.TOO_LONG) {
                        stringBuilder.append(stringBuilder4);
                        if (z) {
                            anonymousClass1wP.m13882E(AnonymousClass1wO.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                        }
                    }
                }
            }
            anonymousClass1wP.m13881D(0);
            return 0;
        } else if (stringBuilder2.length() > 2) {
            i = m13853B(stringBuilder2, stringBuilder);
            if (i == 0) {
                throw new AnonymousClass1w5(AnonymousClass1w4.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
            }
        } else {
            throw new AnonymousClass1w5(AnonymousClass1w4.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
        anonymousClass1wP.m13881D(i);
        return i;
    }

    /* renamed from: R */
    private static AnonymousClass1wL m13845R(PhoneNumberUtil phoneNumberUtil, int i, String str) {
        if ("001".equals(str)) {
            return phoneNumberUtil.m13857F(i);
        }
        return phoneNumberUtil.m13834G(str);
    }

    /* renamed from: R */
    public final AnonymousClass1wO m13869R(StringBuilder stringBuilder, String str) {
        if (stringBuilder.length() == 0) {
            return AnonymousClass1wO.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = m13832E().matcher(stringBuilder);
        if (matcher.lookingAt()) {
            stringBuilder.delete(0, matcher.end());
            m13839L(stringBuilder);
            return AnonymousClass1wO.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern A = this.f24414C.m13886A(str);
        m13839L(stringBuilder);
        return m13850W(A, stringBuilder) ? AnonymousClass1wO.FROM_NUMBER_WITH_IDD : AnonymousClass1wO.FROM_DEFAULT_COUNTRY;
    }

    /* renamed from: S */
    private static AnonymousClass1wE m13846S(PhoneNumberUtil phoneNumberUtil, String str, AnonymousClass1wL anonymousClass1wL) {
        if (phoneNumberUtil.m13863L(str, anonymousClass1wL.f24436F)) {
            if (phoneNumberUtil.m13863L(str, anonymousClass1wL.f24476t)) {
                return AnonymousClass1wE.PREMIUM_RATE;
            }
            if (phoneNumberUtil.m13863L(str, anonymousClass1wL.f24481y)) {
                return AnonymousClass1wE.TOLL_FREE;
            }
            if (phoneNumberUtil.m13863L(str, anonymousClass1wL.f24478v)) {
                return AnonymousClass1wE.SHARED_COST;
            }
            if (phoneNumberUtil.m13863L(str, anonymousClass1wL.BB)) {
                return AnonymousClass1wE.VOIP;
            }
            if (phoneNumberUtil.m13863L(str, anonymousClass1wL.f24473q)) {
                return AnonymousClass1wE.PERSONAL_NUMBER;
            }
            if (phoneNumberUtil.m13863L(str, anonymousClass1wL.f24472p)) {
                return AnonymousClass1wE.PAGER;
            }
            if (phoneNumberUtil.m13863L(str, anonymousClass1wL.f24482z)) {
                return AnonymousClass1wE.UAN;
            }
            if (phoneNumberUtil.m13863L(str, anonymousClass1wL.AB)) {
                return AnonymousClass1wE.VOICEMAIL;
            }
            if (phoneNumberUtil.m13863L(str, anonymousClass1wL.f24435E)) {
                if (!anonymousClass1wL.f24477u) {
                    if (!phoneNumberUtil.m13863L(str, anonymousClass1wL.f24466j)) {
                        return AnonymousClass1wE.FIXED_LINE;
                    }
                }
                return AnonymousClass1wE.FIXED_LINE_OR_MOBILE;
            } else if (!anonymousClass1wL.f24477u && phoneNumberUtil.m13863L(str, anonymousClass1wL.f24466j)) {
                return AnonymousClass1wE.MOBILE;
            }
        }
        return AnonymousClass1wE.UNKNOWN;
    }

    /* renamed from: S */
    public final boolean m13870S(StringBuilder stringBuilder, AnonymousClass1wL anonymousClass1wL, StringBuilder stringBuilder2) {
        int length = stringBuilder.length();
        String str = anonymousClass1wL.f24467k;
        if (length != 0) {
            if (str.length() != 0) {
                Matcher matcher = this.f24414C.m13886A(str).matcher(stringBuilder);
                if (matcher.lookingAt()) {
                    Pattern A = this.f24414C.m13886A(anonymousClass1wL.f24436F.f24488F);
                    boolean matches = A.matcher(stringBuilder).matches();
                    int groupCount = matcher.groupCount();
                    String str2 = anonymousClass1wL.f24468l;
                    if (!(str2 == null || str2.length() == 0)) {
                        if (matcher.group(groupCount) != null) {
                            StringBuilder stringBuilder3 = new StringBuilder(stringBuilder);
                            stringBuilder3.replace(0, length, matcher.replaceFirst(str2));
                            if (!matches || A.matcher(stringBuilder3.toString()).matches()) {
                                if (stringBuilder2 != null && groupCount > 1) {
                                    stringBuilder2.append(matcher.group(1));
                                }
                                stringBuilder.replace(0, stringBuilder.length(), stringBuilder3.toString());
                                return true;
                            }
                        }
                    }
                    if (!matches || A.matcher(stringBuilder.substring(matcher.end())).matches()) {
                        if (!(stringBuilder2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                            stringBuilder2.append(matcher.group(1));
                        }
                        stringBuilder.delete(0, matcher.end());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: T */
    public final AnonymousClass1wP m13871T(String str, String str2) {
        AnonymousClass1wP anonymousClass1wP = new AnonymousClass1wP();
        m13841N(this, str, str2, false, true, anonymousClass1wP);
        return anonymousClass1wP;
    }

    /* renamed from: T */
    private String m13847T(AnonymousClass1wP anonymousClass1wP, List list) {
        String D = m13831D(anonymousClass1wP);
        for (String str : list) {
            AnonymousClass1wL G = m13834G(str);
            if (G.f24441K) {
                if (this.f24414C.m13886A(G.f24462f).matcher(D).lookingAt()) {
                }
            } else if (m13846S(this, D, G) != AnonymousClass1wE.UNKNOWN) {
            }
            return str;
        }
        return null;
    }

    /* renamed from: U */
    private static boolean m13848U(AnonymousClass1wP anonymousClass1wP, AnonymousClass1wP anonymousClass1wP2) {
        anonymousClass1wP = String.valueOf(anonymousClass1wP.f24507N);
        String valueOf = String.valueOf(anonymousClass1wP2.f24507N);
        if (!anonymousClass1wP.endsWith(valueOf)) {
            if (!valueOf.endsWith(anonymousClass1wP)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: V */
    private static X.AnonymousClass1wM m13849V(java.io.ObjectInputStream r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = new X.1wM;
        r4.<init>();
        r4.readExternal(r5);	 Catch:{ IOException -> 0x0017 }
        r5.close();	 Catch:{ IOException -> 0x000c }
    L_0x000b:
        return r4;	 Catch:{ IOException -> 0x000c }
    L_0x000c:
        r3 = move-exception;
        r2 = f24412W;	 Catch:{ all -> 0x0016 }
        r1 = java.util.logging.Level.WARNING;	 Catch:{ all -> 0x0016 }
        r0 = "error closing input stream (ignored)";	 Catch:{ all -> 0x0016 }
        r2.log(r1, r0, r3);	 Catch:{ all -> 0x0016 }
    L_0x0016:
        return r4;
    L_0x0017:
        r3 = move-exception;
        r2 = f24412W;	 Catch:{ all -> 0x002c }
        r1 = java.util.logging.Level.WARNING;	 Catch:{ all -> 0x002c }
        r0 = "error reading input (ignored)";	 Catch:{ all -> 0x002c }
        r2.log(r1, r0, r3);	 Catch:{ all -> 0x002c }
        r5.close();	 Catch:{ IOException -> 0x0025 }
        goto L_0x000b;	 Catch:{ IOException -> 0x0025 }
    L_0x0025:
        r3 = move-exception;
        r0 = "error closing input stream (ignored)";	 Catch:{ all -> 0x002b }
        r2.log(r1, r0, r3);	 Catch:{ all -> 0x002b }
    L_0x002b:
        return r4;
    L_0x002c:
        r5.close();	 Catch:{ IOException -> 0x0030 }
        goto L_0x000b;	 Catch:{ IOException -> 0x0030 }
    L_0x0030:
        r3 = move-exception;
        r2 = f24412W;	 Catch:{ all -> 0x003a }
        r1 = java.util.logging.Level.WARNING;	 Catch:{ all -> 0x003a }
        r0 = "error closing input stream (ignored)";	 Catch:{ all -> 0x003a }
        r2.log(r1, r0, r3);	 Catch:{ all -> 0x003a }
    L_0x003a:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.V(java.io.ObjectInputStream):X.1wM");
    }

    /* renamed from: W */
    private static boolean m13850W(Pattern pattern, StringBuilder stringBuilder) {
        Matcher matcher = pattern.matcher(stringBuilder);
        if (matcher.lookingAt()) {
            int end = matcher.end();
            Pattern H = m13835H("getCapturingDigitPattern()", f24400K, "(\\p{Nd})");
            f24400K = H;
            matcher = H.matcher(stringBuilder.substring(end));
            if (!(matcher.find() && m13840M(matcher.group(1)).equals("0"))) {
                stringBuilder.delete(0, end);
                return true;
            }
        }
        return false;
    }

    /* renamed from: X */
    private static void m13851X(int i, AnonymousClass1wD anonymousClass1wD, StringBuilder stringBuilder) {
        switch (AnonymousClass1wA.f24362B[anonymousClass1wD.ordinal()]) {
            case 1:
                stringBuilder.insert(0, i).insert(0, '+');
                return;
            case 2:
                stringBuilder.insert(0, " ").insert(0, i).insert(0, '+');
                return;
            case 3:
                stringBuilder.insert(0, "-").insert(0, i).insert(0, '+').insert(0, "tel:");
                return;
            default:
                return;
        }
    }
}
