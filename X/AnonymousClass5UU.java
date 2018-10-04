package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ListAdapter;
import com.facebook.C0164R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.5UU */
public final class AnonymousClass5UU extends AnonymousClass0Ie implements AnonymousClass0IS, AnonymousClass3B3 {
    /* renamed from: B */
    public final List f64891B;
    /* renamed from: C */
    public final Handler f64892C = new AnonymousClass4Uj(this, Looper.getMainLooper());
    /* renamed from: D */
    public View f64893D;
    /* renamed from: E */
    public long f64894E;
    /* renamed from: F */
    private final Executor f64895F;
    /* renamed from: G */
    private boolean f64896G;
    /* renamed from: H */
    private int f64897H;
    /* renamed from: I */
    private final Rect f64898I = new Rect();
    /* renamed from: J */
    private ContextThemeWrapper f64899J;
    /* renamed from: K */
    private AnonymousClass0Cm f64900K;

    public final String getModuleName() {
        return "filter_list";
    }

    public AnonymousClass5UU() {
        AnonymousClass0Kq B = AnonymousClass0Kq.B();
        B.f3132F = "FilterList";
        this.f64895F = B.A();
        this.f64891B = new ArrayList();
    }

    /* renamed from: A */
    public final void m27021A(View view) {
        if (!AnonymousClass3B1.f38644B.D()) {
            Rect rect = new Rect();
            Point point = new Point();
            view.getGlobalVisibleRect(rect, point);
            rect.top = point.y;
            rect.left = point.x;
            AnonymousClass3B1.f38644B.F(new AnonymousClass3yk(view, (float) rect.left, (float) rect.top));
        }
    }

    /* renamed from: B */
    public static void m27015B(AnonymousClass5UU anonymousClass5UU) {
        AnonymousClass3Ci anonymousClass3Ci = new AnonymousClass3Ci();
        anonymousClass3Ci.f39097B = anonymousClass5UU.f64891B;
        AnonymousClass0GG.B(anonymousClass5UU.f64895F, new AnonymousClass4Ui(anonymousClass5UU, anonymousClass3Ci), -208962388);
    }

