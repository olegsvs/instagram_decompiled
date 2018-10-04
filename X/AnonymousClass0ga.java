package X;

import java.util.regex.Pattern;

/* renamed from: X.0ga */
public final class AnonymousClass0ga {
    /* renamed from: B */
    public final String f8195B;
    /* renamed from: C */
    public final Pattern f8196C;
    /* renamed from: D */
    public final String f8197D;

    public AnonymousClass0ga(String str, String str2) {
        this.f8195B = str;
        this.f8197D = str2;
        try {
            this.f8196C = Pattern.compile(str);
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid regex pattern: ");
            stringBuilder.append(str);
            throw new AnonymousClass1yY(stringBuilder.toString(), e);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("matcher: ");
        stringBuilder.append(this.f8195B);
        stringBuilder.append("\n");
        stringBuilder.append("replacer: ");
        stringBuilder.append(this.f8197D);
        return stringBuilder.toString();
    }
}
