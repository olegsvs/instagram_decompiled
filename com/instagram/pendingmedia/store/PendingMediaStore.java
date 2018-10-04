package com.instagram.pendingmedia.store;

import X.AnonymousClass0CB;
import X.AnonymousClass0Gn;
import X.AnonymousClass0OA;
import X.AnonymousClass0OC;
import X.AnonymousClass0ON;
import X.AnonymousClass0XB;
import X.AnonymousClass0Ze;
import X.AnonymousClass0dB;
import X.AnonymousClass1Ag;
import X.AnonymousClass3Zl;
import X.AnonymousClass3Zm;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PendingMediaStore {
    /* renamed from: C */
    private static final AtomicBoolean f3785C = new AtomicBoolean(true);
    /* renamed from: D */
    public static PendingMediaStore f3786D;
    /* renamed from: B */
    public final Map f3787B = new ConcurrentHashMap();

    /* renamed from: A */
    public final AnonymousClass0OA m3539A(String str) {
        return str != null ? (AnonymousClass0OA) this.f3787B.get(str) : null;
    }

    /* renamed from: B */
    public final List m3540B(AnonymousClass0Ze anonymousClass0Ze) {
        List arrayList = new ArrayList(this.f3787B.size());
        for (AnonymousClass0OA anonymousClass0OA : this.f3787B.values()) {
            if ((anonymousClass0OA.iC == AnonymousClass0OC.CONFIGURED || anonymousClass0OA.QB) && anonymousClass0Ze.m5378A(anonymousClass0OA)) {
                arrayList.add(anonymousClass0OA);
            }
        }
        return arrayList;
    }

    /* renamed from: B */
    public static void m3536B(Set set, File file, AnonymousClass0XB anonymousClass0XB) {
        File[] listFiles = file.listFiles();
        if (file.exists()) {
            if (listFiles != null) {
                List arrayList = new ArrayList();
                for (File file2 : listFiles) {
                    if (!set.contains(file2.getName())) {
                        arrayList.add(file2.getName());
                        AnonymousClass1Ag.m9741E(file2.getPath(), anonymousClass0XB);
                    }
                }
                file.getAbsolutePath();
            }
        }
    }

    /* renamed from: C */
    public static PendingMediaStore m3537C() {
        if (f3786D == null) {
            synchronized (PendingMediaStore.class) {
                if (f3786D == null) {
                    f3786D = new PendingMediaStore();
                }
            }
        }
        return f3786D;
    }

    /* renamed from: C */
    public final List m3541C(AnonymousClass0Ze anonymousClass0Ze) {
        List arrayList = new ArrayList();
        for (AnonymousClass0OA anonymousClass0OA : this.f3787B.values()) {
            if (anonymousClass0OA.iC == AnonymousClass0OC.DRAFT && !anonymousClass0OA.OB && anonymousClass0Ze.m5378A(anonymousClass0OA)) {
                if (anonymousClass0OA.gB != AnonymousClass0ON.CAROUSEL) {
                    if (anonymousClass0OA.DB == null) {
                        AnonymousClass0Gn.m1876C("PendingMediaStore", "draft missing file path");
                        m3544F(anonymousClass0OA.UB);
                    } else if (!new File(anonymousClass0OA.DB).exists()) {
                        AnonymousClass0Gn.m1876C("PendingMediaStore", "draft file missing on device");
                        m3544F(anonymousClass0OA.UB);
                    }
                }
                arrayList.add(anonymousClass0OA);
            }
        }
        Collections.sort(arrayList, new AnonymousClass3Zl(this));
        return arrayList;
    }

    /* renamed from: D */
    public static void m3538D(Context context) {
        if (f3785C.compareAndSet(true, false)) {
            PendingMediaStoreSerializer.m1814C().m1817A(new AnonymousClass3Zm(context));
        }
    }

    /* renamed from: D */
    public final boolean m3542D() {
        for (AnonymousClass0OA anonymousClass0OA : this.f3787B.values()) {
            if (anonymousClass0OA.iC == AnonymousClass0OC.DRAFT) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void m3543E(String str, AnonymousClass0OA anonymousClass0OA) {
        this.f3787B.put(str, anonymousClass0OA);
        m3546H();
    }

    /* renamed from: F */
    public final void m3544F(String str) {
        if (((AnonymousClass0OA) this.f3787B.remove(str)) != null) {
            m3546H();
        }
    }

    /* renamed from: G */
    public final void m3545G(AnonymousClass0ON anonymousClass0ON) {
        Iterator it = this.f3787B.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (!(((AnonymousClass0OA) entry.getValue()).gB != anonymousClass0ON || ((AnonymousClass0OA) entry.getValue()).iC == AnonymousClass0OC.CONFIGURED || ((AnonymousClass0OA) entry.getValue()).iC == AnonymousClass0OC.DRAFT || ((AnonymousClass0OA) entry.getValue()).QB)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Deleting media");
                stringBuilder.append(entry.getValue());
                stringBuilder.toString();
                it.remove();
            }
        }
    }

    /* renamed from: H */
    public final void m3546H() {
        AnonymousClass0dB.m5948D("PendingMediaStore.INTENT_ACTION_PENDING_MEDIA_CHANGED");
        if (AnonymousClass0CB.m834D()) {
            Integer.valueOf(this.f3787B.size());
            for (Entry value : this.f3787B.entrySet()) {
                ((AnonymousClass0OA) value.getValue()).toString();
            }
        }
    }
}
