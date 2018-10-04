package X;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.util.video.VideoBridge;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.456 */
public final class AnonymousClass456 extends AnonymousClass42n {
    /* renamed from: B */
    public MediaExtractor f49673B;
    /* renamed from: C */
    public MediaFormat f49674C;
    /* renamed from: D */
    public final AnonymousClass1Km f49675D;
    /* renamed from: E */
    public int f49676E;
    /* renamed from: F */
    public final int f49677F;
    /* renamed from: G */
    public final int f49678G;
    /* renamed from: H */
    public final String f49679H;
    /* renamed from: I */
    public AnonymousClass42q f49680I;
    /* renamed from: J */
    public int f49681J;
    /* renamed from: K */
    public int f49682K = 0;
    /* renamed from: L */
    public MediaCodec f49683L;
    /* renamed from: M */
    public ByteBuffer[] f49684M;
    /* renamed from: N */
    public MediaExtractor f49685N;
    /* renamed from: O */
    public MediaFormat f49686O;
    /* renamed from: P */
    private Queue f49687P;
    /* renamed from: Q */
    private ByteBuffer f49688Q = ByteBuffer.allocateDirect(DexStore.LOAD_RESULT_MIXED_MODE_ATTEMPTED);
    /* renamed from: R */
    private final String f49689R;
    /* renamed from: S */
    private final AnonymousClass0OA f49690S;
    /* renamed from: T */
    private int f49691T = 0;
    /* renamed from: U */
    private boolean f49692U;
    /* renamed from: V */
    private BufferInfo f49693V = new BufferInfo();

    public AnonymousClass456(Context context, AnonymousClass0OA anonymousClass0OA, AnonymousClass3q5 anonymousClass3q5) {
        super(new AnonymousClass3oW(context, null, 0, 0));
        Point B = AnonymousClass2Mv.m15263B(context, anonymousClass0OA.f3795I, anonymousClass0OA.bC.f17224U);
        this.f49678G = B.x;
        this.f49677F = B.y;
        this.f44808B.m20758G(null, this.f49678G, this.f49677F);
        this.f49675D = anonymousClass0OA.bC;
        Integer.valueOf(anonymousClass0OA.AD);
        AnonymousClass42q anonymousClass42q = new AnonymousClass42q(this.f44808B.f44792G, false, anonymousClass0OA.jB);
        this.f49680I = anonymousClass42q;
        anonymousClass42q.f48872T = true;
        this.f49680I.m22277C(anonymousClass3q5.f45125C);
        this.f49680I.f48871S = anonymousClass3q5.f45126D;
        this.f44808B.m20757F(this.f49680I);
        this.f49690S = anonymousClass0OA;
        this.f49685N = new MediaExtractor();
        this.f49673B = new MediaExtractor();
        this.f49687P = new LinkedList();
        this.f49679H = AnonymousClass2NO.m15327H(context, anonymousClass0OA, "mkv", anonymousClass3q5.f45127E);
        this.f49689R = AnonymousClass2NO.m15324E(context, "_renderSW", ".ogg");
    }

    /* renamed from: A */
    public final void mo5097A() {
        VideoBridge.finishEncoding();
        this.f49685N.release();
        this.f49683L.stop();
        this.f49683L.release();
        if (m22272M()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Rendered to ");
            stringBuilder.append(this.f49679H);
            stringBuilder.toString();
            this.f49690S.IA(this.f49679H);
            return;
        }
        new File(this.f49679H).delete();
        new File(this.f49689R).delete();
    }

