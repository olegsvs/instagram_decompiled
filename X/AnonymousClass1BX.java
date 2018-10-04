package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1BX */
public final class AnonymousClass1BX {
    /* renamed from: B */
    public static List m9819B(Context context, String str) {
        List arrayList = new ArrayList();
        if (str != null) {
            AnonymousClass1BX.m9826I(str, VERSION.SDK_INT, null);
        }
        if (AnonymousClass1Ba.m9838D(context, "android.permission.GET_ACCOUNTS")) {
            context = AccountManager.get(context).getAccounts();
            for (Account account : context) {
                if ("com.google".equalsIgnoreCase(account.type)) {
                    arrayList.add(account);
                }
            }
            if (str != null) {
                AnonymousClass0Fr.GetGoogleAccountSuccess.m1685A().m3298F("flow", str).m3294B("num_of_google_account", context.length).m3310R();
            }
        } else if (str != null) {
            AnonymousClass1BX.m9823F(AnonymousClass0Fr.GetGoogleAccountFailure, str, "no_permission", null);
        }
        return arrayList;
    }

    /* renamed from: C */
    public static List m9820C(Context context, String str, AnonymousClass0EE anonymousClass0EE) {
        List<Account> B = AnonymousClass1BX.m9819B(context, str);
        List arrayList = new ArrayList();
        AccountManager accountManager = AccountManager.get(context);
        Object obj = (str == null || anonymousClass0EE == null) ? null : 1;
        for (Account account : B) {
            CharSequence D;
            if (obj != null) {
                D = AnonymousClass1BX.m9821D(accountManager, account, str, anonymousClass0EE);
            } else {
                D = AnonymousClass1BX.m9821D(accountManager, account, null, null);
            }
            if (!TextUtils.isEmpty(D)) {
                arrayList.add(D);
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    public static java.lang.String m9821D(android.accounts.AccountManager r10, android.accounts.Account r11, java.lang.String r12, X.AnonymousClass0EE r13) {
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
        r0 = "";
        r6 = 0;
        r7 = r12;
        r9 = r13;
        if (r12 == 0) goto L_0x000b;
    L_0x0007:
        if (r13 == 0) goto L_0x000b;
    L_0x0009:
        r5 = 1;
        goto L_0x000c;
    L_0x000b:
        r5 = 0;
    L_0x000c:
        if (r5 == 0) goto L_0x0014;
    L_0x000e:
        r2 = X.AnonymousClass0Fr.GetGoogleTokenAttempt;
        r1 = 0;
        X.AnonymousClass1BX.m9823F(r2, r12, r1, r13);
    L_0x0014:
        r4 = new X.0fS;
        r4.<init>();
        r2 = r4.now();
        r1 = "audience:server:client_id:894032761246-7f5ii0dscmtvqu9lcs7bquii0vb6ddc8.apps.googleusercontent.com";	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        r0 = r10.blockingGetAuthToken(r11, r1, r6);	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        r1 = "com.google";	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        r10.invalidateAuthToken(r1, r0);	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        r1 = "audience:server:client_id:894032761246-7f5ii0dscmtvqu9lcs7bquii0vb6ddc8.apps.googleusercontent.com";	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        r0 = r10.blockingGetAuthToken(r11, r1, r6);	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        if (r5 == 0) goto L_0x007b;	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
    L_0x0030:
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        if (r1 != 0) goto L_0x0042;	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
    L_0x0036:
        r6 = X.AnonymousClass0Fr.GetGoogleTokenSuccess;	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        r8 = 0;	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        r10 = r4.now();	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        r10 = r10 - r2;	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        X.AnonymousClass1BX.m9827J(r6, r7, r8, r9, r10);	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        goto L_0x007b;	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
    L_0x0042:
        r6 = X.AnonymousClass0Fr.GetGoogleTokenFail;	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        r8 = "empty_token";	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        r10 = r4.now();	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        r10 = r10 - r2;	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        X.AnonymousClass1BX.m9827J(r6, r7, r8, r9, r10);	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
        goto L_0x007b;	 Catch:{ AuthenticatorException -> 0x006d, OperationCanceledException -> 0x005e, IOException -> 0x004f }
    L_0x004f:
        if (r5 == 0) goto L_0x007b;
    L_0x0051:
        r6 = X.AnonymousClass0Fr.GetGoogleTokenFail;
        r8 = "IOException";
        r10 = r4.now();
        r10 = r10 - r2;
        X.AnonymousClass1BX.m9827J(r6, r7, r8, r9, r10);
        goto L_0x007b;
    L_0x005e:
        if (r5 == 0) goto L_0x007b;
    L_0x0060:
        r6 = X.AnonymousClass0Fr.GetGoogleTokenFail;
        r8 = "OperationCanceledException";
        r10 = r4.now();
        r10 = r10 - r2;
        X.AnonymousClass1BX.m9827J(r6, r7, r8, r9, r10);
        goto L_0x007b;
    L_0x006d:
        if (r5 == 0) goto L_0x007b;
    L_0x006f:
        r6 = X.AnonymousClass0Fr.GetGoogleTokenFail;
        r8 = "AuthenticatorException";
        r10 = r4.now();
        r10 = r10 - r2;
        X.AnonymousClass1BX.m9827J(r6, r7, r8, r9, r10);
    L_0x007b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1BX.D(android.accounts.AccountManager, android.accounts.Account, java.lang.String, X.0EE):java.lang.String");
    }

    /* renamed from: E */
    public static void m9822E(String str, String str2, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass0NN.m3291B(str2, anonymousClass0EE).m3298F("type", "gmail").m3298F("flow", str).m3310R();
    }

    /* renamed from: F */
    public static void m9823F(AnonymousClass0Fr anonymousClass0Fr, String str, String str2, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass1BX.m9827J(anonymousClass0Fr, str, str2, anonymousClass0EE, -1);
    }

    /* renamed from: G */
    public static void m9824G(AnonymousClass0Cn anonymousClass0Cn, Context context, String str, String str2, boolean z, AnonymousClass0EE anonymousClass0EE) {
        String str3 = str2;
        AnonymousClass0EE anonymousClass0EE2 = anonymousClass0EE;
        AnonymousClass1BX.m9826I(str2, VERSION.SDK_INT, anonymousClass0EE2);
        if (AnonymousClass1Ba.m9838D(context, "android.permission.GET_ACCOUNTS")) {
            AccountManager accountManager = AccountManager.get(context);
            Object obj = null;
            for (Account account : accountManager.getAccounts()) {
                if ("com.google".equalsIgnoreCase(account.type) && str.equalsIgnoreCase(account.name)) {
                    AnonymousClass1BX.m9823F(AnonymousClass0Fr.GetGoogleAccountSuccess, str2, null, anonymousClass0EE2);
                    boolean z2 = z;
                    if (z || ((Boolean) AnonymousClass0CC.xM.m914G()).booleanValue()) {
                        AnonymousClass0Ix.m2384D(new AnonymousClass3Wp(accountManager, account, str3, anonymousClass0EE2, z2, anonymousClass0Cn));
                    }
                    obj = 1;
                    if (obj == null) {
                        AnonymousClass1BX.m9823F(AnonymousClass0Fr.GetGoogleAccountFailure, str2, "no_match_found", anonymousClass0EE2);
                        return;
                    }
                    return;
                }
            }
            if (obj == null) {
                AnonymousClass1BX.m9823F(AnonymousClass0Fr.GetGoogleAccountFailure, str2, "no_match_found", anonymousClass0EE2);
                return;
            }
            return;
        }
        AnonymousClass1BX.m9823F(AnonymousClass0Fr.GetGoogleAccountFailure, str2, "no_permission", anonymousClass0EE2);
    }

    /* renamed from: H */
    private static AnonymousClass0NN m9825H(AnonymousClass0Fr anonymousClass0Fr, AnonymousClass0EE anonymousClass0EE) {
        if (anonymousClass0EE == null) {
            return anonymousClass0Fr.m1685A();
        }
        return AnonymousClass0NN.m3291B(anonymousClass0Fr.m1692H(), anonymousClass0EE);
    }

    /* renamed from: I */
    private static void m9826I(String str, int i, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass1BX.m9825H(AnonymousClass0Fr.GetGoogleAccountAttempt, anonymousClass0EE).m3298F("flow", str).m3294B("api_level", i).m3310R();
    }

    /* renamed from: J */
    private static void m9827J(AnonymousClass0Fr anonymousClass0Fr, String str, String str2, AnonymousClass0EE anonymousClass0EE, long j) {
        anonymousClass0Fr = AnonymousClass1BX.m9825H(anonymousClass0Fr, anonymousClass0EE);
        anonymousClass0Fr.m3298F("flow", str);
        if (!TextUtils.isEmpty(str2)) {
            anonymousClass0Fr.m3298F("error_type", str2);
        }
        if (j != -1) {
            anonymousClass0Fr.m3295C("elapsed_time", j);
        }
        anonymousClass0Fr.m3310R();
    }
}
