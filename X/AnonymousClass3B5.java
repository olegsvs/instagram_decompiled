package X;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.instagram.common.ui.widget.draggable.DraggableContainer;

/* renamed from: X.3B5 */
public final class AnonymousClass3B5 implements OnLayoutChangeListener {
    /* renamed from: B */
    public final /* synthetic */ DraggableContainer f38651B;

    public AnonymousClass3B5(DraggableContainer draggableContainer) {
        this.f38651B = draggableContainer;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AnonymousClass3B2 anonymousClass3B2 = AnonymousClass3B1.f38644B;
        float dragCenterX = DraggableContainer.getDragCenterX(this.f38651B);
        float dragCenterY = DraggableContainer.getDragCenterY(this.f38651B);
        synchronized (anonymousClass3B2) {
            for (AnonymousClass3B3 ij : AnonymousClass3B2.m18847B(anonymousClass3B2, anonymousClass3B2.f38646C.getClass())) {
                ij.ij((View) anonymousClass3B2.f38646C.m18854A().get(), dragCenterX, dragCenterY);
            }
        }
        view.removeOnLayoutChangeListener(this);
    }
}
