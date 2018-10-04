package X;

import com.instagram.model.direct.DirectShareTarget;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.4bF */
public final class AnonymousClass4bF implements Comparator {
    /* renamed from: B */
    public final /* synthetic */ Collator f55602B;

    public AnonymousClass4bF(Collator collator) {
        this.f55602B = collator;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return AnonymousClass5Wz.F(this.f55602B, (DirectShareTarget) obj, (DirectShareTarget) obj2);
    }
}
