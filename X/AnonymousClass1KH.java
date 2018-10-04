package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.1KH */
public final class AnonymousClass1KH extends AnonymousClass1KA {
    /* renamed from: B */
    public Hashtag f17168B;

    public AnonymousClass1KH() {
        super(1);
        this.f17168B = null;
    }

    public AnonymousClass1KH(long j, Hashtag hashtag) {
        super(j, 1);
        this.f17168B = hashtag;
    }

    public AnonymousClass1KH(Hashtag hashtag) {
        super(1);
        this.f17168B = hashtag;
    }

    /* renamed from: A */
    public final String mo2407A() {
        return this.f17168B.f2793M;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass1KH)) {
            return false;
        }
        Hashtag hashtag = this.f17168B;
        if (hashtag != null) {
            return hashtag.equals(((AnonymousClass1KH) obj).f17168B);
        }
        return false;
    }

    public final int hashCode() {
        Hashtag hashtag = this.f17168B;
        return hashtag != null ? hashtag.hashCode() : 0;
    }
}
