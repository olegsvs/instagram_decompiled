package com.facebook.common.dextricks;

import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Field;

public final class MemoryReductionHack {
    private static final String TAG = "MemoryReductionHack";

    public static void freeApkZip(android.content.Context r3) {
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
        r2 = r3.getPackageManager();
        r1 = r3.getPackageName();	 Catch:{ NameNotFoundException -> 0x0051, IllegalAccessException -> 0x0049, NoSuchFieldException -> 0x0041, RuntimeException -> 0x0025 }
        r0 = 0;	 Catch:{ NameNotFoundException -> 0x0051, IllegalAccessException -> 0x0049, NoSuchFieldException -> 0x0041, RuntimeException -> 0x0025 }
        r2 = r2.getApplicationInfo(r1, r0);	 Catch:{ NameNotFoundException -> 0x0051, IllegalAccessException -> 0x0049, NoSuchFieldException -> 0x0041, RuntimeException -> 0x0025 }
        r1 = r3.getClassLoader();	 Catch:{ NameNotFoundException -> 0x0051, IllegalAccessException -> 0x0049, NoSuchFieldException -> 0x0041, RuntimeException -> 0x0025 }
        r0 = r1 instanceof dalvik.system.PathClassLoader;	 Catch:{ NameNotFoundException -> 0x0051, IllegalAccessException -> 0x0049, NoSuchFieldException -> 0x0041, RuntimeException -> 0x0025 }
        if (r0 == 0) goto L_0x001d;	 Catch:{ NameNotFoundException -> 0x0051, IllegalAccessException -> 0x0049, NoSuchFieldException -> 0x0041, RuntimeException -> 0x0025 }
    L_0x0015:
        r0 = r2.sourceDir;	 Catch:{ NameNotFoundException -> 0x0051, IllegalAccessException -> 0x0049, NoSuchFieldException -> 0x0041, RuntimeException -> 0x0025 }
        r1 = (dalvik.system.PathClassLoader) r1;	 Catch:{ NameNotFoundException -> 0x0051, IllegalAccessException -> 0x0049, NoSuchFieldException -> 0x0041, RuntimeException -> 0x0025 }
        removeZipFromPathClassLoader(r0, r1);	 Catch:{ NameNotFoundException -> 0x0051, IllegalAccessException -> 0x0049, NoSuchFieldException -> 0x0041, RuntimeException -> 0x0025 }
        goto L_0x0058;	 Catch:{ NameNotFoundException -> 0x0051, IllegalAccessException -> 0x0049, NoSuchFieldException -> 0x0041, RuntimeException -> 0x0025 }
    L_0x001d:
        r1 = "MemoryReductionHack";	 Catch:{ NameNotFoundException -> 0x0051, IllegalAccessException -> 0x0049, NoSuchFieldException -> 0x0041, RuntimeException -> 0x0025 }
        r0 = "system classloader of unexpected type";	 Catch:{ NameNotFoundException -> 0x0051, IllegalAccessException -> 0x0049, NoSuchFieldException -> 0x0041, RuntimeException -> 0x0025 }
        android.util.Log.w(r1, r0);	 Catch:{ NameNotFoundException -> 0x0051, IllegalAccessException -> 0x0049, NoSuchFieldException -> 0x0041, RuntimeException -> 0x0025 }
        goto L_0x0058;	 Catch:{ NameNotFoundException -> 0x0051, IllegalAccessException -> 0x0049, NoSuchFieldException -> 0x0041, RuntimeException -> 0x0025 }
    L_0x0025:
        r3 = move-exception;
        r1 = r3.getMessage();
        if (r1 == 0) goto L_0x0040;
    L_0x002c:
        r0 = "Package manager has died";
        r0 = r1.contains(r0);
        if (r0 == 0) goto L_0x0040;
    L_0x0034:
        r2 = "MemoryReductionHack";
        r1 = "Couldn't retrieve the applicaiton info because PackageManager died";
        r0 = r3.getCause();
        android.util.Log.w(r2, r1, r0);
        goto L_0x0058;
    L_0x0040:
        throw r3;
    L_0x0041:
        r1 = "MemoryReductionHack";
        r0 = "Couldn't update the Loader (NoSuchFieldException)";
        android.util.Log.w(r1, r0);
        goto L_0x0058;
    L_0x0049:
        r1 = "MemoryReductionHack";
        r0 = "Couldn't update the Loader (IllegalAccessException)";
        android.util.Log.w(r1, r0);
        goto L_0x0058;
    L_0x0051:
        r1 = "MemoryReductionHack";
        r0 = "Couldn't retrieve the application info";
        android.util.Log.w(r1, r0);
    L_0x0058:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MemoryReductionHack.freeApkZip(android.content.Context):void");
    }

