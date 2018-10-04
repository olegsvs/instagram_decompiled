package X;

import com.instagram.common.gallery.Medium;
import java.util.Comparator;

/* renamed from: X.3B7 */
public final class AnonymousClass3B7 implements Comparator {
    public AnonymousClass3B7(AnonymousClass3B8 anonymousClass3B8) {
    }

    public final int compare(Object obj, Object obj2) {
        Medium medium = (Medium) obj;
        Medium medium2 = (Medium) obj2;
        if (medium == null) {
            return -1;
        }
        if (medium2 == null) {
            return 1;
        }
        int i = medium.f30917G > medium2.f30917G ? -1 : medium.f30917G == medium2.f30917G ? 0 : 1;
        if (i == 0) {
            i = medium.f30918H > medium2.f30918H ? -1 : medium.f30918H == medium2.f30918H ? 0 : 1;
        }
        if (i != 0) {
            return i;
        }
        if (medium.f30922L < medium2.f30922L) {
            return -1;
        }
        return medium.f30922L == medium2.f30922L ? 0 : 1;
    }
}
