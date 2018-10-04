package com.facebook.cameracore.mediapipeline.asyncscripting;

import X.AnonymousClass0CF;
import X.AnonymousClass0cQ;
import X.AnonymousClass2i1;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import com.facebook.jni.HybridData;

public class AsyncScriptingService extends Service {
    private HybridData mHybridData;
    public final Messenger mMessenger = new Messenger(new AnonymousClass2i1(this));

    private native HybridData initHybrid();

    private native void nativeExecute(String str);

    private native String nativeSendPostMessage();

    static {
        AnonymousClass0CF.E("graphicsengine-asyncscripting-native");
    }

    public final IBinder onBind(Intent intent) {
        return this.mMessenger.getBinder();
    }

    public final void onCreate() {
        int J = AnonymousClass0cQ.J(this, -875937799);
        super.onCreate();
        this.mHybridData = initHybrid();
        AnonymousClass0cQ.K(this, 2027732725, J);
    }

    public final void onDestroy() {
        int J = AnonymousClass0cQ.J(this, -1750722560);
        super.onDestroy();
        this.mHybridData.resetNative();
        AnonymousClass0cQ.K(this, -50182716, J);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int J = AnonymousClass0cQ.J(this, -734984540);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        AnonymousClass0cQ.K(this, -144220526, J);
        return onStartCommand;
    }
}
