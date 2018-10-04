package X;

import com.instagram.tagging.widget.TagsLayout;
import java.util.Comparator;

/* renamed from: X.3ie */
public final class AnonymousClass3ie implements Comparator {
    public AnonymousClass3ie(TagsLayout tagsLayout) {
    }

    public final int compare(Object obj, Object obj2) {
        return (int) (((AnonymousClass3iT) obj).getAbsoluteTagPosition().x - ((AnonymousClass3iT) obj2).getAbsoluteTagPosition().x);
    }
}
