package com.facebook.ffmpeg;

import X.AnonymousClass1tB;
import X.AnonymousClass1ud;
import java.nio.ByteBuffer;

public class FFMpegMediaDemuxer {
    private final AnonymousClass1ud mFFMpegLib;
    private long mNativeContext;
    private final Options mOptions;
    private final String mPath;

    public class Options {
        public boolean autoConvertPacketData = false;
        public boolean ensureSafeFileNames = false;
    }

    private native boolean nativeAdvance();

    private native void nativeFinalize();

    private native long nativeGetSampleDuration();

    private native int nativeGetSampleFlags();

    private native long nativeGetSampleTime();

    private native int nativeGetSampleTrackIndex();

    private native int nativeGetTrackCount();

    private native FFMpegMediaFormat nativeGetTrackFormat(int i);

    private native void nativeInit(String str, Options options);

    private native int nativeReadSampleData(ByteBuffer byteBuffer, int i);

    private native void nativeRelease();

    private native void nativeSeekTo(int i, long j, int i2);

    private native void nativeSelectTrack(int i);

    private native void nativeUnselectTrack(int i);

    public FFMpegMediaDemuxer(AnonymousClass1ud anonymousClass1ud, String str) {
        this(anonymousClass1ud, str, null);
    }

    public FFMpegMediaDemuxer(AnonymousClass1ud anonymousClass1ud, String str, Options options) {
        this.mFFMpegLib = anonymousClass1ud;
        this.mPath = str;
        this.mOptions = options;
    }

    public final boolean advance() {
        return nativeAdvance();
    }

    public final void finalize() {
        super.finalize();
        nativeFinalize();
    }

    public final long getSampleDuration() {
        return nativeGetSampleDuration();
    }

    public final int getSampleFlags() {
        return nativeGetSampleFlags();
    }

    public final long getSampleTime() {
        return nativeGetSampleTime();
    }

    public final int getSampleTrackIndex() {
        return nativeGetSampleTrackIndex();
    }

    public final int getTrackCount() {
        return nativeGetTrackCount();
    }

    public final FFMpegMediaFormat getTrackFormat(int i) {
        return nativeGetTrackFormat(i);
    }

    public final FFMpegMediaDemuxer initialize() {
        this.mFFMpegLib.A();
        nativeInit(this.mPath, this.mOptions);
        return this;
    }

    public final int readSampleData(ByteBuffer byteBuffer, int i) {
        AnonymousClass1tB.m13606B(byteBuffer);
        return nativeReadSampleData(byteBuffer, i);
    }

    public final void release() {
        nativeRelease();
    }

    public final void selectTrack(int i) {
        nativeSelectTrack(i);
    }
}
