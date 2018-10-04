package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.1sf */
public final class AnonymousClass1sf {
    /* renamed from: B */
    public final List f23720B = new LinkedList();

    /* renamed from: A */
    public final AnonymousClass1se m13592A() {
        synchronized (this) {
            if (this.f23720B.isEmpty()) {
                return new AnonymousClass1se();
            }
            AnonymousClass1se anonymousClass1se = (AnonymousClass1se) this.f23720B.remove(0);
            return anonymousClass1se;
        }
    }
}
