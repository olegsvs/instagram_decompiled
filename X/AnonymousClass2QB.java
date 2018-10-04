package X;

import java.util.List;

/* renamed from: X.2QB */
public final class AnonymousClass2QB implements AnonymousClass1tP {
    /* renamed from: B */
    private final String f30302B;

    public AnonymousClass2QB(String str, List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                throw new AnonymousClass1tc("Mismatching number of values", str);
            }
        }
        this.f30302B = str;
    }

    /* renamed from: B */
    public static Boolean m15657B(String str) {
        if (str != null) {
            Object obj;
            int hashCode = str.hashCode();
            if (hashCode == 3392903) {
                if (str.equals("null")) {
                    obj = 1;
                    switch (obj) {
                        case null:
                        case 1:
                        case 2:
                            return Boolean.valueOf(true);
                        default:
                            break;
                    }
                }
            } else if (hashCode == 104980213) {
                if (str.equals("nnull")) {
                    obj = 2;
                    switch (obj) {
                        case null:
                        case 1:
                        case 2:
                            return Boolean.valueOf(true);
                        default:
                            break;
                    }
                }
            } else if (hashCode == 1509016093) {
                if (str.equals("catch_all")) {
                    obj = null;
                    switch (obj) {
                        case null:
                        case 1:
                        case 2:
                            return Boolean.valueOf(true);
                        default:
                            break;
                    }
                }
            }
            obj = -1;
            switch (obj) {
                case null:
                case 1:
                case 2:
                    return Boolean.valueOf(true);
                default:
                    break;
            }
        }
        return Boolean.valueOf(false);
    }

    public final String getName() {
        return this.f30302B;
    }

    public final boolean jb(AnonymousClass1ta anonymousClass1ta) {
        Object obj;
        String str = this.f30302B;
        int hashCode = str.hashCode();
        if (hashCode != 3392903) {
            if (hashCode != 104980213) {
                if (hashCode == 1509016093) {
                    if (str.equals("catch_all")) {
                        obj = null;
                        switch (obj) {
                            case null:
                                return true;
                            case 1:
                                return "NULL".equals(anonymousClass1ta.f23805C);
                            case 2:
                                return "NULL".equals(anonymousClass1ta.f23805C) ^ true;
                            default:
                                return false;
                        }
                    }
                }
            } else if (str.equals("nnull")) {
                obj = 2;
                switch (obj) {
                    case null:
                        return true;
                    case 1:
                        return "NULL".equals(anonymousClass1ta.f23805C);
                    case 2:
                        return "NULL".equals(anonymousClass1ta.f23805C) ^ true;
                    default:
                        return false;
                }
            }
        } else if (str.equals("null")) {
            obj = 1;
            switch (obj) {
                case null:
                    return true;
                case 1:
                    return "NULL".equals(anonymousClass1ta.f23805C);
                case 2:
                    return "NULL".equals(anonymousClass1ta.f23805C) ^ true;
                default:
                    return false;
            }
        }
        obj = -1;
        switch (obj) {
            case null:
                return true;
            case 1:
                return "NULL".equals(anonymousClass1ta.f23805C);
            case 2:
                return "NULL".equals(anonymousClass1ta.f23805C) ^ true;
            default:
                return false;
        }
    }
}
