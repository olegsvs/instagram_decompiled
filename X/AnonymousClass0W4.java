package X;

import android.content.pm.ResolveInfo;
import java.util.Comparator;

/* renamed from: X.0W4 */
public final class AnonymousClass0W4 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return ((ResolveInfo) obj).activityInfo.packageName.compareTo(((ResolveInfo) obj2).activityInfo.packageName);
    }
}
