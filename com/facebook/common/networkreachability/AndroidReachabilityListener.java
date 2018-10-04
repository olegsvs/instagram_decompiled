package com.facebook.common.networkreachability;

import X.AnonymousClass0CF;
import X.AnonymousClass5RV;
import X.AnonymousClass68m;
import com.facebook.jni.HybridData;

public class AndroidReachabilityListener {
    private static final Class TAG = AndroidReachabilityListener.class;
    private final HybridData mHybridData;
    private final NetworkStateInfo mNetworkStateInfo;
    public final AnonymousClass68m mNetworkTypeProvider;

    private native HybridData initHybrid(NetworkStateInfo networkStateInfo);

    public native void networkStateChanged(int i, int i2);

    static {
        AnonymousClass0CF.E("android-reachability-announcer");
    }

    public AndroidReachabilityListener(AnonymousClass68m anonymousClass68m) {
        NetworkStateInfo anonymousClass5RV = new AnonymousClass5RV(this);
        this.mNetworkStateInfo = anonymousClass5RV;
        this.mHybridData = initHybrid(anonymousClass5RV);
        this.mNetworkTypeProvider = anonymousClass68m;
    }
}
