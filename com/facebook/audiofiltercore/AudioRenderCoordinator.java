package com.facebook.audiofiltercore;

import X.AnonymousClass0CF;
import X.AnonymousClass0LH;
import X.AnonymousClass2g7;
import X.AnonymousClass2gF;
import X.AnonymousClass3qt;
import X.AnonymousClass3qv;
import X.AnonymousClass42w;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import com.facebook.cameracore.mediapipeline.services.audioclassic.interfaces.AudioRenderCallback;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.jni.HybridData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class AudioRenderCoordinator {
    private AccessibilityManager mAccessibilityManager;
    private AudioManager mAudioManager;
    private AudioMixer mAudioMixer;
    private AnonymousClass2gF mAudioPlayer;
    private AudioProcessorConfiguration[] mConfigs;
    private boolean mEchoCancellationEnabled;
    private final HybridData mHybridData = initHybrid();
    private boolean mIsPlaying;
    private boolean mIsRendering;
    private boolean mMicrophoneDisabled;
    private SimpleTransformOutputFilter mMicrophoneOutputFilter;
    private float mMicrophoneVolume = 1.0f;
    public Map mNonTriggeredInputs;
    private boolean mPreviewDisabled;
    public byte[] mReadBuffer;
    private AudioRenderCallback mRenderCallback;
    private boolean mShouldPlayAudio;
    private final boolean mShouldUseAudioPlayer;
    public Map mTriggeredInputs;
    private short[] mWriteBuffer;

    private static native HybridData initHybrid();

    static {
        AnonymousClass0CF.E("audiofiltercore");
    }

    public AudioRenderCoordinator(AudioManager audioManager, AccessibilityManager accessibilityManager, boolean z, boolean z2, boolean z3, AnonymousClass3qv anonymousClass3qv) {
        this.mAccessibilityManager = accessibilityManager;
        this.mAudioMixer = new AudioMixer();
        this.mTriggeredInputs = Collections.synchronizedMap(new HashMap());
        this.mNonTriggeredInputs = Collections.synchronizedMap(new HashMap());
        this.mWriteBuffer = new short[DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED];
        this.mReadBuffer = new byte[DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED];
        this.mAudioManager = audioManager;
        this.mAudioPlayer = new AnonymousClass2gF(audioManager, null, anonymousClass3qv);
        this.mShouldUseAudioPlayer = z;
        this.mPreviewDisabled = z3;
        this.mMicrophoneDisabled = z2;
        if (z2) {
            setMicrophoneVolume(0.0f);
        } else {
            setMicrophoneVolume(1.0f);
        }
        if (z && !this.mPreviewDisabled) {
            AnonymousClass2gF anonymousClass2gF = this.mAudioPlayer;
            AudioInput audioInput = this.mAudioMixer;
            AnonymousClass0LH.E(audioInput);
            anonymousClass2gF.f32345D = audioInput;
            anonymousClass2gF.f32347F.setPlaybackRate(44100);
            this.mShouldPlayAudio = true;
        }
    }

    public final void addSound(java.lang.String r4, java.lang.String r5, int r6, boolean r7, boolean r8, float r9) {
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
        r3 = this;
        r0 = r3.mNonTriggeredInputs;
        r1 = r0.get(r4);
        r1 = (X.AnonymousClass42w) r1;
        if (r8 != 0) goto L_0x0021;
    L_0x000a:
        if (r1 == 0) goto L_0x0021;
    L_0x000c:
        if (r7 == 0) goto L_0x0020;
    L_0x000e:
        r0 = r1.f48931B;
        if (r0 != 0) goto L_0x0015;
    L_0x0012:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x0019;
    L_0x0015:
        r0 = r0.getVolumeMultiplier();
    L_0x0019:
        r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1));
        if (r0 == 0) goto L_0x0020;
    L_0x001d:
        r1.m22302A(r9);
    L_0x0020:
        return;
    L_0x0021:
        r2 = new X.42w;	 Catch:{ IOException -> 0x0053 }
        r2.<init>(r5, r7, r9, r6);	 Catch:{ IOException -> 0x0053 }
        if (r8 == 0) goto L_0x0040;	 Catch:{ IOException -> 0x0053 }
    L_0x0028:
        r0 = r3.mTriggeredInputs;
        r1 = r0.get(r4);
        r1 = (java.util.HashSet) r1;
        if (r1 != 0) goto L_0x003c;
    L_0x0032:
        r1 = new java.util.HashSet;
        r1.<init>();
        r0 = r3.mTriggeredInputs;
        r0.put(r4, r1);
    L_0x003c:
        r1.add(r2);
        goto L_0x0045;
    L_0x0040:
        r0 = r3.mNonTriggeredInputs;
        r0.put(r4, r2);
    L_0x0045:
        r1 = r3.mAudioMixer;
        r0 = new X.3qu;
        r0.<init>(r3, r2, r4, r8);
        r1.addInput(r2, r0);
        r3.maybePlayAudio(r6);
        return;
    L_0x0053:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.audiofiltercore.AudioRenderCoordinator.addSound(java.lang.String, java.lang.String, int, boolean, boolean, float):void");
    }

    public final ArrayList getTimeElapsedVector(String str) {
        ArrayList arrayList = new ArrayList();
        if (this.mTriggeredInputs.get(str) != null) {
            HashSet hashSet = (HashSet) this.mTriggeredInputs.get(str);
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AnonymousClass42w anonymousClass42w = (AnonymousClass42w) it.next();
                    if (anonymousClass42w.getTimeElapsed() > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
                        arrayList.add(Double.valueOf(anonymousClass42w.getTimeElapsed()));
                    }
                }
            }
        }
        if (this.mNonTriggeredInputs.get(str) != null) {
            double timeElapsed = ((AnonymousClass42w) this.mNonTriggeredInputs.get(str)).getTimeElapsed();
            if (timeElapsed > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
                arrayList.add(Double.valueOf(timeElapsed));
            }
        }
        return arrayList;
    }

    public final boolean inputAudioData(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (i > 0) {
            if (this.mRenderCallback != null) {
                if (isTalkbackEnabled()) {
                    this.mRenderCallback.onSamplesReady(bArr, i);
                    return true;
                }
                int i4 = i / 2;
                if (this.mWriteBuffer.length < i4) {
                    this.mWriteBuffer = new short[i4];
                }
                AnonymousClass2g7.m16860B(bArr, this.mWriteBuffer, i);
                if (this.mMicrophoneOutputFilter == null && !(this.mConfigs == null && this.mMicrophoneVolume == 1.0f)) {
                    SimpleAudioTransform audioSourceTransform = new AudioSourceTransform(i2, this.mMicrophoneVolume);
                    AudioProcessorConfiguration[] audioProcessorConfigurationArr = this.mConfigs;
                    if (!(audioProcessorConfigurationArr == null || audioProcessorConfigurationArr.length == 0)) {
                        int length = audioProcessorConfigurationArr.length;
                        while (i3 < length) {
                            audioSourceTransform.addAudioProcessor(audioProcessorConfigurationArr[i3]);
                            i3++;
                        }
                    }
                    this.mMicrophoneOutputFilter = new SimpleTransformOutputFilter(audioSourceTransform);
                    this.mMicrophoneOutputFilter.setOutput(this.mAudioMixer);
                }
                NativeAudioOutput nativeAudioOutput = this.mMicrophoneOutputFilter;
                if (nativeAudioOutput != null) {
                    nativeAudioOutput.write(this.mWriteBuffer, i4);
                } else {
                    this.mAudioMixer.write(this.mWriteBuffer, i4);
                }
                return true;
            }
        }
        return false;
    }

    private boolean isTalkbackEnabled() {
        if (VERSION.SDK_INT >= 14 && this.mAccessibilityManager.isEnabled() && this.mAccessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    private void maybePlayAudio(int r6) {
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
        r5 = this;
        r0 = r5.isTalkbackEnabled();
        if (r0 != 0) goto L_0x0039;
    L_0x0006:
        r0 = r5.mShouldUseAudioPlayer;
        if (r0 == 0) goto L_0x0039;
    L_0x000a:
        r0 = r5.mShouldPlayAudio;
        if (r0 == 0) goto L_0x0039;
    L_0x000e:
        r0 = r5.mIsPlaying;
        if (r0 != 0) goto L_0x0039;
    L_0x0012:
        r1 = r5.mAudioPlayer;
        r0 = r5.mAudioMixer;
        X.AnonymousClass0LH.E(r0);
        r1.f32345D = r0;
        r0 = r1.f32347F;
        r0.setPlaybackRate(r6);
        r4 = 0;
        r3 = r5.mAudioPlayer;	 Catch:{ IllegalStateException -> 0x0037 }
        r0 = r5.mAudioPlayer;	 Catch:{ IllegalStateException -> 0x0037 }
        r2 = r0.m16876A();	 Catch:{ IllegalStateException -> 0x0037 }
        r0 = r5.mMicrophoneDisabled;	 Catch:{ IllegalStateException -> 0x0037 }
        r1 = 1;	 Catch:{ IllegalStateException -> 0x0037 }
        if (r0 != 0) goto L_0x0030;	 Catch:{ IllegalStateException -> 0x0037 }
    L_0x002e:
        r0 = 1;	 Catch:{ IllegalStateException -> 0x0037 }
        goto L_0x0031;	 Catch:{ IllegalStateException -> 0x0037 }
    L_0x0030:
        r0 = 0;	 Catch:{ IllegalStateException -> 0x0037 }
    L_0x0031:
        r3.m16878D(r2, r0);	 Catch:{ IllegalStateException -> 0x0037 }
        r5.mIsPlaying = r1;	 Catch:{ IllegalStateException -> 0x0037 }
        goto L_0x0039;	 Catch:{ IllegalStateException -> 0x0037 }
    L_0x0037:
        r5.mIsPlaying = r4;
    L_0x0039:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.audiofiltercore.AudioRenderCoordinator.maybePlayAudio(int):void");
    }

    public final void release() {
        reset();
        this.mAudioMixer.flush();
        this.mAudioMixer.close();
        this.mAudioPlayer.m16879E();
        this.mAudioPlayer.f32347F.release();
    }

    public final void removeMicrophoneProcessors() {
        NativeAudioOutput nativeAudioOutput = this.mMicrophoneOutputFilter;
        if (nativeAudioOutput != null) {
            nativeAudioOutput.flush();
            this.mMicrophoneOutputFilter = null;
        }
        this.mConfigs = null;
    }

    public final void removeSound(String str) {
        if (this.mTriggeredInputs.get(str) != null) {
            removeSoundFromInputs(this.mTriggeredInputs, str);
        }
        AnonymousClass42w anonymousClass42w = (AnonymousClass42w) this.mNonTriggeredInputs.get(str);
        if (anonymousClass42w != null) {
            this.mNonTriggeredInputs.remove(str);
            this.mAudioMixer.removeInput(anonymousClass42w);
            anonymousClass42w.close();
        }
    }

    private void removeSoundFromInputs(Map map, String str) {
        HashSet hashSet = (HashSet) map.get(str);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AudioInput audioInput = (AudioInput) it.next();
                this.mAudioMixer.removeInput(audioInput);
                audioInput.close();
            }
            map.remove(str);
        }
    }

    public final void reset() {
        this.mIsRendering = false;
        stopAudioPreview();
        resetTriggeredInputs();
        resetNonTriggeredInputs();
        NativeAudioOutput nativeAudioOutput = this.mMicrophoneOutputFilter;
        if (nativeAudioOutput != null) {
            nativeAudioOutput.flush();
            this.mMicrophoneOutputFilter = null;
        }
        this.mConfigs = null;
        boolean z = this.mShouldUseAudioPlayer && !this.mPreviewDisabled;
        this.mShouldPlayAudio = z;
        this.mEchoCancellationEnabled = false;
    }

    private void resetNonTriggeredInputs() {
        for (String str : this.mNonTriggeredInputs.keySet()) {
            AnonymousClass42w anonymousClass42w = (AnonymousClass42w) this.mNonTriggeredInputs.get(str);
            if (anonymousClass42w != null) {
                this.mAudioMixer.removeInput(anonymousClass42w);
                anonymousClass42w.close();
            }
        }
        this.mNonTriggeredInputs.clear();
    }

    public final void resetPlayerWithEchocancellation(int i) {
        this.mEchoCancellationEnabled = true;
        this.mAudioManager.setSpeakerphoneOn(false);
        stopAudioPreview();
        this.mAudioPlayer.m16879E();
        this.mAudioPlayer.f32347F.release();
        this.mAudioPlayer = new AnonymousClass2gF(this.mAudioManager, Integer.valueOf(i));
    }

    private void resetTriggeredInputs() {
        for (String str : this.mTriggeredInputs.keySet()) {
            HashSet hashSet = (HashSet) this.mTriggeredInputs.get(str);
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AudioInput audioInput = (AudioInput) it.next();
                    this.mAudioMixer.removeInput(audioInput);
                    audioInput.close();
                }
            }
        }
        this.mTriggeredInputs.clear();
    }

    public final void setMicrophoneProcessors(AudioProcessorConfiguration[] audioProcessorConfigurationArr) {
        NativeAudioOutput nativeAudioOutput = this.mMicrophoneOutputFilter;
        if (nativeAudioOutput != null) {
            nativeAudioOutput.flush();
            this.mMicrophoneOutputFilter = null;
        }
        this.mConfigs = audioProcessorConfigurationArr;
    }

    public final void setMicrophoneVolume(float f) {
        if (this.mMicrophoneVolume != f) {
            NativeAudioOutput nativeAudioOutput = this.mMicrophoneOutputFilter;
            if (nativeAudioOutput != null) {
                nativeAudioOutput.flush();
                this.mMicrophoneOutputFilter = null;
            }
        }
        this.mMicrophoneVolume = f;
        this.mMicrophoneDisabled = f == 0.0f;
        updateAudioPreviewState();
    }

    public final void setRenderCallback(AudioRenderCallback audioRenderCallback) {
        this.mRenderCallback = audioRenderCallback;
        this.mAudioMixer.setOutput(new AnonymousClass3qt(this, audioRenderCallback));
    }

    public final void setVolume(float f, String str) {
        HashSet hashSet = (HashSet) this.mTriggeredInputs.get(str);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((AnonymousClass42w) it.next()).m22302A(f);
            }
        }
    }

    public final void startRendering() {
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
        r4 = this;
        r0 = 1;
        r4.mIsRendering = r0;
        r4.updateAudioPreviewState();
        r0 = r4.mTriggeredInputs;
        r0 = r0.keySet();
        r3 = r0.iterator();
    L_0x0010:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x003f;
    L_0x0016:
        r1 = r3.next();
        r1 = (java.lang.String) r1;
        r0 = r4.mTriggeredInputs;
        r0 = r0.get(r1);
        r0 = (java.util.HashSet) r0;
        if (r0 == 0) goto L_0x0010;
    L_0x0026:
        r2 = r0.iterator();
    L_0x002a:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0010;
    L_0x0030:
        r1 = r2.next();
        r1 = (X.AnonymousClass42w) r1;
        r0 = r4.mAudioMixer;
        r0.removeInput(r1);
        r1.close();
        goto L_0x002a;
    L_0x003f:
        r0 = r4.mTriggeredInputs;
        r0.clear();
        r0 = r4.mNonTriggeredInputs;
        r0 = r0.keySet();
        r3 = r0.iterator();
    L_0x004e:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0076;
    L_0x0054:
        r2 = r3.next();
        r2 = (java.lang.String) r2;
        r0 = r4.mNonTriggeredInputs;
        r1 = r0.get(r2);
        r1 = (X.AnonymousClass42w) r1;
        if (r1 == 0) goto L_0x004e;
    L_0x0064:
        r1.restart();	 Catch:{ IOException -> 0x0068 }
        goto L_0x004e;	 Catch:{ IOException -> 0x0068 }
    L_0x0068:
        r0 = r4.mAudioMixer;
        r0.removeInput(r1);
        r0 = r4.mNonTriggeredInputs;
        r0.remove(r2);
        r1.close();
        goto L_0x004e;
    L_0x0076:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.audiofiltercore.AudioRenderCoordinator.startRendering():void");
    }

    private void stopAudioPreview() {
        if (this.mIsPlaying) {
            this.mAudioPlayer.m16877C();
            this.mIsPlaying = false;
        }
    }

    private void updateAudioPreviewState() {
        boolean z;
        if (!(this.mMicrophoneDisabled || !this.mIsRendering || this.mAudioPlayer.m16876A())) {
            if (!this.mEchoCancellationEnabled) {
                z = false;
                this.mShouldPlayAudio = z;
                if (z) {
                    stopAudioPreview();
                } else {
                    maybePlayAudio(44100);
                }
            }
        }
        z = true;
        this.mShouldPlayAudio = z;
        if (z) {
            stopAudioPreview();
        } else {
            maybePlayAudio(44100);
        }
    }
}
