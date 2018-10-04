package com.instagram.util.video;

import X.AnonymousClass0CF;
import java.nio.ByteBuffer;
import org.webrtc.MediaStreamTrack;

public class VideoBridge {
    public static native int compileProgram(String str, boolean z, boolean z2);

    public static native int configureAACTrack(int i, int i2);

    public static native int configureVideoCodec(String str, int i, int i2);

    public static native int configureVorbisEncoder(String str, int i, int i2, double d);

    public static native int encodeAudioBuffer(ByteBuffer byteBuffer, int i);

    public static native int encodeFrame(long j, long j2);

    public static native int finishEncoding();

    public static native int finishEncodingAudio();

    public static native int writeAudioPacket(ByteBuffer byteBuffer, int i, long j);

    static {
        AnonymousClass0CF.E("log");
        AnonymousClass0CF.E("vpx");
        AnonymousClass0CF.E("ogg");
        AnonymousClass0CF.E("scrambler");
        AnonymousClass0CF.E("glcommon");
        AnonymousClass0CF.E(MediaStreamTrack.VIDEO_TRACK_KIND);
    }

    public static int compileProgram(String str, boolean z) {
        return compileProgram(str, false, z);
    }
}
