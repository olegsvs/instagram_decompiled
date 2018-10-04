package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

/* renamed from: X.4yu */
public final class AnonymousClass4yu implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4z9 f59059B;

    public AnonymousClass4yu(AnonymousClass4z9 anonymousClass4z9) {
        this.f59059B = anonymousClass4z9;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Bundle bundle = new Bundle();
        AnonymousClass1P7.C(bundle, AnonymousClass1P7.ARGUMENT_TWOFAC_FLOW);
        new AnonymousClass0IZ(this.f59059B.getActivity()).F(AnonymousClass0GO.C().A().H(this.f59059B.f59084K), bundle).B();
        this.f59059B.f59083J.f18979C = false;
    }
}
