package X;

import android.content.Context;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.3KK */
public final class AnonymousClass3KK {
    /* renamed from: B */
    public static final Class f40166B = AnonymousClass3KK.class;

    /* renamed from: B */
    public static void m19403B(Context context) {
        AnonymousClass3K0.m19390C(context);
        AnonymousClass3K4.m19395B(context);
    }

    /* renamed from: C */
    public static AnonymousClass0XM m19404C(Context context) {
        if (AnonymousClass3K0.m19389B(context) == null) {
            return null;
        }
        return new AnonymousClass0XM(AnonymousClass0lg.SELF_UPDATE, new AnonymousClass1Qx(context.getString(C0164R.string.self_update_megaphone_title), context.getString(C0164R.string.self_update_megaphone_subtitle, new Object[]{Integer.valueOf(r5.f40127E)})));
    }

    /* renamed from: D */
    public static void m19405D(Context context, AnonymousClass3K6 anonymousClass3K6) {
        AnonymousClass3Jw B = AnonymousClass3K0.m19389B(context);
        if (B == null) {
            String name = f40166B.getName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(anonymousClass3K6.name());
            stringBuilder.append(" clicked but no build metadata present");
            AnonymousClass0Gn.C(name, stringBuilder.toString());
            return;
        }
        switch (anonymousClass3K6.ordinal()) {
            case 0:
                AnonymousClass0NN.B("self_update_job_megaphone_install", null).B("build_number", B.f40127E).R();
                break;
            case 1:
                AnonymousClass0NN.B("self_update_job_lockout_install", null).B("build_number", B.f40127E).R();
                break;
            default:
                break;
        }
        AnonymousClass0IW.Q(AnonymousClass3KD.m19399B(context, B), context);
    }

    /* renamed from: E */
    public static void m19406E(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        if (AnonymousClass0CB.F()) {
            Toast.makeText(context, "You cannot run SelfUpdate on Inhouse builds", 0).show();
            return;
        }
        AnonymousClass0NN.B("self_update_job_employee_force", null).R();
        AnonymousClass0Ix.D(new AnonymousClass3KJ(context, anonymousClass0Cm, new AnonymousClass404(context)));
    }
}
