package X;

import android.net.Uri;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

/* renamed from: X.2yE */
public final class AnonymousClass2yE {
    /* renamed from: B */
    public final long f36490B;
    /* renamed from: C */
    public final String f36491C;
    /* renamed from: D */
    public final int f36492D;
    /* renamed from: E */
    public final String f36493E;
    /* renamed from: F */
    public final long f36494F;
    /* renamed from: G */
    public final long f36495G;
    /* renamed from: H */
    public final byte[] f36496H;
    /* renamed from: I */
    public final Uri f36497I;

    public AnonymousClass2yE(Uri uri, int i) {
        this(uri, 0, -1, null, i);
    }

    public AnonymousClass2yE(Uri uri, long j, long j2, long j3, String str, int i, String str2) {
        this(uri, null, j, j2, j3, str, i, str2);
    }

    public AnonymousClass2yE(Uri uri, long j, long j2, String str) {
        Uri uri2 = uri;
        this(uri2, j, j, j2, str, 0, JsonProperty.USE_DEFAULT_NAME);
    }

    public AnonymousClass2yE(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j2, str, i, JsonProperty.USE_DEFAULT_NAME);
    }

    public AnonymousClass2yE(Uri uri, long j, long j2, String str, int i, String str2) {
        this(uri, j, j, j2, str, i, str2);
    }

    public AnonymousClass2yE(Uri uri, long j, long j2, String str, String str2) {
        this(uri, j, j, j2, str, 0, str2);
    }

    public AnonymousClass2yE(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i, String str2) {
        boolean z = true;
        AnonymousClass2yO.m18013B(j >= 0);
        AnonymousClass2yO.m18013B(j2 >= 0);
        if (j3 <= 0) {
            if (j3 != -1) {
                z = false;
            }
        }
        AnonymousClass2yO.m18013B(z);
        this.f36497I = uri;
        this.f36496H = bArr;
        this.f36490B = j;
        this.f36495G = j2;
        this.f36494F = j3;
        this.f36493E = str;
        this.f36492D = i;
        this.f36491C = str2;
    }

    /* renamed from: A */
    public final AnonymousClass2yE m18008A(long j) {
        long j2 = this.f36494F;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return m18009B(j, j3);
    }

    /* renamed from: B */
    public final AnonymousClass2yE m18009B(long j, long j2) {
        long j3 = j2;
        if (j == 0 && this.f36494F == j2) {
            return this;
        }
        return new AnonymousClass2yE(this.f36497I, this.f36496H, this.f36490B + j, this.f36495G + j, j3, this.f36493E, this.f36492D, this.f36491C);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataSpec[");
        stringBuilder.append(this.f36497I);
        stringBuilder.append(", ");
        stringBuilder.append(Arrays.toString(this.f36496H));
        stringBuilder.append(", ");
        stringBuilder.append(this.f36490B);
        stringBuilder.append(", ");
        stringBuilder.append(this.f36495G);
        stringBuilder.append(", ");
        stringBuilder.append(this.f36494F);
        stringBuilder.append(", ");
        stringBuilder.append(this.f36493E);
        stringBuilder.append(", ");
        stringBuilder.append(this.f36492D);
        stringBuilder.append(", ");
        stringBuilder.append(this.f36491C);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
