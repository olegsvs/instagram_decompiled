package X;

import com.facebook.C0164R;

/* renamed from: X.4LO */
public enum AnonymousClass4LO {
    ONE_VIEW(C0164R.string.recipient_view_mode_one_view, C0164R.string.recipient_view_mode_one_view_upper_case, "once", C0164R.drawable.view_mode_once, C0164R.drawable.view_mode_once_shadow, C0164R.color.red_5, "once");
    
    /* renamed from: B */
    public final int f53008B;
    /* renamed from: C */
    public final int f53009C;
    /* renamed from: D */
    public final String f53010D;
    /* renamed from: E */
    public final int f53011E;
    /* renamed from: F */
    public final int f53012F;
    /* renamed from: G */
    public final int f53013G;
    /* renamed from: H */
    public final String f53014H;

    static {
        int i;
        int i2;
        ONE_VIEW = new AnonymousClass4LO("ONE_VIEW", 0, C0164R.string.recipient_view_mode_one_view, C0164R.string.recipient_view_mode_one_view_upper_case, "once", C0164R.drawable.view_mode_once, C0164R.drawable.view_mode_once_shadow, C0164R.color.red_5, "once");
        String str = "ALLOW_REPLAY";
        if (!((Boolean) AnonymousClass0E6.C(AnonymousClass0CC.eI)).booleanValue()) {
            if (!((Boolean) AnonymousClass0CC.lI.G()).booleanValue()) {
                i = C0164R.string.recipient_view_mode_allow_replay;
                if (!((Boolean) AnonymousClass0E6.C(AnonymousClass0CC.eI)).booleanValue()) {
                    if (((Boolean) AnonymousClass0CC.lI.G()).booleanValue()) {
                        i2 = C0164R.string.recipient_view_mode_allow_replay_upper_case;
                        f53005J = new AnonymousClass4LO(str, 1, i, i2, "replayable", C0164R.drawable.view_mode_replay, C0164R.drawable.view_mode_replay_shadow, C0164R.color.blue_5, "replay");
                        f53006K = new AnonymousClass4LO("KEEP_IN_CHAT", 2, C0164R.string.recipient_view_mode_keep_in_chat, C0164R.string.recipient_view_mode_keep_in_chat_upper_case, "permanent", C0164R.drawable.view_mode_permanent, C0164R.drawable.view_mode_permanent_shadow, C0164R.color.green_5, "permanent");
                        f53004I = new AnonymousClass4LO[]{ONE_VIEW, f53005J, f53006K};
                    }
                }
                i2 = C0164R.string.recipient_view_mode_allow_replay_upper_case_24_hours;
                f53005J = new AnonymousClass4LO(str, 1, i, i2, "replayable", C0164R.drawable.view_mode_replay, C0164R.drawable.view_mode_replay_shadow, C0164R.color.blue_5, "replay");
                f53006K = new AnonymousClass4LO("KEEP_IN_CHAT", 2, C0164R.string.recipient_view_mode_keep_in_chat, C0164R.string.recipient_view_mode_keep_in_chat_upper_case, "permanent", C0164R.drawable.view_mode_permanent, C0164R.drawable.view_mode_permanent_shadow, C0164R.color.green_5, "permanent");
                f53004I = new AnonymousClass4LO[]{ONE_VIEW, f53005J, f53006K};
            }
        }
        i = C0164R.string.recipient_view_mode_allow_replay_24_hours;
        if (((Boolean) AnonymousClass0E6.C(AnonymousClass0CC.eI)).booleanValue()) {
            if (((Boolean) AnonymousClass0CC.lI.G()).booleanValue()) {
                i2 = C0164R.string.recipient_view_mode_allow_replay_upper_case;
                f53005J = new AnonymousClass4LO(str, 1, i, i2, "replayable", C0164R.drawable.view_mode_replay, C0164R.drawable.view_mode_replay_shadow, C0164R.color.blue_5, "replay");
                f53006K = new AnonymousClass4LO("KEEP_IN_CHAT", 2, C0164R.string.recipient_view_mode_keep_in_chat, C0164R.string.recipient_view_mode_keep_in_chat_upper_case, "permanent", C0164R.drawable.view_mode_permanent, C0164R.drawable.view_mode_permanent_shadow, C0164R.color.green_5, "permanent");
                f53004I = new AnonymousClass4LO[]{ONE_VIEW, f53005J, f53006K};
            }
        }
        i2 = C0164R.string.recipient_view_mode_allow_replay_upper_case_24_hours;
        f53005J = new AnonymousClass4LO(str, 1, i, i2, "replayable", C0164R.drawable.view_mode_replay, C0164R.drawable.view_mode_replay_shadow, C0164R.color.blue_5, "replay");
        f53006K = new AnonymousClass4LO("KEEP_IN_CHAT", 2, C0164R.string.recipient_view_mode_keep_in_chat, C0164R.string.recipient_view_mode_keep_in_chat_upper_case, "permanent", C0164R.drawable.view_mode_permanent, C0164R.drawable.view_mode_permanent_shadow, C0164R.color.green_5, "permanent");
        f53004I = new AnonymousClass4LO[]{ONE_VIEW, f53005J, f53006K};
    }

    private AnonymousClass4LO(int i, int i2, String str, int i3, int i4, int i5, String str2) {
        this.f53012F = i;
        this.f53013G = i2;
        this.f53014H = str;
        this.f53008B = i3;
        this.f53009C = i4;
        this.f53011E = i5;
        this.f53010D = str2;
    }

    /* renamed from: B */
    public static AnonymousClass4LO m23940B(String str) {
        Object obj;
        int hashCode = str.hashCode();
        if (hashCode != -1212837439) {
            if (hashCode != 3415681) {
                if (hashCode == 668488878) {
                    if (str.equals("permanent")) {
                        obj = 1;
                        switch (obj) {
                            case null:
                                return ONE_VIEW;
                            case 1:
                                return f53006K;
                            default:
                                return f53005J;
                        }
                    }
                }
            } else if (str.equals("once")) {
                obj = null;
                switch (obj) {
                    case null:
                        return ONE_VIEW;
                    case 1:
                        return f53006K;
                    default:
                        return f53005J;
                }
            }
        } else if (str.equals("replayable")) {
            obj = 2;
            switch (obj) {
                case null:
                    return ONE_VIEW;
                case 1:
                    return f53006K;
                default:
                    return f53005J;
            }
        }
        obj = -1;
        switch (obj) {
            case null:
                return ONE_VIEW;
            case 1:
                return f53006K;
            default:
                return f53005J;
        }
    }
}
