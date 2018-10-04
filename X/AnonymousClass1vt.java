package X;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.1vt */
public abstract class AnonymousClass1vt {
    /* renamed from: B */
    public AnonymousClass1vs f24293B;
    /* renamed from: C */
    public Executor f24294C;

    /* renamed from: A */
    public abstract Set mo3013A(String str);

    public AnonymousClass1vt(AnonymousClass1vs anonymousClass1vs, Executor executor, AnonymousClass2UO anonymousClass2UO) {
        this.f24293B = anonymousClass1vs;
        this.f24294C = executor;
    }

    /* renamed from: B */
    public static String m13805B(String str) {
        StringBuilder stringBuilder;
        if (str.startsWith("fna:")) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("sonar.");
            stringBuilder.append(str.substring(4));
            stringBuilder.append(".fna.fbcdn.net");
            return stringBuilder.toString();
        } else if (str.length() == 3) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("sonar-");
            stringBuilder.append(str);
            stringBuilder.append(".xx.fbcdn.net");
            return stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid region: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
