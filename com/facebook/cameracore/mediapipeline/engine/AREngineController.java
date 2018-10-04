package com.facebook.cameracore.mediapipeline.engine;

import X.AnonymousClass0CF;
import X.AnonymousClass1uz;
import android.content.res.AssetManager;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.cameracore.mediapipeline.asyncscripting.AsyncScriptingManager;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.hybridlogsink.HybridLogSink;
import com.facebook.jni.HybridData;
import java.util.List;

public class AREngineController {
    private static volatile boolean sIsLibraryLoaded;
    private static volatile boolean sIsLibraryStartLoading;
    private final HybridData mHybridData;

    private static native HybridData initHybrid(AssetManager assetManager, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, PluginConfigProvider pluginConfigProvider);

    private native void renderSessionInit(EffectServiceHost effectServiceHost, AsyncScriptingManager asyncScriptingManager, boolean z, boolean z2, int i, GPUTimerImpl gPUTimerImpl, boolean z3, HybridLogSink hybridLogSink);

    public native void cycleDebugOverlaySetup(boolean z);

    public native boolean doFrame(int i, int i2, int i3, float[] fArr, float[] fArr2, float[] fArr3, long j, long j2, int i4, boolean z);

    public native float getFPS();

    public native int getFacesCount();

    public native void onEffectStopped();

    public native void preloadServices(List list);

    public native void releaseGl();

    public native void resetCurrentEffect();

    public native void resize(int i, int i2);

    public native void setCameraFacing(int i);

    public native void setCameraSensorRotation(int i);

    public native void setEffect(String str, String str2, String str3, String str4, List list);

    public native void setFieldOfViewRadians(float f);

    public native void setupImageSourceFacet(int i, int i2, int i3, int i4, boolean z);

    public native void updatePerEffectDebugConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    public native void updatePerSessionDebugConfiguration(int i, boolean z, boolean z2, boolean z3, boolean z4);

    public AREngineController(AssetManager assetManager, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, PluginConfigProvider pluginConfigProvider) {
        ensureLibraryLoaded();
        this.mHybridData = initHybrid(assetManager, androidAsyncExecutorFactory, pluginConfigProvider);
    }

    public static synchronized void ensureLibraryLoaded() {
        synchronized (AREngineController.class) {
            if (!sIsLibraryLoaded) {
                sIsLibraryStartLoading = true;
                AnonymousClass0CF.E("filters-native-android");
                sIsLibraryLoaded = true;
            }
        }
    }

    public final void renderSessionInit(EffectServiceHost effectServiceHost, AsyncScriptingManager asyncScriptingManager, boolean z, boolean z2, int i, AnonymousClass1uz anonymousClass1uz, boolean z3, HybridLogSink hybridLogSink) {
        renderSessionInit(effectServiceHost, asyncScriptingManager, z, z2, i, anonymousClass1uz instanceof GPUTimerImpl ? (GPUTimerImpl) anonymousClass1uz : null, z3, hybridLogSink);
    }
}
