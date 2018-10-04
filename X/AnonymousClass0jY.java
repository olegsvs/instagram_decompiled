package X;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.OverScroller;
import java.lang.reflect.Field;

/* renamed from: X.0jY */
public final class AnonymousClass0jY extends AnonymousClass0VA implements OnScrollListener {
    /* renamed from: D */
    private static Field f9200D;
    /* renamed from: E */
    private static Field f9201E;
    /* renamed from: F */
    private static Field f9202F;
    /* renamed from: G */
    private static Field f9203G;
    /* renamed from: B */
    private OverScroller f9204B;
    /* renamed from: C */
    private Object f9205C;

    static {
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
        r1 = android.widget.AbsListView.class;	 Catch:{ Exception -> 0x0049 }
        r0 = "mFlingRunnable";	 Catch:{ Exception -> 0x0049 }
        r0 = r1.getDeclaredField(r0);	 Catch:{ Exception -> 0x0049 }
        f9200D = r0;	 Catch:{ Exception -> 0x0049 }
        r0 = f9200D;	 Catch:{ Exception -> 0x0049 }
        r2 = 1;	 Catch:{ Exception -> 0x0049 }
        r0.setAccessible(r2);	 Catch:{ Exception -> 0x0049 }
        r0 = f9200D;	 Catch:{ Exception -> 0x0049 }
        r1 = r0.getType();	 Catch:{ Exception -> 0x0049 }
        r0 = "mScroller";	 Catch:{ Exception -> 0x0049 }
        r0 = r1.getDeclaredField(r0);	 Catch:{ Exception -> 0x0049 }
        f9201E = r0;	 Catch:{ Exception -> 0x0049 }
        r0 = f9201E;	 Catch:{ Exception -> 0x0049 }
        r0.setAccessible(r2);	 Catch:{ Exception -> 0x0049 }
        r0 = f9201E;	 Catch:{ Exception -> 0x0049 }
        r1 = r0.getType();	 Catch:{ Exception -> 0x0049 }
        r0 = "mScrollerY";	 Catch:{ Exception -> 0x0049 }
        r0 = r1.getDeclaredField(r0);	 Catch:{ Exception -> 0x0049 }
        f9202F = r0;	 Catch:{ Exception -> 0x0049 }
        r0 = f9202F;	 Catch:{ Exception -> 0x0049 }
        r0.setAccessible(r2);	 Catch:{ Exception -> 0x0049 }
        r0 = f9202F;	 Catch:{ Exception -> 0x0049 }
        r1 = r0.getType();	 Catch:{ Exception -> 0x0049 }
        r0 = "mCurrVelocity";	 Catch:{ Exception -> 0x0049 }
        r0 = r1.getDeclaredField(r0);	 Catch:{ Exception -> 0x0049 }
        f9203G = r0;	 Catch:{ Exception -> 0x0049 }
        r0 = f9203G;	 Catch:{ Exception -> 0x0049 }
        r0.setAccessible(r2);	 Catch:{ Exception -> 0x0049 }
    L_0x0049:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0jY.<clinit>():void");
    }

    /* renamed from: A */
    public final int m7126A() {
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
        r2 = this;
        r1 = r2.f9205C;
        if (r1 == 0) goto L_0x000f;
    L_0x0004:
        r0 = f9203G;	 Catch:{ Exception -> 0x0018 }
        r0 = r0.getFloat(r1);	 Catch:{ Exception -> 0x0018 }
        r1 = java.lang.Math.abs(r0);	 Catch:{ Exception -> 0x0018 }
        goto L_0x0019;	 Catch:{ Exception -> 0x0018 }
    L_0x000f:
        r0 = r2.f9204B;
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        r1 = r0.getCurrVelocity();
        goto L_0x0019;
    L_0x0018:
        r1 = 0;
    L_0x0019:
        r0 = java.lang.Float.isNaN(r1);
        if (r0 == 0) goto L_0x0021;
    L_0x001f:
        r0 = 0;
        goto L_0x0022;
    L_0x0021:
        r0 = (int) r1;
    L_0x0022:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0jY.A():int");
    }

    public final void gi() {
        this.f9204B = null;
        this.f9205C = null;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0cQ.m5858H(this, -84074860, AnonymousClass0cQ.m5859I(this, 322073038));
    }

    public final void onScrollStateChanged(android.widget.AbsListView r4, int r5) {
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
        r3 = this;
        r0 = 1101149686; // 0x41a235f6 float:20.276348 double:5.44040231E-315;
        r2 = X.AnonymousClass0cQ.m5859I(r3, r0);
        if (r5 == 0) goto L_0x0027;
    L_0x0009:
        r0 = r3.f9204B;
        if (r0 != 0) goto L_0x0027;
    L_0x000d:
        r0 = f9200D;	 Catch:{ Exception -> 0x0027 }
        r1 = r0.get(r4);	 Catch:{ Exception -> 0x0027 }
        r0 = f9201E;	 Catch:{ Exception -> 0x0027 }
        r0 = r0.get(r1);	 Catch:{ Exception -> 0x0027 }
        r0 = (android.widget.OverScroller) r0;	 Catch:{ Exception -> 0x0027 }
        r3.f9204B = r0;	 Catch:{ Exception -> 0x0027 }
        r1 = f9202F;	 Catch:{ Exception -> 0x0027 }
        r0 = r3.f9204B;	 Catch:{ Exception -> 0x0027 }
        r0 = r1.get(r0);	 Catch:{ Exception -> 0x0027 }
        r3.f9205C = r0;	 Catch:{ Exception -> 0x0027 }
    L_0x0027:
        r0 = -1539705404; // 0xffffffffa439f5c4 float:-4.0323652E-17 double:NaN;
        X.AnonymousClass0cQ.m5858H(r3, r0, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0jY.onScrollStateChanged(android.widget.AbsListView, int):void");
    }
}
