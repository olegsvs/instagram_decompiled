package X;

import android.util.SparseArray;

/* renamed from: X.0xM */
public enum AnonymousClass0xM {
    AD_DESTINATION_WEB(1),
    AD_DESTINATION_APP_STORE(2),
    AD_DESTINATION_DEEPLINK(3),
    AD_DESTINATION_PHONE(4),
    AD_DESTINATION_MAP(5),
    AD_DESTINATION_CANVAS(6),
    AD_DESTINATION_LEAD_AD(7),
    AD_DESTINATION_PROFILE_VISIT(8);
    
    /* renamed from: L */
    private static final SparseArray f12526L = null;
    /* renamed from: B */
    private final int f12527B;

    static {
        f12526L = new SparseArray();
        AnonymousClass0xM[] values = AnonymousClass0xM.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass0xM anonymousClass0xM = values[i];
            f12526L.put(anonymousClass0xM.f12527B, anonymousClass0xM);
            i++;
        }
    }

    private AnonymousClass0xM(int i) {
        this.f12527B = i;
    }

    /* renamed from: A */
    public final int m8533A() {
        return this.f12527B;
    }

    /* renamed from: B */
    public static AnonymousClass0xM m8532B(int i) {
        return (AnonymousClass0xM) f12526L.get(i);
    }
}
