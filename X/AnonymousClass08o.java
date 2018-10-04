package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.08o */
public final class AnonymousClass08o {
    /* renamed from: B */
    public final AnonymousClass0AJ f1007B;
    /* renamed from: C */
    private final Context f1008C;

    public AnonymousClass08o(Context context, AnonymousClass0AJ anonymousClass0AJ, AnonymousClass1E1 anonymousClass1E1) {
        this.f1008C = context;
        this.f1007B = anonymousClass0AJ;
        SharedPreferences C = AnonymousClass08o.m541C(this);
        String string = C.getString("mqtt_version", JsonProperty.USE_DEFAULT_NAME);
        String str = anonymousClass1E1.f15814B;
        if (!string.equals(str)) {
            m547C();
            AnonymousClass1D8.m9968B(C.edit().putString("mqtt_version", str));
        }
    }

    /* renamed from: A */
    public final List m545A() {
        Map all = AnonymousClass08o.m542D(this).getAll();
        List linkedList = new LinkedList();
        for (Entry entry : all.entrySet()) {
            try {
                entry.getKey();
                entry.getValue();
                AnonymousClass08n B = AnonymousClass08n.m538B(entry.getValue().toString());
                if (!(B == null || B.f1003C)) {
                    linkedList.add(B);
                }
            } catch (Throwable e) {
                AnonymousClass0Dc.m1246I("RegistrationState", e, "Parse failed", new Object[0]);
            }
        }
        return linkedList;
    }

    /* renamed from: B */
    public static AnonymousClass08n m540B(String str, SharedPreferences sharedPreferences) {
        String F = AnonymousClass08o.m544F(str, sharedPreferences);
        if (AnonymousClass1Cn.m9924D(F)) {
            return null;
        }
        try {
            return AnonymousClass08n.m538B(F);
        } catch (String str2) {
            AnonymousClass0Dc.m1246I("RegistrationState", str2, "Parse failed", new Object[0]);
            return null;
        }
    }

    /* renamed from: B */
    public final String m546B(String str) {
        AnonymousClass1DG.m10046B(AnonymousClass1Cn.m9924D(str) ^ 1);
        AnonymousClass08n B = AnonymousClass08o.m540B(str, AnonymousClass08o.m542D(this));
        if (B != null) {
            if (!B.f1003C) {
                long A = this.f1007B.m687A();
                if (B.f1005E.longValue() + 86400000 >= A) {
                    if (B.f1005E.longValue() <= A) {
                        return B.f1006F;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    public static SharedPreferences m541C(AnonymousClass08o anonymousClass08o) {
        return AnonymousClass1D6.m9967B(anonymousClass08o.f1008C, AnonymousClass1D6.f15630D);
    }

    /* renamed from: C */
    public final void m547C() {
        SharedPreferences D = AnonymousClass08o.m542D(this);
        Editor edit = D.edit();
        for (String str : D.getAll().keySet()) {
            AnonymousClass08n B = AnonymousClass08o.m540B(str, D);
            if (B == null) {
                AnonymousClass0Dc.m1245H("RegistrationState", "invalid value for %s", str);
            } else {
                B.f1006F = JsonProperty.USE_DEFAULT_NAME;
                B.f1005E = Long.valueOf(this.f1007B.m687A());
                try {
                    edit.putString(str, B.m539A());
                } catch (Throwable e) {
                    AnonymousClass0Dc.m1246I("RegistrationState", e, "RegistrationCacheEntry serialization failed", new Object[0]);
                }
            }
        }
        AnonymousClass1D8.m9968B(edit);
    }

    /* renamed from: D */
    public static SharedPreferences m542D(AnonymousClass08o anonymousClass08o) {
        return AnonymousClass1D6.m9967B(anonymousClass08o.f1008C, AnonymousClass1D6.f15634H);
    }

    /* renamed from: D */
    public final void m548D(String str) {
        AnonymousClass1DG.m10046B(AnonymousClass1Cn.m9924D(str) ^ 1);
        SharedPreferences D = AnonymousClass08o.m542D(this);
        AnonymousClass08n B = AnonymousClass08o.m540B(str, D);
        if (B == null) {
            AnonymousClass0Dc.m1243F("RegistrationState", "Missing entry");
            return;
        }
        B.f1006F = JsonProperty.USE_DEFAULT_NAME;
        B.f1005E = Long.valueOf(this.f1007B.m687A());
        AnonymousClass08o.m543E(str, B, D);
    }

    /* renamed from: E */
    public static boolean m543E(String str, AnonymousClass08n anonymousClass08n, SharedPreferences sharedPreferences) {
        try {
            AnonymousClass1D8.m9968B(sharedPreferences.edit().putString(str, anonymousClass08n.m539A()));
            return true;
        } catch (SharedPreferences sharedPreferences2) {
            AnonymousClass0Dc.m1246I("RegistrationState", sharedPreferences2, "RegistrationCacheEntry serialization failed", new Object[0]);
            return false;
        }
    }

    /* renamed from: E */
    public final boolean m549E(String str, String str2) {
        AnonymousClass1DG.m10046B(AnonymousClass1Cn.m9924D(str) ^ 1);
        AnonymousClass1DG.m10046B(AnonymousClass1Cn.m9924D(str2) ^ 1);
        AnonymousClass1D8.m9968B(AnonymousClass08o.m541C(this).edit().remove("auto_reg_retry"));
        SharedPreferences D = AnonymousClass08o.m542D(this);
        AnonymousClass08n B = AnonymousClass08o.m540B(str, D);
        if (B == null) {
            AnonymousClass0Dc.m1243F("RegistrationState", "Missing entry");
            return false;
        }
        B.f1006F = str2;
        B.f1005E = Long.valueOf(this.f1007B.m687A());
        return AnonymousClass08o.m543E(str, B, D);
    }

    /* renamed from: F */
    private static String m544F(String str, SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(str, JsonProperty.USE_DEFAULT_NAME);
        } catch (SharedPreferences sharedPreferences2) {
            AnonymousClass0Dc.m1246I("RegistrationState", sharedPreferences2, "get reg state string failed", new Object[0]);
            return null;
        }
    }
}
