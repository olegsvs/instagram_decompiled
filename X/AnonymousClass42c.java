package X;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.FileObserver;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.42c */
public final class AnonymousClass42c implements AnonymousClass3ot {
    /* renamed from: B */
    private final AnonymousClass42X f48805B = new AnonymousClass42X(true);
    /* renamed from: C */
    private String f48806C;
    /* renamed from: D */
    private final AnonymousClass41E f48807D;
    /* renamed from: E */
    private final AnonymousClass42X f48808E = new AnonymousClass42X();
    /* renamed from: F */
    private String f48809F;
    /* renamed from: G */
    private final String f48810G;

    public AnonymousClass42c(String str, AnonymousClass41E anonymousClass41E) {
        this.f48807D = anonymousClass41E;
        this.f48810G = str;
    }

    public final void DF(String str) {
        this.f48809F = str;
        String str2 = this.f48810G;
        String substring = str.substring(str.lastIndexOf(47) + 1, str.lastIndexOf(46));
        this.f48806C = AnonymousClass0IE.E("%s/%s.frag.mp4", new Object[]{str2, substring});
        AnonymousClass0LH.H(this.f48809F.equals(this.f48806C) ^ 1);
        this.f48808E.DF(this.f48809F);
        this.f48805B.DF(this.f48806C);
    }

    public final void DXA(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        this.f48808E.DXA(byteBuffer, bufferInfo);
        this.f48805B.DXA(byteBuffer, bufferInfo);
    }

    public final void GXA(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        this.f48808E.GXA(byteBuffer, bufferInfo);
        this.f48805B.GXA(byteBuffer, bufferInfo);
    }

    public final void JQA(int i) {
        this.f48808E.JQA(i);
        this.f48805B.JQA(i);
    }

    public final void aSA(MediaFormat mediaFormat) {
        this.f48808E.aSA(mediaFormat);
        this.f48805B.aSA(mediaFormat);
    }

    public final void kMA(MediaFormat mediaFormat) {
        this.f48808E.kMA(mediaFormat);
        this.f48805B.kMA(mediaFormat);
    }

    public final void start() {
        try {
            this.f48808E.start();
            this.f48805B.start();
            AnonymousClass41E anonymousClass41E = this.f48807D;
            String str = this.f48806C;
            anonymousClass41E.f48421D = new AnonymousClass3ZV(anonymousClass41E, str, 2, str);
            anonymousClass41E.f48421D.startWatching();
            AnonymousClass0O4 anonymousClass0O4 = anonymousClass41E.f48419B;
            AnonymousClass0OA anonymousClass0OA = anonymousClass41E.f48420C;
            AnonymousClass0O4.K(anonymousClass0O4, AnonymousClass0O4.G(anonymousClass0O4, "streaming_render_started", null, anonymousClass0OA).F("reason", str), anonymousClass0OA);
            anonymousClass41E.f48422E.m20038B(anonymousClass41E.f48423F, str);
        } catch (Throwable e) {
            String str2 = "streaming muxer start error";
            this.f48807D.m22055B(this.f48806C, e, str2);
            throw new IOException(str2, e);
        }
    }

    public final void uUA(boolean z) {
        try {
            this.f48808E.uUA(z);
            this.f48805B.uUA(z);
            if (!z) {
                AnonymousClass41E anonymousClass41E = this.f48807D;
                String str = this.f48806C;
                long H = AnonymousClass1Ag.H(str);
                Long.valueOf(H / 1024);
                FileObserver fileObserver = anonymousClass41E.f48421D;
                if (fileObserver != null) {
                    fileObserver.stopWatching();
                    AnonymousClass3ZX anonymousClass3ZX = anonymousClass41E.f48422E;
                    AnonymousClass0OA anonymousClass0OA = anonymousClass41E.f48420C;
                    AnonymousClass3Zf anonymousClass3Zf = (AnonymousClass3Zf) anonymousClass3ZX.f42326C.get(str);
                    AnonymousClass0LH.E(anonymousClass3Zf);
                    anonymousClass3Zf.f42333C.close();
                    AnonymousClass0O4 anonymousClass0O4 = anonymousClass3ZX.f42325B;
                    AnonymousClass0O4.K(anonymousClass0O4, AnonymousClass0O4.G(anonymousClass0O4, "streaming_file_finalized", null, anonymousClass0OA).F("reason", str).C("total_size", H), anonymousClass0OA);
                    anonymousClass41E.f48420C.gC = str;
                }
                AnonymousClass0O4 anonymousClass0O42 = anonymousClass41E.f48419B;
                AnonymousClass0OA anonymousClass0OA2 = anonymousClass41E.f48420C;
                AnonymousClass0O4.K(anonymousClass0O42, AnonymousClass0O4.G(anonymousClass0O42, "streaming_render_finished", null, anonymousClass0OA2).F("reason", str).C("total_size", H), anonymousClass0OA2);
            }
            if (z) {
                this.f48807D.m22054A(this.f48806C, "streaming render canceled");
            }
        } catch (Throwable e) {
            String str2 = "streaming muxer stop error";
            this.f48807D.m22055B(this.f48806C, e, str2);
            throw new IOException(str2, e);
        } catch (Throwable th) {
            if (z) {
                this.f48807D.m22054A(this.f48806C, "streaming render canceled");
            }
        }
    }
}