    /* renamed from: C */
    public static boolean m27016C(AnonymousClass5UU anonymousClass5UU, View view, float f) {
        Object obj = anonymousClass5UU.getListView().getLastVisiblePosition() == anonymousClass5UU.getListAdapter().getCount() - 1 ? 1 : null;
        Object obj2 = anonymousClass5UU.getListView().getChildAt(anonymousClass5UU.getListView().getChildCount() - 1).getBottom() != anonymousClass5UU.getListView().getHeight() ? 1 : null;
        if (f + ((float) (view.getHeight() / 2)) > ((float) anonymousClass5UU.getListView().getHeight())) {
            if (obj == null) {
                return true;
            }
            if (obj2 != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public static boolean m27017D(AnonymousClass5UU anonymousClass5UU, View view, float f) {
        if (f - ((float) (view.getHeight() / 2)) >= 0.0f) {
            return false;
        }
        if (anonymousClass5UU.getListView().getFirstVisiblePosition() == 0 && anonymousClass5UU.getListView().getChildAt(0).getTop() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public static void m27018E(AnonymousClass5UU anonymousClass5UU, float f) {
        int F = anonymousClass5UU.m27019F(f);
        int firstVisiblePosition = anonymousClass5UU.f64897H - anonymousClass5UU.getListView().getFirstVisiblePosition();
        if (firstVisiblePosition > F) {
            while (firstVisiblePosition >= F) {
                anonymousClass5UU.m27020G(anonymousClass5UU.f64893D, firstVisiblePosition);
                firstVisiblePosition--;
            }
            return;
        }
        while (firstVisiblePosition <= F) {
            anonymousClass5UU.m27020G(anonymousClass5UU.f64893D, firstVisiblePosition);
            firstVisiblePosition++;
        }
    }

    /* renamed from: F */
    private int m27019F(float f) {
        int childCount = getListView().getChildCount() - 1;
        int i = 0;
        int i2 = 0;
        while (i <= childCount) {
            i2 = (i + childCount) >>> 1;
            int top = getListView().getChildAt(i2).getTop();
            if (f >= ((float) top)) {
                if (f <= ((float) (top + getListView().getChildAt(i2).getHeight()))) {
                    break;
                }
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
        }
        return i2;
    }

    /* renamed from: G */
    private void m27020G(View view, int i) {
        View childAt = getListView().getChildAt(i);
        i += getListView().getFirstVisiblePosition();
        if (childAt != view) {
            AnonymousClass4Uh anonymousClass4Uh = (AnonymousClass4Uh) getListAdapter();
            this.f64891B.add(i, (AnonymousClass3Cj) this.f64891B.remove(this.f64897H));
            anonymousClass4Uh.f54647B.add(i, (AnonymousClass3Cj) anonymousClass4Uh.f54647B.remove(this.f64897H));
            AnonymousClass4Up.B((AnonymousClass4Uo) view.getTag(), this.f64900K, (AnonymousClass3Cj) this.f64891B.get(this.f64897H), this);
            AnonymousClass4Up.B((AnonymousClass4Uo) childAt.getTag(), this.f64900K, (AnonymousClass3Cj) this.f64891B.get(i), this);
            view.setVisibility(0);
            childAt.clearAnimation();
            childAt.setVisibility(4);
            Animation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (this.f64897H > i ? -view.getHeight() : view.getHeight()), 0.0f);
            translateAnimation.setDuration(300);
            view.startAnimation(translateAnimation);
            AnonymousClass3B4 anonymousClass3B4 = AnonymousClass3B1.f38644B.f38646C;
            synchronized (anonymousClass3B4) {
                anonymousClass3B4.f38650D = new WeakReference(childAt);
            }
        }
        this.f64893D = childAt;
        this.f64897H = i;
    }

    public final void Yj(View view, boolean z) {
        this.f64893D = null;
        int positionForView = getListView().getPositionForView(view);
        AnonymousClass0rF.B((AnonymousClass4Uh) getListAdapter(), 1360692773);
        AnonymousClass3Cj anonymousClass3Cj = (AnonymousClass3Cj) getListAdapter().getItem(positionForView);
        AnonymousClass3Ch.B(AnonymousClass0g3.FilterDragPlace.A(), positionForView, anonymousClass3Cj.f39098B.f41615E, anonymousClass3Cj.f39100D, "filter_tray_manager_view");
        view.setVisibility(0);
        AnonymousClass5UU.m27015B(this);
    }

    public final void ij(View view, float f, float f2) {
        this.f64896G = true;
        getListView().getGlobalVisibleRect(this.f64898I);
        int F = m27019F(f2 - ((float) this.f64898I.top));
        AnonymousClass3Cj anonymousClass3Cj = (AnonymousClass3Cj) getListAdapter().getItem(F);
        AnonymousClass3Ch.B(AnonymousClass0g3.FilterDragStart.A(), F, anonymousClass3Cj.f39098B.f41615E, anonymousClass3Cj.f39100D, "filter_tray_manager_view");
        this.f64893D = view;
        this.f64897H = F + getListView().getFirstVisiblePosition();
        view.setVisibility(4);
    }

    public final void nj() {
        this.f64892C.removeCallbacksAndMessages(null);
    }

    public final boolean onBackPressed() {
        if (this.f64896G) {
            AnonymousClass3Ch.D(this.f64891B);
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1267280710);
        super.onCreate(bundle);
        this.f64900K = ((AnonymousClass0PI) getContext()).rT();
        if (bundle != null) {
            this.f64896G = bundle.getBoolean("FilterListFragment.FILTERS_REORDERED");
        }
        this.f64899J = AnonymousClass0G5.C(getContext(), C0164R.attr.filterListTheme);
        ListAdapter anonymousClass4Uh = new AnonymousClass4Uh(this.f64899J, this.f64900K, this);
        this.f64891B.clear();
        for (AnonymousClass3Cj anonymousClass3Cj : AnonymousClass3Cl.C()) {
            if (anonymousClass3Cj.f39098B.f41614D != 0) {
                this.f64891B.add(new AnonymousClass3Cj(anonymousClass3Cj.f39098B, anonymousClass3Cj.f39101E, anonymousClass3Cj.f39099C));
            }
        }
        Collection collection = this.f64891B;
        anonymousClass4Uh.f54647B.clear();
        anonymousClass4Uh.f54647B.addAll(collection);
        AnonymousClass4Uh.B(anonymousClass4Uh);
        setListAdapter(anonymousClass4Uh);
        AnonymousClass0cQ.G(this, -1217706677, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -292095538);
        View inflate = layoutInflater.cloneInContext(this.f64899J).inflate(C0164R.layout.fragment_filter_list, viewGroup, false);
        AnonymousClass0cQ.G(this, 16151018, F);
        return inflate;
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1194679296);
        super.onPause();
        AnonymousClass3B1.f38644B.E(AnonymousClass3yk.class, this);
        AnonymousClass0cQ.G(this, 1695974929, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -137332426);
        super.onResume();
        AnonymousClass3B1.f38644B.A(AnonymousClass3yk.class, this);
        AnonymousClass0cQ.G(this, -1497359730, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("FilterListFragment.FILTERS_REORDERED", this.f64896G);
    }

    public final void pj(View view, float f, float f2, boolean z, boolean z2) {
        int i;
        f2 -= (float) this.f64898I.top;
        AnonymousClass5UU.m27018E(this, f2);
        if (AnonymousClass5UU.m27016C(this, this.f64893D, f2)) {
            i = 2;
            if (this.f64892C.hasMessages(2)) {
                return;
            }
        } else if (AnonymousClass5UU.m27017D(this, this.f64893D, f2)) {
            i = 1;
            if (this.f64892C.hasMessages(1)) {
                return;
            }
        } else {
            this.f64892C.removeCallbacksAndMessages(null);
            return;
        }
        this.f64894E = System.currentTimeMillis();
        Handler handler = this.f64892C;
        handler.sendMessage(handler.obtainMessage(i, Integer.valueOf((int) f2)));
    }
}
