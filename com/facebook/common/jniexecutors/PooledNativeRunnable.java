package com.facebook.common.jniexecutors;

import X.AnonymousClass00v;
import X.AnonymousClass00w;
import X.AnonymousClass00x;
import X.AnonymousClass0A5;
import X.AnonymousClass1tG;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.jni.HybridData;

public class PooledNativeRunnable extends NativeRunnable {
    private static final AnonymousClass00v sPool;

    static {
        AnonymousClass00w anonymousClass00w = new AnonymousClass00w(PooledNativeRunnable.class, AwakeTimeSinceBootClock.get());
        anonymousClass00w.f118B = new AnonymousClass1tG(PooledNativeRunnable.class);
        if (anonymousClass00w.f120D != null) {
            AnonymousClass0A5 anonymousClass0A5 = anonymousClass00w.f118B;
            if (anonymousClass0A5 == null) {
                anonymousClass0A5 = new AnonymousClass0A5(anonymousClass00w.f119C);
            }
            AnonymousClass00v anonymousClass00v = new AnonymousClass00v(anonymousClass00w.f119C, anonymousClass00w.f125I, anonymousClass00w.f124H, anonymousClass00w.f122F, anonymousClass00w.f121E, anonymousClass0A5, anonymousClass00w.f120D);
            AnonymousClass00x anonymousClass00x = anonymousClass00w.f123G;
            if (anonymousClass00x != null) {
                anonymousClass00x.f126B.put(anonymousClass00w.f119C, anonymousClass00v);
            }
            sPool = anonymousClass00v;
            return;
        }
        throw new IllegalArgumentException("Must add a clock to the object pool builder");
    }

    public PooledNativeRunnable() {
        super(null);
    }

    public static PooledNativeRunnable allocate(HybridData hybridData) {
        Object obj;
        AnonymousClass00v anonymousClass00v = sPool;
        synchronized (anonymousClass00v) {
            if (anonymousClass00v.f116J > 0) {
                anonymousClass00v.f116J--;
                obj = anonymousClass00v.f115I[anonymousClass00v.f116J];
                anonymousClass00v.f115I[anonymousClass00v.f116J] = null;
            } else {
                obj = anonymousClass00v.f108B.A();
            }
        }
        PooledNativeRunnable pooledNativeRunnable = (PooledNativeRunnable) obj;
        pooledNativeRunnable.mHybridData = hybridData;
        return pooledNativeRunnable;
    }

    public final void run() {
        super.run();
        AnonymousClass00v anonymousClass00v = sPool;
        synchronized (anonymousClass00v) {
            int max;
            synchronized (anonymousClass00v) {
                long now = anonymousClass00v.f109C.now();
                if (anonymousClass00v.f116J < anonymousClass00v.f111E * 2) {
                    anonymousClass00v.f112F = now;
                }
                if (now - anonymousClass00v.f112F > anonymousClass00v.f110D) {
                    synchronized (anonymousClass00v) {
                        max = Math.max(anonymousClass00v.f115I.length - anonymousClass00v.f111E, anonymousClass00v.f114H);
                        if (max != anonymousClass00v.f115I.length) {
                            AnonymousClass00v.B(anonymousClass00v, max);
                        }
                    }
                }
            }
            anonymousClass00v.f108B.B(this);
            if (anonymousClass00v.f116J < anonymousClass00v.f113G) {
                if (anonymousClass00v.f116J + 1 > anonymousClass00v.f115I.length) {
                    AnonymousClass00v.B(anonymousClass00v, Math.min(anonymousClass00v.f113G, anonymousClass00v.f115I.length + anonymousClass00v.f111E));
                }
                Object[] objArr = anonymousClass00v.f115I;
                max = anonymousClass00v.f116J;
                anonymousClass00v.f116J = max + 1;
                objArr[max] = this;
            }
        }
    }
}
