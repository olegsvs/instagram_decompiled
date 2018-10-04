package com.instagram.react.modules.product;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Gn;
import X.AnonymousClass0Hk;
import X.AnonymousClass0IL;
import X.AnonymousClass0In;
import X.AnonymousClass0Iy;
import X.AnonymousClass0PH;
import X.AnonymousClass0a2;
import X.AnonymousClass0ax;
import X.AnonymousClass0g0;
import X.AnonymousClass0g1;
import X.AnonymousClass0xr;
import X.AnonymousClass1Pv;
import X.AnonymousClass2NX;
import X.AnonymousClass3jF;
import X.AnonymousClass3x6;
import X.AnonymousClass5so;
import X.AnonymousClass5sp;
import X.AnonymousClass5sq;
import X.AnonymousClass5sr;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import com.facebook.C0164R;
import com.facebook.fbreact.specs.NativeIGInsightsReactModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.bugreporter.BugReport;

@ReactModule(name = "IGInsightsReactModule")
public class IgReactInsightsModule extends NativeIGInsightsReactModuleSpec {
    public static final String MODULE_NAME = "IGInsightsReactModule";

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactInsightsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void navigateToCreatePromotion() {
        AnonymousClass2NX.C();
        Activity currentActivity = getCurrentActivity();
        AnonymousClass0xr.F("business_insights", AnonymousClass0a2.I(currentActivity != null ? AnonymousClass0Ce.G(currentActivity.getIntent().getExtras()) : null), null);
        UiThreadUtil.runOnUiThread(new AnonymousClass5so(this, AnonymousClass0In.B(getCurrentActivity())));
    }

    public void navigateToFeedbackChannel(String str) {
        str = getCurrentActivity();
        if (str != null) {
            AnonymousClass0Cm G = AnonymousClass0Ce.G(str.getIntent().getExtras());
            BugReport bugReport = new BugReport();
            bugReport.f37278B = str.getString(C0164R.string.feedback_channel_feedback_title);
            bugReport.f37280D = "636812293063672";
            bugReport.f37282F = JsonProperty.USE_DEFAULT_NAME;
            bugReport.f37284H = str.getString(((Boolean) AnonymousClass0CC.PZ.H(G)).booleanValue() ? C0164R.string.feedback_channel_detail_dissatisfaction_v2 : C0164R.string.feedback_channel_detail_dissatisfaction);
            bugReport.f37283G = true;
            bugReport.f37289M = G.f1759C;
            new AnonymousClass0ax(G, str, bugReport, null).B(new Void[0]);
            return;
        }
        AnonymousClass0Gn.L("IgReactInsightsModule", new IllegalArgumentException("Activity can not be null to navigateToFeedbackChannel"));
    }

    public void navigateToSeeMorePromotions() {
        FragmentActivity B = AnonymousClass0In.B(getCurrentActivity());
        if (B != null) {
            UiThreadUtil.runOnUiThread(new AnonymousClass5sp(this, B, AnonymousClass0Ce.G(B.getIntent().getExtras())));
        } else {
            AnonymousClass0Gn.L("IgReactInsightsModule", new IllegalArgumentException("Activity can not be null in navigateToSeeMorePromotions"));
        }
    }

