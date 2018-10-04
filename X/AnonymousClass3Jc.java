package X;

import java.util.List;

/* renamed from: X.3Jc */
public final class AnonymousClass3Jc {
    /* renamed from: B */
    public static boolean m19350B(Object obj) {
        if (obj instanceof AnonymousClass44s) {
            return AnonymousClass3Jc.m19352D((AnonymousClass44s) obj);
        }
        if (obj instanceof AnonymousClass44t) {
            return AnonymousClass3Jc.m19354F((AnonymousClass44t) obj);
        }
        if (obj instanceof AnonymousClass44v) {
            return AnonymousClass3Jc.m19357I((AnonymousClass44v) obj);
        }
        if (obj instanceof AnonymousClass44u) {
            return AnonymousClass3Jc.m19356H((AnonymousClass44u) obj);
        }
        if (obj instanceof AnonymousClass3J4) {
            return AnonymousClass3Jc.m19355G((AnonymousClass3J4) obj);
        }
        if (obj instanceof AnonymousClass3Iz) {
            AnonymousClass3Iz anonymousClass3Iz = (AnonymousClass3Iz) obj;
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported DiscoveryGridSection type: ");
        stringBuilder.append(obj.getClass().toString());
        AnonymousClass3Jc.m19358J(stringBuilder.toString());
        return false;
    }

    /* renamed from: C */
    public static void m19351C(List list) {
        list = list.iterator();
        while (list.hasNext()) {
            if (!AnonymousClass3Jc.m19350B(list.next())) {
                list.remove();
            }
        }
    }

    /* renamed from: D */
    private static boolean m19352D(AnonymousClass44s anonymousClass44s) {
        if (anonymousClass44s.m21992A().f20802L == AnonymousClass1dy.CHANNEL) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot make FullWidthSection with item type: ");
        stringBuilder.append(anonymousClass44s.m21992A().f20802L.A());
        AnonymousClass3Jc.m19358J(stringBuilder.toString());
        return false;
    }

    /* renamed from: E */
    private static boolean m19353E(AnonymousClass1du anonymousClass1du) {
        anonymousClass1du = anonymousClass1du.f20802L;
        if (!(anonymousClass1du == AnonymousClass1dy.MEDIA || anonymousClass1du == AnonymousClass1dy.SUGGESTED_HASHTAG)) {
            if (anonymousClass1du != AnonymousClass1dy.LIVE_REPLAY) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    private static boolean m19354F(AnonymousClass44t anonymousClass44t) {
        StringBuilder stringBuilder;
        int RN = anonymousClass44t.RN();
        if (RN > 0) {
            if (RN <= 3) {
                int i = 0;
                while (i < anonymousClass44t.RN()) {
                    AnonymousClass1du QN = anonymousClass44t.QN(i);
                    if (AnonymousClass3Jc.m19353E(QN)) {
                        i++;
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Cannot make SingleRowSection with item type: ");
                        stringBuilder.append(QN.f20802L.A());
                        AnonymousClass3Jc.m19358J(stringBuilder.toString());
                        return false;
                    }
                }
                return true;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot make SingleRowSection section with ");
        stringBuilder.append(RN);
        stringBuilder.append(" items");
        AnonymousClass3Jc.m19358J(stringBuilder.toString());
        return false;
    }

    /* renamed from: G */
    private static boolean m19355G(AnonymousClass3J4 anonymousClass3J4) {
        if (anonymousClass3J4.f39995D != null) {
            if (!anonymousClass3J4.f39995D.isEmpty()) {
                return true;
            }
        }
        AnonymousClass3Jc.m19358J("Cannot make DiscoveryTabsInfo with empty tabs");
        return false;
    }

    /* renamed from: H */
    private static boolean m19356H(AnonymousClass44u anonymousClass44u) {
        AnonymousClass1dy anonymousClass1dy = anonymousClass44u.m21992A().f20802L;
        if (AnonymousClass1dy.ACCOUNT_RECS_AS_NETEGO.equals(anonymousClass1dy)) {
            AnonymousClass0ly anonymousClass0ly = (AnonymousClass0ly) anonymousClass44u.m21992A().f20795E;
            if (anonymousClass0ly == null) {
                AnonymousClass3Jc.m19358J("Cannot make TraySection with null accountRec unit");
                return false;
            }
            anonymousClass0ly.f9627E = false;
            return true;
        } else if (AnonymousClass1dy.IGTV_TRAY.equals(anonymousClass1dy)) {
            AnonymousClass11r anonymousClass11r;
            AnonymousClass1du A = anonymousClass44u.m21992A();
            AnonymousClass0n8 anonymousClass0n8 = null;
            if (A == null) {
                anonymousClass11r = null;
            } else {
                anonymousClass11r = (AnonymousClass11r) A.f20795E;
            }
            if (anonymousClass11r != null) {
                anonymousClass0n8 = anonymousClass11r.F();
            }
            if (anonymousClass0n8 != null) {
                return true;
            }
            AnonymousClass3Jc.m19358J("Cannot make an TraySection without a tv guide item.");
            return false;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot make TraySection with item type: ");
            stringBuilder.append(anonymousClass44u.m21992A().f20802L.A());
            AnonymousClass3Jc.m19358J(stringBuilder.toString());
            return false;
        }
    }

    /* renamed from: I */
    private static boolean m19357I(AnonymousClass44v anonymousClass44v) {
        for (int i = 0; i < anonymousClass44v.RN(); i++) {
            AnonymousClass1du QN = anonymousClass44v.QN(i);
            StringBuilder stringBuilder;
            if (i == anonymousClass44v.m22714D()) {
                Object obj;
                AnonymousClass1dy anonymousClass1dy = QN.f20802L;
                if (!(anonymousClass1dy == AnonymousClass1dy.MEDIA || anonymousClass1dy == AnonymousClass1dy.CHANNEL || anonymousClass1dy == AnonymousClass1dy.ACCOUNT_RECS)) {
                    if (anonymousClass1dy != AnonymousClass1dy.SPOTLIGHT) {
                        obj = null;
                        if (obj == null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Cannot make TwoByTwoSection with 2x2 item type: ");
                            stringBuilder.append(QN.f20802L.A());
                            AnonymousClass3Jc.m19358J(stringBuilder.toString());
                            return false;
                        }
                    }
                }
                obj = 1;
                if (obj == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Cannot make TwoByTwoSection with 2x2 item type: ");
                    stringBuilder.append(QN.f20802L.A());
                    AnonymousClass3Jc.m19358J(stringBuilder.toString());
                    return false;
                }
            } else if (!AnonymousClass3Jc.m19353E(QN)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot make TwoByTwoSection with fill item type: ");
                stringBuilder.append(QN.f20802L.A());
                AnonymousClass3Jc.m19358J(stringBuilder.toString());
                return false;
            }
        }
        return true;
    }

    /* renamed from: J */
    private static void m19358J(String str) {
        AnonymousClass0Gn.C("DiscoveryGridSectionValidator", str);
    }
}
