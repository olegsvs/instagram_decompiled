package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2oi */
public final class AnonymousClass2oi {
    /* renamed from: B */
    public final boolean f34334B;
    /* renamed from: C */
    public final Set f34335C;
    /* renamed from: D */
    public final AnonymousClass2oh f34336D;
    /* renamed from: E */
    public final int f34337E;

    public AnonymousClass2oi(AnonymousClass1Fo anonymousClass1Fo, String str, boolean z, Integer num, AnonymousClass2oh anonymousClass2oh, int i, String str2, int i2, int i3, Set set) {
        this.f34334B = z;
        this.f34336D = anonymousClass2oh;
        this.f34337E = i;
        this.f34335C = Collections.unmodifiableSet(new HashSet(set));
    }
}
