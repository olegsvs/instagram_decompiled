package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.6Fx */
public final class AnonymousClass6Fx extends AnonymousClass0IJ implements AnonymousClass3ih {
    /* renamed from: B */
    public CircularImageView f73489B;
    /* renamed from: C */
    public AnonymousClass0bz f73490C;
    /* renamed from: D */
    public AnonymousClass0IU f73491D;
    /* renamed from: E */
    public AnonymousClass6Fo f73492E;
    /* renamed from: F */
    public TextView f73493F;
    /* renamed from: G */
    public EditText f73494G;
    /* renamed from: H */
    public TextView f73495H;
    /* renamed from: I */
    private boolean f73496I;
    /* renamed from: J */
    private final TextWatcher f73497J = new AnonymousClass65v(this);

    public final int FK() {
        return -2;
    }

    public final void Tp() {
    }

    public final void Up(int i) {
    }

    public final boolean VY() {
        return false;
    }

    public final void Xe(int i, int i2) {
    }

    public final String getModuleName() {
        return "live_interactivity_viewer_question_submission_half_sheet";
    }

    public final boolean nW() {
        return false;
    }

    /* renamed from: B */
    public static AnonymousClass6Fx m29654B(Context context, AnonymousClass0IU anonymousClass0IU) {
        AnonymousClass6Fx anonymousClass6Fx = new AnonymousClass6Fx();
        anonymousClass6Fx.f73490C = AnonymousClass0bz.B(context);
        anonymousClass6Fx.f73491D = anonymousClass0IU;
        return anonymousClass6Fx;
    }

    public final float PW() {
        return AnonymousClass0bz.f6937R;
    }

    public final void We() {
        this.f73496I = false;
        AnonymousClass6Fo anonymousClass6Fo = this.f73492E;
        if (anonymousClass6Fo != null && anonymousClass6Fo.f73467B.f71652C != null) {
            anonymousClass6Fo.f73467B.f71652C.m29645A(new AnonymousClass6Fk());
        }
    }

    /* renamed from: b */
    public final void m29655b() {
        AnonymousClass0bz anonymousClass0bz = this.f73490C;
        if (anonymousClass0bz != null) {
            this.f73496I = false;
            anonymousClass0bz.B();
            View oS = oS();
            if (oS != null) {
                AnonymousClass0Nm.N(oS);
            }
        }
    }

    /* renamed from: c */
    public final void m29656c() {
        AnonymousClass0bz anonymousClass0bz = this.f73490C;
        if (anonymousClass0bz != null) {
            if (anonymousClass0bz.f6946J) {
                if (!this.f73496I) {
                    this.f73490C.B();
                }
            }
            this.f73496I = true;
            this.f73490C.D(this.f73491D, this);
        }
    }

    public final View oS() {
        return getView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1477634325);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_interactivity_viewer_question_submission_sheet, viewGroup, false);
        AnonymousClass0cQ.G(this, 508079861, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 449327483);
        super.onDestroy();
        this.f73492E = null;
        AnonymousClass0cQ.G(this, 1853960343, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 549465495);
        super.onDestroyView();
        EditText editText = this.f73494G;
        if (editText != null) {
            editText.removeTextChangedListener(this.f73497J);
            this.f73494G.setOnEditorActionListener(null);
        }
        this.f73489B = null;
        this.f73493F = null;
        this.f73494G = null;
        this.f73495H = null;
        AnonymousClass0cQ.G(this, -453678885, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 367181173);
        super.onResume();
        EditText editText = this.f73494G;
        if (editText != null) {
            editText.requestFocus();
            AnonymousClass0Nm.k(this.f73494G);
        }
        AnonymousClass0cQ.G(this, -1962037577, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f73489B = (CircularImageView) view.findViewById(C0164R.id.interactivity_question_input_user_avatar);
        this.f73493F = (TextView) view.findViewById(C0164R.id.question_composer_sheet_title);
        this.f73494G = (EditText) view.findViewById(C0164R.id.interactivity_question_input);
        this.f73495H = (TextView) view.findViewById(C0164R.id.interactivity_question_submit);
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f73495H);
        anonymousClass15z.f14385E = new AnonymousClass65w(this);
        anonymousClass15z.A();
        this.f73494G.setOnEditorActionListener(new AnonymousClass65x(this));
        this.f73494G.addTextChangedListener(this.f73497J);
    }
}
