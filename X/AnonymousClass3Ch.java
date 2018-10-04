package X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Ch */
public final class AnonymousClass3Ch {
    /* renamed from: B */
    public static void m19024B(AnonymousClass0NN anonymousClass0NN, int i, String str, int i2, String str2) {
        anonymousClass0NN.B("index", i);
        anonymousClass0NN.F("filter", str);
        anonymousClass0NN.B("filter_type", i2);
        anonymousClass0NN.F("source", str2);
        anonymousClass0NN.R();
    }

    /* renamed from: C */
    public static void m19025C(String str, boolean z, boolean z2) {
        if (z) {
            z = AnonymousClass0g3.PhotoFilterTried.A();
        } else {
            z = AnonymousClass0g3.VideoFilterTried.A();
        }
        z.F("filter_name", str);
        z.F("selection_method", z2 ? "touch" : "swipe");
        z.R();
    }

    /* renamed from: D */
    public static void m19026D(List list) {
        AnonymousClass0NN A = AnonymousClass0g3.FilterTrayOrder.A();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (AnonymousClass3Cj anonymousClass3Cj : list) {
            String valueOf = String.valueOf(anonymousClass3Cj.f39100D);
            arrayList2.add(valueOf);
            if (!anonymousClass3Cj.f39099C) {
                arrayList.add(valueOf);
            }
        }
        A.I(AppStateModule.APP_STATE_ACTIVE, (String[]) arrayList.toArray(new String[arrayList.size()]));
        A.I("order", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
        A.R();
    }
}
