package X;

import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.creation.base.ui.filterview.FilterViewContainer;

/* renamed from: X.3DC */
public final class AnonymousClass3DC implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ PunchedOverlayView f39156B;

    public AnonymousClass3DC(FilterViewContainer filterViewContainer, PunchedOverlayView punchedOverlayView) {
        this.f39156B = punchedOverlayView;
    }

    public final void run() {
        int width = this.f39156B.getWidth() / 2;
        this.f39156B.m14428A(new AnonymousClass2V2(width, width, (float) width));
    }
}
