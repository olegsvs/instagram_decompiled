package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.Toast;
import com.facebook.analytics.appstatelogger.AppStateLogger;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: X.0Iz */
public final class AnonymousClass0Iz {
    /* renamed from: L */
    public static final AnonymousClass0Iz f2854L = new AnonymousClass0Iz();
    /* renamed from: B */
    public final Context f2855B = AnonymousClass0EV.f1977B;
    /* renamed from: C */
    public String f2856C;
    /* renamed from: D */
    public final Set f2857D = new HashSet();
    /* renamed from: E */
    public AnonymousClass0NN f2858E;
    /* renamed from: F */
    public long f2859F;
    /* renamed from: G */
    public String f2860G;
    /* renamed from: H */
    public final Map f2861H = new HashMap();
    /* renamed from: I */
    public boolean f2862I;
    /* renamed from: J */
    public int f2863J = 0;
    /* renamed from: K */
    private final AnonymousClass0cR f2864K = AnonymousClass0cR.f7154D;

    /* renamed from: A */
    public final void m2398A(AnonymousClass0EE anonymousClass0EE, String str, String str2, Activity activity) {
        AnonymousClass14W anonymousClass14W = (AnonymousClass14W) this.f2861H.get(activity.toString());
        if (anonymousClass14W != null && !anonymousClass14W.f13903B.isEmpty()) {
            Map map = (Map) anonymousClass14W.f13903B.getLast();
            if (AnonymousClass14W.m9196B(anonymousClass14W, map, anonymousClass0EE)) {
                map.put(str, str2);
            }
        }
    }

    /* renamed from: B */
    public final AnonymousClass0lA m2399B() {
        String str = this.f2856C;
        return str == null ? null : AnonymousClass0Iz.m2395B(this, str);
    }

    /* renamed from: B */
    public static AnonymousClass0lA m2395B(AnonymousClass0Iz anonymousClass0Iz, String str) {
        AnonymousClass14W anonymousClass14W = (AnonymousClass14W) anonymousClass0Iz.f2861H.get(str);
        if (anonymousClass14W == null) {
            return null;
        }
        str = AnonymousClass0lA.m7236B();
        anonymousClass0Iz = anonymousClass14W.f13903B;
        for (int i = 0; i < anonymousClass0Iz.size(); i++) {
            Map map = (Map) anonymousClass0Iz.get(i);
            AnonymousClass0db C = AnonymousClass0db.m6067C();
            for (Entry entry : map.entrySet()) {
                if (!((String) entry.getKey()).equals("instance_id")) {
                    C.m6074G((String) entry.getKey(), (String) entry.getValue());
                }
            }
            str.m7238B(C);
        }
        return str;
    }

    /* renamed from: C */
    public final int m2400C() {
        String str = this.f2856C;
        if (str == null) {
            return 0;
        }
        AnonymousClass14W anonymousClass14W = (AnonymousClass14W) this.f2861H.get(str);
        if (anonymousClass14W == null) {
            return 0;
        }
        return anonymousClass14W.f13904C;
    }

    /* renamed from: C */
    private boolean m2396C(AnonymousClass0EE anonymousClass0EE) {
        if (!this.f2857D.contains(Integer.valueOf(System.identityHashCode(anonymousClass0EE)))) {
            return false;
        }
        this.f2857D.remove(Integer.valueOf(System.identityHashCode(anonymousClass0EE)));
        return true;
    }

    /* renamed from: D */
    public final int m2401D(Activity activity) {
        AnonymousClass14W anonymousClass14W = (AnonymousClass14W) this.f2861H.get(activity.toString());
        if (anonymousClass14W != null) {
            return anonymousClass14W.f13904C;
        }
        return -1;
    }

    /* renamed from: D */
    private long m2397D() {
        if (this.f2862I) {
            return this.f2859F;
        }
        return this.f2859F - (SystemClock.elapsedRealtime() - AwakeTimeSinceBootClock.get().now());
    }

    /* renamed from: E */
    public final boolean m2402E() {
        return this.f2858E != null;
    }

