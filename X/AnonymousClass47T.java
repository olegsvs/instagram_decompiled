package X;

import com.facebook.location.ImmutableLocation;

/* renamed from: X.47T */
public final class AnonymousClass47T {
    /* renamed from: B */
    public static long m23288B(ImmutableLocation immutableLocation, ImmutableLocation immutableLocation2) {
        if (immutableLocation.K() != null) {
            if (immutableLocation2.K() != null) {
                return immutableLocation2.K().longValue() - immutableLocation.K().longValue();
            }
        }
        return Long.MIN_VALUE;
    }
}
