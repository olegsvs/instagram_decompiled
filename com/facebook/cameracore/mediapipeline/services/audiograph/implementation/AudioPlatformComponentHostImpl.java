package com.facebook.cameracore.mediapipeline.services.audiograph.implementation;

import X.AnonymousClass00y;
import X.AnonymousClass0Dc;
import X.AnonymousClass0LH;
import X.AnonymousClass1pJ;
import X.AnonymousClass2g7;
import X.AnonymousClass2gF;
import X.AnonymousClass3qv;
import X.AnonymousClass3ry;
import android.content.Context;
import android.media.AudioManager;
import com.facebook.audiofiltercore.AudioInput;
import com.facebook.cameracore.mediapipeline.services.audioclassic.interfaces.AudioRenderCallback;
import com.facebook.cameracore.mediapipeline.services.audiograph.interfaces.AudioPlatformComponentHost;
import com.facebook.jni.HybridData;
import java.io.File;
import org.webrtc.MediaStreamTrack;

public class AudioPlatformComponentHostImpl extends AudioPlatformComponentHost {
    public static final Class TAG = AudioPlatformComponentHostImpl.class;
    private String mAssetsDirectory;
    private AnonymousClass1pJ mAudioDecoder;
    private AudioGraphServiceController mAudioGraphServiceController;
    private AudioInputPreview mAudioInputPreview;
    private final AudioManager mAudioManager;
    private AnonymousClass2gF mAudioPlayer;
    private final AnonymousClass3qv mAudioSamplesReader;
    private final int mDefaultSampleRate;
    private short[] mInputSamples;
    private boolean mIsCaptureEnabled;
    private boolean mIsEchoCancellationActivated;
    public boolean mIsEffectLoaded;
    private boolean mIsRecording;
    private boolean mIsRecordingPrepared;
    private MicrophoneSink mMicrophoneSink;
    private byte[] mOutputBytes;
    private short[] mOutputSamples;
    private AudioRenderCallback mRenderCallback;

    private native double getDefaultSampleRate();

    private native HybridData initHybrid();

    private native void readAudioFileFinished(String str);

    private native void readAudioFileReady(String str, short[] sArr, int i);

    private native void readAudioFileStarted(String str, double d, boolean z);

    public AudioPlatformComponentHostImpl(Context context) {
        this(context, null);
    }

    public AudioPlatformComponentHostImpl(Context context, AnonymousClass3qv anonymousClass3qv) {
        this.mIsCaptureEnabled = true;
        this.mIsEchoCancellationActivated = false;
        this.mIsRecording = false;
        this.mIsEffectLoaded = false;
        this.mIsRecordingPrepared = false;
        this.mHybridData = initHybrid();
        this.mAudioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.mAudioSamplesReader = anonymousClass3qv;
        int defaultSampleRate = (int) getDefaultSampleRate();
        this.mDefaultSampleRate = defaultSampleRate;
        this.mInputSamples = new short[defaultSampleRate];
        this.mOutputSamples = new short[defaultSampleRate];
        this.mOutputBytes = new byte[(defaultSampleRate * 2)];
    }

    private AnonymousClass3ry createAudioDecoderListener(String str) {
        return new AnonymousClass3ry(this, str);
    }

    public AudioGraphServiceController createAudioGraphServiceController() {
        if (this.mAudioGraphServiceController == null) {
            this.mAudioGraphServiceController = new AudioGraphServiceController();
        }
        return this.mAudioGraphServiceController;
    }

    public MicrophoneSink createMicrophoneSink() {
        if (this.mMicrophoneSink == null) {
            this.mMicrophoneSink = new MicrophoneSink();
        }
        return this.mMicrophoneSink;
    }

    private void createPreviewPlayer() {
        AnonymousClass00y.B(this.mAudioInputPreview, "AudioPlatformComponentHostImpl.java > createPreviewPlayer() > mAudioInputPreview is null");
        AnonymousClass2gF anonymousClass2gF = new AnonymousClass2gF(this.mAudioManager, null, this.mAudioSamplesReader);
        this.mAudioPlayer = anonymousClass2gF;
        AudioInput audioInput = this.mAudioInputPreview;
        int i = this.mDefaultSampleRate;
        AnonymousClass0LH.E(audioInput);
        anonymousClass2gF.f32345D = audioInput;
        anonymousClass2gF.f32347F.setPlaybackRate(i);
    }

