package X;

import android.graphics.RectF;
import android.os.Bundle;

/* renamed from: X.4An */
public final class AnonymousClass4An {
    /* renamed from: A */
    public final Bundle m23478A(RectF rectF, AnonymousClass319 anonymousClass319, boolean z) {
        Bundle bundle = new Bundle();
        if (rectF != null) {
            bundle.putParcelable("NametagFragment.ARGUMENT_ENTRY_VIEW_BOUNDS", rectF);
        }
        bundle.putSerializable("NametagFragment.ARGUMENT_ENTRY_POINT", anonymousClass319);
        bundle.putBoolean("NametagFragment.ARGUMENT_SCAN_MODE", z);
        return bundle;
    }
}
