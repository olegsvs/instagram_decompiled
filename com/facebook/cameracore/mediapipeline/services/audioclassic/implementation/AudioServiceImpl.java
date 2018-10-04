package com.facebook.cameracore.mediapipeline.services.audioclassic.implementation;

import X.AnonymousClass0OR;
import X.AnonymousClass2gB;
import X.AnonymousClass2jH;
import X.AnonymousClass2jI;
import X.AnonymousClass3qv;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.accessibility.AccessibilityManager;
import com.facebook.audiofiltercore.AudioProcessorConfiguration;
import com.facebook.audiofiltercore.AudioRenderCoordinator;
import com.facebook.cameracore.mediapipeline.services.audioclassic.interfaces.AudioRenderCallback;
import com.facebook.cameracore.mediapipeline.services.audioclassic.interfaces.AudioService;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;
import java.io.File;
import org.webrtc.MediaStreamTrack;

public class AudioServiceImpl extends AudioService {
    public final AnonymousClass2gB mAudioDecoder;
    public final AudioRenderCoordinator mAudioPlayerCoordinator;
    public final AudioRenderCoordinator mAudioRenderCoordinator;
    public String mCurrentAssetDirectory;
    private Handler mDecodingHandler;
    private HandlerThread mDecodingHandlerThread;
    private boolean mIsEnabled;
    public volatile boolean mIsReleased;
    private boolean mIsRendering;

    private native HybridData initHybrid();

    public AudioServiceImpl(Context context, boolean z, boolean z2) {
        this(context, z, z2, null);
    }

    public AudioServiceImpl(Context context, boolean z, boolean z2, AnonymousClass3qv anonymousClass3qv) {
        this.mIsEnabled = true;
        this.mIsRendering = false;
        this.mHybridData = initHybrid();
        this.mAudioDecoder = new AnonymousClass2gB();
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        boolean z3 = z;
        boolean z4 = z2;
        AnonymousClass3qv anonymousClass3qv2 = anonymousClass3qv;
        this.mAudioRenderCoordinator = new AudioRenderCoordinator(audioManager, accessibilityManager, false, z3, z4, anonymousClass3qv2);
        this.mAudioPlayerCoordinator = new AudioRenderCoordinator(audioManager, accessibilityManager, true, z3, z4, anonymousClass3qv2);
        HandlerThread handlerThread = new HandlerThread("decode_thread", -19);
        this.mDecodingHandlerThread = handlerThread;
        handlerThread.start();
        this.mDecodingHandler = new Handler(this.mDecodingHandlerThread.getLooper());
    }

    public void getAudioProgressTimestamps(String str, NativeDataPromise nativeDataPromise) {
        if (this.mIsRendering) {
            str = this.mAudioRenderCoordinator.getTimeElapsedVector(str);
        } else {
            str = this.mAudioPlayerCoordinator.getTimeElapsedVector(str);
        }
        Object obj = new float[str.size()];
        for (int i = 0; i < str.size(); i++) {
            obj[i] = ((Double) str.get(i)).floatValue();
        }
        nativeDataPromise.setValue(obj);
    }

    public static boolean isValidPath(String str) {
        if (str.contains("../")) {
            return false;
        }
        return new File(str).exists();
    }

    public final boolean onInputDataAvailable(byte[] bArr, int i, int i2) {
        return this.mAudioRenderCoordinator.inputAudioData(bArr, i2, i);
    }

    public void play(String str, String str2, boolean z, boolean z2, float f, boolean z3) {
        AudioServiceImpl audioServiceImpl = this;
        String str3 = str;
        if (this.mIsEnabled && this.mCurrentAssetDirectory != null) {
            str = f;
            if (f >= 1.0E-6f) {
                if (!z3) {
                    AnonymousClass0OR.D(this.mDecodingHandler, new AnonymousClass2jH(audioServiceImpl, str2, str3, z, z2, str), -70519084);
                    return;
                }
            }
        }
        stop(str3);
    }

    public void prepareSound(String str, boolean z) {
        AnonymousClass0OR.D(this.mDecodingHandler, new AnonymousClass2jI(this, str, z), -69668151);
    }

