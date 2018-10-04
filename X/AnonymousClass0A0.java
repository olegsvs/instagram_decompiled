package X;

import com.facebook.breakpad.BreakpadManager;
import java.util.Map;

/* renamed from: X.0A0 */
public final class AnonymousClass0A0 implements AnonymousClass0DP {
    public final void YNA(String str, String str2, Object... objArr) {
        BreakpadManager.setCustomData(str, str2, objArr);
    }

    public final void cJA(String str) {
        BreakpadManager.removeCustomData(str);
    }

    public final String rK(String str) {
        return BreakpadManager.getCustomData(str);
    }

    public final Map wR() {
        return BreakpadManager.getCustomDataSnapshot();
    }
}
