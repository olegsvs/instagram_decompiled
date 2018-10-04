package X;

import com.facebook.common.networkreachability.AndroidReachabilityListener;
import com.facebook.common.networkreachability.NetworkStateInfo;

/* renamed from: X.5RV */
public final class AnonymousClass5RV implements NetworkStateInfo {
    /* renamed from: B */
    public final /* synthetic */ AndroidReachabilityListener f63411B;

    public AnonymousClass5RV(AndroidReachabilityListener androidReachabilityListener) {
        this.f63411B = androidReachabilityListener;
    }

    public final int getNetworkState() {
        return this.f63411B.mNetworkTypeProvider.m29206A();
    }
}
