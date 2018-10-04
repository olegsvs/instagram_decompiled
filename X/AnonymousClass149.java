package X;

import android.content.SharedPreferences.Editor;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: X.149 */
public final class AnonymousClass149 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Ma f13828B;

    public AnonymousClass149(AnonymousClass0Ma anonymousClass0Ma) {
        this.f13828B = anonymousClass0Ma;
    }

    public final void run() {
        AnonymousClass0Ma anonymousClass0Ma = this.f13828B;
        synchronized (anonymousClass0Ma) {
            Editor edit = anonymousClass0Ma.f3445D.edit();
            for (Entry entry : anonymousClass0Ma.f3444C.entrySet()) {
                if (entry.getValue() == anonymousClass0Ma) {
                    edit.remove((String) entry.getKey());
                } else {
                    Object value = entry.getValue();
                    if (value instanceof Set) {
                        edit.putStringSet((String) entry.getKey(), (Set) value);
                    } else if (value instanceof Boolean) {
                        edit.putBoolean((String) entry.getKey(), ((Boolean) value).booleanValue());
                    } else if (value instanceof Long) {
                        edit.putLong((String) entry.getKey(), ((Long) value).longValue());
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("try to store unsupport value type ");
                        stringBuilder.append(value);
                        AnonymousClass0Gn.m1881H("LazyPreferences", stringBuilder.toString());
                    }
                }
            }
            edit.apply();
            anonymousClass0Ma.f3444C.clear();
        }
    }
}
