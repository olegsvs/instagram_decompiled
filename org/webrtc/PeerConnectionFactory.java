package org.webrtc;

import android.content.Context;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.webrtc.EglBase.-CC;
import org.webrtc.Logging.Severity;
import org.webrtc.NativeLibrary.DefaultLoader;
import org.webrtc.PeerConnection.Observer;
import org.webrtc.PeerConnection.RTCConfiguration;
import org.webrtc.audio.AudioDeviceModule;
import org.webrtc.audio.LegacyAudioDeviceModule;

public class PeerConnectionFactory {
    private static final String TAG = "PeerConnectionFactory";
    public static final String TRIAL_ENABLED = "Enabled";
    private static final String VIDEO_CAPTURER_THREAD_NAME = "VideoCapturerThread";
    public static final String VIDEO_FRAME_EMIT_TRIAL = "VideoFrameEmit";
    private static volatile boolean internalTracerInitialized;
    private static Thread networkThread;
    private static Thread signalingThread;
    private static Thread workerThread;
    private EglBase localEglbase;
    private final long nativeFactory;
    private EglBase remoteEglbase;

    public class Builder {
        private AudioDeviceModule audioDeviceModule;
        private AudioProcessingFactory audioProcessingFactory;
        private VideoDecoderFactory decoderFactory;
        private VideoEncoderFactory encoderFactory;
        private FecControllerFactoryFactoryInterface fecControllerFactoryFactory;
        private Options options;

        public Builder() {
            this.audioDeviceModule = new LegacyAudioDeviceModule();
        }

        public PeerConnectionFactory createPeerConnectionFactory() {
            return new PeerConnectionFactory(this.options, this.audioDeviceModule, this.encoderFactory, this.decoderFactory, this.audioProcessingFactory, this.fecControllerFactoryFactory);
        }

        public Builder setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
            this.audioDeviceModule = audioDeviceModule;
            return this;
        }

        public Builder setAudioProcessingFactory(AudioProcessingFactory audioProcessingFactory) {
            if (audioProcessingFactory != null) {
                this.audioProcessingFactory = audioProcessingFactory;
                return this;
            }
            throw new NullPointerException("PeerConnectionFactory builder does not accept a null AudioProcessingFactory.");
        }

        public Builder setFecControllerFactoryFactoryInterface(FecControllerFactoryFactoryInterface fecControllerFactoryFactoryInterface) {
            this.fecControllerFactoryFactory = fecControllerFactoryFactoryInterface;
            return this;
        }

        public Builder setOptions(Options options) {
            this.options = options;
            return this;
        }

        public Builder setVideoDecoderFactory(VideoDecoderFactory videoDecoderFactory) {
            this.decoderFactory = videoDecoderFactory;
            return this;
        }

