package X;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.instagram.archive.fragment.SelectHighlightsCoverFragment;

/* renamed from: X.49Q */
public final class AnonymousClass49Q implements OnLayoutChangeListener {
    /* renamed from: B */
    public final /* synthetic */ SelectHighlightsCoverFragment f50917B;

    public AnonymousClass49Q(SelectHighlightsCoverFragment selectHighlightsCoverFragment) {
        this.f50917B = selectHighlightsCoverFragment;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        i3 /= 2;
        this.f50917B.mPunchedOverlayView.m14428A(new AnonymousClass2V2(i3, i4 / 2, (float) i3));
    }
}
