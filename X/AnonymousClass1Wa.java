package X;

import android.content.Context;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import com.instagram.ui.widget.textview.IgTextLayoutView;
import java.util.List;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.1Wa */
public final class AnonymousClass1Wa extends AnonymousClass0TA {
    /* renamed from: B */
    public AnonymousClass3LF f19547B;
    /* renamed from: C */
    public AnonymousClass1YS f19548C;
    /* renamed from: D */
    public AnonymousClass0pU f19549D;
    /* renamed from: E */
    public AnonymousClass0pT f19550E;
    /* renamed from: F */
    public AnonymousClass0pI f19551F;
    /* renamed from: G */
    public final AnonymousClass0kW f19552G;
    /* renamed from: H */
    public final Context f19553H;
    /* renamed from: I */
    public AnonymousClass0jx f19554I;
    /* renamed from: J */
    public final boolean f19555J;
    /* renamed from: K */
    public AnonymousClass0pD f19556K;
    /* renamed from: L */
    public AnonymousClass0jZ f19557L;
    /* renamed from: M */
    public String f19558M;
    /* renamed from: N */
    public final AnonymousClass0p8 f19559N;
    /* renamed from: O */
    public final AnonymousClass0jK f19560O;
    /* renamed from: P */
    public AnonymousClass0pE f19561P;
    /* renamed from: Q */
    public final AnonymousClass0PZ f19562Q;
    /* renamed from: R */
    public final boolean f19563R;
    /* renamed from: S */
    public final boolean f19564S;
    /* renamed from: T */
    public AnonymousClass0pG f19565T;
    /* renamed from: U */
    public AnonymousClass0pQ f19566U;
    /* renamed from: V */
    public AnonymousClass0pS f19567V;
    /* renamed from: W */
    public AnonymousClass0pO f19568W;
    /* renamed from: X */
    public AnonymousClass0pR f19569X;
    /* renamed from: Y */
    public final AnonymousClass0ek f19570Y;
    /* renamed from: Z */
    public final AnonymousClass0ew f19571Z;
    /* renamed from: a */
    public final AnonymousClass0jC f19572a;
    /* renamed from: b */
    public AnonymousClass0pP f19573b;
    /* renamed from: c */
    public boolean f19574c;
    /* renamed from: d */
    public boolean f19575d;
    /* renamed from: e */
    public boolean f19576e;
    /* renamed from: f */
    public final AnonymousClass3mP f19577f;
    /* renamed from: g */
    public final AnonymousClass0db f19578g;
    /* renamed from: h */
    public AnonymousClass0pL f19579h;
    /* renamed from: i */
    public final AnonymousClass0Ci f19580i;
    /* renamed from: j */
    public final AnonymousClass0Cm f19581j;
    /* renamed from: k */
    public AnonymousClass0pC f19582k;
    /* renamed from: l */
    private boolean f19583l;
    /* renamed from: m */
    private final AnonymousClass0iQ f19584m;
    /* renamed from: n */
    private final AnonymousClass0Fz f19585n;
    /* renamed from: o */
    private final AnonymousClass0jM f19586o;
    /* renamed from: p */
    private final AnonymousClass0Pa f19587p;
    /* renamed from: q */
    private boolean f19588q;
    /* renamed from: r */
    private boolean f19589r;
    /* renamed from: s */
    private boolean f19590s;
    /* renamed from: t */
    private boolean f19591t;

    public final int getViewTypeCount() {
        return 22;
    }

    public AnonymousClass1Wa(Context context, AnonymousClass0PZ anonymousClass0PZ, boolean z, boolean z2, String str, boolean z3, boolean z4, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0ek anonymousClass0ek, AnonymousClass0ew anonymousClass0ew, boolean z5, boolean z6, boolean z7, AnonymousClass0jM anonymousClass0jM, AnonymousClass0kW anonymousClass0kW, AnonymousClass3mP anonymousClass3mP, AnonymousClass0db anonymousClass0db, AnonymousClass0jC anonymousClass0jC, boolean z8, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Pa anonymousClass0Pa, AnonymousClass0iQ anonymousClass0iQ, boolean z9) {
        this.f19559N = new AnonymousClass0p7();
        this.f19553H = context;
        this.f19562Q = anonymousClass0PZ;
        this.f19564S = z;
        this.f19574c = z2;
        this.f19558M = str;
        this.f19589r = z3;
        this.f19563R = z4;
        this.f19581j = anonymousClass0Cm;
        this.f19580i = anonymousClass0Cm.m1037B();
        this.f19570Y = anonymousClass0ek;
        this.f19571Z = anonymousClass0ew;
        this.f19590s = z5;
        this.f19588q = z6;
        this.f19591t = z7;
        this.f19586o = anonymousClass0jM;
        this.f19552G = anonymousClass0kW;
        this.f19577f = anonymousClass3mP;
        this.f19578g = anonymousClass0db;
        this.f19572a = anonymousClass0jC;
        this.f19555J = z8;
        this.f19585n = anonymousClass0Fz;
        this.f19587p = anonymousClass0Pa;
        this.f19584m = anonymousClass0iQ;
        this.f19583l = z9;
        this.f19576e = ((Boolean) AnonymousClass0CC.Wl.m846H(anonymousClass0Cm)).booleanValue();
        this.f19575d = ((Boolean) AnonymousClass0CC.Vl.m846H(anonymousClass0Cm)).booleanValue();
        this.f19560O = AnonymousClass0jJ.m7084B(context, anonymousClass0PZ);
    }

