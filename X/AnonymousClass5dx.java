package X;

import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.5dx */
public final class AnonymousClass5dx {
    /* renamed from: i */
    private static final AnonymousClass5eV f67678i = new AnonymousClass6C9();
    /* renamed from: j */
    private static final AnonymousClass5eV f67679j = new AnonymousClass6CA();
    /* renamed from: k */
    private static final Comparator f67680k = new AnonymousClass5dv();
    /* renamed from: B */
    public boolean f67681B;
    /* renamed from: C */
    public final AnonymousClass6DA f67682C;
    /* renamed from: D */
    public final AnonymousClass5eL f67683D;
    /* renamed from: E */
    public final AnonymousClass5dz f67684E;
    /* renamed from: F */
    public boolean f67685F;
    /* renamed from: G */
    public boolean f67686G;
    /* renamed from: H */
    public int f67687H;
    /* renamed from: I */
    public int f67688I;
    /* renamed from: J */
    public String f67689J;
    /* renamed from: K */
    public final AnonymousClass5eP f67690K;
    /* renamed from: L */
    public long f67691L = -1;
    /* renamed from: M */
    public Queue f67692M;
    /* renamed from: N */
    public Set f67693N;
    /* renamed from: O */
    private int f67694O;
    /* renamed from: P */
    private List f67695P;
    /* renamed from: Q */
    private String f67696Q;
    /* renamed from: R */
    private AnonymousClass6HC f67697R = null;
    /* renamed from: S */
    private final AnonymousClass5e4 f67698S;
    /* renamed from: T */
    private final Context f67699T;
    /* renamed from: U */
    private final AnonymousClass6DF f67700U;
    /* renamed from: V */
    private final AnonymousClass5e0 f67701V;
    /* renamed from: W */
    private int f67702W;
    /* renamed from: X */
    private AnonymousClass6HE f67703X = null;
    /* renamed from: Y */
    private int f67704Y;
    /* renamed from: Z */
    private AnonymousClass6HD f67705Z = null;
    /* renamed from: a */
    private final AnonymousClass5eS f67706a;
    /* renamed from: b */
    private final TelephonyManager f67707b;
    /* renamed from: c */
    private int f67708c;
    /* renamed from: d */
    private int f67709d;
    /* renamed from: e */
    private int f67710e;
    /* renamed from: f */
    private int f67711f;
    /* renamed from: g */
    private int f67712g;
    /* renamed from: h */
    private int f67713h;

    public AnonymousClass5dx(AnonymousClass5e0 anonymousClass5e0, Context context, AnonymousClass6DA anonymousClass6DA, AnonymousClass5dz anonymousClass5dz, AnonymousClass6DF anonymousClass6DF, AnonymousClass5eN anonymousClass5eN, AnonymousClass5eL anonymousClass5eL) {
        this.f67701V = anonymousClass5e0;
        this.f67699T = context;
        this.f67682C = anonymousClass6DA;
        this.f67684E = anonymousClass5dz;
        this.f67700U = anonymousClass6DF;
        this.f67683D = anonymousClass5eL;
        this.f67707b = (TelephonyManager) this.f67699T.getSystemService("phone");
        this.f67698S = new AnonymousClass5e4(this.f67699T, this.f67683D);
        if (anonymousClass5eN == null) {
            anonymousClass5eN = new AnonymousClass6CG(this.f67699T);
        }
        this.f67690K = new AnonymousClass5eP(anonymousClass5eN);
        this.f67706a = new AnonymousClass5eS(anonymousClass5eN, this.f67683D);
    }

