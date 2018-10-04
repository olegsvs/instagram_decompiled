package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.4Wb */
public final class AnonymousClass4Wb implements AnonymousClass3e8 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Wg f54865B;

    public final boolean hn(Hashtag hashtag) {
        return false;
    }

    public AnonymousClass4Wb(AnonymousClass4Wg anonymousClass4Wg) {
        this.f54865B = anonymousClass4Wg;
    }

    public final void dn(Hashtag hashtag, int i) {
        this.f54865B.f54872D.m24406D(hashtag, "TYPEAHEAD", i);
        this.f54865B.f54877I.f54849G.setText(JsonProperty.USE_DEFAULT_NAME);
        this.f54865B.f54877I.m24410A();
    }
}
