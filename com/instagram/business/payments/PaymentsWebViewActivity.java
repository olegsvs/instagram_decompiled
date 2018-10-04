package com.instagram.business.payments;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0FO;
import X.AnonymousClass0IG;
import X.AnonymousClass0IL;
import X.AnonymousClass0IT;
import X.AnonymousClass0IV;
import X.AnonymousClass0OR;
import X.AnonymousClass0Su;
import X.AnonymousClass0a2;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ca;
import X.AnonymousClass0eT;
import X.AnonymousClass0eV;
import X.AnonymousClass0eW;
import X.AnonymousClass22r;
import X.AnonymousClass2HL;
import X.AnonymousClass35J;
import X.AnonymousClass35K;
import X.AnonymousClass35L;
import X.AnonymousClass35M;
import X.AnonymousClass3g8;
import X.AnonymousClass3g9;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

public class PaymentsWebViewActivity extends BaseFragmentActivity implements AnonymousClass0IT, AnonymousClass3g8 {
    /* renamed from: B */
    public AnonymousClass0Cm f47327B;
    /* renamed from: C */
    public WebView f47328C;
    /* renamed from: D */
    private OnClickListener f47329D;
    /* renamed from: E */
    private SimpleWebViewConfig f47330E;
    /* renamed from: F */
    private AnonymousClass3g9 f47331F;
    /* renamed from: G */
    private AnonymousClass35L f47332G;
    /* renamed from: H */
    private boolean f47333H;
    /* renamed from: I */
    private OnClickListener f47334I;
    /* renamed from: J */
    private AnonymousClass35M f47335J;
    /* renamed from: K */
    private boolean f47336K;

    /* renamed from: B */
    public static void m21680B(WebView webView, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript:");
        stringBuilder.append(str);
        stringBuilder.toString();
        webView.evaluateJavascript(str, new AnonymousClass35K());
    }

    /* renamed from: C */
    public static Intent m21681C(Context context, String str, boolean z, String str2, boolean z2, String str3, AnonymousClass0Ci anonymousClass0Ci) {
        Intent intent = new Intent(context, PaymentsWebViewActivity.class);
        AnonymousClass0Su anonymousClass0Su = new AnonymousClass0Su(str);
        anonymousClass0Su.f5039M = str2;
        anonymousClass0Su.f5033G = z;
        anonymousClass0Su.f5035I = z2;
        anonymousClass0Su.f5029C = str3;
        intent.putExtra("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", anonymousClass0Su.A());
        intent.putExtra("IgSessionManager.USER_ID", anonymousClass0Ci.getId());
        return intent;
    }

    /* renamed from: D */
    public static void m21682D(PaymentsWebViewActivity paymentsWebViewActivity, Bundle bundle) {
        AnonymousClass0IL anonymousClass3g9 = new AnonymousClass3g9();
        paymentsWebViewActivity.f47331F = anonymousClass3g9;
        anonymousClass3g9.setArguments(bundle);
        AnonymousClass0IV B = paymentsWebViewActivity.D().B();
        B.M(C0164R.id.layout_container_main, paymentsWebViewActivity.f47331F);
        B.F();
    }

