package com.facebook.cameracore.mediapipeline.asyncscripting;

import X.AnonymousClass0Kw;
import X.AnonymousClass17r;
import X.AnonymousClass2hz;
import X.AnonymousClass2i0;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Message;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AsyncScriptingManager {
    public final List mAsyncMessages = new ArrayList();
    private final Messenger mAsyncMessenger = new Messenger(new AnonymousClass2i0(this));
    private Messenger mBoundServiceMessenger;
    public final Queue mCommandQueue = new LinkedList();
    private Context mContext;
    private final String mPostMessageCommand = "javaSendPostMesage";
    private boolean mServiceConnected = false;
    private final ServiceConnection mServiceConnection = new AnonymousClass2hz(this);

    public AsyncScriptingManager(Context context) {
        this.mContext = context;
    }

    public static void internalExecute(com.facebook.cameracore.mediapipeline.asyncscripting.AsyncScriptingManager r8, java.lang.String r9) {
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
        r7 = r9.length();
        r6 = 0;
    L_0x0005:
        r5 = 50000; // 0xc350 float:7.0065E-41 double:2.47033E-319;
        r0 = r7 / r5;
        r1 = 0;
        if (r6 > r0) goto L_0x004b;
    L_0x000d:
        r4 = r6 * r5;
        r6 = r6 + 1;
        r5 = r5 * r6;
        if (r5 <= r7) goto L_0x0015;
    L_0x0014:
        r5 = r7;
    L_0x0015:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = android.os.Message.obtain(r1, r0);	 Catch:{ RemoteException -> 0x0042 }
        r0 = r8.mAsyncMessenger;	 Catch:{ RemoteException -> 0x0042 }
        r3.replyTo = r0;	 Catch:{ RemoteException -> 0x0042 }
        r2 = new android.os.Bundle;	 Catch:{ RemoteException -> 0x0042 }
        r2.<init>();	 Catch:{ RemoteException -> 0x0042 }
        r1 = "script";	 Catch:{ RemoteException -> 0x0042 }
        r0 = r9.substring(r4, r5);	 Catch:{ RemoteException -> 0x0042 }
        r2.putString(r1, r0);	 Catch:{ RemoteException -> 0x0042 }
        r3.setData(r2);	 Catch:{ RemoteException -> 0x0042 }
        r0 = r8.mBoundServiceMessenger;	 Catch:{ RemoteException -> 0x0042 }
        if (r0 == 0) goto L_0x003a;	 Catch:{ RemoteException -> 0x0042 }
    L_0x0034:
        r0 = r8.mBoundServiceMessenger;	 Catch:{ RemoteException -> 0x0042 }
        r0.send(r3);	 Catch:{ RemoteException -> 0x0042 }
        goto L_0x0005;	 Catch:{ RemoteException -> 0x0042 }
    L_0x003a:
        r1 = new java.lang.RuntimeException;	 Catch:{ RemoteException -> 0x0042 }
        r0 = "AsyncService messenger is null";	 Catch:{ RemoteException -> 0x0042 }
        r1.<init>(r0);	 Catch:{ RemoteException -> 0x0042 }
        throw r1;	 Catch:{ RemoteException -> 0x0042 }
    L_0x0042:
        r2 = move-exception;
        r1 = new java.lang.RuntimeException;
        r0 = "AsyncScripting message is too big.";
        r1.<init>(r0, r2);
        throw r1;
    L_0x004b:
        r0 = 1001; // 0x3e9 float:1.403E-42 double:4.946E-321;
        r1 = android.os.Message.obtain(r1, r0);	 Catch:{ RemoteException -> 0x0067 }
        r0 = r8.mAsyncMessenger;	 Catch:{ RemoteException -> 0x0067 }
        r1.replyTo = r0;	 Catch:{ RemoteException -> 0x0067 }
        r0 = r8.mBoundServiceMessenger;	 Catch:{ RemoteException -> 0x0067 }
        if (r0 == 0) goto L_0x005f;	 Catch:{ RemoteException -> 0x0067 }
    L_0x0059:
        r0 = r8.mBoundServiceMessenger;	 Catch:{ RemoteException -> 0x0067 }
        r0.send(r1);	 Catch:{ RemoteException -> 0x0067 }
        return;	 Catch:{ RemoteException -> 0x0067 }
    L_0x005f:
        r1 = new java.lang.RuntimeException;	 Catch:{ RemoteException -> 0x0067 }
        r0 = "AsyncService messenger is null";	 Catch:{ RemoteException -> 0x0067 }
        r1.<init>(r0);	 Catch:{ RemoteException -> 0x0067 }
        throw r1;	 Catch:{ RemoteException -> 0x0067 }
    L_0x0067:
        r1 = new java.lang.RuntimeException;
        r0 = "AsyncScripting message is too big.";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.asyncscripting.AsyncScriptingManager.internalExecute(com.facebook.cameracore.mediapipeline.asyncscripting.AsyncScriptingManager, java.lang.String):void");
    }

    public static void internalSendPostMessage(AsyncScriptingManager asyncScriptingManager) {
        Message obtain = Message.obtain(null, 1002);
        obtain.replyTo = asyncScriptingManager.mAsyncMessenger;
        try {
            if (asyncScriptingManager.mBoundServiceMessenger != null) {
                asyncScriptingManager.mBoundServiceMessenger.send(obtain);
                return;
            }
            throw new RuntimeException("AsyncService messenger is null");
        } catch (AsyncScriptingManager asyncScriptingManager2) {
            throw new RuntimeException("AsyncScripting message is too big.", asyncScriptingManager2);
        }
    }

    public void javaCreateService() {
        Intent intent = new Intent(this.mContext, AsyncScriptingService.class);
        AnonymousClass17r.B(this.mContext, intent, this.mServiceConnection, 1, 399748335);
        AnonymousClass0Kw.B().B().H(intent, this.mContext);
    }

    public void javaDestroyService() {
        if (this.mServiceConnected) {
            AnonymousClass0Kw.B().B().I(new Intent(this.mContext, AsyncScriptingService.class), this.mContext);
            AnonymousClass17r.C(this.mContext, this.mServiceConnection, 304079423);
        }
    }

    public void javaExecute(String str) {
        if (this.mServiceConnected) {
            internalExecute(this, str);
        } else {
            this.mCommandQueue.add(str);
        }
    }

    public String[] javaReceivePostMessage() {
        List list = this.mAsyncMessages;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        this.mAsyncMessages.clear();
        return strArr;
    }

    public void javaSendPostMesage() {
        if (this.mServiceConnected) {
            internalSendPostMessage(this);
        } else {
            this.mCommandQueue.add("javaSendPostMesage");
        }
    }
}
