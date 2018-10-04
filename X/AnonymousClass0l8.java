package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import com.instagram.feed.ui.views.CabooseLayout;

/* renamed from: X.0l8 */
public final class AnonymousClass0l8 implements OnScrollListener {
    /* renamed from: B */
    public final ListAdapter f9431B;
    /* renamed from: C */
    public int f9432C;
    /* renamed from: D */
    public CabooseLayout f9433D;
    /* renamed from: E */
    public final AnonymousClass0lY f9434E;
    /* renamed from: F */
    public boolean f9435F;
    /* renamed from: G */
    public final AnonymousClass6E9 f9436G;
    /* renamed from: H */
    private final DataSetObserver f9437H = new AnonymousClass1Ve(this);

    public AnonymousClass0l8(ListAdapter listAdapter, ViewGroup viewGroup, AnonymousClass6E9 anonymousClass6E9, AnonymousClass0lY anonymousClass0lY) {
        this.f9433D = (CabooseLayout) viewGroup;
        this.f9431B = listAdapter;
        this.f9434E = anonymousClass0lY;
        this.f9436G = anonymousClass6E9;
        this.f9431B.registerDataSetObserver(this.f9437H);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.m5859I(this, -1540011628);
        if (this.f9435F) {
            int i4 = (i2 - 1) + i;
            int i5 = this.f9432C;
            if (i4 >= i5) {
                if (i5 >= i) {
                    i5 -= i;
                    if (i5 >= 0 && i5 < absListView.getChildCount()) {
                        CabooseLayout cabooseLayout;
                        ViewPropertyAnimator viewPropertyAnimator;
                        LayoutParams layoutParams;
                        View childAt = absListView.getChildAt(i5);
                        int bottom = this.f9433D.getBottom() - childAt.getTop();
                        int width = childAt.getWidth();
                        if (bottom <= this.f9433D.getContentHeight()) {
                            if (bottom > 0) {
                                cabooseLayout = this.f9433D;
                                if (cabooseLayout.f13494D != null && (cabooseLayout.f13497G == AnonymousClass12E.HIDING || cabooseLayout.f13497G == AnonymousClass12E.HIDDEN)) {
                                    i5 = 0;
                                    while (i5 >= 0 && i5 < cabooseLayout.getChildCount() - 1) {
                                        cabooseLayout.getChildAt(i5).setVisibility(0);
                                        i5++;
                                    }
                                    viewPropertyAnimator = cabooseLayout.f13492B;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.setListener(null);
                                        cabooseLayout.f13492B.cancel();
                                    }
                                    viewPropertyAnimator = cabooseLayout.f13494D.animate().alpha(1.0f);
                                    cabooseLayout.f13495E = viewPropertyAnimator;
                                    viewPropertyAnimator.setListener(cabooseLayout.f13496F);
                                    cabooseLayout.f13495E.start();
                                }
                                layoutParams = (LayoutParams) this.f9433D.getLayoutParams();
                                layoutParams.width = width;
                                layoutParams.height = bottom;
                                this.f9433D.setLayoutParams(layoutParams);
                            }
                        }
                        cabooseLayout = this.f9433D;
                        if (cabooseLayout.f13494D != null && (cabooseLayout.f13497G == AnonymousClass12E.SHOWING || cabooseLayout.f13497G == AnonymousClass12E.SHOWN)) {
                            int i6 = 0;
                            while (i6 >= 0 && i6 < cabooseLayout.getChildCount() - 1) {
                                cabooseLayout.getChildAt(i6).setVisibility(4);
                                i6++;
                            }
                            viewPropertyAnimator = cabooseLayout.f13495E;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                cabooseLayout.f13495E.cancel();
                            }
                            viewPropertyAnimator = cabooseLayout.f13494D.animate().alpha(0.0f);
                            cabooseLayout.f13492B = viewPropertyAnimator;
                            viewPropertyAnimator.setListener(cabooseLayout.f13493C);
                            cabooseLayout.f13492B.start();
                        }
                        layoutParams = (LayoutParams) this.f9433D.getLayoutParams();
                        layoutParams.width = width;
                        layoutParams.height = bottom;
                        this.f9433D.setLayoutParams(layoutParams);
                    }
                    AnonymousClass0cQ.m5858H(this, -525751563, I);
                    return;
                }
            }
        }
        CabooseLayout cabooseLayout2 = this.f9433D;
        if (cabooseLayout2 != null) {
            cabooseLayout2.setVisibility(CabooseLayout.getHiddenVisibility(cabooseLayout2));
            ViewPropertyAnimator viewPropertyAnimator2 = cabooseLayout2.f13495E;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.setListener(null);
                cabooseLayout2.f13495E.cancel();
            }
            viewPropertyAnimator2 = cabooseLayout2.f13492B;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.setListener(null);
                cabooseLayout2.f13492B.cancel();
            }
            cabooseLayout2.f13497G = AnonymousClass12E.HIDDEN;
        }
        AnonymousClass0cQ.m5858H(this, 417217725, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AnonymousClass0cQ.m5858H(this, 518055484, AnonymousClass0cQ.m5859I(this, -1598452716));
    }
}
