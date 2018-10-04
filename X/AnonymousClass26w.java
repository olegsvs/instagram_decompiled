package X;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.26w */
public final class AnonymousClass26w {
    /* renamed from: B */
    public String f26070B;
    /* renamed from: C */
    public final AtomicLong f26071C = new AtomicLong(Long.MIN_VALUE);
    /* renamed from: D */
    public List f26072D;
    /* renamed from: E */
    public String f26073E;
    /* renamed from: F */
    public String f26074F;

    public AnonymousClass26w(String str, String str2, String str3, List list) {
        this.f26070B = str;
        this.f26073E = str2;
        this.f26074F = str3;
        this.f26072D = list;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    AnonymousClass26w anonymousClass26w = (AnonymousClass26w) obj;
                    if (!Objects.equals(this.f26070B, anonymousClass26w.f26070B) || !Objects.equals(this.f26073E, anonymousClass26w.f26073E) || !Objects.equals(this.f26074F, anonymousClass26w.f26074F) || !Objects.equals(this.f26072D, anonymousClass26w.f26072D)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f26070B, this.f26073E, this.f26074F, this.f26072D});
    }
}