    private void destroyPreviewPlayer() {
        AnonymousClass2gF anonymousClass2gF = this.mAudioPlayer;
        if (anonymousClass2gF != null) {
            anonymousClass2gF.m16879E();
            this.mAudioPlayer.f32347F.release();
            this.mAudioPlayer = null;
        }
    }

    private boolean effectUsesMicrophone() {
        return this.mMicrophoneSink != null;
    }

    private static boolean isPathExistsAndValid(String str) {
        if (str.contains("../")) {
            return false;
        }
        return new File(str).exists();
    }

    public void onEffectLoaded(String str, boolean z) {
        String str2 = "AudioPlatformComponentHostImpl.java > onEffectLoaded() > effect is already loaded";
        if ((this.mIsEffectLoaded ^ 1) != 0) {
            AnonymousClass00y.B(this.mHybridData, "AudioPlatformComponentHostImpl.java > onEffectLoaded() > mHybridData is null");
            AnonymousClass00y.B(this.mAudioGraphServiceController, "AudioPlatformComponentHostImpl.java > onEffectLoaded() > mAudioGraphServiceController is null");
            this.mAudioDecoder = new AnonymousClass1pJ();
            setAssetDirectory(str);
            if (z) {
                this.mAudioInputPreview = new AudioInputPreview(this.mAudioGraphServiceController, (int) getDefaultSampleRate());
                createPreviewPlayer();
            }
            updateAudioPreviewState();
            this.mIsEffectLoaded = true;
            prepareRecording();
            return;
        }
        throw new IllegalStateException(str2);
    }

    public void onEffectReleased() {
        if (this.mIsEffectLoaded) {
            this.mIsEffectLoaded = false;
            this.mIsEchoCancellationActivated = false;
            this.mIsCaptureEnabled = true;
            this.mIsRecordingPrepared = false;
            AnonymousClass1pJ anonymousClass1pJ = this.mAudioDecoder;
            if (anonymousClass1pJ != null) {
                synchronized (anonymousClass1pJ) {
                    anonymousClass1pJ.f23139C.shutdown();
                }
                this.mAudioDecoder = null;
            }
            updateAudioPreviewState();
            updateAudioCaptureState();
            destroyPreviewPlayer();
            AudioInputPreview audioInputPreview = this.mAudioInputPreview;
            if (audioInputPreview != null) {
                audioInputPreview.close();
                this.mAudioInputPreview = null;
            }
            MicrophoneSink microphoneSink = this.mMicrophoneSink;
            if (microphoneSink != null) {
                microphoneSink.release();
                this.mMicrophoneSink = null;
            }
        }
    }

    public final boolean onInputDataAvailable(byte[] bArr, int i, int i2) {
        if (!this.mIsRecordingPrepared) {
            return false;
        }
        if (effectUsesMicrophone()) {
            int i3 = i2 / 2;
            if (this.mInputSamples.length < i3) {
                this.mInputSamples = new short[(i3 * 2)];
            }
            AnonymousClass2g7.m16860B(bArr, this.mInputSamples, i2);
            this.mMicrophoneSink.write(this.mInputSamples, i3, i);
        }
        return renderSamples(i2 / 2, i);
    }

    public void onServiceCreated() {
        AnonymousClass00y.B(this.mHybridData, "AudioPlatformComponentHostImpl.java > onServiceCreated() > mHybridData is null");
        AnonymousClass00y.B(this.mAudioGraphServiceController, "AudioPlatformComponentHostImpl.java > onServiceCreated() > mAudioGraphServiceController is null");
    }

    public void onServiceDestroyed() {
        AnonymousClass00y.B(this.mAudioGraphServiceController, "AudioPlatformComponentHostImpl.java > onServiceDestroyed() > mAudioGraphServiceController is null");
        String str = "AudioPlatformComponentHostImpl.java > onServiceDestroyed() > effect is not released yet";
        if ((this.mIsEffectLoaded ^ 1) != 0) {
            this.mAudioGraphServiceController.release();
            this.mAudioGraphServiceController = null;
            return;
        }
        throw new IllegalStateException(str);
    }

    private void pause() {
        AnonymousClass2gF anonymousClass2gF = this.mAudioPlayer;
        if (anonymousClass2gF != null) {
            if (anonymousClass2gF.f32348G) {
                this.mAudioPlayer.m16877C();
            }
        }
    }

