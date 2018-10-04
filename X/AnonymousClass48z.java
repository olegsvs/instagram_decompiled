package X;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.48z */
public final class AnonymousClass48z extends AnonymousClass0Iw {
    /* renamed from: B */
    public Context f50842B;
    /* renamed from: C */
    public AnonymousClass0IJ f50843C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass5Rn f50844D;

    public AnonymousClass48z(AnonymousClass5Rn anonymousClass5Rn, AnonymousClass0IJ anonymousClass0IJ) {
        this.f50844D = anonymousClass5Rn;
        this.f50843C = anonymousClass0IJ;
        this.f50842B = anonymousClass0IJ.getContext();
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -532251305);
        Context context = this.f50842B;
        Toast.makeText(context, context.getString(C0164R.string.unknown_error_occured), 0).show();
        AnonymousClass0cQ.H(this, 1747589921, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -2042066664);
        AnonymousClass30S anonymousClass30S = (AnonymousClass30S) obj;
        int I2 = AnonymousClass0cQ.I(this, -2118422781);
        AnonymousClass0MI J = AnonymousClass0Jd.f2931B.M(this.f50844D.f63469D).J(anonymousClass30S.f36810B, true);
        for (AnonymousClass0Pj anonymousClass0Pj : J.F()) {
            if (anonymousClass0Pj.f4137I == AnonymousClass17B.MEDIA) {
                anonymousClass0Pj.f4134F.A(J.getId());
            }
        }
        this.f50844D.A(this.f50842B.getResources().getString(C0164R.string.inline_added_notif_title, new Object[]{J.f3391X}), J.D());
        AnonymousClass0F4.f2058E.C(new AnonymousClass10U(J));
        AnonymousClass0HV.D(this.f50844D.f63469D).f2646B.edit().putBoolean("has_created_highlight_from_active_story", true).apply();
        if (this.f50843C.getContext() != null) {
            ((Activity) this.f50843C.getContext()).onBackPressed();
        }
        AnonymousClass0cQ.H(this, 1295736628, I2);
        AnonymousClass0cQ.H(this, 704777308, I);
    }
}