    /* renamed from: B */
    private void m22754B(String str) {
        if (this.f49692U) {
            MediaCodec createDecoderByType;
            for (int i = 0; i < r3.f49673B.getTrackCount(); i++) {
                MediaFormat trackFormat = r3.f49673B.getTrackFormat(i);
                r3.f49674C = trackFormat;
                String string = trackFormat.getString("mime");
                if (string.startsWith("audio/")) {
                    r3.f49674C.toString();
                    r3.f49673B.selectTrack(i);
                    try {
                        createDecoderByType = MediaCodec.createDecoderByType(string);
                        createDecoderByType.configure(r3.f49674C, null, null, 0);
                        break;
                    } catch (Throwable e) {
                        mo5091H(e);
                        throw new RuntimeException(e);
                    }
                }
                r3.f49674C = null;
            }
            createDecoderByType = null;
            int i2 = 0;
            if (createDecoderByType == null) {
                AnonymousClass0Dc.P("FinalRenderControllerSW", "No audio track found: will not mux audio");
                r3.f49692U = false;
                return;
            }
            int i3;
            createDecoderByType.start();
            ByteBuffer[] inputBuffers = createDecoderByType.getInputBuffers();
            ByteBuffer[] outputBuffers = createDecoderByType.getOutputBuffers();
            BufferInfo bufferInfo = new BufferInfo();
            String str2 = str;
            int configureVorbisEncoder = VideoBridge.configureVorbisEncoder(str2, r3.f49674C.getInteger("channel-count"), r3.f49674C.getInteger("sample-rate"), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
            if (configureVorbisEncoder != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not configure audio codec: ");
                stringBuilder.append(configureVorbisEncoder);
                AnonymousClass0Dc.F("FinalRenderControllerSW", stringBuilder.toString());
            }
            int i4;
            if (r3.f49690S.f3799M != null) {
                i4 = (r3.f49675D.f17209F - r3.f49675D.f17220Q) * JsonMappingException.MAX_REFS_TO_LIST;
                i3 = 0;
            } else {
                i3 = r3.f49675D.f17220Q * JsonMappingException.MAX_REFS_TO_LIST;
                i4 = r3.f49675D.f17209F * JsonMappingException.MAX_REFS_TO_LIST;
            }
            long j = (long) i3;
            r3.f49673B.seekTo(j, 0);
            int i5 = 0;
            while (true) {
                int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(10000);
                if (dequeueInputBuffer >= 0) {
                    int readSampleData = r3.f49673B.readSampleData(inputBuffers[dequeueInputBuffer], 0);
                    if (readSampleData < 0) {
                        createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                    } else {
                        createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, r3.f49673B.getSampleTime(), null);
                        r3.f49673B.advance();
                    }
                    i5 = 0;
                } else {
                    i3 = i5 + 1;
                    if (i5 < 200) {
                        i5 = i3;
                    } else {
                        throw new RuntimeException("Could not decode audio because of unavailale codec buffers.");
                    }
                }
                int dequeueOutputBuffer = createDecoderByType.dequeueOutputBuffer(bufferInfo, 10000);
                if ((bufferInfo.flags & 4) != 0) {
                    break;
                } else if (dequeueOutputBuffer == -3) {
                    outputBuffers = createDecoderByType.getOutputBuffers();
                } else if (dequeueOutputBuffer >= 0) {
                    ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                    byteBuffer.rewind();
                    byteBuffer.limit(bufferInfo.size);
                    if (bufferInfo.presentationTimeUs >= j && bufferInfo.presentationTimeUs <= ((long) r11)) {
                        r3.f49688Q.clear();
                        r3.f49688Q.put(byteBuffer);
                        VideoBridge.encodeAudioBuffer(r3.f49688Q, bufferInfo.size);
                    }
                    createDecoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            }
            VideoBridge.finishEncodingAudio();
            r3.f49673B.release();
            createDecoderByType.stop();
            createDecoderByType.release();
            r3.f49673B = new MediaExtractor();
            try {
                r3.f49673B.setDataSource(str2);
                while (i2 < r3.f49673B.getTrackCount()) {
                    MediaFormat trackFormat2 = r3.f49673B.getTrackFormat(i2);
                    r3.f49674C = trackFormat2;
                    if (trackFormat2.getString("mime").startsWith("audio/")) {
                        r3.f49674C.toString();
                        r3.f49673B.selectTrack(i2);
                        break;
                    }
                    r3.f49674C = null;
                    i2++;
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Extracted Audio Stream to ");
                stringBuilder2.append(str2);
                stringBuilder2.toString();
            } catch (Throwable e2) {
                mo5091H(e2);
                throw new RuntimeException("Error accessing disk for media extraction.", e2);
            }
        }
    }

    /* renamed from: C */
    private void m22755C(long j) {
        if (this.f49692U) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Writing Audio Packets before ");
            stringBuilder.append(j);
            stringBuilder.toString();
            while (true) {
                long sampleTime = this.f49673B.getSampleTime();
                if (sampleTime < j && sampleTime != -1) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Writing audio packet at ");
                    stringBuilder.append(sampleTime);
                    stringBuilder.toString();
                    int readSampleData = this.f49673B.readSampleData(this.f49688Q, 0);
                    if (readSampleData >= 0) {
                        VideoBridge.writeAudioPacket(this.f49688Q, readSampleData, sampleTime);
                        this.f49673B.advance();
                    } else {
                        return;
                    }
                }
                return;
            }
        }
    }

