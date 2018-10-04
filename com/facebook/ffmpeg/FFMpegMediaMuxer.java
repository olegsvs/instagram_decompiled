package com.facebook.ffmpeg;

import X.AnonymousClass1ud;

public class FFMpegMediaMuxer {
    private final boolean mEnableFragmentedMp4File;
    private final AnonymousClass1ud mFFMpegLib;
    private final String mFragmentDuration;
    private long mNativeContext;
    private final String mPath;

    private native FFMpegAVStream nativeAddStream(FFMpegMediaFormat fFMpegMediaFormat, int i);

    private native void nativeFinalize();

    private native void nativeInit(String str);

    private native void nativeStart(boolean z, String str);

    private native void nativeStop();

    public FFMpegMediaMuxer(AnonymousClass1ud anonymousClass1ud, String str, boolean z) {
        this(anonymousClass1ud, str, z, null);
    }

    public FFMpegMediaMuxer(AnonymousClass1ud anonymousClass1ud, String str, boolean z, String str2) {
        this.mFFMpegLib = anonymousClass1ud;
        this.mPath = str;
        this.mEnableFragmentedMp4File = z;
        this.mFragmentDuration = str2;
    }

    public final FFMpegAVStream addStream(FFMpegMediaFormat fFMpegMediaFormat) {
        return addStream(fFMpegMediaFormat, -1);
    }

    public final FFMpegAVStream addStream(FFMpegMediaFormat fFMpegMediaFormat, int i) {
        return nativeAddStream(fFMpegMediaFormat, i);
    }

    public final void finalize() {
        super.finalize();
        nativeFinalize();
    }

    public final FFMpegMediaMuxer initialize() {
        this.mFFMpegLib.A();
        nativeInit(this.mPath);
        return this;
    }

    public final void start() {
        nativeStart(this.mEnableFragmentedMp4File, this.mFragmentDuration);
    }

    public final void stop() {
        nativeStop();
    }
}
