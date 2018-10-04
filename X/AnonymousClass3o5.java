package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3o5 */
public final class AnonymousClass3o5 {
    /* renamed from: B */
    public Activity f44683B;
    /* renamed from: C */
    public final AnonymousClass0EE f44684C;
    /* renamed from: D */
    public final String f44685D;
    /* renamed from: E */
    public final String f44686E;
    /* renamed from: F */
    public final String f44687F;
    /* renamed from: G */
    public final boolean f44688G;
    /* renamed from: H */
    public final AnonymousClass0P7 f44689H;
    /* renamed from: I */
    public final String f44690I;
    /* renamed from: J */
    public final AnonymousClass0Ci f44691J;
    /* renamed from: K */
    public AnonymousClass3o4 f44692K;
    /* renamed from: L */
    public final AnonymousClass0Cm f44693L;
    /* renamed from: M */
    private final OnDismissListener f44694M;
    /* renamed from: N */
    private final OnClickListener f44695N;
    /* renamed from: O */
    private Dialog f44696O;
    /* renamed from: P */
    private final AnonymousClass0xa f44697P;
    /* renamed from: Q */
    private final AnonymousClass0gn f44698Q;

    private AnonymousClass3o5(Activity activity, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0P7 anonymousClass0P7, String str, String str2, AnonymousClass0xa anonymousClass0xa, AnonymousClass0gn anonymousClass0gn, OnDismissListener onDismissListener, boolean z, String str3, String str4, AnonymousClass3o4 anonymousClass3o4) {
        this.f44695N = new AnonymousClass3o1(this);
        this.f44683B = activity;
        this.f44684C = anonymousClass0EE;
        this.f44691J = anonymousClass0Ci;
        this.f44693L = anonymousClass0Cm;
        this.f44689H = anonymousClass0P7;
        this.f44690I = str;
        this.f44685D = str2;
        this.f44697P = anonymousClass0xa;
        this.f44698Q = anonymousClass0gn;
        this.f44694M = onDismissListener;
        this.f44688G = z;
        this.f44687F = str3;
        this.f44686E = str4;
        this.f44692K = anonymousClass3o4;
    }

    public AnonymousClass3o5(Activity activity, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0gn anonymousClass0gn) {
        this(activity, anonymousClass0EE, anonymousClass0Ci, anonymousClass0Cm, null, null, null, null, anonymousClass0gn, null, false, null, null, AnonymousClass3o4.USER);
    }

    public AnonymousClass3o5(Activity activity, AnonymousClass0EE anonymousClass0EE, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0xa anonymousClass0xa, boolean z) {
        AnonymousClass0P7 anonymousClass0P72 = anonymousClass0P7;
        this(activity, anonymousClass0EE, null, anonymousClass0Cm, anonymousClass0P72, anonymousClass0P72.getId(), null, anonymousClass0xa, null, null, z, null, null, AnonymousClass3o4.MEDIA);
    }

    public AnonymousClass3o5(Activity activity, AnonymousClass0EE anonymousClass0EE, AnonymousClass0P7 anonymousClass0P7, String str, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0xa anonymousClass0xa, OnDismissListener onDismissListener, boolean z, AnonymousClass3o4 anonymousClass3o4) {
        this(activity, anonymousClass0EE, null, anonymousClass0Cm, anonymousClass0P7, str, null, anonymousClass0xa, null, onDismissListener, z, null, null, anonymousClass3o4);
    }

    public AnonymousClass3o5(Activity activity, AnonymousClass0EE anonymousClass0EE, AnonymousClass0P7 anonymousClass0P7, String str, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0xa anonymousClass0xa, OnDismissListener onDismissListener, boolean z, String str2, String str3, AnonymousClass3o4 anonymousClass3o4) {
        Activity activity2 = activity;
        AnonymousClass0EE anonymousClass0EE2 = anonymousClass0EE;
        AnonymousClass0P7 anonymousClass0P72 = anonymousClass0P7;
        String str4 = str;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        AnonymousClass0xa anonymousClass0xa2 = anonymousClass0xa;
        OnDismissListener onDismissListener2 = onDismissListener;
        this(activity2, anonymousClass0EE2, null, anonymousClass0Cm2, anonymousClass0P72, str4, null, anonymousClass0xa2, null, onDismissListener2, z, str2, str3, anonymousClass3o4);
    }

