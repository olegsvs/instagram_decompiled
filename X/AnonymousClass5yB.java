package X;

/* renamed from: X.5yB */
public final class AnonymousClass5yB implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5yC f70431B;

    public AnonymousClass5yB(AnonymousClass5yC anonymousClass5yC) {
        this.f70431B = anonymousClass5yC;
    }

    public final void run() {
        if (this.f70431B.f70432B.isResumed()) {
            String str = "DELETE_COLLECTION_BACK_STACK_NAME";
            if (this.f70431B.f70432B.getFragmentManager().F(str) != null) {
                this.f70431B.f70432B.getFragmentManager().Q(str, 1);
            } else {
                this.f70431B.f70432B.getActivity().finish();
            }
        }
    }
}
