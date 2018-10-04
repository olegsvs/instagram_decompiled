package X;

import android.widget.TextView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.5Wx */
public final class AnonymousClass5Wx implements AnonymousClass4kx {
    /* renamed from: B */
    public final AnonymousClass4l6 f65677B;
    /* renamed from: C */
    public final AnonymousClass0ES f65678C;
    /* renamed from: D */
    public final DirectPrivateStoryRecipientController f65679D;
    /* renamed from: E */
    public final AnonymousClass4io f65680E = AnonymousClass4io.B((DirectShareTarget) AnonymousClass0LH.F(this.f65681F.f56874F, "VisualMessageOneTapSendButtonDelegate must have a valid ShareTarget set in the model"));
    /* renamed from: F */
    public final AnonymousClass4lA f65681F;

    public AnonymousClass5Wx(AnonymousClass4l6 anonymousClass4l6, AnonymousClass0ES anonymousClass0ES, AnonymousClass4lA anonymousClass4lA, DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.f65677B = anonymousClass4l6;
        this.f65678C = anonymousClass0ES;
        this.f65681F = anonymousClass4lA;
        this.f65679D = directPrivateStoryRecipientController;
    }

    public final void bEA() {
        DirectShareTarget directShareTarget = this.f65681F.f56874F;
        ((AnonymousClass4im) this.f65678C.get()).B(this.f65680E);
        this.f65677B.dEA(directShareTarget, this.f65681F.f56871C, this.f65681F.f56873E);
    }

    public final void bz() {
        ((AnonymousClass4im) this.f65678C.get()).F(this.f65680E, this.f65679D.m27125B(this.f65681F.f56874F));
        this.f65677B.iz(this.f65681F.f56874F, this.f65681F.f56871C, this.f65681F.f56873E);
    }

    public final int xN(TextView textView) {
        return this.f65677B.vO(textView);
    }
}
