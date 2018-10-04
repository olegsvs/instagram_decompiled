package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0WN */
public final class AnonymousClass0WN {
    /* renamed from: B */
    public final List f5970B = new ArrayList();
    /* renamed from: C */
    private final AnonymousClass0Tt f5971C;

    public AnonymousClass0WN(AnonymousClass0Tt anonymousClass0Tt) {
        this.f5971C = anonymousClass0Tt;
    }

    /* renamed from: A */
    public final int m5111A(AnonymousClass0U0 anonymousClass0U0) {
        int i = anonymousClass0U0.f5326E;
        anonymousClass0U0.f5326E = i + 1;
        Object obj = 1;
        if (i <= 1) {
            obj = null;
        }
        if (obj == null) {
            AnonymousClass0WN.m5110B(this);
        }
        return i;
    }

    /* renamed from: B */
    public final AnonymousClass0U0 m5112B() {
        for (AnonymousClass0U0 anonymousClass0U0 : this.f5970B) {
            if (!anonymousClass0U0.f5325D.equals("upload_failed_transient") && !anonymousClass0U0.f5325D.equals("upload_failed_permanent")) {
                return anonymousClass0U0;
            }
        }
        return null;
    }

    /* renamed from: B */
    public static void m5110B(AnonymousClass0WN anonymousClass0WN) {
        anonymousClass0WN.f5971C.m4595E(new ArrayList(anonymousClass0WN.f5970B));
    }

    /* renamed from: C */
    public final AnonymousClass0U0 m5113C(String str) {
        Iterator it = this.f5970B.iterator();
        AnonymousClass0U0 anonymousClass0U0 = null;
        while (it.hasNext()) {
            AnonymousClass0U0 anonymousClass0U02 = (AnonymousClass0U0) it.next();
            if (anonymousClass0U02.f5324C.equals(str)) {
                it.remove();
                anonymousClass0U0 = anonymousClass0U02;
            }
        }
        if (anonymousClass0U0 != null) {
            AnonymousClass0WN.m5110B(this);
        }
        return anonymousClass0U0;
    }

    /* renamed from: D */
    public final List m5114D(String str) {
        List arrayList = new ArrayList();
        Iterator it = this.f5970B.iterator();
        while (it.hasNext()) {
            AnonymousClass0U0 anonymousClass0U0 = (AnonymousClass0U0) it.next();
            if (Collections.unmodifiableSet(anonymousClass0U0.f5327F).contains(str)) {
                arrayList.add(anonymousClass0U0);
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            AnonymousClass0WN.m5110B(this);
        }
        return arrayList;
    }

    /* renamed from: E */
    public final void m5115E(AnonymousClass0U0 anonymousClass0U0, String str) {
        anonymousClass0U0.m4674D(str);
        if (str.equals("upload_failed_transient") || str.equals("upload_failed_permanent")) {
            if (!anonymousClass0U0.mo1290B()) {
                this.f5970B.remove(anonymousClass0U0);
            }
            AnonymousClass0WN.m5110B(this);
        }
    }
}
