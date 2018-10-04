package X;

/* renamed from: X.2Cx */
public final class AnonymousClass2Cx extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4w9 f27501B;
    /* renamed from: C */
    public final /* synthetic */ String f27502C;

    public AnonymousClass2Cx(String str, AnonymousClass4w9 anonymousClass4w9) {
        this.f27502C = str;
        this.f27501B = anonymousClass4w9;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1706668926);
        AnonymousClass4w9 anonymousClass4w9 = this.f27501B;
        if (anonymousClass4w9 != null) {
            anonymousClass4w9.f58625B.mWebLinkShimProgressDialog.dismiss();
            anonymousClass4w9.f58625B.getActivity().runOnUiThread(new AnonymousClass4w8(anonymousClass4w9));
        }
        AnonymousClass0cQ.H(this, -1598887407, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1370201831);
        AnonymousClass2Cr anonymousClass2Cr = (AnonymousClass2Cr) obj;
        int I2 = AnonymousClass0cQ.I(this, 129048784);
        String str = anonymousClass2Cr.f27476B;
        AnonymousClass1Un.f19165B.put(this.f27502C, str);
        AnonymousClass4w9 anonymousClass4w9 = this.f27501B;
        if (anonymousClass4w9 != null) {
            anonymousClass4w9.A(str);
        }
        AnonymousClass0cQ.H(this, 1485595846, I2);
        AnonymousClass0cQ.H(this, 697203656, I);
    }
}