    public AnonymousClass3o5(Activity activity, AnonymousClass0EE anonymousClass0EE, AnonymousClass0P7 anonymousClass0P7, String str, String str2, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0xa anonymousClass0xa, OnDismissListener onDismissListener, boolean z, AnonymousClass3o4 anonymousClass3o4) {
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this(activity, anonymousClass0EE, null, anonymousClass0Cm2, anonymousClass0P7, str, str2, anonymousClass0xa, null, onDismissListener, z, null, null, anonymousClass3o4);
    }

    /* renamed from: A */
    public final void m20720A() {
        int i;
        switch (this.f44692K.ordinal()) {
            case 1:
                i = C0164R.string.report_option_dialog_title_for_profile;
                break;
            case 3:
                i = C0164R.string.report_option_dialog_title;
                break;
            default:
                i = C0164R.string.report_option_dialog_title_for_post;
                break;
        }
        this.f44696O = new AnonymousClass0Sb(this.f44683B).Q(i).S(C0164R.style.DialogTitleText).G(AnonymousClass3o5.m20716B(this), this.f44695N).F(true).C();
        OnDismissListener onDismissListener = this.f44694M;
        if (onDismissListener != null) {
            this.f44696O.setOnDismissListener(onDismissListener);
        }
        this.f44696O.show();
        switch (this.f44692K.ordinal()) {
            case 0:
                AnonymousClass0P7 anonymousClass0P7 = this.f44689H;
                if (anonymousClass0P7 != null) {
                    AnonymousClass3oG.m20733F(this.f44684C, anonymousClass0P7.EA(), this.f44689H.TO(), this.f44693L.f1759C, AnonymousClass3oD.IG_REPORT_ACTION_OPRN_REPORT_DIALOG);
                    break;
                }
                break;
            case 1:
                AnonymousClass3oG.m20735H(this.f44684C, this.f44691J.getId(), this.f44693L.f1759C, AnonymousClass3oD.IG_REPORT_ACTION_OPRN_REPORT_DIALOG);
                AnonymousClass10A.B(this.f44683B, this.f44684C, this.f44691J, this.f44693L.B(), AnonymousClass1YY.ACTION_OPEN_REPORT_DIALOG);
                break;
            case 2:
                AnonymousClass3oG.m20729B(this.f44684C, this.f44690I, this.f44693L.f1759C, AnonymousClass3oD.IG_REPORT_ACTION_OPRN_REPORT_DIALOG);
                break;
            case 3:
                String str = this.f44687F;
                if (str != null) {
                    String str2 = this.f44686E;
                    if (str2 != null) {
                        AnonymousClass3oG.m20731D(this.f44684C, str, str2, this.f44693L.f1759C, AnonymousClass3oD.IG_REPORT_ACTION_OPRN_REPORT_DIALOG);
                        break;
                    }
                }
                break;
            default:
                break;
        }
        if (this.f44692K == AnonymousClass3o4.MEDIA || this.f44692K == AnonymousClass3o4.LIVE || this.f44692K == AnonymousClass3o4.DIRECT_STORY) {
            AnonymousClass10A.C(this.f44683B, this.f44684C, this.f44690I, AnonymousClass109.ACTION_OPEN_REPORT_DIALOG, this.f44693L.B());
        }
    }

