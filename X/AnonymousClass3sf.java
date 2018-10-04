package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Debug;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsServiceObjectsWrapper;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.audioclassic.interfaces.AudioService;
import com.facebook.cameracore.mediapipeline.services.captureevent.implementation.CaptureEventInputWrapper;
import com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces.TargetRecognitionServiceDataSource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.3sf */
public final class AnonymousClass3sf implements AnonymousClass1xr, AnonymousClass1y6, AnonymousClass2S8 {
    /* renamed from: q */
    public static final String f45867q = "FbMsqrdRenderer";
    /* renamed from: B */
    public final AnonymousClass2m5 f45868B;
    /* renamed from: C */
    public final AnonymousClass2mC f45869C;
    /* renamed from: D */
    public final Executor f45870D;
    /* renamed from: E */
    public AnonymousClass2Q5 f45871E;
    /* renamed from: F */
    public AnonymousClass3rz f45872F;
    /* renamed from: G */
    public volatile AnonymousClass2mF f45873G;
    /* renamed from: H */
    public volatile AnonymousClass2mF f45874H;
    /* renamed from: I */
    public final Object f45875I;
    /* renamed from: J */
    public AnonymousClass1xq f45876J;
    /* renamed from: K */
    public AnonymousClass2he f45877K;
    /* renamed from: L */
    public final AnonymousClass2mI f45878L;
    /* renamed from: M */
    public final AnonymousClass2mD f45879M;
    /* renamed from: N */
    public boolean f45880N;
    /* renamed from: O */
    public final AnonymousClass2mM f45881O;
    /* renamed from: P */
    public final AnonymousClass2mG f45882P;
    /* renamed from: Q */
    public boolean f45883Q;
    /* renamed from: R */
    public boolean f45884R;
    /* renamed from: S */
    public boolean f45885S;
    /* renamed from: T */
    public boolean f45886T;
    /* renamed from: U */
    public String f45887U;
    /* renamed from: V */
    public String f45888V;
    /* renamed from: W */
    public volatile boolean f45889W;
    /* renamed from: X */
    public boolean f45890X;
    /* renamed from: Y */
    public String f45891Y;
    /* renamed from: Z */
    public volatile boolean f45892Z;
    /* renamed from: a */
    public final AnonymousClass3xr f45893a;
    /* renamed from: b */
    public final boolean[] f45894b;
    /* renamed from: c */
    private boolean f45895c;
    /* renamed from: d */
    private volatile AnonymousClass0eF f45896d;
    /* renamed from: e */
    private boolean f45897e;
    /* renamed from: f */
    private volatile EffectsFrameworkException f45898f;
    /* renamed from: g */
    private final AnonymousClass3xq f45899g;
    /* renamed from: h */
    private final AnonymousClass2mN f45900h;
    /* renamed from: i */
    private AnonymousClass2SE f45901i;
    /* renamed from: j */
    private AnonymousClass2SG f45902j;
    /* renamed from: k */
    private AnonymousClass2SI f45903k;
    /* renamed from: l */
    private AnonymousClass1Ue f45904l;
    /* renamed from: m */
    private volatile AnonymousClass2hy f45905m;
    /* renamed from: n */
    private boolean f45906n;
    /* renamed from: o */
    private int f45907o;
    /* renamed from: p */
    private int f45908p;

    public AnonymousClass3sf(Executor executor, Context context, AnonymousClass2mI anonymousClass2mI, AnonymousClass3xq anonymousClass3xq, AnonymousClass3xr anonymousClass3xr, AnonymousClass1re anonymousClass1re, AnonymousClass2m9 anonymousClass2m9) {
        this(executor, context, anonymousClass2mI, anonymousClass3xq, anonymousClass3xr, anonymousClass1re, anonymousClass2m9, new AnonymousClass2m3(false, false, false));
    }

    public AnonymousClass3sf(Executor executor, Context context, AnonymousClass2mI anonymousClass2mI, AnonymousClass3xq anonymousClass3xq, AnonymousClass3xr anonymousClass3xr, AnonymousClass1re anonymousClass1re, AnonymousClass2m9 anonymousClass2m9, AnonymousClass2m3 anonymousClass2m3) {
        this.f45900h = new AnonymousClass2mN();
        this.f45876J = AnonymousClass1xq.PREVIEW;
        this.f45895c = false;
        this.f45892Z = false;
        this.f45873G = null;
        this.f45896d = null;
        this.f45905m = null;
        this.f45887U = null;
        this.f45888V = null;
        this.f45897e = false;
        this.f45885S = false;
        this.f45875I = new Object();
        this.f45908p = -1;
        this.f45907o = -1;
        this.f45906n = false;
        this.f45886T = false;
        this.f45884R = false;
        this.f45889W = false;
        this.f45874H = null;
        this.f45890X = true;
        this.f45881O = new AnonymousClass2mM(new AnonymousClass3sd(this));
        this.f45899g = anonymousClass3xq;
        this.f45893a = anonymousClass3xr;
        this.f45870D = executor;
        this.f45878L = anonymousClass2mI;
        this.f45882P = new AnonymousClass2mG(this.f45878L);
        this.f45869C = new AnonymousClass2mC(context, new AnonymousClass3sg(this.f45899g));
        this.f45879M = new AnonymousClass2mD(this.f45878L, this.f45893a);
        this.f45868B = new AnonymousClass2m5(anonymousClass2m3, new AnonymousClass3se(this));
        this.f45894b = new boolean[AnonymousClass1xq.values().length];
    }

    /* renamed from: A */
    public final void m21133A(AnonymousClass2SG anonymousClass2SG) {
        this.f45900h.m17166B(anonymousClass2SG);
        this.f45902j = anonymousClass2SG;
        AnonymousClass3sf.m21121C(this);
        m21128J();
    }

