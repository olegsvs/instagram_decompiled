package X;

/* renamed from: X.27x */
public final class AnonymousClass27x {
    /* renamed from: B */
    public static boolean m14528B(AnonymousClass0Cm anonymousClass0Cm) {
        return !AnonymousClass27x.m14529C(anonymousClass0Cm).equals("bottom") && ((Boolean) AnonymousClass0CC.SV.H(anonymousClass0Cm)).booleanValue();
    }

    /* renamed from: C */
    public static String m14529C(AnonymousClass0Cm anonymousClass0Cm) {
        Object obj;
        String str = (String) AnonymousClass0CC.RV.H(anonymousClass0Cm);
        int hashCode = str.hashCode();
        if (hashCode != 115029) {
            if (hashCode == 108511772) {
                if (str.equals("right")) {
                    obj = null;
                    switch (obj) {
                        case null:
                            return "right";
                        case 1:
                            return "top";
                        default:
                            return "bottom";
                    }
                }
            }
        } else if (str.equals("top")) {
            obj = 1;
            switch (obj) {
                case null:
                    return "right";
                case 1:
                    return "top";
                default:
                    return "bottom";
            }
        }
        obj = -1;
        switch (obj) {
            case null:
                return "right";
            case 1:
                return "top";
            default:
                return "bottom";
        }
    }
}
