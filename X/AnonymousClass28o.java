package X;

import android.content.Context;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.28o */
public final class AnonymousClass28o {
    /* renamed from: B */
    public final Context f26610B;
    /* renamed from: C */
    public final Map f26611C = new HashMap();
    /* renamed from: D */
    public final Map f26612D = new HashMap();
    /* renamed from: E */
    public final Map f26613E = new HashMap();
    /* renamed from: F */
    private final StringBuilder f26614F = new StringBuilder();

    public AnonymousClass28o(Context context) {
        this.f26610B = context.getApplicationContext();
    }

    /* renamed from: A */
    public final synchronized AnonymousClass2eX m14603A(int i, int i2) {
        String B = AnonymousClass28o.m14602B(this, i, i2);
        if (this.f26612D.get(B) == null) {
            this.f26612D.put(B, new LinkedList());
        }
        if (((List) this.f26612D.get(B)).isEmpty()) {
            Integer.valueOf(i);
            Integer.valueOf(i2);
            return AnonymousClass28m.m14600C(i, i2);
        }
        return (AnonymousClass2eX) ((List) this.f26612D.get(B)).remove(0);
    }

    /* renamed from: B */
    public static String m14602B(AnonymousClass28o anonymousClass28o, int i, int i2) {
        anonymousClass28o.f26614F.setLength(0);
        StringBuilder stringBuilder = anonymousClass28o.f26614F;
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        return anonymousClass28o.f26614F.toString();
    }

    /* renamed from: B */
    public final void m14604B(AnonymousClass28l anonymousClass28l) {
        if (this.f26611C.containsKey(anonymousClass28l)) {
            synchronized (this) {
                for (AnonymousClass28n anonymousClass28n : (Set) this.f26611C.get(anonymousClass28l)) {
                    anonymousClass28n.f26607B--;
                    if (anonymousClass28n.f26607B == 0) {
                        anonymousClass28n.f26609D.cleanup();
                        this.f26613E.remove(anonymousClass28n.f26608C);
                    }
                }
                ((Set) this.f26611C.remove(anonymousClass28l)).clear();
            }
        }
    }
}