    /* renamed from: B */
    public static CharSequence[] m20716B(AnonymousClass3o5 anonymousClass3o5) {
        Object obj;
        List arrayList = new ArrayList();
        arrayList.add(anonymousClass3o5.f44683B.getString(C0164R.string.report_option_spam));
        arrayList.add(anonymousClass3o5.f44683B.getString(C0164R.string.report_option_inappropriate));
        Object obj2 = 1;
        if (anonymousClass3o5.f44692K == AnonymousClass3o4.USER) {
            Boolean bool = anonymousClass3o5.f44691J.f1724S;
            if (bool == null ? false : bool.booleanValue()) {
                obj = 1;
                if (anonymousClass3o5.f44692K == AnonymousClass3o4.MEDIA) {
                    AnonymousClass0P7 anonymousClass0P7 = anonymousClass3o5.f44689H;
                    if (anonymousClass0P7 != null && anonymousClass0P7.cA()) {
                        if (anonymousClass3o5.f44689H.eB) {
                            if (((Boolean) AnonymousClass0CC.Vd.H(anonymousClass3o5.f44693L)).booleanValue()) {
                            }
                        }
                        if (!(obj == null && r4 == null)) {
                            arrayList.add(anonymousClass3o5.f44683B.getString(C0164R.string.report_option_fraud));
                        }
                        return (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
                    }
                }
                obj2 = null;
                arrayList.add(anonymousClass3o5.f44683B.getString(C0164R.string.report_option_fraud));
                return (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
            }
        }
        obj = null;
        if (anonymousClass3o5.f44692K == AnonymousClass3o4.MEDIA) {
            AnonymousClass0P7 anonymousClass0P72 = anonymousClass3o5.f44689H;
            if (anonymousClass3o5.f44689H.eB) {
                if (((Boolean) AnonymousClass0CC.Vd.H(anonymousClass3o5.f44693L)).booleanValue()) {
                }
            }
            arrayList.add(anonymousClass3o5.f44683B.getString(C0164R.string.report_option_fraud));
            return (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
        }
        obj2 = null;
        arrayList.add(anonymousClass3o5.f44683B.getString(C0164R.string.report_option_fraud));
        return (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
    }

    /* renamed from: C */
    public static void m20717C(AnonymousClass3o5 anonymousClass3o5, int i, AnonymousClass1YY anonymousClass1YY) {
        AnonymousClass3o5.m20719E(anonymousClass3o5, true);
        anonymousClass3o5.f44698Q.MFA(i);
        AnonymousClass1gv.B(anonymousClass3o5.f44693L).C(anonymousClass3o5.f44691J, i);
        AnonymousClass10A.B(anonymousClass3o5.f44683B, anonymousClass3o5.f44684C, anonymousClass3o5.f44691J, anonymousClass3o5.f44693L.B(), anonymousClass1YY);
    }

    /* renamed from: D */
    public static void m20718D(AnonymousClass3o5 anonymousClass3o5, int i) {
        if (anonymousClass3o5.f44692K == AnonymousClass3o4.USER) {
            boolean z = anonymousClass3o5.f44691J.f1721P;
            if (i != 18) {
                AnonymousClass3oG.m20735H(anonymousClass3o5.f44684C, anonymousClass3o5.f44691J.getId(), anonymousClass3o5.f44693L.f1759C, AnonymousClass3oD.IG_REPORT_ACTION_REPORT_AS_SPAM);
                AnonymousClass1fl.B(anonymousClass3o5.f44693L, anonymousClass3o5.f44691J, anonymousClass3o5.f44684C.getModuleName(), new AnonymousClass3o3(anonymousClass3o5, z), true);
                AnonymousClass3o5.m20717C(anonymousClass3o5, i, AnonymousClass1YY.ACTION_REPORT_AS_SPAM);
            } else {
                AnonymousClass0Cn anonymousClass0Cn = anonymousClass3o5.f44693L;
                AnonymousClass0Ci anonymousClass0Ci = anonymousClass3o5.f44691J;
                String moduleName = anonymousClass3o5.f44684C.getModuleName();
                AnonymousClass0Iw anonymousClass3o2 = new AnonymousClass3o2(anonymousClass3o5, z);
                AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
                anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
                anonymousClass0Pt.f4229M = AnonymousClass0IE.E("users/%s/report/", new Object[]{anonymousClass0Ci.getId()});
                AnonymousClass0GA H = anonymousClass0Pt.D("reason_id", String.valueOf(18)).D("source_name", moduleName).M(AnonymousClass0Pv.class).N().H();
                if (anonymousClass3o2 != null) {
                    H.f2849B = anonymousClass3o2;
                }
                AnonymousClass0Ix.D(H);
                AnonymousClass3o5.m20717C(anonymousClass3o5, i, AnonymousClass1YY.ACTION_REPORT_AS_FRAUD);
            }
            return;
        }
        AnonymousClass0Cn anonymousClass0Cn2;
        String moduleName2;
        AnonymousClass0xa anonymousClass0xa;
        if (anonymousClass3o5.f44692K != AnonymousClass3o4.MEDIA) {
            if (anonymousClass3o5.f44692K != AnonymousClass3o4.DIRECT_STORY) {
                if (anonymousClass3o5.f44692K == AnonymousClass3o4.LIVE) {
                    anonymousClass0Cn2 = anonymousClass3o5.f44693L;
                    moduleName = anonymousClass3o5.f44690I;
                    moduleName2 = anonymousClass3o5.f44684C.getModuleName();
                    AnonymousClass0Pt anonymousClass0Pt2 = new AnonymousClass0Pt(anonymousClass0Cn2);
                    anonymousClass0Pt2.f4226J = AnonymousClass0Pu.f4247G;
                    anonymousClass0Pt2.f4229M = AnonymousClass0IE.E("live/%s/flag/", new Object[]{moduleName});
                    AnonymousClass0Ix.D(anonymousClass0Pt2.D("source_name", moduleName2).M(AnonymousClass0Pv.class).N().H());
                    anonymousClass0xa = anonymousClass3o5.f44697P;
                    if (anonymousClass0xa != null) {
                        anonymousClass0xa.pn(AnonymousClass0x3.ORGANIC_REPORT);
                    }
                    if (i == 1) {
                        AnonymousClass3oG.m20729B(anonymousClass3o5.f44684C, anonymousClass3o5.f44690I, anonymousClass3o5.f44693L.f1759C, AnonymousClass3oD.IG_REPORT_ACTION_REPORT_AS_SPAM);
                    }
                    AnonymousClass10A.C(anonymousClass3o5.f44683B, anonymousClass3o5.f44684C, anonymousClass3o5.f44690I, AnonymousClass109.ACTION_REPORT_AS_SPAM, anonymousClass3o5.f44693L.B());
                    return;
                }
                return;
            }
        }
        anonymousClass0Cn2 = anonymousClass3o5.f44693L;
        String str = anonymousClass3o5.f44690I;
        String str2 = anonymousClass3o5.f44685D;
        moduleName2 = anonymousClass3o5.f44684C.getModuleName();
        AnonymousClass0Pt anonymousClass0Pt3 = new AnonymousClass0Pt(anonymousClass0Cn2);
        anonymousClass0Pt3.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt3.f4229M = AnonymousClass0IE.E("media/%s/flag_media/", new Object[]{str});
        AnonymousClass0Pt D = anonymousClass0Pt3.D("media_id", str).D("reason_id", String.valueOf(i)).D("source_name", moduleName2);
        if (str2 != null) {
            D.D("carousel_media_id", str2);
        }
        AnonymousClass0Ix.D(D.M(AnonymousClass0Pv.class).N().H());
        anonymousClass0xa = anonymousClass3o5.f44697P;
        if (anonymousClass0xa != null) {
            anonymousClass0xa.pn(i == 1 ? AnonymousClass0x3.ORGANIC_REPORT_SPAM : AnonymousClass0x3.ORGANIC_REPORT);
        }
        if (anonymousClass3o5.f44692K == AnonymousClass3o4.MEDIA && i == 1) {
            AnonymousClass0P7 anonymousClass0P7 = anonymousClass3o5.f44689H;
            if (anonymousClass0P7 != null) {
                AnonymousClass3oG.m20733F(anonymousClass3o5.f44684C, anonymousClass0P7.EA(), anonymousClass3o5.f44689H.TO(), anonymousClass3o5.f44693L.f1759C, AnonymousClass3oD.IG_REPORT_ACTION_REPORT_AS_SPAM);
                AnonymousClass10A.C(anonymousClass3o5.f44683B, anonymousClass3o5.f44684C, anonymousClass3o5.f44690I, i != 18 ? AnonymousClass109.ACTION_REPORT_AS_FRAUD : AnonymousClass109.ACTION_REPORT_AS_SPAM, anonymousClass3o5.f44693L.B());
            }
        }
        if (anonymousClass3o5.f44692K == AnonymousClass3o4.DIRECT_STORY && i == 1) {
            str2 = anonymousClass3o5.f44687F;
            if (str2 != null) {
                String str3 = anonymousClass3o5.f44686E;
                if (str3 != null) {
                    AnonymousClass3oG.m20731D(anonymousClass3o5.f44684C, str2, str3, anonymousClass3o5.f44693L.f1759C, AnonymousClass3oD.IG_REPORT_ACTION_REPORT_AS_SPAM);
                }
            }
        }
        if (i != 18) {
        }
        AnonymousClass10A.C(anonymousClass3o5.f44683B, anonymousClass3o5.f44684C, anonymousClass3o5.f44690I, i != 18 ? AnonymousClass109.ACTION_REPORT_AS_FRAUD : AnonymousClass109.ACTION_REPORT_AS_SPAM, anonymousClass3o5.f44693L.B());
    }

    /* renamed from: E */
    public static void m20719E(AnonymousClass3o5 anonymousClass3o5, boolean z) {
        anonymousClass3o5.f44691J.f1721P = z;
        AnonymousClass0F4.f2058E.B(new AnonymousClass0ko(anonymousClass3o5.f44691J, true));
    }
}
