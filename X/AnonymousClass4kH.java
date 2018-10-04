package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.facebook.C0164R;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.4kH */
public final class AnonymousClass4kH {
    /* renamed from: B */
    public static void m24967B(AnonymousClass0Cm anonymousClass0Cm, Context context, String str, String str2) {
        Object trim = str2.trim();
        if (trim.length() > 20) {
            Toast.makeText(context, C0164R.string.direct_thread_title_change_error_too_long, 0).show();
            AnonymousClass0F4.f2058E.B(new AnonymousClass4kG(str, AnonymousClass4kF.FAIL));
        } else if (TextUtils.isEmpty(trim)) {
            AnonymousClass0F4.f2058E.B(new AnonymousClass4kG(str, AnonymousClass4kF.FAIL));
        } else {
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            AnonymousClass0GA H = anonymousClass0Pt.L("direct_v2/threads/%s/update_title/", new Object[]{str}).D("use_unified_inbox", "true").D(DialogModule.KEY_TITLE, trim).M(AnonymousClass4hh.class).H();
            H.f2849B = new AnonymousClass4kE(anonymousClass0Cm, str, context);
            AnonymousClass0Ix.D(H);
        }
    }

    /* renamed from: C */
    public static boolean m24968C(AnonymousClass0Vw anonymousClass0Vw) {
        if (!(anonymousClass0Vw == null || anonymousClass0Vw.F() == null || anonymousClass0Vw.F().f5871C == null)) {
            if (!anonymousClass0Vw.c()) {
                return true;
            }
            if (anonymousClass0Vw.J().size() > 1) {
                return true;
            }
        }
        return false;
    }
}
