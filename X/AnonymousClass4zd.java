package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.text.TextUtils;

/* renamed from: X.4zd */
public final class AnonymousClass4zd extends AnonymousClass17n {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4zn f59141B;
    /* renamed from: C */
    public final /* synthetic */ Account f59142C;
    /* renamed from: D */
    public final /* synthetic */ AccountManager f59143D;

    public AnonymousClass4zd(AnonymousClass4zn anonymousClass4zn, AccountManager accountManager, Account account) {
        this.f59141B = anonymousClass4zn;
        this.f59143D = accountManager;
        this.f59142C = account;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m25541B(Object obj) {
        String str = (String) obj;
        synchronized (this.f59141B) {
            if (!TextUtils.isEmpty(str)) {
                this.f59141B.f59158C.add(str);
            }
            AnonymousClass4zn anonymousClass4zn = this.f59141B;
            anonymousClass4zn.f59168M++;
            if (this.f59141B.f59166K && this.f59141B.f59168M == this.f59141B.f59167L) {
                AnonymousClass0Fr.LookUpWithGoogleIdTokens.C(AnonymousClass2Na.USER_LOOKUP).F("type", "token_ready_later").R();
                this.f59141B.f59159D.removeCallbacksAndMessages(null);
                if (AnonymousClass4zn.m25547F(this.f59141B)) {
                    AnonymousClass4zn.m25549H(this.f59141B);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return AnonymousClass1BX.D(this.f59143D, this.f59142C, "access", null);
    }
}
