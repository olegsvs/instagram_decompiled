package X;

import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: X.0RH */
public final class AnonymousClass0RH {
    /* renamed from: D */
    public static final AnonymousClass0RH f4627D = new AnonymousClass0RH();
    /* renamed from: B */
    private final HashSet f4628B = new HashSet(50);
    /* renamed from: C */
    private final AnonymousClass0b4 f4629C = new AnonymousClass0b4(50);

    private AnonymousClass0RH() {
    }

    /* renamed from: A */
    public final boolean m4142A(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int hashCode = str.hashCode();
        if (this.f4628B.contains(Integer.valueOf(hashCode))) {
            return true;
        }
        if (this.f4629C.m5514F()) {
            this.f4628B.remove(Integer.valueOf(((Integer) this.f4629C.m5511C()).intValue()));
        }
        this.f4629C.m5512D(Integer.valueOf(hashCode));
        this.f4628B.add(Integer.valueOf(hashCode));
        return false;
    }
}
