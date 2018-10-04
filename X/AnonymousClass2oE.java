package X;

import android.view.View;

/* renamed from: X.2oE */
public final class AnonymousClass2oE implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2oF f34243B;
    /* renamed from: C */
    public final /* synthetic */ String f34244C;
    /* renamed from: D */
    public final /* synthetic */ View f34245D;

    public AnonymousClass2oE(AnonymousClass2oF anonymousClass2oF, View view, String str) {
        this.f34243B = anonymousClass2oF;
        this.f34245D = view;
        this.f34244C = str;
    }

    public final void run() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = r5.f34243B;
        r0 = r0.f34246B;
        r4 = r0.iterator();
    L_0x0008:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x004d;
    L_0x000e:
        r3 = r4.next();
        r3 = (X.AnonymousClass2o8) r3;
        r0 = r5.f34245D;
        r0 = r0.getContext();
        r0 = r0 instanceof android.app.Activity;
        if (r0 == 0) goto L_0x0008;
    L_0x001e:
        r0 = r5.f34245D;
        r1 = r0.getId();
        r0 = -1;
        r2 = 0;
        if (r1 != r0) goto L_0x0029;
    L_0x0028:
        goto L_0x0039;
    L_0x0029:
        r0 = r5.f34245D;	 Catch:{ NotFoundException -> 0x0039 }
        r1 = r0.getResources();	 Catch:{ NotFoundException -> 0x0039 }
        r0 = r5.f34245D;	 Catch:{ NotFoundException -> 0x0039 }
        r0 = r0.getId();	 Catch:{ NotFoundException -> 0x0039 }
        r2 = r1.getResourceName(r0);	 Catch:{ NotFoundException -> 0x0039 }
    L_0x0039:
        r1 = r5.f34244C;
        r0 = r5.f34245D;
        r0 = r0.getContext();
        r0 = r0.getClass();
        r0 = r0.getName();
        r3.qIA(r1, r0, r2);
        goto L_0x0008;
    L_0x004d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2oE.run():void");
    }
}
