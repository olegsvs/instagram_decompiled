package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.59J */
public final class AnonymousClass59J implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass59L f60579B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2E3 f60580C;

    public AnonymousClass59J(AnonymousClass59L anonymousClass59L, AnonymousClass2E3 anonymousClass2E3) {
        this.f60579B = anonymousClass59L;
        this.f60580C = anonymousClass2E3;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 499589859);
        if (this.f60579B.f60586E != null) {
            AnonymousClass5J9 anonymousClass5J9 = this.f60579B.f60586E;
            String B = this.f60580C.B();
            String A = this.f60580C.A();
            anonymousClass5J9.f4340k = true;
            ReelViewerFragment.V(anonymousClass5J9, anonymousClass5J9.c(), new AnonymousClass5x0(B, A), anonymousClass5J9.f4312I);
            AnonymousClass59L anonymousClass59L = anonymousClass5J9.f4341l;
            if (anonymousClass59L != null) {
                AnonymousClass59F anonymousClass59F = anonymousClass59L.f60583B;
                AnonymousClass59F.m25850B(anonymousClass59F, anonymousClass5J9);
                anonymousClass59F.f60567B.m26212B(AnonymousClass2Hj.B(B));
            }
        }
        AnonymousClass0cQ.L(this, 1163350743, M);
    }
}
