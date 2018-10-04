package X;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

/* renamed from: X.4l1 */
public final class AnonymousClass4l1 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Vp f56851B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass4l2 f56852C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass4lD f56853D;

    public AnonymousClass4l1(AnonymousClass4l2 anonymousClass4l2, AnonymousClass5Vp anonymousClass5Vp, AnonymousClass4lD anonymousClass4lD) {
        this.f56852C = anonymousClass4l2;
        this.f56851B = anonymousClass5Vp;
        this.f56853D = anonymousClass4lD;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 184056163);
        boolean isChecked = ((CheckBox) this.f56852C.f56855C.A()).isChecked() ^ 1;
        if (this.f56851B.b(this.f56853D.f56883E, isChecked)) {
            this.f56853D.f56880B = isChecked;
            ((CheckBox) this.f56852C.f56855C.A()).setChecked(isChecked);
        }
        AnonymousClass0cQ.L(this, -1477174834, M);
    }
}
