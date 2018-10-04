package X;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.facebook.sonar.android.AndroidSonarClient;
import com.facebook.sonar.core.SonarClient;
import com.facebook.sonar.plugins.analyticslogging.AnalyticsLoggingSonarPlugin;
import com.facebook.sonar.plugins.analyticslogging.OfflineStrategy.PersistOfflineEvents;
import com.facebook.sonar.plugins.inspector.DescriptorMapping;
import com.facebook.sonar.plugins.inspector.InspectorSonarPlugin;
import com.facebook.sonar.plugins.memorytools.InstagramMemoryToolsAppBridge;
import com.facebook.sonar.plugins.memorytools.MemoryToolsSonarPlugin;
import com.facebook.sonar.plugins.mqtt.MqttSonarPlugin;
import com.facebook.sonar.plugins.network.NetworkSonarPlugin;
import com.instagram.debug.memorydump.MemoryDumpCreator;
import com.instagram.debug.memorydump.OutOfMemoryExceptionHandler;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import java.util.Random;
import java.util.concurrent.FutureTask;

/* renamed from: X.0FN */
public final class AnonymousClass0FN {
    /* renamed from: B */
    public static void m1570B(Context context, boolean z, AnonymousClass0FI anonymousClass0FI) {
        Context context2;
        AnonymousClass0M2 anonymousClass0M2;
        long intValue = (long) ((Integer) AnonymousClass0CC.KO.m845G()).intValue();
        int intValue2 = ((Integer) AnonymousClass0CC.MO.m845G()).intValue();
        int intValue3 = ((Integer) AnonymousClass0CC.OO.m845G()).intValue();
        int intValue4 = ((Integer) AnonymousClass0CC.NO.m845G()).intValue();
        boolean booleanValue = ((Boolean) AnonymousClass0CC.LO.m845G()).booleanValue();
        int intValue5 = ((Integer) AnonymousClass0CC.JO.m845G()).intValue();
        synchronized (AnonymousClass0M2.class) {
            context2 = context;
            if (AnonymousClass0M2.f3331F == null) {
                AnonymousClass0M2.f3331F = new AnonymousClass0M2(context);
            }
            anonymousClass0M2 = AnonymousClass0M2.f3331F;
        }
        AnonymousClass0M3.f3338F = new AnonymousClass0M1(context2, intValue, intValue2, intValue3, intValue4, booleanValue, intValue5, anonymousClass0M2, ((Integer) AnonymousClass0CC.HF.m845G()).intValue(), AnonymousClass0CB.m834D(), AnonymousClass0CB.m834D(), AnonymousClass0CB.m834D(), z, anonymousClass0FI);
        AnonymousClass0M3.f3337E = null;
        AnonymousClass0M3.f3336D = ((Boolean) AnonymousClass0CC.uN.m845G()).booleanValue();
        AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass0Fw(), -2066914812);
    }

    /* renamed from: C */
    public static X.AnonymousClass0Gy m1571C(android.content.Context r4) {
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
        r3 = new X.0Gy;	 Catch:{ IOException -> 0x001b }
        r1 = "images";	 Catch:{ IOException -> 0x001b }
        r0 = 0;	 Catch:{ IOException -> 0x001b }
        r2 = X.AnonymousClass0Gq.m1903B(r4, r1, r0);	 Catch:{ IOException -> 0x001b }
        r1 = "image";	 Catch:{ IOException -> 0x001b }
        r0 = 50;	 Catch:{ IOException -> 0x001b }
        r3.<init>(r2, r1, r0);	 Catch:{ IOException -> 0x001b }
        r1 = X.AnonymousClass0Fj.f2192B;	 Catch:{ IOException -> 0x001b }
        r0 = new X.592;	 Catch:{ IOException -> 0x001b }
        r0.<init>(r3);	 Catch:{ IOException -> 0x001b }
        r1.m1666A(r0);	 Catch:{ IOException -> 0x001b }
        return r3;	 Catch:{ IOException -> 0x001b }
    L_0x001b:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0FN.C(android.content.Context):X.0Gy");
    }

    /* renamed from: D */
    public static void m1572D(AnonymousClass0Cm anonymousClass0Cm) {
        if (anonymousClass0Cm != null) {
            AnonymousClass0H6.m1945B().m1949A(((Boolean) AnonymousClass0CC.nX.m846H(anonymousClass0Cm)).booleanValue(), ((Integer) AnonymousClass0CC.oX.m846H(anonymousClass0Cm)).intValue());
        } else {
            AnonymousClass0H6.m1945B().m1949A(false, 1);
        }
    }

    /* renamed from: E */
    public static void m1573E(Context context, AnonymousClass0F9 anonymousClass0F9, AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0CN.m901B("initQe", 1427551500);
        try {
            AnonymousClass0F9.m1510D(anonymousClass0F9, "INIT_QE_START");
            AnonymousClass0M7.f3347C = new AnonymousClass0M6(context);
            if (anonymousClass0Cm != null) {
                AnonymousClass0M7.f3347C.mo864K(anonymousClass0Cm);
            } else {
                AnonymousClass0M7.f3347C.mo863J();
            }
            AnonymousClass0F9.m1510D(anonymousClass0F9, "INIT_QE_END");
        } finally {
            AnonymousClass0CN.m902C(-566972676);
        }
    }

    /* renamed from: F */
    public static void m1574F(Context context) {
        if (AnonymousClass0CB.m834D()) {
            SonarClient instance = AndroidSonarClient.getInstance(context);
            instance.addPlugin(new InspectorSonarPlugin(context, DescriptorMapping.withDefaults()));
            instance.addPlugin(new AnalyticsLoggingSonarPlugin(new PersistOfflineEvents(new AnonymousClass0MQ(100))));
            instance.addPlugin(new NetworkSonarPlugin());
            instance.addPlugin(new MqttSonarPlugin());
            instance.start();
        }
    }

    /* renamed from: G */
    public static FutureTask m1575G(Context context, AnonymousClass0F9 anonymousClass0F9, AnonymousClass0Cm anonymousClass0Cm) {
        if (AnonymousClass0CA.m828B(AnonymousClass0CC.CF)) {
            Object futureTask = new FutureTask(new AnonymousClass0M4(context, anonymousClass0F9, anonymousClass0Cm));
            if (AnonymousClass0CA.m828B(AnonymousClass0CC.DF)) {
                new AnonymousClass0M9(futureTask, "init_qe", Process.getThreadPriority(Process.myTid())).start();
            } else {
                AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), futureTask, -61996026);
            }
            return futureTask;
        }
        AnonymousClass0FN.m1573E(context, anonymousClass0F9, anonymousClass0Cm);
        return null;
    }

    /* renamed from: H */
    public static void m1576H(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0F9 anonymousClass0F9) {
        if (!MemoryDumpCreator.isEligibleForHeapDump()) {
            return;
        }
        if (AnonymousClass0EF.m1362M(context) || AnonymousClass0Gb.m1835C()) {
            Object obj;
            int intValue;
            Object obj2;
            MemoryDumpCreator instance;
            String[] strArr;
            HandlerThread handlerThread;
            AnonymousClass0Ge anonymousClass0Ge;
            AnonymousClass0Gg anonymousClass0Ha;
            SonarClient instance2;
            AnonymousClass0Gf anonymousClass0Gf;
            MemoryToolsSonarPlugin memoryToolsSonarPlugin;
            AnonymousClass0FB anonymousClass0FB;
            boolean booleanValue = ((Boolean) AnonymousClass0CC.YW.m846H(anonymousClass0Cm)).booleanValue();
            if (!((Boolean) AnonymousClass0CC.BQ.m846H(anonymousClass0Cm)).booleanValue()) {
                if (!AnonymousClass0Gb.m1835C()) {
                    obj = null;
                    if (AnonymousClass0CK.m880D()) {
                        intValue = ((Integer) AnonymousClass0CC.gB.m846H(anonymousClass0Cm)).intValue();
                        if (intValue > 0 && new Random().nextInt(intValue) == 0) {
                            obj2 = 1;
                            if (booleanValue || obj != null || obj2 != null) {
                                instance = MemoryDumpCreator.getInstance(context, anonymousClass0Cm.f1759C);
                                if (booleanValue) {
                                    OutOfMemoryExceptionHandler.init(instance);
                                }
                                if (obj != null) {
                                    strArr = new String[]{TransparentModalActivity.class.getName(), ModalActivity.class.getName()};
                                    synchronized (AnonymousClass0Gb.class) {
                                        handlerThread = new HandlerThread("LeakDetectorWorkerThread");
                                        handlerThread.start();
                                        anonymousClass0Ge = new AnonymousClass0Ge(handlerThread.getLooper(), ((Boolean) AnonymousClass0CC.SO.m845G()).booleanValue());
                                        synchronized (AnonymousClass0Gb.class) {
                                            if (AnonymousClass0Gb.f2388D != null) {
                                                if (AnonymousClass0Gb.m1835C()) {
                                                    anonymousClass0Ha = new AnonymousClass0Ha(instance);
                                                } else {
                                                    anonymousClass0Ha = new AnonymousClass0Gf(context, instance);
                                                }
                                                anonymousClass0Ge.f2394D = anonymousClass0Ha;
                                                AnonymousClass0Gb.f2388D = new AnonymousClass0Gb(anonymousClass0Ge, strArr);
                                                AnonymousClass0Gi.f2408B.m1848E(new AnonymousClass0Gh());
                                            } else {
                                                throw new RuntimeException("Initialized leak detector twice");
                                            }
                                        }
                                    }
                                    if (AnonymousClass0CB.m834D()) {
                                        instance2 = AndroidSonarClient.getInstance(context);
                                        if (instance2 != null && AnonymousClass0Gb.m1835C()) {
                                            anonymousClass0Gf = (AnonymousClass0Gf) AnonymousClass0Gb.m1834B();
                                            if (anonymousClass0Gf != null) {
                                                memoryToolsSonarPlugin = new MemoryToolsSonarPlugin(new InstagramMemoryToolsAppBridge(), new AnonymousClass1tH[]{anonymousClass0Gf});
                                                AnonymousClass0LH.m2927E(memoryToolsSonarPlugin);
                                                anonymousClass0Gf.f2400C.add(memoryToolsSonarPlugin);
                                                instance2.addPlugin(memoryToolsSonarPlugin);
                                            }
                                        }
                                    }
                                }
                                if (obj2 == null) {
                                    anonymousClass0FB = anonymousClass0F9.f2070C;
                                    if (anonymousClass0FB == null) {
                                        anonymousClass0FB.f2081F = instance;
                                    }
                                }
                            }
                            return;
                        }
                    }
                    obj2 = null;
                    if (!booleanValue) {
                    }
                    instance = MemoryDumpCreator.getInstance(context, anonymousClass0Cm.f1759C);
                    if (booleanValue) {
                        OutOfMemoryExceptionHandler.init(instance);
                    }
                    if (obj != null) {
                        strArr = new String[]{TransparentModalActivity.class.getName(), ModalActivity.class.getName()};
                        synchronized (AnonymousClass0Gb.class) {
                            handlerThread = new HandlerThread("LeakDetectorWorkerThread");
                            handlerThread.start();
                            anonymousClass0Ge = new AnonymousClass0Ge(handlerThread.getLooper(), ((Boolean) AnonymousClass0CC.SO.m845G()).booleanValue());
                            synchronized (AnonymousClass0Gb.class) {
                                if (AnonymousClass0Gb.f2388D != null) {
                                    throw new RuntimeException("Initialized leak detector twice");
                                }
                                if (AnonymousClass0Gb.m1835C()) {
                                    anonymousClass0Ha = new AnonymousClass0Ha(instance);
                                } else {
                                    anonymousClass0Ha = new AnonymousClass0Gf(context, instance);
                                }
                                anonymousClass0Ge.f2394D = anonymousClass0Ha;
                                AnonymousClass0Gb.f2388D = new AnonymousClass0Gb(anonymousClass0Ge, strArr);
                                AnonymousClass0Gi.f2408B.m1848E(new AnonymousClass0Gh());
                            }
                        }
                        if (AnonymousClass0CB.m834D()) {
                            instance2 = AndroidSonarClient.getInstance(context);
                            anonymousClass0Gf = (AnonymousClass0Gf) AnonymousClass0Gb.m1834B();
                            if (anonymousClass0Gf != null) {
                                memoryToolsSonarPlugin = new MemoryToolsSonarPlugin(new InstagramMemoryToolsAppBridge(), new AnonymousClass1tH[]{anonymousClass0Gf});
                                AnonymousClass0LH.m2927E(memoryToolsSonarPlugin);
                                anonymousClass0Gf.f2400C.add(memoryToolsSonarPlugin);
                                instance2.addPlugin(memoryToolsSonarPlugin);
                            }
                        }
                    }
                    if (obj2 == null) {
                        anonymousClass0FB = anonymousClass0F9.f2070C;
                        if (anonymousClass0FB == null) {
                            anonymousClass0FB.f2081F = instance;
                        }
                    }
                }
            }
            obj = 1;
            if (AnonymousClass0CK.m880D()) {
                intValue = ((Integer) AnonymousClass0CC.gB.m846H(anonymousClass0Cm)).intValue();
                obj2 = 1;
                if (booleanValue) {
                }
                instance = MemoryDumpCreator.getInstance(context, anonymousClass0Cm.f1759C);
                if (booleanValue) {
                    OutOfMemoryExceptionHandler.init(instance);
                }
                if (obj != null) {
                    strArr = new String[]{TransparentModalActivity.class.getName(), ModalActivity.class.getName()};
                    synchronized (AnonymousClass0Gb.class) {
                        handlerThread = new HandlerThread("LeakDetectorWorkerThread");
                        handlerThread.start();
                        anonymousClass0Ge = new AnonymousClass0Ge(handlerThread.getLooper(), ((Boolean) AnonymousClass0CC.SO.m845G()).booleanValue());
                        synchronized (AnonymousClass0Gb.class) {
                            if (AnonymousClass0Gb.f2388D != null) {
                                if (AnonymousClass0Gb.m1835C()) {
                                    anonymousClass0Ha = new AnonymousClass0Gf(context, instance);
                                } else {
                                    anonymousClass0Ha = new AnonymousClass0Ha(instance);
                                }
                                anonymousClass0Ge.f2394D = anonymousClass0Ha;
                                AnonymousClass0Gb.f2388D = new AnonymousClass0Gb(anonymousClass0Ge, strArr);
                                AnonymousClass0Gi.f2408B.m1848E(new AnonymousClass0Gh());
                            } else {
                                throw new RuntimeException("Initialized leak detector twice");
                            }
                        }
                    }
                    if (AnonymousClass0CB.m834D()) {
                        instance2 = AndroidSonarClient.getInstance(context);
                        anonymousClass0Gf = (AnonymousClass0Gf) AnonymousClass0Gb.m1834B();
                        if (anonymousClass0Gf != null) {
                            memoryToolsSonarPlugin = new MemoryToolsSonarPlugin(new InstagramMemoryToolsAppBridge(), new AnonymousClass1tH[]{anonymousClass0Gf});
                            AnonymousClass0LH.m2927E(memoryToolsSonarPlugin);
                            anonymousClass0Gf.f2400C.add(memoryToolsSonarPlugin);
                            instance2.addPlugin(memoryToolsSonarPlugin);
                        }
                    }
                }
                if (obj2 == null) {
                    anonymousClass0FB = anonymousClass0F9.f2070C;
                    if (anonymousClass0FB == null) {
                        anonymousClass0FB.f2081F = instance;
                    }
                }
            }
            obj2 = null;
            if (booleanValue) {
            }
            instance = MemoryDumpCreator.getInstance(context, anonymousClass0Cm.f1759C);
            if (booleanValue) {
                OutOfMemoryExceptionHandler.init(instance);
            }
            if (obj != null) {
                strArr = new String[]{TransparentModalActivity.class.getName(), ModalActivity.class.getName()};
                synchronized (AnonymousClass0Gb.class) {
                    handlerThread = new HandlerThread("LeakDetectorWorkerThread");
                    handlerThread.start();
                    anonymousClass0Ge = new AnonymousClass0Ge(handlerThread.getLooper(), ((Boolean) AnonymousClass0CC.SO.m845G()).booleanValue());
                    synchronized (AnonymousClass0Gb.class) {
                        if (AnonymousClass0Gb.f2388D != null) {
                            throw new RuntimeException("Initialized leak detector twice");
                        }
                        if (AnonymousClass0Gb.m1835C()) {
                            anonymousClass0Ha = new AnonymousClass0Ha(instance);
                        } else {
                            anonymousClass0Ha = new AnonymousClass0Gf(context, instance);
                        }
                        anonymousClass0Ge.f2394D = anonymousClass0Ha;
                        AnonymousClass0Gb.f2388D = new AnonymousClass0Gb(anonymousClass0Ge, strArr);
                        AnonymousClass0Gi.f2408B.m1848E(new AnonymousClass0Gh());
                    }
                }
                if (AnonymousClass0CB.m834D()) {
                    instance2 = AndroidSonarClient.getInstance(context);
                    anonymousClass0Gf = (AnonymousClass0Gf) AnonymousClass0Gb.m1834B();
                    if (anonymousClass0Gf != null) {
                        memoryToolsSonarPlugin = new MemoryToolsSonarPlugin(new InstagramMemoryToolsAppBridge(), new AnonymousClass1tH[]{anonymousClass0Gf});
                        AnonymousClass0LH.m2927E(memoryToolsSonarPlugin);
                        anonymousClass0Gf.f2400C.add(memoryToolsSonarPlugin);
                        instance2.addPlugin(memoryToolsSonarPlugin);
                    }
                }
            }
            if (obj2 == null) {
                anonymousClass0FB = anonymousClass0F9.f2070C;
                if (anonymousClass0FB == null) {
                    anonymousClass0FB.f2081F = instance;
                }
            }
        }
    }

    /* renamed from: I */
    public static void m1577I(Context context, AnonymousClass0Cn anonymousClass0Cn) {
        String str;
        if (anonymousClass0Cn.xX()) {
            str = AnonymousClass0FL.m1559B(anonymousClass0Cn).f1759C;
        } else {
            str = "0";
        }
        String str2 = "ig_uid";
        AnonymousClass0DE.m1118K(str2, str);
        AnonymousClass0DM.m1211E(context, str2, str);
        if (anonymousClass0Cn.xX()) {
            AnonymousClass0MC anonymousClass0MC;
            AnonymousClass0Cm B = AnonymousClass0FL.m1559B(anonymousClass0Cn);
            B.m1039D(AnonymousClass0MA.class, new AnonymousClass0MA());
            AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass0Fv(), 1476750040);
            AnonymousClass0MB M = AnonymousClass0Jd.f2931B.mo639M(B);
            if (M.f3351B != null) {
                anonymousClass0MC = M.f3351B;
                if (anonymousClass0MC != null) {
                    anonymousClass0MC.m3096B();
                    M.f3351B = null;
                }
            }
            anonymousClass0MC = new AnonymousClass0MD(context).m3100A().XB("PendingMediaStore.INTENT_ACTION_PENDING_MEDIA_CHANGED", new AnonymousClass0MG(M)).FD();
            M.f3351B = anonymousClass0MC;
            anonymousClass0MC.m3095A();
            AnonymousClass0MB.m3080E(M, M.f3361L.m1037B());
            Object anonymousClass0MK = new AnonymousClass0MK();
            AnonymousClass0Fj.f2192B.m1666A(anonymousClass0MK);
            B.m1039D(AnonymousClass0MK.class, anonymousClass0MK);
            anonymousClass0MK = new AnonymousClass0ML();
            AnonymousClass0Fj.f2192B.m1666A(anonymousClass0MK);
            B.m1039D(AnonymousClass0ML.class, anonymousClass0MK);
            if (AnonymousClass0MM.m3153I(context)) {
                AnonymousClass0MN.f3406B = Boolean.valueOf(((Boolean) AnonymousClass0CC.Cj.m845G()).booleanValue());
            }
            AnonymousClass0MO.m3165C(B);
            Looper.myQueue().addIdleHandler(new AnonymousClass0GV(context, B));
            AnonymousClass0Iz.f2854L.f2862I = ((Boolean) AnonymousClass0CC.IV.m846H(B)).booleanValue();
            AnonymousClass0FN.m1572D(B);
            MemoryDumpCreator.maybeUpdateUserId(B.f1759C);
        }
    }
}
