package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.08E */
public final class AnonymousClass08E {
    /* renamed from: B */
    public final List f880B;

    public AnonymousClass08E(List list) {
        this.f880B = Collections.unmodifiableList(new ArrayList(list));
    }

    public final String toString() {
        return TextUtils.join(",", this.f880B.toArray());
    }
}
