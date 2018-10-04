package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.view.Surface;
import com.facebook.ffmpeg.FFMpegMediaDemuxer;
import com.facebook.ffmpeg.FFMpegMediaDemuxer.Options;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.instagram.util.video.VideoBridge;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.455 */
public final class AnonymousClass455 extends AnonymousClass42n implements OnFrameAvailableListener, OnCompletionListener, OnSeekCompleteListener {
    /* renamed from: B */
    public final Object f49642B = new Object();
    /* renamed from: C */
    public ByteBuffer f49643C;
    /* renamed from: D */
    public FFMpegMediaDemuxer f49644D;
    /* renamed from: E */
    public Iterator f49645E;
    /* renamed from: F */
    public AnonymousClass1Km f49646F;
    /* renamed from: G */
    public volatile boolean f49647G;
    /* renamed from: H */
    public final int f49648H;
    /* renamed from: I */
    public final int f49649I;
    /* renamed from: J */
    public final Object f49650J = new Object();
    /* renamed from: K */
    public boolean f49651K;
    /* renamed from: L */
    public boolean f49652L;
    /* renamed from: M */
    public long f49653M = Long.MAX_VALUE;
    /* renamed from: N */
    public final String f49654N;
    /* renamed from: O */
    public final Object f49655O = new Object();
    /* renamed from: P */
    public boolean f49656P;
    /* renamed from: Q */
    public AnonymousClass42r f49657Q;
    /* renamed from: R */
    public volatile int f49658R = -1;
    /* renamed from: S */
    public int f49659S;
    /* renamed from: T */
    public MediaPlayer f49660T;
    /* renamed from: U */
    private Queue f49661U;
    /* renamed from: V */
    private AnonymousClass42o f49662V;
    /* renamed from: W */
    private Queue f49663W;
    /* renamed from: X */
    private volatile boolean f49664X;
    /* renamed from: Y */
    private boolean f49665Y;
    /* renamed from: Z */
    private AnonymousClass2eX f49666Z;
    /* renamed from: a */
    private int f49667a;
    /* renamed from: b */
    private volatile int f49668b;
    /* renamed from: c */
    private final AnonymousClass0OA f49669c;
    /* renamed from: d */
    private int f49670d = 0;
    /* renamed from: e */
    private AnonymousClass42u f49671e;
    /* renamed from: f */
    private Queue f49672f;

    public AnonymousClass455(Context context, AnonymousClass0OA anonymousClass0OA, AnonymousClass3q5 anonymousClass3q5) {
        super(new AnonymousClass3oW(context, null, 0, 0));
        Point C = AnonymousClass2Mv.m15264C(anonymousClass0OA.f3795I, anonymousClass0OA.bC.f17224U, anonymousClass0OA.bC.f17214K);
        this.f49649I = C.x;
        this.f49648H = C.y;
        this.f44808B.m20758G(null, this.f49649I, this.f49648H);
        this.f49646F = anonymousClass0OA.bC;
        Integer.valueOf(anonymousClass0OA.AD);
        this.f49657Q = new AnonymousClass42r(this.f44808B.f44792G);
        AnonymousClass42o anonymousClass42o = new AnonymousClass42o(this.f44808B.f44792G, anonymousClass3q5.f45125C);
        this.f49662V = anonymousClass42o;
        anonymousClass42o.f48846C = anonymousClass3q5.f45126D;
        this.f49671e = new AnonymousClass42u(new AnonymousClass3oX[]{this.f49657Q, this.f49662V});
        this.f44808B.m20757F(this.f49671e);
        this.f49669c = anonymousClass0OA;
        this.f49661U = new LinkedList();
        this.f49643C = ByteBuffer.allocateDirect(65536);
        this.f49672f = new LinkedList();
        this.f49663W = new LinkedList();
        this.f49654N = AnonymousClass2NO.m15327H(context, anonymousClass0OA, "mkv", anonymousClass3q5.f45127E);
    }

