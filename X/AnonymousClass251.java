package X;

import com.instagram.common.gallery.Medium;
import java.lang.ref.WeakReference;

/* renamed from: X.251 */
public final class AnonymousClass251 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2Uf f25713B;
    /* renamed from: C */
    public final /* synthetic */ WeakReference f25714C;
    /* renamed from: D */
    public final /* synthetic */ Medium f25715D;

    public AnonymousClass251(AnonymousClass2Uf anonymousClass2Uf, Medium medium, WeakReference weakReference) {
        this.f25713B = anonymousClass2Uf;
        this.f25715D = medium;
        this.f25714C = weakReference;
    }

    public final void run() {
        AnonymousClass2Uf.m16050C(this.f25713B, this.f25715D, this.f25714C);
    }
}