    public AnonymousClass1Wa(Context context, AnonymousClass0PZ anonymousClass0PZ, boolean z, boolean z2, String str, boolean z3, boolean z4, AnonymousClass0Cm anonymousClass0Cm, boolean z5, boolean z6, boolean z7, AnonymousClass0jC anonymousClass0jC, boolean z8, boolean z9) {
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        Context context2 = context;
        boolean z10 = z4;
        boolean z11 = z3;
        String str2 = str;
        boolean z12 = z;
        AnonymousClass0PZ anonymousClass0PZ2 = anonymousClass0PZ;
        AnonymousClass0jC anonymousClass0jC2 = anonymousClass0jC;
        boolean z13 = z7;
        boolean z14 = z6;
        boolean z15 = z2;
        this(context2, anonymousClass0PZ2, z12, z15, str2, z11, z10, anonymousClass0Cm2, AnonymousClass0ek.m6398B(anonymousClass0Cm2), AnonymousClass0ew.m6442B(anonymousClass0Cm2), z5, z14, z13, AnonymousClass0jM.m7091B(context2, anonymousClass0Cm2), AnonymousClass0kW.m7183E(anonymousClass0Cm2), AnonymousClass3mP.f44317G, null, anonymousClass0jC2, z8, null, null, null, z9);
    }

    public AnonymousClass1Wa(Context context, AnonymousClass0PZ anonymousClass0PZ, boolean z, boolean z2, boolean z3, boolean z4, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0jC anonymousClass0jC) {
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        Context context2 = context;
        this(context2, anonymousClass0PZ, z, z2, null, z3, z4, anonymousClass0Cm2, AnonymousClass0ek.m6398B(anonymousClass0Cm2), AnonymousClass0ew.m6442B(anonymousClass0Cm2), false, false, false, AnonymousClass0jM.m7091B(context2, anonymousClass0Cm2), AnonymousClass0kW.m7183E(anonymousClass0Cm2), AnonymousClass3mP.f44317G, null, anonymousClass0jC, false, null, null, null, false);
    }

    public AnonymousClass1Wa(Context context, AnonymousClass0PZ anonymousClass0PZ, boolean z, boolean z2, boolean z3, boolean z4, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3mP anonymousClass3mP, AnonymousClass0db anonymousClass0db, AnonymousClass0jC anonymousClass0jC, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Pa anonymousClass0Pa, AnonymousClass0iQ anonymousClass0iQ) {
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        Context context2 = context;
        boolean z5 = z4;
        AnonymousClass0PZ anonymousClass0PZ2 = anonymousClass0PZ;
        AnonymousClass0Fz anonymousClass0Fz2 = anonymousClass0Fz;
        AnonymousClass0jC anonymousClass0jC2 = anonymousClass0jC;
        boolean z6 = z;
        boolean z7 = z2;
        boolean z8 = z3;
        this(context2, anonymousClass0PZ2, z6, z7, null, z8, z5, anonymousClass0Cm2, AnonymousClass0ek.m6398B(anonymousClass0Cm2), AnonymousClass0ew.m6442B(anonymousClass0Cm2), false, false, false, AnonymousClass0jM.m7091B(context2, anonymousClass0Cm2), AnonymousClass0kW.m7183E(anonymousClass0Cm2), anonymousClass3mP, anonymousClass0db, anonymousClass0jC2, false, anonymousClass0Fz2, anonymousClass0Pa, anonymousClass0iQ, false);
    }

    /* renamed from: A */
    public final void m11734A() {
        AnonymousClass0jZ anonymousClass0jZ = this.f19557L;
        anonymousClass0jZ.f9208D.removeCallbacksAndMessages(null);
        anonymousClass0jZ.f9207C.m8279U("context_switch", false, false);
    }

