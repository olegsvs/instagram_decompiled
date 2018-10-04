package com.facebook.cameracore.mediapipeline.filterlib.cpuframes;

import X.AnonymousClass0CF;
import X.AnonymousClass0LH;
import X.AnonymousClass1rZ;
import X.AnonymousClass1ra;
import X.AnonymousClass1ur;
import X.AnonymousClass1uu;
import X.AnonymousClass1y9;
import X.AnonymousClass2Pl;
import X.AnonymousClass2R4;
import android.opengl.Matrix;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public class CpuFrameRenderer {
    private final HybridData mHybridData = initHybrid();
    private final float[] mIdentityMatrix;
    private final AnonymousClass2Pl mLogger;
    private AnonymousClass1y9 mNV21Renderer;
    private final AnonymousClass2R4 mProgramFactory;
    private AnonymousClass1uu mUVTexture;
    private AnonymousClass1uu mYTexture;

    private static native HybridData initHybrid();

    private native void uploadTexturesFromI420(int i, int i2, int i3, int i4, ByteBuffer byteBuffer, int i5, int i6, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i7, int i8);

    private native void uploadTexturesFromNV21(int i, int i2, int i3, int i4, byte[] bArr);

    static {
        AnonymousClass0CF.E("mediapipeline-filterlib");
    }

    public CpuFrameRenderer(AnonymousClass2R4 anonymousClass2R4, AnonymousClass2Pl anonymousClass2Pl) {
        this.mProgramFactory = anonymousClass2R4;
        this.mLogger = anonymousClass2Pl;
        float[] fArr = new float[16];
        this.mIdentityMatrix = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public final void destroy() {
        release();
        this.mHybridData.resetNative();
    }

    public final void release() {
        AnonymousClass1uu anonymousClass1uu = this.mYTexture;
        if (anonymousClass1uu != null) {
            anonymousClass1uu.m13711A();
            this.mYTexture = null;
        }
        anonymousClass1uu = this.mUVTexture;
        if (anonymousClass1uu != null) {
            anonymousClass1uu.m13711A();
            this.mUVTexture = null;
        }
        AnonymousClass1y9 anonymousClass1y9 = this.mNV21Renderer;
        if (anonymousClass1y9 != null) {
            anonymousClass1y9.f24880E = null;
            AnonymousClass1ur anonymousClass1ur = anonymousClass1y9.f24879D;
            if (anonymousClass1ur != null) {
                anonymousClass1ur.m13705A();
            }
            anonymousClass1y9.f24877B = true;
            this.mNV21Renderer = null;
        }
    }

    public final boolean renderCpuFrame(X.AnonymousClass1ra r5) {
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
        r0 = r4.mYTexture;
        if (r0 != 0) goto L_0x000f;
    L_0x0004:
        r0 = new X.1ut;
        r0.<init>();
        r0 = r0.m13709A();
        r4.mYTexture = r0;
    L_0x000f:
        r0 = r4.mUVTexture;
        if (r0 != 0) goto L_0x001e;
    L_0x0013:
        r0 = new X.1ut;
        r0.<init>();
        r0 = r0.m13709A();
        r4.mUVTexture = r0;
    L_0x001e:
        r1 = "CpuFrameRenderer::uploadTextures";
        r0 = -160215031; // 0xfffffffff6735009 float:-1.23374164E33 double:NaN;
        r2 = 4;
        X.AnonymousClass09H.B(r2, r1, r0);
        r4.uploadTextures(r5);	 Catch:{ IllegalStateException -> 0x0045, all -> 0x003d }
        X.AnonymousClass1ul.m13687C(r1);	 Catch:{ IllegalStateException -> 0x0045, all -> 0x003d }
        r0 = 192265507; // 0xb75bd23 float:4.7327574E-32 double:9.4991782E-316;
        X.AnonymousClass09H.C(r2, r0);
        r1 = r4.mYTexture;
        r0 = r4.mUVTexture;
        r0 = r4.renderNV21ToRGB(r1, r0);
        return r0;
    L_0x003d:
        r1 = move-exception;
        r0 = 591450202; // 0x2340d05a float:1.0452461E-17 double:2.92215226E-315;
        X.AnonymousClass09H.C(r2, r0);
        throw r1;
    L_0x0045:
        r1 = 0;
        r0 = -1910058612; // 0xffffffff8e26d18c float:-2.0561973E-30 double:NaN;
        X.AnonymousClass09H.C(r2, r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.filterlib.cpuframes.CpuFrameRenderer.renderCpuFrame(X.1ra):boolean");
    }

    private boolean renderNV21ToRGB(AnonymousClass1uu anonymousClass1uu, AnonymousClass1uu anonymousClass1uu2) {
        if (this.mNV21Renderer == null) {
            AnonymousClass1y9 anonymousClass1y9 = new AnonymousClass1y9();
            this.mNV21Renderer = anonymousClass1y9;
            anonymousClass1y9.f24880E = this.mProgramFactory;
            anonymousClass1y9.f24877B = false;
        }
        AnonymousClass1y9 anonymousClass1y92 = this.mNV21Renderer;
        float[] fArr = this.mIdentityMatrix;
        return anonymousClass1y92.m13934A(anonymousClass1uu, anonymousClass1uu2, fArr, fArr, fArr);
    }

    private void uploadTextures(AnonymousClass1ra anonymousClass1ra) {
        AnonymousClass1rZ[] YP = anonymousClass1ra.YP();
        if (YP == null) {
            AnonymousClass0LH.E(anonymousClass1ra.uK());
            uploadTextures(anonymousClass1ra.uK(), anonymousClass1ra.getWidth(), anonymousClass1ra.getHeight(), anonymousClass1ra.VP());
            return;
        }
        uploadTextures(YP, anonymousClass1ra.getWidth(), anonymousClass1ra.getHeight(), anonymousClass1ra.VP());
    }

    private void uploadTextures(byte[] bArr, int i, int i2, int i3) {
        CpuFrameRenderer cpuFrameRenderer = this;
        AnonymousClass0LH.E(this.mYTexture);
        AnonymousClass0LH.E(this.mUVTexture);
        if (i3 == 17) {
            uploadTexturesFromNV21(i, i2, this.mYTexture.f24087C, this.mUVTexture.f24087C, bArr);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected pixel format with byte[] data: ");
        stringBuilder.append(i3);
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    private void uploadTextures(AnonymousClass1rZ[] anonymousClass1rZArr, int i, int i2, int i3) {
        CpuFrameRenderer cpuFrameRenderer = this;
        AnonymousClass0LH.E(this.mYTexture);
        AnonymousClass0LH.E(this.mUVTexture);
        int i4 = i3;
        if (i4 == 35) {
            AnonymousClass0LH.H(anonymousClass1rZArr.length == 3);
            uploadTexturesFromI420(i, i2, this.mYTexture.f24087C, this.mUVTexture.f24087C, anonymousClass1rZArr[0].tK(), anonymousClass1rZArr[0].WP(), anonymousClass1rZArr[0].BR(), anonymousClass1rZArr[1].tK(), anonymousClass1rZArr[2].tK(), anonymousClass1rZArr[1].WP(), anonymousClass1rZArr[1].BR());
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected pixel format with Plane[] data: ");
        stringBuilder.append(i4);
        throw new UnsupportedOperationException(stringBuilder.toString());
    }
}
