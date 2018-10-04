package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.reels.fragment.ReelDashboardFragment;

/* renamed from: X.5tv */
public final class AnonymousClass5tv extends BaseAdapter {
    /* renamed from: B */
    public final ReelDashboardFragment f69777B;
    /* renamed from: C */
    public final int f69778C;
    /* renamed from: D */
    public AnonymousClass14t f69779D;
    /* renamed from: E */
    public final int f69780E;
    /* renamed from: F */
    private final boolean f69781F;

    public final long getItemId(int i) {
        return 0;
    }

    public AnonymousClass5tv(int i, float f, boolean z, ReelDashboardFragment reelDashboardFragment) {
        this.f69780E = i;
        this.f69778C = (int) (((float) i) / f);
        this.f69781F = z;
        this.f69777B = reelDashboardFragment;
    }

    /* renamed from: B */
    public static void m28612B(AnonymousClass5tu anonymousClass5tu, int i, int i2) {
        Drawable E = AnonymousClass0Ca.E(anonymousClass5tu.f69776C.getContext(), C0164R.drawable.filter_shadow);
        Rect rect = new Rect();
        E.getPadding(rect);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) anonymousClass5tu.f69775B.getLayoutParams();
        marginLayoutParams.width = (i + rect.left) + rect.right;
        marginLayoutParams.height = (i2 + rect.top) + rect.bottom;
        marginLayoutParams.topMargin = (int) (((float) (rect.bottom - rect.top)) / 2.0f);
        AnonymousClass0eY.E(marginLayoutParams, Math.round(((float) (rect.right - rect.left)) / 2.0f));
        anonymousClass5tu.f69775B.setLayoutParams(marginLayoutParams);
        anonymousClass5tu.f69775B.setBackground(E);
    }

    /* renamed from: C */
    public static void m28613C(AnonymousClass5tu anonymousClass5tu, int i, int i2) {
        anonymousClass5tu.f69776C.getLayoutParams().width = i;
        anonymousClass5tu.f69776C.getLayoutParams().height = i2;
    }

    /* renamed from: D */
    public static boolean m28614D(AnonymousClass0Pj anonymousClass0Pj) {
        boolean z = true;
        if (!anonymousClass0Pj.pW()) {
            return anonymousClass0Pj.r() ^ true;
        }
        if (anonymousClass0Pj.f4131C.G() == null) {
            z = false;
        }
        return z;
    }

    /* renamed from: E */
    private int m28615E() {
        AnonymousClass14t anonymousClass14t = this.f69779D;
        return anonymousClass14t == null ? 0 : anonymousClass14t.G().size();
    }

    public final int getCount() {
        return m28615E() + this.f69781F;
    }

    public final Object getItem(int i) {
        return i < m28615E() ? this.f69779D.G().get(i) : null;
    }

    public final int getItemViewType(int i) {
        return i < m28615E() ? 0 : 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass5tu anonymousClass6Ej;
        switch (getItemViewType(i)) {
            case 0:
                int i2 = 0;
                if (view == null) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.layout_reel_dashboard_item, viewGroup, false);
                    anonymousClass6Ej = new AnonymousClass6Ej((FrameLayout) view);
                    AnonymousClass5tv.m28613C(anonymousClass6Ej, this.f69780E, this.f69778C);
                    AnonymousClass5tv.m28612B(anonymousClass6Ej, this.f69780E, this.f69778C);
                    view.setTag(anonymousClass6Ej);
                }
                AnonymousClass6Ej anonymousClass6Ej2 = (AnonymousClass6Ej) view.getTag();
                AnonymousClass0Pj anonymousClass0Pj = (AnonymousClass0Pj) getItem(i);
                view.setOnClickListener(new AnonymousClass5tr(this, i));
                if (AnonymousClass5tv.m28614D(anonymousClass0Pj)) {
                    anonymousClass6Ej2.f73201B.setUrl(anonymousClass0Pj.R(this.f69780E));
                } else {
                    anonymousClass6Ej2.f73201B.A();
                }
                anonymousClass6Ej2.f73202C.setText(String.valueOf(anonymousClass0Pj.X()));
                anonymousClass6Ej2.f73202C.setCompoundDrawablesWithIntrinsicBounds(anonymousClass6Ej2.f73203D, null, null, null);
                view.setOnTouchListener(new AnonymousClass5ts(this));
                AnonymousClass0OA anonymousClass0OA = anonymousClass0Pj.f4135G;
                Object obj = (anonymousClass0Pj.pW() && (anonymousClass0Pj.f4131C.f4149C.C() || anonymousClass0Pj.f4131C.f4149C.D())) ? 1 : null;
                if (obj != null) {
                    anonymousClass6Ej2.f69776C.setForeground(AnonymousClass0Ca.E(viewGroup.getContext(), C0164R.drawable.reel_dashboard_item_outline));
                } else if (anonymousClass0OA == null || anonymousClass0OA.K()) {
                    anonymousClass6Ej2.f69776C.setForeground(null);
                    TextView textView = anonymousClass6Ej2.f73202C;
                    if (anonymousClass0Pj.X() == 0) {
                        i2 = 4;
                    }
                    textView.setVisibility(i2);
                } else {
                    Drawable E;
                    Context context = viewGroup.getContext();
                    if (anonymousClass0OA.bB && ((Boolean) AnonymousClass0CC.xf.G()).booleanValue()) {
                        E = AnonymousClass0Ca.E(context, C0164R.drawable.reel_dashboard_item_outline_offline);
                    } else {
                        E = AnonymousClass0Ca.E(context, C0164R.drawable.reel_dashboard_item_outline);
                    }
                    anonymousClass6Ej2.f69776C.setForeground(E);
                    anonymousClass6Ej2.f73202C.setVisibility(4);
                }
                return view;
            case 1:
                if (view == null) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.layout_reel_dashboard_add_item, viewGroup, false);
                    anonymousClass6Ej = new AnonymousClass6Ei((FrameLayout) view);
                    AnonymousClass5tv.m28613C(anonymousClass6Ej, this.f69780E, this.f69778C);
                    AnonymousClass5tv.m28612B(anonymousClass6Ej, this.f69780E, this.f69778C);
                    view.setTag(anonymousClass6Ej);
                }
                view.setOnClickListener(new AnonymousClass5tt(this, i));
                return view;
            default:
                throw new IllegalArgumentException("Unexpected view type");
        }
    }
}