    /* renamed from: F */
    public final void m2403F(AnonymousClass0EE anonymousClass0EE, Activity activity) {
        if (!m2396C(anonymousClass0EE)) {
            AnonymousClass14W anonymousClass14W = (AnonymousClass14W) this.f2861H.get(activity.toString());
            if (anonymousClass14W != null) {
                int i = 1;
                if (anonymousClass14W.f13903B.isEmpty()) {
                    anonymousClass14W.f13904C--;
                } else {
                    Map map = (Map) anonymousClass14W.f13903B.getLast();
                    if (AnonymousClass14W.m9196B(anonymousClass14W, map, anonymousClass0EE)) {
                        anonymousClass14W.f13903B.removeLast();
                        anonymousClass14W.f13904C--;
                    } else {
                        Iterator it = anonymousClass14W.f13903B.iterator();
                        while (it.hasNext()) {
                            if (AnonymousClass14W.m9196B(anonymousClass14W, (Map) it.next(), anonymousClass0EE)) {
                                it.remove();
                                anonymousClass14W.f13904C--;
                                break;
                            }
                        }
                        i = 0;
                        if (i == 0) {
                            AnonymousClass0Gn.mo2104B();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Expected module: ");
                            stringBuilder.append((String) map.get("module"));
                            stringBuilder.append(", current module: ");
                            stringBuilder.append(anonymousClass0EE.getModuleName());
                            AnonymousClass0Gn.m1881H("mismatch_nav", stringBuilder.toString());
                        }
                    }
                }
                if (BreakpadManager.isActive() && !AnonymousClass0CB.m840J()) {
                    BreakpadManager.setCustomData("nav_stack", anonymousClass14W.f13903B.toString(), new Object[0]);
                }
            }
        }
    }

    /* renamed from: G */
    public final void m2404G(AnonymousClass0EE anonymousClass0EE) {
        this.f2857D.add(Integer.valueOf(System.identityHashCode(anonymousClass0EE)));
    }

