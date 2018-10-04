package X;

import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1f4 */
public final class AnonymousClass1f4 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1c6 f21074B;
    /* renamed from: C */
    public final /* synthetic */ long f21075C;
    /* renamed from: D */
    public final /* synthetic */ List f21076D;
    /* renamed from: E */
    public final /* synthetic */ ParcelableFormat f21077E;
    /* renamed from: F */
    public final /* synthetic */ String f21078F;

    public AnonymousClass1f4(AnonymousClass1c6 anonymousClass1c6, ParcelableFormat parcelableFormat, long j, String str, List list) {
        this.f21074B = anonymousClass1c6;
        this.f21077E = parcelableFormat;
        this.f21075C = j;
        this.f21078F = str;
        this.f21076D = list;
    }

    public final void run() {
        Iterator it = this.f21074B.f20589B.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1H6) it.next()).Pj(this.f21077E, this.f21075C, this.f21078F, this.f21076D);
        }
    }
}
