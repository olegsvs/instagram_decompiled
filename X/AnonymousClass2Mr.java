package X;

import android.content.Context;

/* renamed from: X.2Mr */
public final class AnonymousClass2Mr {
    /* renamed from: B */
    public static final int m15256B(Context context, int i, AnonymousClass0OA anonymousClass0OA, int i2, int i3) {
        String str = (String) AnonymousClass0CC.rl.G();
        if (((Boolean) AnonymousClass0CC.nl.G()).booleanValue()) {
            if (!str.isEmpty()) {
                return Math.max((int) (new AnonymousClass24d(context).f25648B.m13639A(str, new AnonymousClass2cm(i2, i3, anonymousClass0OA.bC.getDuration())).m13642A("min_bitrate", 0) * 1000), i);
            }
        }
        return i;
    }
}
