package X;

import java.io.IOException;

/* renamed from: X.2yL */
public final class AnonymousClass2yL extends IOException {
    public AnonymousClass2yL(Throwable th) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected ");
        stringBuilder.append(th.getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append(th.getMessage());
        super(stringBuilder.toString(), th);
    }
}
