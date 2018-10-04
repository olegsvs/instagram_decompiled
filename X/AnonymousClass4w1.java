package X;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.instagram.igtv.viewer.IGTVViewerFragment;

/* renamed from: X.4w1 */
public final class AnonymousClass4w1 implements OnLayoutChangeListener {
    /* renamed from: B */
    public final /* synthetic */ IGTVViewerFragment f58613B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1W5 f58614C;

    public AnonymousClass4w1(IGTVViewerFragment iGTVViewerFragment, AnonymousClass1W5 anonymousClass1W5) {
        this.f58613B = iGTVViewerFragment;
        this.f58614C = anonymousClass1W5;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f58613B.mDrawerContent.removeOnLayoutChangeListener(this);
        IGTVViewerFragment.m27463K(this.f58613B, this.f58614C);
    }
}