    /* renamed from: B */
    public static AnonymousClass2hy m21120B(AnonymousClass3sf anonymousClass3sf, AnonymousClass2mF anonymousClass2mF) {
        boolean useAmlFaceTracker;
        boolean useHalide;
        boolean useSynchronousFaceTracker;
        boolean useLazyFaceTracker;
        File D;
        String absolutePath;
        String str;
        String str2;
        String str3;
        Exception e;
        String absolutePath2;
        AnonymousClass2k3 anonymousClass2k3;
        AnonymousClass2hx anonymousClass2hx;
        TargetRecognitionServiceDataSource targetRecognitionServiceDataSource;
        AnonymousClass3sf anonymousClass3sf2 = anonymousClass3sf;
        FaceTrackerDataProviderConfig faceTrackerDataProviderConfig = anonymousClass3sf2.f45878L.m17162A().getEffectServiceHostConfig().getFaceTrackerDataProviderConfig();
        if (faceTrackerDataProviderConfig != null) {
            useAmlFaceTracker = faceTrackerDataProviderConfig.getUseAmlFaceTracker();
            useHalide = faceTrackerDataProviderConfig.getUseHalide();
            useSynchronousFaceTracker = faceTrackerDataProviderConfig.getUseSynchronousFaceTracker();
            useLazyFaceTracker = faceTrackerDataProviderConfig.getUseLazyFaceTracker();
        } else {
            useAmlFaceTracker = false;
            useHalide = false;
            useSynchronousFaceTracker = false;
            useLazyFaceTracker = false;
        }
        AnonymousClass2mC anonymousClass2mC = anonymousClass3sf2.f45869C;
        AnonymousClass2mF anonymousClass2mF2 = anonymousClass2mF;
        anonymousClass2mC.f33788D = AnonymousClass2hy.m16968B(anonymousClass2mF2.f33853Z);
        AnonymousClass1s2 anonymousClass1s2 = useSynchronousFaceTracker ? AnonymousClass1s2.STILL_IMAGE : AnonymousClass1s2.DEFAULT;
        String absolutePath3;
        String[] strArr;
        if (anonymousClass2mF2.f33844Q) {
            String absolutePath4;
            try {
                if (anonymousClass2mF2.f33831D != null) {
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33831D, "fb_body_tracking_init_net.pb");
                    absolutePath = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33832E, "fb_body_predict_init_net.pb");
                    absolutePath3 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    anonymousClass2mC.f33788D.f32677C = new AnonymousClass1rz(absolutePath, absolutePath3);
                }
            } catch (Throwable e2) {
                str = anonymousClass2mF2.f33831D;
                str2 = anonymousClass2mF2.f33832E;
                AnonymousClass0Gn.J("FbMsqrdRendererModelLoaderCallback", AnonymousClass3sg.m21138C("onBodyTrackerLoadModelFailed", new long[]{AnonymousClass3sg.m21137B(str), AnonymousClass3sg.m21137B(str2)}), e2);
            }
            try {
                if (anonymousClass2mF2.f33836I != null) {
                    Map hashMap = new HashMap();
                    int i = 0;
                    for (String str22 : anonymousClass2mF2.f33836I.keySet()) {
                        i++;
                        str3 = (String) anonymousClass2mF2.f33836I.get(str22);
                        Context context = anonymousClass2mC.f33787C;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("msqrd-");
                        stringBuilder.append(i);
                        stringBuilder.append(".bin");
                        D = AnonymousClass1vo.m13803D(context, str3, stringBuilder.toString());
                        hashMap.put(str22, D.getAbsolutePath());
                        anonymousClass2mC.f33789E.add(D);
                    }
                    strArr = (String[]) hashMap.keySet().toArray(new String[0]);
                    try {
                        anonymousClass2mC.f33788D.f32684J = new AnonymousClass1s4(useAmlFaceTracker ? AnonymousClass1s3.AML : AnonymousClass1s3.MSQRD, anonymousClass1s2, useHalide, useLazyFaceTracker, strArr, AnonymousClass2mC.m17154B(hashMap, strArr), new AnonymousClass2mB(anonymousClass2mC, anonymousClass2mF2));
                    } catch (IOException e3) {
                        e = e3;
                    }
                }
            } catch (IOException e4) {
                e = e4;
                anonymousClass2mC.f33786B.m21139A(e, anonymousClass2mF2.f33836I);
                if (anonymousClass2mF2.f33848U != null) {
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33848U, "fb_object_tracking_init_net.pb");
                    str22 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33849V, "fb_object_predict_init_net.pb");
                    absolutePath = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33847T, "fb_object_concepts.classes");
                    absolutePath3 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    anonymousClass2mC.f33788D.f32696V = new AnonymousClass1sA(str22, absolutePath, absolutePath3);
                }
                absolutePath3 = null;
                if (anonymousClass2mF2.f33855b != null) {
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33855b, "target_recognition_init");
                    absolutePath2 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33856c, "target_recognition_pred");
                    str22 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    if (anonymousClass2mF2.f33853Z == null) {
                        anonymousClass2k3 = null;
                    } else {
                        anonymousClass2k3 = anonymousClass2mF2.f33853Z.f32733b;
                    }
                    anonymousClass2hx = anonymousClass2mC.f33788D;
                    if (anonymousClass2k3 == null) {
                        targetRecognitionServiceDataSource = null;
                    } else {
                        targetRecognitionServiceDataSource = anonymousClass2k3.f33149B;
                    }
                    anonymousClass2hx.f32702b = new AnonymousClass2k3(absolutePath2, str22, targetRecognitionServiceDataSource);
                }
                if (anonymousClass2mF2.f33850W != null) {
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33850W, "fb_seg_init_net.pb");
                    str22 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33852Y, "fb_seg_predict_net.pb");
                    absolutePath = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    anonymousClass2mC.f33788D.f32700Z = new AnonymousClass1sE(str22, absolutePath, false);
                }
                if (anonymousClass2mF2.f33859f != null) {
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33859f, "fb_xray_init_net.pb");
                    str22 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33860g, "fb_xray_predict_init_net.pb");
                    absolutePath4 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33857d, "fb_xray_concepts.classes");
                    absolutePath = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    if (anonymousClass2mF2.f33858e != null) {
                        D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33858e, "fb_xray_config.conf");
                        absolutePath3 = D.getAbsolutePath();
                        anonymousClass2mC.f33789E.add(D);
                    }
                    anonymousClass2mC.f33788D.f32706f = new AnonymousClass1sK(str22, absolutePath4, absolutePath, absolutePath3);
                }
                return new AnonymousClass2hy(anonymousClass3sf2.f45869C.f33788D);
            }
            try {
                if (anonymousClass2mF2.f33848U != null) {
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33848U, "fb_object_tracking_init_net.pb");
                    str22 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33849V, "fb_object_predict_init_net.pb");
                    absolutePath = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33847T, "fb_object_concepts.classes");
                    absolutePath3 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    anonymousClass2mC.f33788D.f32696V = new AnonymousClass1sA(str22, absolutePath, absolutePath3);
                }
            } catch (Throwable e5) {
                str = anonymousClass2mF2.f33848U;
                absolutePath2 = anonymousClass2mF2.f33849V;
                AnonymousClass0Gn.J("FbMsqrdRendererModelLoaderCallback", AnonymousClass3sg.m21138C("onObjectTrackerLoadModelFailed", new long[]{AnonymousClass3sg.m21137B(str), AnonymousClass3sg.m21137B(absolutePath2)}), e5);
            }
            absolutePath3 = null;
            try {
                if (anonymousClass2mF2.f33855b != null) {
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33855b, "target_recognition_init");
                    absolutePath2 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33856c, "target_recognition_pred");
                    str22 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    if (anonymousClass2mF2.f33853Z == null) {
                        anonymousClass2k3 = anonymousClass2mF2.f33853Z.f32733b;
                    } else {
                        anonymousClass2k3 = null;
                    }
                    anonymousClass2hx = anonymousClass2mC.f33788D;
                    if (anonymousClass2k3 == null) {
                        targetRecognitionServiceDataSource = anonymousClass2k3.f33149B;
                    } else {
                        targetRecognitionServiceDataSource = null;
                    }
                    anonymousClass2hx.f32702b = new AnonymousClass2k3(absolutePath2, str22, targetRecognitionServiceDataSource);
                }
            } catch (Throwable e22) {
                str22 = anonymousClass2mF2.f33855b;
                str3 = anonymousClass2mF2.f33856c;
                AnonymousClass0Gn.J("FbMsqrdRendererModelLoaderCallback", AnonymousClass3sg.m21138C("onTargetRecognitionLoadModelFailed", new long[]{AnonymousClass3sg.m21137B(str22), AnonymousClass3sg.m21137B(str3)}), e22);
            }
            try {
                if (anonymousClass2mF2.f33850W != null) {
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33850W, "fb_seg_init_net.pb");
                    str22 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33852Y, "fb_seg_predict_net.pb");
                    absolutePath = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    anonymousClass2mC.f33788D.f32700Z = new AnonymousClass1sE(str22, absolutePath, false);
                }
            } catch (Throwable e52) {
                absolutePath = anonymousClass2mF2.f33850W;
                absolutePath2 = anonymousClass2mF2.f33852Y;
                AnonymousClass0Gn.J("FbMsqrdRendererModelLoaderCallback", AnonymousClass3sg.m21138C("onSegmentationLoadModelFailed", new long[]{AnonymousClass3sg.m21137B(absolutePath), AnonymousClass3sg.m21137B(absolutePath2)}), e52);
            }
            try {
                if (anonymousClass2mF2.f33859f != null) {
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33859f, "fb_xray_init_net.pb");
                    str22 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33860g, "fb_xray_predict_init_net.pb");
                    absolutePath4 = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33857d, "fb_xray_concepts.classes");
                    absolutePath = D.getAbsolutePath();
                    anonymousClass2mC.f33789E.add(D);
                    if (anonymousClass2mF2.f33858e != null) {
                        D = AnonymousClass1vo.m13803D(anonymousClass2mC.f33787C, anonymousClass2mF2.f33858e, "fb_xray_config.conf");
                        absolutePath3 = D.getAbsolutePath();
                        anonymousClass2mC.f33789E.add(D);
                    }
                    anonymousClass2mC.f33788D.f32706f = new AnonymousClass1sK(str22, absolutePath4, absolutePath, absolutePath3);
                }
            } catch (Throwable e222) {
                str = anonymousClass2mF2.f33859f;
                String str4 = anonymousClass2mF2.f33860g;
                AnonymousClass0Gn.J("FbMsqrdRendererModelLoaderCallback", AnonymousClass3sg.m21138C("onXRayLoadModelFailed", new long[]{AnonymousClass3sg.m21137B(str), AnonymousClass3sg.m21137B(str4)}), e222);
            }
        } else {
            if (anonymousClass2mF2.f33831D != null) {
                anonymousClass2mC.f33788D.f32677C = new AnonymousClass1rz(anonymousClass2mF2.f33831D, anonymousClass2mF2.f33832E);
            }
            if (anonymousClass2mF2.f33836I != null) {
                strArr = (String[]) anonymousClass2mF2.f33836I.keySet().toArray(new String[0]);
                anonymousClass2mC.f33788D.f32684J = new AnonymousClass1s4(useAmlFaceTracker ? AnonymousClass1s3.AML : AnonymousClass1s3.MSQRD, anonymousClass1s2, useHalide, useLazyFaceTracker, strArr, AnonymousClass2mC.m17154B(anonymousClass2mF2.f33836I, strArr), new AnonymousClass2mA(anonymousClass2mC, anonymousClass2mF2));
            }
            if (anonymousClass2mF2.f33848U != null) {
                anonymousClass2mC.f33788D.f32696V = new AnonymousClass1sA(anonymousClass2mF2.f33848U, anonymousClass2mF2.f33849V, anonymousClass2mF2.f33847T);
            }
            if (anonymousClass2mF2.f33855b != null) {
                AnonymousClass2k3 anonymousClass2k32;
                targetRecognitionServiceDataSource = null;
                if (anonymousClass2mF2.f33853Z != null) {
                    anonymousClass2k32 = anonymousClass2mF2.f33853Z.f32733b;
                } else {
                    anonymousClass2k32 = null;
                }
                AnonymousClass2hx anonymousClass2hx2 = anonymousClass2mC.f33788D;
                absolutePath3 = anonymousClass2mF2.f33855b;
                str = anonymousClass2mF2.f33856c;
                if (anonymousClass2k32 != null) {
                    targetRecognitionServiceDataSource = anonymousClass2k32.f33149B;
                }
                anonymousClass2hx2.f32702b = new AnonymousClass2k3(absolutePath3, str, targetRecognitionServiceDataSource);
            }
            if (anonymousClass2mF2.f33850W != null) {
                anonymousClass2mC.f33788D.f32700Z = new AnonymousClass1sE(anonymousClass2mF2.f33850W, anonymousClass2mF2.f33852Y, anonymousClass2mF2.f33851X);
            }
            if (anonymousClass2mF2.f33859f != null) {
                anonymousClass2mC.f33788D.f32706f = new AnonymousClass1sK(anonymousClass2mF2.f33859f, anonymousClass2mF2.f33860g, anonymousClass2mF2.f33857d, anonymousClass2mF2.f33858e);
            }
            if (anonymousClass2mF2.f33838K != null) {
                anonymousClass2mC.f33788D.f32685K = new AnonymousClass1s5(anonymousClass2mF2.f33838K, anonymousClass2mF2.f33839L);
            }
        }
        return new AnonymousClass2hy(anonymousClass3sf2.f45869C.f33788D);
    }

    /* renamed from: B */
    public final boolean m21134B() {
        return this.f45878L.m17163B() ? this.f45878L.m17162A().isPreviewCaptureOutputSupported() : false;
    }

    /* renamed from: C */
    public final void m21135C(AnonymousClass2mF anonymousClass2mF, AnonymousClass0eF anonymousClass0eF) {
        this.f45873G = anonymousClass2mF;
        this.f45896d = anonymousClass0eF;
        this.f45884R = true;
        if (anonymousClass2mF == null || TextUtils.isEmpty(anonymousClass2mF.f33834G)) {
            m21122D();
            return;
        }
        String str;
        AnonymousClass3sf.m21124F(this, m21131M());
        this.f45895c = true;
        if (anonymousClass2mF.f33843P) {
            str = "0";
        } else {
            str = anonymousClass2mF.f33845R;
        }
        this.f45887U = str;
        if (anonymousClass2mF.f33843P) {
            str = "0";
        } else {
            str = anonymousClass2mF.f33846S;
        }
        this.f45888V = str;
        m21129K(this.f45877K);
        if (this.f45892Z) {
            m21128J();
            if (anonymousClass2mF.f33840M) {
                this.f45882P.m17159B(anonymousClass2mF.f33842O, anonymousClass2mF.f33841N, anonymousClass2mF.f33833F, anonymousClass2mF.f33837J);
            }
            EffectServiceHost A = this.f45878L.m17162A();
            A.setProductSessionId(anonymousClass2mF.f33830C);
            long D;
            try {
                this.f45905m = AnonymousClass3sf.m21120B(this, anonymousClass2mF);
                AnalyticsLogger analyticsLogger = this.f45878L.m17162A().getAnalyticsLogger();
                this.f45891Y = this.f45878L.m17162A().getProductSessionId();
                if (analyticsLogger != null) {
                    if (this.f45891Y != null) {
                        analyticsLogger.setInfo(anonymousClass2mF.f33829B, anonymousClass2mF.f33845R, anonymousClass2mF.f33846S, anonymousClass2mF.f33843P, this.f45891Y, anonymousClass2mF.f33835H);
                    } else {
                        analyticsLogger.setInfo(anonymousClass2mF.f33829B, anonymousClass2mF.f33845R, anonymousClass2mF.f33846S, anonymousClass2mF.f33843P, anonymousClass2mF.f33835H);
                    }
                }
                if (anonymousClass2mF.f33835H == AnonymousClass1ss.UserInteraction) {
                    anonymousClass2mF.f33835H = AnonymousClass1ss.System;
                }
                AnonymousClass2hy anonymousClass2hy = this.f45905m;
                D = AnonymousClass3sf.m21122D();
                this.f45883Q = true;
                List createServiceConfigurations = this.f45878L.m17162A().createServiceConfigurations(anonymousClass2hy);
                AnonymousClass2mI anonymousClass2mI = this.f45878L;
                AnonymousClass2mI.m17161B(anonymousClass2mI).setEffect(anonymousClass2mF.f33845R, anonymousClass2mF.f33846S, this.f45891Y, anonymousClass2mF.f33834G, createServiceConfigurations);
                AnonymousClass2mI.m17161B(anonymousClass2mI).updatePerEffectDebugConfiguration(anonymousClass2mI.f33873F.f19049L, anonymousClass2mI.f33873F.f19050M, anonymousClass2mI.f33873F.f19052O, anonymousClass2mI.f33873F.f19048K, anonymousClass2mI.f33873F.f19051N);
                this.f45879M.f33794F = true;
                Long.valueOf(AnonymousClass3sf.m21122D() - D);
                AnonymousClass2hy anonymousClass2hy2 = this.f45905m;
                if (!(anonymousClass2hy2 == null || anonymousClass2hy2.f32711F == null)) {
                    this.f45872F = anonymousClass2hy2.f32711F.f33028B;
                    AnonymousClass3sf.m21121C(this);
                }
                if (!(anonymousClass2hy2 == null || anonymousClass2hy2.f32714I == null)) {
                    this.f45868B.m17149G(anonymousClass2hy2.f32714I.f23557B);
                }
                this.f45897e = true;
                AnonymousClass2mM anonymousClass2mM = this.f45881O;
                anonymousClass2mM.f33902C = AnonymousClass1y3.NONE;
                anonymousClass2mM.f33903D = true;
                if (A != null) {
                    AnonymousClass2ht frameFormatForPostProcessing = A.getFrameFormatForPostProcessing();
                    if (frameFormatForPostProcessing == AnonymousClass2ht.YUV) {
                        anonymousClass2mM.f33902C = AnonymousClass1y3.BGRA;
                    } else if (frameFormatForPostProcessing == AnonymousClass2ht.Y) {
                        anonymousClass2mM.f33902C = AnonymousClass1y3.LUM;
                    }
                }
                AudioService audioClassicService = A.getAudioClassicService();
                if (audioClassicService != null) {
                    audioClassicService.setCurrentAssetDirectory(anonymousClass2mF.f33834G);
                }
                if (this.f45896d != null) {
                    this.f45896d.Rk(A);
                }
            } catch (Throwable e) {
                m21122D();
                String str2 = f45867q;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("setEffectToEngine failed, file exist:");
                stringBuilder.append(new File(anonymousClass2mF.f33834G).exists());
                AnonymousClass0Gn.J(str2, stringBuilder.toString(), e);
            } catch (Throwable th) {
                Long.valueOf(AnonymousClass3sf.m21122D() - D);
            }
            this.f45879M.f33794F = true;
        }
        if (this.f45886T) {
            AnonymousClass2mM anonymousClass2mM2 = this.f45881O;
            AnonymousClass1y2 anonymousClass1y2 = (AnonymousClass1y2) anonymousClass2mM2.f33904E.get(anonymousClass2mM2.f33902C);
            if (anonymousClass1y2 != null) {
                anonymousClass1y2.GMA();
            }
        }
    }

    /* renamed from: C */
    public static void m21121C(AnonymousClass3sf anonymousClass3sf) {
        AnonymousClass3rz anonymousClass3rz = anonymousClass3sf.f45872F;
        if (anonymousClass3rz != null) {
            int i;
            CaptureEventInputWrapper captureEventInputWrapper;
            int i2;
            AnonymousClass2SE anonymousClass2SE = anonymousClass3sf.f45901i;
            if (anonymousClass2SE != null) {
                AnonymousClass1yA anonymousClass1yA = anonymousClass2SE.f30539B;
                if (anonymousClass3rz.f45580B != null) {
                    if (anonymousClass1yA == AnonymousClass1yA.FRONT) {
                        anonymousClass3rz.f45580B.setCaptureDevicePosition(1);
                    } else {
                        anonymousClass3rz.f45580B.setCaptureDevicePosition(2);
                    }
                }
                anonymousClass3sf.f45901i = null;
            }
            AnonymousClass1Ue anonymousClass1Ue = anonymousClass3sf.f45904l;
            if (anonymousClass1Ue != null) {
                AnonymousClass3rz anonymousClass3rz2 = anonymousClass3sf.f45872F;
                int i3 = anonymousClass1Ue.f19136D;
                i = anonymousClass3sf.f45904l.f19135C;
                float f = anonymousClass3sf.f45904l.f19134B;
                captureEventInputWrapper = anonymousClass3rz2.f45580B;
                if (captureEventInputWrapper != null) {
                    captureEventInputWrapper.setPreviewViewInfo(i3, i, f);
                }
                anonymousClass3sf.f45904l = null;
            }
            AnonymousClass2SG anonymousClass2SG = anonymousClass3sf.f45902j;
            if (anonymousClass2SG != null) {
                AnonymousClass3rz anonymousClass3rz3 = anonymousClass3sf.f45872F;
                i = anonymousClass2SG.f30542C;
                i2 = anonymousClass3sf.f45902j.f30541B;
                captureEventInputWrapper = anonymousClass3rz3.f45580B;
                if (captureEventInputWrapper != null) {
                    captureEventInputWrapper.setCaptureDeviceSize(i, i2);
                }
                anonymousClass3sf.f45902j = null;
            }
            AnonymousClass2SI anonymousClass2SI = anonymousClass3sf.f45903k;
            if (anonymousClass2SI != null) {
                AnonymousClass3rz anonymousClass3rz4 = anonymousClass3sf.f45872F;
                i2 = anonymousClass2SI.f30544B;
                captureEventInputWrapper = anonymousClass3rz4.f45580B;
                if (captureEventInputWrapper != null) {
                    captureEventInputWrapper.setRotation(i2);
                }
                anonymousClass3sf.f45903k = null;
            }
        }
    }

    public final void CRA(AnonymousClass2he anonymousClass2he) {
        AnonymousClass2he anonymousClass2he2 = this.f45877K;
        if (anonymousClass2he != anonymousClass2he2) {
            m21132N(anonymousClass2he2);
            m21130L(anonymousClass2he);
            if (this.f45895c) {
                AnonymousClass3sf.m21125G(this, this.f45877K);
                m21129K(anonymousClass2he);
            }
            this.f45877K = anonymousClass2he;
        }
    }

    /* renamed from: D */
    public static long m21122D() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: D */
    public final void m21136D() {
        this.f45873G = null;
        this.f45896d = null;
        this.f45895c = false;
        AnonymousClass3sf.m21125G(this, this.f45877K);
        AnonymousClass3sf.m21124F(this, m21131M());
        this.f45905m = null;
    }

    /* renamed from: E */
    public static void m21123E(AnonymousClass3sf anonymousClass3sf, AnonymousClass1Ue anonymousClass1Ue) {
        anonymousClass3sf.f45904l = anonymousClass1Ue;
        AnonymousClass3sf.m21121C(anonymousClass3sf);
        anonymousClass3sf.f45868B.m17147E(anonymousClass1Ue);
    }

    /* renamed from: F */
    public static void m21124F(AnonymousClass3sf anonymousClass3sf, boolean z) {
        AnonymousClass2mI anonymousClass2mI;
        if (anonymousClass3sf.f45897e) {
            anonymousClass3sf.f45868B.m17150H();
            anonymousClass2mI = anonymousClass3sf.f45878L;
            synchronized (anonymousClass2mI) {
                if (anonymousClass2mI.f33875H != null) {
                    anonymousClass2mI.f33875H.stopEffect();
                    if (z) {
                        anonymousClass2mI.f33875H.cleanupServices();
                    } else {
                        anonymousClass2mI.f33875H.resetServices();
                    }
                }
                if (anonymousClass2mI.f33869B != null) {
                    anonymousClass2mI.f33869B.onEffectStopped();
                }
            }
        } else if (z) {
            anonymousClass2mI = anonymousClass3sf.f45878L;
            if (anonymousClass2mI.f33875H != null) {
                anonymousClass2mI.f33875H.cleanupServices();
            }
        }
        if (anonymousClass3sf.f45905m != null) {
            AnonymousClass2hy anonymousClass2hy = anonymousClass3sf.f45905m;
            AnonymousClass2jN anonymousClass2jN = anonymousClass2hy.f32711F;
            if (!(anonymousClass2jN == null || anonymousClass2jN.f33028B == null)) {
                anonymousClass2hy.f32711F.f33028B.f45580B = null;
            }
            AnonymousClass2jp anonymousClass2jp = anonymousClass2hy.f32720O;
            if (anonymousClass2jp != null) {
                AnonymousClass2jo anonymousClass2jo = anonymousClass2jp.f33136B;
            }
            AnonymousClass2kL anonymousClass2kL = anonymousClass2hy.f32735d;
            if (!(anonymousClass2kL == null || anonymousClass2kL.f33230B == null)) {
                anonymousClass2hy.f32735d.f33230B.stop();
            }
            AnonymousClass1s6 anonymousClass1s6 = anonymousClass2hy.f32722Q;
            if (!(anonymousClass1s6 == null || anonymousClass1s6.f23573B == null)) {
                AnonymousClass2iA anonymousClass2iA = anonymousClass2hy.f32722Q.f23573B;
                synchronized (anonymousClass2iA) {
                    if (anonymousClass2iA.f32753D && anonymousClass2iA.f32770U != null) {
                        if (anonymousClass2iA.f32767R != null) {
                            anonymousClass2iA.f32770U.unregisterListener(anonymousClass2iA.f32768S);
                        }
                        if (anonymousClass2iA.f32751B != null) {
                            anonymousClass2iA.f32770U.unregisterListener(anonymousClass2iA.f32752C);
                        }
                        if (anonymousClass2iA.f32754E != null) {
                            anonymousClass2iA.f32770U.unregisterListener(anonymousClass2iA.f32755F);
                        }
                        if (anonymousClass2iA.f32765P != null) {
                            anonymousClass2iA.f32770U.unregisterListener(anonymousClass2iA.f32766Q);
                        }
                        if (anonymousClass2iA.f32758I != null) {
                            anonymousClass2iA.f32770U.unregisterListener(anonymousClass2iA.f32759J);
                        }
                        if (anonymousClass2iA.f32760K != null) {
                            anonymousClass2iA.f32770U.unregisterListener(anonymousClass2iA.f32761L);
                        }
                        if (anonymousClass2iA.f32762M != null) {
                            anonymousClass2iA.f32770U.unregisterListener(anonymousClass2iA.f32763N);
                        }
                    }
                    anonymousClass2iA.f32753D = false;
                    anonymousClass2iA.f32756G = false;
                }
            }
            AnonymousClass2jt anonymousClass2jt = anonymousClass2hy.f32725T;
            if (!(anonymousClass2jt == null || anonymousClass2jt.f33138B == null)) {
                anonymousClass2hy.f32725T.f33138B.stop();
            }
            AnonymousClass1s8 anonymousClass1s8 = anonymousClass2hy.f32723R;
            if (!(anonymousClass1s8 == null || anonymousClass1s8.f23584B == null)) {
                anonymousClass2hy.f32723R.f23584B.stop();
            }
            AnonymousClass1sB anonymousClass1sB = anonymousClass2hy.f32729X;
            if (!(anonymousClass1sB == null || anonymousClass1sB.f23586C == null)) {
                PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper = anonymousClass2hy.f32729X.f23586C.f23587B;
                if (platformEventsServiceObjectsWrapper != null) {
                    platformEventsServiceObjectsWrapper.stop();
                }
            }
            AnonymousClass1sF anonymousClass1sF = anonymousClass2hy.f32732a;
            if (!(anonymousClass1sF == null || anonymousClass1sF.f23592B == null)) {
                anonymousClass2hy.f32732a.f23592B.m16977A();
            }
        }
        anonymousClass3sf.f45903k = null;
        anonymousClass3sf.f45902j = null;
        anonymousClass3sf.f45901i = null;
        anonymousClass3sf.f45904l = null;
        anonymousClass3sf.f45872F = null;
        anonymousClass3sf.f45897e = false;
    }

    /* renamed from: G */
    public static void m21125G(AnonymousClass3sf anonymousClass3sf, AnonymousClass2he anonymousClass2he) {
        if (anonymousClass2he != null) {
            anonymousClass2he.m16936B(anonymousClass3sf, AnonymousClass1y7.INPUT_PREVIEW_SIZE);
            anonymousClass2he.m16936B(anonymousClass3sf, AnonymousClass1y7.INPUT_FACING);
            anonymousClass2he.m16936B(anonymousClass3sf, AnonymousClass1y7.INPUT_ROTATION);
            anonymousClass2he.m16936B(anonymousClass3sf, AnonymousClass1y7.INPUT_PREVIEW);
            anonymousClass2he.m16936B(anonymousClass3sf, AnonymousClass1y7.TOUCH_INPUT_CONFIG);
            anonymousClass2he.m16936B(anonymousClass3sf, AnonymousClass1y7.INPUT_START_RECORDING);
            anonymousClass2he.m16936B(anonymousClass3sf, AnonymousClass1y7.INPUT_STOP_RECORDING);
            anonymousClass2he.m16936B(anonymousClass3sf, AnonymousClass1y7.INPUT_CAPTURE_PHOTO);
            anonymousClass2he.m16936B(anonymousClass3sf, AnonymousClass1y7.INPUT_STOP_CAPTURE_PHOTO);
            anonymousClass2he.m16936B(anonymousClass3sf, AnonymousClass1y7.PREVIEW_VIEW_SIZE);
            anonymousClass2he.m16936B(anonymousClass3sf, AnonymousClass1y7.FRAME_RENDERED);
        }
    }

    /* renamed from: H */
    private void m21126H() {
        if (this.f45882P.m17158A()) {
            if (this.f45880N) {
                this.f45878L.m17162A().setCurrentOptimizationMode(this.f45886T ? AnonymousClass2hu.StillImage : AnonymousClass2hu.Video);
                AnonymousClass2Q5 anonymousClass2Q5 = this.f45871E;
                if (anonymousClass2Q5 != null) {
                    AnonymousClass1ra anonymousClass1ra = (AnonymousClass1ra) anonymousClass2Q5.get();
                    m21133A(new AnonymousClass2SG(anonymousClass1ra.getWidth(), anonymousClass1ra.getHeight()));
                    this.f45882P.m17160C(this.f45871E);
                    this.f45871E.release();
                    this.f45871E = null;
                }
                this.f45880N = false;
            }
        }
    }

    /* renamed from: I */
    private synchronized void m21127I() {
        synchronized (this.f45875I) {
            if (!this.f45892Z) {
                if (this.f45895c) {
                    if (!this.f45885S) {
                        this.f45878L.m17164C(false);
                        this.f45885S = true;
                    }
                    this.f45892Z = true;
                    if (this.f45906n) {
                        AnonymousClass2mI anonymousClass2mI = this.f45878L;
                        AnonymousClass2mI.m17161B(anonymousClass2mI).resize(this.f45908p, this.f45907o);
                        this.f45906n = false;
                    }
                    m21135C(this.f45873G, this.f45896d);
                }
            }
        }
    }

    /* renamed from: J */
    private synchronized void m21128J() {
        if (this.f45895c && this.f45877K != null && this.f45900h.f33905B) {
            AnonymousClass2mN anonymousClass2mN = this.f45900h;
            Object obj = (anonymousClass2mN.f33906C == null || anonymousClass2mN.f33907D == null || anonymousClass2mN.f33908E == null) ? null : 1;
            if (obj != null) {
                int i = 0;
                this.f45900h.f33905B = false;
                AnonymousClass2mG anonymousClass2mG = this.f45882P;
                int i2 = this.f45900h.f33907D.f30542C;
                int i3 = this.f45900h.f33907D.f30541B;
                AnonymousClass2mN anonymousClass2mN2 = this.f45900h;
                Object obj2 = anonymousClass2mN2.f33906C.f30539B == AnonymousClass1yA.FRONT ? 1 : null;
                int i4 = anonymousClass2mN2.f33908E.f30544B * 90;
                int i5 = anonymousClass2mN2.f33908E.f30545C;
                if (obj2 != null) {
                    i4 = (360 - ((i5 + i4) % 360)) % 360;
                } else {
                    i4 = ((i5 - i4) + 360) % 360;
                }
                AnonymousClass1yA anonymousClass1yA = this.f45900h.f33906C.f30539B;
                AnonymousClass1yA anonymousClass1yA2 = AnonymousClass1yA.FRONT;
                anonymousClass2mG.m17159B(i2, i3, i4, anonymousClass1yA == anonymousClass1yA2);
                AnonymousClass2mI anonymousClass2mI = this.f45878L;
                if (this.f45900h.f33906C.f30539B != anonymousClass1yA2) {
                    i = 1;
                }
                AnonymousClass2mI.m17161B(anonymousClass2mI).setCameraFacing(i);
            }
        }
    }

    public final boolean JX() {
        if (!this.f45868B.m17145C()) {
            return this.f45895c;
        }
        boolean z;
        if (this.f45895c) {
            if ((this.f45868B.f33770E.f33780B.get() > 0 ? 1 : null) != null) {
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    /* renamed from: K */
    private void m21129K(AnonymousClass2he anonymousClass2he) {
        if (anonymousClass2he != null) {
            anonymousClass2he.m16935A(this, AnonymousClass1y7.INPUT_PREVIEW_SIZE);
            anonymousClass2he.m16935A(this, AnonymousClass1y7.INPUT_FACING);
            anonymousClass2he.m16935A(this, AnonymousClass1y7.INPUT_ROTATION);
            anonymousClass2he.m16935A(this, AnonymousClass1y7.INPUT_PREVIEW);
            anonymousClass2he.m16935A(this, AnonymousClass1y7.TOUCH_INPUT_CONFIG);
            anonymousClass2he.m16935A(this, AnonymousClass1y7.INPUT_START_RECORDING);
            anonymousClass2he.m16935A(this, AnonymousClass1y7.INPUT_STOP_RECORDING);
            anonymousClass2he.m16935A(this, AnonymousClass1y7.INPUT_CAPTURE_PHOTO);
            anonymousClass2he.m16935A(this, AnonymousClass1y7.INPUT_STOP_CAPTURE_PHOTO);
            anonymousClass2he.m16935A(this, AnonymousClass1y7.PREVIEW_VIEW_SIZE);
            anonymousClass2he.m16935A(this, AnonymousClass1y7.FRAME_RENDERED);
        }
    }

    /* renamed from: L */
    private void m21130L(AnonymousClass2he anonymousClass2he) {
        if (anonymousClass2he != null) {
            if (this.f45868B.f33767B.f33765D) {
                anonymousClass2he.m16935A(this, AnonymousClass1y7.DOODLE_DATA);
            }
            if (!this.f45868B.m17145C()) {
                anonymousClass2he.m16935A(this, AnonymousClass1y7.MSQRD_EFFECT);
                anonymousClass2he.m16935A(this, AnonymousClass1y7.MSQRD_RESET_EFFECT);
                anonymousClass2he.m16935A(this, AnonymousClass1y7.WARM_UP_EFFECT);
            }
            anonymousClass2he.m16935A(this, AnonymousClass1y7.INPUT_RESET);
        }
    }

    /* renamed from: M */
    private boolean m21131M() {
        return false ^ 1;
    }

    /* renamed from: N */
    private void m21132N(AnonymousClass2he anonymousClass2he) {
        if (anonymousClass2he != null) {
            if (this.f45868B.f33767B.f33765D) {
                anonymousClass2he.m16936B(this, AnonymousClass1y7.DOODLE_DATA);
            }
            if (!this.f45868B.m17145C()) {
                anonymousClass2he.m16936B(this, AnonymousClass1y7.MSQRD_EFFECT);
                anonymousClass2he.m16935A(this, AnonymousClass1y7.MSQRD_RESET_EFFECT);
                anonymousClass2he.m16936B(this, AnonymousClass1y7.WARM_UP_EFFECT);
            }
            anonymousClass2he.m16936B(this, AnonymousClass1y7.INPUT_RESET);
        }
    }

    public final void NCA(int i, int i2) {
        this.f45908p = i;
        this.f45907o = i2;
        if (this.f45892Z) {
            AnonymousClass2mI.m17161B(this.f45878L).resize(i, i2);
            this.f45906n = false;
            return;
        }
        this.f45906n = true;
    }

    public final void OCA(AnonymousClass2R4 anonymousClass2R4) {
        this.f45900h.f33905B = true;
    }

    public final void QCA(RectF rectF) {
        if (this.f45868B.m17145C()) {
            AnonymousClass2m5 anonymousClass2m5 = this.f45868B;
            AnonymousClass1xu anonymousClass1xu = new AnonymousClass1xu(AnonymousClass1xw.CROPPED);
            anonymousClass1xu.f24791E = rectF.left;
            anonymousClass1xu.f24792F = rectF.right;
            anonymousClass1xu.f24793G = rectF.top;
            anonymousClass1xu.f24790D = rectF.bottom;
            anonymousClass2m5.m17146D(anonymousClass1xu.m13928A());
        }
        NCA(this.f45908p, this.f45907o);
    }

    public final void RCA() {
        int i = 0;
        while (true) {
            boolean[] zArr = this.f45894b;
            if (i >= zArr.length) {
                break;
            }
            zArr[i] = false;
            i++;
        }
        AnonymousClass3sf.m21125G(this, this.f45877K);
        if (this.f45892Z || this.f45885S) {
            synchronized (this.f45875I) {
                AnonymousClass3sf.m21124F(this, true);
                this.f45892Z = false;
                AnonymousClass2mI anonymousClass2mI = this.f45878L;
                synchronized (anonymousClass2mI) {
                    AnonymousClass2mI.m17161B(anonymousClass2mI).releaseGl();
                    if (anonymousClass2mI.f33875H != null) {
                        anonymousClass2mI.f33875H.destroy();
                        anonymousClass2mI.f33875H = null;
                    }
                }
                this.f45885S = false;
            }
        }
        AnonymousClass2Q5 anonymousClass2Q5 = this.f45871E;
        if (anonymousClass2Q5 != null) {
            anonymousClass2Q5.release();
            this.f45871E = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void pw(X.AnonymousClass1y5 r7) {
        /*
        r6 = this;
        r0 = r7.cT();
        r0 = r0.ordinal();
        switch(r0) {
            case 2: goto L_0x0032;
            case 3: goto L_0x00ed;
            case 4: goto L_0x00e7;
            case 5: goto L_0x00d7;
            case 6: goto L_0x00bc;
            case 7: goto L_0x007a;
            case 8: goto L_0x006d;
            case 9: goto L_0x0060;
            case 10: goto L_0x0053;
            case 11: goto L_0x00a0;
            case 12: goto L_0x004c;
            case 15: goto L_0x0114;
            case 16: goto L_0x00f7;
            case 22: goto L_0x0087;
            case 26: goto L_0x0012;
            case 27: goto L_0x000d;
            default: goto L_0x000b;
        };
    L_0x000b:
        goto L_0x0121;
    L_0x000d:
        r0 = 1;
        r6.f45890X = r0;
        goto L_0x0121;
    L_0x0012:
        r7 = (X.AnonymousClass2mP) r7;
        r3 = r7.f33909B;
        r0 = r6.f45885S;
        if (r0 != 0) goto L_0x0023;
    L_0x001a:
        r1 = r6.f45878L;
        r0 = 0;
        r1.m17164C(r0);
        r0 = 1;
        r6.f45885S = r0;
    L_0x0023:
        r2 = r6.f45870D;
        r1 = new X.2mH;
        r1.<init>(r6, r3);
        r0 = 1350906908; // 0x5085341c float:1.78782781E10 double:6.67436694E-315;
        X.AnonymousClass0GG.B(r2, r1, r0);
        goto L_0x0121;
    L_0x0032:
        r7 = (X.AnonymousClass2SC) r7;
        r0 = r7.f30538B;
        r2 = r0.iterator();
    L_0x003a:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0121;
    L_0x0040:
        r1 = r2.next();
        r1 = (X.AnonymousClass1xx) r1;
        r0 = r6.f45868B;
        r0.m17146D(r1);
        goto L_0x003a;
    L_0x004c:
        r7 = (X.AnonymousClass1Ue) r7;
        X.AnonymousClass3sf.m21123E(r6, r7);
        goto L_0x0121;
    L_0x0053:
        r0 = r6.f45872F;
        if (r0 == 0) goto L_0x0121;
    L_0x0057:
        r0 = r0.f45580B;
        if (r0 == 0) goto L_0x005e;
    L_0x005b:
        r0.finishCapturePhoto();
    L_0x005e:
        goto L_0x0121;
    L_0x0060:
        r0 = r6.f45872F;
        if (r0 == 0) goto L_0x0121;
    L_0x0064:
        r0 = r0.f45580B;
        if (r0 == 0) goto L_0x006b;
    L_0x0068:
        r0.capturePhoto();
    L_0x006b:
        goto L_0x0121;
    L_0x006d:
        r0 = r6.f45872F;
        if (r0 == 0) goto L_0x0121;
    L_0x0071:
        r0 = r0.f45580B;
        if (r0 == 0) goto L_0x0078;
    L_0x0075:
        r0.stopRecording();
    L_0x0078:
        goto L_0x0121;
    L_0x007a:
        r0 = r6.f45872F;
        if (r0 == 0) goto L_0x0121;
    L_0x007e:
        r0 = r0.f45580B;
        if (r0 == 0) goto L_0x0085;
    L_0x0082:
        r0.startRecording();
    L_0x0085:
        goto L_0x0121;
    L_0x0087:
        r7 = (X.AnonymousClass2kE) r7;
        r0 = r7.f33221B;
        if (r0 == 0) goto L_0x0121;
    L_0x008d:
        r2 = r6.f45878L;
        r0 = r7.f33221B;
        r2.f33879L = r0;
        r0 = r2.f33875H;
        if (r0 == 0) goto L_0x009e;
    L_0x0097:
        r1 = r2.f33875H;
        r0 = r2.f33879L;
        r1.setTouchInput(r0);
    L_0x009e:
        goto L_0x0121;
    L_0x00a0:
        r7 = (X.AnonymousClass2SH) r7;
        r0 = r6.f45871E;
        if (r0 == 0) goto L_0x00ac;
    L_0x00a6:
        r0.release();
        r0 = 0;
        r6.f45871E = r0;
    L_0x00ac:
        r1 = r6.f45886T;
        r0 = r7.f30543B;
        if (r1 == r0) goto L_0x00b4;
    L_0x00b2:
        r0 = 1;
        goto L_0x00b5;
    L_0x00b4:
        r0 = 0;
    L_0x00b5:
        r6.f45880N = r0;
        r0 = r7.f30543B;
        r6.f45886T = r0;
        goto L_0x0121;
    L_0x00bc:
        r7 = (X.AnonymousClass2SI) r7;
        r0 = r6.f45900h;
        r0.m17167C(r7);
        r0 = r6.f45878L;
        r1 = r0.m17162A();
        r0 = r7.f30545C;
        r1.setCameraSensorRotation(r0);
        r6.f45903k = r7;
        X.AnonymousClass3sf.m21121C(r6);
        r6.m21128J();
        goto L_0x0121;
    L_0x00d7:
        r7 = (X.AnonymousClass2SE) r7;
        r0 = r6.f45900h;
        r0.m17165A(r7);
        r6.f45901i = r7;
        X.AnonymousClass3sf.m21121C(r6);
        r6.m21128J();
        goto L_0x0121;
    L_0x00e7:
        r7 = (X.AnonymousClass2SG) r7;
        r6.m21133A(r7);
        goto L_0x0121;
    L_0x00ed:
        r7 = (X.AnonymousClass2SF) r7;
        r1 = r6.f45882P;
        r0 = r7.f30540B;
        r1.m17160C(r0);
        goto L_0x0121;
    L_0x00f7:
        r5 = r6.f45875I;
        monitor-enter(r5);
        r3 = X.AnonymousClass3sf.m21122D();	 Catch:{ all -> 0x0122 }
        r0 = 1;
        r6.f45883Q = r0;	 Catch:{ all -> 0x0125 }
        r0 = r6.f45878L;	 Catch:{ all -> 0x0125 }
        r0 = X.AnonymousClass2mI.m17161B(r0);	 Catch:{ all -> 0x0125 }
        r0.resetCurrentEffect();	 Catch:{ all -> 0x0125 }
        r0 = X.AnonymousClass3sf.m21122D();	 Catch:{ all -> 0x0122 }
        r0 = r0 - r3;
        java.lang.Long.valueOf(r0);	 Catch:{ all -> 0x0122 }
        monitor-exit(r5);	 Catch:{ all -> 0x0122 }
        goto L_0x0121;
    L_0x0114:
        r7 = (X.AnonymousClass2mK) r7;
        r2 = r6.f45875I;
        monitor-enter(r2);
        r1 = r7.f33899C;	 Catch:{ all -> 0x012f }
        r0 = r7.f33898B;	 Catch:{ all -> 0x012f }
        r6.m21135C(r1, r0);	 Catch:{ all -> 0x012f }
        monitor-exit(r2);	 Catch:{ all -> 0x012f }
    L_0x0121:
        return;
    L_0x0122:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0122 }
    L_0x0124:
        throw r0;
    L_0x0125:
        r2 = move-exception;
        r0 = X.AnonymousClass3sf.m21122D();	 Catch:{ all -> 0x0122 }
        r0 = r0 - r3;
        java.lang.Long.valueOf(r0);	 Catch:{ all -> 0x0122 }
        throw r2;	 Catch:{ all -> 0x0122 }
    L_0x012f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x012f }
        goto L_0x0124;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3sf.pw(X.1y5):void");
    }

    public final boolean sj(AnonymousClass2SA anonymousClass2SA, long j) {
        int i;
        boolean doFrame;
        boolean z;
        List list;
        long j2 = j;
        if (this.f45898f != null) {
            m21122D();
            r2.f45898f = null;
        }
        if (!r2.f45892Z) {
            m21127I();
            if (!r2.f45892Z) {
                return false;
            }
        }
        if (!(!r2.f45883Q || r2.f45896d == null || r2.f45878L.m17162A() == null)) {
            r2.f45896d.lq(r2.f45878L.m17162A().getManifest());
        }
        m21126H();
        AnonymousClass2SA anonymousClass2SA2 = anonymousClass2SA;
        AnonymousClass1uu anonymousClass1uu = anonymousClass2SA2.f30535G;
        AnonymousClass1uu anonymousClass1uu2 = anonymousClass2SA2.f30533E;
        AnonymousClass2mI anonymousClass2mI;
        int i2;
        if (anonymousClass1uu == null || anonymousClass1uu2 == null) {
            anonymousClass1uu2 = anonymousClass2SA2.m15767A();
            if (anonymousClass1uu2 != null) {
                anonymousClass2mI = r2.f45878L;
                i = anonymousClass1uu2.f24087C;
                i2 = anonymousClass1uu2.f24088D;
                anonymousClass2mI.f33871D = i;
                anonymousClass2mI.f33872E = i2;
                anonymousClass2mI.f33876I = 0;
            } else {
                anonymousClass2mI = r2.f45878L;
                anonymousClass2mI.f33871D = 0;
                anonymousClass2mI.f33872E = 36197;
                anonymousClass2mI.f33876I = 0;
            }
        } else {
            anonymousClass2mI = r2.f45878L;
            i = anonymousClass1uu.f24087C;
            i2 = anonymousClass1uu2.f24087C;
            anonymousClass2mI.f33871D = i;
            anonymousClass2mI.f33876I = i2;
            anonymousClass2mI.f33872E = 3553;
        }
        long D = r2.f45883Q ? AnonymousClass3sf.m21122D() : 0;
        if (r2.f45895c) {
            boolean z2;
            AnonymousClass2mI anonymousClass2mI2;
            float[] fArr;
            float[] fArr2;
            float[] fArr3;
            long j3;
            AnonymousClass1xq anonymousClass1xq;
            AREngineController B;
            int i3;
            int i4;
            float[] fArr4;
            float[] fArr5;
            int i5;
            int i6;
            if (!r2.f45890X && r2.f45894b[r2.f45876J.ordinal()]) {
                if (m21134B()) {
                    z2 = false;
                    anonymousClass2mI2 = r2.f45878L;
                    fArr = anonymousClass2SA2.f30532D;
                    fArr2 = anonymousClass2SA2.f30534F;
                    fArr3 = anonymousClass2SA2.f30531C;
                    j3 = anonymousClass2SA2.f30530B;
                    anonymousClass1xq = r2.f45876J;
                    synchronized (anonymousClass2mI2) {
                        if (anonymousClass2mI2.f33877J != null) {
                            anonymousClass2mI2.f33877J.beginMarker(anonymousClass2mI2.f33878K);
                        }
                        B = AnonymousClass2mI.m17161B(anonymousClass2mI2);
                        i3 = anonymousClass2mI2.f33871D;
                        i4 = anonymousClass2mI2.f33872E;
                        fArr4 = fArr2;
                        fArr5 = fArr3;
                        i5 = i3;
                        i6 = i4;
                        doFrame = B.doFrame(i5, i6, anonymousClass2mI2.f33876I, fArr, fArr4, fArr5, j2 * 1000, j3, anonymousClass1xq.m13923A(), z2);
                        if (anonymousClass2mI2.f33877J != null) {
                            anonymousClass2mI2.f33877J.endMarker();
                        }
                    }
                    if (doFrame) {
                        r2.f45884R = false;
                        r2.f45890X = false;
                        r2.f45894b[r2.f45876J.ordinal()] = true;
                    }
                }
            }
            z2 = true;
            anonymousClass2mI2 = r2.f45878L;
            fArr = anonymousClass2SA2.f30532D;
            fArr2 = anonymousClass2SA2.f30534F;
            fArr3 = anonymousClass2SA2.f30531C;
            j3 = anonymousClass2SA2.f30530B;
            anonymousClass1xq = r2.f45876J;
            synchronized (anonymousClass2mI2) {
                if (anonymousClass2mI2.f33877J != null) {
                    anonymousClass2mI2.f33877J.beginMarker(anonymousClass2mI2.f33878K);
                }
                B = AnonymousClass2mI.m17161B(anonymousClass2mI2);
                i3 = anonymousClass2mI2.f33871D;
                i4 = anonymousClass2mI2.f33872E;
                fArr4 = fArr2;
                fArr5 = fArr3;
                i5 = i3;
                i6 = i4;
                doFrame = B.doFrame(i5, i6, anonymousClass2mI2.f33876I, fArr, fArr4, fArr5, j2 * 1000, j3, anonymousClass1xq.m13923A(), z2);
                if (anonymousClass2mI2.f33877J != null) {
                    anonymousClass2mI2.f33877J.endMarker();
                }
            }
            if (doFrame) {
                r2.f45884R = false;
                r2.f45890X = false;
                r2.f45894b[r2.f45876J.ordinal()] = true;
            }
        } else {
            doFrame = false;
        }
        AnonymousClass2mD anonymousClass2mD = r2.f45879M;
        i = AnonymousClass2mD.m17155B(anonymousClass2mD);
        if (!anonymousClass2mD.f33794F) {
            if (anonymousClass2mD.f33791C == i) {
                z = false;
                anonymousClass2mD.f33794F = z;
                anonymousClass2mD.f33791C = i;
                list = null;
                synchronized (anonymousClass2mD.f33793E) {
                    if (!anonymousClass2mD.f33793E.isEmpty() && anonymousClass2mD.f33794F) {
                        list = new ArrayList(anonymousClass2mD.f33793E);
                        anonymousClass2mD.f33794F = false;
                    }
                }
                if (r3 != null) {
                    for (AnonymousClass2mQ Pl : r3) {
                        Pl.Pl(anonymousClass2mD.f33791C);
                    }
                }
                if (r2.f45883Q && doFrame) {
                    r2.f45883Q = false;
                    Long.valueOf(AnonymousClass3sf.m21122D() - D);
                    Float.valueOf((((float) Debug.getNativeHeapAllocatedSize()) / 1024.0f) / 1024.0f);
                    if (r2.f45896d != null) {
                        r2.f45896d.Pk(r2.f45873G.f33845R);
                    }
                }
                return doFrame;
            }
        }
        z = true;
        anonymousClass2mD.f33794F = z;
        anonymousClass2mD.f33791C = i;
        list = null;
        synchronized (anonymousClass2mD.f33793E) {
            list = new ArrayList(anonymousClass2mD.f33793E);
            anonymousClass2mD.f33794F = false;
        }
        if (r3 != null) {
            while (r3.hasNext()) {
                Pl.Pl(anonymousClass2mD.f33791C);
            }
        }
        r2.f45883Q = false;
        Long.valueOf(AnonymousClass3sf.m21122D() - D);
        Float.valueOf((((float) Debug.getNativeHeapAllocatedSize()) / 1024.0f) / 1024.0f);
        if (r2.f45896d != null) {
            r2.f45896d.Pk(r2.f45873G.f33845R);
        }
        return doFrame;
    }
}
