package X;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactMarker.MarkerListener;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.5t6 */
public final class AnonymousClass5t6 implements MarkerListener {
    /* renamed from: C */
    public static AnonymousClass5t6 f69631C;
    /* renamed from: B */
    public final Collection f69632B = Collections.synchronizedSet(new HashSet());

    public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        switch (reactMarkerConstants.ordinal()) {
            case 1:
                for (AnonymousClass0xU anonymousClass0xU : this.f69632B) {
                    anonymousClass0xU.f12561B.set(SystemClock.uptimeMillis());
                }
                return;
            case 10:
                for (AnonymousClass0xU anonymousClass0xU2 : this.f69632B) {
                    anonymousClass0xU2.f12573N.set(SystemClock.uptimeMillis());
                }
                return;
            case 11:
                for (AnonymousClass0xU anonymousClass0xU22 : this.f69632B) {
                    anonymousClass0xU22.f12572M.set(SystemClock.uptimeMillis());
                }
                return;
            case 16:
                for (AnonymousClass0xU anonymousClass0xU222 : this.f69632B) {
                    anonymousClass0xU222.f12564E.set(SystemClock.uptimeMillis());
                }
                return;
            case 17:
                for (AnonymousClass0xU anonymousClass0xU2222 : this.f69632B) {
                    anonymousClass0xU2222.f12563D.set(SystemClock.uptimeMillis());
                }
                return;
            case 45:
                for (AnonymousClass0xU anonymousClass0xU22222 : this.f69632B) {
                    anonymousClass0xU22222.f12577R.set(SystemClock.uptimeMillis());
                }
                return;
            case 46:
                for (AnonymousClass0xU anonymousClass0xU222222 : this.f69632B) {
                    anonymousClass0xU222222.f12576Q.set(SystemClock.uptimeMillis());
                }
                return;
            case ParserMinimalBase.INT_SLASH /*47*/:
                for (AnonymousClass0xU anonymousClass0xU2222222 : this.f69632B) {
                    anonymousClass0xU2222222.f12578S.set(SystemClock.uptimeMillis());
                }
                return;
            default:
                return;
        }
    }
}