    private static Object getDexElementsArray(Object obj) {
        return getField(obj, obj.getClass(), "dexElements");
    }

    private static Object getDexPathList(BaseDexClassLoader baseDexClassLoader) {
        return getField(baseDexClassLoader, BaseDexClassLoader.class, "pathList");
    }

    private static Object getField(Object obj, Class cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static void removeZipFromPathClassLoader(java.lang.String r8, dalvik.system.PathClassLoader r9) {
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
        r0 = getDexPathList(r9);
        r7 = getDexElementsArray(r0);
        r6 = java.lang.reflect.Array.getLength(r7);
        r5 = 0;
    L_0x000d:
        if (r5 >= r6) goto L_0x008a;
    L_0x000f:
        r3 = java.lang.reflect.Array.get(r7, r5);
        r1 = r3.getClass();	 Catch:{ NoSuchFieldException -> 0x0020 }
        r0 = "file";	 Catch:{ NoSuchFieldException -> 0x0020 }
        r4 = getField(r3, r1, r0);	 Catch:{ NoSuchFieldException -> 0x0020 }
        r4 = (java.io.File) r4;	 Catch:{ NoSuchFieldException -> 0x0020 }
        goto L_0x002c;	 Catch:{ NoSuchFieldException -> 0x0020 }
    L_0x0020:
        r1 = r3.getClass();
        r0 = "zip";
        r4 = getField(r3, r1, r0);
        r4 = (java.io.File) r4;
    L_0x002c:
        r2 = 0;
        r1 = r3.getClass();	 Catch:{ NoSuchFieldException -> 0x003a }
        r0 = "zipFile";	 Catch:{ NoSuchFieldException -> 0x003a }
        r1 = getField(r3, r1, r0);	 Catch:{ NoSuchFieldException -> 0x003a }
        r1 = (java.util.zip.ZipFile) r1;	 Catch:{ NoSuchFieldException -> 0x003a }
        goto L_0x003b;	 Catch:{ NoSuchFieldException -> 0x003a }
    L_0x003a:
        r1 = r2;
    L_0x003b:
        if (r4 == 0) goto L_0x0087;
    L_0x003d:
        r0 = r4.getPath();
        r0 = r8.equals(r0);
        if (r0 == 0) goto L_0x0087;
    L_0x0047:
        if (r1 == 0) goto L_0x0062;
    L_0x0049:
        r1 = r3.getClass();
        r0 = "zipFile";
        setField(r3, r1, r0, r2);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Zeroed out zipFile entry corresponding to path ";
        r1.append(r0);
        r1.append(r8);
        r1.toString();
    L_0x0062:
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 18;
        if (r1 < r0) goto L_0x0086;
    L_0x0068:
        r2 = r3.getClass();
        r1 = "initialized";
        r0 = 1;
        r0 = java.lang.Boolean.valueOf(r0);
        setField(r3, r2, r1, r0);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Marked as initialized entry corresponding to path ";
        r1.append(r0);
        r1.append(r8);
        r1.toString();
    L_0x0086:
        return;
    L_0x0087:
        r5 = r5 + 1;
        goto L_0x000d;
    L_0x008a:
        r2 = "MemoryReductionHack";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Could not find zipFile entry corresponding to path ";
        r1.append(r0);
        r1.append(r8);
        r0 = r1.toString();
        android.util.Log.w(r2, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MemoryReductionHack.removeZipFromPathClassLoader(java.lang.String, dalvik.system.PathClassLoader):void");
    }

    private static void setField(Object obj, Class cls, String str, Object obj2) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }
}
