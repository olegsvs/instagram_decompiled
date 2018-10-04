package com.instagram.arlink.util;

import X.AnonymousClass0CF;
import com.instagram.arlink.model.ArLinkCandidate;
import java.nio.ByteBuffer;

public class ArLinkScanner {
    private final long mNativeScanner;

    private static native long nativeCreateScanner(String str, String str2);

    private static native void nativeDispose(long j);

    private static native ArLinkCandidate[] nativeGetCandidatesFromARGBImage(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    private static native ArLinkCandidate[] nativeGetCandidatesFromNV21Image(long j, ByteBuffer byteBuffer, int i, int i2);

    static {
        AnonymousClass0CF.E("arlink");
    }

    public ArLinkScanner(String str, String str2) {
        this.mNativeScanner = nativeCreateScanner(str, str2);
    }

    public final void dispose() {
        nativeDispose(this.mNativeScanner);
    }

    public final ArLinkCandidate[] getCandidatesFromARGBImage(ByteBuffer byteBuffer, int i, int i2, int i3) {
        return nativeGetCandidatesFromARGBImage(this.mNativeScanner, byteBuffer, i, i2, i3);
    }

    public final ArLinkCandidate[] getCandidatesFromNV21Image(ByteBuffer byteBuffer, int i, int i2) {
        return nativeGetCandidatesFromNV21Image(this.mNativeScanner, byteBuffer, i, i2);
    }
}
