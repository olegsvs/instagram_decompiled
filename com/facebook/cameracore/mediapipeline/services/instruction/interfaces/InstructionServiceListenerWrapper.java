package com.facebook.cameracore.mediapipeline.services.instruction.interfaces;

import X.AnonymousClass0OR;
import X.AnonymousClass2jc;
import X.AnonymousClass2je;
import X.AnonymousClass2jf;
import X.AnonymousClass2jg;
import X.AnonymousClass2jh;
import X.AnonymousClass2ji;
import X.AnonymousClass2jj;
import X.AnonymousClass3xp;
import android.os.Handler;
import android.os.Looper;

public class InstructionServiceListenerWrapper {
    public final AnonymousClass3xp mListener;
    private final Handler mUIHandler = new Handler(Looper.getMainLooper());

    public InstructionServiceListenerWrapper(AnonymousClass3xp anonymousClass3xp) {
        this.mListener = anonymousClass3xp;
    }

    public static AnonymousClass2jc autoInstructionTypeConversion(int i) {
        if (i < 0 || i >= AnonymousClass2jc.values().length) {
            return AnonymousClass2jc.None;
        }
        return AnonymousClass2jc.values()[i];
    }

    public void hideInstruction() {
        AnonymousClass0OR.D(this.mUIHandler, new AnonymousClass2ji(this), -1020888852);
    }

    public static AnonymousClass2jj instructionTypeConversion(int i) {
        if (i < 0 || i >= AnonymousClass2jj.values().length) {
            return AnonymousClass2jj.None;
        }
        return AnonymousClass2jj.values()[i];
    }

    public void setVisibleAutomaticInstruction(int i) {
        AnonymousClass0OR.D(this.mUIHandler, new AnonymousClass2jf(this, i), -1946141543);
    }

    public void showInstructionForToken(String str) {
        AnonymousClass0OR.D(this.mUIHandler, new AnonymousClass2jg(this, str), 538972451);
    }

    public void showInstructionWithCustomText(String str) {
        AnonymousClass0OR.D(this.mUIHandler, new AnonymousClass2jh(this, str), 1979820574);
    }

    public void showInstructionWithDuration(int i, float f) {
        AnonymousClass0OR.D(this.mUIHandler, new AnonymousClass2je(this, i, f), 1694124330);
    }
}