    public void navigateToSeeMoreStories() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            UiThreadUtil.runOnUiThread(new AnonymousClass5sr(this, AnonymousClass0Ce.G(currentActivity.getIntent().getExtras()), AnonymousClass0In.B(currentActivity)));
            return;
        }
        AnonymousClass0Gn.L("IgReactInsightsModule", new IllegalArgumentException("Activity can not be null to navigateToSeeMoreStories"));
    }

    public void navigateToSingleFeedView(String str) {
        AnonymousClass0IL D = AnonymousClass0Iy.D(getCurrentActivity(), AnonymousClass1Pv.ACCOUNT_INSIGHTS);
        FragmentActivity B = AnonymousClass0In.B(getCurrentActivity());
        if (D != null) {
            UiThreadUtil.runOnUiThread(new AnonymousClass5sq(this, B, str));
        }
    }

    public void navigateToStoriesCamera() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            while (currentActivity.getParent() != null) {
                currentActivity = currentActivity.getParent();
            }
            AnonymousClass0Hk anonymousClass0Hk = (AnonymousClass0Hk) currentActivity;
            anonymousClass0Hk.OWA(AnonymousClass3jF.B().B(anonymousClass0Hk.xJ().G()).A(true).C("camera_action_organic_insights").ID());
        }
    }

    public void navigateToTopPostsCamera() {
        AnonymousClass0IL D = AnonymousClass0Iy.D(getCurrentActivity(), AnonymousClass1Pv.ACCOUNT_INSIGHTS);
        if (D != null && (D instanceof AnonymousClass3x6)) {
            AnonymousClass0PH anonymousClass0PH = ((AnonymousClass3x6) D).f47323B;
            if (anonymousClass0PH != null) {
                anonymousClass0PH.E(AnonymousClass0g0.FOLLOWERS_SHARE, AnonymousClass0g1.INSIGHTS);
            }
        }
    }

    public void showInsightsFilterView(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
        r4 = new X.2E1;
        r9 = "18";
        r10 = 0;
        r5 = r13;
        r7 = r14;
        r6 = r15;
        r8 = r16;
        r4.<init>(r5, r6, r7, r8, r9, r10);
        r3 = new java.io.StringWriter;	 Catch:{ IOException -> 0x009f }
        r3.<init>();	 Catch:{ IOException -> 0x009f }
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ IOException -> 0x009f }
        r2 = r0.createGenerator(r3);	 Catch:{ IOException -> 0x009f }
        r2.writeStartObject();	 Catch:{ IOException -> 0x009f }
        r0 = r4.f27759G;	 Catch:{ IOException -> 0x009f }
        if (r0 == 0) goto L_0x0026;	 Catch:{ IOException -> 0x009f }
    L_0x001f:
        r1 = "id";	 Catch:{ IOException -> 0x009f }
        r0 = r4.f27759G;	 Catch:{ IOException -> 0x009f }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x009f }
    L_0x0026:
        r0 = r4.f27756D;	 Catch:{ IOException -> 0x009f }
        if (r0 == 0) goto L_0x0031;	 Catch:{ IOException -> 0x009f }
    L_0x002a:
        r1 = "ordering";	 Catch:{ IOException -> 0x009f }
        r0 = r4.f27756D;	 Catch:{ IOException -> 0x009f }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x009f }
    L_0x0031:
        r0 = r4.f27757E;	 Catch:{ IOException -> 0x009f }
        if (r0 == 0) goto L_0x003c;	 Catch:{ IOException -> 0x009f }
    L_0x0035:
        r1 = "post_type";	 Catch:{ IOException -> 0x009f }
        r0 = r4.f27757E;	 Catch:{ IOException -> 0x009f }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x009f }
    L_0x003c:
        r0 = r4.f27758F;	 Catch:{ IOException -> 0x009f }
        if (r0 == 0) goto L_0x0047;	 Catch:{ IOException -> 0x009f }
    L_0x0040:
        r1 = "timeframe";	 Catch:{ IOException -> 0x009f }
        r0 = r4.f27758F;	 Catch:{ IOException -> 0x009f }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x009f }
    L_0x0047:
        r0 = r4.f27755C;	 Catch:{ IOException -> 0x009f }
        if (r0 == 0) goto L_0x0052;	 Catch:{ IOException -> 0x009f }
    L_0x004b:
        r1 = "first";	 Catch:{ IOException -> 0x009f }
        r0 = r4.f27755C;	 Catch:{ IOException -> 0x009f }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x009f }
    L_0x0052:
        r0 = r4.f27754B;	 Catch:{ IOException -> 0x009f }
        if (r0 == 0) goto L_0x005d;	 Catch:{ IOException -> 0x009f }
    L_0x0056:
        r1 = "after";	 Catch:{ IOException -> 0x009f }
        r0 = r4.f27754B;	 Catch:{ IOException -> 0x009f }
        r2.writeStringField(r1, r0);	 Catch:{ IOException -> 0x009f }
    L_0x005d:
        r2.writeEndObject();	 Catch:{ IOException -> 0x009f }
        r2.close();	 Catch:{ IOException -> 0x009f }
        r2 = r3.toString();	 Catch:{ IOException -> 0x009f }
        r0 = X.AnonymousClass0Ir.f2848B;
        r0.A();
        r3 = new X.5ss;
        r3.<init>(r11);
        r1 = new android.os.Bundle;
        r1.<init>();
        r0 = X.AnonymousClass34e.f37573R;
        r1.putString(r0, r2);
        r0 = X.AnonymousClass34e.f37572Q;
        r1.putString(r0, r12);
        r2 = new X.34e;
        r2.<init>();
        r2.f37574B = r3;
        r2.setArguments(r1);
        r1 = r11.getCurrentActivity();
        r0 = X.AnonymousClass1Pv.ACCOUNT_INSIGHTS;
        r0 = X.AnonymousClass0Iy.D(r1, r0);
        if (r0 == 0) goto L_0x009e;
    L_0x0096:
        r1 = r0.getFragmentManager();
        r0 = 0;
        r2.D(r1, r0);
    L_0x009e:
        return;
    L_0x009f:
        r1 = new java.lang.IllegalArgumentException;
        r0 = "exception on serialize new api query";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.modules.product.IgReactInsightsModule.showInsightsFilterView(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
