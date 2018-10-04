package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* renamed from: X.1o7 */
public final class AnonymousClass1o7 extends AnonymousClass0rv {
    /* renamed from: E */
    private static final int[] f22893E = new int[]{16843284};
    /* renamed from: B */
    public final Rect f22894B = new Rect();
    /* renamed from: C */
    public Drawable f22895C;
    /* renamed from: D */
    public int f22896D;

    public AnonymousClass1o7(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f22893E);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f22895C = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        if (i != 0) {
            if (i != 1) {
                throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
            }
        }
        this.f22896D = i;
    }

    /* renamed from: A */
    public final void m13230A(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        Drawable drawable = this.f22895C;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (this.f22896D == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    /* renamed from: B */
    public final void m13231B(Canvas canvas, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.f22895C != null) {
            int paddingLeft;
            int width;
            int childCount;
            int i;
            View childAt;
            int round;
            if (this.f22896D == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    paddingLeft = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    paddingLeft = 0;
                }
                childCount = recyclerView.getChildCount();
                for (i = 0; i < childCount; i++) {
                    childAt = recyclerView.getChildAt(i);
                    RecyclerView.M(childAt, this.f22894B);
                    round = this.f22894B.bottom + Math.round(childAt.getTranslationY());
                    this.f22895C.setBounds(paddingLeft, round - this.f22895C.getIntrinsicHeight(), width, round);
                    this.f22895C.draw(canvas);
                }
            } else {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    paddingLeft = recyclerView.getPaddingTop();
                    width = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                    canvas.clipRect(recyclerView.getPaddingLeft(), paddingLeft, recyclerView.getWidth() - recyclerView.getPaddingRight(), width);
                } else {
                    width = recyclerView.getHeight();
                    paddingLeft = 0;
                }
                childCount = recyclerView.getChildCount();
                for (i = 0; i < childCount; i++) {
                    childAt = recyclerView.getChildAt(i);
                    recyclerView.getLayoutManager();
                    RecyclerView.M(childAt, this.f22894B);
                    round = this.f22894B.right + Math.round(childAt.getTranslationX());
                    this.f22895C.setBounds(round - this.f22895C.getIntrinsicWidth(), paddingLeft, round, width);
                    this.f22895C.draw(canvas);
                }
            }
            canvas.restore();
        }
    }
}
