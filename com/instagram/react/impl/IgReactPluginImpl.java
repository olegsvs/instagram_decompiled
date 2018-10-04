package com.instagram.react.impl;

import X.AnonymousClass0Cn;
import X.AnonymousClass0IL;
import X.AnonymousClass0Il;
import X.AnonymousClass0Im;
import X.AnonymousClass0Io;
import X.AnonymousClass0NN;
import X.AnonymousClass0Rw;
import X.AnonymousClass0Rx;
import X.AnonymousClass0S0;
import android.app.Application;
import com.instagram.react.delegate.IgReactDelegate;

public class IgReactPluginImpl extends AnonymousClass0Il {
    /* renamed from: B */
    private Application f2923B;
    /* renamed from: C */
    private AnonymousClass0Rw f2924C;
    /* renamed from: D */
    private AnonymousClass0Im f2925D;

    public void addMemoryInfoToEvent(AnonymousClass0NN anonymousClass0NN) {
    }

    public IgReactPluginImpl(Application application) {
        this.f2923B = application;
    }

    public synchronized void destroySharedReactInstanceIfExists() {
        if (this.f2925D != null) {
            this.f2925D.m2339B();
        }
    }

    public synchronized AnonymousClass0Rw getFragmentFactory() {
        if (this.f2924C == null) {
            this.f2924C = new AnonymousClass0Rw();
        }
        return this.f2924C;
    }

    public synchronized AnonymousClass0Im getReactInstanceHolder() {
        if (this.f2925D == null) {
            this.f2925D = new AnonymousClass0Im(this.f2923B);
        }
        return this.f2925D;
    }

    public AnonymousClass0Rx newIgReactDelegate(AnonymousClass0IL anonymousClass0IL) {
        return new IgReactDelegate(anonymousClass0IL);
    }

    public AnonymousClass0Io newReactNativeLauncher(AnonymousClass0Cn anonymousClass0Cn) {
        return new AnonymousClass0S0(anonymousClass0Cn);
    }

    public AnonymousClass0Io newReactNativeLauncher(AnonymousClass0Cn anonymousClass0Cn, String str) {
        return new AnonymousClass0S0(anonymousClass0Cn, str);
    }
}