    /* renamed from: F */
    public final void mo5098F() {
        AnonymousClass1Ag.C(this.f49679H);
        try {
            boolean z;
            int configureVideoCodec;
            StringBuilder stringBuilder;
            this.f49685N.setDataSource(this.f49675D.f17222S);
            if (this.f49690S.f3799M != null) {
                this.f49673B.setDataSource(this.f49690S.f3799M);
            } else {
                this.f49673B.setDataSource(this.f49675D.f17222S);
            }
            AnonymousClass3oW anonymousClass3oW = this.f44808B;
            anonymousClass3oW.f44807V.offer(new AnonymousClass3oU(anonymousClass3oW));
            this.f44808B.m20756E(AnonymousClass3oV.RENDER_CONTINUOUSLY);
            for (int i = 0; i < this.f49685N.getTrackCount(); i++) {
                MediaFormat trackFormat = this.f49685N.getTrackFormat(i);
                this.f49686O = trackFormat;
                trackFormat.setInteger("max-input-size", 0);
                String string = this.f49686O.getString("mime");
                if (string.startsWith("video/")) {
                    this.f49685N.selectTrack(i);
                    try {
                        this.f49683L = MediaCodec.createDecoderByType(string);
                        this.f49683L.configure(this.f49686O, new Surface(this.f49680I.m22275A()), null, 0);
                        break;
                    } catch (Throwable e) {
                        MediaCodec mediaCodec = this.f49683L;
                        AnonymousClass0Gn.E("decoder_init_error", mediaCodec == null ? "NOT_INITIALIZED" : mediaCodec.getName(), e);
                        mo5091H(e);
                        throw new RuntimeException(e);
                    }
                }
                this.f49686O = null;
            }
            this.f49681J = this.f49675D.f17220Q * JsonMappingException.MAX_REFS_TO_LIST;
            this.f49676E = this.f49675D.f17209F * JsonMappingException.MAX_REFS_TO_LIST;
            this.f49685N.seekTo((long) this.f49681J, 0);
            this.f49682K = 0;
            while (true) {
                long sampleTime = this.f49685N.getSampleTime();
                if (sampleTime > ((long) this.f49676E) || sampleTime == -1) {
                    this.f49685N.seekTo((long) this.f49681J, 0);
                    this.f49683L.start();
                    this.f49684M = this.f49683L.getInputBuffers();
                    this.f49680I.f48867O.f48878E.m19533B(this.f49675D);
                } else {
                    if (this.f49685N.getSampleTime() >= ((long) this.f49681J)) {
                        this.f49682K++;
                    }
                    this.f49685N.advance();
                }
            }
            this.f49685N.seekTo((long) this.f49681J, 0);
            this.f49683L.start();
            this.f49684M = this.f49683L.getInputBuffers();
            this.f49680I.f48867O.f48878E.m19533B(this.f49675D);
            if (this.f49690S.hB) {
                if (this.f49690S.f3799M == null) {
                    z = false;
                    this.f49692U = z;
                    m22754B(this.f49689R);
                    configureVideoCodec = VideoBridge.configureVideoCodec(this.f49679H, this.f49678G, this.f49677F);
                    if (configureVideoCodec == 0) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("mOutputFilePath=");
                        stringBuilder.append(this.f49679H);
                        stringBuilder.append(", result=");
                        stringBuilder.append(configureVideoCodec);
                        AnonymousClass0Gn.C("initEncoder failed", stringBuilder.toString());
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Could not configure codec: ");
                        stringBuilder.append(configureVideoCodec);
                        throw new RuntimeException(stringBuilder.toString());
                    }
                }
            }
            z = true;
            this.f49692U = z;
            m22754B(this.f49689R);
            configureVideoCodec = VideoBridge.configureVideoCodec(this.f49679H, this.f49678G, this.f49677F);
            if (configureVideoCodec == 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("mOutputFilePath=");
                stringBuilder.append(this.f49679H);
                stringBuilder.append(", result=");
                stringBuilder.append(configureVideoCodec);
                AnonymousClass0Gn.C("initEncoder failed", stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append("Could not configure codec: ");
                stringBuilder.append(configureVideoCodec);
                throw new RuntimeException(stringBuilder.toString());
            }
        } catch (Throwable e2) {
            mo5091H(e2);
            throw new RuntimeException("Error accessing disk for media extraction.", e2);
        }
    }

