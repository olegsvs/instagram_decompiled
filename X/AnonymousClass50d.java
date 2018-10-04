package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.50d */
public final class AnonymousClass50d extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass0IT {
    /* renamed from: B */
    public View f59263B;
    /* renamed from: C */
    public int f59264C;
    /* renamed from: D */
    public TextView f59265D;
    /* renamed from: E */
    public Handler f59266E = new Handler();
    /* renamed from: F */
    public String f59267F;
    /* renamed from: G */
    public String f59268G;
    /* renamed from: H */
    public AnonymousClass0Cn f59269H;
    /* renamed from: I */
    public View f59270I;
    /* renamed from: J */
    private boolean f59271J;
    /* renamed from: K */
    private boolean f59272K;
    /* renamed from: L */
    private final AnonymousClass50c f59273L = new AnonymousClass50c(this);
    /* renamed from: M */
    private String f59274M;

    public final String getModuleName() {
        return "user_password_recovery";
    }

    /* renamed from: B */
    public static String m25583B(AnonymousClass50d anonymousClass50d) {
        return "username".equals(anonymousClass50d.f59274M) ? anonymousClass50d.f59267F : null;
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.access_your_account);
        anonymousClass0eT.n(true);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass0FO.E(i, i2, intent, this.f59273L);
        super.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        AnonymousClass0Fr.RegBackPressed.C(AnonymousClass2Na.RECOVERY_PAGE).R();
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1856280317);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f59267F = (String) AnonymousClass0LH.E(arguments.getString("lookup_user_input"));
        arguments.getString("userid");
        this.f59271J = arguments.getBoolean("can_email_reset");
        this.f59272K = arguments.getBoolean("can_sms_reset");
        this.f59274M = (String) AnonymousClass0LH.E(arguments.getString("lookup_source"));
        this.f59269H = AnonymousClass0Ce.E(arguments);
        AnonymousClass0Fr.RegScreenLoaded.C(AnonymousClass2Na.RECOVERY_PAGE).F("search", this.f59274M).H("email", this.f59271J).H("phone", this.f59272K).R();
        AnonymousClass0cQ.G(this, 764573097, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -791689457);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_user_password_recovery, viewGroup, false);
        AnonymousClass3Xy.F((TextView) inflate.findViewById(C0164R.id.connect_with_facebook_textview), C0164R.color.grey_2);
        if (this.f59272K) {
            View findViewById = inflate.findViewById(C0164R.id.fragment_user_password_recovery_button_sms_reset_container);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new AnonymousClass50V(this));
        }
        if (this.f59271J) {
            findViewById = inflate.findViewById(C0164R.id.fragment_user_password_recovery_button_email_reset_container);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new AnonymousClass50W(this));
        }
        inflate.findViewById(C0164R.id.fragment_user_password_recovery_button_connect_with_facebook).setOnClickListener(new AnonymousClass50X(this));
        inflate.findViewById(C0164R.id.fragment_user_password_recovery_dont_have_access).setOnClickListener(new AnonymousClass50Y(this));
        CircularImageView circularImageView = (CircularImageView) inflate.findViewById(C0164R.id.user_profile_picture);
        TextView textView = (TextView) inflate.findViewById(C0164R.id.username_textview);
        CharSequence B = AnonymousClass50d.m25583B(this);
        if (B != null) {
            textView.setText(B);
            circularImageView.setUrl(getArguments().getString("user_profile_pic"));
        } else {
            circularImageView.setVisibility(8);
            textView.setVisibility(8);
            inflate.findViewById(C0164R.id.divider_row).setVisibility(8);
        }
        AnonymousClass0cQ.G(this, 424151089, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -45585454);
        super.onDestroyView();
        this.f59263B = null;
        this.f59265D = null;
        this.f59270I = null;
        AnonymousClass0cQ.G(this, -105329119, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, -1621545651);
        super.onStart();
        AnonymousClass0cQ.G(this, -549734070, F);
    }
}
