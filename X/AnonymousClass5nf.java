package X;

import android.view.View;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.5nf */
public final class AnonymousClass5nf extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6EI f69037B;

    public AnonymousClass5nf(AnonymousClass6EI anonymousClass6EI) {
        this.f69037B = anonymousClass6EI;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1988313828);
        if (this.f69037B.isResumed()) {
            AnonymousClass0eT.E(this.f69037B.getActivity()).Y(false);
            this.f69037B.f73147N.setVisibility(0);
        }
        Toast.makeText(this.f69037B.getContext(), C0164R.string.request_error, 1).show();
        if (this.f69037B.getView() != null) {
            this.f69037B.getView().findViewById(C0164R.id.loading_spinner).setVisibility(8);
        }
        AnonymousClass0cQ.H(this, 1208137642, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -2111521791);
        this.f69037B.f73142I = false;
        AnonymousClass0cQ.H(this, -1009485621, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -1664634381);
        this.f69037B.f73142I = true;
        AnonymousClass0eT.E(this.f69037B.getActivity()).Y(true);
        AnonymousClass6EI.m29571H(this.f69037B, false);
        AnonymousClass0cQ.H(this, 1968443658, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1893334584);
        AnonymousClass2MH anonymousClass2MH = (AnonymousClass2MH) obj;
        int I2 = AnonymousClass0cQ.I(this, 414474244);
        this.f69037B.f73151R = anonymousClass2MH.f29529B;
        AnonymousClass6EI.m29569F(this.f69037B);
        AnonymousClass6EI.m29571H(this.f69037B, true);
        if (this.f69037B.isResumed()) {
            AnonymousClass0eT.D(AnonymousClass0eT.E(this.f69037B.getActivity()));
        }
        View view = this.f69037B.getView();
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass5ne(this));
        }
        AnonymousClass0cQ.H(this, -291941832, I2);
        AnonymousClass0cQ.H(this, 790872673, I);
    }
}
