package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.ListView;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.640 */
public final class AnonymousClass640 extends AnonymousClass0VA {
    /* renamed from: B */
    public final AnonymousClass1Rs f71397B;
    /* renamed from: C */
    public final Map f71398C = new HashMap();
    /* renamed from: D */
    public final AnonymousClass0Ie f71399D;
    /* renamed from: E */
    public final Handler f71400E = new AnonymousClass63w(this, Looper.getMainLooper());
    /* renamed from: F */
    public ListView f71401F;
    /* renamed from: G */
    public final Map f71402G = new HashMap();
    /* renamed from: H */
    public final List f71403H = new ArrayList();
    /* renamed from: I */
    public final Set f71404I = new HashSet();
    /* renamed from: J */
    public final AnonymousClass0Cm f71405J;

    public AnonymousClass640(AnonymousClass0Ie anonymousClass0Ie, AnonymousClass1Rs anonymousClass1Rs, AnonymousClass0Cm anonymousClass0Cm) {
        this.f71399D = anonymousClass0Ie;
        this.f71397B = anonymousClass1Rs;
        this.f71405J = anonymousClass0Cm;
    }

    /* renamed from: B */
    public static void m28854B(AnonymousClass640 anonymousClass640) {
        Iterator it = anonymousClass640.f71403H.iterator();
        while (it.hasNext()) {
            AnonymousClass63z anonymousClass63z = (AnonymousClass63z) it.next();
            it.remove();
            AnonymousClass0MI D = AnonymousClass0Jd.f2931B.M(anonymousClass640.f71405J).D(anonymousClass63z.f71395B);
            if (D != null) {
                int qV = anonymousClass640.f71397B.qV(D);
                int i = -1;
                if (qV >= 0) {
                    AnonymousClass2MJ anonymousClass2MJ = ((AnonymousClass1a4) anonymousClass640.f71397B.getItem(qV)).f20303B;
                    for (int i2 = 0; i2 < anonymousClass2MJ.C(); i2++) {
                        if (((AnonymousClass0MI) anonymousClass2MJ.A(i2)).equals(D)) {
                            AnonymousClass0Pm anonymousClass0Pm = D.f3388U;
                            anonymousClass0Pm.f4153G = anonymousClass63z.f71396C;
                            anonymousClass0Pm.f4152F = SystemClock.elapsedRealtime();
                            i = i2;
                            break;
                        }
                    }
                }
                ListView listView = anonymousClass640.f71401F;
                if (listView != null && qV >= listView.getFirstVisiblePosition() && qV <= anonymousClass640.f71401F.getLastVisiblePosition() && i >= 0) {
                    ListView listView2 = anonymousClass640.f71401F;
                    View childAt = listView2.getChildAt(qV - listView2.getFirstVisiblePosition());
                    if (childAt.getTag() instanceof AnonymousClass64N) {
                        AnonymousClass64N anonymousClass64N = (AnonymousClass64N) childAt.getTag();
                        anonymousClass64N.f71442C[i].f71431B.setSource(anonymousClass640.f71399D.getModuleName());
                        anonymousClass64N.f71442C[i].f71431B.setUrlWithoutPlaceholder(anonymousClass63z.f71396C);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: C */
    public static void m28855C(AnonymousClass640 anonymousClass640, String str, int i) {
        AnonymousClass0MI D = AnonymousClass0Jd.f2931B.M(anonymousClass640.f71405J).D(str);
        if (D != null) {
            int qV = anonymousClass640.f71397B.qV(D);
            int i2 = -1;
            AnonymousClass64D EJ = anonymousClass640.f71397B.EJ(D);
            if (qV >= 0) {
                AnonymousClass2MJ anonymousClass2MJ = ((AnonymousClass1a4) anonymousClass640.f71397B.getItem(qV)).f20303B;
                int i3 = 0;
                while (i3 < anonymousClass2MJ.C()) {
                    if (((AnonymousClass0MI) anonymousClass2MJ.A(i3)).equals(D)) {
                        if (i == C0164R.string.live_video_ended) {
                            D.f3388U.f4149C = AnonymousClass0Pq.STOPPED;
                        } else if (i == C0164R.string.live_video_reduced_visibility) {
                            EJ.f71422B = true;
                        }
                        i2 = i3;
                    } else {
                        i3++;
                    }
                }
            }
            ListView listView = anonymousClass640.f71401F;
            if (listView == null || qV < listView.getFirstVisiblePosition() || qV > anonymousClass640.f71401F.getLastVisiblePosition() || i2 < 0) {
                EJ.f71423C = 0;
                anonymousClass640.f71397B.F(D, false);
                return;
            }
            ListView listView2 = anonymousClass640.f71401F;
            AnonymousClass64M.m28862D(((AnonymousClass64N) listView2.getChildAt(qV - listView2.getFirstVisiblePosition()).getTag()).f71442C[i2], i);
            if (EJ.f71423C == -1) {
                EJ.f71423C = SystemClock.elapsedRealtime();
                anonymousClass640.f71397B.F(D, true);
            }
        }
    }

    public final void St() {
        this.f71400E.removeCallbacksAndMessages(null);
    }

    public final void gi() {
        this.f71401F = null;
    }

    public final void gx() {
        this.f71400E.sendEmptyMessageDelayed(0, 1000);
        if (!this.f71403H.isEmpty()) {
            this.f71400E.sendEmptyMessageDelayed(1, 800);
        }
    }

    public final void wh(View view) {
        this.f71401F = (ListView) view.findViewById(16908298);
    }
}
