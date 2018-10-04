package X;

import com.facebook.video.heroplayer.service.WarmUpPlayerListener;

/* renamed from: X.2pr */
public final class AnonymousClass2pr implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ WarmUpPlayerListener f34647B;
    /* renamed from: C */
    public final /* synthetic */ String f34648C;
    /* renamed from: D */
    public final /* synthetic */ long f34649D;
    /* renamed from: E */
    public final /* synthetic */ boolean f34650E;

    public AnonymousClass2pr(WarmUpPlayerListener warmUpPlayerListener, String str, boolean z, long j) {
        this.f34647B = warmUpPlayerListener;
        this.f34648C = str;
        this.f34650E = z;
        this.f34649D = j;
    }

    public final void run() {
        this.f34647B.f46038C.Si(this.f34648C, this.f34650E, this.f34649D);
    }
}
