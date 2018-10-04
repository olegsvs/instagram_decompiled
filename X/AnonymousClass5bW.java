package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.instagram.common.ui.text.TightTextView;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.5bW */
public final class AnonymousClass5bW extends AnonymousClass5Vz implements AnonymousClass4dx {
    /* renamed from: B */
    public final ConstraintLayout f66980B;
    /* renamed from: C */
    public final TightTextView f66981C;
    /* renamed from: D */
    public final AnonymousClass4fG f66982D;
    /* renamed from: E */
    public final ViewGroup f66983E;
    /* renamed from: F */
    public Handler f66984F;
    /* renamed from: G */
    public Runnable f66985G;
    /* renamed from: H */
    private final AnonymousClass0EE f66986H;
    /* renamed from: I */
    private final StyleSpan f66987I;
    /* renamed from: J */
    private AnonymousClass4f4 f66988J;
    /* renamed from: K */
    private final String f66989K;
    /* renamed from: L */
    private final ImageView f66990L;
    /* renamed from: M */
    private final boolean f66991M;
    /* renamed from: N */
    private final ForegroundColorSpan f66992N;
    /* renamed from: O */
    private AnonymousClass1dU f66993O;
    /* renamed from: P */
    private final boolean f66994P;
    /* renamed from: Q */
    private final AnonymousClass4gT f66995Q;
    /* renamed from: R */
    private final AnonymousClass0Cm f66996R;
    /* renamed from: S */
    private final AnonymousClass4f4 f66997S = new AnonymousClass5W0(this);
    /* renamed from: T */
    private final AnonymousClass4f4 f66998T = new AnonymousClass5W2(this);
    /* renamed from: U */
    private final AnonymousClass4f4 f66999U = new AnonymousClass5W1(this);
    /* renamed from: V */
    private final AnonymousClass4f4 f67000V;

    public final void Sr() {
    }

    public AnonymousClass5bW(View view, AnonymousClass4gT anonymousClass4gT, AnonymousClass5bQ anonymousClass5bQ, AnonymousClass0Cm anonymousClass0Cm, boolean z, String str, AnonymousClass0EE anonymousClass0EE) {
        super(view, anonymousClass5bQ, anonymousClass0Cm, anonymousClass0EE);
        AnonymousClass5W3 anonymousClass5W3 = new AnonymousClass5W3(this);
        this.f67000V = new AnonymousClass5W4(this);
        this.f66996R = anonymousClass0Cm;
        this.f66995Q = anonymousClass4gT;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(C0164R.id.message_content);
        this.f66980B = constraintLayout;
        this.f66981C = (TightTextView) constraintLayout.findViewById(C0164R.id.direct_visual_message_digest);
        this.f66990L = (ImageView) this.f66980B.findViewById(C0164R.id.direct_visual_message_icon);
        this.f66983E = (ViewGroup) this.f66980B.findViewById(C0164R.id.message_direct_visual_media_image_and_text_view_container);
        this.f66982D = new AnonymousClass4fG(V(), anonymousClass0Cm, new AnonymousClass0ct((ViewStub) this.f66980B.findViewById(C0164R.id.expiration_timer_stub)));
        this.f66991M = z;
        this.f66989K = str;
        this.f66986H = anonymousClass0EE;
        this.f66992N = new ForegroundColorSpan(AnonymousClass0G5.D(V(), C0164R.attr.textColorPrimary));
        this.f66987I = new StyleSpan(1);
        this.f66981C.setMaxWidth(AnonymousClass4ew.C(V()));
        this.f66993O = new AnonymousClass1dU(new AnonymousClass0ct((ViewStub) view.findViewById(C0164R.id.direct_reactions_bar_stub)), anonymousClass4gT, this.f56219B, this.f66996R.B());
        this.f66994P = ((Boolean) AnonymousClass0CC.LI.H(this.f66996R)).booleanValue();
    }

    public final View AQ() {
        return this.f66983E;
    }

    public final void As(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass1aH.E(V(), anonymousClass5WQ, this.f66996R, this.f56219B, this.f66986H);
    }

