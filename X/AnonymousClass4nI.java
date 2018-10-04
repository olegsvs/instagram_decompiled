package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.4nI */
public final class AnonymousClass4nI {
    /* renamed from: B */
    public Set f57314B = new HashSet();
    /* renamed from: C */
    public List f57315C = Collections.unmodifiableList(new ArrayList());
    /* renamed from: D */
    public final List f57316D = new ArrayList();
    /* renamed from: E */
    public final AnonymousClass1ew f57317E = AnonymousClass1ew.f21063B;

    /* renamed from: A */
    public final boolean m25083A(String str) {
        for (Object next : this.f57315C) {
            if ((next instanceof AnonymousClass0P7) && ((AnonymousClass0P7) next).getId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final boolean m25084B(String str) {
        for (Object next : this.f57315C) {
            if (next instanceof AnonymousClass0P7) {
                if (((AnonymousClass0P7) next).MA().getId().equals(str)) {
                }
            } else if (next instanceof AnonymousClass0ly) {
                if (((AnonymousClass0ly) next).A(str)) {
                }
            } else if ((next instanceof AnonymousClass3MC) && ((AnonymousClass3MC) next).f40429F.getId().equals(str)) {
            }
            return true;
        }
        return false;
    }
}
