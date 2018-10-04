package X;

import android.app.Notification;
import android.content.SharedPreferences;
import java.util.List;
import java.util.Map;

/* renamed from: X.5ZM */
public abstract class AnonymousClass5ZM {
    /* renamed from: A */
    public boolean m27587A(Object obj, Object obj2) {
        return false;
    }

    /* renamed from: C */
    public abstract Notification m27589C(AnonymousClass0Cm anonymousClass0Cm, String str, List list);

    /* renamed from: E */
    public abstract Object m27591E(String str);

    /* renamed from: F */
    public abstract String m27592F();

    /* renamed from: G */
    public abstract SharedPreferences m27593G();

    /* renamed from: H */
    public abstract String m27594H(Object obj);

    /* renamed from: I */
    public boolean m27595I() {
        return false;
    }

    /* renamed from: B */
    public Notification m27588B(AnonymousClass0Cm anonymousClass0Cm, Map map, String str) {
        throw new UnsupportedOperationException("Aggregation is not supported.");
    }

    /* renamed from: D */
    public Notification m27590D(AnonymousClass0Cm anonymousClass0Cm, String str, List list) {
        throw new UnsupportedOperationException("Silent notifications not supported.");
    }
}
