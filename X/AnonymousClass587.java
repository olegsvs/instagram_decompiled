package X;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.facebook.C0164R;

/* renamed from: X.587 */
public final class AnonymousClass587 extends AnonymousClass3TP {
    /* renamed from: B */
    public final FragmentActivity f60415B;
    /* renamed from: C */
    public final String f60416C;
    /* renamed from: D */
    private Context f60417D;
    /* renamed from: E */
    private final AnonymousClass2Na f60418E;

    public AnonymousClass587(Context context, FragmentActivity fragmentActivity, String str, AnonymousClass2Na anonymousClass2Na) {
        super(fragmentActivity);
        this.f60415B = fragmentActivity;
        this.f60417D = context;
        this.f60416C = str;
        this.f60418E = anonymousClass2Na;
    }

    public final boolean zq() {
        new AnonymousClass0Sb(this.f60417D).H(C0164R.string.saved_smart_lock_credentials_are_invalid).O(C0164R.string.ok, null).N(new AnonymousClass586(this)).C().show();
        AnonymousClass0Fr.GoogleSmartLockError.C(this.f60418E).F("error", "saved_credentials_invalid").R();
        return true;
    }
}
