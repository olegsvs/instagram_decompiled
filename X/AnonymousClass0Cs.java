package X;

import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.util.Collection;

/* renamed from: X.0Cs */
public class AnonymousClass0Cs extends AnonymousClass0Ct {
    /* renamed from: B */
    public final int f1778B;
    /* renamed from: C */
    public final File f1779C;

    public AnonymousClass0Cs(File file, int i) {
        this.f1779C = file;
        this.f1778B = i;
    }

    /* renamed from: A */
    public final void mo215A(Collection collection) {
        collection.add(this.f1779C.getAbsolutePath());
    }

    /* renamed from: B */
    public int mo216B(String str, int i, ThreadPolicy threadPolicy) {
        return m1060E(str, i, this.f1779C, threadPolicy);
    }

    /* renamed from: D */
    public final File mo217D(String str) {
        File file = new File(this.f1779C, str);
        return file.exists() ? file : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: E */
    public final int m1060E(java.lang.String r29, int r30, java.io.File r31, android.os.StrictMode.ThreadPolicy r32) {
        /*
        r28 = this;
        r13 = r30;
        r15 = new java.io.File;
        r3 = r29;
        r2 = r31;
        r15.<init>(r2, r3);
        r0 = r15.exists();
        if (r0 != 0) goto L_0x002a;
    L_0x0011:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r3);
        r0 = " not found on ";
        r1.append(r0);
        r0 = r2.getCanonicalPath();
        r1.append(r0);
        r1.toString();
        r0 = 0;
        return r0;
    L_0x002a:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r3);
        r0 = " found on ";
        r1.append(r0);
        r0 = r2.getCanonicalPath();
        r1.append(r0);
        r1.toString();
        r0 = r30 & 1;
        r1 = r28;
        if (r0 == 0) goto L_0x005e;
    L_0x0047:
        r0 = r1.f1778B;
        r2 = 2;
        r0 = r0 & r2;
        if (r0 == 0) goto L_0x005e;
    L_0x004d:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r3);
        r0 = " loaded implicitly";
        r1.append(r0);
        r1.toString();
        return r2;
    L_0x005e:
        r0 = r1.f1778B;
        r31 = 1;
        r0 = r0 & r31;
        if (r0 == 0) goto L_0x02b6;
    L_0x0066:
        r0 = X.AnonymousClass0CF.f1498B;
        if (r0 == 0) goto L_0x0087;
    L_0x006a:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "SoLoader.getElfDependencies[";
        r1.append(r0);
        r0 = r15.getName();
        r1.append(r0);
        r0 = "]";
        r1.append(r0);
        r0 = r1.toString();
        X.AnonymousClass0D9.m1103B(r0);
    L_0x0087:
        r30 = new java.io.FileInputStream;	 Catch:{ all -> 0x0387 }
        r0 = r30;
        r0.<init>(r15);	 Catch:{ all -> 0x0387 }
        r8 = r30.getChannel();	 Catch:{ all -> 0x0390 }
        r0 = 8;
        r7 = java.nio.ByteBuffer.allocate(r0);	 Catch:{ all -> 0x0390 }
        r0 = java.nio.ByteOrder.LITTLE_ENDIAN;	 Catch:{ all -> 0x0390 }
        r7.order(r0);	 Catch:{ all -> 0x0390 }
        r0 = 0;
        r2 = X.AnonymousClass1Ae.m9735D(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        r0 = 1179403647; // 0x464c457f float:13073.374 double:5.827028246E-315;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x03bd;
    L_0x00aa:
        r0 = 4;
        r0 = X.AnonymousClass1Ae.m9736E(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        r6 = 1;
        if (r0 != r6) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00b5;
    L_0x00b4:
        r6 = 0;
    L_0x00b5:
        r0 = 5;
        r1 = X.AnonymousClass1Ae.m9736E(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        r0 = 2;
        if (r1 != r0) goto L_0x00c3;
    L_0x00be:
        r0 = java.nio.ByteOrder.BIG_ENDIAN;	 Catch:{ all -> 0x0390 }
        r7.order(r0);	 Catch:{ all -> 0x0390 }
    L_0x00c3:
        r11 = 28;
        r4 = 32;
        if (r6 == 0) goto L_0x00ce;
    L_0x00c9:
        r2 = X.AnonymousClass1Ae.m9735D(r8, r7, r11);	 Catch:{ all -> 0x0390 }
        goto L_0x00d2;
    L_0x00ce:
        r2 = X.AnonymousClass1Ae.m9733B(r8, r7, r4);	 Catch:{ all -> 0x0390 }
    L_0x00d2:
        r0 = 44;
        if (r6 == 0) goto L_0x00dc;
    L_0x00d6:
        r0 = X.AnonymousClass1Ae.m9734C(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        r9 = (long) r0;	 Catch:{ all -> 0x0390 }
        goto L_0x00e3;
    L_0x00dc:
        r0 = 56;
        r0 = X.AnonymousClass1Ae.m9734C(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        r9 = (long) r0;	 Catch:{ all -> 0x0390 }
    L_0x00e3:
        if (r6 == 0) goto L_0x00ec;
    L_0x00e5:
        r0 = 42;
        r14 = X.AnonymousClass1Ae.m9734C(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        goto L_0x00f2;
    L_0x00ec:
        r0 = 54;
        r14 = X.AnonymousClass1Ae.m9734C(r8, r7, r0);	 Catch:{ all -> 0x0390 }
    L_0x00f2:
        r0 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r16 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        r0 = 40;
        if (r16 != 0) goto L_0x0115;
    L_0x00fb:
        if (r6 == 0) goto L_0x0102;
    L_0x00fd:
        r0 = X.AnonymousClass1Ae.m9735D(r8, r7, r4);	 Catch:{ all -> 0x0390 }
        goto L_0x0106;
    L_0x0102:
        r0 = X.AnonymousClass1Ae.m9733B(r8, r7, r0);	 Catch:{ all -> 0x0390 }
    L_0x0106:
        if (r6 == 0) goto L_0x010e;
    L_0x0108:
        r0 = r0 + r11;
        r9 = X.AnonymousClass1Ae.m9735D(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        goto L_0x0115;
    L_0x010e:
        r4 = 44;
        r0 = r0 + r4;
        r9 = X.AnonymousClass1Ae.m9735D(r8, r7, r0);	 Catch:{ all -> 0x0390 }
    L_0x0115:
        r4 = r2;
        r16 = 0;
    L_0x0118:
        r0 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1));
        r28 = 1;
        r26 = 8;
        if (r0 >= 0) goto L_0x014f;
    L_0x0120:
        if (r6 == 0) goto L_0x012b;
    L_0x0122:
        r11 = 0;
        r0 = r4 + r11;
        r11 = X.AnonymousClass1Ae.m9735D(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        goto L_0x0133;
    L_0x012b:
        r11 = 0;
        r0 = r4 + r11;
        r11 = X.AnonymousClass1Ae.m9735D(r8, r7, r0);	 Catch:{ all -> 0x0390 }
    L_0x0133:
        r0 = 2;
        r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x014a;
    L_0x0139:
        if (r6 == 0) goto L_0x0143;
    L_0x013b:
        r0 = 4;
        r4 = r4 + r0;
        r24 = X.AnonymousClass1Ae.m9735D(r8, r7, r4);	 Catch:{ all -> 0x0390 }
        goto L_0x0151;
    L_0x0143:
        r4 = r4 + r26;
        r24 = X.AnonymousClass1Ae.m9733B(r8, r7, r4);	 Catch:{ all -> 0x0390 }
        goto L_0x0151;
    L_0x014a:
        r0 = (long) r14;	 Catch:{ all -> 0x0390 }
        r4 = r4 + r0;
        r16 = r16 + r28;
        goto L_0x0118;
    L_0x014f:
        r24 = 0;
    L_0x0151:
        r22 = 0;
        r0 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1));
        if (r0 == 0) goto L_0x03b4;
    L_0x0157:
        r18 = r24;
        r20 = 0;
        r5 = 0;
    L_0x015c:
        if (r6 == 0) goto L_0x0165;
    L_0x015e:
        r0 = r18 + r22;
        r16 = X.AnonymousClass1Ae.m9735D(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        goto L_0x016c;
    L_0x0165:
        r6 = 0;
        r0 = r18 + r22;
        r16 = X.AnonymousClass1Ae.m9733B(r8, r7, r0);	 Catch:{ all -> 0x0390 }
    L_0x016c:
        r1 = (r16 > r28 ? 1 : (r16 == r28 ? 0 : -1));
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r1 != 0) goto L_0x0180;
    L_0x0173:
        if (r5 == r0) goto L_0x0178;
    L_0x0175:
        r5 = r5 + 1;
        goto L_0x0197;
    L_0x0178:
        r1 = new X.08v;	 Catch:{ all -> 0x0390 }
        r0 = "malformed DT_NEEDED section";
        r1.<init>(r0);	 Catch:{ all -> 0x0390 }
    L_0x017f:
        throw r1;	 Catch:{ all -> 0x0390 }
    L_0x0180:
        r0 = 5;
        r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x0197;
    L_0x0186:
        if (r6 == 0) goto L_0x0191;
    L_0x0188:
        r11 = 4;
        r0 = r18 + r11;
        r20 = X.AnonymousClass1Ae.m9735D(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        goto L_0x0197;
    L_0x0191:
        r0 = r18 + r26;
        r20 = X.AnonymousClass1Ae.m9733B(r8, r7, r0);	 Catch:{ all -> 0x0390 }
    L_0x0197:
        r11 = 16;
        if (r6 == 0) goto L_0x019e;
    L_0x019b:
        r0 = 8;
        goto L_0x01a0;
    L_0x019e:
        r0 = 16;
    L_0x01a0:
        r18 = r18 + r0;
        r22 = 0;
        r0 = (r16 > r22 ? 1 : (r16 == r22 ? 0 : -1));
        if (r0 != 0) goto L_0x015c;
    L_0x01a8:
        r0 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1));
        if (r0 == 0) goto L_0x03ab;
    L_0x01ac:
        r4 = 0;
    L_0x01ad:
        r0 = (long) r4;	 Catch:{ all -> 0x0390 }
        r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1));
        if (r0 >= 0) goto L_0x020f;
    L_0x01b2:
        if (r6 == 0) goto L_0x01bb;
    L_0x01b4:
        r0 = r2 + r22;
        r0 = X.AnonymousClass1Ae.m9735D(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        goto L_0x01c1;
    L_0x01bb:
        r0 = r2 + r22;
        r0 = X.AnonymousClass1Ae.m9735D(r8, r7, r0);	 Catch:{ all -> 0x0390 }
    L_0x01c1:
        r0 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1));
        if (r0 != 0) goto L_0x0206;
    L_0x01c5:
        if (r6 == 0) goto L_0x01ce;
    L_0x01c7:
        r0 = r2 + r26;
        r18 = X.AnonymousClass1Ae.m9735D(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        goto L_0x01d4;
    L_0x01ce:
        r0 = r2 + r11;
        r18 = X.AnonymousClass1Ae.m9733B(r8, r7, r0);	 Catch:{ all -> 0x0390 }
    L_0x01d4:
        if (r6 == 0) goto L_0x01df;
    L_0x01d6:
        r11 = 20;
        r0 = r2 + r11;
        r11 = X.AnonymousClass1Ae.m9735D(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        goto L_0x01e7;
    L_0x01df:
        r11 = 40;
        r0 = r2 + r11;
        r11 = X.AnonymousClass1Ae.m9733B(r8, r7, r0);	 Catch:{ all -> 0x0390 }
    L_0x01e7:
        r0 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1));
        if (r0 > 0) goto L_0x0206;
    L_0x01eb:
        r11 = r11 + r18;
        r0 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1));
        if (r0 >= 0) goto L_0x0206;
    L_0x01f1:
        if (r6 == 0) goto L_0x01fb;
    L_0x01f3:
        r0 = 4;
        r2 = r2 + r0;
        r16 = X.AnonymousClass1Ae.m9735D(r8, r7, r2);	 Catch:{ all -> 0x0390 }
        goto L_0x0201;
    L_0x01fb:
        r2 = r2 + r26;
        r16 = X.AnonymousClass1Ae.m9733B(r8, r7, r2);	 Catch:{ all -> 0x0390 }
    L_0x0201:
        r20 = r20 - r18;
        r16 = r16 + r20;
        goto L_0x0211;
    L_0x0206:
        r0 = (long) r14;	 Catch:{ all -> 0x0390 }
        r2 = r2 + r0;
        r4 = r4 + 1;
        r11 = 16;
        r22 = 0;
        goto L_0x01ad;
    L_0x020f:
        r16 = 0;
    L_0x0211:
        r9 = 0;
        r0 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1));
        if (r0 == 0) goto L_0x03a2;
    L_0x0217:
        r3 = new java.lang.String[r5];	 Catch:{ all -> 0x0390 }
        r2 = 0;
    L_0x021a:
        if (r6 == 0) goto L_0x0223;
    L_0x021c:
        r0 = r24 + r9;
        r10 = X.AnonymousClass1Ae.m9735D(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        goto L_0x0229;
    L_0x0223:
        r0 = r24 + r9;
        r10 = X.AnonymousClass1Ae.m9733B(r8, r7, r0);	 Catch:{ all -> 0x0390 }
    L_0x0229:
        r0 = (r10 > r28 ? 1 : (r10 == r28 ? 0 : -1));
        if (r0 != 0) goto L_0x026b;
    L_0x022d:
        if (r6 == 0) goto L_0x0238;
    L_0x022f:
        r4 = 4;
        r0 = r24 + r4;
        r0 = X.AnonymousClass1Ae.m9735D(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        goto L_0x023e;
    L_0x0238:
        r0 = r24 + r26;
        r0 = X.AnonymousClass1Ae.m9733B(r8, r7, r0);	 Catch:{ all -> 0x0390 }
    L_0x023e:
        r0 = r0 + r16;
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0390 }
        r9.<init>();	 Catch:{ all -> 0x0390 }
    L_0x0245:
        r4 = 1;
        r4 = r4 + r0;
        r0 = X.AnonymousClass1Ae.m9736E(r8, r7, r0);	 Catch:{ all -> 0x0390 }
        if (r0 == 0) goto L_0x0254;
    L_0x024e:
        r0 = (char) r0;	 Catch:{ all -> 0x0390 }
        r9.append(r0);	 Catch:{ all -> 0x0390 }
        r0 = r4;
        goto L_0x0245;
    L_0x0254:
        r0 = r9.toString();	 Catch:{ all -> 0x0390 }
        r3[r2] = r0;	 Catch:{ all -> 0x0390 }
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r2 == r0) goto L_0x0262;
    L_0x025f:
        r2 = r2 + 1;
        goto L_0x026b;
    L_0x0262:
        r1 = new X.08v;	 Catch:{ all -> 0x0390 }
        r0 = "malformed DT_NEEDED section";
        r1.<init>(r0);	 Catch:{ all -> 0x0390 }
        goto L_0x017f;
    L_0x026b:
        if (r6 == 0) goto L_0x0270;
    L_0x026d:
        r0 = 8;
        goto L_0x0272;
    L_0x0270:
        r0 = 16;
    L_0x0272:
        r24 = r24 + r0;
        r0 = 0;
        r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x039e;
    L_0x027a:
        r0 = r3.length;	 Catch:{ all -> 0x0390 }
        if (r2 != r0) goto L_0x0395;
    L_0x027d:
        r30.close();	 Catch:{ all -> 0x0387 }
        r0 = X.AnonymousClass0CF.f1498B;
        if (r0 == 0) goto L_0x0287;
    L_0x0284:
        X.AnonymousClass0D9.m1104C();
    L_0x0287:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Loading lib dependencies: ";
        r1.append(r0);
        r0 = java.util.Arrays.toString(r3);
        r1.append(r0);
        r1.toString();
        r4 = 0;
    L_0x029c:
        r0 = r3.length;
        if (r4 >= r0) goto L_0x02b5;
    L_0x029f:
        r2 = r3[r4];
        r0 = "/";
        r0 = r2.startsWith(r0);
        if (r0 == 0) goto L_0x02aa;
    L_0x02a9:
        goto L_0x02b2;
    L_0x02aa:
        r1 = r13 | 1;
        r0 = 0;
        r5 = r32;
        X.AnonymousClass0CF.m858G(r2, r0, r0, r1, r5);
    L_0x02b2:
        r4 = r4 + 1;
        goto L_0x029c;
    L_0x02b5:
        goto L_0x02c6;
    L_0x02b6:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Not resolving dependencies for ";
        r1.append(r0);
        r1.append(r3);
        r1.toString();
    L_0x02c6:
        r3 = X.AnonymousClass0CF.f1505I;	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
        r5 = r15.getAbsolutePath();	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
        r0 = r3.f1773B;	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
        if (r0 == 0) goto L_0x0373;
    L_0x02d0:
        r0 = 4;
        r13 = r13 & r0;
        r10 = 1;
        r9 = 0;
        if (r13 != r0) goto L_0x02d8;
    L_0x02d6:
        r0 = 1;
        goto L_0x02d9;
    L_0x02d8:
        r0 = 0;
    L_0x02d9:
        if (r0 == 0) goto L_0x02de;
    L_0x02db:
        r4 = r3.f1774C;	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
        goto L_0x02e0;
    L_0x02de:
        r4 = r3.f1775D;	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
    L_0x02e0:
        r2 = 0;
        r7 = r3.f1777F;	 Catch:{ IllegalAccessException -> 0x032d, IllegalAccessException -> 0x032d, IllegalAccessException -> 0x032d }
        monitor-enter(r7);	 Catch:{ IllegalAccessException -> 0x032d, IllegalAccessException -> 0x032d, IllegalAccessException -> 0x032d }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0328 }
        r0 = 27;
        r8 = 2;
        if (r1 > r0) goto L_0x0305;
    L_0x02eb:
        r6 = r3.f1776E;	 Catch:{ all -> 0x0328 }
        r3 = r3.f1777F;	 Catch:{ all -> 0x0328 }
        r0 = 3;
        r1 = new java.lang.Object[r0];	 Catch:{ all -> 0x0328 }
        r1[r9] = r5;	 Catch:{ all -> 0x0328 }
        r0 = X.AnonymousClass0CF.class;
        r0 = r0.getClassLoader();	 Catch:{ all -> 0x0328 }
        r1[r10] = r0;	 Catch:{ all -> 0x0328 }
        r1[r8] = r4;	 Catch:{ all -> 0x0328 }
        r1 = r6.invoke(r3, r1);	 Catch:{ all -> 0x0328 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0328 }
        goto L_0x031b;
    L_0x0305:
        r6 = r3.f1776E;	 Catch:{ all -> 0x0328 }
        r3 = r3.f1777F;	 Catch:{ all -> 0x0328 }
        r1 = new java.lang.Object[r8];	 Catch:{ all -> 0x0328 }
        r1[r9] = r5;	 Catch:{ all -> 0x0328 }
        r0 = X.AnonymousClass0CF.class;
        r0 = r0.getClassLoader();	 Catch:{ all -> 0x0328 }
        r1[r10] = r0;	 Catch:{ all -> 0x0328 }
        r1 = r6.invoke(r3, r1);	 Catch:{ all -> 0x0328 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0328 }
    L_0x031b:
        if (r1 != 0) goto L_0x0322;
    L_0x031d:
        monitor-exit(r7);	 Catch:{ all -> 0x031f }
        goto L_0x0376;
    L_0x031f:
        r0 = move-exception;
        r2 = r1;
        goto L_0x0329;
    L_0x0322:
        r0 = new java.lang.UnsatisfiedLinkError;	 Catch:{ all -> 0x031f }
        r0.<init>(r1);	 Catch:{ all -> 0x031f }
        throw r0;	 Catch:{ all -> 0x031f }
    L_0x0328:
        r0 = move-exception;
    L_0x0329:
        monitor-exit(r7);	 Catch:{ all -> 0x0328 }
        throw r0;	 Catch:{ IllegalAccessException -> 0x032d, IllegalAccessException -> 0x032d, IllegalAccessException -> 0x032d }
    L_0x032b:
        r3 = move-exception;
        goto L_0x0346;
    L_0x032d:
        r3 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x032b }
        r1.<init>();	 Catch:{ all -> 0x032b }
        r0 = "Error: Cannot load ";
        r1.append(r0);	 Catch:{ all -> 0x032b }
        r1.append(r5);	 Catch:{ all -> 0x032b }
        r2 = r1.toString();	 Catch:{ all -> 0x032b }
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0345 }
        r0.<init>(r2, r3);	 Catch:{ all -> 0x0345 }
        throw r0;	 Catch:{ all -> 0x0345 }
    L_0x0345:
        r3 = move-exception;
    L_0x0346:
        if (r2 == 0) goto L_0x0372;
    L_0x0348:
        r1 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
        r1.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
        r0 = "Error when loading lib: ";
        r1.append(r0);	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
        r1.append(r2);	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
        r0 = " lib hash: ";
        r1.append(r0);	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
        r0 = X.AnonymousClass0Cr.m1056B(r5);	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
        r1.append(r0);	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
        r0 = " search path is ";
        r1.append(r0);	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
        r1.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
        r1 = r1.toString();	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
        r0 = "SoLoader";
        android.util.Log.e(r0, r1);	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
    L_0x0372:
        throw r3;	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
    L_0x0373:
        java.lang.System.load(r5);	 Catch:{ UnsatisfiedLinkError -> 0x0377 }
    L_0x0376:
        return r31;
    L_0x0377:
        r2 = move-exception;
        r1 = r2.getMessage();
        r0 = "bad ELF magic";
        r0 = r1.contains(r0);
        if (r0 == 0) goto L_0x0386;
    L_0x0384:
        r0 = 3;
        return r0;
    L_0x0386:
        throw r2;
    L_0x0387:
        r1 = move-exception;
        r0 = X.AnonymousClass0CF.f1498B;
        if (r0 == 0) goto L_0x038f;
    L_0x038c:
        X.AnonymousClass0D9.m1104C();
    L_0x038f:
        throw r1;
    L_0x0390:
        r0 = move-exception;
        r30.close();	 Catch:{ all -> 0x0387 }
        throw r0;	 Catch:{ all -> 0x0387 }
    L_0x0395:
        r1 = new X.08v;	 Catch:{ all -> 0x0390 }
        r0 = "malformed DT_NEEDED section";
        r1.<init>(r0);	 Catch:{ all -> 0x0390 }
        goto L_0x017f;
    L_0x039e:
        r9 = 0;
        goto L_0x021a;
    L_0x03a2:
        r1 = new X.08v;	 Catch:{ all -> 0x0390 }
        r0 = "did not find file offset of DT_STRTAB table";
        r1.<init>(r0);	 Catch:{ all -> 0x0390 }
        goto L_0x017f;
    L_0x03ab:
        r1 = new X.08v;	 Catch:{ all -> 0x0390 }
        r0 = "Dynamic section string-table not found";
        r1.<init>(r0);	 Catch:{ all -> 0x0390 }
        goto L_0x017f;
    L_0x03b4:
        r1 = new X.08v;	 Catch:{ all -> 0x0390 }
        r0 = "ELF file does not contain dynamic linking information";
        r1.<init>(r0);	 Catch:{ all -> 0x0390 }
        goto L_0x017f;
    L_0x03bd:
        r1 = new X.08v;	 Catch:{ all -> 0x0390 }
        r0 = "file is not ELF";
        r1.<init>(r0);	 Catch:{ all -> 0x0390 }
        goto L_0x017f;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Cs.E(java.lang.String, int, java.io.File, android.os.StrictMode$ThreadPolicy):int");
    }

    public java.lang.String toString() {
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
        r3 = this;
        r0 = r3.f1779C;	 Catch:{ IOException -> 0x000b }
        r0 = r0.getCanonicalPath();	 Catch:{ IOException -> 0x000b }
        r2 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x000b }
        goto L_0x0011;	 Catch:{ IOException -> 0x000b }
    L_0x000b:
        r0 = r3.f1779C;
        r2 = r0.getName();
    L_0x0011:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r3.getClass();
        r0 = r0.getName();
        r1.append(r0);
        r0 = "[root = ";
        r1.append(r0);
        r1.append(r2);
        r0 = " flags = ";
        r1.append(r0);
        r0 = r3.f1778B;
        r1.append(r0);
        r0 = 93;
        r1.append(r0);
        r0 = r1.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Cs.toString():java.lang.String");
    }
}
