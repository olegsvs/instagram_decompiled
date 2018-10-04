package com.facebook.common.dextricks.classid;

import X.AnonymousClass0CF;
import com.android.dex.Dex;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;

public class ClassId {
    private static Field comAndroidDexDex_data;
    private static Field javaLangClass_dexCache;
    private static Field javaLangClass_dexClassDefIndex;
    private static Method javaLangClass_getDex;
    private static Method javaLangClass_getDexClassDefIndex;
    private static Field javaLangDexCache_dexFile;
    private static Method javaLangDexCache_getDex;
    private static final ConcurrentHashMap sDexKeyToDexSignature = new ConcurrentHashMap(0, 0.9f);
    public static final boolean sInitialized = initialize();

    private static native int getSignatureFromDexData(ByteBuffer byteBuffer);

    private static native int getSignatureFromDexFile(long j);

    static {
        AnonymousClass0CF.m856E("classid");
    }

    private static int calculateViaDexCacheDexFileSignature(Class cls) {
        cls = javaLangClass_dexCache.get(cls);
        if (cls == null) {
            return 0;
        }
        Integer num = (Integer) sDexKeyToDexSignature.get(cls);
        if (num == null) {
            num = Integer.valueOf(getSignatureFromDexFile(javaLangDexCache_dexFile.getLong(cls)));
            sDexKeyToDexSignature.put(cls, num);
        }
        return num.intValue();
    }

    private static int calculateViaDexCacheDexSignature(Class cls) {
        cls = javaLangClass_dexCache.get(cls);
        if (cls == null) {
            return 0;
        }
        Integer num = (Integer) sDexKeyToDexSignature.get(cls);
        if (num == null) {
            num = Integer.valueOf(getSignatureForDex((Dex) javaLangDexCache_getDex.invoke(cls, new Object[0])));
            sDexKeyToDexSignature.put(cls, num);
        }
        return num.intValue();
    }

    private static int calculateViaDexObjDexSignature(Class cls) {
        Dex dex = (Dex) javaLangClass_getDex.invoke(cls, new Object[0]);
        if (dex == null) {
            return 0;
        }
        Integer num = (Integer) sDexKeyToDexSignature.get(dex);
        if (num == null) {
            num = Integer.valueOf(getSignatureForDex(dex));
            sDexKeyToDexSignature.put(dex, num);
        }
        return num.intValue();
    }

