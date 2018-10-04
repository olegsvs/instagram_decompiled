package X;

import android.view.View;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.4rZ */
public final class AnonymousClass4rZ extends AnonymousClass0VA {
    /* renamed from: B */
    public AnonymousClass4rY f57920B;
    /* renamed from: C */
    public boolean f57921C;
    /* renamed from: D */
    public boolean f57922D;
    /* renamed from: E */
    public ProgressButton f57923E;

    public AnonymousClass4rZ(ProgressButton progressButton, String str, boolean z, AnonymousClass4rY anonymousClass4rY) {
        this.f57923E = progressButton;
        if (!(str == null || str.isEmpty())) {
            this.f57923E.setText(str);
        }
        this.f57920B = anonymousClass4rY;
        this.f57922D = false;
        this.f57921C = z;
        this.f57923E.setEnabled(this.f57921C);
    }

    /* renamed from: A */
    public final void m25213A() {
        this.f57922D = true;
        AnonymousClass4rZ.m25212B(this);
    }

    /* renamed from: B */
    public static void m25212B(AnonymousClass4rZ anonymousClass4rZ) {
        anonymousClass4rZ.f57923E.setShowProgressBar(anonymousClass4rZ.f57922D);
        ProgressButton progressButton = anonymousClass4rZ.f57923E;
        boolean z = !anonymousClass4rZ.f57922D && anonymousClass4rZ.f57921C;
        progressButton.setEnabled(z);
    }

    public final void wh(View view) {
        super.wh(view);
        this.f57923E.setOnClickListener(new AnonymousClass4rX(this));
    }
}
