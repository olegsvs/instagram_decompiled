package com.facebook.react.views.imagehelper;

import java.util.HashMap;
import java.util.Map;

public final class ResourceDrawableIdHelper {
    private static volatile ResourceDrawableIdHelper sResourceDrawableIdHelper;
    private Map mResourceDrawableIdMap = new HashMap();

    private ResourceDrawableIdHelper() {
    }

    public final synchronized void clear() {
        this.mResourceDrawableIdMap.clear();
    }

    public static ResourceDrawableIdHelper getInstance() {
        if (sResourceDrawableIdHelper == null) {
            synchronized (ResourceDrawableIdHelper.class) {
                if (sResourceDrawableIdHelper == null) {
                    sResourceDrawableIdHelper = new ResourceDrawableIdHelper();
                }
            }
        }
        return sResourceDrawableIdHelper;
    }

    public final int getResourceDrawableId(android.content.Context r5, java.lang.String r6) {
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
        if (r6 == 0) goto L_0x004d;
    L_0x0002:
        r0 = r6.isEmpty();
        if (r0 == 0) goto L_0x0009;
    L_0x0008:
        goto L_0x004d;
    L_0x0009:
        r2 = r6.toLowerCase();
        r1 = "-";
        r0 = "_";
        r3 = r2.replace(r1, r0);
        r0 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x001a }
        return r0;	 Catch:{ NumberFormatException -> 0x001a }
    L_0x001a:
        monitor-enter(r4);
        r0 = r4.mResourceDrawableIdMap;	 Catch:{ all -> 0x004a }
        r0 = r0.containsKey(r3);	 Catch:{ all -> 0x004a }
        if (r0 == 0) goto L_0x0031;	 Catch:{ all -> 0x004a }
    L_0x0023:
        r0 = r4.mResourceDrawableIdMap;	 Catch:{ all -> 0x004a }
        r0 = r0.get(r3);	 Catch:{ all -> 0x004a }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x004a }
        r2 = r0.intValue();	 Catch:{ all -> 0x004a }
        monitor-exit(r4);	 Catch:{ all -> 0x004a }
    L_0x0030:
        return r2;	 Catch:{ all -> 0x004a }
    L_0x0031:
        r2 = r5.getResources();	 Catch:{ all -> 0x004a }
        r1 = "drawable";	 Catch:{ all -> 0x004a }
        r0 = r5.getPackageName();	 Catch:{ all -> 0x004a }
        r2 = r2.getIdentifier(r3, r1, r0);	 Catch:{ all -> 0x004a }
        r1 = r4.mResourceDrawableIdMap;	 Catch:{ all -> 0x004a }
        r0 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x004a }
        r1.put(r3, r0);	 Catch:{ all -> 0x004a }
        monitor-exit(r4);	 Catch:{ all -> 0x004a }
        goto L_0x0030;	 Catch:{ all -> 0x004a }
    L_0x004a:
        r0 = move-exception;	 Catch:{ all -> 0x004a }
        monitor-exit(r4);	 Catch:{ all -> 0x004a }
        throw r0;
    L_0x004d:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.imagehelper.ResourceDrawableIdHelper.getResourceDrawableId(android.content.Context, java.lang.String):int");
    }
}