    /* renamed from: A */
    public final void mo5097A() {
        VideoBridge.finishEncoding();
        synchronized (this.f49655O) {
            this.f49656P = false;
            this.f49660T.stop();
            this.f49660T.setSurface(null);
            this.f49660T.release();
        }
        FFMpegMediaDemuxer fFMpegMediaDemuxer = this.f49644D;
        if (fFMpegMediaDemuxer != null) {
            fFMpegMediaDemuxer.release();
        }
        if (m22272M()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Rendered to ");
            stringBuilder.append(this.f49654N);
            AnonymousClass0Dc.P("FinalRenderControllerICS", stringBuilder.toString());
            this.f49669c.IA(this.f49654N);
            return;
        }
        new File(this.f49654N).delete();
    }

    /* renamed from: B */
    public static boolean m22748B(FFMpegMediaDemuxer fFMpegMediaDemuxer) {
        fFMpegMediaDemuxer.initialize();
        int i = 0;
        while (i < fFMpegMediaDemuxer.getTrackCount()) {
            String string = fFMpegMediaDemuxer.getTrackFormat(i).getString("mime");
            if (string == null || !string.contains(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                i++;
            } else {
                fFMpegMediaDemuxer.selectTrack(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public final void mo5098F() {
        int i;
        Throwable e;
        Throwable th;
        IllegalStateException illegalStateException;
        AnonymousClass1Ag.C(this.f49654N);
        for (i = 0; i < 2; i++) {
            this.f49661U.offer(AnonymousClass28m.m14600C(this.f49649I, this.f49648H));
        }
        this.f44808B.m20756E(AnonymousClass3oV.RENDER_WHEN_DIRTY);
        this.f49671e.f48902B = 0;
        this.f49666Z = AnonymousClass28m.m14600C(this.f49649I, this.f49648H);
        if (!this.f49669c.hB) {
            ArrayList arrayList = new ArrayList();
            FFMpegMediaDemuxer fFMpegMediaDemuxer = null;
            try {
                FFMpegMediaDemuxer fFMpegMediaDemuxer2 = new FFMpegMediaDemuxer(AnonymousClass24g.f25652B, this.f49646F.f17222S, new Options());
                try {
                    if (AnonymousClass455.m22748B(fFMpegMediaDemuxer2)) {
                        long j = 0;
                        do {
                            arrayList.add(Long.valueOf(j));
                            j += fFMpegMediaDemuxer2.getSampleDuration();
                        } while (fFMpegMediaDemuxer2.advance());
                    }
                    fFMpegMediaDemuxer2.release();
                    arrayList.add(Long.valueOf(Long.MAX_VALUE));
                    try {
                        this.f49644D = new FFMpegMediaDemuxer(AnonymousClass24g.f25652B, this.f49646F.f17222S, new Options());
                        AnonymousClass455.m22748B(this.f49644D);
                        Iterator it = arrayList.iterator();
                        this.f49645E = it;
                        this.f49653M = ((Long) it.next()).longValue();
                        this.f49659S = this.f49646F.f17220Q * JsonMappingException.MAX_REFS_TO_LIST;
                        while (this.f49653M < ((long) this.f49659S)) {
                            this.f49653M = ((Long) this.f49645E.next()).longValue();
                            this.f49644D.advance();
                        }
                        VideoBridge.configureAACTrack(2, 48000);
                    } catch (Throwable e2) {
                        mo5091H(e2);
                        AnonymousClass0Dc.G("FinalRenderControllerICS", "Could not create audio demuxer", e2);
                        throw new RuntimeException(e2);
                    }
                } catch (IOException e3) {
                    e2 = e3;
                    fFMpegMediaDemuxer = fFMpegMediaDemuxer2;
                    try {
                        mo5091H(e2);
                        AnonymousClass0Dc.G("FinalRenderControllerICS", "Could not extract audio", e2);
                        throw new RuntimeException(e2);
                    } catch (Throwable th2) {
                        th = th2;
                        if (fFMpegMediaDemuxer != null) {
                            fFMpegMediaDemuxer.release();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fFMpegMediaDemuxer = fFMpegMediaDemuxer2;
                    if (fFMpegMediaDemuxer != null) {
                        fFMpegMediaDemuxer.release();
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e2 = e4;
                mo5091H(e2);
                AnonymousClass0Dc.G("FinalRenderControllerICS", "Could not extract audio", e2);
                throw new RuntimeException(e2);
            }
        }
        synchronized (this.f49655O) {
            try {
                this.f49656P = true;
                this.f49660T = new MediaPlayer();
                try {
                    this.f49660T.setDataSource(this.f49646F.f17222S);
                    this.f49660T.setVolume(0.0f, 0.0f);
                    this.f49660T.setSurface(new Surface(this.f49657Q.f48876C));
                    this.f49660T.setOnCompletionListener(this);
                    this.f49660T.setOnSeekCompleteListener(this);
                    this.f49660T.prepare();
                } catch (Throwable e5) {
                    mo5091H(e5);
                    illegalStateException = new IllegalStateException("Could not create media player", e5);
                    throw illegalStateException;
                }
            } catch (Throwable e52) {
                mo5091H(e52);
                illegalStateException = new IllegalStateException("Could not prepare player", e52);
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
        this.f49657Q.f48876C.setOnFrameAvailableListener(this);
        AnonymousClass42r anonymousClass42r = this.f49657Q;
        anonymousClass42r.f48878E.m19532A(this.f49646F);
        i = VideoBridge.configureVideoCodec(this.f49654N, this.f49649I, this.f49648H);
        if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not configure codec: ");
            stringBuilder.append(i);
            AnonymousClass0Dc.F("FinalRenderControllerICS", stringBuilder.toString());
        }
        if (this.f49646F.f17220Q > 3000) {
            this.f49660T.seekTo(this.f49646F.f17220Q - 3000);
        }
        synchronized (this.f49650J) {
            try {
                this.f49651K = true;
                this.f49650J.notifyAll();
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        }
    }

    /* renamed from: J */
    public final void mo5101J() {
        if (this.f49671e.m22294A(this.f49657Q)) {
            if (this.f49664X) {
                AnonymousClass2eX anonymousClass2eX = (AnonymousClass2eX) this.f49661U.poll();
                this.f49662V.f48845B.offer(anonymousClass2eX);
                this.f49672f.offer(Integer.valueOf(this.f49658R));
                int i = this.f49667a;
                if (i != -1) {
                    this.f49663W.offer(Integer.valueOf(i));
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Enqueueing frame at time ");
                stringBuilder.append(this.f49658R);
                stringBuilder.append(" for ");
                stringBuilder.append(this.f49667a);
                stringBuilder.append(" ms");
                stringBuilder.toString();
                this.f49664X = false;
            }
            if (this.f49665Y) {
                this.f49665Y = false;
                AnonymousClass3oW anonymousClass3oW = this.f44808B;
                anonymousClass3oW.f44807V.offer(new AnonymousClass3oT(anonymousClass3oW, this.f49666Z));
                this.f44808B.m20756E(AnonymousClass3oV.RENDER_CONTINUOUSLY);
                this.f49671e.f48902B = 1;
                return;
            }
            return;
        }
        this.f49670d++;
        Object[] objArr = new Object[]{Integer.valueOf(this.f49670d), this.f49672f.peek(), this.f49663W.peek(), Integer.valueOf(r4.QM()), Integer.valueOf(((AnonymousClass2eX) this.f49662V.f48845B.poll()).getTextureId())};
        double intValue = (double) (((Integer) this.f49672f.peek()).intValue() - this.f49646F.f17220Q);
        double duration = (double) this.f49646F.getDuration();
        Double.isNaN(intValue);
        Double.isNaN(duration);
        this.f49669c.HA(AnonymousClass2F8.RENDERING, intValue / duration);
        if (!this.f49669c.hB) {
            long intValue2 = (long) (((Integer) this.f49672f.peek()).intValue() * JsonMappingException.MAX_REFS_TO_LIST);
            while (this.f49653M < intValue2) {
                this.f49644D.advance();
                int readSampleData = this.f49644D.readSampleData(this.f49643C, 0);
                if (readSampleData > 0) {
                    VideoBridge.writeAudioPacket(this.f49643C, readSampleData, this.f49653M - ((long) this.f49659S));
                }
                this.f49653M = ((Long) this.f49645E.next()).longValue();
            }
        }
        VideoBridge.encodeFrame((long) ((((Integer) this.f49672f.poll()).intValue() * JsonMappingException.MAX_REFS_TO_LIST) - this.f49659S), (long) (((Integer) this.f49663W.poll()).intValue() * JsonMappingException.MAX_REFS_TO_LIST));
        this.f49661U.offer(r4);
        if (this.f49663W.isEmpty()) {
            if (this.f49647G) {
                this.f48842B = true;
                this.f44808B.m20752A();
            } else {
                this.f44808B.m20756E(AnonymousClass3oV.RENDER_WHEN_DIRTY);
                this.f49671e.f48902B = 0;
                this.f49657Q.f48876C.updateTexImage();
            }
            synchronized (this.f49642B) {
                this.f49642B.notifyAll();
            }
        }
    }

    /* renamed from: K */
    public final boolean mo5102K() {
        if (this.f49671e.m22294A(this.f49657Q)) {
            AnonymousClass3oW anonymousClass3oW = this.f44808B;
            anonymousClass3oW.f44807V.offer(new AnonymousClass3oT(anonymousClass3oW, (AnonymousClass2eX) this.f49661U.peek()));
        }
        return false;
    }

    /* renamed from: N */
    public final void mo5327N() {
        synchronized (this.f49642B) {
            this.f49642B.notifyAll();
        }
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        Throwable th;
        if (!this.f49647G) {
            this.f49647G = true;
            synchronized (this.f49655O) {
                try {
                    if (this.f49656P) {
                        this.f49663W.offer(Integer.valueOf(this.f49660T.getCurrentPosition() - this.f49668b));
                    } else {
                        this.f49663W.offer(Integer.valueOf(42));
                    }
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            this.f49671e.f48902B = 1;
            AnonymousClass3oW anonymousClass3oW = this.f44808B;
            anonymousClass3oW.f44807V.offer(new AnonymousClass3oT(anonymousClass3oW, this.f49666Z));
            this.f44808B.m20756E(AnonymousClass3oV.RENDER_CONTINUOUSLY);
            synchronized (this.f49642B) {
                try {
                    this.f49642B.notifyAll();
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Frame Available! ");
        stringBuilder.append(this.f49671e.m22294A(this.f49657Q) ? "P" : "C");
        stringBuilder.toString();
        if (this.f49671e.m22294A(this.f49657Q)) {
            synchronized (this.f49655O) {
                if (this.f49656P) {
                    this.f49668b = this.f49660T.getCurrentPosition();
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(this.f49658R);
                    stringBuilder2.append("\t");
                    stringBuilder2.append(this.f49668b);
                    stringBuilder2.toString();
                    if (this.f49668b >= this.f49646F.f17220Q) {
                        if (this.f49668b >= this.f49646F.f17209F) {
                            this.f49660T.stop();
                            this.f49663W.offer(Integer.valueOf(42));
                            this.f49665Y = true;
                            this.f49647G = true;
                        } else if (this.f49668b > this.f49658R && !this.f49652L) {
                            this.f49664X = true;
                            if (this.f49661U.size() != 2) {
                                this.f49667a = this.f49668b - this.f49658R;
                            } else {
                                this.f49667a = -1;
                            }
                            this.f49658R = this.f49668b;
                            if (this.f49661U.size() == 1) {
                                this.f49660T.pause();
                                this.f49665Y = true;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
        this.f49652L = true;
        m20766L();
    }

    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Seeked to ");
        stringBuilder.append(mediaPlayer.getCurrentPosition());
        stringBuilder.append(", requested ");
        stringBuilder.append(this.f49658R);
        stringBuilder.toString();
        this.f49652L = false;
        mediaPlayer.start();
    }
}
