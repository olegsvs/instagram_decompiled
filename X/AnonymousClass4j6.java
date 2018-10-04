package X;

import com.facebook.C0164R;

/* renamed from: X.4j6 */
public final class AnonymousClass4j6 implements AnonymousClass0Qd {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4jN f56555B;

    public AnonymousClass4j6(AnonymousClass4jN anonymousClass4jN) {
        this.f56555B = anonymousClass4jN;
    }

    public final void Sp(int i, boolean z) {
        AnonymousClass4jN anonymousClass4jN = this.f56555B;
        boolean z2 = i > 0;
        anonymousClass4jN.f56598d = z2;
        if (!z2) {
            anonymousClass4jN.f56577I.on();
            if (anonymousClass4jN.f56616v) {
                anonymousClass4jN.f56616v = false;
                AnonymousClass4jN.m24895N(anonymousClass4jN, (float) (((-anonymousClass4jN.f56594Z) + anonymousClass4jN.f56606l.getHeight()) - anonymousClass4jN.f56576H.getResources().getDimensionPixelSize(C0164R.dimen.row_height_small)));
                AnonymousClass4jN.m24893L(anonymousClass4jN, (float) (anonymousClass4jN.f56594Z - ((int) (-anonymousClass4jN.f56606l.getTranslationY()))));
                AnonymousClass4jN.m24890I(anonymousClass4jN);
            }
        } else if (anonymousClass4jN.f56597c) {
            AnonymousClass4jN.m24895N(anonymousClass4jN, (float) (-i));
            AnonymousClass4jN.m24887F(anonymousClass4jN, (float) (anonymousClass4jN.f56594Z - i));
            AnonymousClass4jN.m24890I(anonymousClass4jN);
        }
        AnonymousClass4jN.m24895N(anonymousClass4jN, (float) (-i));
        AnonymousClass4jN.m24890I(anonymousClass4jN);
    }
}