    /* renamed from: E */
    private static X.AnonymousClass35M m21683E(java.lang.String r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = X.AnonymousClass35M.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x0005 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0005 }
    L_0x0005:
        r0 = X.AnonymousClass35M.DONE;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.payments.PaymentsWebViewActivity.E(java.lang.String):X.35M");
    }

    /* renamed from: P */
    public final void m21684P() {
        FI().R(this);
    }

    /* renamed from: T */
    public final void m21685T() {
        if (!(D().E(C0164R.id.layout_container_main) instanceof AnonymousClass3g9)) {
            if (AnonymousClass0a2.K(this.f47327B)) {
                m21682D(this, getIntent().getExtras());
            } else {
                AnonymousClass0FO.B(this.f47327B, this, AnonymousClass2HL.READ_ONLY);
            }
        }
    }

    public final boolean UTA(android.webkit.WebView r13, android.net.Uri r14) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r12 = this;
        r1 = "instagram";
        r0 = r14.getScheme();
        r0 = r1.equals(r0);
        r4 = 0;
        r3 = 1;
        if (r0 == 0) goto L_0x0260;
    L_0x000e:
        r1 = "alert";
        r0 = r14.getHost();
        r0 = r1.equals(r0);
        r6 = 0;
        if (r0 == 0) goto L_0x00b4;
    L_0x001b:
        r0 = "title";
        r11 = r14.getQueryParameter(r0);
        r0 = "message";
        r10 = r14.getQueryParameter(r0);
        r0 = "cancelButtonTitle";
        r9 = r14.getQueryParameter(r0);
        r0 = "otherButtonTitle";
        r7 = r14.getQueryParameter(r0);
        r0 = "otherButton2Title";
        r4 = r14.getQueryParameter(r0);
        r0 = "onCancelButton";
        r8 = r14.getQueryParameter(r0);
        r0 = "onOtherButton";
        r5 = r14.getQueryParameter(r0);
        r0 = "onOtherButton2";
        r2 = r14.getQueryParameter(r0);
        r0 = android.text.TextUtils.isEmpty(r9);
        if (r0 == 0) goto L_0x006b;
    L_0x0051:
        r0 = android.text.TextUtils.isEmpty(r7);
        if (r0 == 0) goto L_0x006b;
    L_0x0057:
        r0 = android.text.TextUtils.isEmpty(r4);
        if (r0 == 0) goto L_0x006b;
    L_0x005d:
        r0 = android.text.TextUtils.isEmpty(r10);
        if (r0 == 0) goto L_0x0067;
    L_0x0063:
        X.AnonymousClass3nj.m20678B(r12, r6, r11);
        goto L_0x00b3;
    L_0x0067:
        X.AnonymousClass3nj.m20678B(r12, r11, r10);
        goto L_0x00b3;
    L_0x006b:
        r1 = new X.0Sb;
        r1.<init>(r12);
        r0 = android.text.TextUtils.isEmpty(r11);
        if (r0 != 0) goto L_0x0079;
    L_0x0076:
        r1.R(r11);
    L_0x0079:
        r0 = android.text.TextUtils.isEmpty(r10);
        if (r0 != 0) goto L_0x0082;
    L_0x007f:
        r1.I(r10);
    L_0x0082:
        r0 = android.text.TextUtils.isEmpty(r9);
        if (r0 != 0) goto L_0x0090;
    L_0x0088:
        r0 = new X.35D;
        r0.<init>(r12, r8, r13);
        r1.M(r9, r0);
    L_0x0090:
        r0 = android.text.TextUtils.isEmpty(r7);
        if (r0 != 0) goto L_0x009e;
    L_0x0096:
        r0 = new X.35E;
        r0.<init>(r12, r5, r13);
        r1.D(r7, r0);
    L_0x009e:
        r0 = android.text.TextUtils.isEmpty(r4);
        if (r0 != 0) goto L_0x00ac;
    L_0x00a4:
        r0 = new X.35F;
        r0.<init>(r12, r2, r13);
        r1.P(r4, r0);
    L_0x00ac:
        r0 = r1.C();
        r0.show();
    L_0x00b3:
        return r3;
    L_0x00b4:
        r1 = "close_container";
        r0 = r14.getHost();
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00c5;
    L_0x00c0:
        r12.finish();
        goto L_0x025f;
    L_0x00c5:
        r1 = "update_header";
        r0 = r14.getHost();
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0171;
    L_0x00d1:
        r0 = "title";
        r2 = r14.getQueryParameter(r0);
        if (r2 == 0) goto L_0x00e8;
    L_0x00d9:
        r1 = new X.0Su;
        r0 = r12.f47330E;
        r1.<init>(r0);
        r1.f5039M = r2;
        r0 = r1.A();
        r12.f47330E = r0;
    L_0x00e8:
        r0 = "leftButton";
        r7 = r14.getQueryParameter(r0);
        r0 = "onLeftButtonClick";
        r5 = r14.getQueryParameter(r0);
        if (r7 == 0) goto L_0x011b;
    L_0x00f6:
        r0 = "null";
        r0 = r0.equals(r7);
        if (r0 != 0) goto L_0x011b;
    L_0x00fe:
        r0 = X.AnonymousClass35L.valueOf(r7);	 Catch:{ IllegalArgumentException -> 0x0105 }
        r12.f47332G = r0;	 Catch:{ IllegalArgumentException -> 0x0105 }
        goto L_0x011b;	 Catch:{ IllegalArgumentException -> 0x0105 }
    L_0x0105:
        r2 = "wrong_button";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r7);
        r0 = " is not a valid spec for left button";
        r1.append(r0);
        r0 = r1.toString();
        X.AnonymousClass0Gn.H(r2, r0);
    L_0x011b:
        r1 = "true";
        r0 = "isRootScreen";
        r0 = r14.getQueryParameter(r0);
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0131;
    L_0x0129:
        r0 = new X.35G;
        r0.<init>(r12, r13, r5);
        r12.f47329D = r0;
        goto L_0x0133;
    L_0x0131:
        r12.f47329D = r6;
    L_0x0133:
        r0 = "rightButton";
        r2 = r14.getQueryParameter(r0);
        r0 = "onRightButtonClick";
        r1 = r14.getQueryParameter(r0);
        r12.f47336K = r4;
        if (r2 == 0) goto L_0x0153;
    L_0x0143:
        r0 = "null";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0153;
    L_0x014b:
        r0 = m21683E(r2);
        r12.f47335J = r0;
        r12.f47336K = r3;
    L_0x0153:
        r0 = new X.35H;
        r0.<init>(r12, r13, r1);
        r12.f47334I = r0;
        r1 = "true";
        r0 = "isRightButtonActive";
        r0 = r14.getQueryParameter(r0);
        r0 = r1.equals(r0);
        r0 = r0 ^ r3;
        r12.f47333H = r0;
        r0 = r12.FI();
        r12.configureActionBar(r0);
        return r3;
    L_0x0171:
        r1 = "loading";
        r0 = r14.getHost();
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x01ae;
    L_0x017d:
        r1 = "true";
        r0 = "isLoading";
        r0 = r14.getQueryParameter(r0);
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0195;
    L_0x018b:
        r0 = r12.f47331F;
        r1 = r0.f43252D;
        r0 = 0;
        r1.setVisibility(r0);
        goto L_0x025f;
    L_0x0195:
        r1 = "false";
        r0 = "isLoading";
        r0 = r14.getQueryParameter(r0);
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x025f;
    L_0x01a3:
        r0 = r12.f47331F;
        r1 = r0.f43252D;
        r0 = 8;
        r1.setVisibility(r0);
        goto L_0x025f;
    L_0x01ae:
        r1 = "open_in_native_browser";
        r0 = r14.getHost();
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x01c9;
    L_0x01ba:
        r0 = "url";
        r0 = r14.getQueryParameter(r0);
        r0 = android.net.Uri.parse(r0);
        X.AnonymousClass0IW.T(r0, r12);
        goto L_0x025f;
    L_0x01c9:
        r1 = "payments";
        r0 = r14.getHost();
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0247;
    L_0x01d5:
        r2 = "promoted_posts";
        r5 = r12.f47327B;
        r11 = r5.B();
        r3 = X.AnonymousClass35N.m18455C(r2, r11);
        r1 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x01f9 }
        r1.<init>();	 Catch:{ UnsupportedEncodingException -> 0x01f9 }
        r0 = X.AnonymousClass35N.f37681B;	 Catch:{ UnsupportedEncodingException -> 0x01f9 }
        r1.append(r0);	 Catch:{ UnsupportedEncodingException -> 0x01f9 }
        r0 = "utf-8";	 Catch:{ UnsupportedEncodingException -> 0x01f9 }
        r0 = java.net.URLEncoder.encode(r3, r0);	 Catch:{ UnsupportedEncodingException -> 0x01f9 }
        r1.append(r0);	 Catch:{ UnsupportedEncodingException -> 0x01f9 }
        r3 = r1.toString();	 Catch:{ UnsupportedEncodingException -> 0x01f9 }
        goto L_0x0212;	 Catch:{ UnsupportedEncodingException -> 0x01f9 }
    L_0x01f9:
        r1 = move-exception;
        r0 = "Couldn't encode payment url";
        X.AnonymousClass0Gn.G(r0, r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = X.AnonymousClass1aX.C();
        r1.append(r0);
        r1.append(r3);
        r3 = r1.toString();
    L_0x0212:
        X.AnonymousClass35N.m18454B(r12);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "access_token=";
        r1.append(r0);
        r0 = X.AnonymousClass0a2.B(r5);
        r1.append(r0);
        r10 = r1.toString();
        r6 = X.AnonymousClass0rE.B(r3, r12);
        r0 = 2131692025; // 0x7f0f09f9 float:1.9013138E38 double:1.053195797E-314;
        r8 = r12.getString(r0);
        r0 = "PROMOTE";
        r9 = r2.equals(r0);
        r1 = 7193; // 0x1c19 float:1.008E-41 double:3.554E-320;
        r5 = r12;
        r7 = 1;
        r0 = m21681C(r5, r6, r7, r8, r9, r10, r11);
        X.AnonymousClass0IW.K(r0, r1, r12);
        goto L_0x025f;
    L_0x0247:
        r1 = "dismiss_keyboard";
        r0 = r14.getHost();
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x025f;
    L_0x0253:
        r3 = r12.f47328C;
        r2 = new X.35I;
        r2.<init>(r12);
        r0 = 1500; // 0x5dc float:2.102E-42 double:7.41E-321;
        r3.postDelayed(r2, r0);
    L_0x025f:
        return r4;
    L_0x0260:
        r0 = "hash";
        r0 = r14.getQueryParameter(r0);
        if (r0 == 0) goto L_0x0269;
    L_0x0268:
        goto L_0x025f;
    L_0x0269:
        r2 = r14.buildUpon();
        r1 = "locale";
        r0 = X.AnonymousClass0EH.C();
        r0 = r2.appendQueryParameter(r1, r0);
        r0 = r0.build();
        r0 = r0.toString();
        r13.loadUrl(r0);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.payments.PaymentsWebViewActivity.UTA(android.webkit.WebView, android.net.Uri):boolean");
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.n(true);
        AnonymousClass22r B = AnonymousClass0eW.B(AnonymousClass0eV.MODAL);
        anonymousClass0eT.a(this.f47330E.f5052M);
        AnonymousClass35L anonymousClass35L = this.f47332G;
        if (anonymousClass35L != null) {
            B.f25414H = anonymousClass35L.f37675C;
            B.f25412F = this.f47332G.f37674B;
        }
        B.f25413G = this.f47329D;
        AnonymousClass35M anonymousClass35M = this.f47335J;
        if (anonymousClass35M != null) {
            B.f25410D = anonymousClass35M.f37680C;
            B.f25409C = this.f47335J.f37679B;
            B.f25408B = AnonymousClass0ca.B(AnonymousClass0Ca.C(this, C0164R.color.blue_5));
        }
        anonymousClass0eT.m(this.f47336K, this.f47334I);
        anonymousClass0eT.d(B.m14277B());
        anonymousClass0eT.S(true ^ this.f47333H);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 64206) {
            if (i2 == -1) {
                Bundle extras = getIntent().getExtras();
                if ("access_token=null".equals(this.f47330E.f5042C)) {
                    AnonymousClass0Su anonymousClass0Su = new AnonymousClass0Su(this.f47330E);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("access_token=");
                    stringBuilder.append(AnonymousClass0a2.B(this.f47327B));
                    anonymousClass0Su.f5029C = stringBuilder.toString();
                    this.f47330E = anonymousClass0Su.A();
                    extras.putParcelable("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", this.f47330E);
                }
                m21682D(this, extras);
                return;
            }
            AnonymousClass0IG.F(C0164R.string.login_to_continue);
            finish();
        } else if (i == 7193) {
            m21680B(this.f47328C, "var MInstagramBoostPostNavigationActions =require('MInstagramBoostPostNavigationActions');setTimeout(MInstagramBoostPostNavigationActions.refresh, 1000);");
        }
    }

    public final void onBackPressed() {
        OnClickListener onClickListener = this.f47329D;
        if (onClickListener != null) {
            onClickListener.onClick(this.f47328C);
            return;
        }
        super.onBackPressed();
        AnonymousClass0OR.F(new Handler(), new AnonymousClass35J(this), 500, -347590494);
    }

    public final void onCreate(Bundle bundle) {
        SimpleWebViewConfig simpleWebViewConfig;
        int B = AnonymousClass0cQ.B(this, -79978990);
        this.f47327B = AnonymousClass0Ce.G(getIntent().getExtras());
        super.onCreate(bundle);
        if (bundle == null) {
            simpleWebViewConfig = (SimpleWebViewConfig) getIntent().getParcelableExtra("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG");
        } else {
            simpleWebViewConfig = (SimpleWebViewConfig) bundle.getParcelable("PaymentsWebViewActivity.SimpleWebViewConfig");
        }
        this.f47330E = simpleWebViewConfig;
        AnonymousClass0cQ.C(this, -1130416, B);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("PaymentsWebViewActivity.SimpleWebViewConfig", this.f47330E);
    }

    public final void xh(WebView webView) {
        this.f47328C = webView;
    }
}
