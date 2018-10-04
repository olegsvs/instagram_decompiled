package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.1Ru */
public final class AnonymousClass1Ru extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ Activity f18663B;
    /* renamed from: C */
    public final /* synthetic */ String f18664C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Cm f18665D;

    public AnonymousClass1Ru(Activity activity, AnonymousClass0Cm anonymousClass0Cm, String str) {
        this.f18663B = activity;
        this.f18665D = anonymousClass0Cm;
        this.f18664C = str;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, 1538166672);
        super.onFail(anonymousClass0Q6);
        String str = "Survey fetch failed.";
        if (!(anonymousClass0Q6 == null || anonymousClass0Q6.f4287B == null || !(anonymousClass0Q6.f4287B instanceof AnonymousClass29N))) {
            str = ((AnonymousClass29N) anonymousClass0Q6.f4287B).f26716B.f26710D;
        }
        AnonymousClass0Gn.m1876C("rapid_feedback_controller", str);
        AnonymousClass0cQ.m5858H(this, -1192420888, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2 = obj;
        int I = AnonymousClass0cQ.m5859I(this, -1725164279);
        AnonymousClass2Z8 anonymousClass2Z8 = (AnonymousClass2Z8) obj2;
        int I2 = AnonymousClass0cQ.m5859I(this, -69202578);
        if (anonymousClass2Z8.f31309B != null) {
            Context context = this.f18663B;
            if (context != null) {
                Editor edit = AnonymousClass3h2.B(context).edit();
                edit.putLong(AnonymousClass3h2.f43351D, System.currentTimeMillis() / 1000);
                edit.apply();
                AnonymousClass0Cm anonymousClass0Cm = this.f18665D;
                Context context2 = this.f18663B;
                String str = this.f18664C;
                AnonymousClass2Z6 anonymousClass2Z6 = anonymousClass2Z8.f31309B;
                if (anonymousClass2Z6 != null) {
                    String str2 = anonymousClass2Z6.f31304B.f31307B;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = context2.getString(C0164R.string.structuredsurvey_default_intro_text);
                    }
                    String string = context2.getString(C0164R.string.structuredsurvey_default_intro_cta_text);
                    String str3 = anonymousClass2Z8.f31309B.f31304B.f31308C;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = context2.getString(C0164R.string.structuredsurvey_default_outro_text);
                    }
                    String str4 = anonymousClass2Z6.f31306D.f31290B;
                    String str5 = anonymousClass2Z6.f31305C;
                    AnonymousClass2Yz anonymousClass2Yz = anonymousClass2Z6.f31306D.f31291C;
                    if (anonymousClass2Yz != null) {
                        try {
                            String C = AnonymousClass2ZF.C(anonymousClass2Yz);
                            Bundle bundle = new Bundle();
                            bundle.putString("ARG_SERIALIZED_MODEL_DATA", C);
                            bundle.putString("ARG_TOAST_TEXT", str2);
                            bundle.putString("ARG_INTRO_TOAST_BUTTON", string);
                            bundle.putString("ARG_OUTRO_TOAST_TEXT", str3);
                            bundle.putString("ARG_INTEGRATION_POINT_ID", str);
                            bundle.putString("ARG_SURVEY_ID", str4);
                            bundle.putString("ARG_SESSION_BLOB", str5);
                            new AnonymousClass0Sn(TransparentModalActivity.class, "rapid_feedback", bundle, context2, anonymousClass0Cm.f1759C).m4403B(context2);
                        } catch (Throwable e) {
                            throw new RuntimeException(e);
                        }
                    }
                    Toast.makeText(context2.getApplicationContext(), C0164R.string.instagram_survey_inactive, 0).show();
                }
            }
        }
        AnonymousClass0cQ.m5858H(this, -156227069, I2);
        AnonymousClass0cQ.m5858H(this, 2119043181, I);
    }
}
