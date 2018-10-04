package X;

import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.facebook.C0164R;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.3XF */
public final class AnonymousClass3XF extends AnonymousClass0VA {
    /* renamed from: B */
    public AnonymousClass3XE f42030B;
    /* renamed from: C */
    public OnEditorActionListener f42031C;
    /* renamed from: D */
    public ProgressButton f42032D;
    /* renamed from: E */
    private final OnEditorActionListener f42033E;
    /* renamed from: F */
    private boolean f42034F;
    /* renamed from: G */
    private TextView f42035G;
    /* renamed from: H */
    private final TextWatcher f42036H;

    public AnonymousClass3XF(AnonymousClass3XE anonymousClass3XE, TextView textView, ProgressButton progressButton) {
        this(anonymousClass3XE, textView, progressButton, C0164R.string.next);
    }

    public AnonymousClass3XF(AnonymousClass3XE anonymousClass3XE, TextView textView, ProgressButton progressButton, int i) {
        this.f42033E = new AnonymousClass3XB(this);
        this.f42036H = new AnonymousClass3XC(this);
        this.f42030B = anonymousClass3XE;
        this.f42035G = textView;
        this.f42032D = progressButton;
        this.f42032D.setText(i);
        this.f42032D.setEnabled(false);
        this.f42030B.Bv(false);
    }

    public AnonymousClass3XF(AnonymousClass3XE anonymousClass3XE, ProgressButton progressButton) {
        this(anonymousClass3XE, null, progressButton);
    }

    /* renamed from: A */
    public final void m19857A(boolean z) {
        AnonymousClass2NZ F;
        if (this.f42030B.DM() == null) {
            F = AnonymousClass0Fr.RegNextPressed.F(this.f42030B.IS());
        } else {
            F = AnonymousClass0Fr.RegNextPressed.G(this.f42030B.IS(), this.f42030B.DM());
        }
        F.m15362C("keyboard", z).m15364E();
        this.f42030B.ms();
    }

    /* renamed from: B */
    public final void m19858B() {
        this.f42034F = false;
        m19860D();
        this.f42030B.FH();
    }

    /* renamed from: C */
    public final void m19859C() {
        this.f42034F = true;
        m19860D();
        this.f42030B.bG();
    }

    /* renamed from: D */
    public final void m19860D() {
        this.f42032D.setShowProgressBar(this.f42034F);
        boolean z = !this.f42034F && this.f42030B.KY();
        this.f42032D.setEnabled(z);
        this.f42030B.Bv(z);
    }

    public final void St() {
        TextView textView = this.f42035G;
        if (textView != null) {
            textView.removeTextChangedListener(this.f42036H);
        }
    }

    public final void gi() {
        super.gi();
        this.f42035G = null;
        this.f42032D = null;
    }

    public final void gx() {
        TextView textView = this.f42035G;
        if (textView != null) {
            textView.addTextChangedListener(this.f42036H);
        }
        m19860D();
    }

    public final void wh(View view) {
        super.wh(view);
        this.f42032D.setOnClickListener(new AnonymousClass3XD(this));
        TextView textView = this.f42035G;
        if (textView != null) {
            OnEditorActionListener onEditorActionListener = this.f42031C;
            if (onEditorActionListener != null) {
                textView.setOnEditorActionListener(onEditorActionListener);
            } else {
                textView.setOnEditorActionListener(this.f42033E);
            }
        }
    }
}
