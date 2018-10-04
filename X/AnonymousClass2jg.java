package X;

import com.facebook.cameracore.mediapipeline.services.instruction.interfaces.InstructionServiceListenerWrapper;

/* renamed from: X.2jg */
public final class AnonymousClass2jg implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ InstructionServiceListenerWrapper f33080B;
    /* renamed from: C */
    public final /* synthetic */ String f33081C;

    public AnonymousClass2jg(InstructionServiceListenerWrapper instructionServiceListenerWrapper, String str) {
        this.f33080B = instructionServiceListenerWrapper;
        this.f33081C = str;
    }

    public final void run() {
        if (this.f33080B.mListener != null) {
            AnonymousClass0F4.f2058E.B(new AnonymousClass37t(AnonymousClass37s.SHOW_TOKEN, null, this.f33081C, -1));
        }
    }
}
