package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation;

import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceConfigCache {
    /* renamed from: B */
    public static com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig m16980B(java.lang.String r6) {
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
        r5 = new java.util.HashMap;	 Catch:{ Exception -> 0x0196 }
        r5.<init>();	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G955U";	 Catch:{ Exception -> 0x0196 }
        r1 = com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.DeviceConfigCache.class;	 Catch:{ Exception -> 0x0196 }
        r3 = "GalaxyS8Plus";	 Catch:{ Exception -> 0x0196 }
        r4 = 0;	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G955F";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G950U";	 Catch:{ Exception -> 0x0196 }
        r3 = "GalaxyS8";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G950F";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r3 = "SM-G935FD";	 Catch:{ Exception -> 0x0196 }
        r2 = com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.DeviceConfigCache.class;	 Catch:{ Exception -> 0x0196 }
        r1 = "GalaxyS7EdgeDual";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r2.getMethod(r1, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G935V";	 Catch:{ Exception -> 0x0196 }
        r1 = com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.DeviceConfigCache.class;	 Catch:{ Exception -> 0x0196 }
        r3 = "GalaxyS7Edge";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G935T";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G935P";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G935F";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SAMSUNG-SM-G935A";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G930V";	 Catch:{ Exception -> 0x0196 }
        r3 = "GalaxyS7";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G930T";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G930S";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G930P";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G930F";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SAMSUNG-SM-G930A";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SAMSUNG-SM-G891A";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G928F";	 Catch:{ Exception -> 0x0196 }
        r3 = "GalaxyS6";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G925I";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G925F";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G920W8";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G920V";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G920T";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G920P";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G920I";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SM-G920F";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SAMSUNG-SM-G920A";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "SAMSUNG-SM-G890A";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r2 = "Pixel";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r1.getMethod(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r2, r0);	 Catch:{ Exception -> 0x0196 }
        r3 = "Pixel 2";	 Catch:{ Exception -> 0x0196 }
        r2 = com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.DeviceConfigCache.class;	 Catch:{ Exception -> 0x0196 }
        r1 = "Pixel2";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r2.getMethod(r1, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r3 = "Pixel XL";	 Catch:{ Exception -> 0x0196 }
        r1 = "PixelXL";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r2.getMethod(r1, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r3 = "Pixel 2 XL";	 Catch:{ Exception -> 0x0196 }
        r1 = "Pixel2XL";	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r2.getMethod(r1, r0);	 Catch:{ Exception -> 0x0196 }
        r5.put(r3, r0);	 Catch:{ Exception -> 0x0196 }
        r0 = r5.containsKey(r6);	 Catch:{ Exception -> 0x0196 }
        if (r0 == 0) goto L_0x0196;	 Catch:{ Exception -> 0x0196 }
    L_0x0186:
        r2 = r5.get(r6);	 Catch:{ Exception -> 0x0196 }
        r2 = (java.lang.reflect.Method) r2;	 Catch:{ Exception -> 0x0196 }
        r1 = 0;	 Catch:{ Exception -> 0x0196 }
        r0 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0196 }
        r0 = r2.invoke(r1, r0);	 Catch:{ Exception -> 0x0196 }
        r0 = (com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig) r0;	 Catch:{ Exception -> 0x0196 }
        return r0;	 Catch:{ Exception -> 0x0196 }
    L_0x0196:
        r0 = com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig.getDefault();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.DeviceConfigCache.B(java.lang.String):com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig");
    }

    public static DeviceConfig GalaxyS6() {
        return new DeviceConfig(0.08111d, -0.1908811d, 0.752428d, 0.49844d, 0.49858d, -2.221441469079183d, 2.221441469079183d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 0.06d, Boolean.valueOf(false), Boolean.valueOf(true), JsonProperty.USE_DEFAULT_NAME, Boolean.valueOf(true));
    }

    public static DeviceConfig GalaxyS7() {
        return new DeviceConfig(0.12342d, -0.239387d, 0.782055d, 0.504487d, 0.501609d, 3.141592653589793d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 0.02d, Boolean.valueOf(false), Boolean.valueOf(true), JsonProperty.USE_DEFAULT_NAME, Boolean.valueOf(true));
    }

    public static DeviceConfig GalaxyS7Edge() {
        return new DeviceConfig(0.293084d, -0.590881d, 0.773158d, 0.482379d, 0.4953d, 3.141592653589793d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 0.02d, Boolean.valueOf(false), Boolean.valueOf(true), JsonProperty.USE_DEFAULT_NAME, Boolean.valueOf(true));
    }

    public static DeviceConfig GalaxyS7EdgeDual() {
        return new DeviceConfig(0.12342d, -0.239387d, 0.782055d, 0.504487d, 0.501609d, 3.141592653589793d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 0.02d, Boolean.valueOf(false), Boolean.valueOf(true), JsonProperty.USE_DEFAULT_NAME, Boolean.valueOf(true));
    }

    public static DeviceConfig GalaxyS8() {
        return new DeviceConfig(0.126143d, -0.224788d, 0.769416d, 0.482374d, 0.521142d, 3.141592653589793d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, Boolean.valueOf(false), Boolean.valueOf(true), JsonProperty.USE_DEFAULT_NAME, Boolean.valueOf(true));
    }

    public static DeviceConfig GalaxyS8Plus() {
        return new DeviceConfig(0.128441d, -0.28389d, 0.774141d, 0.484119d, 0.536015d, 3.141592653589793d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, Boolean.valueOf(false), Boolean.valueOf(true), JsonProperty.USE_DEFAULT_NAME, Boolean.valueOf(true));
    }

    public static DeviceConfig Pixel() {
        return new DeviceConfig(0.0882626d, -0.361526d, 0.750342d, 0.499122d, 0.4986d, 3.141592653589793d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, Boolean.valueOf(false), Boolean.valueOf(true), JsonProperty.USE_DEFAULT_NAME, Boolean.valueOf(true));
    }

    public static DeviceConfig Pixel2() {
        return new DeviceConfig(0.164483d, -0.36323d, 0.80041d, 0.502167d, 0.493978d, 3.141592653589793d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, Boolean.valueOf(false), Boolean.valueOf(true), JsonProperty.USE_DEFAULT_NAME, Boolean.valueOf(true));
    }

    public static DeviceConfig Pixel2XL() {
        return new DeviceConfig(0.164483d, -0.36323d, 0.80041d, 0.502167d, 0.493978d, 3.141592653589793d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, Boolean.valueOf(false), Boolean.valueOf(true), JsonProperty.USE_DEFAULT_NAME, Boolean.valueOf(true));
    }

    public static DeviceConfig PixelXL() {
        return new DeviceConfig(0.0422881d, -0.115992d, 0.76217d, 0.50245d, 0.497736d, 3.141592653589793d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, Boolean.valueOf(false), Boolean.valueOf(true), JsonProperty.USE_DEFAULT_NAME, Boolean.valueOf(true));
    }
}
