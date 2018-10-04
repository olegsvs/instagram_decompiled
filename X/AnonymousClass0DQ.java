package X;

import java.util.Formatter;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.0DQ */
public final class AnonymousClass0DQ implements AnonymousClass0DP {
    /* renamed from: B */
    private final Map f1866B = new TreeMap();

    public final void YNA(String str, String str2, Object... objArr) {
        if (str != null) {
            if (str2 != null) {
                if (objArr.length > 0) {
                    Appendable stringBuilder = new StringBuilder();
                    Formatter formatter = new Formatter(stringBuilder);
                    formatter.format(str2, objArr);
                    formatter.close();
                    str2 = stringBuilder.toString();
                }
                this.f1866B.put(str, str2);
                return;
            }
            cJA(str);
        }
    }

    public final void cJA(String str) {
        if (str != null) {
            this.f1866B.remove(str);
        }
    }

    public final String rK(String str) {
        return (String) this.f1866B.get(str);
    }

    public final Map wR() {
        return new TreeMap(this.f1866B);
    }
}
