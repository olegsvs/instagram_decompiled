package X;

import android.os.Bundle;
import com.instagram.model.hashtag.Hashtag;
import java.util.HashMap;

/* renamed from: X.0uC */
public final class AnonymousClass0uC {
    /* renamed from: B */
    public static void m8208B(AnonymousClass0NN anonymousClass0NN, Hashtag hashtag) {
        anonymousClass0NN.m3298F("hashtag_id", hashtag.f2786F);
        anonymousClass0NN.m3298F("hashtag_name", hashtag.f2793M);
        anonymousClass0NN.m3298F("hashtag_follow_status", hashtag.m2323A().toString());
    }

    /* renamed from: C */
    public static void m8209C(AnonymousClass0db anonymousClass0db, Hashtag hashtag) {
        anonymousClass0db.m6074G("hashtag_id", hashtag.f2786F);
        anonymousClass0db.m6074G("hashtag_name", hashtag.f2793M);
        anonymousClass0db.m6074G("hashtag_follow_status", hashtag.m2323A().toString());
    }

    /* renamed from: D */
    public static void m8210D(AnonymousClass0NN anonymousClass0NN) {
        AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
        anonymousClass0NN.m3294B("nav_stack_depth", anonymousClass0Iz.m2400C());
        anonymousClass0NN.m3297E("nav_stack", anonymousClass0Iz.m2399B());
    }

    /* renamed from: E */
    public static void m8211E(AnonymousClass0NN anonymousClass0NN, AnonymousClass3J2 anonymousClass3J2, int i) {
        anonymousClass0NN.m3298F("hashtag_feed_type", anonymousClass3J2.toString());
        anonymousClass0NN.m3294B("tab_index", i);
    }

    /* renamed from: F */
    public static void m8212F(AnonymousClass0NN anonymousClass0NN, Object obj, AnonymousClass3Ix anonymousClass3Ix) {
        AnonymousClass0uC.m8211E(anonymousClass0NN, anonymousClass3Ix.iS(obj), anonymousClass3Ix.jS(obj));
    }

    /* renamed from: G */
    public static AnonymousClass0db m8213G(Bundle bundle) {
        AnonymousClass0db C = AnonymousClass0db.m6067C();
        if (bundle.containsKey("hashtag_logger_extras")) {
            C.m6078K((HashMap) bundle.getSerializable("hashtag_logger_extras"));
        }
        return C;
    }

    /* renamed from: H */
    public static Bundle m8214H(AnonymousClass0db anonymousClass0db) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("hashtag_logger_extras", AnonymousClass18G.m9546D(anonymousClass0db));
        return bundle;
    }

    /* renamed from: I */
    public static Bundle m8215I(Hashtag hashtag, String str, int i) {
        if (hashtag == null) {
            return new Bundle();
        }
        return AnonymousClass0uC.m8214H(AnonymousClass0uC.m8217K(hashtag, str, i));
    }

    /* renamed from: J */
    public static AnonymousClass0db m8216J(Hashtag hashtag) {
        return AnonymousClass0uC.m8217K(hashtag, null, -1);
    }

    /* renamed from: K */
    public static AnonymousClass0db m8217K(Hashtag hashtag, String str, int i) {
        AnonymousClass0db C = AnonymousClass0db.m6067C();
        if (hashtag != null) {
            AnonymousClass0uC.m8209C(C, hashtag);
        }
        if (str != null) {
            C.m6074G("hashtag_feed_type", str);
        }
        if (i != -1) {
            C.m6070C("tab_index", i);
        }
        return C;
    }
}
