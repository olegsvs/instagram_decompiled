package X;

import android.hardware.Camera.Size;
import java.util.Comparator;

/* renamed from: X.5LX */
public final class AnonymousClass5LX implements Comparator {
    public final int compare(Object obj, Object obj2) {
        long B = AnonymousClass5LY.m26281B((Size) obj) - AnonymousClass5LY.m26281B((Size) obj2);
        if (B > 0) {
            return 1;
        }
        return B == 0 ? 0 : -1;
    }
}
