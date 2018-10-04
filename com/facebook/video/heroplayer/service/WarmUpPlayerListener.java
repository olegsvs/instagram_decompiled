package com.facebook.video.heroplayer.service;

import X.AnonymousClass0cQ;
import X.AnonymousClass2pm;
import X.AnonymousClass2pn;
import X.AnonymousClass2po;
import X.AnonymousClass2pp;
import X.AnonymousClass2pq;
import X.AnonymousClass2pr;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class WarmUpPlayerListener extends HeroServicePlayerDummyListener {
    /* renamed from: B */
    public final Queue f46037B = new ConcurrentLinkedQueue();
    /* renamed from: C */
    public HeroServicePlayerCallback f46038C;

    public WarmUpPlayerListener() {
        int I = AnonymousClass0cQ.I(this, -176984757);
        AnonymousClass0cQ.H(this, -1060539644, I);
    }

    public final void GGA(int i, int i2) {
        int I = AnonymousClass0cQ.I(this, 2061510879);
        this.f46037B.add(new AnonymousClass2pp(this, i, i2));
        AnonymousClass0cQ.H(this, 638579704, I);
    }

    public final void Qj(ParcelableFormat parcelableFormat, String str, List list) {
        int I = AnonymousClass0cQ.I(this, -915076602);
        this.f46037B.add(new AnonymousClass2pq(this, parcelableFormat, str, list));
        AnonymousClass0cQ.H(this, 319919505, I);
    }

    public final void Si(String str, boolean z, long j) {
        int I = AnonymousClass0cQ.I(this, -22700534);
        this.f46037B.add(new AnonymousClass2pr(this, str, z, j));
        AnonymousClass0cQ.H(this, -1963949019, I);
    }

    public final void du(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.I(this, -65403712);
        this.f46037B.add(new AnonymousClass2po(this, servicePlayerState));
        AnonymousClass0cQ.H(this, -1553952254, I);
    }

    public final void kGA(String str) {
        int I = AnonymousClass0cQ.I(this, -428366862);
        this.f46037B.add(new AnonymousClass2pn(this, str));
        AnonymousClass0cQ.H(this, -682810063, I);
    }

    public final void rk(String str, String str2) {
        int I = AnonymousClass0cQ.I(this, 1493055174);
        this.f46037B.add(new AnonymousClass2pm(this, str, str2));
        AnonymousClass0cQ.H(this, 1637867845, I);
    }
}
