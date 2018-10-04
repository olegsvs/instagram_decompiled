package X;

import com.instagram.ui.text.FreeAutoCompleteTextView;

/* renamed from: X.5Z2 */
public final class AnonymousClass5Z2 implements AnonymousClass55m {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4zn f66313B;
    /* renamed from: C */
    public final /* synthetic */ FreeAutoCompleteTextView f66314C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass56A f66315D;

    public AnonymousClass5Z2(AnonymousClass4zn anonymousClass4zn, AnonymousClass56A anonymousClass56A, FreeAutoCompleteTextView freeAutoCompleteTextView) {
        this.f66313B = anonymousClass4zn;
        this.f66315D = anonymousClass56A;
        this.f66314C = freeAutoCompleteTextView;
    }

    public final void yd(AnonymousClass55n anonymousClass55n) {
        if (!anonymousClass55n.f60043F.isEmpty() && AnonymousClass4zn.m25547F(this.f66313B) && ((Boolean) AnonymousClass0CC.yh.G()).booleanValue()) {
            this.f66315D.m25724A(anonymousClass55n.f60043F);
            if (((Boolean) AnonymousClass0CC.xh.G()).booleanValue()) {
                this.f66314C.setThreshold(0);
            }
        }
    }
}
