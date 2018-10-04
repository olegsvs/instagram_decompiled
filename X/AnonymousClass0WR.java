package X;

import com.instagram.pendingmedia.model.PendingRecipient;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0WR */
public final class AnonymousClass0WR implements Cloneable {
    /* renamed from: B */
    public List f5974B = Collections.emptyList();
    /* renamed from: C */
    public AnonymousClass0XJ f5975C = ((AnonymousClass0XJ) AnonymousClass0WT.f5987B.f5989C);
    /* renamed from: D */
    public String f5976D;
    /* renamed from: E */
    public AnonymousClass0XJ f5977E = ((AnonymousClass0XJ) AnonymousClass0WT.f5987B.f5989C);
    /* renamed from: F */
    public long f5978F = -1;
    /* renamed from: G */
    public boolean f5979G;
    /* renamed from: H */
    public PendingRecipient f5980H;
    /* renamed from: I */
    public int f5981I;
    /* renamed from: J */
    public long f5982J;
    /* renamed from: K */
    public int f5983K;

    public AnonymousClass0WR(int i, List list) {
        this.f5983K = i;
        this.f5974B = list;
    }

    /* renamed from: A */
    public final AnonymousClass0WR m5137A() {
        try {
            return (AnonymousClass0WR) super.clone();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: B */
    public final AnonymousClass0WS m5138B() {
        return AnonymousClass0WS.m5140B(AnonymousClass0WT.f5987B, this.f5977E, this.f5975C);
    }

    /* renamed from: C */
    public final void m5139C(AnonymousClass0WS anonymousClass0WS) {
        this.f5977E = (AnonymousClass0XJ) anonymousClass0WS.f5985C;
        this.f5975C = (AnonymousClass0XJ) anonymousClass0WS.f5984B;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m5137A();
    }

    public final java.lang.String toString() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r0 = this;
        r0 = X.AnonymousClass18V.m9615C(r0);	 Catch:{ IOException -> 0x0005 }
        return r0;	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        r0 = super.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0WR.toString():java.lang.String");
    }
}
