package X;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* renamed from: X.2gC */
public final class AnonymousClass2gC {
    /* renamed from: L */
    public static final boolean f32331L = (VERSION.SDK_INT < 21);
    /* renamed from: B */
    public MediaCodec f32332B;
    /* renamed from: C */
    public final MediaFormat f32333C;
    /* renamed from: D */
    public final AnonymousClass3ry f32334D;
    /* renamed from: E */
    private final BufferInfo f32335E = new BufferInfo();
    /* renamed from: F */
    private boolean f32336F;
    /* renamed from: G */
    private final MediaExtractor f32337G = new MediaExtractor();
    /* renamed from: H */
    private final String f32338H;
    /* renamed from: I */
    private ByteBuffer[] f32339I;
    /* renamed from: J */
    private ByteBuffer[] f32340J;
    /* renamed from: K */
    private int f32341K;

    public AnonymousClass2gC(String str, AnonymousClass3ry anonymousClass3ry) {
        this.f32338H = str;
        this.f32334D = anonymousClass3ry;
        this.f32337G.setDataSource(str);
        for (int i = 0; i < this.f32337G.getTrackCount(); i++) {
            MediaFormat trackFormat = this.f32337G.getTrackFormat(i);
            if (trackFormat.getString("mime").toLowerCase(Locale.US).startsWith("audio/")) {
                this.f32333C = trackFormat;
                this.f32337G.selectTrack(i);
                this.f32337G.seekTo(0, 0);
                this.f32336F = false;
                this.f32341K = 0;
                return;
            }
        }
        this.f32337G.release();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No audio track found in file ");
        stringBuilder.append(str);
        throw new IOException(stringBuilder.toString());
    }

    /* renamed from: A */
    public final void m16873A(String str) {
        AnonymousClass3ry anonymousClass3ry = this.f32334D;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error decoding file ");
        stringBuilder.append(this.f32338H);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        anonymousClass3ry.m21003A(stringBuilder.toString());
    }

    /* renamed from: B */
    public final void m16874B() {
        this.f32337G.release();
        MediaCodec mediaCodec = this.f32332B;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.f32332B = null;
        }
        this.f32339I = null;
        this.f32340J = null;
    }

    /* renamed from: B */
    public static boolean m16869B(AnonymousClass2gC anonymousClass2gC) {
        MediaCodec mediaCodec = anonymousClass2gC.f32332B;
        if (mediaCodec != null) {
            int dequeueInputBuffer;
            if (!anonymousClass2gC.f32336F) {
                dequeueInputBuffer = mediaCodec.dequeueInputBuffer(50000);
                if (dequeueInputBuffer >= 0) {
                    AnonymousClass2gC.m16872E(anonymousClass2gC, dequeueInputBuffer, anonymousClass2gC.f32332B.getInputBuffer(dequeueInputBuffer));
                }
            }
            int dequeueOutputBuffer = anonymousClass2gC.f32332B.dequeueOutputBuffer(anonymousClass2gC.f32335E, 50000);
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer outputBuffer = anonymousClass2gC.f32332B.getOutputBuffer(dequeueOutputBuffer);
                anonymousClass2gC.f32334D.m21004B(outputBuffer, anonymousClass2gC.f32335E.size);
                outputBuffer.clear();
                anonymousClass2gC.f32332B.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else if (dequeueOutputBuffer == -1 && anonymousClass2gC.f32336F) {
                dequeueInputBuffer = anonymousClass2gC.f32341K + 1;
                anonymousClass2gC.f32341K = dequeueInputBuffer;
                if (dequeueInputBuffer >= 3) {
                    return false;
                }
            }
            return AnonymousClass2gC.m16871D(anonymousClass2gC) ^ 1;
        }
        throw new IllegalStateException("Codec is null");
    }

    /* renamed from: C */
    public static boolean m16870C(AnonymousClass2gC anonymousClass2gC) {
        MediaCodec mediaCodec = anonymousClass2gC.f32332B;
        if (mediaCodec != null) {
            int dequeueInputBuffer;
            if (anonymousClass2gC.f32339I == null) {
                anonymousClass2gC.f32339I = mediaCodec.getInputBuffers();
            }
            if (anonymousClass2gC.f32340J == null) {
                anonymousClass2gC.f32340J = anonymousClass2gC.f32332B.getOutputBuffers();
            }
            if (!anonymousClass2gC.f32336F) {
                dequeueInputBuffer = anonymousClass2gC.f32332B.dequeueInputBuffer(50000);
                if (dequeueInputBuffer >= 0) {
                    AnonymousClass2gC.m16872E(anonymousClass2gC, dequeueInputBuffer, anonymousClass2gC.f32339I[dequeueInputBuffer]);
                }
            }
            int dequeueOutputBuffer = anonymousClass2gC.f32332B.dequeueOutputBuffer(anonymousClass2gC.f32335E, 50000);
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = anonymousClass2gC.f32340J[dequeueOutputBuffer];
                byteBuffer.order(ByteOrder.nativeOrder()).position(anonymousClass2gC.f32335E.offset).limit(anonymousClass2gC.f32335E.offset + anonymousClass2gC.f32335E.size);
                anonymousClass2gC.f32334D.m21004B(byteBuffer, anonymousClass2gC.f32335E.size);
                byteBuffer.clear();
                anonymousClass2gC.f32332B.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else if (dequeueOutputBuffer == -3) {
                anonymousClass2gC.f32340J = anonymousClass2gC.f32332B.getOutputBuffers();
            } else if (dequeueOutputBuffer == -1 && anonymousClass2gC.f32336F) {
                dequeueInputBuffer = anonymousClass2gC.f32341K + 1;
                anonymousClass2gC.f32341K = dequeueInputBuffer;
                if (dequeueInputBuffer >= 3) {
                    return false;
                }
            }
            return AnonymousClass2gC.m16871D(anonymousClass2gC) ^ 1;
        }
        throw new IllegalStateException("Codec is null");
    }

    /* renamed from: D */
    private static boolean m16871D(AnonymousClass2gC anonymousClass2gC) {
        return anonymousClass2gC.f32336F && (anonymousClass2gC.f32335E.flags & 4) != 0;
    }

    /* renamed from: E */
    private static void m16872E(AnonymousClass2gC anonymousClass2gC, int i, ByteBuffer byteBuffer) {
        if (anonymousClass2gC.f32337G == null) {
            throw new IllegalStateException("Extractor is null");
        } else if (anonymousClass2gC.f32332B != null) {
            byteBuffer.clear();
            try {
                int readSampleData = anonymousClass2gC.f32337G.readSampleData(byteBuffer, 0);
                int i2 = i;
                if (readSampleData < 0) {
                    anonymousClass2gC.f32332B.queueInputBuffer(i2, 0, 0, 0, 4);
                    anonymousClass2gC.f32336F = true;
                    return;
                }
                anonymousClass2gC.f32332B.queueInputBuffer(i2, 0, readSampleData, anonymousClass2gC.f32337G.getSampleTime(), 0);
                anonymousClass2gC.f32336F = anonymousClass2gC.f32337G.advance() ^ true;
            } catch (Exception e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Extraction failed: ");
                stringBuilder.append(e.getMessage());
                throw new IOException(stringBuilder.toString());
            }
        } else {
            throw new IllegalStateException("Codec is null");
        }
    }
}
