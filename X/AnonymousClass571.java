package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.571 */
public final class AnonymousClass571 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final String f60248B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass572 f60249C;
    /* renamed from: D */
    private final String f60250D;
    /* renamed from: E */
    private long f60251E;

    public AnonymousClass571(AnonymousClass572 anonymousClass572, String str) {
        this(anonymousClass572, str, null);
    }

    public AnonymousClass571(AnonymousClass572 anonymousClass572, String str, String str2) {
        this.f60249C = anonymousClass572;
        this.f60248B = str;
        this.f60250D = str2;
    }

    /* renamed from: A */
    public final void m25774A(AnonymousClass2Ek anonymousClass2Ek) {
        int I = AnonymousClass0cQ.I(this, -1588751818);
        if (this.f60249C.f60257G && "phone_id".equals(this.f60248B)) {
            AnonymousClass571.m25773B(this, AnonymousClass0Fr.BailOnPhoneId, "bail_on_phone_id");
            AnonymousClass0cQ.H(this, -1473518509, I);
        } else if (anonymousClass2Ek.f27920E) {
            if (!TextUtils.isEmpty(this.f60250D)) {
                String str = this.f60250D;
                AnonymousClass0LH.E(str);
                AnonymousClass0LH.E(anonymousClass2Ek);
                AnonymousClass28A.f26480B = new Pair(str, anonymousClass2Ek);
            }
            String charSequence = ((TextView) this.f60249C.f60254D.getCurrentView()).getText().toString();
            CharSequence string = this.f60249C.getString(C0164R.string.continue_as_facebook, new Object[]{anonymousClass2Ek.f27919D});
            if (!string.equals(charSequence)) {
                this.f60249C.f60254D.setText(string);
            }
            AnonymousClass2NZ F = AnonymousClass0Fr.ShowContinueAsSucceeded.F(AnonymousClass2Na.LANDING_STEP);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f60249C.f60255E;
            F.f29744B.C("ts", elapsedRealtime);
            if (this.f60249C.f60258H != null) {
                boolean isEmpty = TextUtils.isEmpty(anonymousClass2Ek.f27922G) ^ true;
                F.C("has_social_context", isEmpty);
                if (isEmpty) {
                    int integer = this.f60249C.getResources().getInteger(17694721);
                    this.f60249C.f60258H.setAlpha(0.0f);
                    this.f60249C.f60258H.setText(anonymousClass2Ek.f27922G);
                    this.f60249C.f60258H.animate().alpha(1.0f).setDuration((long) integer).start();
                }
            }
            AnonymousClass2NZ.C(F, null, this.f60248B, "social_context");
            AnonymousClass0cQ.H(this, 784446352, I);
        } else {
            AnonymousClass571.m25773B(this, AnonymousClass0Fr.ShowContinueAsUserNotFound, "user_not_found");
            AnonymousClass0cQ.H(this, -1586535647, I);
        }
    }

    /* renamed from: B */
    private static void m25773B(AnonymousClass571 anonymousClass571, AnonymousClass0Fr anonymousClass0Fr, String str) {
        AnonymousClass2NZ.C(anonymousClass0Fr.F(AnonymousClass2Na.LANDING_STEP), str, anonymousClass571.f60248B, "social_context");
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1965333432);
        super.onFail(anonymousClass0Q6);
        AnonymousClass571.m25773B(this, AnonymousClass0Fr.ShowContinueAsFailed, "request_failed");
        AnonymousClass0cQ.H(this, 767865165, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1185498701);
        AnonymousClass0Fr.ShowContinueAsFinished.C(AnonymousClass2Na.LANDING_STEP).C("ts", SystemClock.elapsedRealtime() - this.f60251E).R();
        AnonymousClass0cQ.H(this, -1283061582, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -141495388);
        this.f60251E = SystemClock.elapsedRealtime();
        AnonymousClass0cQ.H(this, -806559348, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 2083097532);
        m25774A((AnonymousClass2Ek) obj);
        AnonymousClass0cQ.H(this, 394506618, I);
    }
}
