package X;

import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* renamed from: X.298 */
public abstract class AnonymousClass298 {
    /* renamed from: B */
    public static AnonymousClass0Iu m14612B(AnonymousClass29L anonymousClass29L) {
        Builder path = new Builder().scheme("https").authority("api.giphy.com").appendQueryParameter("api_key", anonymousClass29L.f26703B).appendQueryParameter("limit", String.valueOf(anonymousClass29L.f26706E)).appendQueryParameter("rating", (String) AnonymousClass0CC.jM.G()).path(anonymousClass29L.f26704C);
        List emptyList;
        if (TextUtils.isEmpty(anonymousClass29L.f26707F)) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = Collections.singletonList(new Pair("q", anonymousClass29L.f26707F));
        }
        for (Pair pair : r0) {
            path.appendQueryParameter((String) pair.first, (String) pair.second);
        }
        return new AnonymousClass0Iu(AnonymousClass0Xx.B(new AnonymousClass297(path)).C(AnonymousClass0gO.f8154B).D(new AnonymousClass0RA(AnonymousClass2Vq.class)).D(new AnonymousClass296(anonymousClass29L)));
    }
}
