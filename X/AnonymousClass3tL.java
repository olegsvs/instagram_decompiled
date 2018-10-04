package X;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.facebook.exoplayer.ipc.VideoPlayerServiceEvent;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3tL */
public final class AnonymousClass3tL {
    /* renamed from: C */
    private static final String f46035C = "ServiceEventCallbackImpl";
    /* renamed from: B */
    private final AtomicReference f46036B;

    public AnonymousClass3tL(AtomicReference atomicReference) {
        this.f46036B = atomicReference;
        String str = f46035C;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setting listener for event callback to: ");
        stringBuilder.append(atomicReference);
        AnonymousClass1Gl.C(str, stringBuilder.toString(), new Object[0]);
    }

    /* renamed from: A */
    public final void m21176A(AnonymousClass2l3 anonymousClass2l3, VideoPlayerServiceEvent videoPlayerServiceEvent) {
        AnonymousClass1Gl.C(f46035C, "skipping log because listener is null for event type: ", new Object[0]);
    }

    /* renamed from: B */
    public final void m21177B(AnonymousClass1H0 anonymousClass1H0) {
        AnonymousClass2pX anonymousClass2pX = (AnonymousClass2pX) this.f46036B.get();
        if (anonymousClass2pX != null) {
            int i = anonymousClass1H0.f16624B.f14803B;
            Bundle bundle = new Bundle();
            bundle.putSerializable(AnonymousClass1H0.f16623C, anonymousClass1H0);
            ResultReceiver resultReceiver = anonymousClass2pX.f34537B;
            if (resultReceiver != null) {
                resultReceiver.send(i, bundle);
            }
            return;
        }
        AnonymousClass1Gl.C(f46035C, "skipping log because listener is null", new Object[0]);
    }
}
