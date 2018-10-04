package com.instagram.share.handleractivity;

import X.AnonymousClass0EE;
import X.AnonymousClass0EH;
import X.AnonymousClass0cQ;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class CustomStoryShareHandlerActivity extends Activity implements AnonymousClass0EE {
    public final String getModuleName() {
        return "share_handler";
    }

    /* renamed from: B */
    private void m1370B() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r10 = this;
        r2 = r10;
        r7 = r10.getCallingPackage();
        if (r7 != 0) goto L_0x0009;
    L_0x0007:
        r7 = "";
    L_0x0009:
        r1 = X.AnonymousClass3fA.f43104D;
        r0 = 0;
        X.AnonymousClass3f6.B(r10, r1, r7, r0);
        if (r7 == 0) goto L_0x005c;
    L_0x0011:
        r3 = r10.getIntent();
        r4 = r3.getData();
        r0 = "interactive_asset_uri";
        r5 = r3.getParcelableExtra(r0);
        r5 = (android.net.Uri) r5;
        r0 = "top_background_color";
        r1 = r3.getStringExtra(r0);
        r0 = "bottom_background_color";
        r0 = r3.getStringExtra(r0);
        r8 = android.graphics.Color.parseColor(r1);	 Catch:{ Exception -> 0x0032 }
        goto L_0x0034;	 Catch:{ Exception -> 0x0032 }
    L_0x0032:
        r8 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
    L_0x0034:
        r9 = android.graphics.Color.parseColor(r0);	 Catch:{ Exception -> 0x0039 }
        goto L_0x003b;	 Catch:{ Exception -> 0x0039 }
    L_0x0039:
        r9 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
    L_0x003b:
        r0 = "content_url";
        r10 = r3.getStringExtra(r0);
        if (r4 == 0) goto L_0x0049;
    L_0x0043:
        r0 = android.net.Uri.EMPTY;
        if (r4 == r0) goto L_0x0049;
    L_0x0047:
        r0 = 1;
        goto L_0x004a;
    L_0x0049:
        r0 = 0;
    L_0x004a:
        if (r0 != 0) goto L_0x0057;
    L_0x004c:
        if (r5 == 0) goto L_0x0054;
    L_0x004e:
        r0 = android.net.Uri.EMPTY;
        if (r5 == r0) goto L_0x0054;
    L_0x0052:
        r0 = 1;
        goto L_0x0055;
    L_0x0054:
        r0 = 0;
    L_0x0055:
        if (r0 == 0) goto L_0x005c;
    L_0x0057:
        r6 = X.AnonymousClass3fA.f43104D;
        X.AnonymousClass3f5.B(r2, r3, r4, r5, r6, r7, r8, r9, r10);
    L_0x005c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.handleractivity.CustomStoryShareHandlerActivity.B():void");
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.m5852B(this, 850251905);
        AnonymousClass0EH.m1380J(getResources());
        super.onCreate(bundle);
        if (bundle == null) {
            m1370B();
        }
        finish();
        AnonymousClass0cQ.m5853C(this, -1310808178, B);
    }

    public final void onNewIntent(Intent intent) {
        setIntent(intent);
        m1370B();
    }
}
