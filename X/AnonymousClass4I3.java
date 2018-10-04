package X;

import android.hardware.Camera.Size;
import java.util.Comparator;

/* renamed from: X.4I3 */
public final class AnonymousClass4I3 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        return (size.width * size.height) - (size2.width * size2.height);
    }
}