    /* renamed from: A */
    public final boolean m28172A(java.lang.String r15, boolean r16) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r14 = this;
        r2 = 1;
        r4 = r14;
        r14.f67686G = r2;
        r0 = java.lang.System.currentTimeMillis();
        r14.f67691L = r0;
        r5 = r16;
        r14.f67685F = r5;
        r14.f67696Q = r15;
        r0 = 0;
        r14.f67689J = r0;
        r3 = new android.os.Bundle;
        r3.<init>();
        r1 = "source";
        r0 = r15.toString();
        r3.putString(r1, r0);
        r0 = "full_upload";
        r3.putBoolean(r0, r5);
        r0 = r14.f67683D;
        r0 = r0.f67778C;
        r1 = r0.iterator();
    L_0x002e:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x003e;
    L_0x0034:
        r0 = r1.next();
        r0 = (X.AnonymousClass5eM) r0;
        r0.Yu(r3);
        goto L_0x002e;
    L_0x003e:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r14.f67695P = r0;
        r0 = r14.f67698S;
        r0 = r0.m28179A();
        r14.f67697R = r0;
        r0 = r14.f67706a;
        r0 = r0.m28183A();
        r14.f67705Z = r0;
        r0 = r14.f67685F;
        if (r0 == 0) goto L_0x0060;
    L_0x0059:
        r0 = r14.f67690K;
        r0 = r0.f67780B;
        r0.XE();
    L_0x0060:
        r0 = r14.f67697R;
        r3 = 0;
        if (r0 == 0) goto L_0x01d6;
    L_0x0065:
        r0 = r14.f67705Z;
        if (r0 != 0) goto L_0x006b;
    L_0x0069:
        goto L_0x01d6;
    L_0x006b:
        r14.f67694O = r3;
        r14.f67704Y = r3;
        r14.f67713h = r3;
        r14.f67708c = r3;
        r14.f67710e = r3;
        r14.f67711f = r3;
        r14.f67709d = r3;
        r14.f67712g = r3;
        r14.f67702W = r3;
        r14.f67687H = r3;
        r0 = r14.f67684E;
        r0 = r0.f67736H;
        r14.f67688I = r0;
        r1 = new X.5eX;
        r1.<init>();
        r0 = f67678i;
        r1.f67798C = r0;
        r0 = f67679j;
        r1.f67801F = r0;
        r0 = f67680k;
        r1.f67799D = r0;
        r0 = r14.f67697R;
        r1.f67797B = r0;
        r0 = r14.f67705Z;
        r1.f67800E = r0;
        r5 = new X.6HE;
        r6 = r1.f67799D;
        r7 = r1.f67797B;
        r8 = r1.f67800E;
        r9 = r1.f67798C;
        r10 = r1.f67801F;
        r5.<init>(r6, r7, r8, r9, r10);
        r14.f67703X = r5;
        r1 = r14.f67682C;
        r0 = "";
        r0 = r1.m29484A(r0);
        r8 = new X.5eJ;
        r8.<init>();
        r8.f67776B = r0;
        r0 = r14.f67701V;
        r0.m28174A();
        r0 = r14.f67701V;
        r0.m28175B();
        r0 = r14.f67707b;
        r0.getSimCountryIso();
        r0 = r14.f67707b;
        r0.getNetworkCountryIso();
        r7 = new java.util.ArrayList;
        r7.<init>();
        r9 = new java.util.ArrayList;
        r9.<init>();
        r0 = r14.f67685F;
        if (r0 == 0) goto L_0x0132;
    L_0x00e0:
        r0 = r14.f67684E;	 Catch:{ Exception -> 0x0114 }
        r6 = r0.f67730B;	 Catch:{ Exception -> 0x0114 }
        r5 = 0;	 Catch:{ Exception -> 0x0114 }
    L_0x00e5:
        r0 = r14.f67703X;	 Catch:{ Exception -> 0x0114 }
        r0 = r0.hasNext();	 Catch:{ Exception -> 0x0114 }
        if (r0 == 0) goto L_0x00ff;	 Catch:{ Exception -> 0x0114 }
    L_0x00ed:
        r1 = r5 + 1;	 Catch:{ Exception -> 0x0114 }
        if (r5 >= r6) goto L_0x00fe;	 Catch:{ Exception -> 0x0114 }
    L_0x00f1:
        r0 = r14.f67703X;	 Catch:{ Exception -> 0x0114 }
        r0 = r0.next();	 Catch:{ Exception -> 0x0114 }
        r0 = (X.AnonymousClass5eU) r0;	 Catch:{ Exception -> 0x0114 }
        X.AnonymousClass5dx.m28171H(r14, r0, r7, r9);	 Catch:{ Exception -> 0x0114 }
        r5 = r1;	 Catch:{ Exception -> 0x0114 }
        goto L_0x00e5;	 Catch:{ Exception -> 0x0114 }
    L_0x00fe:
        r5 = r1;	 Catch:{ Exception -> 0x0114 }
    L_0x00ff:
        r0 = java.util.Collections.unmodifiableList(r7);	 Catch:{ Exception -> 0x0114 }
        X.AnonymousClass5e3.m28176B(r0);	 Catch:{ Exception -> 0x0114 }
        java.lang.Boolean.valueOf(r2);	 Catch:{ Exception -> 0x0114 }
        java.lang.Boolean.valueOf(r2);	 Catch:{ Exception -> 0x0114 }
        r0 = r14.f67694O;	 Catch:{ Exception -> 0x0114 }
        r14.f67708c = r0;	 Catch:{ Exception -> 0x0114 }
        r14.f67694O = r3;	 Catch:{ Exception -> 0x0114 }
        r3 = r5;	 Catch:{ Exception -> 0x0114 }
        goto L_0x0132;	 Catch:{ Exception -> 0x0114 }
    L_0x0114:
        r0 = r14.f67697R;
        r0.close();
        r0 = r14.f67705Z;
        r0.close();
        r14.f67686G = r3;
        r2 = new android.os.Bundle;
        r2.<init>();
        r1 = "failure_reason";
        r0 = "create_session_process_data_fail";
        r2.putString(r1, r0);
        r0 = r14.f67683D;
        r0.m28181B(r2);
        return r3;
    L_0x0132:
        r7 = new android.os.Bundle;
        r7.<init>();
        r1 = "full_upload";
        r0 = r14.f67685F;
        r7.putBoolean(r1, r0);
        r1 = "source";
        r0 = r14.f67696Q;
        r0 = r0.toString();
        r7.putString(r1, r0);
        r1 = "batch_size";
        r0 = r14.f67684E;
        r0 = r0.f67730B;
        r7.putInt(r1, r0);
        r1 = "num_of_retries";
        r0 = r14.f67688I;
        r7.putInt(r1, r0);
        r1 = "contacts_upload_count";
        r0 = r14.f67708c;
        r7.putInt(r1, r0);
        r10 = "time_spent";
        r5 = java.lang.System.currentTimeMillis();
        r0 = r14.f67691L;
        r5 = r5 - r0;
        r7.putLong(r10, r5);
        r13 = "phonebook_size";
        r14 = r14.f67697R;
        r0 = r14.f73949B;
        r12 = r0.getPosition();
        r1 = r14.f73949B;
        r0 = -1;
        r1.moveToPosition(r0);
        r1 = r14.f73949B;
        r0 = "deleted";
        r11 = r1.getColumnIndexOrThrow(r0);
        r1 = r14.f73949B;
        r0 = "contact_id";
        r10 = r1.getColumnIndexOrThrow(r0);
        r15 = -1;
        r1 = 0;
    L_0x018f:
        r0 = r14.f73949B;
        r0 = r0.moveToNext();
        if (r0 == 0) goto L_0x01ae;
    L_0x0197:
        r0 = r14.f73949B;
        r0 = r0.getInt(r11);
        if (r0 == 0) goto L_0x01a0;
    L_0x019f:
        goto L_0x018f;
    L_0x01a0:
        r0 = r14.f73949B;
        r5 = r0.getLong(r10);
        r0 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1));
        if (r0 == 0) goto L_0x018f;
    L_0x01aa:
        r1 = r1 + 1;
        r15 = r5;
        goto L_0x018f;
    L_0x01ae:
        r0 = r14.f73949B;
        r0.moveToPosition(r12);
        r7.putInt(r13, r1);
        r0 = r4.f67683D;
        r0 = r0.f67778C;
        r1 = r0.iterator();
    L_0x01be:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x01ce;
    L_0x01c4:
        r0 = r1.next();
        r0 = (X.AnonymousClass5eM) r0;
        r0.RBA(r7);
        goto L_0x01be;
    L_0x01ce:
        r0 = java.util.Collections.unmodifiableList(r9);
        X.AnonymousClass5dx.m28167D(r4, r8, r0, r3);
        return r2;
    L_0x01d6:
        r14.f67686G = r3;
        r2 = new android.os.Bundle;
        r2.<init>();
        r1 = "failure_reason";
        r0 = "create_session_get_iterator_fail";
        r2.putString(r1, r0);
        r0 = r14.f67683D;
        r0.m28181B(r2);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5dx.A(java.lang.String, boolean):boolean");
    }

    /* renamed from: B */
    public static void m28165B(AnonymousClass5dx anonymousClass5dx, AnonymousClass5dw anonymousClass5dw, Boolean bool) {
        anonymousClass5dx.f67693N.remove(Integer.valueOf(anonymousClass5dw.f67671C));
        if (anonymousClass5dx.f67693N.size() >= anonymousClass5dx.f67684E.f67734F || anonymousClass5dx.f67692M.isEmpty()) {
            Object obj = (anonymousClass5dx.f67681B && anonymousClass5dx.f67693N.isEmpty() && anonymousClass5dx.f67692M.isEmpty()) ? 1 : null;
            if (obj != null) {
                anonymousClass5dx.m28170G(bool);
                return;
            }
            return;
        }
        AnonymousClass5dw anonymousClass5dw2 = (AnonymousClass5dw) anonymousClass5dx.f67692M.poll();
        anonymousClass5dx.f67693N.add(Integer.valueOf(anonymousClass5dw2.f67671C));
        AnonymousClass5dx.m28169F(anonymousClass5dx, anonymousClass5dw2);
    }

    /* renamed from: C */
    public static Bundle m28166C(AnonymousClass5dx anonymousClass5dx, Bundle bundle) {
        bundle.putBoolean("full_upload", anonymousClass5dx.f67685F);
        bundle.putLong("last_upload_success_time", anonymousClass5dx.f67682C.m29485B(0));
        bundle.putLong("time_spent", System.currentTimeMillis() - anonymousClass5dx.f67691L);
        bundle.putString("ccu_session_id", anonymousClass5dx.f67689J);
        bundle.putString("source", anonymousClass5dx.f67696Q.toString());
        return bundle;
    }

    /* renamed from: D */
    public static void m28167D(AnonymousClass5dx anonymousClass5dx, AnonymousClass5eJ anonymousClass5eJ, List list, int i) {
        AnonymousClass6DF anonymousClass6DF = anonymousClass5dx.f67700U;
        AnonymousClass5du anonymousClass6CB = new AnonymousClass6CB(anonymousClass5dx, list, i, anonymousClass5eJ);
        list = anonymousClass6DF.f73002B;
        anonymousClass5dx = anonymousClass6DF.f73003C;
        anonymousClass5eJ = anonymousClass5eJ.f67776B;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass5dx);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "address_book/get_contact_hashes/";
        AnonymousClass0Pt M = anonymousClass0Pt.D("device_id", AnonymousClass0Dt.f1941C.A(list)).D("address_book_hash", anonymousClass5eJ).M(AnonymousClass5hS.class);
        if (((Boolean) AnonymousClass0CC.xJ.H(anonymousClass5dx)).booleanValue()) {
            M.J();
        }
        AnonymousClass0GA H = M.H();
        H.f2849B = new AnonymousClass5hU(anonymousClass6DF, anonymousClass6DF.f73003C, anonymousClass6CB);
        AnonymousClass0Ix.D(H);
    }

    /* renamed from: E */
    public static void m28168E(X.AnonymousClass5dx r16) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = new java.util.HashSet;
        r0 = r16;
        r1 = r0.f67684E;
        r1 = r1.f67734F;
        r2.<init>(r1);
        r1 = java.util.Collections.synchronizedSet(r2);
        r0.f67693N = r1;
        r1 = new java.util.concurrent.ConcurrentLinkedQueue;
        r1.<init>();
        r0.f67692M = r1;
        r1 = 0;
        r0.f67681B = r1;
        r7 = new java.util.ArrayList;	 Catch:{ all -> 0x012f }
        r7.<init>();	 Catch:{ all -> 0x012f }
        r6 = new java.util.ArrayList;	 Catch:{ all -> 0x012f }
        r6.<init>();	 Catch:{ all -> 0x012f }
        r2 = r0.f67684E;	 Catch:{ all -> 0x012f }
        r5 = r2.f67730B;	 Catch:{ all -> 0x012f }
        r4 = 0;	 Catch:{ all -> 0x012f }
        r9 = 0;	 Catch:{ all -> 0x012f }
    L_0x002b:
        r2 = r0.f67703X;	 Catch:{ IllegalStateException -> 0x00a5, IllegalStateException -> 0x00a5 }
        r2 = r2.hasNext();	 Catch:{ IllegalStateException -> 0x00a5, IllegalStateException -> 0x00a5 }
        if (r2 != 0) goto L_0x0034;	 Catch:{ IllegalStateException -> 0x00a5, IllegalStateException -> 0x00a5 }
    L_0x0033:
        goto L_0x00a5;	 Catch:{ IllegalStateException -> 0x00a5, IllegalStateException -> 0x00a5 }
    L_0x0034:
        r2 = r0.f67703X;	 Catch:{ all -> 0x012f }
        r2 = r2.next();	 Catch:{ all -> 0x012f }
        r2 = (X.AnonymousClass5eU) r2;	 Catch:{ all -> 0x012f }
        r2 = X.AnonymousClass5dx.m28171H(r0, r2, r7, r6);	 Catch:{ all -> 0x012f }
        if (r2 != 0) goto L_0x0043;	 Catch:{ all -> 0x012f }
    L_0x0042:
        goto L_0x002b;	 Catch:{ all -> 0x012f }
    L_0x0043:
        r4 = r4 + 1;	 Catch:{ all -> 0x012f }
        if (r4 < r5) goto L_0x002b;	 Catch:{ all -> 0x012f }
    L_0x0047:
        r8 = new X.5dw;	 Catch:{ all -> 0x012f }
        r10 = java.util.Collections.unmodifiableList(r7);	 Catch:{ all -> 0x012f }
        r11 = java.util.Collections.unmodifiableList(r6);	 Catch:{ all -> 0x012f }
        r12 = r0.f67694O;	 Catch:{ all -> 0x012f }
        r13 = r0.f67713h;	 Catch:{ all -> 0x012f }
        r14 = r0.f67704Y;	 Catch:{ all -> 0x012f }
        r15 = r0.f67687H;	 Catch:{ all -> 0x012f }
        r16 = 0;	 Catch:{ all -> 0x012f }
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16);	 Catch:{ all -> 0x012f }
        r2 = r0.f67693N;	 Catch:{ all -> 0x012f }
        r3 = r2.size();	 Catch:{ all -> 0x012f }
        r2 = r0.f67684E;	 Catch:{ all -> 0x012f }
        r2 = r2.f67734F;	 Catch:{ all -> 0x012f }
        if (r3 >= r2) goto L_0x0077;	 Catch:{ all -> 0x012f }
    L_0x006a:
        r3 = r0.f67693N;	 Catch:{ all -> 0x012f }
        r2 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x012f }
        r3.add(r2);	 Catch:{ all -> 0x012f }
        X.AnonymousClass5dx.m28169F(r0, r8);	 Catch:{ all -> 0x012f }
        goto L_0x007c;	 Catch:{ all -> 0x012f }
    L_0x0077:
        r2 = r0.f67692M;	 Catch:{ all -> 0x012f }
        r2.add(r8);	 Catch:{ all -> 0x012f }
    L_0x007c:
        r9 = r9 + 1;	 Catch:{ all -> 0x012f }
        r7 = new java.util.ArrayList;	 Catch:{ all -> 0x012f }
        r7.<init>();	 Catch:{ all -> 0x012f }
        r6 = new java.util.ArrayList;	 Catch:{ all -> 0x012f }
        r6.<init>();	 Catch:{ all -> 0x012f }
        r3 = r0.f67708c;	 Catch:{ all -> 0x012f }
        r2 = r0.f67694O;	 Catch:{ all -> 0x012f }
        r3 = r3 + r2;	 Catch:{ all -> 0x012f }
        r0.f67708c = r3;	 Catch:{ all -> 0x012f }
        r0.f67694O = r1;	 Catch:{ all -> 0x012f }
        r3 = r0.f67710e;	 Catch:{ all -> 0x012f }
        r2 = r0.f67704Y;	 Catch:{ all -> 0x012f }
        r3 = r3 + r2;	 Catch:{ all -> 0x012f }
        r0.f67710e = r3;	 Catch:{ all -> 0x012f }
        r0.f67704Y = r1;	 Catch:{ all -> 0x012f }
        r3 = r0.f67711f;	 Catch:{ all -> 0x012f }
        r2 = r0.f67713h;	 Catch:{ all -> 0x012f }
        r3 = r3 + r2;	 Catch:{ all -> 0x012f }
        r0.f67711f = r3;	 Catch:{ all -> 0x012f }
        r0.f67713h = r1;	 Catch:{ all -> 0x012f }
        r4 = 0;	 Catch:{ all -> 0x012f }
        goto L_0x002b;	 Catch:{ all -> 0x012f }
    L_0x00a5:
        if (r4 <= 0) goto L_0x00f6;
    L_0x00a7:
        r8 = new X.5dw;	 Catch:{ all -> 0x012f }
        r10 = java.util.Collections.unmodifiableList(r7);	 Catch:{ all -> 0x012f }
        r11 = java.util.Collections.unmodifiableList(r6);	 Catch:{ all -> 0x012f }
        r12 = r0.f67694O;	 Catch:{ all -> 0x012f }
        r13 = r0.f67713h;	 Catch:{ all -> 0x012f }
        r14 = r0.f67704Y;	 Catch:{ all -> 0x012f }
        r15 = r0.f67687H;	 Catch:{ all -> 0x012f }
        r16 = 0;	 Catch:{ all -> 0x012f }
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16);	 Catch:{ all -> 0x012f }
        r2 = r0.f67693N;	 Catch:{ all -> 0x012f }
        r3 = r2.size();	 Catch:{ all -> 0x012f }
        r2 = r0.f67684E;	 Catch:{ all -> 0x012f }
        r2 = r2.f67734F;	 Catch:{ all -> 0x012f }
        if (r3 >= r2) goto L_0x00d7;	 Catch:{ all -> 0x012f }
    L_0x00ca:
        r3 = r0.f67693N;	 Catch:{ all -> 0x012f }
        r2 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x012f }
        r3.add(r2);	 Catch:{ all -> 0x012f }
        X.AnonymousClass5dx.m28169F(r0, r8);	 Catch:{ all -> 0x012f }
        goto L_0x00dc;	 Catch:{ all -> 0x012f }
    L_0x00d7:
        r2 = r0.f67692M;	 Catch:{ all -> 0x012f }
        r2.add(r8);	 Catch:{ all -> 0x012f }
    L_0x00dc:
        r3 = r0.f67708c;	 Catch:{ all -> 0x012f }
        r2 = r0.f67694O;	 Catch:{ all -> 0x012f }
        r3 = r3 + r2;	 Catch:{ all -> 0x012f }
        r0.f67708c = r3;	 Catch:{ all -> 0x012f }
        r3 = r0.f67710e;	 Catch:{ all -> 0x012f }
        r2 = r0.f67704Y;	 Catch:{ all -> 0x012f }
        r3 = r3 + r2;	 Catch:{ all -> 0x012f }
        r0.f67710e = r3;	 Catch:{ all -> 0x012f }
        r3 = r0.f67711f;	 Catch:{ all -> 0x012f }
        r2 = r0.f67713h;	 Catch:{ all -> 0x012f }
        r3 = r3 + r2;	 Catch:{ all -> 0x012f }
        r0.f67711f = r3;	 Catch:{ all -> 0x012f }
        r2 = r9 + 1;	 Catch:{ all -> 0x012f }
        r0.f67709d = r2;	 Catch:{ all -> 0x012f }
        goto L_0x00f8;	 Catch:{ all -> 0x012f }
    L_0x00f6:
        r0.f67709d = r9;	 Catch:{ all -> 0x012f }
    L_0x00f8:
        r2 = 1;	 Catch:{ all -> 0x012f }
        r0.f67681B = r2;	 Catch:{ all -> 0x012f }
        r3 = r0.f67708c;	 Catch:{ all -> 0x012f }
        r2 = r0.f67710e;	 Catch:{ all -> 0x012f }
        r3 = r3 + r2;	 Catch:{ all -> 0x012f }
        r2 = r0.f67711f;	 Catch:{ all -> 0x012f }
        r3 = r3 + r2;	 Catch:{ all -> 0x012f }
        r0.f67712g = r3;	 Catch:{ all -> 0x012f }
        r5 = r0.f67682C;	 Catch:{ all -> 0x012f }
        r3 = r0.f67695P;	 Catch:{ all -> 0x012f }
        java.util.Collections.sort(r3);	 Catch:{ all -> 0x012f }
        r2 = ":";	 Catch:{ all -> 0x012f }
        r2 = android.text.TextUtils.join(r2, r3);	 Catch:{ all -> 0x012f }
        r2 = X.AnonymousClass5eT.m28184B(r2);	 Catch:{ all -> 0x012f }
        r5.m29486C(r2);	 Catch:{ all -> 0x012f }
        if (r4 != 0) goto L_0x0124;	 Catch:{ all -> 0x012f }
    L_0x011b:
        if (r9 != 0) goto L_0x0124;	 Catch:{ all -> 0x012f }
    L_0x011d:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ all -> 0x012f }
        r0.m28170G(r1);	 Catch:{ all -> 0x012f }
    L_0x0124:
        r1 = r0.f67697R;
        r1.close();
        r0 = r0.f67705Z;
        r0.close();
        return;
    L_0x012f:
        r2 = move-exception;
        r1 = r0.f67697R;
        r1.close();
        r0 = r0.f67705Z;
        r0.close();
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5dx.E(X.5dx):void");
    }

    /* renamed from: F */
    public static void m28169F(AnonymousClass5dx anonymousClass5dx, AnonymousClass5dw anonymousClass5dw) {
        AnonymousClass5eH anonymousClass5eH = new AnonymousClass5eH();
        Integer.valueOf(anonymousClass5dw.f67671C);
        anonymousClass5eH.f67774B = AnonymousClass5e3.m28176B(anonymousClass5dw.f67672D);
        String str = anonymousClass5dx.f67689J;
        if (str != null) {
            anonymousClass5eH.f67775C = str;
        } else {
            anonymousClass5dx.f67682C.m29484A(JsonProperty.USE_DEFAULT_NAME);
            anonymousClass5dx.f67701V.m28174A();
            anonymousClass5dx.f67701V.m28175B();
            anonymousClass5dx.f67707b.getSimCountryIso();
            anonymousClass5dx.f67707b.getNetworkCountryIso();
        }
        int i = anonymousClass5dw.f67670B;
        int i2 = anonymousClass5dw.f67677I;
        int i3 = anonymousClass5dw.f67675G;
        int i4 = (i + i2) + i3;
        Bundle bundle = new Bundle();
        bundle.putBoolean("full_upload", anonymousClass5dx.f67685F);
        bundle.putInt("batch_index", anonymousClass5dw.f67671C);
        bundle.putInt("batch_size", anonymousClass5dx.f67684E.f67730B);
        bundle.putInt("contacts_upload_count", i4);
        bundle.putInt("add_count", i);
        bundle.putInt("remove_count", i3);
        bundle.putInt("update_count", i2);
        bundle.putInt("processed_contact_count", anonymousClass5dw.f67674F);
        bundle.putLong("time_spent", System.currentTimeMillis() - anonymousClass5dx.f67691L);
        bundle.putInt("num_of_retries", anonymousClass5dw.f67673E ^ 1);
        bundle.putString("ccu_session_id", anonymousClass5dx.f67689J);
        for (AnonymousClass5eM Wu : anonymousClass5dx.f67683D.f67778C) {
            Wu.Wu(bundle);
        }
        AnonymousClass6DF anonymousClass6DF = anonymousClass5dx.f67700U;
        AnonymousClass5du anonymousClass6CC = new AnonymousClass6CC(anonymousClass5dx, anonymousClass5dw, bundle);
        anonymousClass5dx = new ArrayList();
        for (AnonymousClass5eG anonymousClass5hO : anonymousClass5eH.f67774B) {
            anonymousClass5dx.add(new AnonymousClass5hO(anonymousClass5hO));
        }
        Context context = anonymousClass6DF.f73002B;
        Object obj = anonymousClass6DF.f73003C;
        String str2 = anonymousClass5eH.f67775C;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(obj);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "address_book/merge_delta/";
        AnonymousClass0Pt M = anonymousClass0Pt.D("device_id", AnonymousClass0Dt.f1941C.A(context)).D("session_id", str2).D("contacts", AnonymousClass5hQ.m28282B(anonymousClass5dx)).M(AnonymousClass5hX.class);
        if (((Boolean) AnonymousClass0CC.xJ.H(obj)).booleanValue()) {
            M.J();
        }
        AnonymousClass0GA H = M.H();
        H.f2849B = new AnonymousClass5hV(anonymousClass6DF, anonymousClass6DF.f73003C, anonymousClass6CC);
        AnonymousClass0Ix.D(H);
    }

    /* renamed from: G */
    private void m28170G(Boolean bool) {
        this.f67682C.m29484A(JsonProperty.USE_DEFAULT_NAME);
        Bundle bundle = new Bundle();
        bundle.putBoolean("full_upload", this.f67685F);
        bundle.putInt("total_batch_count", this.f67709d);
        bundle.putInt("contacts_upload_count", this.f67712g);
        bundle.putInt("add_count", this.f67708c);
        bundle.putInt("remove_count", this.f67710e);
        bundle.putInt("update_count", this.f67711f);
        bundle.putInt("phonebook_size", this.f67702W);
        bundle.putLong("max_contacts_to_upload", (long) this.f67684E.f67735G);
        bundle.putLong("time_spent", System.currentTimeMillis() - this.f67691L);
        bundle.putInt("num_of_retries", this.f67684E.f67736H);
        bundle.putString("ccu_session_id", this.f67689J);
        for (AnonymousClass5eM Xu : this.f67683D.f67778C) {
            Xu.Xu(bundle);
        }
        AnonymousClass5eI anonymousClass5eI = new AnonymousClass5eI();
        new AnonymousClass6CD(this).vBA(new AnonymousClass6DE(this.f67700U), null);
    }

    /* renamed from: H */
    private static boolean m28171H(AnonymousClass5dx anonymousClass5dx, AnonymousClass5eU anonymousClass5eU, List list, List list2) {
        AnonymousClass5e3 anonymousClass5e3 = (AnonymousClass5e3) anonymousClass5eU.f67792B;
        Object obj = (AnonymousClass5eR) anonymousClass5eU.f67793C;
        StringBuilder stringBuilder;
        if (anonymousClass5e3 == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(obj.f67787D);
            anonymousClass5e3 = new AnonymousClass5e3(stringBuilder.toString());
            anonymousClass5e3.f67754G = AnonymousClass5e1.REMOVE;
            obj.f67785B = AnonymousClass5eQ.REMOVE;
            anonymousClass5dx.f67704Y++;
        } else {
            int i;
            if (obj == null) {
                i = anonymousClass5dx.f67702W + 1;
                anonymousClass5dx.f67702W = i;
                if (i <= anonymousClass5dx.f67684E.f67735G) {
                    anonymousClass5e3.f67754G = AnonymousClass5e1.ADD;
                    obj = new AnonymousClass5eR(anonymousClass5e3.m28177A().longValue(), anonymousClass5e3.m28178B());
                    obj.f67785B = AnonymousClass5eQ.ADD;
                    anonymousClass5dx.f67694O++;
                }
            } else {
                i = anonymousClass5dx.f67702W + 1;
                anonymousClass5dx.f67702W = i;
                if (i > anonymousClass5dx.f67684E.f67735G) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(obj.f67787D);
                    anonymousClass5e3 = new AnonymousClass5e3(stringBuilder.toString());
                    anonymousClass5e3.f67754G = AnonymousClass5e1.REMOVE;
                    obj.f67785B = AnonymousClass5eQ.REMOVE;
                    anonymousClass5dx.f67704Y++;
                } else if (!anonymousClass5e3.m28178B().equals(obj.f67786C)) {
                    anonymousClass5e3.f67754G = AnonymousClass5e1.UPDATE;
                    obj = new AnonymousClass5eR(anonymousClass5e3.m28177A().longValue(), anonymousClass5e3.m28178B());
                    obj.f67785B = AnonymousClass5eQ.UPDATE;
                    anonymousClass5dx.f67713h++;
                }
            }
            anonymousClass5dx.f67687H++;
        }
        if (!AnonymousClass5e1.REMOVE.equals(anonymousClass5e3.f67754G)) {
            anonymousClass5dx.f67695P.add(anonymousClass5e3.m28178B());
        }
        if (anonymousClass5e3.f67754G == null) {
            return false;
        }
        list.add(anonymousClass5e3);
        list2.add(obj);
        return true;
    }
}
