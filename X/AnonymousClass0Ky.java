package X;

import android.util.Log;

/* renamed from: X.0Ky */
public final class AnonymousClass0Ky implements AnonymousClass0Kv {
    public final void GKA(String str) {
        Log.e("Security-LocalReporter", str);
    }

    public final void HKA(String str, String str2, Throwable th) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("category=");
        stringBuilder.append(str);
        stringBuilder.append(", message=");
        stringBuilder.append(str2);
        if (th != null) {
            stringBuilder.append(", cause=");
            stringBuilder.append(th.toString());
        }
        GKA(stringBuilder.toString());
    }
}
