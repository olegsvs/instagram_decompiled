package com.instagram.util.creation;

import X.AnonymousClass0CF;
import X.AnonymousClass0Dc;
import X.AnonymousClass0GG;
import X.AnonymousClass0Kq;
import X.AnonymousClass0Ks;
import X.AnonymousClass0h3;
import X.AnonymousClass2Mi;
import X.AnonymousClass2Mj;

public class ShaderBridge {
    private static final Class TAG = ShaderBridge.class;
    private static final AnonymousClass0Ks sExecutor;
    public static boolean sLoaded = false;
    private static final Object sLock = new Object();

    private static native int compileProgram(String str, boolean z, boolean z2, boolean z3);

    static {
        AnonymousClass0Kq B = AnonymousClass0Kq.B();
        B.f3132F = "shaderbridge";
        sExecutor = B.A();
    }

    public static int compileProgram(String str) {
        return compileProgram(str, AnonymousClass0h3.B(), false, true);
    }

    public static boolean isLibrariesLoaded() {
        if (sLoaded) {
            return true;
        }
        boolean z;
        synchronized (sLock) {
            z = sLoaded;
        }
        return z;
    }

    public static void loadLibraries(AnonymousClass2Mj anonymousClass2Mj) {
        synchronized (sLock) {
            if (sLoaded) {
                anonymousClass2Mj.Jm(true);
                return;
            }
            AnonymousClass0GG.B(sExecutor, new AnonymousClass2Mi(anonymousClass2Mj), 1782253024);
        }
    }

    public static boolean loadLibrariesSync() {
        synchronized (sLock) {
            if (!sLoaded) {
                try {
                    AnonymousClass0CF.E("scrambler");
                    AnonymousClass0CF.E("glcommon");
                    AnonymousClass0CF.E("halide");
                    AnonymousClass0CF.E("cj_moz");
                    sLoaded = true;
                } catch (Throwable e) {
                    AnonymousClass0Dc.C(TAG, "Could not load native library", e);
                }
            }
        }
        return sLoaded;
    }
}
