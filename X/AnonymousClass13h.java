package X;

import android.database.DataSetObserver;
import android.text.TextUtils;

/* renamed from: X.13h */
public final class AnonymousClass13h extends DataSetObserver {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0l7 f13768B;

    public AnonymousClass13h(AnonymousClass0l7 anonymousClass0l7) {
        this.f13768B = anonymousClass0l7;
    }

    public final void onChanged() {
        super.onChanged();
        AnonymousClass0l7 anonymousClass0l7 = this.f13768B;
        int i = 0;
        anonymousClass0l7.f9422F = false;
        anonymousClass0l7.f9426J.clear();
        AnonymousClass0P8 anonymousClass0P8 = null;
        Object obj = null;
        while (i < anonymousClass0l7.f9418B.getCount()) {
            Object item = anonymousClass0l7.f9418B.getItem(i);
            if (item instanceof AnonymousClass0r0) {
                anonymousClass0P8 = (AnonymousClass0r0) item;
                if (anonymousClass0P8.f11073F == AnonymousClass13k.GROUP_HEADER) {
                    anonymousClass0l7.f9422F = true;
                    anonymousClass0l7.f9426J.add(anonymousClass0P8);
                    i++;
                }
            } else {
                if (item instanceof AnonymousClass3MF) {
                    AnonymousClass3MF anonymousClass3MF = (AnonymousClass3MF) item;
                    anonymousClass0l7.f9422F = true;
                    anonymousClass0P8 = anonymousClass3MF;
                    obj = 1;
                } else if (anonymousClass0P8 != null && r6 == null) {
                    if (item instanceof AnonymousClass0pm) {
                        if (TextUtils.equals(((AnonymousClass0pm) item).f10738B, anonymousClass0P8.getId())) {
                        }
                    } else if (item instanceof AnonymousClass0P7) {
                        if (AnonymousClass0nL.m7653B().m7655B((AnonymousClass0P7) item)) {
                        }
                    }
                }
                anonymousClass0l7.f9426J.add(anonymousClass0P8);
                i++;
            }
            anonymousClass0P8 = null;
            anonymousClass0l7.f9426J.add(anonymousClass0P8);
            i++;
        }
    }
}
