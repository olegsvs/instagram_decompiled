package X;

import com.facebook.C0164R;

/* renamed from: X.3TE */
public final class AnonymousClass3TE implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3TG f41470B;

    public AnonymousClass3TE(AnonymousClass3TG anonymousClass3TG) {
        this.f41470B = anonymousClass3TG;
    }

    public final void run() {
        new AnonymousClass0Sb(this.f41470B.f41473B).Q(C0164R.string.error).H(C0164R.string.facebook_account_not_linked_use_current_password_instead).O(C0164R.string.ok, null).C().show();
    }
}