        public Builder setVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory) {
            this.encoderFactory = videoEncoderFactory;
            return this;
        }
    }

    public class InitializationOptions {
        public final Context applicationContext;
        public final boolean enableInternalTracer;
        public final boolean enableVideoHwAcceleration;
        public final String fieldTrials;
        public Loggable loggable;
        public Severity loggableSeverity;
        public final NativeLibraryLoader nativeLibraryLoader;

        public class Builder {
            private final Context applicationContext;
            private boolean enableInternalTracer = false;
            private boolean enableVideoHwAcceleration = true;
            private String fieldTrials = JsonProperty.USE_DEFAULT_NAME;
            private Loggable loggable = null;
            private Severity loggableSeverity = null;
            private NativeLibraryLoader nativeLibraryLoader = new DefaultLoader();

            public Builder(Context context) {
                this.applicationContext = context;
            }

            public InitializationOptions createInitializationOptions() {
                return new InitializationOptions(this.applicationContext, this.fieldTrials, this.enableInternalTracer, this.enableVideoHwAcceleration, this.nativeLibraryLoader, this.loggable, this.loggableSeverity);
            }

            public Builder setEnableInternalTracer(boolean z) {
                this.enableInternalTracer = z;
                return this;
            }

            public Builder setEnableVideoHwAcceleration(boolean z) {
                this.enableVideoHwAcceleration = z;
                return this;
            }

            public Builder setFieldTrials(String str) {
                this.fieldTrials = str;
                return this;
            }

            public Builder setInjectableLogger(Loggable loggable, Severity severity) {
                this.loggable = loggable;
                this.loggableSeverity = severity;
                return this;
            }

            public Builder setNativeLibraryLoader(NativeLibraryLoader nativeLibraryLoader) {
                this.nativeLibraryLoader = nativeLibraryLoader;
                return this;
            }
        }

        public InitializationOptions(Context context, String str, boolean z, boolean z2, NativeLibraryLoader nativeLibraryLoader, Loggable loggable, Severity severity) {
            this.applicationContext = context;
            this.fieldTrials = str;
            this.enableInternalTracer = z;
            this.enableVideoHwAcceleration = z2;
            this.nativeLibraryLoader = nativeLibraryLoader;
            this.loggable = loggable;
            this.loggableSeverity = severity;
        }

        public static Builder builder(Context context) {
            return new Builder(context);
        }
    }

    public class Options {
        public static final int ADAPTER_TYPE_CELLULAR = 4;
        public static final int ADAPTER_TYPE_ETHERNET = 1;
        public static final int ADAPTER_TYPE_LOOPBACK = 16;
        public static final int ADAPTER_TYPE_UNKNOWN = 0;
        public static final int ADAPTER_TYPE_VPN = 8;
        public static final int ADAPTER_TYPE_WIFI = 2;
        public boolean disableEncryption;
        public boolean disableNetworkMonitor;
        public boolean enableAes128Sha1_32CryptoCipher;
        public int networkIgnoreMask;

        public boolean getDisableEncryption() {
            return this.disableEncryption;
        }

        public boolean getDisableNetworkMonitor() {
            return this.disableNetworkMonitor;
        }

        public boolean getEnableAes128Sha1_32CryptoCipher() {
            return this.enableAes128Sha1_32CryptoCipher;
        }

        public int getNetworkIgnoreMask() {
            return this.networkIgnoreMask;
        }
    }

    private static native long nativeCreateAudioSource(long j, MediaConstraints mediaConstraints);

    private static native long nativeCreateAudioTrack(long j, String str, long j2);

    private static native long nativeCreateLocalMediaStream(long j, String str);

    private static native long nativeCreatePeerConnection(long j, RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, long j2);

    private static native long nativeCreatePeerConnectionFactory(Context context, Options options, long j, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, long j2, long j3);

    private static native long nativeCreateVideoSource(long j, boolean z);

    private static native long nativeCreateVideoTrack(long j, String str, long j2);

    private static native void nativeDeleteLoggable();

    private static native String nativeFindFieldTrialsFullName(String str);

    private static native void nativeFreeFactory(long j);

    private static native long nativeGetNativePeerConnectionFactory(long j);

    private static native void nativeInitializeAndroidGlobals(boolean z);

    private static native void nativeInitializeFieldTrials(String str);

    private static native void nativeInitializeInternalTracer();

    private static native void nativeInjectLoggable(JNILogging jNILogging, int i);

    private static native void nativeInvokeThreadsCallbacks(long j);

    private static native void nativeSetVideoHwAccelerationOptions(long j, Object obj, Object obj2);

    private static native void nativeShutdownInternalTracer();

    private static native boolean nativeStartAecDump(long j, int i, int i2);

    private static native boolean nativeStartInternalTracingCapture(String str);

    private static native void nativeStopAecDump(long j);

    private static native void nativeStopInternalTracingCapture();

    public PeerConnectionFactory(long j) {
        checkInitializeHasBeenCalled();
        if (j != 0) {
            this.nativeFactory = j;
            return;
        }
        throw new RuntimeException("Failed to initialize PeerConnectionFactory!");
    }

    public PeerConnectionFactory(Options options, AudioDeviceModule audioDeviceModule, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, AudioProcessingFactory audioProcessingFactory, FecControllerFactoryFactoryInterface fecControllerFactoryFactoryInterface) {
        long j;
        long j2;
        long j3;
        checkInitializeHasBeenCalled();
        Context applicationContext = ContextUtils.getApplicationContext();
        if (audioDeviceModule == null) {
            j = 0;
        } else {
            j = audioDeviceModule.getNativeAudioDeviceModulePointer();
        }
        if (audioProcessingFactory == null) {
            j2 = 0;
        } else {
            j2 = audioProcessingFactory.createNative();
        }
        if (fecControllerFactoryFactoryInterface == null) {
            j3 = 0;
        } else {
            j3 = fecControllerFactoryFactoryInterface.createNative();
        }
        long nativeCreatePeerConnectionFactory = nativeCreatePeerConnectionFactory(applicationContext, options, j, videoEncoderFactory, videoDecoderFactory, j2, j3);
        this.nativeFactory = nativeCreatePeerConnectionFactory;
        if (nativeCreatePeerConnectionFactory == 0) {
            throw new RuntimeException("Failed to initialize PeerConnectionFactory!");
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void checkInitializeHasBeenCalled() {
        if (!NativeLibrary.isLoaded() || ContextUtils.getApplicationContext() == null) {
            throw new IllegalStateException("PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory.");
        }
    }

    public AudioSource createAudioSource(MediaConstraints mediaConstraints) {
        return new AudioSource(nativeCreateAudioSource(this.nativeFactory, mediaConstraints));
    }

    public AudioTrack createAudioTrack(String str, AudioSource audioSource) {
        return new AudioTrack(nativeCreateAudioTrack(this.nativeFactory, str, audioSource.nativeSource));
    }

    public MediaStream createLocalMediaStream(String str) {
        return new MediaStream(nativeCreateLocalMediaStream(this.nativeFactory, str));
    }

    public PeerConnection createPeerConnection(List list, MediaConstraints mediaConstraints, Observer observer) {
        return createPeerConnection(new RTCConfiguration(list), mediaConstraints, observer);
    }

    public PeerConnection createPeerConnection(List list, Observer observer) {
        return createPeerConnection(new RTCConfiguration(list), observer);
    }

    public PeerConnection createPeerConnection(RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, Observer observer) {
        long createNativePeerConnectionObserver = PeerConnection.createNativePeerConnectionObserver(observer);
        if (createNativePeerConnectionObserver != 0) {
            long nativeCreatePeerConnection = nativeCreatePeerConnection(this.nativeFactory, rTCConfiguration, mediaConstraints, createNativePeerConnectionObserver);
            if (nativeCreatePeerConnection != 0) {
                return new PeerConnection(nativeCreatePeerConnection);
            }
        }
        return null;
    }

    public PeerConnection createPeerConnection(RTCConfiguration rTCConfiguration, Observer observer) {
        return createPeerConnection(rTCConfiguration, null, observer);
    }

    public VideoSource createVideoSource(VideoCapturer videoCapturer) {
        EglBase eglBase = this.localEglbase;
        SurfaceTextureHelper create = SurfaceTextureHelper.create(VIDEO_CAPTURER_THREAD_NAME, eglBase == null ? null : eglBase.getEglBaseContext());
        VideoSource videoSource = new VideoSource(nativeCreateVideoSource(this.nativeFactory, videoCapturer.isScreencast()), create);
        videoCapturer.initialize(create, ContextUtils.getApplicationContext(), videoSource.getCapturerObserver());
        return videoSource;
    }

    public VideoSource createVideoSource(boolean z) {
        return new VideoSource(nativeCreateVideoSource(this.nativeFactory, z));
    }

    public VideoTrack createVideoTrack(String str, VideoSource videoSource) {
        return new VideoTrack(nativeCreateVideoTrack(this.nativeFactory, str, videoSource.nativeSource));
    }

    public void dispose() {
        nativeFreeFactory(this.nativeFactory);
        networkThread = null;
        workerThread = null;
        signalingThread = null;
        EglBase eglBase = this.localEglbase;
        if (eglBase != null) {
            eglBase.release();
        }
        eglBase = this.remoteEglbase;
        if (eglBase != null) {
            eglBase.release();
        }
    }

    public static String fieldTrialsFindFullName(String str) {
        return NativeLibrary.isLoaded() ? nativeFindFieldTrialsFullName(str) : JsonProperty.USE_DEFAULT_NAME;
    }

    public long getNativeOwnedFactoryAndThreads() {
        return this.nativeFactory;
    }

    public long getNativePeerConnectionFactory() {
        return nativeGetNativePeerConnectionFactory(this.nativeFactory);
    }

    public static void initialize(InitializationOptions initializationOptions) {
        ContextUtils.initialize(initializationOptions.applicationContext);
        NativeLibrary.initialize(initializationOptions.nativeLibraryLoader);
        nativeInitializeAndroidGlobals(initializationOptions.enableVideoHwAcceleration);
        nativeInitializeFieldTrials(initializationOptions.fieldTrials);
        if (initializationOptions.enableInternalTracer && !internalTracerInitialized) {
            initializeInternalTracer();
        }
        if (initializationOptions.loggable != null) {
            Logging.injectLoggable(initializationOptions.loggable, initializationOptions.loggableSeverity);
            nativeInjectLoggable(new JNILogging(initializationOptions.loggable), initializationOptions.loggableSeverity.ordinal());
            return;
        }
        Logging.m29383d(TAG, "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted.");
        Logging.deleteInjectedLoggable();
        nativeDeleteLoggable();
    }

    public static void initializeFieldTrials(String str) {
        nativeInitializeFieldTrials(str);
    }

    private static void initializeInternalTracer() {
        internalTracerInitialized = true;
        nativeInitializeInternalTracer();
    }

    private static void onNetworkThreadReady() {
        networkThread = Thread.currentThread();
        Logging.m29383d(TAG, "onNetworkThreadReady");
    }

    private static void onSignalingThreadReady() {
        signalingThread = Thread.currentThread();
        Logging.m29383d(TAG, "onSignalingThreadReady");
    }

    private static void onWorkerThreadReady() {
        workerThread = Thread.currentThread();
        Logging.m29383d(TAG, "onWorkerThreadReady");
    }

    private static void printStackTrace(Thread thread, String str) {
        if (thread != null) {
            thread = thread.getStackTrace();
            if (thread.length > 0) {
                String str2 = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" stacks trace:");
                Logging.m29383d(str2, stringBuilder.toString());
                for (StackTraceElement stackTraceElement : thread) {
                    Logging.m29383d(TAG, stackTraceElement.toString());
                }
            }
        }
    }

    public static void printStackTraces() {
        printStackTrace(networkThread, "Network thread");
        printStackTrace(workerThread, "Worker thread");
        printStackTrace(signalingThread, "Signaling thread");
    }

    public void setVideoHwAccelerationOptions(EglBase.Context context, EglBase.Context context2) {
        if (this.localEglbase != null) {
            Logging.m29387w(TAG, "Egl context already set.");
            this.localEglbase.release();
        }
        if (this.remoteEglbase != null) {
            Logging.m29387w(TAG, "Egl context already set.");
            this.remoteEglbase.release();
        }
        this.localEglbase = -CC.create(context);
        this.remoteEglbase = -CC.create(context2);
        nativeSetVideoHwAccelerationOptions(this.nativeFactory, this.localEglbase.getEglBaseContext(), this.remoteEglbase.getEglBaseContext());
    }

    public static void shutdownInternalTracer() {
        internalTracerInitialized = false;
        nativeShutdownInternalTracer();
    }

    public boolean startAecDump(int i, int i2) {
        return nativeStartAecDump(this.nativeFactory, i, i2);
    }

    public static boolean startInternalTracingCapture(String str) {
        return nativeStartInternalTracingCapture(str);
    }

    public void stopAecDump() {
        nativeStopAecDump(this.nativeFactory);
    }

    public static void stopInternalTracingCapture() {
        nativeStopInternalTracingCapture();
    }

    public void threadsCallbacks() {
        nativeInvokeThreadsCallbacks(this.nativeFactory);
    }
}
