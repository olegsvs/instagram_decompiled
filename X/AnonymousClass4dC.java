package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogChronologicalFragment;

/* renamed from: X.4dC */
public final class AnonymousClass4dC implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ DirectVisualMessageActionLogChronologicalFragment f55826B;

    public AnonymousClass4dC(DirectVisualMessageActionLogChronologicalFragment directVisualMessageActionLogChronologicalFragment) {
        this.f55826B = directVisualMessageActionLogChronologicalFragment;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -459038364);
        AnonymousClass0IJ anonymousClass0IJ = this.f55826B;
        anonymousClass0IJ.schedule(anonymousClass0IJ.f65434B.m24614A());
        this.f55826B.mSpinner.setOnClickListener(null);
        AnonymousClass0cQ.L(this, -60993201, M);
    }
}
