package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;

/* renamed from: X.42S */
public final class AnonymousClass42S implements AnonymousClass3of {
    /* renamed from: B */
    private AnonymousClass3of f48767B;

    public AnonymousClass42S(Context context) {
        this.f48767B = new AnonymousClass42U(context);
    }

    public final AnonymousClass3oe ZH(Uri uri) {
        AnonymousClass0LH.B(VERSION.SDK_INT >= 17);
        return this.f48767B.ZH(uri);
    }
}
