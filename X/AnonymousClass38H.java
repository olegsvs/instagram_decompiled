package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.camera.effect.mq.IgCameraAudioControllerImpl;
import com.instagram.camera.effect.mq.IgCameraControllerImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.38H */
public final class AnonymousClass38H {
    /* renamed from: H */
    private static final CopyOnWriteArraySet f38202H = new CopyOnWriteArraySet();
    /* renamed from: B */
    public IgCameraAudioControllerImpl f38203B;
    /* renamed from: C */
    public final IgCameraControllerImpl f38204C;
    /* renamed from: D */
    public AnonymousClass38J f38205D;
    /* renamed from: E */
    private final Context f38206E;
    /* renamed from: F */
    private Map f38207F;
    /* renamed from: G */
    private final AtomicBoolean f38208G = new AtomicBoolean(false);

    private AnonymousClass38H(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        this.f38206E = context.getApplicationContext();
        this.f38204C = new IgCameraControllerImpl(this.f38206E, anonymousClass0Cm);
        if (AnonymousClass38I.m18716B(this.f38206E)) {
            IgCameraControllerImpl igCameraControllerImpl = this.f38204C;
            if (IgCameraControllerImpl.f7639R == null) {
                IgCameraControllerImpl.f7639R = AnonymousClass37C.m18591B(igCameraControllerImpl.f7644F);
            }
            IgCameraControllerImpl.f7639R.TSA(anonymousClass0Cm);
            AnonymousClass0eG anonymousClass0eG = IgCameraControllerImpl.f7639R;
            this.f38205D = new AnonymousClass38J(anonymousClass0eG != null ? anonymousClass0eG.ZP() : null);
        }
    }

    /* renamed from: A */
    public final void m18683A(AnonymousClass380 anonymousClass380) {
        this.f38204C.f7650L.add(anonymousClass380);
    }

    /* renamed from: B */
    public static AnonymousClass38H m18682B(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass38H anonymousClass38H = new AnonymousClass38H(context, anonymousClass0Cm);
        f38202H.add(new WeakReference(anonymousClass38H));
        return anonymousClass38H;
    }

    /* renamed from: B */
    public final void m18684B(AnonymousClass1sm anonymousClass1sm) {
        AnonymousClass3y3 anonymousClass3y3 = this.f38204C.f7645G;
        if (anonymousClass3y3 != null) {
            anonymousClass3y3.m21772A(anonymousClass1sm);
        }
    }

    /* renamed from: C */
    public final AnonymousClass2no m18685C(AnonymousClass36d anonymousClass36d, View view, String str) {
        IgCameraControllerImpl igCameraControllerImpl = this.f38204C;
        if (igCameraControllerImpl.f7644F != null) {
            AnonymousClass36d anonymousClass36d2 = anonymousClass36d;
            igCameraControllerImpl.f7642D = anonymousClass36d;
            igCameraControllerImpl.f7645G = new AnonymousClass3y3(igCameraControllerImpl.f7644F, igCameraControllerImpl.f7653O, anonymousClass36d2, view, new AnonymousClass3xg(igCameraControllerImpl), str);
            return igCameraControllerImpl.f7645G;
        }
        throw new IllegalStateException("The MQ Controller is not initialized yet!");
    }

    /* renamed from: D */
    public final AnonymousClass36h m18686D(String str) {
        if (this.f38207F == null) {
            m18715g();
        }
        return (AnonymousClass36h) this.f38207F.get(str);
    }

    /* renamed from: E */
    public final List m18687E() {
        List arrayList = new ArrayList();
        for (AnonymousClass36h anonymousClass36h : m18691I()) {
            if (anonymousClass36h.m18539E()) {
                arrayList.add(anonymousClass36h);
            }
        }
        return arrayList;
    }

    /* renamed from: F */
    public final AnonymousClass36h m18688F() {
        return this.f38204C.f7646H;
    }

    /* renamed from: G */
    public final String m18689G() {
        Map hashMap = new HashMap(this.f38204C.f7647I.f48950B);
        return hashMap.isEmpty() ? null : new JSONObject(hashMap).toString();
    }

    /* renamed from: H */
    public final AnonymousClass36h m18690H() {
        return this.f38204C.A();
    }

