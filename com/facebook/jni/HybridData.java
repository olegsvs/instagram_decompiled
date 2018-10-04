package com.facebook.jni;

import X.AnonymousClass0CF;
import X.AnonymousClass1Af;

public class HybridData {
    private Destructor mDestructor = new Destructor(this);

    public class Destructor extends AnonymousClass1Af {
        private long mNativePointer;

        public static native void deleteNative(long j);

        public Destructor(Object obj) {
            super(obj);
        }

        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }
    }

    static {
        AnonymousClass0CF.m856E("fbjni");
    }

    public final synchronized void resetNative() {
        this.mDestructor.destruct();
    }
}
