package X;

import android.text.TextUtils;

/* renamed from: X.2Gx */
public final class AnonymousClass2Gx extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Cm f28425B;

    public AnonymousClass2Gx(AnonymousClass0Cm anonymousClass0Cm) {
        this.f28425B = anonymousClass0Cm;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1425539786);
        if (anonymousClass0Q6.B() && (TextUtils.isEmpty(((AnonymousClass2HI) anonymousClass0Q6.f4288C).f28459B) ^ 1) != 0) {
            AnonymousClass0FO.G(this.f28425B, false);
        }
        AnonymousClass0cQ.H(this, 1724991097, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1348265333);
        AnonymousClass2HI anonymousClass2HI = (AnonymousClass2HI) obj;
        int I2 = AnonymousClass0cQ.I(this, -24922280);
        AnonymousClass2HJ anonymousClass2HJ = (AnonymousClass2HJ) anonymousClass2HI.f28460C.get(0);
        Object obj2 = (anonymousClass2HJ.f28461B && anonymousClass2HJ.f28462C) ? 1 : null;
        if (obj2 == null) {
            AnonymousClass0FO.G(this.f28425B, false);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            AnonymousClass0FO.f2123C = currentTimeMillis;
            AnonymousClass0Mt.G().edit().putLong("last_permissions_check", currentTimeMillis).apply();
        }
        AnonymousClass0cQ.H(this, -412491207, I2);
        AnonymousClass0cQ.H(this, 450964200, I);
    }
}
