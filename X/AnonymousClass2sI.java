package X;

import com.google.android.exoplayer.ext.vp9.LibvpxVideoTrackRenderer;

/* renamed from: X.2sI */
public final class AnonymousClass2sI implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ LibvpxVideoTrackRenderer f35188B;
    /* renamed from: C */
    public final /* synthetic */ int f35189C;
    /* renamed from: D */
    public final /* synthetic */ long f35190D;

    public AnonymousClass2sI(LibvpxVideoTrackRenderer libvpxVideoTrackRenderer, int i, long j) {
        this.f35188B = libvpxVideoTrackRenderer;
        this.f35189C = i;
        this.f35190D = j;
    }

    public final void run() {
        this.f35188B.f49798F.Ek(this.f35189C, this.f35190D);
    }
}
