package com.facebook.common.classmarkers;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class DynamicClassMarkerCreation {
    private static final ConcurrentHashMap CLASS_NAME_TO_NUM = new ConcurrentHashMap();
    private static final Class[] DYANMIC_CLASS_INTERFACES;
    private static final Class[][] EMPTY_EXCEPTIONS_ARRAY = new Class[0][];
    private static final Object[] EMPTY_METHOD_ARRAY;
    private static final String END_MARKER = "LoadMarkerEnd";
    private static final boolean IS_SUPPORTED;
    private static final int MAX_CLASS_NUM = 5;
    private static final int NO_NUM = -1;
    private static Method Proxy_generateProxyNew = null;
    private static Method Proxy_generateProxyOld = null;
    private static final String START_MARKER = "LoadMarkerStart";
    private static final Class TAG = DynamicClassMarkerCreation.class;

    public interface ClassLoadMarker {
    }

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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r0 = com.facebook.common.classmarkers.DynamicClassMarkerCreation.class;
        TAG = r0;
        r0 = new java.util.concurrent.ConcurrentHashMap;
        r0.<init>();
        CLASS_NAME_TO_NUM = r0;
        r5 = 1;
        r1 = new java.lang.Class[r5];
        r0 = com.facebook.common.classmarkers.DynamicClassMarkerCreation.ClassLoadMarker.class;
        r6 = 0;
        r1[r6] = r0;
        DYANMIC_CLASS_INTERFACES = r1;
        r0 = new java.lang.Class[r6][];
        EMPTY_EXCEPTIONS_ARRAY = r0;
        r0 = "java.lang.reflect.ArtMethod";	 Catch:{ ClassNotFoundException -> 0x0028 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0028 }
        r0 = java.lang.reflect.Array.newInstance(r0, r6);	 Catch:{ ClassNotFoundException -> 0x0028 }
        r0 = (java.lang.Object[]) r0;	 Catch:{ ClassNotFoundException -> 0x0028 }
        r0 = (java.lang.Object[]) r0;	 Catch:{ ClassNotFoundException -> 0x0028 }
        goto L_0x002a;	 Catch:{ ClassNotFoundException -> 0x0028 }
    L_0x0028:
        r0 = new java.lang.reflect.Method[r6];
    L_0x002a:
        EMPTY_METHOD_ARRAY = r0;
        r9 = 2;
        r7 = 3;
        r8 = 0;
        r0 = EMPTY_METHOD_ARRAY;	 Catch:{ NoSuchMethodException -> 0x005c }
        r1 = r0.getClass();	 Catch:{ NoSuchMethodException -> 0x005c }
        r4 = java.lang.reflect.Proxy.class;	 Catch:{ NoSuchMethodException -> 0x005c }
        r3 = "generateProxy";	 Catch:{ NoSuchMethodException -> 0x005c }
        r0 = 5;	 Catch:{ NoSuchMethodException -> 0x005c }
        r2 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x005c }
        r0 = java.lang.String.class;	 Catch:{ NoSuchMethodException -> 0x005c }
        r2[r6] = r0;	 Catch:{ NoSuchMethodException -> 0x005c }
        r0 = java.lang.Class[].class;	 Catch:{ NoSuchMethodException -> 0x005c }
        r2[r5] = r0;	 Catch:{ NoSuchMethodException -> 0x005c }
        r0 = java.lang.ClassLoader.class;	 Catch:{ NoSuchMethodException -> 0x005c }
        r2[r9] = r0;	 Catch:{ NoSuchMethodException -> 0x005c }
        r2[r7] = r1;	 Catch:{ NoSuchMethodException -> 0x005c }
        r1 = 4;	 Catch:{ NoSuchMethodException -> 0x005c }
        r0 = java.lang.Class[][].class;	 Catch:{ NoSuchMethodException -> 0x005c }
        r2[r1] = r0;	 Catch:{ NoSuchMethodException -> 0x005c }
        r0 = r4.getDeclaredMethod(r3, r2);	 Catch:{ NoSuchMethodException -> 0x005c }
        Proxy_generateProxyNew = r0;	 Catch:{ NoSuchMethodException -> 0x005c }
        r0 = Proxy_generateProxyNew;	 Catch:{ NoSuchMethodException -> 0x005c }
        r0.setAccessible(r5);	 Catch:{ NoSuchMethodException -> 0x005c }
        r4 = 1;	 Catch:{ NoSuchMethodException -> 0x005c }
        goto L_0x005f;	 Catch:{ NoSuchMethodException -> 0x005c }
    L_0x005c:
        Proxy_generateProxyNew = r8;
        r4 = 0;
    L_0x005f:
        r0 = Proxy_generateProxyNew;
        if (r0 != 0) goto L_0x0083;
    L_0x0063:
        r3 = java.lang.reflect.Proxy.class;	 Catch:{ NoSuchMethodException -> 0x0081 }
        r2 = "generateProxy";	 Catch:{ NoSuchMethodException -> 0x0081 }
        r1 = new java.lang.Class[r7];	 Catch:{ NoSuchMethodException -> 0x0081 }
        r0 = java.lang.String.class;	 Catch:{ NoSuchMethodException -> 0x0081 }
        r1[r6] = r0;	 Catch:{ NoSuchMethodException -> 0x0081 }
        r0 = java.lang.Class[].class;	 Catch:{ NoSuchMethodException -> 0x0081 }
        r1[r5] = r0;	 Catch:{ NoSuchMethodException -> 0x0081 }
        r0 = java.lang.ClassLoader.class;	 Catch:{ NoSuchMethodException -> 0x0081 }
        r1[r9] = r0;	 Catch:{ NoSuchMethodException -> 0x0081 }
        r0 = r3.getDeclaredMethod(r2, r1);	 Catch:{ NoSuchMethodException -> 0x0081 }
        Proxy_generateProxyOld = r0;	 Catch:{ NoSuchMethodException -> 0x0081 }
        r0 = Proxy_generateProxyOld;	 Catch:{ NoSuchMethodException -> 0x0081 }
        r0.setAccessible(r5);	 Catch:{ NoSuchMethodException -> 0x0081 }
        goto L_0x0084;	 Catch:{ NoSuchMethodException -> 0x0081 }
    L_0x0081:
        Proxy_generateProxyOld = r8;
    L_0x0083:
        r5 = r4;
    L_0x0084:
        IS_SUPPORTED = r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.classmarkers.DynamicClassMarkerCreation.<clinit>():void");
    }

    private DynamicClassMarkerCreation() {
    }

    private static void commonGenerateClassLoadMarker(String str, String str2, String str3) {
        str2 = getClassNameWithoutNum(str, str2);
        str = getNextNumForClass(str2);
        if (str != -1) {
            generateClassLoadMarker(getClassName(str2, str3, str));
        }
    }

    private static void generateClassLoadMarker(String str) {
        Class generateProxy = generateProxy(str, DYANMIC_CLASS_INTERFACES, DynamicClassMarkerCreation.class.getClassLoader(), EMPTY_METHOD_ARRAY, EMPTY_EXCEPTIONS_ARRAY);
        if (generateProxy != null) {
            generateProxy.getName();
        }
    }

    public static void generateClassLoadMarkerEnd(String str) {
        generateClassLoadMarkerEnd(str, null);
    }

    public static void generateClassLoadMarkerEnd(String str, String str2) {
        if (IS_SUPPORTED) {
            int currentNumForClass = getCurrentNumForClass(getClassNameWithoutNum(str, START_MARKER));
            if (currentNumForClass != -1) {
                int currentNumForClass2 = getCurrentNumForClass(getClassNameWithoutNum(str, END_MARKER));
                if (currentNumForClass2 == -1 || currentNumForClass - 1 == currentNumForClass2) {
                    commonGenerateClassLoadMarker(str, END_MARKER, str2);
                }
            }
        }
    }

    public static void generateClassLoadMarkerStart(String str) {
        if (IS_SUPPORTED) {
            commonGenerateClassLoadMarker(str, START_MARKER, null);
        }
    }

    private static java.lang.Class generateProxy(java.lang.String r8, java.lang.Class[] r9, java.lang.ClassLoader r10, java.lang.Object[] r11, java.lang.Class[][] r12) {
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
        r4 = 0;
        r0 = Proxy_generateProxyNew;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r7 = 2;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r6 = 1;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r5 = 3;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r3 = 0;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        if (r0 == 0) goto L_0x0020;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
    L_0x0009:
        r2 = Proxy_generateProxyNew;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r0 = 5;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r1 = new java.lang.Object[r0];	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r1[r3] = r8;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r1[r6] = r9;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r1[r7] = r10;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r1[r5] = r11;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r0 = 4;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r1[r0] = r12;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r0 = r2.invoke(r4, r1);	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r0 = (java.lang.Class) r0;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        return r0;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
    L_0x0020:
        r0 = Proxy_generateProxyOld;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        if (r0 == 0) goto L_0x0035;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
    L_0x0024:
        r1 = Proxy_generateProxyOld;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r0 = new java.lang.Object[r5];	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r0[r3] = r8;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r0[r6] = r9;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r0[r7] = r10;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r0 = r1.invoke(r4, r0);	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        r0 = (java.lang.Class) r0;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
        return r0;	 Catch:{ IllegalAccessException -> 0x0035, IllegalAccessException -> 0x0035 }
    L_0x0035:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.classmarkers.DynamicClassMarkerCreation.generateProxy(java.lang.String, java.lang.Class[], java.lang.ClassLoader, java.lang.Object[], java.lang.Class[][]):java.lang.Class");
    }

    private static String getClassName(String str, String str2, int i) {
        StringBuilder stringBuilder = new StringBuilder(str);
        if (str2 != null) {
            stringBuilder.append('-');
            stringBuilder.append(str2);
            stringBuilder.append('-');
        }
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    private static String getClassNameWithoutNum(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    private static int getCurrentNumForClass(String str) {
        AtomicInteger atomicInteger = (AtomicInteger) CLASS_NAME_TO_NUM.get(str);
        return atomicInteger != null ? atomicInteger.get() : -1;
    }

    private static int getNextNumForClass(String str) {
        AtomicInteger atomicInteger = (AtomicInteger) CLASS_NAME_TO_NUM.get(str);
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            AtomicInteger atomicInteger2 = (AtomicInteger) CLASS_NAME_TO_NUM.putIfAbsent(str, atomicInteger);
            if (atomicInteger2 != null) {
                atomicInteger = atomicInteger2;
            }
        }
        if (5 < atomicInteger.get()) {
            return -1;
        }
        int incrementAndGet = atomicInteger.incrementAndGet();
        if (incrementAndGet <= 5) {
            return incrementAndGet;
        }
        return -1;
    }
}