    /* renamed from: H */
    public final void m2405H(AnonymousClass0EE anonymousClass0EE) {
        String str;
        AnonymousClass0Sy.m4434C();
        AnonymousClass0Gn.mo2104B().mo2105C(anonymousClass0EE.getModuleName());
        AnonymousClass0NN anonymousClass0NN = this.f2858E;
        if (anonymousClass0NN != null) {
            long now;
            str = anonymousClass0NN.f3555E;
            if (this.f2862I) {
                now = AwakeTimeSinceBootClock.get().now() - this.f2859F;
            } else {
                now = SystemClock.elapsedRealtime() - this.f2859F;
            }
            this.f2864K.m5867A(anonymousClass0EE, str, this.f2858E.m3309Q("click_point"));
            if (AppStateLogger.D()) {
                AppStateLogger.G(anonymousClass0EE.getModuleName(), true);
            }
            this.f2858E.m3298F("source_module", str).m3298F("dest_module", anonymousClass0EE.getModuleName()).m3294B("seq", this.f2863J).m3295C("nav_time_taken", now);
            if (anonymousClass0EE instanceof AnonymousClass0gg) {
                Map GIA = ((AnonymousClass0gg) anonymousClass0EE).GIA();
                if (GIA != null) {
                    for (String str2 : GIA.keySet()) {
                        this.f2858E.m3298F(str2, (String) GIA.get(str2));
                    }
                }
            }
            AnonymousClass0Sy.m4434C();
            if (!AnonymousClass0CB.m840J() && AnonymousClass0FZ.m1634B().f2177B.getBoolean("show_navigation_events", false)) {
                Context context = this.f2855B;
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf(this.f2863J);
                objArr[1] = this.f2858E.f3555E;
                objArr[2] = anonymousClass0EE.getModuleName();
                objArr[3] = this.f2858E.m3309Q("click_point");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(now);
                stringBuilder.append("ms");
                objArr[4] = stringBuilder.toString();
                Toast.makeText(context, AnonymousClass0IE.m2137E("%d. %s to %s via %s (%s)", objArr), 0).show();
            }
            this.f2863J++;
            this.f2858E.m3310R();
            this.f2860G = anonymousClass0EE.getModuleName();
            AnonymousClass0F4.f2058E.m1505B(new AnonymousClass14V(str, anonymousClass0EE.getModuleName(), m2397D()));
        } else {
            str = null;
        }
        this.f2858E = null;
        if (this.f2857D.contains(Integer.valueOf(System.identityHashCode(anonymousClass0EE)))) {
            this.f2857D.remove(Integer.valueOf(System.identityHashCode(anonymousClass0EE)));
            AnonymousClass14W anonymousClass14W = (AnonymousClass14W) this.f2861H.get(this.f2856C);
            if (anonymousClass14W == null) {
                anonymousClass14W = new AnonymousClass14W();
                this.f2861H.put(this.f2856C, anonymousClass14W);
            }
            Map linkedHashMap = new LinkedHashMap();
            if (str == null) {
                Map map = (Map) anonymousClass14W.f13903B.peekLast();
                str = map != null ? (String) map.get("module") : null;
            }
            AnonymousClass14W.m9197C(anonymousClass14W, anonymousClass0EE, str, linkedHashMap);
            anonymousClass14W.f13903B.add(linkedHashMap);
            while (anonymousClass14W.f13903B.size() > 10) {
                anonymousClass14W.f13903B.removeFirst();
            }
            anonymousClass14W.f13904C++;
            if (BreakpadManager.isActive() && !AnonymousClass0CB.m840J()) {
                BreakpadManager.setCustomData("nav_stack", anonymousClass14W.f13903B.toString(), new Object[0]);
            }
            return;
        }
        AnonymousClass14W anonymousClass14W2 = (AnonymousClass14W) this.f2861H.get(this.f2856C);
        if (anonymousClass14W2 != null && !anonymousClass14W2.f13903B.isEmpty()) {
            map = (Map) anonymousClass14W2.f13903B.getLast();
            if (AnonymousClass14W.m9196B(anonymousClass14W2, map, anonymousClass0EE)) {
                String str3 = (String) map.get("source_module");
                map.clear();
                AnonymousClass14W.m9197C(anonymousClass14W2, anonymousClass0EE, str3, map);
            }
        }
    }

    /* renamed from: I */
    public final void m2406I(Activity activity) {
        m2407J(activity, "button");
    }

    /* renamed from: J */
    public final void m2407J(Activity activity, String str) {
        AnonymousClass0EE C = AnonymousClass0iY.m6920C(activity);
        if (C != null) {
            m2408K(C, ((FragmentActivity) activity).mo382D().mo1456H(), str);
        }
    }

    /* renamed from: K */
    public final void m2408K(AnonymousClass0EE anonymousClass0EE, int i, String str) {
        m2409L(anonymousClass0EE, i, str, null);
    }

    /* renamed from: L */
    public final void m2409L(AnonymousClass0EE anonymousClass0EE, int i, String str, AnonymousClass0gl anonymousClass0gl) {
        AnonymousClass0Sy.m4434C();
        if (TextUtils.isEmpty(str)) {
            str = "button";
        }
        if (this.f2862I) {
            this.f2859F = AwakeTimeSinceBootClock.get().now();
        } else {
            this.f2859F = SystemClock.elapsedRealtime();
        }
        this.f2858E = AnonymousClass0NN.m3291B("navigation", anonymousClass0EE).m3298F("click_point", str).m3294B("nav_depth", i);
        if (anonymousClass0gl != null) {
            anonymousClass0gl.iB(this.f2858E);
        }
    }

    /* renamed from: M */
    public final void m2410M(Activity activity, String str, AnonymousClass0gl anonymousClass0gl) {
        AnonymousClass0EE C = AnonymousClass0iY.m6920C(activity);
        if (C != null) {
            m2409L(C, ((FragmentActivity) activity).mo382D().mo1456H(), str, anonymousClass0gl);
        }
    }
}
