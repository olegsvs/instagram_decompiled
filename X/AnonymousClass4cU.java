package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.4cU */
public final class AnonymousClass4cU implements AnonymousClass0F8 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5VY f55703B;

    public AnonymousClass4cU(AnonymousClass5VY anonymousClass5VY) {
        this.f55703B = anonymousClass5VY;
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, -1724920422);
        AnonymousClass0uH anonymousClass0uH = (AnonymousClass0uH) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.I(this, -1990566763);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f55703B.getActivity());
        anonymousClass0IZ.f2753C = "ds_message_hashtag";
        anonymousClass0IZ.f2754D = AnonymousClass3Qs.f41179B.m19623A().A(new Hashtag(anonymousClass0uH.f11816B));
        anonymousClass0IZ.B();
        AnonymousClass0cQ.H(this, -1955392635, I2);
        AnonymousClass0cQ.H(this, 1843325159, I);
    }
}
