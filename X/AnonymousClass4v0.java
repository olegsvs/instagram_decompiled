package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.4v0 */
public final class AnonymousClass4v0 {
    /* renamed from: L */
    private static final Map f58438L = new WeakHashMap();
    /* renamed from: B */
    public int f58439B;
    /* renamed from: C */
    private final WeakReference f58440C;
    /* renamed from: D */
    private boolean f58441D;
    /* renamed from: E */
    private boolean f58442E = true;
    /* renamed from: F */
    private boolean f58443F = false;
    /* renamed from: G */
    private final List f58444G = new ArrayList();
    /* renamed from: H */
    private boolean f58445H = false;
    /* renamed from: I */
    private boolean f58446I = false;
    /* renamed from: J */
    private float f58447J;
    /* renamed from: K */
    private float f58448K;

    private AnonymousClass4v0(Context context) {
        this.f58440C = new WeakReference(context);
    }

    /* renamed from: A */
    public final void m25356A(AnonymousClass4uy anonymousClass4uy) {
        for (WeakReference weakReference : this.f58444G) {
            if (anonymousClass4uy == ((AnonymousClass4uy) weakReference.get())) {
                return;
            }
        }
        this.f58444G.add(new WeakReference(anonymousClass4uy));
        anonymousClass4uy.bs(AnonymousClass4uz.NAV_BAR_HEIGHT_CHANGE, this.f58439B, this);
    }

    /* renamed from: B */
    public static AnonymousClass4v0 m25353B(Activity activity) {
        Map map = f58438L;
        AnonymousClass4v0 anonymousClass4v0 = (AnonymousClass4v0) map.get(activity);
        if (anonymousClass4v0 != null) {
            return anonymousClass4v0;
        }
        anonymousClass4v0 = new AnonymousClass4v0(activity);
        map.put(activity, anonymousClass4v0);
        return anonymousClass4v0;
    }

    /* renamed from: B */
    public final void m25357B(float f) {
        if (this.f58447J != f) {
            this.f58447J = f;
            AnonymousClass4v0.m25355D(this);
        }
    }

    /* renamed from: C */
    private static void m25354C(AnonymousClass4v0 anonymousClass4v0, AnonymousClass4uz anonymousClass4uz) {
        Iterator it = anonymousClass4v0.f58444G.iterator();
        while (it.hasNext()) {
            AnonymousClass4uy anonymousClass4uy = (AnonymousClass4uy) ((WeakReference) it.next()).get();
            if (anonymousClass4uy == null) {
                it.remove();
            } else {
                anonymousClass4uy.bs(anonymousClass4uz, anonymousClass4v0.f58439B, anonymousClass4v0);
            }
        }
    }

    /* renamed from: C */
    public final void m25358C(boolean z) {
        if (this.f58441D != z) {
            this.f58441D = z;
            AnonymousClass4v0.m25354C(this, AnonymousClass4uz.NAV_BAR_HEIGHT_CHANGE);
        }
    }

    /* renamed from: D */
    public final void m25359D(float f) {
        if (this.f58448K != f) {
            this.f58448K = f;
            AnonymousClass4v0.m25355D(this);
        }
    }

    /* renamed from: D */
    private static void m25355D(AnonymousClass4v0 anonymousClass4v0) {
        Context context = (Context) anonymousClass4v0.f58440C.get();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getWindow() == null) {
                return;
            }
            if (activity.getWindow().getDecorView() != null) {
                View decorView = activity.getWindow().getDecorView();
                if (anonymousClass4v0.f58447J <= 0.0f && anonymousClass4v0.f58448K <= 0.0f) {
                    if (!anonymousClass4v0.f58441D) {
                        if (anonymousClass4v0.f58445H && !anonymousClass4v0.f58446I && !anonymousClass4v0.f58443F) {
                            decorView.setSystemUiVisibility(5894);
                            AnonymousClass4v0.m25354C(anonymousClass4v0, AnonymousClass4uz.NAV_BAR_HIDE);
                            return;
                        }
                        return;
                    }
                }
                decorView.setSystemUiVisibility(256);
                AnonymousClass4v0.m25354C(anonymousClass4v0, AnonymousClass4uz.NAV_BAR_SHOWN);
            }
        }
    }

    /* renamed from: E */
    public final void m25360E(boolean z) {
        if (this.f58442E != z) {
            this.f58442E = z;
            AnonymousClass4v0.m25355D(this);
        }
    }

    /* renamed from: F */
    public final void m25361F() {
        if (this.f58445H) {
            this.f58445H = false;
            AnonymousClass4v0.m25355D(this);
        }
    }

    /* renamed from: G */
    public final void m25362G() {
        if (!this.f58445H) {
            this.f58445H = true;
            AnonymousClass4v0.m25355D(this);
        }
    }

    /* renamed from: H */
    public final void m25363H() {
        if (this.f58446I) {
            this.f58446I = false;
            AnonymousClass4v0.m25354C(this, AnonymousClass4uz.NAV_BAR_HEIGHT_CHANGE);
        }
    }

    /* renamed from: I */
    public final void m25364I() {
        if (!this.f58446I) {
            this.f58446I = true;
            AnonymousClass4v0.m25354C(this, AnonymousClass4uz.NAV_BAR_HEIGHT_CHANGE);
        }
    }

    /* renamed from: J */
    public final void m25365J(boolean z) {
        if (this.f58443F != z) {
            this.f58443F = z;
            AnonymousClass4v0.m25354C(this, AnonymousClass4uz.NAV_BAR_HEIGHT_CHANGE);
        }
    }

    /* renamed from: K */
    public final void m25366K(int i) {
        if (this.f58439B != i) {
            this.f58439B = i;
            AnonymousClass4v0.m25354C(this, AnonymousClass4uz.NAV_BAR_HEIGHT_CHANGE);
        }
    }
}
