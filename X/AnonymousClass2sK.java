package X;

import com.google.android.exoplayer.ext.vp9.LibvpxVideoTrackRenderer;

/* renamed from: X.2sK */
public final class AnonymousClass2sK implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ LibvpxVideoTrackRenderer f35193B;
    /* renamed from: C */
    public final /* synthetic */ long f35194C;
    /* renamed from: D */
    public final /* synthetic */ long f35195D;

    public AnonymousClass2sK(LibvpxVideoTrackRenderer libvpxVideoTrackRenderer, long j, long j2) {
        this.f35193B = libvpxVideoTrackRenderer;
        this.f35194C = j;
        this.f35195D = j2;
    }

    public final void run() {
        long j = this.f35194C;
        this.f35193B.f49798F.Ti("libvpx", true, j, j - this.f35195D);
    }
}
