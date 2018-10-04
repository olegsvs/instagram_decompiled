package X;

import com.instagram.user.follow.FollowButton;

/* renamed from: X.42L */
public final class AnonymousClass42L implements AnonymousClass3l5 {
    /* renamed from: B */
    public final /* synthetic */ FollowButton f48746B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0QH f48747C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ci f48748D;

    public final void zBA() {
    }

    public AnonymousClass42L(FollowButton followButton, AnonymousClass0QH anonymousClass0QH, AnonymousClass0Ci anonymousClass0Ci) {
        this.f48746B = followButton;
        this.f48747C = anonymousClass0QH;
        this.f48748D = anonymousClass0Ci;
    }

    public final void onCancel() {
        this.f48746B.setEnabled(true);
        AnonymousClass0QH anonymousClass0QH = this.f48747C;
        if (anonymousClass0QH != null) {
            anonymousClass0QH.fm(this.f48748D);
        }
    }

    public final void onStart() {
        AnonymousClass0QH anonymousClass0QH = this.f48747C;
        if (anonymousClass0QH != null) {
            anonymousClass0QH.zf(this.f48748D);
        }
    }

    public final void onSuccess() {
        AnonymousClass0QH anonymousClass0QH = this.f48747C;
        if (anonymousClass0QH != null) {
            anonymousClass0QH.fm(this.f48748D);
        }
    }
}
