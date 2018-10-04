package com.instagram.notifications.push;

import X.AnonymousClass08s;
import X.AnonymousClass0Ea;
import X.AnonymousClass0G5;
import X.AnonymousClass0cQ;
import X.AnonymousClass1NS;
import X.AnonymousClass55W;
import android.content.Intent;
import com.facebook.C0164R;

public class GCMReceiver extends AnonymousClass1NS {
    /* renamed from: B */
    private boolean f17789B = false;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r4) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0002 in list [B:6:0x000b]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r3 = this;
        if (r4 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r2 = 1;
        super.onHandleIntent(r4);	 Catch:{ all -> 0x000f }
        r0 = r3.f17789B;
        if (r0 == 0) goto L_0x0002;
    L_0x000b:
        r3.stopForeground(r2);
        goto L_0x0002;
    L_0x000f:
        r1 = move-exception;
        r0 = r3.f17789B;
        if (r0 == 0) goto L_0x0017;
    L_0x0014:
        r3.stopForeground(r2);
    L_0x0017:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.notifications.push.GCMReceiver.onHandleIntent(android.content.Intent):void");
    }

    /* renamed from: A */
    public final AnonymousClass55W mo2498A() {
        return new AnonymousClass55W();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int J = AnonymousClass0cQ.m5860J(this, 239349471);
        if (intent != null) {
            this.f17789B = intent.getBooleanExtra("foreground", false);
        }
        if (this.f17789B) {
            AnonymousClass0Ea.f1980C.markerEnd(26607617, (short) 2);
            startForeground(20017, AnonymousClass08s.m555B(getApplicationContext(), null, Integer.valueOf(AnonymousClass0G5.m1726G(this, C0164R.attr.defaultNotificationIcon, C0164R.drawable.notification_icon))).f1019B);
        }
        int onStartCommand = super.onStartCommand(intent, i, i2);
        AnonymousClass0cQ.m5861K(this, 359618246, J);
        return onStartCommand;
    }
}
