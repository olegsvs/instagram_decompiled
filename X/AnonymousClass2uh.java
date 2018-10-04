package X;

import java.util.Arrays;

/* renamed from: X.2uh */
public final class AnonymousClass2uh {
    /* renamed from: B */
    public final int[] f35674B;
    /* renamed from: C */
    private final int f35675C;

    static {
        AnonymousClass2uh anonymousClass2uh = new AnonymousClass2uh(new int[]{2}, 2);
    }

    public AnonymousClass2uh(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f35674B = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f35674B = new int[0];
        }
        this.f35675C = i;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof AnonymousClass2uh)) {
                return false;
            }
            AnonymousClass2uh anonymousClass2uh = (AnonymousClass2uh) obj;
            if (!Arrays.equals(this.f35674B, anonymousClass2uh.f35674B) || this.f35675C != anonymousClass2uh.f35675C) {
                z = false;
            }
        }
        return z;
    }

    public final int hashCode() {
        return this.f35675C + (Arrays.hashCode(this.f35674B) * 31);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudioCapabilities[maxChannelCount=");
        stringBuilder.append(this.f35675C);
        stringBuilder.append(", supportedEncodings=");
        stringBuilder.append(Arrays.toString(this.f35674B));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