    private void play() {
        AnonymousClass2gF anonymousClass2gF = this.mAudioPlayer;
        if (anonymousClass2gF == null) {
            return;
        }
        if (!anonymousClass2gF.f32348G) {
            try {
                this.mAudioPlayer.m16878D(this.mAudioPlayer.m16876A(), effectUsesMicrophone());
            } catch (Throwable e) {
                AnonymousClass0Dc.C(TAG, "Exception", e);
            }
        }
    }

    private void prepareRecording() {
        if (this.mIsEffectLoaded) {
            if (this.mIsRecording) {
                updateAudioPreviewState();
                updateAudioCaptureState();
                this.mIsRecordingPrepared = true;
            }
        }
    }

    public void readAudioFile(String str, String str2) {
        AnonymousClass00y.B(this.mAssetsDirectory, "AudioPlatformComponentHostImpl.java > readAudioFile() > mAssetsDirectory is null");
        AnonymousClass00y.B(this.mHybridData, "AudioPlatformComponentHostImpl.java > readAudioFile() > mHybridData is null");
        AnonymousClass00y.B(this.mAudioDecoder, "AudioPlatformComponentHostImpl.java > readAudioFile() > mAudioDecoder is null");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.mAssetsDirectory);
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        if (isPathExistsAndValid(stringBuilder2)) {
            this.mAudioDecoder.m13369A(stringBuilder2, createAudioDecoderListener(str2));
        } else {
            AnonymousClass0Dc.B(TAG, "File does not exist or is not valid");
        }
    }

    private boolean renderSamples(int i, int i2) {
        AnonymousClass00y.B(this.mAudioGraphServiceController, "AudioPlatformComponentHostImpl.java > renderSamples() > mAudioGraphServiceController is null");
        AnonymousClass00y.B(this.mRenderCallback, "AudioPlatformComponentHostImpl.java > renderSamples() > mRenderCallback is null");
        if (this.mOutputSamples.length < i) {
            this.mOutputSamples = new short[(i * 2)];
        }
        int readCaptureSamples = this.mAudioGraphServiceController.readCaptureSamples(this.mOutputSamples, i, i2);
        if (readCaptureSamples == 0) {
            return false;
        }
        int i3 = readCaptureSamples * 2;
        if (this.mOutputBytes.length < i3) {
            this.mOutputBytes = new byte[(i3 * 2)];
        }
        AnonymousClass2g7.m16861C(this.mOutputSamples, this.mOutputBytes, readCaptureSamples);
        this.mRenderCallback.onSamplesReady(this.mOutputBytes, i3);
        return true;
    }

    private void setAssetDirectory(String str) {
        if (str.endsWith(File.separator)) {
            this.mAssetsDirectory = str;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(File.separator);
        this.mAssetsDirectory = stringBuilder.toString();
    }

    public final void setRenderCallback(AudioRenderCallback audioRenderCallback) {
        this.mRenderCallback = audioRenderCallback;
    }

    public final void startRecording(boolean z) {
        this.mIsRecording = true;
        this.mIsEchoCancellationActivated = z;
        prepareRecording();
    }

    public final void stopRecording() {
        this.mIsRecording = false;
        this.mIsEchoCancellationActivated = false;
        this.mIsRecordingPrepared = false;
        updateAudioPreviewState();
        updateAudioCaptureState();
    }

    private void updateAudioCaptureState() {
        if (this.mAudioGraphServiceController != null) {
            boolean z = this.mIsCaptureEnabled && this.mIsRecording;
            this.mAudioGraphServiceController.setCaptureEnabled(z);
        }
    }

    private void updateAudioPreviewState() {
        if (this.mAudioPlayer != null) {
            Object obj = 1;
            Object obj2 = (this.mIsRecording && effectUsesMicrophone() && !this.mIsEchoCancellationActivated) ? 1 : null;
            if (obj2 != null) {
                if (!this.mAudioPlayer.m16876A()) {
                    obj = null;
                }
            }
            AnonymousClass2gF anonymousClass2gF = this.mAudioPlayer;
            float f = obj != null ? 1.0f : 0.0f;
            anonymousClass2gF.f32347F.setStereoVolume(f, f);
            if (obj != null) {
                play();
            } else {
                pause();
            }
        }
    }
}
