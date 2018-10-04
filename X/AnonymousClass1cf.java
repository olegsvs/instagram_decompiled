package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ListView;
import com.instagram.ui.listview.StickyHeaderListView;

/* renamed from: X.1cf */
public final class AnonymousClass1cf implements AnonymousClass1cg {
    /* renamed from: B */
    public final ListView f20652B;
    /* renamed from: C */
    public final StickyHeaderListView f20653C;
    /* renamed from: D */
    public final Rect f20654D = new Rect();
    /* renamed from: E */
    private final Rect f20655E = new Rect();
    /* renamed from: F */
    private final Rect f20656F = new Rect();

    public AnonymousClass1cf(StickyHeaderListView stickyHeaderListView, ListView listView) {
        this.f20652B = listView;
        this.f20653C = stickyHeaderListView;
    }

    public final int AM() {
        this.f20654D.setEmpty();
        if (this.f20652B.getGlobalVisibleRect(this.f20654D)) {
            Rect rect = this.f20654D;
            rect.top = Math.max(rect.top, this.f20653C.getTopChromeArea().bottom);
        }
        int lastVisiblePosition = this.f20652B.getLastVisiblePosition();
        for (int firstVisiblePosition = this.f20652B.getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
            int i;
            View gH = gH(firstVisiblePosition);
            if (gH == null) {
                i = 0;
            } else {
                i = UU(gH);
            }
            if (i > 0) {
                return firstVisiblePosition;
            }
        }
        return -1;
    }

    public final void EQA(OnPreDrawListener onPreDrawListener) {
        this.f20653C.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
    }

    public final int UU(View view) {
        return (view.getGlobalVisibleRect(this.f20656F) && this.f20655E.setIntersect(this.f20654D, this.f20656F)) ? this.f20655E.height() : 0;
    }

    public final int WU(View view) {
        if (view.getGlobalVisibleRect(this.f20656F)) {
            this.f20656F.width();
        }
        return 0;
    }

    public final View gH(int i) {
        i -= this.f20652B.getFirstVisiblePosition();
        return (i <= -1 || i > this.f20652B.getLastVisiblePosition()) ? null : this.f20652B.getChildAt(i);
    }

    public final int iN() {
        return this.f20652B.getLastVisiblePosition();
    }

    public final void jJA(OnPreDrawListener onPreDrawListener) {
        this.f20653C.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
    }
}
