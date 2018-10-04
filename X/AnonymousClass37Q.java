package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.37Q */
public final class AnonymousClass37Q {
    /* renamed from: B */
    public static AnonymousClass3sf m18631B(Context context, AnonymousClass1QE anonymousClass1QE, AnonymousClass2mQ anonymousClass2mQ, AnonymousClass1uz anonymousClass1uz) {
        boolean z;
        AnonymousClass1U7 anonymousClass1U7;
        FaceTrackerDataProviderConfig faceTrackerDataProviderConfig;
        Executor B;
        Context context2;
        AnonymousClass2mI anonymousClass2mI;
        AnonymousClass3sf anonymousClass3sf;
        boolean z2 = AnonymousClass0FZ.B().f2177B.getBoolean("show_camera_debug_info", false);
        boolean z3 = AnonymousClass0FZ.B().f2177B.getBoolean("camera_gpu_timer_info", false);
        boolean z4 = AnonymousClass0FZ.B().f2177B.getBoolean("camera_gpu_timer_info_verbose", false);
        int i = z2 ? 1 : 0;
        if (z3) {
            i |= 2;
        }
        if (z4) {
            i |= 4;
        }
        AnonymousClass2mJ anonymousClass2mJ = new AnonymousClass2mJ();
        anonymousClass2mJ.f33886D = i;
        anonymousClass2mJ.f33891I = z2;
        if (!z3) {
            if (!z4) {
                z = false;
                anonymousClass2mJ.f33888F = z;
                anonymousClass1U7 = new AnonymousClass1U7(anonymousClass2mJ);
                faceTrackerDataProviderConfig = new FaceTrackerDataProviderConfig(true, false);
                if (((Boolean) AnonymousClass0E6.C(AnonymousClass0CC.KL)).booleanValue()) {
                    B = AnonymousClass0Fx.B();
                } else {
                    B = AnonymousClass0Kq.B().A();
                }
                context2 = context;
                anonymousClass2mI = new AnonymousClass2mI(anonymousClass1U7, context, Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()), new AnonymousClass3ri(context.getApplicationContext(), faceTrackerDataProviderConfig, anonymousClass1QE));
                anonymousClass3sf = new AnonymousClass3sf(B, context2, anonymousClass2mI, new AnonymousClass3xq(), new AnonymousClass3xr(), new AnonymousClass1rd(new AnonymousClass385(), new AnonymousClass2Ph()).m13515A(), new AnonymousClass2m9());
                if (anonymousClass1uz != anonymousClass2mI.f33877J) {
                    anonymousClass2mI.f33877J = anonymousClass1uz;
                    if (anonymousClass1uz == null) {
                        anonymousClass2mI.f33878K = anonymousClass1uz.createTimerHandle("AREngineDoFrame");
                    } else {
                        anonymousClass2mI.f33878K = -1;
                    }
                }
                anonymousClass3sf.f45879M.m17156A(anonymousClass2mQ);
                return anonymousClass3sf;
            }
        }
        z = true;
        anonymousClass2mJ.f33888F = z;
        anonymousClass1U7 = new AnonymousClass1U7(anonymousClass2mJ);
        faceTrackerDataProviderConfig = new FaceTrackerDataProviderConfig(true, false);
        if (((Boolean) AnonymousClass0E6.C(AnonymousClass0CC.KL)).booleanValue()) {
            B = AnonymousClass0Fx.B();
        } else {
            B = AnonymousClass0Kq.B().A();
        }
        context2 = context;
        anonymousClass2mI = new AnonymousClass2mI(anonymousClass1U7, context, Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()), new AnonymousClass3ri(context.getApplicationContext(), faceTrackerDataProviderConfig, anonymousClass1QE));
        anonymousClass3sf = new AnonymousClass3sf(B, context2, anonymousClass2mI, new AnonymousClass3xq(), new AnonymousClass3xr(), new AnonymousClass1rd(new AnonymousClass385(), new AnonymousClass2Ph()).m13515A(), new AnonymousClass2m9());
        if (anonymousClass1uz != anonymousClass2mI.f33877J) {
            anonymousClass2mI.f33877J = anonymousClass1uz;
            if (anonymousClass1uz == null) {
                anonymousClass2mI.f33878K = -1;
            } else {
                anonymousClass2mI.f33878K = anonymousClass1uz.createTimerHandle("AREngineDoFrame");
            }
        }
        anonymousClass3sf.f45879M.m17156A(anonymousClass2mQ);
        return anonymousClass3sf;
    }
}