    /* renamed from: B */
    public final void m11735B(AnonymousClass0jx anonymousClass0jx) {
        AnonymousClass0jx anonymousClass0jx2 = anonymousClass0jx;
        this.f19554I = anonymousClass0jx;
        this.f19579h = new AnonymousClass0pL(anonymousClass0jx, this.f19590s);
        this.f19567V = new AnonymousClass0pS(this.f19553H, this.f19581j, null, anonymousClass0jx2, this.f19583l);
        this.f19569X = new AnonymousClass0pR(this.f19553H, anonymousClass0jx, this.f19581j, this.f19589r);
        this.f19568W = new AnonymousClass0pO(this.f19553H, anonymousClass0jx2, ((Boolean) AnonymousClass0CC.uH.m846H(this.f19581j)).booleanValue(), ((Boolean) AnonymousClass0CC.wH.m846H(this.f19581j)).booleanValue(), ((Boolean) AnonymousClass0CC.vH.m846H(this.f19581j)).booleanValue());
        Context context = this.f19553H;
        AnonymousClass0rG anonymousClass0rG = null;
        this.f19566U = new AnonymousClass0pQ(context, this.f19586o, this.f19588q, anonymousClass0jx, this.f19591t ? AnonymousClass0rG.m7948B(context, this.f19581j) : null);
        this.f19565T = new AnonymousClass0pG(this.f19553H, this.f19586o);
        this.f19550E = new AnonymousClass0pT(this.f19553H, this.f19557L, anonymousClass0jx2, this.f19581j, this.f19589r);
        this.f19549D = new AnonymousClass0pU(this.f19553H, this.f19554I);
        this.f19548C = new AnonymousClass1YS(this.f19553H);
        this.f19547B = new AnonymousClass3LF(this.f19553H, this.f19554I);
        this.f19573b = new AnonymousClass0pP(this.f19554I);
        this.f19551F = new AnonymousClass0pI(this.f19553H, this.f19554I, this.f19581j);
        this.f19561P = new AnonymousClass0pE(this.f19581j, this.f19562Q, this.f19587p, this.f19585n, this.f19584m);
        context = this.f19553H;
        AnonymousClass0Cm anonymousClass0Cm = this.f19581j;
        AnonymousClass0jM anonymousClass0jM = this.f19586o;
        AnonymousClass0kW anonymousClass0kW = this.f19552G;
        boolean z = this.f19588q;
        if (this.f19591t) {
            anonymousClass0rG = AnonymousClass0rG.m7948B(context, anonymousClass0Cm);
        }
        this.f19556K = new AnonymousClass0pD(context, anonymousClass0Cm, anonymousClass0jM, anonymousClass0kW, anonymousClass0jx, z, false, anonymousClass0rG);
        this.f19582k = new AnonymousClass0pC(this.f19553H);
    }

    /* renamed from: B */
    public static void m11732B(AnonymousClass1Wa anonymousClass1Wa, AnonymousClass0p9 anonymousClass0p9, int i, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, AnonymousClass0p4 anonymousClass0p4) {
        AnonymousClass0pA B = anonymousClass0p9.m7788B(i, anonymousClass0P7, anonymousClass0m3);
        if (anonymousClass1Wa.f19560O.LX(anonymousClass0P7)) {
            AnonymousClass0p3 YF = anonymousClass1Wa.f19560O.YF(i, anonymousClass0P7, anonymousClass0m3, anonymousClass0p4);
            if (i == 4) {
                anonymousClass1Wa.f19560O.PC(YF, anonymousClass0P7, anonymousClass0m3);
            } else if (i == 6) {
                anonymousClass1Wa.f19560O.QC(YF, anonymousClass0P7, anonymousClass0m3);
            }
            B.f10508G = YF.m7776A();
        }
    }

    /* renamed from: C */
    private View m11733C(Context context, int i, ViewGroup viewGroup) {
        View inflate;
        switch (i) {
            case 0:
                return AnonymousClass0pU.m7864C(context, viewGroup);
            case 1:
                i = LayoutInflater.from(context).inflate(C0164R.layout.row_feed_bakeoff_header, viewGroup, false);
                i.setTag(new AnonymousClass1bV(i, (CircularImageView) i.findViewById(C0164R.id.row_feed_photo_profile_imageview), (TextView) i.findViewById(C0164R.id.row_feed_photo_profile_name), (TextView) i.findViewById(C0164R.id.row_feed_photo_profile_metalabel)));
                return i;
            case 2:
                i = LayoutInflater.from(context).inflate(C0164R.layout.row_feed_bakeoff_cta, viewGroup, false);
                i.setTag(new AnonymousClass3LE(i.findViewById(C0164R.id.row_feed_hon_cta), (TextView) i.findViewById(C0164R.id.cta_text), (CirclePageIndicator) i.findViewById(C0164R.id.carousel_page_indicator)));
                return i;
            case 3:
                View inflate2 = LayoutInflater.from(context).inflate(C0164R.layout.row_feed_bakeoff_comments, viewGroup, false);
                inflate2.setTag(new AnonymousClass3LG((IgTextLayoutView) inflate2.findViewById(C0164R.id.row_feed_hon_comments)));
                return inflate2;
            case 4:
                return this.f19550E.m7862B(context, viewGroup);
            case 5:
                return AnonymousClass0pS.m7858F(context, viewGroup);
            case 6:
                return this.f19569X.m7853B(context, viewGroup);
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return this.f19566U.m7850B(context, viewGroup);
            case 8:
                return AnonymousClass0pP.m7846B(context, viewGroup);
            case 9:
                return this.f19568W.m7845B(context, viewGroup);
            case 10:
                return AnonymousClass0pM.m7833D(context, viewGroup);
            case 11:
                return AnonymousClass0pL.m7826E(context, viewGroup, 1);
            case 12:
                return AnonymousClass0pL.m7826E(context, viewGroup, 0);
            case ParserMinimalBase.INT_CR /*13*/:
                return AnonymousClass0pI.m7806C(context, viewGroup);
            case 14:
                inflate = LayoutInflater.from(context).inflate(C0164R.layout.carousel_page_indicator_row, viewGroup, false);
                inflate.setTag(new AnonymousClass0zK(inflate));
                return inflate;
            case 15:
                return AnonymousClass0pG.m7803B(context, viewGroup);
            case 16:
                return AnonymousClass0pF.m7802B(context);
            case 17:
                return this.f19561P.m7801A(context, viewGroup);
            case Process.SIGCONT /*18*/:
                return AnonymousClass0pD.m7795B(context, viewGroup);
            case Process.SIGSTOP /*19*/:
                return AnonymousClass0pC.m7793B(context, viewGroup);
            case Process.SIGTSTP /*20*/:
                AnonymousClass0la anonymousClass0rr = new AnonymousClass0rr(context, 0, false);
                anonymousClass0rr.f9543B = true;
                return AnonymousClass3PH.C(context, viewGroup, null, anonymousClass0rr);
            case 21:
                inflate = LayoutInflater.from(context).inflate(C0164R.layout.row_feed_comments_loading_spinner, viewGroup, false);
                inflate.setTag(new AnonymousClass3Lq(inflate));
                return inflate;
            default:
                throw new UnsupportedOperationException("Unhandled view type");
        }
    }

