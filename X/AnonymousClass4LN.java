package X;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;

/* renamed from: X.4LN */
public final class AnonymousClass4LN implements OnLayoutChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4LP f53003B;

    public AnonymousClass4LN(AnonymousClass4LP anonymousClass4LP) {
        this.f53003B = anonymousClass4LP;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.f53003B.f53018E.f54645P = null;
        int ordinal = this.f53003B.f53015B.ordinal();
        ReboundHorizontalScrollView reboundHorizontalScrollView = this.f53003B.f53018E.f54644O;
        reboundHorizontalScrollView.f38753I.L((double) ReboundHorizontalScrollView.m18882C(reboundHorizontalScrollView, ordinal));
        this.f53003B.f53018E.f54644O.getChildAt(ordinal).setAlpha(1.0f);
        AnonymousClass4LP anonymousClass4LP = this.f53003B;
        anonymousClass4LP.m23943B(anonymousClass4LP.f53015B);
        this.f53003B.f53018E.f54637H.setAlpha(0.0f);
    }
}