    /* renamed from: C */
    public static void m27860C(AnonymousClass5bW anonymousClass5bW, AnonymousClass0W7 anonymousClass0W7, String str) {
        AnonymousClass0V1.l(anonymousClass5bW.f66986H, anonymousClass5bW.m27258c(), anonymousClass0W7.f5918v, anonymousClass0W7.H() == AnonymousClass0ON.PHOTO ? "photo" : MediaStreamTrack.VIDEO_TRACK_KIND, anonymousClass0W7.N(), str);
    }

    /* renamed from: D */
    private static boolean m27861D(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0W7 anonymousClass0W7, String str) {
        if (!((Boolean) AnonymousClass0E6.D(AnonymousClass0CC.eI, anonymousClass0Cm)).booleanValue()) {
            if (!((Boolean) AnonymousClass0E6.D(AnonymousClass0CC.lI, anonymousClass0Cm)).booleanValue()) {
                return anonymousClass0W7.U(anonymousClass0Cm.B(), str);
            }
        }
        return anonymousClass0W7.V();
    }

    /* renamed from: E */
    private static void m27862E(SpannableString spannableString, Object obj, String str) {
        int lastIndexOf = spannableString.toString().lastIndexOf(str);
        spannableString.setSpan(obj, lastIndexOf, str.length() + lastIndexOf, 33);
    }

    /* renamed from: F */
    private static SpannableStringBuilder m27863F(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(str);
        if (!(str2 == null || str2.isEmpty())) {
            spannableStringBuilder.append(": ").append(str2);
        }
        return spannableStringBuilder;
    }

    public final boolean Fj(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass2E4.C(AnonymousClass0V0.EXPIRING_MEDIA, this.f66996R, false);
        return super.Fj(anonymousClass5WQ);
    }

    /* renamed from: G */
    private static SpannableStringBuilder m27864G(AnonymousClass5bW anonymousClass5bW, String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(str);
        int i = (str2 == null || str2.isEmpty()) ? 0 : 1;
        if (i != 0) {
            spannableStringBuilder.append(": ").append(str2);
        }
        spannableStringBuilder.setSpan(anonymousClass5bW.f66987I, 0, str.length() + i, 33);
        return spannableStringBuilder;
    }

