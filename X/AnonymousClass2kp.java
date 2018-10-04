package X;

import android.net.Uri;

/* renamed from: X.2kp */
public final class AnonymousClass2kp {
    /* renamed from: B */
    public Uri f33302B;
    /* renamed from: C */
    public String f33303C;

    public AnonymousClass2kp(String str, Uri uri) {
        this.f33303C = str;
        this.f33302B = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2kp)) {
            return false;
        }
        return this.f33302B.equals(((AnonymousClass2kp) obj).f33302B);
    }

    public final int hashCode() {
        return this.f33302B.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f33303C);
        stringBuilder.append(", ");
        stringBuilder.append(this.f33302B);
        return stringBuilder.toString();
    }
}