    /* renamed from: I */
    public final List m18691I() {
        AnonymousClass0eG anonymousClass0eG = IgCameraControllerImpl.f7639R;
        if (anonymousClass0eG == null) {
            return Collections.emptyList();
        }
        return anonymousClass0eG.jL();
    }

    /* renamed from: J */
    public final AnonymousClass36h m18692J(AnonymousClass36l anonymousClass36l) {
        for (AnonymousClass36h anonymousClass36h : m18691I()) {
            if (anonymousClass36h.f37895Y == anonymousClass36l) {
                return anonymousClass36h;
            }
        }
        return null;
    }

    /* renamed from: K */
    public final int m18693K(String str) {
        List I = m18691I();
        for (int i = 0; i < I.size(); i++) {
            if (((AnonymousClass36h) I.get(i)).f37882L.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: L */
    public final boolean m18694L() {
        return m18688F() != null && m18688F().f37895Y == AnonymousClass36l.WORLD;
    }

    /* renamed from: M */
    public final boolean m18695M() {
        return m18688F() != null;
    }

    /* renamed from: N */
    public final boolean m18696N(AnonymousClass36l anonymousClass36l) {
        AnonymousClass36h J = m18692J(anonymousClass36l);
        return J != null && J.m18538D();
    }

    /* renamed from: O */
    public final boolean m18697O() {
        if (!AnonymousClass38I.m18716B(this.f38206E)) {
            return false;
        }
        AnonymousClass0eG anonymousClass0eG = IgCameraControllerImpl.f7639R;
        anonymousClass0eG = IgCameraControllerImpl.f7639R;
        return anonymousClass0eG != null ? anonymousClass0eG.yX() : false;
    }

    /* renamed from: P */
    public final boolean m18698P() {
        return this.f38208G.get();
    }

    /* renamed from: Q */
    public final boolean m18699Q() {
        AnonymousClass0eG anonymousClass0eG = IgCameraControllerImpl.f7639R;
        return anonymousClass0eG != null ? anonymousClass0eG.kY() : false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: R */
    public final boolean m18700R() {
        /*
        r3 = this;
        r2 = r3.m18688F();
        r0 = r3.m18698P();
        if (r0 != 0) goto L_0x002c;
    L_0x000a:
        if (r2 == 0) goto L_0x002a;
    L_0x000c:
        r0 = r2.m18539E();
        if (r0 != 0) goto L_0x0027;
    L_0x0012:
        r1 = r2.f37895Y;
        r0 = X.AnonymousClass36l.SUPERZOOM;
        if (r1 == r0) goto L_0x0027;
    L_0x0018:
        r1 = r2.f37895Y;
        r0 = X.AnonymousClass36l.FOCUS;
        if (r1 == r0) goto L_0x0027;
    L_0x001e:
        r0 = r2.m18537C();
        if (r0 == 0) goto L_0x0025;
    L_0x0024:
        goto L_0x0027;
    L_0x0025:
        r0 = 0;
        goto L_0x0028;
    L_0x0027:
        r0 = 1;
    L_0x0028:
        if (r0 == 0) goto L_0x002c;
    L_0x002a:
        r0 = 1;
        goto L_0x002d;
    L_0x002c:
        r0 = 0;
    L_0x002d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.38H.R():boolean");
    }

    /* renamed from: S */
    public final void m18701S() {
        if (AnonymousClass38I.m18716B(this.f38206E)) {
            AnonymousClass0GG.B(AnonymousClass0Fx.B(), new AnonymousClass37K(this.f38204C), 1108936349);
        }
    }

    /* renamed from: T */
    public final boolean m18702T(MotionEvent motionEvent) {
        AnonymousClass3y3 anonymousClass3y3 = this.f38204C.f7645G;
        if (anonymousClass3y3 == null) {
            return false;
        }
        boolean A;
        AnonymousClass389 anonymousClass389 = anonymousClass3y3.f47492C;
        if (anonymousClass389.f38172H) {
            A = anonymousClass389.f38178N.m17009A(motionEvent, 0);
        } else {
            A = false;
        }
        return A;
    }

    /* renamed from: U */
    public final boolean m18703U() {
        return m18707Y((AnonymousClass36h) null, "user_action");
    }

    /* renamed from: V */
    public final void m18704V(AnonymousClass380 anonymousClass380) {
        this.f38204C.f7650L.remove(anonymousClass380);
    }

    /* renamed from: W */
    public final void m18705W(List list) {
        for (AnonymousClass36h anonymousClass36h : list) {
            if (!anonymousClass36h.m18538D()) {
                IgCameraControllerImpl.f7639R.ALA(anonymousClass36h.f37882L, null);
            }
        }
    }

    /* renamed from: X */
    public final void m18706X(String str) {
        AnonymousClass38J anonymousClass38J = this.f38205D;
        if (anonymousClass38J != null) {
            JSONObject jSONObject = new JSONObject();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("file://iggallery");
            stringBuilder.append(str);
            try {
                jSONObject.put("imageURL", stringBuilder.toString());
                AnonymousClass38J.m18719B(anonymousClass38J, jSONObject);
            } catch (JSONException e) {
                AnonymousClass0Gn.C("PlatformEventsController::fireARGalleryPlatformEvent", e.getMessage());
            }
        }
    }

    /* renamed from: Y */
    public final boolean m18707Y(AnonymousClass36h anonymousClass36h, String str) {
        return m18709a(anonymousClass36h, str, null);
    }

    /* renamed from: Z */
    public final boolean m18708Z(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return m18703U();
        }
        for (AnonymousClass36h anonymousClass36h : m18691I()) {
            if (anonymousClass36h.f37882L.equals(str)) {
                return m18707Y(anonymousClass36h, str2);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m18709a(AnonymousClass36h anonymousClass36h, String str, String str2) {
        boolean z = m18697O() && this.f38204C.B(anonymousClass36h, str, str2);
        if (z && anonymousClass36h != null) {
            AnonymousClass38J anonymousClass38J = this.f38205D;
            if (anonymousClass38J != null) {
                anonymousClass38J.m18720A(true);
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void m18710b(AnonymousClass36l anonymousClass36l) {
        AnonymousClass36h J = m18692J(anonymousClass36l);
        if (J != null) {
            if (J.m18538D()) {
                m18707Y(J, "user_action");
            }
        }
    }

    /* renamed from: c */
    public final void m18711c(boolean z) {
        this.f38208G.compareAndSet(z ^ 1, z);
    }

    /* renamed from: d */
    public final void m18712d() {
        IgCameraAudioControllerImpl igCameraAudioControllerImpl = this.f38203B;
        if (igCameraAudioControllerImpl != null) {
            AnonymousClass2ib anonymousClass2ib = igCameraAudioControllerImpl.f47425C;
            if (anonymousClass2ib != null) {
                anonymousClass2ib.m16989A(new AnonymousClass37J(igCameraAudioControllerImpl), igCameraAudioControllerImpl.f47424B);
            }
        }
    }

    /* renamed from: e */
    public final void m18713e(boolean z) {
        IgCameraControllerImpl igCameraControllerImpl = this.f38204C;
        WeakReference weakReference = igCameraControllerImpl.f7641C;
        if (weakReference != null) {
            AnonymousClass373 anonymousClass373 = (AnonymousClass373) weakReference.get();
            if (anonymousClass373 != null) {
                anonymousClass373.f37988I = z;
                anonymousClass373.f37990K.set(anonymousClass373.f37986G.size());
                igCameraControllerImpl.f7641C = null;
            }
        }
    }

    /* renamed from: f */
    public final void m18714f(boolean z) {
        IgCameraControllerImpl igCameraControllerImpl = this.f38204C;
        WeakReference weakReference = igCameraControllerImpl.f7652N;
        if (weakReference != null) {
            AnonymousClass3xv anonymousClass3xv = (AnonymousClass3xv) weakReference.get();
            if (anonymousClass3xv != null) {
                anonymousClass3xv.f47458C.sendEmptyMessage(z ? 2 : 1);
                igCameraControllerImpl.f7652N = null;
            }
        }
    }

    /* renamed from: g */
    public final void m18715g() {
        if (this.f38207F == null) {
            this.f38207F = new HashMap();
        }
        for (AnonymousClass36h anonymousClass36h : m18691I()) {
            String str = anonymousClass36h.f37882L;
            if (str != null) {
                if (!this.f38207F.containsKey(str)) {
                    this.f38207F.put(str, anonymousClass36h);
                }
            }
        }
    }
}
