package X;

import android.app.Dialog;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.36H */
public final class AnonymousClass36H {
    /* renamed from: B */
    public static final String f37822B = AnonymousClass0IE.E("%s/auth/token?next=", new Object[]{AnonymousClass1aX.C()});

    /* renamed from: B */
    public static void m18518B(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IL anonymousClass0IL, Dialog dialog, String str) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "business/account/claim_unowned_page/";
        AnonymousClass0Pt D = anonymousClass0Pt.M(AnonymousClass35A.class).N().D("fb_access_token", AnonymousClass0a2.B(anonymousClass0Cm));
        AnonymousClass0Fz loaderManager = anonymousClass0IL.getLoaderManager();
        AnonymousClass0GA H = D.H();
        H.f2849B = new AnonymousClass36G(dialog, anonymousClass0Cm, context, str);
        AnonymousClass0Px.B(context, loaderManager, H);
    }

    /* renamed from: C */
    public static void m18519C(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IL anonymousClass0IL, String str) {
        String str2;
        AnonymousClass33e.m18378B();
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        String I = AnonymousClass0a2.I(anonymousClass0Cm);
        String str3 = str;
        AnonymousClass33a.m18359D(str, "claim_page", "claim_page_row", I);
        Context context2 = context;
        context = new AnonymousClass0Sb(context, C0164R.layout.claim_page_dialog, 0).E(true).F(true).C();
        ((IgImageView) context.findViewById(C0164R.id.profile)).setUrl(anonymousClass0Cm2.B().DQ());
        TextView textView = (TextView) context.findViewById(C0164R.id.dialog_content);
        String string = context2.getString(C0164R.string.landing_terms);
        if (anonymousClass0Cm2.B().f1757z != null) {
            str2 = anonymousClass0Cm2.B().f1757z;
        } else {
            str2 = anonymousClass0Cm2.B().uT();
        }
        textView.setText(AnonymousClass1g3.C(string, new SpannableStringBuilder(context2.getString(C0164R.string.claim_page_content, new Object[]{str2, string})), new AnonymousClass1dB(context2, anonymousClass0Cm2.B(), AnonymousClass0rE.B("https://www.facebook.com/page_guidelines.php", context2), AnonymousClass0Ca.C(context2, C0164R.color.blue_8))));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        context.findViewById(C0164R.id.not_now).setOnClickListener(new AnonymousClass36D(str, anonymousClass0Cm2, context));
        context.findViewById(C0164R.id.claim_button).setOnClickListener(new AnonymousClass36E(anonymousClass0Cm2, context2, anonymousClass0IL, context, str3));
        context.show();
    }

    /* renamed from: D */
    public static void m18520D(Dialog dialog, boolean z) {
        ProgressBar progressBar = (ProgressBar) dialog.findViewById(C0164R.id.claim_button_spinner);
        View findViewById = dialog.findViewById(C0164R.id.claim_button);
        if (z) {
            progressBar.setVisibility(0);
            findViewById.setVisibility(8);
            return;
        }
        progressBar.setVisibility(8);
        findViewById.setVisibility(0);
    }
}
