package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.0oY */
public final class AnonymousClass0oY implements AnonymousClass0oF {
    /* renamed from: B */
    private final Context f10307B;
    /* renamed from: C */
    private AnonymousClass0Cm f10308C;

    public AnonymousClass0oY(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        this.f10307B = context;
        this.f10308C = anonymousClass0Cm;
    }

    public final void iU(Uri uri, Bundle bundle) {
        if (AnonymousClass0EO.f1974B.mo260A(uri.toString(), this.f10308C) != null) {
            AnonymousClass0IW.m2243I(AnonymousClass0EM.f1972B.mo259D(this.f10307B, uri), this.f10307B);
        }
    }
}
