package X;

import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

/* renamed from: X.3WQ */
public final class AnonymousClass3WQ {
    /* renamed from: B */
    public final ImageView f41888B;
    /* renamed from: C */
    public final AutoCompleteTextView f41889C;
    /* renamed from: D */
    public AnonymousClass3KL f41890D;
    /* renamed from: E */
    public String f41891E;
    /* renamed from: F */
    public boolean f41892F = false;
    /* renamed from: G */
    public final TextWatcher f41893G = new AnonymousClass3WN(this);

    public AnonymousClass3WQ(AnonymousClass0IJ anonymousClass0IJ, AnonymousClass2Na anonymousClass2Na, AutoCompleteTextView autoCompleteTextView, ImageView imageView) {
        this.f41889C = autoCompleteTextView;
        this.f41888B = imageView;
        this.f41890D = new AnonymousClass3KL(anonymousClass0IJ.getActivity(), this.f41889C, anonymousClass2Na);
    }

    /* renamed from: A */
    public final void m19804A() {
        this.f41889C.setEnabled(false);
        this.f41888B.setEnabled(false);
        this.f41888B.setVisibility(4);
    }

    /* renamed from: B */
    public final void m19805B() {
        this.f41889C.setEnabled(true);
        this.f41888B.setEnabled(true);
        this.f41888B.setVisibility(AnonymousClass0Nm.P(this.f41889C) ? 4 : 0);
    }

    /* renamed from: C */
    public final void m19806C() {
        if (AnonymousClass0Nm.P(this.f41889C)) {
            boolean z;
            this.f41890D.m19408A();
            if (AnonymousClass0Nm.P(this.f41889C)) {
                if (!this.f41890D.f40172G) {
                    z = false;
                    this.f41892F = z;
                    this.f41891E = this.f41889C.getText().toString();
                }
            }
            z = true;
            this.f41892F = z;
            this.f41891E = this.f41889C.getText().toString();
        }
    }
}