    /* renamed from: J */
    public final void mo5101J() {
        long longValue = ((Long) this.f49687P.poll()).longValue();
        VideoBridge.encodeFrame(this.f49693V.presentationTimeUs - ((long) this.f49681J), longValue);
        this.f49691T++;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rendered frame number ");
        stringBuilder.append(this.f49691T);
        stringBuilder.append(" at time ");
        stringBuilder.append(this.f49693V.presentationTimeUs);
        stringBuilder.append(" for ");
        stringBuilder.append(longValue);
        stringBuilder.append("us");
        stringBuilder.toString();
        int i = this.f49682K;
        if (i != 0) {
            double d = (double) this.f49691T;
            double d2 = (double) i;
            Double.isNaN(d);
            Double.isNaN(d2);
            this.f49690S.HA(AnonymousClass2F8.RENDERING, d / d2);
        }
    }

    /* renamed from: K */
    public final boolean mo5102K() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r16 = this;
    L_0x0000:
        r1 = r16;
        r0 = r1.f49683L;
        r2 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r6 = r0.dequeueInputBuffer(r2);
        r0 = 0;
        if (r6 < 0) goto L_0x004d;
    L_0x000d:
        r4 = r1.f49684M;
        r5 = r4[r6];
        r4 = r1.f49685N;
        r12 = r4.readSampleData(r5, r0);
        if (r12 >= 0) goto L_0x0024;
    L_0x0019:
        r5 = r1.f49683L;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r11 = 4;
        r5.queueInputBuffer(r6, r7, r8, r9, r11);
        goto L_0x004d;
    L_0x0024:
        r4 = r1.f49685N;
        r7 = r4.getSampleTime();
        r9 = r1.f49683L;
        r11 = 0;
        r4 = r1.f49685N;
        r13 = r4.getSampleTime();
        r15 = 0;
        r10 = r6;
        r9.queueInputBuffer(r10, r11, r12, r13, r15);
        r4 = r1.f49685N;
        r4.advance();
        r6 = r1.f49687P;
        r4 = r1.f49685N;
        r4 = r4.getSampleTime();
        r4 = r4 - r7;
        r4 = java.lang.Long.valueOf(r4);
        r6.offer(r4);
    L_0x004d:
        r5 = r1.f49683L;
        r4 = r1.f49693V;
        r6 = r5.dequeueOutputBuffer(r4, r2);
        r2 = r1.f49693V;
        r2 = r2.flags;
        r2 = r2 & 4;
        r7 = 1;
        if (r2 != 0) goto L_0x0099;
    L_0x005e:
        r2 = r1.f49693V;
        r4 = r2.presentationTimeUs;
        r2 = r1.f49676E;
        r2 = (long) r2;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x006a;
    L_0x0069:
        goto L_0x0099;
    L_0x006a:
        if (r6 < 0) goto L_0x007e;
    L_0x006c:
        r2 = r1.f49693V;
        r4 = r2.presentationTimeUs;
        r2 = r1.f49681J;
        r2 = (long) r2;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 > 0) goto L_0x007e;
    L_0x0077:
        r2 = r1.f49683L;
        r2.releaseOutputBuffer(r6, r0);
        r6 = -1;
        goto L_0x008b;
    L_0x007e:
        switch(r6) {
            case -3: goto L_0x008b;
            case -2: goto L_0x008b;
            case -1: goto L_0x008b;
            default: goto L_0x0081;
        };
    L_0x0081:
        r2 = r1.f49683L;
        r2.releaseOutputBuffer(r6, r7);
        r2 = 12;
        java.lang.Thread.sleep(r2, r0);	 Catch:{ InterruptedException -> 0x008b }
    L_0x008b:
        if (r6 < 0) goto L_0x0000;
    L_0x008d:
        r2 = r1.f49693V;
        r4 = r2.presentationTimeUs;
        r2 = r1.f49681J;
        r2 = (long) r2;
        r4 = r4 - r2;
        r1.m22755C(r4);
        return r0;
    L_0x0099:
        r0 = 1;
        r1.f48842B = r0;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.456.K():boolean");
    }
}
