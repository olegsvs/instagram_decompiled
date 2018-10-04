package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.4ZO */
public final class AnonymousClass4ZO implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Yt f55355B;
    /* renamed from: C */
    public final /* synthetic */ String f55356C;
    /* renamed from: D */
    public final /* synthetic */ int f55357D;
    /* renamed from: E */
    public final /* synthetic */ DirectShareTarget f55358E;

    public AnonymousClass4ZO(AnonymousClass4Yt anonymousClass4Yt, int i, DirectShareTarget directShareTarget, String str) {
        this.f55355B = anonymousClass4Yt;
        this.f55357D = i;
        this.f55358E = directShareTarget;
        this.f55356C = str;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1013284215);
        this.f55355B.yz(this.f55357D, this.f55358E, this.f55356C);
        AnonymousClass0cQ.L(this, -648471776, M);
    }
}
