package X;

import java.util.regex.Pattern;

/* renamed from: X.1wS */
public final class AnonymousClass1wS {
    /* renamed from: B */
    private AnonymousClass1wR f24514B;

    public AnonymousClass1wS(int i) {
        this.f24514B = new AnonymousClass1wR(i);
    }

    /* renamed from: A */
    public final Pattern m13886A(String str) {
        Object obj;
        AnonymousClass1wR anonymousClass1wR = this.f24514B;
        synchronized (anonymousClass1wR) {
            obj = anonymousClass1wR.f24512B.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            anonymousClass1wR = this.f24514B;
            synchronized (anonymousClass1wR) {
                anonymousClass1wR.f24512B.put(str, pattern);
            }
        }
        return pattern;
    }
}
