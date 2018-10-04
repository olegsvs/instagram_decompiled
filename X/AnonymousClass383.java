package X;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.383 */
public final class AnonymousClass383 {
    /* renamed from: B */
    public final BufferInfo f38143B = new BufferInfo();
    /* renamed from: C */
    public boolean f38144C = false;
    /* renamed from: D */
    public AnonymousClass382 f38145D;
    /* renamed from: E */
    public Surface f38146E;
    /* renamed from: F */
    public volatile boolean f38147F = false;
    /* renamed from: G */
    public MediaCodec f38148G;
    /* renamed from: H */
    public MediaMuxer f38149H;
    /* renamed from: I */
    public int f38150I = -1;
    /* renamed from: J */
    public final String f38151J = "video/avc";
    /* renamed from: K */
    public AnonymousClass381 f38152K;

    /* renamed from: A */
    public final boolean m18651A(int i, int i2, int i3) {
        try {
            this.f38148G = MediaCodec.createEncoderByType(this.f38151J);
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.f38151J, i, i2);
            createVideoFormat.setInteger(TraceFieldType.Bitrate, i3);
            createVideoFormat.setInteger("i-frame-interval", 1);
            createVideoFormat.setInteger("max-input-size", 0);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("frame-rate", 30);
            this.f38148G.configure(createVideoFormat, null, null, 1);
            this.f38146E = this.f38148G.createInputSurface();
            return true;
        } catch (Throwable e) {
            AnonymousClass0Dc.G("BoomerangEncoder", "Cannot create encoder!", e);
            AnonymousClass381 anonymousClass381 = this.f38152K;
            if (anonymousClass381 != null) {
                anonymousClass381.gv(e.getMessage(), e);
            }
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static void m18647B(X.AnonymousClass383 r8, boolean r9) {
        /*
        r0 = r8.f38147F;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r8.f38148G;	 Catch:{ IllegalStateException -> 0x00dd }
        r7 = r0.getOutputBuffers();	 Catch:{ IllegalStateException -> 0x00dd }
    L_0x000b:
        r3 = r8.f38148G;	 Catch:{ IllegalStateException -> 0x00dd }
        r2 = r8.f38143B;	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;
        r3 = r3.dequeueOutputBuffer(r2, r0);	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = -1;
        if (r3 != r0) goto L_0x001d;
    L_0x0018:
        if (r9 != 0) goto L_0x001c;
    L_0x001a:
        goto L_0x00db;
    L_0x001c:
        goto L_0x000b;
    L_0x001d:
        r0 = -3;
        if (r3 != r0) goto L_0x0027;
    L_0x0020:
        r0 = r8.f38148G;	 Catch:{ IllegalStateException -> 0x00dd }
        r7 = r0.getOutputBuffers();	 Catch:{ IllegalStateException -> 0x00dd }
        goto L_0x000b;
    L_0x0027:
        r0 = -2;
        r5 = 1;
        if (r3 != r0) goto L_0x005e;
    L_0x002b:
        r0 = r8.f38144C;	 Catch:{ IllegalStateException -> 0x00dd }
        if (r0 != 0) goto L_0x0045;
    L_0x002f:
        r0 = r8.f38148G;	 Catch:{ IllegalStateException -> 0x00dd }
        r1 = r0.getOutputFormat();	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r8.f38149H;	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r0.addTrack(r1);	 Catch:{ IllegalStateException -> 0x00dd }
        r8.f38150I = r0;	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r8.f38149H;	 Catch:{ IllegalStateException -> 0x00dd }
        r0.start();	 Catch:{ IllegalStateException -> 0x00dd }
        r8.f38144C = r5;	 Catch:{ IllegalStateException -> 0x00dd }
        goto L_0x000b;
    L_0x0045:
        r2 = new java.lang.RuntimeException;	 Catch:{ IllegalStateException -> 0x00dd }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00dd }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r8.f38151J;	 Catch:{ IllegalStateException -> 0x00dd }
        r1.append(r0);	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = ": format changed twice";
        r1.append(r0);	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r1.toString();	 Catch:{ IllegalStateException -> 0x00dd }
        r2.<init>(r0);	 Catch:{ IllegalStateException -> 0x00dd }
    L_0x005d:
        throw r2;	 Catch:{ IllegalStateException -> 0x00dd }
    L_0x005e:
        r4 = 0;
        if (r3 >= 0) goto L_0x0071;
    L_0x0061:
        r6 = "BoomerangEncoder";
        r2 = "unexpected result from encoder.dequeueOutputBuffer: %d";
        r1 = new java.lang.Object[r5];	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = java.lang.Integer.valueOf(r3);	 Catch:{ IllegalStateException -> 0x00dd }
        r1[r4] = r0;	 Catch:{ IllegalStateException -> 0x00dd }
        X.AnonymousClass0Dc.R(r6, r2, r1);	 Catch:{ IllegalStateException -> 0x00dd }
        goto L_0x000b;
    L_0x0071:
        r6 = r7[r3];	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r8.f38143B;	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r0.flags;	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x007f;
    L_0x007b:
        r0 = r8.f38143B;	 Catch:{ IllegalStateException -> 0x00dd }
        r0.size = r4;	 Catch:{ IllegalStateException -> 0x00dd }
    L_0x007f:
        r0 = r8.f38143B;	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r0.size;	 Catch:{ IllegalStateException -> 0x00dd }
        if (r0 == 0) goto L_0x00bf;
    L_0x0085:
        r0 = r8.f38144C;	 Catch:{ IllegalStateException -> 0x00dd }
        if (r0 == 0) goto L_0x00a6;
    L_0x0089:
        r0 = r8.f38143B;	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r0.offset;	 Catch:{ IllegalStateException -> 0x00dd }
        r6.position(r0);	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r8.f38143B;	 Catch:{ IllegalStateException -> 0x00dd }
        r1 = r0.offset;	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r8.f38143B;	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r0.size;	 Catch:{ IllegalStateException -> 0x00dd }
        r1 = r1 + r0;
        r6.limit(r1);	 Catch:{ IllegalStateException -> 0x00dd }
        r2 = r8.f38149H;	 Catch:{ IllegalStateException -> 0x00dd }
        r1 = r8.f38150I;	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r8.f38143B;	 Catch:{ IllegalStateException -> 0x00dd }
        r2.writeSampleData(r1, r6, r0);	 Catch:{ IllegalStateException -> 0x00dd }
        goto L_0x00bf;
    L_0x00a6:
        r2 = new java.lang.RuntimeException;	 Catch:{ IllegalStateException -> 0x00dd }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00dd }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r8.f38151J;	 Catch:{ IllegalStateException -> 0x00dd }
        r1.append(r0);	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = ": muxer hasn't started";
        r1.append(r0);	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r1.toString();	 Catch:{ IllegalStateException -> 0x00dd }
        r2.<init>(r0);	 Catch:{ IllegalStateException -> 0x00dd }
        goto L_0x005d;
    L_0x00bf:
        r0 = r8.f38148G;	 Catch:{ IllegalStateException -> 0x00dd }
        r0.releaseOutputBuffer(r3, r4);	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r8.f38143B;	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r0.flags;	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x000b;
    L_0x00cc:
        if (r9 != 0) goto L_0x00db;
    L_0x00ce:
        r3 = "BoomerangEncoder";
        r2 = "%s: reached end of stream unexpectedly";
        r1 = new java.lang.Object[r5];	 Catch:{ IllegalStateException -> 0x00dd }
        r0 = r8.f38151J;	 Catch:{ IllegalStateException -> 0x00dd }
        r1[r4] = r0;	 Catch:{ IllegalStateException -> 0x00dd }
        X.AnonymousClass0Dc.R(r3, r2, r1);	 Catch:{ IllegalStateException -> 0x00dd }
    L_0x00db:
        goto L_0x0004;
    L_0x00dd:
        r0 = move-exception;
        X.AnonymousClass383.m18650E(r8, r0);
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.383.B(X.383, boolean):void");
    }

    /* renamed from: B */
    public final synchronized void m18652B(String str, int i) {
        if (this.f38145D == null) {
            HandlerThread handlerThread = new HandlerThread("BurstFramesEncoderThread");
            handlerThread.start();
            this.f38145D = new AnonymousClass382(this, handlerThread.getLooper());
            Message obtainMessage = this.f38145D.obtainMessage(1, str);
            obtainMessage.arg1 = i;
            this.f38145D.sendMessage(obtainMessage);
        } else {
            throw new IllegalStateException("startVideoRecording() is called more than once!");
        }
    }

    /* renamed from: C */
    public static void m18648C(AnonymousClass383 anonymousClass383) {
        if (anonymousClass383.f38147F) {
            try {
                anonymousClass383.f38148G.signalEndOfInputStream();
                AnonymousClass383.m18647B(anonymousClass383, true);
                anonymousClass383.f38148G.flush();
            } catch (IllegalStateException e) {
                AnonymousClass383.m18650E(anonymousClass383, e);
            } catch (Throwable th) {
                anonymousClass383.f38147F = false;
            }
            anonymousClass383.f38147F = false;
            try {
                anonymousClass383.f38148G.stop();
            } catch (Exception e2) {
                AnonymousClass383.m18649D(anonymousClass383, "MediaCodec.stop() Error", e2);
            }
            anonymousClass383.f38144C = false;
            anonymousClass383.f38150I = -1;
            AnonymousClass381 anonymousClass381 = anonymousClass383.f38152K;
            if (anonymousClass381 != null) {
                anonymousClass381.hv();
            }
        }
    }

    /* renamed from: D */
    public static void m18649D(AnonymousClass383 anonymousClass383, String str, Exception exception) {
        anonymousClass383.f38147F = false;
        AnonymousClass0Dc.G("BoomerangEncoder", str, exception);
        AnonymousClass381 anonymousClass381 = anonymousClass383.f38152K;
        if (anonymousClass381 != null) {
            anonymousClass381.gv(str, exception);
        }
    }

    /* renamed from: E */
    public static void m18650E(AnonymousClass383 anonymousClass383, IllegalStateException illegalStateException) {
        if (VERSION.SDK_INT < 21 || !(illegalStateException instanceof CodecException)) {
            AnonymousClass383.m18649D(anonymousClass383, "IllegalStateException Error", illegalStateException);
        } else {
            AnonymousClass383.m18649D(anonymousClass383, "MediaCodec.CodecException Error", illegalStateException);
        }
    }
}
