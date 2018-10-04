package X;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1qS */
public final class AnonymousClass1qS {
    /* renamed from: B */
    public static void m13412B(Context context, AnonymousClass1qn anonymousClass1qn, AnonymousClass1qm anonymousClass1qm, AnonymousClass1qP anonymousClass1qP, ArrayList arrayList, HashSet hashSet) {
        AnonymousClass1qn anonymousClass1qn2 = anonymousClass1qn;
        if (anonymousClass1qn != null) {
            AnonymousClass1qm anonymousClass1qm2 = anonymousClass1qm;
            if (anonymousClass1qm != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Bundle bundle = (Bundle) it.next();
                    String string = bundle.getString("action");
                    if (hashSet == null || !hashSet.contains(string)) {
                        String string2 = bundle.getString("KEY_LABEL");
                        if (!anonymousClass1qn.PY() || AnonymousClass1qa.f23303B.contains(string)) {
                            AnonymousClass1qP B = AnonymousClass1qV.m13414B(context, anonymousClass1qm2, anonymousClass1qn2, string, string2, bundle.getInt("KEY_ICON_RES"));
                            if (B != null) {
                                anonymousClass1qP.m13405A(B);
                            }
                        }
                    }
                }
            }
        }
    }
}
