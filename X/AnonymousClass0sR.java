package X;

import android.content.Context;
import android.view.LayoutInflater;

/* renamed from: X.0sR */
public final class AnonymousClass0sR extends LayoutInflater {
    /* renamed from: B */
    private static final String[] f11429B = new String[]{"android.widget.", "android.webkit.", "android.app."};

    public AnonymousClass0sR(Context context) {
        super(context);
    }

    public final LayoutInflater cloneInContext(Context context) {
        return new AnonymousClass0sR(context);
    }

    public final android.view.View onCreateView(java.lang.String r5, android.util.AttributeSet r6) {
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
        r4 = this;
        r3 = f11429B;
        r2 = r3.length;
        r1 = 0;
    L_0x0004:
        if (r1 >= r2) goto L_0x0012;
    L_0x0006:
        r0 = r3[r1];
        r0 = r4.createView(r5, r0, r6);	 Catch:{ ClassNotFoundException -> 0x000f }
        if (r0 == 0) goto L_0x000f;	 Catch:{ ClassNotFoundException -> 0x000f }
    L_0x000e:
        return r0;	 Catch:{ ClassNotFoundException -> 0x000f }
    L_0x000f:
        r1 = r1 + 1;
        goto L_0x0004;
    L_0x0012:
        r0 = super.onCreateView(r5, r6);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0sR.onCreateView(java.lang.String, android.util.AttributeSet):android.view.View");
    }
}