    public final void release() {
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
        r5 = this;
        r0 = 1;
        r5.mIsReleased = r0;
        r5.stopDecodingThread();
        r4 = r5.mAudioDecoder;
        r0 = 1;
        r4.f32323E = r0;
        r2 = r4.f32328J;
        r1 = new X.2g9;
        r1.<init>(r4);
        r0 = -1506316226; // 0xffffffffa637703e float:-6.3642996E-16 double:NaN;
        X.AnonymousClass0GG.B(r2, r1, r0);
        r0 = r4.f32328J;
        r0.shutdown();
        r3 = r4.f32327I;
        monitor-enter(r3);
        r0 = r4.f32327I;	 Catch:{ all -> 0x0055 }
        r0 = r0.keySet();	 Catch:{ all -> 0x0055 }
        r2 = r0.iterator();	 Catch:{ all -> 0x0055 }
    L_0x002a:
        r0 = r2.hasNext();	 Catch:{ all -> 0x0055 }
        if (r0 == 0) goto L_0x003f;	 Catch:{ all -> 0x0055 }
    L_0x0030:
        r1 = r2.next();	 Catch:{ all -> 0x0055 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0055 }
        r0 = new java.io.File;	 Catch:{ SecurityException -> 0x002a }
        r0.<init>(r1);	 Catch:{ SecurityException -> 0x002a }
        r0.delete();	 Catch:{ SecurityException -> 0x002a }
        goto L_0x002a;	 Catch:{ SecurityException -> 0x002a }
    L_0x003f:
        r0 = r4.f32327I;	 Catch:{ all -> 0x0055 }
        r0.clear();	 Catch:{ all -> 0x0055 }
        monitor-exit(r3);	 Catch:{ all -> 0x0055 }
        r0 = r5.mAudioPlayerCoordinator;
        r0.release();
        r0 = r5.mAudioRenderCoordinator;
        r0.release();
        r0 = r5.mHybridData;
        r0.resetNative();
        return;
    L_0x0055:
        r0 = move-exception;	 Catch:{ all -> 0x0055 }
        monitor-exit(r3);	 Catch:{ all -> 0x0055 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.audioclassic.implementation.AudioServiceImpl.release():void");
    }

    public void removeMicrophoneProcessors() {
        this.mAudioRenderCoordinator.removeMicrophoneProcessors();
    }

    public void reset() {
        this.mAudioPlayerCoordinator.reset();
        this.mAudioRenderCoordinator.reset();
        this.mIsRendering = false;
    }

    public void setCurrentAssetDirectory(String str) {
        if (str.endsWith(File.separator)) {
            this.mCurrentAssetDirectory = str;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(File.separator);
        this.mCurrentAssetDirectory = stringBuilder.toString();
    }

    public void setMicrophoneProcessors(AudioProcessorConfiguration[] audioProcessorConfigurationArr) {
        this.mAudioRenderCoordinator.setMicrophoneProcessors(audioProcessorConfigurationArr);
    }

    public void setMicrophoneVolume(float f) {
        this.mAudioPlayerCoordinator.setMicrophoneVolume(f);
        this.mAudioRenderCoordinator.setMicrophoneVolume(f);
    }

    public void setRenderCallback(AudioRenderCallback audioRenderCallback) {
        this.mAudioRenderCoordinator.setRenderCallback(audioRenderCallback);
    }

    public void setVolume(float f, String str) {
        this.mAudioPlayerCoordinator.setVolume(f, str);
        this.mAudioRenderCoordinator.setVolume(f, str);
    }

    public final void startRendering(int i, boolean z) {
        if (z) {
            this.mAudioPlayerCoordinator.resetPlayerWithEchocancellation(i);
        }
        this.mAudioPlayerCoordinator.startRendering();
        this.mAudioRenderCoordinator.startRendering();
        this.mIsRendering = true;
    }

    public void stop(String str) {
        this.mAudioPlayerCoordinator.removeSound(str);
        this.mAudioRenderCoordinator.removeSound(str);
    }

    private void stopDecodingThread() {
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
        r3 = this;
        r0 = r3.mDecodingHandlerThread;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r2 = 0;
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ InterruptedException -> 0x0026 }
        r0 = 18;	 Catch:{ InterruptedException -> 0x0026 }
        if (r1 < r0) goto L_0x0012;	 Catch:{ InterruptedException -> 0x0026 }
    L_0x000c:
        r0 = r3.mDecodingHandlerThread;	 Catch:{ InterruptedException -> 0x0026 }
        r0.quitSafely();	 Catch:{ InterruptedException -> 0x0026 }
        goto L_0x001a;	 Catch:{ InterruptedException -> 0x0026 }
    L_0x0012:
        r0 = 5;	 Catch:{ InterruptedException -> 0x0026 }
        if (r1 < r0) goto L_0x001a;	 Catch:{ InterruptedException -> 0x0026 }
    L_0x0015:
        r0 = r3.mDecodingHandlerThread;	 Catch:{ InterruptedException -> 0x0026 }
        r0.quit();	 Catch:{ InterruptedException -> 0x0026 }
    L_0x001a:
        r0 = r3.mDecodingHandlerThread;	 Catch:{ InterruptedException -> 0x0026 }
        r0.join();	 Catch:{ InterruptedException -> 0x0026 }
        goto L_0x002d;	 Catch:{ InterruptedException -> 0x0026 }
    L_0x0020:
        r0 = move-exception;
        r3.mDecodingHandlerThread = r2;
        r3.mDecodingHandler = r2;
        throw r0;
    L_0x0026:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0020 }
        r0.interrupt();	 Catch:{ all -> 0x0020 }
    L_0x002d:
        r3.mDecodingHandlerThread = r2;
        r3.mDecodingHandler = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.audioclassic.implementation.AudioServiceImpl.stopDecodingThread():void");
    }
}
