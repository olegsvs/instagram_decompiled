package X;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.instagram.camera.effect.mq.IgCameraControllerImpl;

/* renamed from: X.0EG */
public final class AnonymousClass0EG {
    /* renamed from: B */
    public static AnonymousClass0EG f1960B;

    /* renamed from: A */
    public final void m1371A(Context context, AnonymousClass0Ci anonymousClass0Ci, boolean z) {
        try {
            AnonymousClass0FO.m1584H(false);
            AnonymousClass0Fr.m1684D();
            AnonymousClass0Iq.m2353D();
            CookieSyncManager.createInstance(context);
            CookieManager.getInstance().removeAllCookie();
            Context context2 = context;
            if (((Boolean) AnonymousClass0CC.hi.m845G()).booleanValue()) {
                context2 = context.getApplicationContext();
            }
            AnonymousClass0kx.m7227B(context2, "ACTION_CLEAR_DATA", null, false);
            AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass1P4(AnonymousClass0fg.m6544B(context)), -693081680);
            synchronized (AnonymousClass16o.class) {
                AnonymousClass16o.f14604E = null;
            }
            if (((Boolean) AnonymousClass0E6.m1317C(AnonymousClass0CC.SE)).booleanValue()) {
                IgCameraControllerImpl igCameraControllerImpl = AnonymousClass38H.B(context, null).f38204C;
                if (igCameraControllerImpl != null) {
                    AnonymousClass0eG anonymousClass0eG = IgCameraControllerImpl.f7639R;
                    if (anonymousClass0eG != null) {
                        anonymousClass0eG.KG(igCameraControllerImpl.f7644F);
                    }
                }
            } else if (AnonymousClass38H.B(context, null).f38204C != null) {
                AnonymousClass0eG anonymousClass0eG2 = IgCameraControllerImpl.f7639R;
                if (anonymousClass0eG2 != null) {
                    anonymousClass0eG2.LLA();
                }
            }
            AnonymousClass0x1.f12453C = null;
            AnonymousClass0nL.f10053D = null;
            AnonymousClass19r.f15188C = null;
            AnonymousClass0Jd.f2931B.mo627A();
            AnonymousClass2FP.f28039C = null;
            AnonymousClass3Mh.f40499C = null;
            AnonymousClass0G5.f2300C = null;
            if (z) {
                AnonymousClass1KJ.f17170B.m10758B();
                AnonymousClass0JU.f2920B.mo594B();
                AnonymousClass16H.f14518B.m9387A();
                AnonymousClass2FQ.B().A();
                AnonymousClass16L.f14521B.m9387A();
                AnonymousClass0dB.m5948D("BROADCAST_UPDATED_SEARCHES");
                AnonymousClass0q7.m7907B().m7908A();
            } else {
                AnonymousClass1KJ.f17170B.m10759C();
                AnonymousClass0JU.f2920B.mo593A();
                AnonymousClass2FQ.B();
                AnonymousClass2FQ.f28041C = null;
                AnonymousClass16H.f14518B.m9388B();
                AnonymousClass16L.f14521B.m9388B();
                AnonymousClass0q7.m7907B();
                AnonymousClass0q7.f10869C = null;
            }
            AnonymousClass0HV.f2645C = null;
            AnonymousClass0Il.getInstance().destroySharedReactInstanceIfExists();
        } catch (Throwable th) {
            if (z) {
                AnonymousClass1KJ.f17170B.m10758B();
                AnonymousClass0JU.f2920B.mo594B();
                AnonymousClass16H.f14518B.m9387A();
                AnonymousClass2FQ.B().A();
                AnonymousClass16L.f14521B.m9387A();
                AnonymousClass0dB.m5948D("BROADCAST_UPDATED_SEARCHES");
                AnonymousClass0q7.m7907B().m7908A();
            } else {
                AnonymousClass1KJ.f17170B.m10759C();
                AnonymousClass0JU.f2920B.mo593A();
                AnonymousClass2FQ.B();
                AnonymousClass2FQ.f28041C = null;
                AnonymousClass16H.f14518B.m9388B();
                AnonymousClass16L.f14521B.m9388B();
                AnonymousClass0q7.m7907B();
                AnonymousClass0q7.f10869C = null;
            }
            AnonymousClass0HV.f2645C = null;
            AnonymousClass0Il.getInstance().destroySharedReactInstanceIfExists();
        }
    }
}
