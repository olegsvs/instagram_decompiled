package X;

import android.util.Log;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.20m */
public final class AnonymousClass20m {
    /* renamed from: B */
    public final String f25228B;
    /* renamed from: C */
    public final String f25229C;
    /* renamed from: D */
    private final int f25230D;

    private AnonymousClass20m(String str, String str2) {
        this.f25229C = str2;
        this.f25228B = str;
        AnonymousClass1zJ anonymousClass1zJ = new AnonymousClass1zJ(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f25228B, i)) {
            i++;
        }
        this.f25230D = i;
    }

    public AnonymousClass20m(String str, String... strArr) {
        this(str, AnonymousClass20m.m14160B(strArr));
    }

    /* renamed from: B */
    private static String m14160B(String... strArr) {
        if (strArr.length == 0) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        StringBuilder stringBuilder = new StringBuilder("[");
        for (String str : strArr) {
            if (stringBuilder.length() > 1) {
                stringBuilder.append(",");
            }
            stringBuilder.append(str);
        }
        stringBuilder.append(']');
        stringBuilder.append(' ');
        return stringBuilder.toString();
    }

    /* renamed from: C */
    private final boolean m14161C(int i) {
        return this.f25230D <= i;
    }

    /* renamed from: A */
    public final void m14162A(String str, Object... objArr) {
        if (m14161C(3)) {
            if (objArr != null && objArr.length > 0) {
                str = String.format(str, objArr);
            }
            this.f25229C.concat(str);
        }
    }
}
