package com.facebook.xplat.fbglog;

import X.AnonymousClass0CF;
import X.AnonymousClass0Dc;
import X.AnonymousClass1CJ;

public class FbGlog {
    private static AnonymousClass1CJ sCallback;

    public static native void setLogLevel(int i);

    static {
        AnonymousClass0CF.m856E("fb");
    }

    public static synchronized void ensureSubscribedToBLogLevelChanges() {
        synchronized (FbGlog.class) {
            if (sCallback == null) {
                sCallback = new AnonymousClass1CJ();
                AnonymousClass1CJ anonymousClass1CJ = sCallback;
                synchronized (AnonymousClass0Dc.class) {
                    AnonymousClass0Dc.f1891B.add(anonymousClass1CJ);
                }
                setLogLevel(AnonymousClass0Dc.f1892C.YO());
            }
        }
    }
}
