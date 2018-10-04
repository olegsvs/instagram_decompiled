package X;

/* renamed from: X.0xT */
public final class AnonymousClass0xT {
    /* renamed from: B */
    public static String m8545B(String str) {
        Object obj;
        int hashCode = str.hashCode();
        if (hashCode != -1617792023) {
            if (hashCode != -815402058) {
                if (hashCode != -507525998) {
                    if (hashCode == 1939919392) {
                        if (str.equals("media_view")) {
                            obj = 3;
                            switch (obj) {
                                case null:
                                    return "profile";
                                case 1:
                                case 2:
                                case 3:
                                    return "p_page";
                                default:
                                    return str;
                            }
                        }
                    }
                } else if (str.equals("photo_view")) {
                    obj = 1;
                    switch (obj) {
                        case null:
                            return "profile";
                        case 1:
                        case 2:
                        case 3:
                            return "p_page";
                        default:
                            return str;
                    }
                }
            } else if (str.equals("self_profile")) {
                obj = null;
                switch (obj) {
                    case null:
                        return "profile";
                    case 1:
                    case 2:
                    case 3:
                        return "p_page";
                    default:
                        return str;
                }
            }
        } else if (str.equals("video_view")) {
            obj = 2;
            switch (obj) {
                case null:
                    return "profile";
                case 1:
                case 2:
                case 3:
                    return "p_page";
                default:
                    return str;
            }
        }
        obj = -1;
        switch (obj) {
            case null:
                return "profile";
            case 1:
            case 2:
            case 3:
                return "p_page";
            default:
                return str;
        }
    }

    /* renamed from: C */
    public static void m8546C(String str, String str2, String str3, String str4) {
        AnonymousClass0xT.m8547D(str, str2, str3, null, str4);
    }

    /* renamed from: D */
    public static void m8547D(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass34S.f37557D.A().m3298F("component", str).m3298F("unit_state", str3).m3298F("parent_unit", str4).m3298F("unit", str2).m3298F("action", "tap").m3298F("fb_user_id", str5).m3310R();
    }

    /* renamed from: E */
    public static void m8548E(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass0NN F = AnonymousClass34S.f37558E.A().m3298F("unit_state", str2).m3298F("parent_unit", str3).m3298F("unit", str).m3298F("fb_user_id", str5);
        if (str4 != null) {
            F.m3298F("error_message", str4);
        }
        F.m3310R();
    }
}
