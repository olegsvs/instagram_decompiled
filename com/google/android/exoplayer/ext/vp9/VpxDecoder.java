package com.google.android.exoplayer.ext.vp9;

import X.AnonymousClass2ql;
import X.AnonymousClass2sL;
import X.AnonymousClass2td;
import X.AnonymousClass3uu;
import X.AnonymousClass3uw;
import X.AnonymousClass43k;
import java.nio.ByteBuffer;

public final class VpxDecoder extends AnonymousClass3uw {
    public static final boolean IS_AVAILABLE;
    private volatile int outputMode;
    private final long vpxDecContext;

    public static native String getLibvpxVersion();

    private native long vpxClose(long j);

    private native long vpxDecode(long j, ByteBuffer byteBuffer, int i);

    private native String vpxGetErrorMessage(long j);

    private native int vpxGetFrame(long j, VpxOutputBuffer vpxOutputBuffer);

    private native long vpxInit();

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "vpxJNI";	 Catch:{ UnsatisfiedLinkError -> 0x0007 }
        java.lang.System.loadLibrary(r0);	 Catch:{ UnsatisfiedLinkError -> 0x0007 }
        r0 = 1;	 Catch:{ UnsatisfiedLinkError -> 0x0007 }
        goto L_0x0008;	 Catch:{ UnsatisfiedLinkError -> 0x0007 }
    L_0x0007:
        r0 = 0;
    L_0x0008:
        IS_AVAILABLE = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.ext.vp9.VpxDecoder.<clinit>():void");
    }

    public VpxDecoder(int i, int i2, int i3) {
        super(new AnonymousClass43k[i], new VpxOutputBuffer[i2]);
        long vpxInit = vpxInit();
        this.vpxDecContext = vpxInit;
        if (vpxInit != 0) {
            int i4 = 0;
            AnonymousClass2td.m17606E(this.f46668B == this.f46669C.length);
            while (true) {
                AnonymousClass3uu[] anonymousClass3uuArr = this.f46669C;
                if (i4 < anonymousClass3uuArr.length) {
                    anonymousClass3uuArr[i4].f46666B.m17465B(i3);
                    i4++;
                } else {
                    return;
                }
            }
        }
        throw new AnonymousClass2sL("Failed to initialize decoder");
    }

    public static final AnonymousClass43k createInputBuffer() {
        return new AnonymousClass43k();
    }

    public final VpxOutputBuffer createOutputBuffer() {
        return new VpxOutputBuffer(this);
    }

    public final AnonymousClass2sL decode(AnonymousClass43k anonymousClass43k, VpxOutputBuffer vpxOutputBuffer) {
        AnonymousClass2ql anonymousClass2ql = anonymousClass43k.f46666B;
        vpxOutputBuffer.f46667B = anonymousClass2ql.f34881F;
        anonymousClass2ql.f34878C.position(anonymousClass2ql.f34878C.position() - anonymousClass2ql.f34880E);
        if (vpxDecode(this.vpxDecContext, anonymousClass2ql.f34878C, anonymousClass2ql.f34880E) != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Decode error: ");
            stringBuilder.append(vpxGetErrorMessage(this.vpxDecContext));
            return new AnonymousClass2sL(stringBuilder.toString());
        }
        vpxOutputBuffer.mode = this.outputMode;
        if (vpxGetFrame(this.vpxDecContext, vpxOutputBuffer) != 0) {
            vpxOutputBuffer.m17665C(4);
        }
        return null;
    }

    public final void release() {
        super.release();
        vpxClose(this.vpxDecContext);
    }

    public final void releaseOutputBuffer(VpxOutputBuffer vpxOutputBuffer) {
        super.releaseOutputBuffer(vpxOutputBuffer);
    }

    public final void setOutputMode(int i) {
        this.outputMode = i;
    }
}