    private static int getClassDef(Class cls) {
        try {
            if (javaLangClass_dexClassDefIndex != null) {
                return ((Integer) javaLangClass_dexClassDefIndex.get(cls)).intValue();
            }
            if (javaLangClass_getDexClassDefIndex != null) {
                return ((Integer) javaLangClass_getDexClassDefIndex.invoke(cls, new Object[0])).intValue();
            }
            throw new IllegalStateException();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static long getClassId(Class cls) {
        if (sInitialized) {
            return (((long) getDexSignature(cls)) & 4294967295L) | (((long) getClassDef(cls)) << 32);
        }
        return -1;
    }

    private static int getDexSignature(Class cls) {
        try {
            if (javaLangDexCache_dexFile != null) {
                return calculateViaDexCacheDexFileSignature(cls);
            }
            if (javaLangClass_dexCache != null) {
                return calculateViaDexCacheDexSignature(cls);
            }
            if (javaLangClass_getDex != null) {
                return calculateViaDexObjDexSignature(cls);
            }
            throw new IllegalStateException();
        } catch (Class cls2) {
            throw new RuntimeException(cls2);
        }
    }

    private static int getSignatureForDex(Dex dex) {
        Field field = comAndroidDexDex_data;
        if (field != null) {
            int signatureFromDexData = getSignatureFromDexData((ByteBuffer) field.get(dex));
            if (signatureFromDexData != 0) {
                return signatureFromDexData;
            }
        }
        return dex.open(12).readInt();
    }

    public static synchronized boolean initialize() {
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
        r7 = com.facebook.common.dextricks.classid.ClassId.class;
        monitor-enter(r7);
        r5 = java.lang.Class.class;	 Catch:{ all -> 0x0072 }
        r4 = 1;	 Catch:{ all -> 0x0072 }
        r0 = "com.android.dex.Dex";	 Catch:{ Exception -> 0x0017 }
        r1 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0017 }
        r0 = "data";	 Catch:{ Exception -> 0x0017 }
        r0 = r1.getDeclaredField(r0);	 Catch:{ Exception -> 0x0017 }
        r0.setAccessible(r4);	 Catch:{ Exception -> 0x0017 }
        comAndroidDexDex_data = r0;	 Catch:{ Exception -> 0x0017 }
    L_0x0017:
        r3 = 0;
        r0 = "dexClassDefIndex";	 Catch:{ Exception -> 0x0052 }
        r6 = r5.getDeclaredField(r0);	 Catch:{ Exception -> 0x0052 }
        r0 = "dexCache";	 Catch:{ Exception -> 0x0052 }
        r1 = r5.getDeclaredField(r0);	 Catch:{ Exception -> 0x0052 }
        r0 = "java.lang.DexCache";	 Catch:{ Exception -> 0x0052 }
        r2 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0052 }
        r6.setAccessible(r4);	 Catch:{ Exception -> 0x0052 }
        r1.setAccessible(r4);	 Catch:{ Exception -> 0x0052 }
        javaLangClass_dexClassDefIndex = r6;	 Catch:{ Exception -> 0x0052 }
        javaLangClass_dexCache = r1;	 Catch:{ Exception -> 0x0052 }
        r1 = "getDex";	 Catch:{ Exception -> 0x0042 }
        r0 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0042 }
        r0 = r2.getDeclaredMethod(r1, r0);	 Catch:{ Exception -> 0x0042 }
        r0.setAccessible(r4);	 Catch:{ Exception -> 0x0042 }
        javaLangDexCache_getDex = r0;	 Catch:{ Exception -> 0x0042 }
        goto L_0x004d;	 Catch:{ Exception -> 0x0042 }
    L_0x0042:
        r0 = "dexFile";	 Catch:{ Exception -> 0x0052 }
        r0 = r2.getDeclaredField(r0);	 Catch:{ Exception -> 0x0052 }
        r0.setAccessible(r4);	 Catch:{ Exception -> 0x0052 }
        javaLangDexCache_dexFile = r0;	 Catch:{ Exception -> 0x0052 }
    L_0x004d:
        verifyInitialize();	 Catch:{ Exception -> 0x0052 }
    L_0x0050:
        monitor-exit(r7);
        return r4;
    L_0x0052:
        r1 = "getDexClassDefIndex";	 Catch:{ Exception -> 0x0070 }
        r0 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0070 }
        r2 = r5.getDeclaredMethod(r1, r0);	 Catch:{ Exception -> 0x0070 }
        r1 = "getDex";	 Catch:{ Exception -> 0x0070 }
        r0 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0070 }
        r0 = r5.getDeclaredMethod(r1, r0);	 Catch:{ Exception -> 0x0070 }
        r2.setAccessible(r4);	 Catch:{ Exception -> 0x0070 }
        r0.setAccessible(r4);	 Catch:{ Exception -> 0x0070 }
        javaLangClass_getDexClassDefIndex = r2;	 Catch:{ Exception -> 0x0070 }
        javaLangClass_getDex = r0;	 Catch:{ Exception -> 0x0070 }
        verifyInitialize();	 Catch:{ Exception -> 0x0070 }
        goto L_0x0050;	 Catch:{ Exception -> 0x0070 }
    L_0x0070:
        monitor-exit(r7);
        return r3;
    L_0x0072:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.classid.ClassId.initialize():boolean");
    }

    private static void verifyInitialize() {
        Class cls = ClassId.class;
        getClassDef(cls);
        getDexSignature(cls);
    }
}