    /* renamed from: C */
    public final void m11736C(AnonymousClass0db anonymousClass0db) {
        AnonymousClass0pS anonymousClass0pS = this.f19567V;
        if (anonymousClass0pS != null) {
            anonymousClass0pS.f10616D = anonymousClass0db;
        }
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        View view2 = view;
        int I = AnonymousClass0cQ.m5859I(this, -1149797721);
        int i2 = i;
        if (view == null) {
            view2 = m11733C(r0.f19553H, i2, viewGroup);
        }
        AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) obj4;
        AnonymousClass0P7 anonymousClass0P72 = anonymousClass0P7;
        int I2 = AnonymousClass0cQ.m5859I(r0, 1582949409);
        boolean z = true;
        AnonymousClass0m3 anonymousClass0m3;
        int i3;
        AnonymousClass0pj BU;
        switch (i) {
            case 0:
                r0.f19549D.m7867A((AnonymousClass0q3) view2.getTag(), anonymousClass0P72, (AnonymousClass0m3) obj3);
                break;
            case 1:
                AnonymousClass1YS anonymousClass1YS = r0.f19548C;
                AnonymousClass1bV anonymousClass1bV = (AnonymousClass1bV) view2.getTag();
                anonymousClass1bV.f20479E.setVisibility(0);
                anonymousClass1bV.f20477C.setUrl(anonymousClass0P7.MA().DQ());
                if (anonymousClass0P7.MA().m1029t()) {
                    anonymousClass1bV.f20478D.setText(anonymousClass0P7.LA());
                    anonymousClass1bV.f20478D.setTextColor(anonymousClass1YS.f20010B);
                } else {
                    anonymousClass1bV.f20478D.getPaint().setFakeBoldText(true);
                    anonymousClass1bV.f20478D.setText(anonymousClass0P7.MA().uT());
                    anonymousClass1bV.f20478D.setTextColor(anonymousClass1YS.f20011C);
                }
                if (anonymousClass0P7.eY()) {
                    anonymousClass1bV.f20476B.setTextColor(anonymousClass1YS.f20010B);
                    anonymousClass1bV.f20476B.setTextSize(14.0f);
                    anonymousClass1bV.f20476B.setText(anonymousClass0P7.DA());
                    anonymousClass1bV.f20476B.setVisibility(0);
                } else {
                    AnonymousClass0Nm.m3436O(anonymousClass1bV.f20476B);
                }
                break;
            case 2:
                AnonymousClass3LF anonymousClass3LF = r0.f19547B;
                AnonymousClass3LE anonymousClass3LE = (AnonymousClass3LE) view2.getTag();
                anonymousClass0m3 = (AnonymousClass0m3) obj3;
                if (!(anonymousClass3LE.f40278F == null || anonymousClass3LE.f40278F == anonymousClass0m3)) {
                    anonymousClass3LE.f40278F.m7457J(anonymousClass3LE);
                }
                anonymousClass3LE.f40277E = anonymousClass0P7;
                anonymousClass3LE.f40278F = anonymousClass0m3;
                i3 = anonymousClass0m3.f9673H;
                if (!AnonymousClass0Gk.m1859K(anonymousClass0P7, i3)) {
                    if (!anonymousClass0P7.kA()) {
                        anonymousClass3LE.f40276D.setVisibility(8);
                        break;
                    }
                }
                if (AnonymousClass0Gk.m1859K(anonymousClass0P7, i3)) {
                    anonymousClass3LE.f40278F.m7448A(anonymousClass3LE);
                    anonymousClass3LE.f40274B.setText(AnonymousClass0Gk.m1855G(anonymousClass3LF.f40279B, anonymousClass0P7, i3));
                    anonymousClass3LE.f40274B.setOnClickListener(new AnonymousClass1VL(anonymousClass3LF, anonymousClass0P7, anonymousClass0m3, anonymousClass3LE));
                }
                if (anonymousClass0P7.kA()) {
                    anonymousClass3LE.f40275C.setVisibility(0);
                    anonymousClass3LE.f40275C.m9762A(i3, anonymousClass0P7.m3761Q());
                    anonymousClass3LE.f40278F.m7448A(anonymousClass3LE);
                } else {
                    anonymousClass3LE.f40275C.setVisibility(8);
                }
                anonymousClass3LE.f40276D.setVisibility(0);
            case 3:
                int C;
                int i4;
                TextPaint textPaint;
                SpannableStringBuilder spannableStringBuilder;
                TextPaint textPaint2;
                int i5;
                View view3;
                AnonymousClass3LG anonymousClass3LG = (AnonymousClass3LG) view2.getTag();
                i = r0.f19552G;
                if (anonymousClass0P7.m3767W() <= 0) {
                    if (!anonymousClass0P7.SA()) {
                        anonymousClass3LG.f40281B.setVisibility(8);
                        break;
                    }
                }
                Context context = anonymousClass3LG.f40281B.getContext();
                view = anonymousClass3LG.f40281B;
                i2 = AnonymousClass0ty.m8207B(true, false, false);
                AnonymousClass0qJ A = AnonymousClass0qH.m7921B(context).m7923A(false, false);
                boolean z2 = true;
                if (((i2 >> 1) & 1) != 1) {
                    z2 = false;
                }
                int i6 = 1;
                if ((i2 & 1) != 1) {
                    i6 = 0;
                }
                boolean z3 = i6 ^ 1;
                int i7 = i2 >> 2;
                boolean z4 = true;
                if ((i7 & 1) != 1) {
                    z4 = false;
                }
                AnonymousClass0qJ anonymousClass0qJ = A;
                List list = anonymousClass0P7.m3785o().f11811B;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (!list.isEmpty()) {
                    AnonymousClass0SK anonymousClass0SK = (AnonymousClass0SK) list.get(0);
                    if (anonymousClass0SK.f4913g == AnonymousClass0uU.Caption) {
                        C = AnonymousClass0zW.m8690C(context, spannableStringBuilder2, z2, z3, z4, anonymousClass0SK, anonymousClass0qJ, i);
                        i4 = 1;
                        if (AnonymousClass0kW.m7185G(context, anonymousClass0P7)) {
                            if (list.size() - i4 < anonymousClass0P7.m3767W()) {
                                AnonymousClass0zW.m8691D(context, anonymousClass0P7, spannableStringBuilder2, C, AnonymousClass0G5.m1723D(context, C0164R.attr.textColorSecondary));
                            }
                            if (!(anonymousClass0P7.f4039n || AnonymousClass0G5.m1721B(context, C0164R.attr.shouldMinimizeAllComments, false))) {
                                while (i4 < list.size()) {
                                    AnonymousClass0zW.m8690C(context, spannableStringBuilder2, z2, true, z4, (AnonymousClass0SK) list.get(i4), anonymousClass0qJ, i);
                                    i4++;
                                }
                            }
                        }
                        if (spannableStringBuilder2.length() >= 2) {
                            spannableStringBuilder2.delete(spannableStringBuilder2.length() - 2, spannableStringBuilder2.length());
                        }
                        textPaint = A.f10904E;
                        i2 = A.f10905F;
                        spannableStringBuilder = spannableStringBuilder2;
                        textPaint2 = textPaint;
                        i5 = i2;
                        view3 = view;
                        view3.setTextLayout(new StaticLayout(spannableStringBuilder, textPaint2, i5, Alignment.ALIGN_NORMAL, A.f10903D, A.f10902C, A.f10901B));
                        anonymousClass3LG.f40281B.setVisibility(0);
                    }
                }
                C = 0;
                i4 = 0;
                if (AnonymousClass0kW.m7185G(context, anonymousClass0P7)) {
                    if (list.size() - i4 < anonymousClass0P7.m3767W()) {
                        AnonymousClass0zW.m8691D(context, anonymousClass0P7, spannableStringBuilder2, C, AnonymousClass0G5.m1723D(context, C0164R.attr.textColorSecondary));
                    }
                    while (i4 < list.size()) {
                        AnonymousClass0zW.m8690C(context, spannableStringBuilder2, z2, true, z4, (AnonymousClass0SK) list.get(i4), anonymousClass0qJ, i);
                        i4++;
                    }
                    break;
                }
                if (spannableStringBuilder2.length() >= 2) {
                    spannableStringBuilder2.delete(spannableStringBuilder2.length() - 2, spannableStringBuilder2.length());
                }
                textPaint = A.f10904E;
                i2 = A.f10905F;
                spannableStringBuilder = spannableStringBuilder2;
                textPaint2 = textPaint;
                i5 = i2;
                view3 = view;
                view3.setTextLayout(new StaticLayout(spannableStringBuilder, textPaint2, i5, Alignment.ALIGN_NORMAL, A.f10903D, A.f10902C, A.f10901B));
                anonymousClass3LG.f40281B.setVisibility(0);
            case 4:
                anonymousClass0m3 = (AnonymousClass0m3) obj3;
                r0.f19550E.m7861A((AnonymousClass0q2) view2.getTag(), anonymousClass0P7, anonymousClass0m3, anonymousClass0m3.f9717z, r0.f19562Q, r0.f19572a, false);
                break;
            case 5:
                AnonymousClass0pS anonymousClass0pS = r0.f19567V;
                anonymousClass0m3 = (AnonymousClass0m3) obj3;
                AnonymousClass0pS anonymousClass0pS2 = anonymousClass0pS;
                anonymousClass0pS2.m7860A((AnonymousClass0pl) view2.getTag(), anonymousClass0P7, anonymousClass0m3, anonymousClass0m3.f9717z, r0.f19574c, false, r0.f19558M, null, r0.f19581j, r0.f19562Q, null);
                break;
            case 6:
                AnonymousClass0pR anonymousClass0pR = r0.f19569X;
                AnonymousClass0q0 anonymousClass0q0 = (AnonymousClass0q0) view2.getTag();
                anonymousClass0m3 = (AnonymousClass0m3) obj3;
                int i8 = anonymousClass0m3.f9717z;
                BU = r0.f19557L.BU(anonymousClass0m3.f9717z, anonymousClass0P7);
                AnonymousClass0p8 anonymousClass0p8 = r0.f19559N;
                anonymousClass0pR.m7852A(anonymousClass0q0, anonymousClass0P7, i8, anonymousClass0m3, BU, anonymousClass0p8, r0.f19562Q, r0.f19557L.HU(anonymousClass0P7), AnonymousClass0q1.m7897E(anonymousClass0P7, r0.f19575d, r0.f19576e));
                r0.f19557L.m7144C((AnonymousClass0pi) view2.getTag(), anonymousClass0P72);
                break;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                AnonymousClass0pQ anonymousClass0pQ = r0.f19566U;
                anonymousClass0m3 = (AnonymousClass0m3) obj3;
                AnonymousClass0pz anonymousClass0pz = (AnonymousClass0pz) view2.getTag();
                if (!r0.f19555J || anonymousClass0P7.kA()) {
                    z = false;
                }
                anonymousClass0pQ.m7849A(anonymousClass0P72, anonymousClass0m3, anonymousClass0pz, z);
                break;
            case 8:
                r0.f19573b.m7847A((AnonymousClass0py) view2.getTag(), anonymousClass0P72);
                break;
            case 9:
                anonymousClass0m3 = (AnonymousClass0m3) obj3;
                r0.f19568W.m7844A(r0.f19570Y, r0.f19571Z, anonymousClass0P7, anonymousClass0m3, anonymousClass0m3.f9717z, (AnonymousClass0px) view2.getTag());
                break;
            case 10:
                AnonymousClass0pM.m7831B((AnonymousClass0pw) view2.getTag(), anonymousClass0P7, (AnonymousClass0m3) obj3, r0.f19562Q, r0.f19554I, r0.f19581j);
                break;
            case 11:
            case 12:
                r0.f19579h.m7830A(view2, anonymousClass0P72, obj3);
                break;
            case ParserMinimalBase.INT_CR /*13*/:
                AnonymousClass0P7 V = anonymousClass0P7.m3766V();
                AnonymousClass0pI anonymousClass0pI = r0.f19551F;
                AnonymousClass0ph anonymousClass0ph = (AnonymousClass0ph) view2.getTag();
                anonymousClass0m3 = (AnonymousClass0m3) obj3;
                i3 = anonymousClass0m3.f9717z;
                BU = r0.f19557L.BU(anonymousClass0m3.f9717z, V);
                AnonymousClass0p8 anonymousClass0p82 = r0.f19559N;
                AnonymousClass0pI anonymousClass0pI2 = anonymousClass0pI;
                anonymousClass0pI2.m7807A(anonymousClass0ph, anonymousClass0P7, anonymousClass0m3, i3, BU, anonymousClass0p82, r0.f19562Q, r0.f19557L.HU(V));
                r0.f19557L.m7144C((AnonymousClass0pi) view2.getTag(), V);
                break;
            case 14:
                AnonymousClass0zP.m8682B((AnonymousClass0zK) view2.getTag(), anonymousClass0P72, (AnonymousClass0m3) obj3);
                break;
            case 15:
                anonymousClass0m3 = (AnonymousClass0m3) obj3;
                r0.f19565T.m7804A((AnonymousClass0pb) view2.getTag(), anonymousClass0P7, anonymousClass0m3, AnonymousClass0Gk.m1863O(anonymousClass0P7, anonymousClass0m3.f9715x) ^ 1, r0.f19564S);
                break;
            case 16:
                int F = AnonymousClass0pa.m7874F(anonymousClass0P7, r0.f19553H.getResources());
                LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.height = F;
                view2.setLayoutParams(layoutParams);
                break;
            case 17:
                AnonymousClass0pE.m7799B((AnonymousClass0pZ) view2.getTag(), anonymousClass0P72, (AnonymousClass0m3) obj3);
                break;
            case Process.SIGCONT /*18*/:
                AnonymousClass0pW anonymousClass0pW = (AnonymousClass0pW) obj3;
                r0.f19556K.m7798A((AnonymousClass0pX) view2.getTag(), anonymousClass0pW.f10642B, anonymousClass0pW.f10643C);
                break;
            case Process.SIGSTOP /*19*/:
                r0.f19582k.m7794A((AnonymousClass0pV) view2.getTag(), anonymousClass0P72);
                break;
            case Process.SIGTSTP /*20*/:
                Context context2 = r0.f19553H;
                AnonymousClass0Cm anonymousClass0Cm = r0.f19581j;
                AnonymousClass3PG anonymousClass3PG = (AnonymousClass3PG) view2.getTag();
                AnonymousClass0Cm anonymousClass0Cm2 = r0.f19581j;
                AnonymousClass0PZ anonymousClass0PZ = r0.f19562Q;
                AnonymousClass0jx anonymousClass0jx = r0.f19554I;
                AnonymousClass0m3 anonymousClass0m32 = (AnonymousClass0m3) obj3;
                AnonymousClass0Cm anonymousClass0Cm3 = anonymousClass0Cm2;
                AnonymousClass0PZ anonymousClass0PZ2 = anonymousClass0PZ;
                AnonymousClass0jx anonymousClass0jx2 = anonymousClass0jx;
                AnonymousClass44w anonymousClass45r = new AnonymousClass45r(anonymousClass0Cm3, anonymousClass0PZ2, anonymousClass0jx2, anonymousClass0P7, anonymousClass0m32, r0.f19577f, r0.f19578g);
                AnonymousClass3mN B = AnonymousClass3mN.B(r0.f19581j);
                AnonymousClass3PH.B(context2, anonymousClass0Cm, anonymousClass3PG, anonymousClass45r, (List) B.f44305B.get(anonymousClass0P7.MA().getId()), 0, 0, new AnonymousClass40D(r0, obj3), anonymousClass0m32.f9667B, r0.f19578g);
                break;
            case 21:
                ((AnonymousClass3Lq) view2.getTag()).f40384B.setLoadingStatus(AnonymousClass2M2.f29482D);
                break;
            default:
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("View type unhandled");
                AnonymousClass0cQ.m5858H(r0, 1430754104, I2);
                throw unsupportedOperationException;
        }
        AnonymousClass0cQ.m5858H(r0, -304356610, I2);
        AnonymousClass0cQ.m5858H(r0, 1542266435, I);
        return view2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void UD(X.AnonymousClass0p9 r13, java.lang.Object r14, java.lang.Object r15) {
        /*
        r12 = this;
        r11 = r15;
        r10 = r14;
        r10 = (X.AnonymousClass0P7) r10;
        r11 = (X.AnonymousClass0m3) r11;
        r7 = r12;
        r0 = r12.f19560O;
        r12 = r0.hF(r10, r11);
        r0 = r11.oY();
        r8 = r13;
        if (r0 == 0) goto L_0x0028;
    L_0x0014:
        r0 = r10.eY();
        if (r0 == 0) goto L_0x0021;
    L_0x001a:
        r9 = 11;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
        goto L_0x016d;
    L_0x0021:
        r9 = 12;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
        goto L_0x016d;
    L_0x0028:
        r1 = r11.f9715x;
        r0 = X.AnonymousClass0a4.AD_BAKEOFF;
        if (r1 != r0) goto L_0x0056;
    L_0x002e:
        r0 = 1;
        r13.m7787A(r0);
        r0 = r10.kA();
        if (r0 == 0) goto L_0x003a;
    L_0x0038:
        r0 = 4;
        goto L_0x003b;
    L_0x003a:
        r0 = 6;
    L_0x003b:
        r13.m7787A(r0);
        r0 = r10.kA();
        if (r0 != 0) goto L_0x004c;
    L_0x0044:
        r0 = r11.f9673H;
        r0 = X.AnonymousClass0Gk.m1859K(r10, r0);
        if (r0 == 0) goto L_0x0050;
    L_0x004c:
        r0 = 2;
        r13.m7787A(r0);
    L_0x0050:
        r0 = 3;
        r13.m7787A(r0);
        goto L_0x016d;
    L_0x0056:
        r9 = 5;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
        r0 = r11.f9700i;
        if (r0 == 0) goto L_0x0063;
    L_0x005e:
        r0 = 20;
        r13.m7787A(r0);
    L_0x0063:
        r0 = r10.kA();
        if (r0 == 0) goto L_0x007a;
    L_0x0069:
        r9 = 4;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
        r0 = r11.f9673H;
        r0 = X.AnonymousClass0Gk.m1859K(r10, r0);
        if (r0 == 0) goto L_0x009d;
    L_0x0075:
        r9 = 0;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
        goto L_0x009d;
    L_0x007a:
        r0 = r10.lA();
        if (r0 == 0) goto L_0x008c;
    L_0x0080:
        r1 = r10.f4035j;
        r0 = X.AnonymousClass0q9.TOP_MAIN_BOTTOM_THREE_THUMBNAIL;
        if (r1 != r0) goto L_0x009d;
    L_0x0086:
        r9 = 13;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
        goto L_0x009d;
    L_0x008c:
        r9 = 6;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
        r0 = r10.XA();
        if (r0 == 0) goto L_0x009d;
    L_0x0096:
        r1 = r11.f9715x;
        r0 = X.AnonymousClass0a4.PROMOTION_TOGGLED_PAGE;
        if (r1 == r0) goto L_0x009d;
    L_0x009c:
        goto L_0x0075;
    L_0x009d:
        r1 = r11.f9715x;
        r0 = r7.f19580i;
        r0 = X.AnonymousClass0q8.m7913D(r10, r1, r0);
        if (r0 == 0) goto L_0x00ac;
    L_0x00a7:
        r9 = 10;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
    L_0x00ac:
        r0 = X.AnonymousClass0q7.m7907B();
        r0 = r0.m7910C();
        if (r0 == 0) goto L_0x00bb;
    L_0x00b6:
        r9 = 8;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
    L_0x00bb:
        r0 = r7.f19555J;
        if (r0 != 0) goto L_0x00c5;
    L_0x00bf:
        r9 = 9;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
        goto L_0x00d0;
    L_0x00c5:
        r0 = r10.kA();
        if (r0 == 0) goto L_0x00d0;
    L_0x00cb:
        r9 = 14;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
    L_0x00d0:
        r9 = 7;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
        r3 = new X.0q6;
        r1 = r7.f19553H;
        r0 = r7.f19563R;
        r3.<init>(r1, r10, r11, r0);
        r0 = r3.f10864C;
        r5 = 18;
        if (r0 == 0) goto L_0x0106;
    L_0x00e3:
        r4 = r3.m7905A();
        r1 = new X.0pW;
        r0 = r3.f10863B;
        r1.<init>(r4, r0);
        r2 = r13.m7788B(r5, r10, r1);
        r1 = X.AnonymousClass0pB.m7789B(r10, r1);
        r0 = r4.XP();
        r1.f10464C = r0;
        r0 = r1.m7780E(r12);
        r0 = r0.m7776A();
        r2.f10508G = r0;
    L_0x0106:
        r0 = r3.f10865D;
        if (r0 != 0) goto L_0x014b;
    L_0x010a:
        r0 = r3.f10867F;
        if (r0 == 0) goto L_0x0113;
    L_0x010e:
        r9 = 19;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
    L_0x0113:
        r0 = r3.f10866E;
        if (r0 == 0) goto L_0x014b;
    L_0x0117:
        r0 = r3.m7906B();
        r6 = r0.iterator();
    L_0x011f:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x014b;
    L_0x0125:
        r4 = r6.next();
        r4 = (X.AnonymousClass0SK) r4;
        r1 = new X.0pW;
        r0 = r3.f10863B;
        r1.<init>(r4, r0);
        r2 = r13.m7788B(r5, r10, r1);
        r1 = X.AnonymousClass0pB.m7789B(r10, r1);
        r0 = r4.XP();
        r1.f10464C = r0;
        r0 = r1.m7780E(r12);
        r0 = r0.m7776A();
        r2.f10508G = r0;
        goto L_0x011f;
    L_0x014b:
        r9 = 17;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
        r9 = 15;
        X.AnonymousClass1Wa.m11732B(r7, r8, r9, r10, r11, r12);
        r0 = r3.f10865D;
        if (r0 == 0) goto L_0x0163;
    L_0x0159:
        r2 = 21;
        r0 = r7;
        r1 = r13;
        r3 = r10;
        r4 = r11;
        r5 = r12;
        X.AnonymousClass1Wa.m11732B(r0, r1, r2, r3, r4, r5);
    L_0x0163:
        r2 = 16;
        r0 = r7;
        r1 = r13;
        r3 = r10;
        r4 = r11;
        r5 = r12;
        X.AnonymousClass1Wa.m11732B(r0, r1, r2, r3, r4, r5);
    L_0x016d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Wa.UD(X.0p9, java.lang.Object, java.lang.Object):void");
    }
}
