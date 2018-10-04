package com.instagram.camera.effect.mq;

import X.AnonymousClass0Cm;
import X.AnonymousClass0Dc;
import X.AnonymousClass0dg;
import X.AnonymousClass0eF;
import X.AnonymousClass0eG;
import X.AnonymousClass1s2;
import X.AnonymousClass1sR;
import X.AnonymousClass1ss;
import X.AnonymousClass1y5;
import X.AnonymousClass2mI;
import X.AnonymousClass2mQ;
import X.AnonymousClass36d;
import X.AnonymousClass36h;
import X.AnonymousClass36y;
import X.AnonymousClass37Q;
import X.AnonymousClass380;
import X.AnonymousClass389;
import X.AnonymousClass3rz;
import X.AnonymousClass3sf;
import X.AnonymousClass3xe;
import X.AnonymousClass3xf;
import X.AnonymousClass3xp;
import X.AnonymousClass3y3;
import X.AnonymousClass437;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class IgCameraControllerImpl implements AnonymousClass0eF {
    /* renamed from: R */
    public static AnonymousClass0eG f7639R;
    /* renamed from: B */
    public final AnonymousClass36y f7640B;
    /* renamed from: C */
    public WeakReference f7641C;
    /* renamed from: D */
    public AnonymousClass36d f7642D;
    /* renamed from: E */
    public AnonymousClass3rz f7643E;
    /* renamed from: F */
    public final Context f7644F;
    /* renamed from: G */
    public AnonymousClass3y3 f7645G;
    /* renamed from: H */
    public AnonymousClass36h f7646H;
    /* renamed from: I */
    public final AnonymousClass437 f7647I;
    /* renamed from: J */
    public boolean f7648J;
    /* renamed from: K */
    public AnonymousClass3sf f7649K;
    /* renamed from: L */
    public final Set f7650L = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    /* renamed from: M */
    public final Set f7651M = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    /* renamed from: N */
    public WeakReference f7652N;
    /* renamed from: O */
    public final AnonymousClass0Cm f7653O;
    /* renamed from: P */
    private final AnonymousClass3xp f7654P;
    /* renamed from: Q */
    private final AnonymousClass2mQ f7655Q = new AnonymousClass3xf(this);

    public final void Rk(EffectServiceHost effectServiceHost) {
    }

    public final void lq(EffectManifest effectManifest) {
    }

    public IgCameraControllerImpl(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        this.f7644F = context.getApplicationContext();
        this.f7653O = anonymousClass0Cm;
        this.f7640B = new AnonymousClass36y();
        this.f7654P = new AnonymousClass3xp(context);
        this.f7647I = new AnonymousClass437();
        AnonymousClass2mI anonymousClass2mI = new AnonymousClass2mI(null, context, null, null);
    }

    /* renamed from: A */
    public final AnonymousClass36h m6265A() {
        AnonymousClass3sf anonymousClass3sf = this.f7649K;
        if (anonymousClass3sf != null && anonymousClass3sf.JX()) {
            AnonymousClass36h anonymousClass36h = this.f7646H;
            if (anonymousClass36h != null) {
                return anonymousClass36h;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public final boolean m6266B(X.AnonymousClass36h r4, java.lang.String r5, java.lang.String r6) {
        /*
        r3 = this;
        r0 = r3.f7644F;
        if (r0 == 0) goto L_0x008e;
    L_0x0004:
        r3.f7646H = r4;
        r1 = r3.f7647I;
        r0 = r1.f48950B;
        r0.clear();
        r1 = r1.f48950B;
        r0 = X.AnonymousClass437.B(r6);
        r1.putAll(r0);
        r0 = r3.f7646H;
        if (r0 != 0) goto L_0x002c;
    L_0x001a:
        r0 = "user_action";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x0025;
    L_0x0022:
        r0 = X.AnonymousClass1ss.f23745F;
        goto L_0x0027;
    L_0x0025:
        r0 = X.AnonymousClass1ss.f23743D;
    L_0x0027:
        r0 = m6264B(r3, r0);
        return r0;
    L_0x002c:
        r0 = f7639R;
        r2 = 0;
        if (r0 != 0) goto L_0x0039;
    L_0x0031:
        r1 = "IgCameraControllerImpl";
        r0 = "setArEffect() sAssetManager should not be null";
        X.AnonymousClass0Dc.m1243F(r1, r0);
        return r2;
    L_0x0039:
        r0 = "user_action";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x0049;
    L_0x0041:
        r1 = r4.f37882L;
        r0 = r4.f37884N;
        X.AnonymousClass0dg.m6094F(r1, r0);
        goto L_0x0050;
    L_0x0049:
        r1 = r4.f37882L;
        r0 = "apply_effect_after_asset_downloaded";
        X.AnonymousClass0dg.m6092D(r1, r0, r5);
    L_0x0050:
        r0 = f7639R;
        r0 = r0.YC();
        if (r0 != 0) goto L_0x0062;
    L_0x0058:
        r1 = r3.f7646H;
        r0 = 1;
        r1.f37887Q = r0;
        r0 = f7639R;
        r0.lb();
    L_0x0062:
        r0 = r3.f7646H;
        r0 = r0.f37897a;
        if (r0 == 0) goto L_0x007a;
    L_0x0068:
        r0 = f7639R;
        r0 = r0.dC();
        if (r0 != 0) goto L_0x007a;
    L_0x0070:
        r1 = r3.f7646H;
        r0 = 1;
        r1.f37887Q = r0;
        r0 = f7639R;
        r0.mb();
    L_0x007a:
        r1 = r3.f7646H;
        if (r1 == 0) goto L_0x0083;
    L_0x007e:
        r0 = f7639R;
        r0.kb(r1);
    L_0x0083:
        r3.f7648J = r2;
        r0 = "user_action";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x0025;
    L_0x008d:
        goto L_0x0022;
    L_0x008e:
        r1 = new java.lang.IllegalStateException;
        r0 = "The MQ Controller is not initialized yet!";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.IgCameraControllerImpl.B(X.36h, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: B */
    public static boolean m6264B(IgCameraControllerImpl igCameraControllerImpl, AnonymousClass1ss anonymousClass1ss) {
        AnonymousClass0eG anonymousClass0eG = f7639R;
        boolean z = false;
        if (anonymousClass0eG == null) {
            AnonymousClass0Dc.m1243F("IgCameraControllerImpl", "refreshMQEffectSetup() AssetManager does not exist");
            return false;
        } else if (anonymousClass0eG.YC()) {
            IgCameraControllerImpl igCameraControllerImpl2 = igCameraControllerImpl;
            AnonymousClass3y3 anonymousClass3y3 = igCameraControllerImpl.f7645G;
            if (anonymousClass3y3 == null) {
                AnonymousClass0Dc.m1243F("IgCameraControllerImpl", "refreshMQEffectSetup() mCoordinator is null");
                return false;
            }
            AnonymousClass389 anonymousClass389 = anonymousClass3y3.f47492C;
            if (anonymousClass389 == null) {
                AnonymousClass0Dc.m1243F("IgCameraControllerImpl", "refreshMQEffectSetup() mediaPipeController is null");
                return false;
            }
            AnonymousClass36h anonymousClass36h = igCameraControllerImpl.f7646H;
            if (anonymousClass36h != null && (!anonymousClass36h.D() || (anonymousClass36h.f37897a && !f7639R.dC()))) {
                anonymousClass36h = null;
            } else if (anonymousClass36h != null) {
                AnonymousClass0dg.m6092D(anonymousClass36h.f37882L, "cache_hit", null);
            }
            if (anonymousClass36h != null && igCameraControllerImpl.f7649K == null) {
                igCameraControllerImpl.f7649K = AnonymousClass37Q.B(igCameraControllerImpl.f7644F, igCameraControllerImpl.f7640B, igCameraControllerImpl.f7655Q, anonymousClass389.f38170F.C());
                anonymousClass389.f38170F.I(Arrays.asList(new AnonymousClass1sR[]{new AnonymousClass1sR(igCameraControllerImpl.f7649K)}));
            }
            AnonymousClass36d anonymousClass36d = igCameraControllerImpl.f7642D;
            AnonymousClass1y5 rF = f7639R.rF(anonymousClass36h, igCameraControllerImpl2, igCameraControllerImpl.f7654P, igCameraControllerImpl.f7647I, anonymousClass36d != null ? new AnonymousClass3xe(anonymousClass36d) : null, AnonymousClass1s2.f23559D, igCameraControllerImpl.f7643E, anonymousClass1ss);
            if (rF != null) {
                if (anonymousClass36h != null) {
                    AnonymousClass0dg.m6091C(anonymousClass36h.f37882L, "render_event_sent");
                }
                if (!(anonymousClass36h == null || rF.f33899C == null)) {
                    z = true;
                }
                anonymousClass389.B(rF, z);
                return true;
            }
            anonymousClass389.B(f7639R.qF(null), false);
            return false;
        } else {
            AnonymousClass0Dc.m1243F("IgCameraControllerImpl", "refreshMQEffectSetup() FT model does not exist");
            return false;
        }
    }

    public final void Pk(String str) {
        AnonymousClass0dg.m6093E(str, true);
        for (AnonymousClass380 anonymousClass380 : this.f7650L) {
            if (anonymousClass380 != null) {
                anonymousClass380.Qk(str, this.f7648J);
            }
        }
    }
}
