package com.facebook.ffmpeg;

import X.AnonymousClass1ud;

public class FFMpegMediaMetadataRetriever {
    private final AnonymousClass1ud mFFMpegLib;
    private long mNativeContext;
    private final String mPath;

    private native void nativeFinalize();

    private native int nativeGetAudioBitRate();

    private native int nativeGetBitRate();

    private native String nativeGetCodecType();

    private native long nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetRotation();

    private native String nativeGetSphericalMetadataXml();

    private native int nativeGetWidth();

    private native void nativeInit(String str);

    private native void nativeRelease();

    public FFMpegMediaMetadataRetriever(AnonymousClass1ud anonymousClass1ud, String str) {
        this.mFFMpegLib = anonymousClass1ud;
        this.mPath = str;
    }

    public final void finalize() {
        super.finalize();
        nativeFinalize();
    }

    public final int getRotation() {
        return nativeGetRotation();
    }

    public final FFMpegMediaMetadataRetriever initialize() {
        this.mFFMpegLib.A();
        nativeInit(this.mPath);
        return this;
    }

    public final void release() {
        nativeRelease();
    }
}
