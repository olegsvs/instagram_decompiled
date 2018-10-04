package X;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* renamed from: X.1z1 */
public final class AnonymousClass1z1 extends Exception {
    /* renamed from: B */
    public final AnonymousClass0O7 f24993B;

    public AnonymousClass1z1(AnonymousClass0O7 anonymousClass0O7) {
        this.f24993B = anonymousClass0O7;
    }

    /* renamed from: A */
    public final ConnectionResult m14020A(AnonymousClass1yp anonymousClass1yp) {
        AnonymousClass1zz anonymousClass1zz = anonymousClass1yp.f24963D;
        AnonymousClass1Ew.F(this.f24993B.get(anonymousClass1zz) != null, "The given API was not part of the availability request.");
        return (ConnectionResult) this.f24993B.get(anonymousClass1zz);
    }

    public final String getMessage() {
        StringBuilder stringBuilder;
        Iterable arrayList = new ArrayList();
        Object obj = 1;
        for (AnonymousClass1zz anonymousClass1zz : this.f24993B.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.f24993B.get(anonymousClass1zz);
            if (connectionResult.B()) {
                obj = null;
            }
            String valueOf = String.valueOf(anonymousClass1zz.f25144B.f24955B);
            String valueOf2 = String.valueOf(connectionResult);
            stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length());
            stringBuilder.append(valueOf);
            stringBuilder.append(": ");
            stringBuilder.append(valueOf2);
            arrayList.add(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(obj != null ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        stringBuilder.append(TextUtils.join("; ", arrayList));
        return stringBuilder.toString();
    }
}
