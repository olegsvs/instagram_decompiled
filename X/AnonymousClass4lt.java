package X;

import android.view.View;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.4lt */
public final class AnonymousClass4lt implements AnonymousClass3bA {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4lw f57011B;
    /* renamed from: C */
    public final /* synthetic */ GradientSpinner f57012C;
    /* renamed from: D */
    public final /* synthetic */ View f57013D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0P7 f57014E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0MI f57015F;

    public AnonymousClass4lt(AnonymousClass4lw anonymousClass4lw, GradientSpinner gradientSpinner, AnonymousClass0MI anonymousClass0MI, AnonymousClass0P7 anonymousClass0P7, View view) {
        this.f57011B = anonymousClass4lw;
        this.f57012C = gradientSpinner;
        this.f57015F = anonymousClass0MI;
        this.f57014E = anonymousClass0P7;
        this.f57013D = view;
    }

    public final void fl(long j) {
        AnonymousClass4lw.m25022C(this.f57012C);
        AnonymousClass4lw anonymousClass4lw = this.f57011B;
        AnonymousClass0OR.D(anonymousClass4lw.f57027C, new AnonymousClass4lu(anonymousClass4lw, this.f57015F, this.f57014E, this.f57013D), 937718982);
    }

    public final void onCancel() {
        AnonymousClass4lw.m25022C(this.f57012C);
    }

    public final void onStart() {
        this.f57012C.setVisibility(0);
        this.f57012C.F();
    }

    public final void yBA(boolean z, long j) {
        AnonymousClass4lw.m25022C(this.f57012C);
        AnonymousClass4lw anonymousClass4lw = this.f57011B;
        AnonymousClass0OR.D(anonymousClass4lw.f57027C, new AnonymousClass4lu(anonymousClass4lw, this.f57015F, this.f57014E, this.f57013D), 937718982);
    }
}
