package X;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.text.TextUtils;
import com.facebook.C0164R;

/* renamed from: X.1fk */
public class AnonymousClass1fk extends AnonymousClass0Iw {
    /* renamed from: B */
    public final Context f21246B;
    /* renamed from: C */
    private final AnonymousClass3XF f21247C;
    /* renamed from: D */
    private boolean f21248D;
    /* renamed from: E */
    private OnDismissListener f21249E;

    public AnonymousClass1fk(Context context, AnonymousClass3XF anonymousClass3XF) {
        this.f21246B = context;
        this.f21247C = anonymousClass3XF;
    }

    /* renamed from: A */
    public void m12425A(AnonymousClass2Df anonymousClass2Df) {
        int I = AnonymousClass0cQ.m5859I(this, 1932809641);
        if (TextUtils.isEmpty(anonymousClass2Df.f27638E)) {
            if (!TextUtils.isEmpty(anonymousClass2Df.f27637D) && !TextUtils.isEmpty(anonymousClass2Df.f27635B)) {
                AnonymousClass1fk.m12424B(this, anonymousClass2Df.f27637D, anonymousClass2Df.f27635B);
            } else if (this.f21248D) {
                AnonymousClass1fk.m12424B(this, null, this.f21246B.getString(C0164R.string.password_reset_sent_short));
            } else {
                AnonymousClass0IG.m2164F(C0164R.string.password_reset_sent_short);
            }
        } else if (this.f21248D) {
            AnonymousClass1fk.m12424B(this, this.f21246B.getString(C0164R.string.password_reset_sent_short), anonymousClass2Df.f27638E);
        } else {
            AnonymousClass0IG.m2167I(anonymousClass2Df.f27638E);
        }
        AnonymousClass0cQ.m5858H(this, -1370760612, I);
    }

    /* renamed from: B */
    public static void m12424B(AnonymousClass1fk anonymousClass1fk, String str, String str2) {
        AnonymousClass0Sb anonymousClass0Sb = new AnonymousClass0Sb(anonymousClass1fk.f21246B);
        if (str != null) {
            anonymousClass0Sb.m4376R(str);
        }
        anonymousClass0Sb.m4367I(str2).m4373O(C0164R.string.ok, null).m4372N(anonymousClass1fk.f21249E).m4361C().show();
    }

    public void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        CharSequence string;
        int I = AnonymousClass0cQ.m5859I(this, -547096977);
        if (!anonymousClass0Q6.m3973B() || TextUtils.isEmpty(((AnonymousClass2Df) anonymousClass0Q6.f4288C).f27636C)) {
            string = this.f21246B.getString(C0164R.string.request_error);
        } else {
            string = ((AnonymousClass2Df) anonymousClass0Q6.f4288C).f27636C;
        }
        if (this.f21248D) {
            new AnonymousClass0Sb(this.f21246B).m4367I(string).m4373O(C0164R.string.ok, null).m4361C().show();
        } else {
            AnonymousClass0IG.m2167I(string);
        }
        AnonymousClass0cQ.m5858H(this, -201996041, I);
    }

    public void onFinish() {
        int I = AnonymousClass0cQ.m5859I(this, -426021182);
        super.onFinish();
        AnonymousClass3XF anonymousClass3XF = this.f21247C;
        if (anonymousClass3XF != null) {
            anonymousClass3XF.B();
        }
        AnonymousClass0cQ.m5858H(this, 377985985, I);
    }

    public void onStart() {
        int I = AnonymousClass0cQ.m5859I(this, -420231557);
        super.onStart();
        AnonymousClass3XF anonymousClass3XF = this.f21247C;
        if (anonymousClass3XF != null) {
            anonymousClass3XF.C();
        }
        AnonymousClass0cQ.m5858H(this, 674034795, I);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, -433924964);
        m12425A((AnonymousClass2Df) obj);
        AnonymousClass0cQ.m5858H(this, -300879432, I);
    }
}
