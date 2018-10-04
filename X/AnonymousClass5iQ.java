package X;

import android.graphics.RectF;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;

/* renamed from: X.5iQ */
public final class AnonymousClass5iQ implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ GenericSurveyFragment f68383B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0lG f68384C;

    public AnonymousClass5iQ(GenericSurveyFragment genericSurveyFragment, AnonymousClass0lG anonymousClass0lG) {
        this.f68383B = genericSurveyFragment;
        this.f68384C = anonymousClass0lG;
    }

    public final void run() {
        if (this.f68383B.isResumed()) {
            RectF L;
            RectF rectF;
            View findViewById = this.f68383B.f73020H.findViewById(C0164R.id.reel_preview_container);
            if (findViewById != null) {
                AnonymousClass4rp anonymousClass4rp = (AnonymousClass4rp) findViewById.getTag();
                if (anonymousClass4rp != null) {
                    L = AnonymousClass0Nm.L(anonymousClass4rp.f57957C);
                    rectF = new RectF(L.centerX(), L.centerY(), L.centerX(), L.centerY());
                    this.f68384C.D(L, rectF, null);
                }
            }
            L = null;
            rectF = null;
            this.f68384C.D(L, rectF, null);
        }
    }
}
