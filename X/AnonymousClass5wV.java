package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.5wV */
public final class AnonymousClass5wV implements OnGlobalLayoutListener {
    /* renamed from: B */
    public final /* synthetic */ Activity f70176B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0lG f70177C;
    /* renamed from: D */
    public final /* synthetic */ View f70178D;

    public AnonymousClass5wV(ReelViewerFragment reelViewerFragment, View view, Activity activity, AnonymousClass0lG anonymousClass0lG) {
        this.f70178D = view;
        this.f70176B = activity;
        this.f70177C = anonymousClass0lG;
    }

    public final void onGlobalLayout() {
        this.f70178D.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int J = AnonymousClass0Nm.J(this.f70176B) / 2;
        float f = (float) J;
        float I = (float) AnonymousClass0Nm.I(this.f70176B);
        this.f70177C.D(null, new RectF(f, I, f, I), null);
    }
}
