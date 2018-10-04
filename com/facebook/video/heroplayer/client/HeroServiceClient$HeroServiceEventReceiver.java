package com.facebook.video.heroplayer.client;

import X.AnonymousClass17X;
import X.AnonymousClass17Z;
import X.AnonymousClass17a;
import X.AnonymousClass1Gl;
import X.AnonymousClass1H0;
import X.AnonymousClass1eB;
import X.AnonymousClass1xE;
import android.os.Bundle;
import android.os.ResultReceiver;

public class HeroServiceClient$HeroServiceEventReceiver extends ResultReceiver {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass17X f14778B;

    public HeroServiceClient$HeroServiceEventReceiver(AnonymousClass17X anonymousClass17X) {
        this.f14778B = anonymousClass17X;
        super(null);
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        AnonymousClass1H0 anonymousClass1H0 = (AnonymousClass1H0) bundle.getSerializable(AnonymousClass1H0.f16623C);
        AnonymousClass1Gl.m10573C("HeroServiceClient", "eventCallback(%d) %s", Integer.valueOf(i), anonymousClass1H0);
        if (AnonymousClass1xE.f24607B[AnonymousClass17Z.m9485B(i).ordinal()] == 1) {
            AnonymousClass17a anonymousClass17a = this.f14778B.f14766K;
            String str = ((AnonymousClass1eB) anonymousClass1H0).f20943C;
            if (anonymousClass17a.f14807E) {
                anonymousClass17a.f14805C.m9488A(str);
            }
        }
        this.f14778B.f14763H.m9484A(this.f14778B.f14757B, anonymousClass1H0);
        if (this.f14778B.f14761F != null) {
            this.f14778B.f14761F.send(i, bundle);
        }
    }
}
