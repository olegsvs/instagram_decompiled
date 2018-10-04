package X;

import com.instagram.arlink.model.ArLinkCandidate;
import java.util.Comparator;

/* renamed from: X.49X */
public final class AnonymousClass49X implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((ArLinkCandidate) obj2).getConfidenceScore(), ((ArLinkCandidate) obj).getConfidenceScore());
    }
}
