package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;

/* renamed from: X.5Gs */
public final class AnonymousClass5Gs implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Gt f61721B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Cm f61722C;

    public AnonymousClass5Gs(AnonymousClass5Gt anonymousClass5Gt, AnonymousClass0Cm anonymousClass0Cm) {
        this.f61721B = anonymousClass5Gt;
        this.f61722C = anonymousClass0Cm;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1002524176);
        DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(this.f61721B.f61724C, this.f61721B.f61725D, this.f61721B.f61723B, this.f61722C, null);
        AnonymousClass0cQ.L(this, 1691086608, M);
    }
}
