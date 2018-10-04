package X;

import android.database.DataSetObserver;
import java.util.ArrayList;

/* renamed from: X.5wz */
public final class AnonymousClass5wz extends DataSetObserver {
    /* renamed from: B */
    private final AnonymousClass1Wo f70237B;
    /* renamed from: C */
    private final AnonymousClass5Cx f70238C;

    public AnonymousClass5wz(AnonymousClass1Wo anonymousClass1Wo, AnonymousClass5Cx anonymousClass5Cx) {
        this.f70237B = anonymousClass1Wo;
        this.f70238C = anonymousClass5Cx;
    }

    public final void onChanged() {
        this.f70237B.A(new ArrayList(this.f70238C.f61195C));
    }

    public final void onInvalidated() {
        this.f70237B.A(new ArrayList(this.f70238C.f61195C));
    }
}
