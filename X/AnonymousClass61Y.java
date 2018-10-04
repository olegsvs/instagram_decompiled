package X;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.ScrollView;

/* renamed from: X.61Y */
public final class AnonymousClass61Y implements OnLayoutChangeListener {
    /* renamed from: B */
    public final /* synthetic */ ScrollView f70994B;

    public AnonymousClass61Y(AnonymousClass6FG anonymousClass6FG, ScrollView scrollView) {
        this.f70994B = scrollView;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f70994B.postDelayed(new AnonymousClass61X(this), 50);
    }
}
