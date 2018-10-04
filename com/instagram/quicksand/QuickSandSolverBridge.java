package com.instagram.quicksand;

public class QuickSandSolverBridge {
    private static boolean sFailedToLoadLib = true;
    private long mQuickSandSolverHandle;

    private native long createQuickSandSolver(int i, int i2);

    private native void destroyQuickSandSolver(long j);

    private native boolean getStopFlagNative(long j);

    private native void resetStopFlagNative(long j);

    private native void setStopFlagNative(long j);

    private native int[] solveNative(String str, int i, long j);

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "quicksand";	 Catch:{ Throwable -> 0x0006 }
        X.AnonymousClass0CF.E(r0);	 Catch:{ Throwable -> 0x0006 }
        goto L_0x0009;	 Catch:{ Throwable -> 0x0006 }
    L_0x0006:
        r0 = 1;
        sFailedToLoadLib = r0;
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksand.QuickSandSolverBridge.<clinit>():void");
    }

    public QuickSandSolverBridge(int i, int i2) {
        this.mQuickSandSolverHandle = createQuickSandSolver(i, i2);
    }

    public final boolean getStopFlag() {
        return getStopFlagNative(this.mQuickSandSolverHandle);
    }

    public final void resetStopFlag() {
        resetStopFlagNative(this.mQuickSandSolverHandle);
    }

    public final void setStopFlag() {
        setStopFlagNative(this.mQuickSandSolverHandle);
    }

    public final int[] solve(String str, int i) {
        return solveNative(str, i, this.mQuickSandSolverHandle);
    }
}