    /* renamed from: H */
    private static Drawable m27865H(AnonymousClass5bW anonymousClass5bW) {
        return AnonymousClass0Ca.E(anonymousClass5bW.V(), anonymousClass5bW.f66994P ? C0164R.drawable.play_icon_big : C0164R.drawable.direct_visual_message_play_active);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: I */
    private static int m27866I(X.AnonymousClass5bW r4, X.AnonymousClass5WQ r5) {
        /*
        r3 = r5.f65618B;
        r1 = r3.I();
        r0 = r5.f65627K;
        r0 = r0.f56243D;
        if (r0 == 0) goto L_0x0016;
    L_0x000c:
        r0 = r1.wY();
        if (r0 == 0) goto L_0x0014;
    L_0x0012:
        r0 = 5;
        goto L_0x0015;
    L_0x0014:
        r0 = 4;
    L_0x0015:
        return r0;
    L_0x0016:
        r0 = r4.f66991M;
        if (r0 == 0) goto L_0x00b5;
    L_0x001a:
        if (r1 != 0) goto L_0x005a;
    L_0x001c:
        r1 = X.AnonymousClass4f3.f56081B;
        r0 = r3.f5887Q;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r2 = 0;
        switch(r0) {
            case 1: goto L_0x004a;
            case 2: goto L_0x004a;
            case 3: goto L_0x004a;
            case 4: goto L_0x004a;
            case 5: goto L_0x0032;
            case 6: goto L_0x0032;
            default: goto L_0x002a;
        };
    L_0x002a:
        r1 = "DirectVisualMessageViewHolder";
        r0 = "unsupported lifecycle type";
        X.AnonymousClass0Gn.H(r1, r0);
        return r2;
    L_0x0032:
        r0 = r3.f5877G;
        if (r0 == 0) goto L_0x0042;
    L_0x0036:
        r0 = r0.A();
        if (r0 == 0) goto L_0x003f;
    L_0x003c:
        r0 = 15;
        goto L_0x0015;
    L_0x003f:
        r0 = 14;
        goto L_0x0015;
    L_0x0042:
        r1 = "DirectVisualMessageViewHolder";
        r0 = "pending media does not exist";
        X.AnonymousClass0Gn.H(r1, r0);
        return r2;
    L_0x004a:
        r0 = r3.f5877G;
        if (r0 == 0) goto L_0x0042;
    L_0x004e:
        r0 = r0.A();
        if (r0 == 0) goto L_0x0057;
    L_0x0054:
        r0 = 13;
        goto L_0x0015;
    L_0x0057:
        r0 = 12;
        goto L_0x0015;
    L_0x005a:
        r1 = r1.wY();
        r0 = r3.A();
        if (r0 == 0) goto L_0x006c;
    L_0x0064:
        if (r1 == 0) goto L_0x0069;
    L_0x0066:
        r0 = 29;
        goto L_0x0015;
    L_0x0069:
        r0 = 28;
        goto L_0x0015;
    L_0x006c:
        r0 = r3.V();
        if (r0 == 0) goto L_0x009e;
    L_0x0072:
        r0 = X.AnonymousClass0CC.Vh;
        r0 = r0.G();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x009c;
    L_0x0080:
        r0 = X.AnonymousClass0CC.lI;
        r0 = r0.G();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x009c;
    L_0x008e:
        r0 = X.AnonymousClass0CC.eI;
        r0 = X.AnonymousClass0E6.C(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x009e;
    L_0x009c:
        r0 = 1;
        goto L_0x009f;
    L_0x009e:
        r0 = 0;
    L_0x009f:
        if (r0 == 0) goto L_0x00ab;
    L_0x00a1:
        if (r1 == 0) goto L_0x00a7;
    L_0x00a3:
        r0 = 25;
        goto L_0x0015;
    L_0x00a7:
        r0 = 24;
        goto L_0x0015;
    L_0x00ab:
        if (r1 == 0) goto L_0x00b1;
    L_0x00ad:
        r0 = 27;
        goto L_0x0015;
    L_0x00b1:
        r0 = 26;
        goto L_0x0015;
    L_0x00b5:
        r2 = r1.wY();
        r0 = r4.f66996R;
        r0 = r0.B();
        r0 = r3.Z(r0);
        if (r0 == 0) goto L_0x00cf;
    L_0x00c5:
        if (r2 == 0) goto L_0x00cb;
    L_0x00c7:
        r0 = 17;
        goto L_0x0015;
    L_0x00cb:
        r0 = 16;
        goto L_0x0015;
    L_0x00cf:
        r0 = r3.A();
        if (r0 == 0) goto L_0x00df;
    L_0x00d5:
        if (r2 == 0) goto L_0x00db;
    L_0x00d7:
        r0 = 23;
        goto L_0x0015;
    L_0x00db:
        r0 = 22;
        goto L_0x0015;
    L_0x00df:
        r1 = r4.f66996R;
        r0 = r4.f66989K;
        r0 = X.AnonymousClass5bW.m27861D(r1, r3, r0);
        if (r0 == 0) goto L_0x00f3;
    L_0x00e9:
        if (r2 == 0) goto L_0x00ef;
    L_0x00eb:
        r0 = 19;
        goto L_0x0015;
    L_0x00ef:
        r0 = 18;
        goto L_0x0015;
    L_0x00f3:
        if (r2 == 0) goto L_0x00f9;
    L_0x00f5:
        r0 = 21;
        goto L_0x0015;
    L_0x00f9:
        r0 = 20;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5bW.I(X.5bW, X.5WQ):int");
    }

    /* renamed from: J */
    private static Drawable m27867J(AnonymousClass5bW anonymousClass5bW) {
        return AnonymousClass0Ca.E(anonymousClass5bW.V(), anonymousClass5bW.f66994P ? C0164R.drawable.play_icon_big : C0164R.drawable.direct_visual_media_play);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: K */
    private void m27868K(X.AnonymousClass5WQ r14) {
        /*
        r13 = this;
        r8 = r13;
        r5 = X.AnonymousClass5bW.m27866I(r13, r14);
        r2 = r13.V();
        r9 = r2.getResources();
        r0 = r13.f66996R;
        r7 = r0.B();
        r4 = 0;
        r13.f66988J = r4;
        r6 = r14.f65618B;
        r3 = 0;
        switch(r5) {
            case 4: goto L_0x0394;
            case 5: goto L_0x0347;
            default: goto L_0x001c;
        };
    L_0x001c:
        switch(r5) {
            case 12: goto L_0x0312;
            case 13: goto L_0x02d9;
            case 14: goto L_0x02ac;
            case 15: goto L_0x0286;
            case 16: goto L_0x0237;
            case 17: goto L_0x01e7;
            case 18: goto L_0x01c0;
            case 19: goto L_0x0199;
            case 20: goto L_0x0176;
            case 21: goto L_0x0153;
            case 22: goto L_0x012d;
            case 23: goto L_0x0107;
            case 24: goto L_0x00e0;
            case 25: goto L_0x00b9;
            case 26: goto L_0x0096;
            case 27: goto L_0x0073;
            case 28: goto L_0x004d;
            case 29: goto L_0x0027;
            default: goto L_0x001f;
        };
    L_0x001f:
        r1 = new java.lang.IllegalArgumentException;
        r0 = "Default case not allowed for VisualMessageBubbleStyle";
        r1.<init>(r0);
        throw r1;
    L_0x0027:
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r10 = r0.f56259N;
        r0 = 2131230997; // 0x7f080115 float:1.8078063E38 double:1.052968019E-314;
        r12 = X.AnonymousClass0Ca.E(r2, r0);
        r0 = 2131693352; // 0x7f0f0f28 float:1.901583E38 double:1.0531964527E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27863F(r1, r0);
        goto L_0x02d1;
    L_0x004d:
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r10 = r0.f56259N;
        r0 = 2131230997; // 0x7f080115 float:1.8078063E38 double:1.052968019E-314;
        r12 = X.AnonymousClass0Ca.E(r2, r0);
        r0 = 2131692086; // 0x7f0f0a36 float:1.9013262E38 double:1.053195827E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27863F(r1, r0);
        goto L_0x02d1;
    L_0x0073:
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r10 = r0.f56259N;
        r12 = X.AnonymousClass5bW.m27867J(r13);
        r0 = 2131693352; // 0x7f0f0f28 float:1.901583E38 double:1.0531964527E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27863F(r1, r0);
        goto L_0x02d1;
    L_0x0096:
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r10 = r0.f56259N;
        r12 = X.AnonymousClass5bW.m27867J(r13);
        r0 = 2131692086; // 0x7f0f0a36 float:1.9013262E38 double:1.053195827E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27863F(r1, r0);
        goto L_0x02d1;
    L_0x00b9:
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r10 = r0.f56254I;
        r12 = X.AnonymousClass5bW.m27865H(r13);
        r0 = 2131693352; // 0x7f0f0f28 float:1.901583E38 double:1.0531964527E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27864G(r13, r1, r0);
        r0 = r8.f66998T;
        r8.f66988J = r0;
        goto L_0x02d1;
    L_0x00e0:
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r10 = r0.f56254I;
        r12 = X.AnonymousClass5bW.m27865H(r13);
        r0 = 2131692086; // 0x7f0f0a36 float:1.9013262E38 double:1.053195827E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27864G(r13, r1, r0);
        r0 = r8.f66998T;
        r8.f66988J = r0;
        goto L_0x02d1;
    L_0x0107:
        r0 = r13.f66995Q;
        r0 = r0.f56264C;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56264C;
        r10 = r0.f56259N;
        r0 = 2131230997; // 0x7f080115 float:1.8078063E38 double:1.052968019E-314;
        r12 = X.AnonymousClass0Ca.E(r2, r0);
        r0 = 2131693352; // 0x7f0f0f28 float:1.901583E38 double:1.0531964527E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27863F(r1, r0);
        goto L_0x02d1;
    L_0x012d:
        r0 = r13.f66995Q;
        r0 = r0.f56264C;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56264C;
        r10 = r0.f56259N;
        r0 = 2131230997; // 0x7f080115 float:1.8078063E38 double:1.052968019E-314;
        r12 = X.AnonymousClass0Ca.E(r2, r0);
        r0 = 2131692086; // 0x7f0f0a36 float:1.9013262E38 double:1.053195827E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27863F(r1, r0);
        goto L_0x02d1;
    L_0x0153:
        r0 = r13.f66995Q;
        r0 = r0.f56264C;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56264C;
        r10 = r0.f56259N;
        r12 = X.AnonymousClass5bW.m27867J(r13);
        r0 = 2131693352; // 0x7f0f0f28 float:1.901583E38 double:1.0531964527E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27863F(r1, r0);
        goto L_0x02d1;
    L_0x0176:
        r0 = r13.f66995Q;
        r0 = r0.f56264C;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56264C;
        r10 = r0.f56259N;
        r12 = X.AnonymousClass5bW.m27867J(r13);
        r0 = 2131692086; // 0x7f0f0a36 float:1.9013262E38 double:1.053195827E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27863F(r1, r0);
        goto L_0x02d1;
    L_0x0199:
        r0 = r13.f66995Q;
        r0 = r0.f56264C;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56264C;
        r10 = r0.f56254I;
        r12 = X.AnonymousClass5bW.m27865H(r13);
        r0 = 2131693352; // 0x7f0f0f28 float:1.901583E38 double:1.0531964527E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27864G(r13, r1, r0);
        r0 = r8.f66999U;
        r8.f66988J = r0;
        goto L_0x02d1;
    L_0x01c0:
        r0 = r13.f66995Q;
        r0 = r0.f56264C;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56264C;
        r10 = r0.f56254I;
        r12 = X.AnonymousClass5bW.m27865H(r13);
        r0 = 2131692086; // 0x7f0f0a36 float:1.9013262E38 double:1.053195827E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27864G(r13, r1, r0);
        r0 = r8.f66999U;
        r8.f66988J = r0;
        goto L_0x02d1;
    L_0x01e7:
        r0 = r13.f66994P;
        if (r0 == 0) goto L_0x0205;
    L_0x01eb:
        r0 = 2131231727; // 0x7f0803ef float:1.8079543E38 double:1.0529683796E-314;
        r11 = X.AnonymousClass0Ca.E(r2, r0);
        r0 = 2131099955; // 0x7f060133 float:1.7812278E38 double:1.0529032756E-314;
        r0 = X.AnonymousClass0Ca.C(r2, r0);
        r10 = android.content.res.ColorStateList.valueOf(r0);
        r0 = 2131231580; // 0x7f08035c float:1.8079245E38 double:1.052968307E-314;
        r12 = X.AnonymousClass0Ca.E(r2, r0);
        goto L_0x0222;
    L_0x0205:
        r0 = 2130968835; // 0x7f040103 float:1.7546335E38 double:1.0528384937E-314;
        r0 = X.AnonymousClass0G5.F(r2, r0);
        r11 = X.AnonymousClass0Ca.E(r2, r0);
        r0 = 2130968817; // 0x7f0400f1 float:1.7546298E38 double:1.052838485E-314;
        r0 = X.AnonymousClass0G5.D(r2, r0);
        r10 = android.content.res.ColorStateList.valueOf(r0);
        r0 = 2131230986; // 0x7f08010a float:1.807804E38 double:1.0529680135E-314;
        r12 = X.AnonymousClass0Ca.E(r2, r0);
    L_0x0222:
        r0 = 2131690776; // 0x7f0f0518 float:1.9010605E38 double:1.05319518E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27864G(r13, r1, r0);
        r0 = r8.f66997S;
        r8.f66988J = r0;
        goto L_0x02d1;
    L_0x0237:
        r0 = r13.f66994P;
        if (r0 == 0) goto L_0x0255;
    L_0x023b:
        r0 = 2131231727; // 0x7f0803ef float:1.8079543E38 double:1.0529683796E-314;
        r11 = X.AnonymousClass0Ca.E(r2, r0);
        r0 = 2131099955; // 0x7f060133 float:1.7812278E38 double:1.0529032756E-314;
        r0 = X.AnonymousClass0Ca.C(r2, r0);
        r10 = android.content.res.ColorStateList.valueOf(r0);
        r0 = 2131231580; // 0x7f08035c float:1.8079245E38 double:1.052968307E-314;
        r12 = X.AnonymousClass0Ca.E(r2, r0);
        goto L_0x0272;
    L_0x0255:
        r0 = 2130968835; // 0x7f040103 float:1.7546335E38 double:1.0528384937E-314;
        r0 = X.AnonymousClass0G5.F(r2, r0);
        r11 = X.AnonymousClass0Ca.E(r2, r0);
        r0 = 2130968817; // 0x7f0400f1 float:1.7546298E38 double:1.052838485E-314;
        r0 = X.AnonymousClass0G5.D(r2, r0);
        r10 = android.content.res.ColorStateList.valueOf(r0);
        r0 = 2131230986; // 0x7f08010a float:1.807804E38 double:1.0529680135E-314;
        r12 = X.AnonymousClass0Ca.E(r2, r0);
    L_0x0272:
        r0 = 2131690775; // 0x7f0f0517 float:1.9010603E38 double:1.0531951795E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27864G(r13, r1, r0);
        r0 = r8.f66997S;
        r8.f66988J = r0;
        goto L_0x02d1;
    L_0x0286:
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r10 = r0.f56254I;
        r12 = X.AnonymousClass5bW.m27865H(r13);
        r0 = 2131693352; // 0x7f0f0f28 float:1.901583E38 double:1.0531964527E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27864G(r13, r1, r0);
        r0 = r8.f67000V;
        r8.f66988J = r0;
        goto L_0x02d1;
    L_0x02ac:
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r10 = r0.f56254I;
        r12 = X.AnonymousClass5bW.m27865H(r13);
        r0 = 2131692086; // 0x7f0f0a36 float:1.9013262E38 double:1.053195827E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27864G(r13, r1, r0);
        r0 = r8.f67000V;
        r8.f66988J = r0;
    L_0x02d1:
        r14 = X.AnonymousClass5bW.m27871N(r8, r5);
        X.AnonymousClass5bW.m27869L(r8, r9, r10, r11, r12, r13, r14);
        return;
    L_0x02d9:
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r10 = r0.f56254I;
        r12 = X.AnonymousClass5bW.m27865H(r13);
        r0 = 2131693352; // 0x7f0f0f28 float:1.901583E38 double:1.0531964527E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27864G(r13, r1, r0);
        r0 = X.AnonymousClass5bW.m27870M(r6);
        if (r0 == 0) goto L_0x0303;
    L_0x0300:
        r2 = r8.f66998T;
        goto L_0x030f;
    L_0x0303:
        r1 = 2131690774; // 0x7f0f0516 float:1.9010601E38 double:1.053195179E-314;
        r0 = r8.V();
        r2 = new X.5W5;
        r2.<init>(r8, r0, r1);
    L_0x030f:
        r8.f66988J = r2;
        goto L_0x02d1;
    L_0x0312:
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r11 = r0.A();
        r0 = r13.f66995Q;
        r0 = r0.f56263B;
        r10 = r0.f56254I;
        r12 = X.AnonymousClass5bW.m27865H(r13);
        r0 = 2131692086; // 0x7f0f0a36 float:1.9013262E38 double:1.053195827E-314;
        r1 = r2.getString(r0);
        r0 = r6.E(r2, r7);
        r13 = X.AnonymousClass5bW.m27864G(r13, r1, r0);
        r0 = X.AnonymousClass5bW.m27870M(r6);
        if (r0 == 0) goto L_0x033a;
    L_0x0339:
        goto L_0x0300;
    L_0x033a:
        r1 = 2131690773; // 0x7f0f0515 float:1.90106E38 double:1.0531951785E-314;
        r0 = r8.V();
        r2 = new X.5W5;
        r2.<init>(r8, r0, r1);
        goto L_0x030f;
    L_0x0347:
        r0 = 2131690470; // 0x7f0f03e6 float:1.9009985E38 double:1.053195029E-314;
        r6 = r2.getString(r0);
        r0 = 2131690453; // 0x7f0f03d5 float:1.900995E38 double:1.0531950204E-314;
        r5 = r2.getString(r0);
        r2 = new android.text.SpannableString;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r6);
        r0 = "line.separator";
        r0 = java.lang.System.getProperty(r0);
        r1.append(r0);
        r1.append(r5);
        r0 = r1.toString();
        r2.<init>(r0);
        r0 = r13.f66992N;
        X.AnonymousClass5bW.m27862E(r2, r0, r6);
        r0 = r13.f66981C;
        r0.setText(r2);
        r1 = r13.f66981C;
        r0 = r13.f66995Q;
        r0 = r0.f56264C;
        r0 = r0.A();
        r1.setBackground(r0);
        r0 = r13.f66981C;
        r0.setCompoundDrawablesWithIntrinsicBounds(r4, r4, r4, r4);
        r0 = r13.f66981C;
        r0.setCompoundDrawablePadding(r3);
        return;
    L_0x0394:
        r0 = 2131690468; // 0x7f0f03e4 float:1.900998E38 double:1.053195028E-314;
        r6 = r2.getString(r0);
        r0 = 2131690452; // 0x7f0f03d4 float:1.9009948E38 double:1.05319502E-314;
        r5 = r2.getString(r0);
        r2 = new android.text.SpannableString;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r6);
        r0 = "line.separator";
        r0 = java.lang.System.getProperty(r0);
        r1.append(r0);
        r1.append(r5);
        r0 = r1.toString();
        r2.<init>(r0);
        r0 = r13.f66992N;
        X.AnonymousClass5bW.m27862E(r2, r0, r6);
        r0 = r13.f66981C;
        r0.setText(r2);
        r1 = r13.f66981C;
        r0 = r13.f66995Q;
        r0 = r0.f56264C;
        r0 = r0.A();
        r1.setBackground(r0);
        r0 = r13.f66981C;
        r0.setCompoundDrawablesWithIntrinsicBounds(r4, r4, r4, r4);
        r0 = r13.f66981C;
        r0.setCompoundDrawablePadding(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5bW.K(X.5WQ):void");
    }

    public final void Kq() {
        if (m27252I()) {
            AnonymousClass4gR anonymousClass4gR = this.f65523E;
            this.f56220C = anonymousClass4gR;
            X(anonymousClass4gR);
        }
    }

    /* renamed from: L */
    private static void m27869L(AnonymousClass5bW anonymousClass5bW, Resources resources, ColorStateList colorStateList, Drawable drawable, Drawable drawable2, CharSequence charSequence, boolean z) {
        anonymousClass5bW.f66981C.setText(charSequence);
        anonymousClass5bW.f66981C.setBackground(drawable);
        anonymousClass5bW.f66981C.setTextColor(colorStateList);
        int dimensionPixelSize = resources.getDimensionPixelSize(C0164R.dimen.direct_row_message_content_horizontal_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0164R.dimen.direct_row_message_content_vertical_padding);
        if (drawable2 != null) {
            int dimensionPixelSize3;
            drawable2.mutate();
            drawable2.setColorFilter(AnonymousClass0ca.B(colorStateList.getDefaultColor()));
            anonymousClass5bW.f66990L.setImageDrawable(drawable2);
            anonymousClass5bW.f66990L.setVisibility(0);
            ImageView imageView = anonymousClass5bW.f66990L;
            double pow = Math.pow((double) resources.getConfiguration().fontScale, 3.5d);
            double dimensionPixelSize4 = (double) resources.getDimensionPixelSize(C0164R.dimen.direct_row_visual_message_icon_text_offset);
            Double.isNaN(dimensionPixelSize4);
            int i = (int) (pow * dimensionPixelSize4);
            int applyDimension = (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics());
            if (drawable2.getIntrinsicHeight() > applyDimension) {
                i -= (drawable2.getIntrinsicHeight() - applyDimension) / 2;
            }
            imageView.setY((float) i);
            if (z) {
                dimensionPixelSize3 = resources.getDimensionPixelSize(C0164R.dimen.direct_row_visual_message_icon_end_padding);
            } else {
                dimensionPixelSize3 = resources.getDimensionPixelSize(C0164R.dimen.direct_row_inbox_glyph_padding);
            }
            if (z) {
                applyDimension = resources.getDimensionPixelSize(C0164R.dimen.direct_row_visual_message_icon_start_padding_compressed);
            } else {
                applyDimension = resources.getDimensionPixelSize(C0164R.dimen.direct_row_visual_message_icon_start_padding);
            }
            AnonymousClass0Nm.e(anonymousClass5bW.f66990L, dimensionPixelSize3);
            AnonymousClass0Nm.c(anonymousClass5bW.f66990L, applyDimension);
            AnonymousClass0mE.P(anonymousClass5bW.f66981C, (AnonymousClass0mE.E(anonymousClass5bW.f66990L) + AnonymousClass0mE.D(anonymousClass5bW.f66990L)) + drawable2.getIntrinsicWidth(), dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            return;
        }
        anonymousClass5bW.f66990L.setVisibility(8);
        AnonymousClass0mE.P(anonymousClass5bW.f66981C, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }

    /* renamed from: M */
    private static boolean m27870M(AnonymousClass0W7 anonymousClass0W7) {
        return (((Boolean) AnonymousClass0CC.Vh.G()).booleanValue() || ((Boolean) AnonymousClass0E6.C(AnonymousClass0CC.eI)).booleanValue()) && !anonymousClass0W7.A();
    }

    public final void Mq() {
        Context V = V();
        AnonymousClass5bW.m27869L(this, V.getResources(), ColorStateList.valueOf(AnonymousClass0G5.D(V, C0164R.attr.directPaletteColor5)), AnonymousClass0Ca.E(V, AnonymousClass0G5.F(V, C0164R.attr.directRoundedBubbleBackground)), AnonymousClass5bW.m27867J(this), V.getString(C0164R.string.direct_expiring_media_loading), this.f66994P);
    }

    /* renamed from: N */
    private static boolean m27871N(AnonymousClass5bW anonymousClass5bW, int i) {
        return (!anonymousClass5bW.f66994P || i == 29 || i == 28 || i == 23 || i == 22) ? false : true;
    }

    /* renamed from: Z */
    public final void mo6027Z() {
        Handler handler = this.f66984F;
        if (handler != null) {
            AnonymousClass0OR.G(handler, this.f66985G, 1468680258);
            this.f66984F = null;
            this.f66985G = null;
        }
        AnonymousClass14H.C(this.f66981C).J();
        this.f66981C.setTranslationY(0.0f);
        this.f66981C.setAlpha(1.0f);
        if (m27252I()) {
            AnonymousClass1dU.G(this.f66993O, this.f65523E.f65618B);
        }
        super.mo6027Z();
    }

    /* renamed from: b */
    public final int mo6028b() {
        return C0164R.layout.message_direct_visual_media;
    }

    /* renamed from: e */
    public final void mo6029e(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass0W7 anonymousClass0W7 = anonymousClass5WQ.f65618B;
        this.f66981C.setMaxLines(Integer.MAX_VALUE);
        this.f66981C.setEllipsize(null);
        m27868K(anonymousClass5WQ);
        m27261f(anonymousClass5WQ);
        AnonymousClass1dU anonymousClass1dU = this.f66993O;
        if (anonymousClass1dU != null) {
            AnonymousClass1dU.E(anonymousClass1dU, anonymousClass5WQ, this.f66996R.B(), false, anonymousClass5WQ.f65619C);
        }
        this.f66982D.A(anonymousClass0W7, anonymousClass0W7.S(this.f66996R.B()));
        boolean S = anonymousClass0W7.S(this.f66996R.B());
        if (this.f66982D.f56107D.C()) {
            AnonymousClass1ke anonymousClass1ke = new AnonymousClass1ke();
            anonymousClass1ke.B(this.f66980B);
            int id = this.f66983E.getId();
            int id2 = this.f66982D.f56107D.A().getId();
            int i = S ? id : id2;
            if (S) {
                id = id2;
            }
            anonymousClass1ke.C(i, 6, id, 7);
            ConstraintLayout constraintLayout = this.f66980B;
            anonymousClass1ke.A(constraintLayout);
            constraintLayout.setConstraintSet(null);
        }
    }

    public final boolean xr(AnonymousClass5WQ anonymousClass5WQ) {
        AnonymousClass4f4 anonymousClass4f4 = this.f66988J;
        return anonymousClass4f4 != null ? anonymousClass4f4.mf(anonymousClass5WQ) : false;
    }
}
