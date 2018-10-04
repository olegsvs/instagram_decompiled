package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.06F */
public final class AnonymousClass06F {
    /* renamed from: B */
    public final Map f269B = new HashMap();
    /* renamed from: C */
    private final Context f270C;
    /* renamed from: D */
    private final AnonymousClass1Bj f271D;

    public AnonymousClass06F(Context context, AnonymousClass1Bk anonymousClass1Bk) {
        this.f270C = context;
        this.f271D = AnonymousClass1Bj.m9868B(anonymousClass1Bk);
    }

    /* renamed from: A */
    public final AnonymousClass05y m380A(String str, Class cls) {
        Object obj = null;
        int i = 0;
        while (obj == null) {
            int i2 = i + 1;
            if (i >= 3) {
                break;
            }
            obj = m379B(str, cls);
            i = i2;
        }
        if (obj == null) {
            AnonymousClass0Dc.m1255R("SystemServiceManager", "Cannot get system service after MAX_RETRIES: %s", cls.getName());
        }
        return AnonymousClass05y.m352B(obj);
    }

    /* renamed from: B */
    private Object m379B(String str, Class cls) {
        if (this.f269B.containsKey(cls)) {
            return this.f269B.get(cls);
        }
        Object H = this.f271D.m9877H(this.f270C, str, cls);
        if (H != null) {
            this.f269B.put(cls, H);
        }
        return H;
    }
}
