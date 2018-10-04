package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass1Ew;
import X.AnonymousClass1yd;
import X.AnonymousClass5fI;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

@KeepName
public class SignInHubActivity extends FragmentActivity {
    /* renamed from: B */
    public int f67965B;
    /* renamed from: C */
    public Intent f67966C;
    /* renamed from: D */
    private AnonymousClass1yd f67967D;
    /* renamed from: E */
    private boolean f67968E = false;
    /* renamed from: F */
    private SignInConfiguration f67969F;
    /* renamed from: G */
    private boolean f67970G;

    /* renamed from: B */
    private final void m28212B(int i) {
        Parcelable status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
    }

    /* renamed from: C */
    private final void m28213C() {
        E().B(0, null, new AnonymousClass5fI(this));
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f67968E) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.f67957B != null) {
                        Parcelable parcelable = signInAccount.f67957B;
                        AnonymousClass1yd anonymousClass1yd = this.f67967D;
                        GoogleSignInOptions googleSignInOptions = this.f67969F.f67961B;
                        AnonymousClass1Ew.I(parcelable);
                        AnonymousClass1Ew.I(googleSignInOptions);
                        AnonymousClass1yd.C(anonymousClass1yd, "defaultGoogleSignInAccount", parcelable.f24933I);
                        AnonymousClass1Ew.I(parcelable);
                        AnonymousClass1Ew.I(googleSignInOptions);
                        String str = parcelable.f24933I;
                        String D = AnonymousClass1yd.D("googleSignInAccount", str);
                        JSONObject C = GoogleSignInAccount.C(parcelable);
                        C.remove("serverAuthCode");
                        AnonymousClass1yd.C(anonymousClass1yd, D, C.toString());
                        D = AnonymousClass1yd.D("googleSignInOptions", str);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            JSONArray jSONArray = new JSONArray();
                            Collections.sort(googleSignInOptions.f32149C, GoogleSignInOptions.f32145M);
                            ArrayList arrayList = googleSignInOptions.f32149C;
                            int size = arrayList.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj = arrayList.get(i3);
                                i3++;
                                jSONArray.put(((Scope) obj).f24991B);
                            }
                            jSONObject.put("scopes", jSONArray);
                            if (googleSignInOptions.f32148B != null) {
                                jSONObject.put("accountName", googleSignInOptions.f32148B.name);
                            }
                            jSONObject.put("idTokenRequested", googleSignInOptions.f32151E);
                            jSONObject.put("forceCodeForRefreshToken", googleSignInOptions.f32153G);
                            jSONObject.put("serverAuthRequested", googleSignInOptions.f32150D);
                            if (!TextUtils.isEmpty(googleSignInOptions.f32152F)) {
                                jSONObject.put("serverClientId", googleSignInOptions.f32152F);
                            }
                            if (!TextUtils.isEmpty(googleSignInOptions.f32154H)) {
                                jSONObject.put("hostedDomain", googleSignInOptions.f32154H);
                            }
                            AnonymousClass1yd.C(anonymousClass1yd, D, jSONObject.toString());
                            intent.removeExtra("signInAccount");
                            intent.putExtra("googleSignInAccount", parcelable);
                            this.f67970G = true;
                            this.f67965B = i2;
                            this.f67966C = intent;
                            m28213C();
                            return;
                        } catch (Throwable e) {
                            throw new RuntimeException(e);
                        }
                    } else if (intent.hasExtra("errorCode")) {
                        m28212B(intent.getIntExtra("errorCode", 8));
                        return;
                    }
                }
                m28212B(8);
            }
        }
    }

    public final void onCreate(android.os.Bundle r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = -1639906415; // 0xffffffff9e410391 float:-1.02180724E-20 double:NaN;
        r2 = X.AnonymousClass0cQ.B(r6, r0);
        super.onCreate(r7);
        r0 = X.AnonymousClass1yd.B(r6);
        r6.f67967D = r0;
        r5 = r6.getIntent();
        r1 = "com.google.android.gms.auth.GOOGLE_SIGN_IN";
        r0 = r5.getAction();
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0042;
    L_0x0020:
        r4 = "AuthSignInClient";
        r3 = "Unknown action: ";
        r0 = r5.getAction();
        r1 = java.lang.String.valueOf(r0);
        r0 = r1.length();
        if (r0 == 0) goto L_0x0037;
    L_0x0032:
        r0 = r3.concat(r1);
        goto L_0x003c;
    L_0x0037:
        r0 = new java.lang.String;
        r0.<init>(r3);
    L_0x003c:
        android.util.Log.e(r4, r0);
        r6.finish();
    L_0x0042:
        r0 = "config";
        r0 = r5.getParcelableExtra(r0);
        r0 = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) r0;
        r6.f67969F = r0;
        if (r0 != 0) goto L_0x0063;
    L_0x004e:
        r1 = "AuthSignInClient";
        r0 = "Activity started with invalid configuration.";
        android.util.Log.e(r1, r0);
        r0 = 0;
        r6.setResult(r0);
        r6.finish();
        r0 = -1030414423; // 0xffffffffc2951fa9 float:-74.56184 double:NaN;
    L_0x005f:
        X.AnonymousClass0cQ.C(r6, r0, r2);
        return;
    L_0x0063:
        if (r7 != 0) goto L_0x0095;
    L_0x0065:
        r3 = new android.content.Intent;
        r0 = "com.google.android.gms.auth.GOOGLE_SIGN_IN";
        r3.<init>(r0);
        r0 = "com.google.android.gms";
        r3.setPackage(r0);
        r1 = "config";
        r0 = r6.f67969F;
        r3.putExtra(r1, r0);
        r0 = 40962; // 0xa002 float:5.74E-41 double:2.0238E-319;
        r6.startActivityForResult(r3, r0);	 Catch:{ ActivityNotFoundException -> 0x0082 }
        r0 = -677715940; // 0xffffffffd79ae01c float:-3.40574666E14 double:NaN;	 Catch:{ ActivityNotFoundException -> 0x0082 }
        goto L_0x005f;	 Catch:{ ActivityNotFoundException -> 0x0082 }
    L_0x0082:
        r0 = 1;
        r6.f67968E = r0;
        r1 = "AuthSignInClient";
        r0 = "Could not launch sign in Intent. Google Play Service is probably being updated...";
        android.util.Log.w(r1, r0);
        r0 = 17;
        r6.m28212B(r0);
        r0 = -1680183990; // 0xffffffff9bda6d4a float:-3.61357E-22 double:NaN;
        goto L_0x005f;
    L_0x0095:
        r0 = "signingInGoogleApiClients";
        r0 = r7.getBoolean(r0);
        r6.f67970G = r0;
        if (r0 == 0) goto L_0x00b4;
    L_0x009f:
        r0 = "signInResultCode";
        r0 = r7.getInt(r0);
        r6.f67965B = r0;
        r0 = "signInResultData";
        r0 = r7.getParcelable(r0);
        r0 = (android.content.Intent) r0;
        r6.f67966C = r0;
        r6.m28213C();
    L_0x00b4:
        r0 = -1174643578; // 0xffffffffb9fc5c86 float:-4.813412E-4 double:NaN;
        goto L_0x005f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInHubActivity.onCreate(android.os.Bundle):void");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f67970G);
        if (this.f67970G) {
            bundle.putInt("signInResultCode", this.f67965B);
            bundle.putParcelable("signInResultData", this.f67966C);
        }
    }
}
