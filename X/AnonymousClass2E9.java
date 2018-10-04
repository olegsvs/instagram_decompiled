package X;

import com.instagram.pendingmedia.model.PendingRecipient;
import java.util.Comparator;

/* renamed from: X.2E9 */
public final class AnonymousClass2E9 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return ((PendingRecipient) obj).getId().compareTo(((PendingRecipient) obj2).getId());
    }
}
