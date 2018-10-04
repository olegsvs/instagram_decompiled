package X;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.instagram.react.modules.base.IgNetworkingModule;
import java.util.concurrent.Callable;

/* renamed from: X.5sC */
public final class AnonymousClass5sC implements Callable {
    /* renamed from: B */
    public final /* synthetic */ IgNetworkingModule f69487B;
    /* renamed from: C */
    public final /* synthetic */ ReadableMap f69488C;
    /* renamed from: D */
    public final /* synthetic */ ReadableArray f69489D;
    /* renamed from: E */
    public final /* synthetic */ String f69490E;
    /* renamed from: F */
    public final /* synthetic */ String f69491F;

    public AnonymousClass5sC(IgNetworkingModule igNetworkingModule, String str, String str2, ReadableArray readableArray, ReadableMap readableMap) {
        this.f69487B = igNetworkingModule;
        this.f69490E = str;
        this.f69491F = str2;
        this.f69489D = readableArray;
        this.f69488C = readableMap;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        AnonymousClass0a8 buildRequest = IgNetworkingModule.buildRequest(this.f69487B, this.f69490E, this.f69491F, this.f69489D, this.f69488C);
        AnonymousClass0gN anonymousClass0gN = new AnonymousClass0gN();
        anonymousClass0gN.f8152H = AnonymousClass0Qv.API;
        anonymousClass0gN.f8146B = AnonymousClass0Qw.OnScreen;
        return new AnonymousClass0aC(buildRequest, anonymousClass0gN.A());
    }
}
