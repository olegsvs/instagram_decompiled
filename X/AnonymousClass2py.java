package X;

import java.util.PriorityQueue;

/* renamed from: X.2py */
public final class AnonymousClass2py {
    /* renamed from: B */
    public final PriorityQueue f34671B = new PriorityQueue(10, AnonymousClass1xX.f24672D);

    /* renamed from: A */
    public final synchronized AnonymousClass1xX m17409A(long j) {
        while (!this.f34671B.isEmpty() && ((AnonymousClass1xX) this.f34671B.peek()).m13922A() < j) {
            this.f34671B.poll();
        }
        if (this.f34671B.isEmpty() || ((AnonymousClass1xX) this.f34671B.peek()).m13922A() != j) {
            return null;
        }
        return (AnonymousClass1xX) this.f34671B.poll();
    }
}
