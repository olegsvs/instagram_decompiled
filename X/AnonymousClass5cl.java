package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.LineBackgroundSpan;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.View;
import android.widget.Adapter;
import android.widget.EditText;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.shopping.Product;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.text.CustomUnderlineSpan;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.ui.widget.drawing.StrokeWidthTool;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.5cl */
public final class AnonymousClass5cl implements AnonymousClass2Lh, AnonymousClass4Pp, AnonymousClass4Lq, AnonymousClass2Ks, AnonymousClass5cN, AnonymousClass4UX, AnonymousClass0Qd, AnonymousClass4UP, AnonymousClass4UV, AnonymousClass0eJ, AnonymousClass0Uy {
    private boolean AB;
    /* renamed from: B */
    public final SparseArray f67403B = new SparseArray();
    private final AnonymousClass0hj BB;
    /* renamed from: C */
    public final AnonymousClass5Se f67404C;
    private int CB;
    /* renamed from: D */
    public final boolean f67405D;
    private final AnonymousClass5bK DB;
    /* renamed from: E */
    public final View f67406E;
    private final AnonymousClass5Tm EB;
    /* renamed from: F */
    public final ConstrainedEditText f67407F;
    private final AnonymousClass0IL FB;
    /* renamed from: G */
    public final AnonymousClass4UE f67408G;
    private final AnonymousClass5Sa GB;
    /* renamed from: H */
    public final ReboundViewPager f67409H;
    private final Map HB = new AnonymousClass0O7();
    /* renamed from: I */
    public final CirclePageIndicator f67410I;
    private final HashSet IB = new HashSet();
    /* renamed from: J */
    public final Context f67411J;
    private final Map JB = new AnonymousClass0O7();
    /* renamed from: K */
    public int f67412K;
    private final Drawable KB;
    /* renamed from: L */
    public AnonymousClass2bu f67413L;
    private final StrokeWidthTool LB;
    /* renamed from: M */
    public Runnable f67414M;
    /* renamed from: N */
    public final InteractiveDrawableContainer f67415N;
    /* renamed from: O */
    public final EyedropperColorPickerTool f67416O;
    /* renamed from: P */
    public final AnonymousClass2VO f67417P;
    /* renamed from: Q */
    public final AnonymousClass5TZ f67418Q;
    /* renamed from: R */
    public final boolean f67419R;
    /* renamed from: S */
    public boolean f67420S;
    /* renamed from: T */
    public int f67421T;
    /* renamed from: U */
    public final AnonymousClass4NC f67422U;
    /* renamed from: V */
    public AnonymousClass4Pk f67423V;
    /* renamed from: W */
    public final AnonymousClass5Tq f67424W;
    /* renamed from: X */
    public final AnonymousClass5UE f67425X;
    /* renamed from: Y */
    public final AnonymousClass4Tm f67426Y;
    /* renamed from: Z */
    public final AnonymousClass4To f67427Z;
    /* renamed from: a */
    public final AnonymousClass5TL f67428a;
    /* renamed from: b */
    public boolean f67429b;
    /* renamed from: c */
    public final AnonymousClass5UG f67430c;
    /* renamed from: d */
    public final AnonymousClass4U3 f67431d;
    /* renamed from: e */
    public final int f67432e;
    /* renamed from: f */
    public final float f67433f;
    /* renamed from: g */
    public final float f67434g;
    /* renamed from: h */
    public final AnonymousClass5UT f67435h;
    /* renamed from: i */
    public final AnonymousClass0Uw f67436i;
    /* renamed from: j */
    public final RecyclerView f67437j;
    /* renamed from: k */
    public final AnonymousClass4UQ f67438k;
    /* renamed from: l */
    public final AnonymousClass4UU f67439l;
    /* renamed from: m */
    public final GestureDetector f67440m;
    /* renamed from: n */
    public final AnonymousClass4UW f67441n;
    /* renamed from: o */
    public final AnonymousClass4UZ f67442o;
    /* renamed from: p */
    public long f67443p;
    /* renamed from: q */
    public final AnonymousClass0Cm f67444q;
    /* renamed from: r */
    public final AnonymousClass4Ue f67445r;
    /* renamed from: s */
    public AnonymousClass4Pq f67446s;
    /* renamed from: t */
    public final View f67447t;
    /* renamed from: u */
    private final AnonymousClass0EE f67448u;
    /* renamed from: v */
    private final Adapter f67449v;
    /* renamed from: w */
    private final View f67450w;
    /* renamed from: x */
    private final AnonymousClass4Lr f67451x;
    /* renamed from: y */
    private AnonymousClass4Pk f67452y;
    /* renamed from: z */
    private final AnonymousClass5L7 f67453z;

    public final void El() {
    }

    public final void Hl() {
    }

    public final void PDA() {
    }

    public final void QDA(float f, float f2) {
    }

    public AnonymousClass5cl(boolean z, AnonymousClass4UE anonymousClass4UE, AnonymousClass5UG anonymousClass5UG, AnonymousClass0Uw anonymousClass0Uw, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Fz anonymousClass0Fz, View view, InteractiveDrawableContainer interactiveDrawableContainer, AnonymousClass0ct anonymousClass0ct, AnonymousClass0ct anonymousClass0ct2, AnonymousClass0hj anonymousClass0hj, AnonymousClass5bK anonymousClass5bK, AnonymousClass3e1 anonymousClass3e1, AnonymousClass0IJ anonymousClass0IJ, AnonymousClass5L7 anonymousClass5L7, AnonymousClass4Lr anonymousClass4Lr, AnonymousClass4Ue anonymousClass4Ue, AnonymousClass5Tq anonymousClass5Tq, AnonymousClass0dF anonymousClass0dF, AnonymousClass4O1 anonymousClass4O1, AnonymousClass2VO anonymousClass2VO, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass5cl anonymousClass5cl = this;
        this.f67419R = z;
        this.f67408G = anonymousClass4UE;
        this.f67430c = anonymousClass5UG;
        AnonymousClass0Uw anonymousClass0Uw2 = anonymousClass0Uw;
        this.f67436i = anonymousClass0Uw2;
        this.f67436i.A(this);
        AnonymousClass0Uw anonymousClass0Uw3 = this.f67436i;
        anonymousClass0Uw3.f5588F.put(AnonymousClass3AM.MEDIA_EDIT, this);
        AnonymousClass0IL anonymousClass0IL = anonymousClass0IJ;
        this.f67411J = anonymousClass0IL.getContext();
        this.FB = anonymousClass0IL;
        this.f67453z = anonymousClass5L7;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this.f67444q = anonymousClass0Cm2;
        View view2 = view;
        this.f67447t = view2;
        AnonymousClass0hj anonymousClass0hj2 = anonymousClass0hj;
        this.BB = anonymousClass0hj2;
        InteractiveDrawableContainer interactiveDrawableContainer2 = interactiveDrawableContainer;
        this.f67415N = interactiveDrawableContainer2;
        ConstrainedEditText constrainedEditText = (ConstrainedEditText) view2.findViewById(C0164R.id.text_overlay_edit_text);
        this.f67407F = constrainedEditText;
        constrainedEditText.setSupportedContentMimeTypes(new String[]{"image/*"});
        this.f67406E = view2.findViewById(C0164R.id.text_overlay_edit_text_container);
        this.f67450w = view2.findViewById(C0164R.id.done_button);
        this.f67422U = new AnonymousClass4NC(this.f67411J, this.f67444q);
        this.f67448u = anonymousClass0EE;
        this.f67420S = AnonymousClass2K6.B(this.f67444q).B("classic").f28936G;
        this.f67451x = anonymousClass4Lr;
        this.f67416O = (EyedropperColorPickerTool) view2.findViewById(C0164R.id.eyedropper_color_picker_tool);
        this.f67445r = anonymousClass4Ue;
        this.GB = new AnonymousClass5Sa(anonymousClass0Cm2);
        AnonymousClass5Tq anonymousClass5Tq2 = anonymousClass5Tq;
        this.f67424W = anonymousClass5Tq2;
        Resources resources = this.f67411J.getResources();
        this.f67432e = resources.getColor(C0164R.color.black_25_transparent);
        float m = AnonymousClass0Nm.m(this.f67411J, 1.0f);
        this.f67434g = m;
        this.f67433f = m;
        this.KB = resources.getDrawable(C0164R.drawable.text_size);
        AnonymousClass3e1 anonymousClass3e12 = anonymousClass3e1;
        if (anonymousClass3e1 != null) {
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(C0164R.id.tagging_recycler_view);
            anonymousClass5cl.f67437j = recyclerView;
            recyclerView.setLayoutManager(new AnonymousClass0rr(view2.getContext(), 0, false));
            AnonymousClass4Qj anonymousClass4Qj = new AnonymousClass4Qj(anonymousClass3e12, new AnonymousClass5TV(anonymousClass5cl));
            anonymousClass4Qj.O(true);
            anonymousClass4Qj.N(new AnonymousClass4Pb(anonymousClass5cl, anonymousClass4Qj));
            anonymousClass5cl.f67437j.setAdapter(anonymousClass4Qj);
            anonymousClass5cl.f67407F.addTextChangedListener(anonymousClass4Qj);
            anonymousClass5cl.f67407F.A(new AnonymousClass4Pc(anonymousClass5cl, anonymousClass4Qj));
            anonymousClass5cl.f67418Q = new AnonymousClass5TZ(anonymousClass5cl.f67436i, anonymousClass5cl.f67444q, view2, anonymousClass5cl.f67407F, anonymousClass5cl.BB, anonymousClass5cl);
        } else {
            anonymousClass5cl.f67407F.A(new AnonymousClass4Pd(anonymousClass5cl));
            anonymousClass5cl.f67437j = null;
            anonymousClass5cl.f67418Q = null;
        }
        anonymousClass5cl.LB = (StrokeWidthTool) view2.findViewById(C0164R.id.stroke_width_tool);
        anonymousClass5cl.f67409H = (ReboundViewPager) view2.findViewById(C0164R.id.colour_palette_pager);
        anonymousClass5cl.f67410I = (CirclePageIndicator) view2.findViewById(C0164R.id.colour_palette_pager_indicator);
        anonymousClass5cl.f67438k = new AnonymousClass4UQ(view2, C0164R.id.text_overlay_edit_text, C0164R.id.postcapture_text_alignment_button, anonymousClass5cl);
        anonymousClass5cl.f67439l = new AnonymousClass4UU(view2, anonymousClass5cl.f67432e, anonymousClass5cl.f67434g, anonymousClass5cl.f67433f, (float) resources.getDimensionPixelSize(C0164R.dimen.caption_edit_text_padding));
        anonymousClass5cl.f67441n = new AnonymousClass4UW(view2, C0164R.id.postcapture_text_emphasis_button, anonymousClass5cl);
        String string = AnonymousClass0HV.D(anonymousClass5cl.f67444q).f2646B.getString("precapture_text_format_id", null);
        AnonymousClass2K6 B = AnonymousClass2K6.B(anonymousClass5cl.f67444q);
        anonymousClass5UG = B.A(string, B.B("classic"));
        View view3 = anonymousClass5cl.f67447t;
        anonymousClass4UE = new ArrayList();
        anonymousClass4UE.add(B.B("classic"));
        anonymousClass4UE.addAll(B.C());
        anonymousClass5cl.f67442o = new AnonymousClass4UZ(view3, C0164R.id.text_overlay_edit_text, true, anonymousClass4UE, anonymousClass5UG, anonymousClass5cl);
        AnonymousClass0Fz anonymousClass0Fz2 = anonymousClass0Fz;
        AnonymousClass0ct anonymousClass0ct3 = anonymousClass0ct;
        AnonymousClass0ct anonymousClass0ct4 = anonymousClass0ct2;
        AnonymousClass0dF anonymousClass0dF2 = anonymousClass0dF;
        View view4 = view2;
        InteractiveDrawableContainer interactiveDrawableContainer3 = interactiveDrawableContainer2;
        anonymousClass5cl.f67404C = new AnonymousClass5Se(anonymousClass5cl.f67408G, anonymousClass5cl.f67436i, anonymousClass5cl.FB, anonymousClass0Fz2, view4, interactiveDrawableContainer3, anonymousClass0ct3, anonymousClass0ct4, anonymousClass0Cm2, anonymousClass0dF2, anonymousClass5cl, anonymousClass5cl.BB, anonymousClass5cl.f67448u);
        AnonymousClass5bK anonymousClass5bK2 = anonymousClass5bK;
        anonymousClass5cl.f67428a = new AnonymousClass5TL(anonymousClass5cl.f67415N, anonymousClass5bK2, anonymousClass5cl);
        anonymousClass5cl.f67431d = new AnonymousClass4U3(anonymousClass5cl.f67444q, view2, anonymousClass5cl);
        AnonymousClass0Cm anonymousClass0Cm3 = anonymousClass5cl.f67444q;
        AnonymousClass0Px anonymousClass0Px = new AnonymousClass0Px(anonymousClass0IL.getContext(), anonymousClass0Fz2);
        AnonymousClass0Cm anonymousClass0Cm4 = anonymousClass0Cm3;
        AnonymousClass0Px anonymousClass0Px2 = anonymousClass0Px;
        AnonymousClass0IL anonymousClass0IL2 = anonymousClass0IL;
        View view5 = view2;
        anonymousClass0hj = anonymousClass0hj2;
        anonymousClass0ct = new AnonymousClass5Tc(view5, anonymousClass0hj, AnonymousClass3dl.B(anonymousClass0Cm4, anonymousClass0Px2, anonymousClass0IL2, "autocomplete_user_list", new AnonymousClass4Pe(anonymousClass5cl), Collections.singletonList(anonymousClass5cl.f67444q.B()), null, null), anonymousClass0Uw2, anonymousClass5cl.f67444q, anonymousClass5cl);
        AnonymousClass5UE anonymousClass5UE = null;
        AnonymousClass4Sg anonymousClass4Sg = new AnonymousClass4Sg(anonymousClass0Uw2, view2, anonymousClass0hj2, anonymousClass5cl);
        AnonymousClass4O1 anonymousClass4O12 = anonymousClass4O1;
        anonymousClass5cl.f67427Z = new AnonymousClass4To(anonymousClass0Uw2, view2, anonymousClass0hj2, anonymousClass0Cm2, anonymousClass5cl, anonymousClass4O12);
        anonymousClass5cl.f67435h = new AnonymousClass5UT(anonymousClass0Uw2, view2, anonymousClass0hj2, anonymousClass5cl, anonymousClass4O12);
        anonymousClass5cl.EB = new AnonymousClass5Tm(anonymousClass0Uw2, anonymousClass5Tq2, anonymousClass5cl.f67444q, view2, anonymousClass0dF2, anonymousClass5cl);
        if (((Boolean) AnonymousClass0E6.D(AnonymousClass09e.f1097C, anonymousClass5cl.f67444q)).booleanValue()) {
            AnonymousClass5UE anonymousClass5UE2 = new AnonymousClass5UE(anonymousClass5cl.f67436i, view2, anonymousClass5cl, anonymousClass5cl.f67444q, anonymousClass4O12, anonymousClass5cl.f67451x, anonymousClass5cl.f67416O);
        }
        anonymousClass5cl.f67425X = anonymousClass5UE;
        anonymousClass5cl.f67449v = anonymousClass5cl.f67409H.getAdapter();
        anonymousClass5cl.DB = anonymousClass5bK2;
        anonymousClass5cl.f67440m = new GestureDetector(view2.getContext(), new AnonymousClass4Pm(anonymousClass5cl));
        anonymousClass5cl.f67405D = AnonymousClass4MP.C() ^ 1;
        anonymousClass5cl.f67426Y = new AnonymousClass4Tm(anonymousClass5cl.f67411J, anonymousClass5cl, "TextOverlayController");
        anonymousClass5cl.f67417P = anonymousClass2VO;
        anonymousClass5cl.f67415N.B(anonymousClass5cl);
        AnonymousClass5cl.m28087K(anonymousClass5cl);
        anonymousClass5cl.f67406E.setOnTouchListener(new AnonymousClass4PJ(anonymousClass5cl));
        anonymousClass5cl.f67407F.setOnFocusChangeListener(new AnonymousClass4PK(anonymousClass5cl));
        anonymousClass5cl.f67407F.addTextChangedListener(new AnonymousClass4PL(anonymousClass5cl));
        AnonymousClass4Sb anonymousClass4Sb = anonymousClass5cl.f67408G.f54564F;
        if (anonymousClass4Sb != null) {
            AnonymousClass0Nm.T(anonymousClass5cl.f67415N, new AnonymousClass4PM(anonymousClass5cl, anonymousClass4Sb));
        }
        AnonymousClass4Ql anonymousClass4Ql = anonymousClass5cl.f67408G.f54563E;
        if (anonymousClass4Ql != null) {
            AnonymousClass0Nm.T(anonymousClass5cl.f67415N, new AnonymousClass4PN(anonymousClass5cl, anonymousClass4Ql));
        }
    }

    /* renamed from: A */
    public final boolean m28110A(AnonymousClass3AM anonymousClass3AM) {
        return (AnonymousClass3AM.MEDIA_EDIT == anonymousClass3AM && this.f67423V == AnonymousClass4Pk.EYEDROPPER_COLOR_PICKER_ACTIVE) ? false : true;
    }

    public final void AEA() {
        AnonymousClass4Pq anonymousClass4Pq = this.f67446s;
        if (anonymousClass4Pq != null) {
            Object obj;
            if (anonymousClass4Pq.f53808H.E() <= StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED && anonymousClass4Pq.f53803C.E() <= StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED && anonymousClass4Pq.f53803C.G() && anonymousClass4Pq.f53808H.G()) {
                if (!anonymousClass4Pq.f53804D) {
                    obj = null;
                    if (obj != null) {
                        m28131V(AnonymousClass4Pk.SCRUBBING_FOR_REGION_TRACKING);
                        return;
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                m28131V(AnonymousClass4Pk.SCRUBBING_FOR_REGION_TRACKING);
                return;
            }
        }
        if (this.f67423V == AnonymousClass4Pk.DRAGGING_ASSET) {
            m28131V(AnonymousClass4Pk.AVAILABLE);
        }
    }

    /* renamed from: B */
    public final void m28111B(AnonymousClass2VC anonymousClass2VC, boolean z) {
        AnonymousClass2Lb anonymousClass2Lb = new AnonymousClass2Lb();
        anonymousClass2Lb.f29352B = z ^ 1;
        anonymousClass2Lb.f29355E = 0.3f;
        anonymousClass2Lb.f29359I = z ? AnonymousClass2Le.AUTOMATICALLY_ADDED : AnonymousClass2Le.USER_ADDED;
        anonymousClass2Lb.f29364N = "TextOverlayController";
        anonymousClass2Lb.f29357G = z ^ 1;
        m28128S(AnonymousClass27l.f26350L.A(), anonymousClass2VC, anonymousClass2Lb.A(), AnonymousClass3DS.B(AnonymousClass2G6.C(anonymousClass2VC)));
    }

    /* renamed from: B */
    public static void m28078B(AnonymousClass5cl anonymousClass5cl, Drawable drawable) {
        AnonymousClass0Nm.R(anonymousClass5cl.f67415N, new AnonymousClass4PS(anonymousClass5cl, drawable));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: C */
    public final void m28112C(X.AnonymousClass27l r12, android.graphics.drawable.Drawable r13, X.AnonymousClass2Lb r14) {
        /*
        r11 = this;
        r2 = "TextOverlayController";
        r14.f29364N = r2;
        r0 = X.AnonymousClass5cl.m28099W(r12);
        r14.f29354D = r0;
        r1 = X.AnonymousClass4Pa.f53761D;
        r0 = r12.f26359E;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r4 = 0;
        r5 = 0;
        r3 = 1;
        switch(r0) {
            case 1: goto L_0x02cc;
            case 2: goto L_0x02a4;
            case 3: goto L_0x0298;
            case 4: goto L_0x0234;
            case 5: goto L_0x016f;
            case 6: goto L_0x012e;
            case 7: goto L_0x0129;
            case 8: goto L_0x00c5;
            case 9: goto L_0x00ab;
            case 10: goto L_0x00a2;
            case 11: goto L_0x009d;
            case 12: goto L_0x0091;
            case 13: goto L_0x007e;
            case 14: goto L_0x001c;
            default: goto L_0x001a;
        };
    L_0x001a:
        goto L_0x032e;
    L_0x001c:
        r7 = r11.f67411J;
        r0 = r11.f67415N;
        r10 = r0.getWidth();
        r1 = r7.getResources();
        r0 = 2131165580; // 0x7f07018c float:1.7945381E38 double:1.0529356987E-314;
        r9 = r1.getDimensionPixelSize(r0);
        r1 = r7.getResources();
        r0 = 2131165581; // 0x7f07018d float:1.7945383E38 double:1.052935699E-314;
        r0 = r1.getDimensionPixelSize(r0);
        r8 = (float) r0;
        r0 = 2131166173; // 0x7f0703dd float:1.7946584E38 double:1.0529359917E-314;
        r6 = 1;
        r2 = X.AnonymousClass3G6.B(r7, r6, r9, r0);
        r5 = new X.2bu;
        r5.<init>(r7, r10);
        r0 = (float) r9;
        X.AnonymousClass27w.C(r7, r5, r8, r0, r0);
        r5.H(r2);
        r0 = 2131166173; // 0x7f0703dd float:1.7946584E38 double:1.0529359917E-314;
        r4 = 0;
        r3 = X.AnonymousClass3G6.B(r7, r4, r9, r0);
        r1 = new X.2bu;
        r1.<init>(r7, r10);
        r0 = (float) r9;
        X.AnonymousClass27w.C(r7, r1, r8, r0, r0);
        r1.H(r3);
        r2 = new X.2VC;
        r0 = 2;
        r0 = new android.graphics.drawable.Drawable[r0];
        r0[r4] = r5;
        r0[r6] = r1;
        r2.<init>(r7, r0);
        r0 = X.AnonymousClass27l.f26348J;
        r1 = r0.A();
        r0 = r14.A();
        r11.m28127R(r1, r2, r0);
        goto L_0x032d;
    L_0x007e:
        r3 = r11.f67404C;
        r2 = r3.f64048F;
        r1 = r3.f64064V;
        r0 = 1;
        r2.B(r1, r0);
        r2 = r3.f64078j;
        r0 = 0;
        r2.N(r0);
        goto L_0x032d;
    L_0x0091:
        r0 = r11.f67404C;
        r2 = r0.f64048F;
        r1 = r0.f64065W;
        r0 = 1;
        r2.B(r1, r0);
        goto L_0x032d;
    L_0x009d:
        r0 = 1;
        r14.f29360J = r0;
        goto L_0x032e;
    L_0x00a2:
        r1 = r11.f67404C;
        r0 = X.AnonymousClass4K7.GIF;
        r1.m26766D(r0);
        goto L_0x032d;
    L_0x00ab:
        r1 = r11.f67415N;
        r0 = X.AnonymousClass2Gd.class;
        r1 = r1.F(r0);
        r0 = r1.isEmpty();
        if (r0 == 0) goto L_0x00ba;
    L_0x00b9:
        goto L_0x00c0;
    L_0x00ba:
        r4 = r1.get(r5);
        r4 = (X.AnonymousClass2Gd) r4;
    L_0x00c0:
        r11.m28103a(r4);
        goto L_0x032d;
    L_0x00c5:
        r1 = r11.f67415N;
        r0 = X.AnonymousClass2GR.class;
        r1 = r1.F(r0);
        r0 = r1.isEmpty();
        if (r0 == 0) goto L_0x011e;
    L_0x00d3:
        r0 = X.AnonymousClass2GR.class;
        X.AnonymousClass5cl.m28088L(r11, r0);
        r0 = r12.f26360F;
        r2 = 0;
        r0 = r0.get(r2);
        r0 = (X.AnonymousClass27n) r0;
        r0 = r0.f26381R;
        if (r0 == 0) goto L_0x00f0;
    L_0x00e5:
        r1 = r11.f67436i;
        r0 = new X.3EL;
        r0.<init>();
        r1.C(r0);
        goto L_0x011c;
    L_0x00f0:
        r1 = new X.2GE;
        r1.<init>();
        r0 = r11.f67444q;
        r0 = r0.B();
        r0 = r0.DQ();
        r1.f28234D = r0;
        r0 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1.f28236F = r0;
        r0 = -1;
        r1.f28232B = r0;
        r0 = r12.f26360F;
        r0 = r0.get(r2);
        r0 = (X.AnonymousClass27n) r0;
        r0 = r0.f26380Q;
        r1.f28233C = r0;
        r0 = new X.1IS;
        r0.<init>(r1);
        r11.m28125P(r0);
    L_0x011c:
        goto L_0x032d;
    L_0x011e:
        r0 = r1.get(r5);
        r0 = (X.AnonymousClass2GR) r0;
        r11.m28102Z(r0);
        goto L_0x032d;
    L_0x0129:
        r11.m28101Y();
        goto L_0x032d;
    L_0x012e:
        r0 = r11.zX();
        if (r0 == 0) goto L_0x0147;
    L_0x0134:
        r3 = r11.f67404C;
        r2 = r3.f64048F;
        r1 = r3.f64072d;
        r0 = 1;
        r2.B(r1, r0);
        r2 = r3.f64078j;
        r0 = 0;
        r2.N(r0);
        goto L_0x032d;
    L_0x0147:
        r1 = r11.f67430c;
        r0 = X.AnonymousClass4Tu.f54468J;
        r0 = r1.m27003B(r0);
        if (r0 != 0) goto L_0x015b;
    L_0x0151:
        r1 = r11.f67411J;
        r0 = 2131691732; // 0x7f0f08d4 float:1.9012544E38 double:1.0531956523E-314;
        X.AnonymousClass4Tt.B(r1, r0);
        goto L_0x032d;
    L_0x015b:
        r1 = r11.f67430c;
        r0 = X.AnonymousClass4Tu.f54462D;
        r0 = r1.m27003B(r0);
        if (r0 != 0) goto L_0x032d;
    L_0x0165:
        r1 = r11.f67411J;
        r0 = 2131691733; // 0x7f0f08d5 float:1.9012546E38 double:1.053195653E-314;
        X.AnonymousClass4Tt.B(r1, r0);
        goto L_0x032d;
    L_0x016f:
        r1 = r11.f67436i;
        r0 = new X.3EU;
        r0.<init>();
        r1.C(r0);
        r0 = r11.f67431d;
        r0 = r0.B();
        if (r0 != 0) goto L_0x032d;
    L_0x0181:
        r4 = r11.f67431d;
        r0 = r4.f54494D;
        if (r0 != 0) goto L_0x01b7;
    L_0x0187:
        r0 = r4.f54493C;
        r1 = r0.inflate();
        r1 = (android.view.ViewGroup) r1;
        r4.f54494D = r1;
        r0 = 2131299396; // 0x7f090c44 float:1.8216792E38 double:1.0530018126E-314;
        r0 = r1.findViewById(r0);
        r0 = (com.instagram.ui.widget.textureview.MaskingTextureView) r0;
        r4.f54492B = r0;
        r1 = r4.f54494D;
        r0 = 2131299394; // 0x7f090c42 float:1.8216788E38 double:1.0530018116E-314;
        r1 = r1.findViewById(r0);
        r1 = (com.instagram.ui.widget.shutterbutton.ShutterButton) r1;
        r4.f54502L = r1;
        r0 = 0;
        r1.setVideoRecordingEnabled(r0);
        r1 = r4.f54502L;
        r0 = new X.5UQ;
        r0.<init>(r4);
        r1.setOnSingleTapCaptureListener(r0);
    L_0x01b7:
        r1 = r4.f54494D;
        r0 = 0;
        r1.setVisibility(r0);
        r1 = r4.f54502L;
        r0 = 1;
        r1.setEnabled(r0);
        r0 = r13;
        r0 = (X.AnonymousClass2VC) r0;
        r4.f54498H = r0;
        r0 = r4.f54505O;
        r1 = r0.getResources();
        r0 = 2131165299; // 0x7f070073 float:1.7944811E38 double:1.05293556E-314;
        r1 = r1.getDimensionPixelSize(r0);
        r0 = r4.f54505O;
        r0 = r0.getWidth();
        r0 = r0 / 2;
        r2 = r1 / 2;
        r0 = r0 - r2;
        r0 = (float) r0;
        r4.f54503M = r0;
        r0 = r4.f54505O;
        r0 = r0.getHeight();
        r0 = r0 / 2;
        r0 = r0 - r2;
        r0 = (float) r0;
        r4.f54504N = r0;
        r1 = r4.f54494D;
        r0 = r4.f54503M;
        r1.setX(r0);
        r1 = r4.f54494D;
        r0 = r4.f54504N;
        r1.setY(r0);
        r0 = r4.f54494D;
        r1 = (float) r2;
        r0.setPivotX(r1);
        r0 = r4.f54494D;
        r0.setPivotY(r1);
        X.AnonymousClass4U3.D(r4);
        r0 = r4.f54492B;
        r0 = r0.isAvailable();
        if (r0 == 0) goto L_0x0229;
    L_0x0213:
        r0 = r4.f54492B;
        r2 = r0.getSurfaceTexture();
        r0 = r4.f54492B;
        r1 = r0.getWidth();
        r0 = r4.f54492B;
        r0 = r0.getHeight();
        X.AnonymousClass4U3.C(r4, r2, r1, r0);
        goto L_0x022e;
    L_0x0229:
        r0 = r4.f54492B;
        r0.setSurfaceTextureListener(r4);
    L_0x022e:
        r0 = r11.f67431d;
        r14.f29356F = r0;
        goto L_0x032e;
    L_0x0234:
        r1 = r11.f67430c;
        r0 = X.AnonymousClass4Tu.f54467I;
        r0 = r1.m27003B(r0);
        if (r0 != 0) goto L_0x025a;
    L_0x023e:
        r1 = X.AnonymousClass09e.f1097C;
        r0 = r11.f67444q;
        r0 = r1.H(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x025a;
    L_0x024e:
        r1 = r11.f67415N;
        r0 = 0;
        r0 = X.AnonymousClass4Tm.B(r1, r0);
        if (r0 == 0) goto L_0x025a;
    L_0x0257:
        r1.J(r0);
    L_0x025a:
        r1 = r11.f67430c;
        r0 = X.AnonymousClass4Tu.f54463E;
        r0 = r1.m27003B(r0);
        if (r0 != 0) goto L_0x0285;
    L_0x0264:
        r1 = X.AnonymousClass09e.f1097C;
        r0 = r11.f67444q;
        r0 = r1.H(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0285;
    L_0x0274:
        r0 = r11.f67426Y;
        r2 = r0.f54428B;
        r1 = 2131692202; // 0x7f0f0aaa float:1.9013497E38 double:1.0531958845E-314;
        r0 = 0;
        r0 = android.widget.Toast.makeText(r2, r1, r0);
        r0.show();
        goto L_0x032d;
    L_0x0285:
        r0 = r11.JY();
        if (r0 == 0) goto L_0x032d;
    L_0x028b:
        r3 = X.AnonymousClass0Jn.f2942B;
        r2 = r11.f67444q;
        r1 = r11.FB;
        r0 = "story-emoji";
        r3.D(r2, r1, r0);
        goto L_0x032d;
    L_0x0298:
        r1 = r11.f67436i;
        r0 = new X.3E3;
        r0.<init>();
        r1.C(r0);
        goto L_0x032d;
    L_0x02a4:
        r1 = r11.m28097U();
        if (r1 == 0) goto L_0x02c1;
    L_0x02aa:
        r0 = X.AnonymousClass2eD.class;
        r0 = r1.B(r0);
        r0 = r0.get(r5);
        r0 = (X.AnonymousClass2eD) r0;
        r0 = r0.f31514M;
        r4 = r0.toString();
        r0 = r11.f67415N;
        r0.J(r1);
    L_0x02c1:
        r1 = r11.f67436i;
        r0 = new X.3Dx;
        r0.<init>(r4);
        r1.C(r0);
        goto L_0x032d;
    L_0x02cc:
        r5 = new android.os.Bundle;
        r5.<init>();
        r1 = "INTENT_EXTRA_SESSION_ID";
        r0 = r11.f67444q;
        r0 = r0.f1759C;
        r0 = X.AnonymousClass4Wt.C(r0);
        r5.putString(r1, r0);
        r0 = "INTENT_EXTRA_TRANSPARENT_MODAL_MODE";
        r5.putBoolean(r0, r3);
        r0 = r11.f67408G;	 Catch:{ IOException -> 0x0306 }
        r1 = r0.B();	 Catch:{ IOException -> 0x0306 }
        r0 = X.AnonymousClass3FK.PHOTO;	 Catch:{ IOException -> 0x0306 }
        if (r1 != r0) goto L_0x030c;
    L_0x02ed:
        r0 = r11.f67408G;	 Catch:{ IOException -> 0x0306 }
        r0 = r0.C();	 Catch:{ IOException -> 0x0306 }
        r1 = r0.f44605M;	 Catch:{ IOException -> 0x0306 }
        r0 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x0306 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0306 }
        r1 = X.AnonymousClass3He.I(r0);	 Catch:{ IOException -> 0x0306 }
        if (r1 == 0) goto L_0x030c;
    L_0x0300:
        r0 = "INTENT_EXTRA_PHOTO_LOCATION";
        r5.putParcelable(r0, r1);	 Catch:{ IOException -> 0x0306 }
        goto L_0x030c;
    L_0x0306:
        r1 = move-exception;
        r0 = "Failed to read exif location";
        X.AnonymousClass0Dc.G(r2, r0, r1);
    L_0x030c:
        r2 = new X.0Sn;
        r3 = com.instagram.modal.TransparentModalActivity.class;
        r4 = "location_picker";
        r0 = r11.FB;
        r1 = r0.getContext();
        r0 = android.app.Activity.class;
        r6 = X.AnonymousClass0T1.B(r1, r0);
        r6 = (android.app.Activity) r6;
        r0 = r11.f67444q;
        r7 = r0.f1759C;
        r2.<init>(r3, r4, r5, r6, r7);
        r1 = r11.FB;
        r0 = 2;
        r2.C(r1, r0);
    L_0x032d:
        r3 = 0;
    L_0x032e:
        if (r3 == 0) goto L_0x0340;
    L_0x0330:
        r1 = r12.A();
        r0 = r14.A();
        r11.m28127R(r1, r13, r0);
        r0 = r11.GB;
        r0.D(r12);
    L_0x0340:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5cl.C(X.27l, android.graphics.drawable.Drawable, X.2Lb):void");
    }

    /* renamed from: C */
    public static void m28079C(AnonymousClass5cl anonymousClass5cl, Drawable drawable) {
        AnonymousClass0LH.I(AnonymousClass0mE.I(anonymousClass5cl.f67415N), "This method requires a laid out views. Did you mean to call centerDrawableInContainer() instead?");
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int width = (anonymousClass5cl.f67415N.getWidth() / 2) - (intrinsicWidth / 2);
        int height = (anonymousClass5cl.f67415N.getHeight() / 2) - (intrinsicHeight / 2);
        drawable.setBounds(width, height, intrinsicWidth + width, intrinsicHeight + height);
    }

    public final void Cn(Medium medium) {
        String str = medium.f30924N;
        AnonymousClass27n anonymousClass27n = new AnonymousClass27n();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gallery_rounded_");
        stringBuilder.append(str);
        anonymousClass27n.f26370G = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("gallery_");
        stringBuilder.append(str);
        AnonymousClass27l anonymousClass27l = new AnonymousClass27l(stringBuilder.toString(), Collections.singletonList(anonymousClass27n));
        anonymousClass27l.f26359E = AnonymousClass27p.GALLERY;
        Drawable anonymousClass2VA = new AnonymousClass2VA(this.f67411J, medium);
        AnonymousClass2Lb anonymousClass2Lb = new AnonymousClass2Lb();
        anonymousClass2Lb.f29352B = true;
        anonymousClass2Lb.f29364N = "TextOverlayController";
        anonymousClass2VA.pB(new AnonymousClass4PQ(this, anonymousClass2VA, m28127R(anonymousClass27l.A(), anonymousClass2VA, anonymousClass2Lb.A())));
    }

    /* renamed from: D */
    public static void m28080D(AnonymousClass5cl anonymousClass5cl) {
        anonymousClass5cl.f67413L = null;
    }

    /* renamed from: D */
    public final boolean m28113D(float f) {
        if (this.f67423V != AnonymousClass4Pk.AVAILABLE) {
            if (this.f67423V != AnonymousClass4Pk.PICKING_ASSET) {
                return false;
            }
        }
        return this.f67404C.m26763A(f, true);
    }

    /* renamed from: E */
    public final AnonymousClass3FH m28114E() {
        InteractiveDrawableContainer interactiveDrawableContainer = this.f67415N;
        Class cls = AnonymousClass2bu.class;
        Comparator anonymousClass2Lf = new AnonymousClass2Lf(interactiveDrawableContainer);
        List<AnonymousClass2cS> arrayList = new ArrayList(interactiveDrawableContainer.f31644D);
        Collections.sort(arrayList, anonymousClass2Lf);
        List arrayList2 = new ArrayList();
        for (AnonymousClass2cS anonymousClass2cS : arrayList) {
            Drawable drawable = anonymousClass2cS.f31616D;
            if (cls.isInstance(drawable)) {
                arrayList2.add(cls.cast(drawable));
            }
        }
        List arrayList3 = new ArrayList(arrayList2.size());
        for (int i = 0; i < arrayList2.size(); i++) {
            if (((AnonymousClass2bu) arrayList2.get(i)).f31514M != null) {
                Object spannableStringBuilder = new SpannableStringBuilder(((AnonymousClass2bu) arrayList2.get(i)).f31514M);
                AnonymousClass2Jl.B(spannableStringBuilder);
                arrayList3.add(spannableStringBuilder.toString());
            }
        }
        return new AnonymousClass3FH(arrayList3);
    }

    /* renamed from: E */
    public static void m28081E(AnonymousClass5cl anonymousClass5cl) {
        if (anonymousClass5cl.f67407F.hasFocus()) {
            anonymousClass5cl.f67407F.clearFocus();
        }
    }

    /* renamed from: F */
    public static AnonymousClass2bu m28082F(AnonymousClass5cl anonymousClass5cl, Context context, AnonymousClass2K5 anonymousClass2K5) {
        AnonymousClass2bu anonymousClass2bu = new AnonymousClass2bu(context, anonymousClass2K5.f28943N.E(context));
        if (anonymousClass5cl.f67439l.f54594B == AnonymousClass2Jg.OFF) {
            anonymousClass2bu.f31510I.setShadowLayer(anonymousClass5cl.f67434g, 0.0f, anonymousClass5cl.f67433f, anonymousClass5cl.f67432e);
            anonymousClass2bu.D();
        } else {
            anonymousClass2bu.f31510I.clearShadowLayer();
            anonymousClass2bu.D();
        }
        if (VERSION.SDK_INT >= 21) {
            anonymousClass2bu.M(AnonymousClass0nA.D());
        } else {
            anonymousClass2bu.N(Typeface.SANS_SERIF, 1);
        }
        anonymousClass2bu.J(-1);
        anonymousClass2bu.O(true);
        anonymousClass2bu.G(anonymousClass2K5.f28943N.B(context, anonymousClass5cl.f67407F.getTextSize()), anonymousClass2K5.f28943N.F(context, anonymousClass5cl.f67407F.getTextSize()));
        return anonymousClass2bu;
    }

    /* renamed from: F */
    public final Map m28115F() {
        if (this.f67415N.getDrawableCount() <= 0) {
            return null;
        }
        InteractiveDrawableContainer interactiveDrawableContainer = this.f67415N;
        Class cls = Drawable.class;
        Map hashMap = new HashMap();
        for (AnonymousClass2cS anonymousClass2cS : interactiveDrawableContainer.f31644D) {
            Drawable drawable = anonymousClass2cS.f31616D;
            if (cls.isInstance(drawable)) {
                hashMap.put(cls.cast(drawable), new AnonymousClass2Li(anonymousClass2cS));
            }
        }
        return hashMap;
    }

    public final void Fl(int i) {
        m28131V(this.f67452y);
        if (this.f67452y == AnonymousClass4Pk.EDITING_TEXT) {
            m28130U(i);
            m28129T();
        }
    }

    /* renamed from: G */
    public static Spannable m28083G(Editable editable) {
        Class[] clsArr = new Class[]{CustomUnderlineSpan.class, LineBackgroundSpan.class, AnonymousClass2Jz.class, AnonymousClass2Jm.class, AnonymousClass2Jq.class, AnonymousClass2Js.class, AnonymousClass2K2.class, AnonymousClass2K5.class, AnonymousClass2KH.class};
        Spannable spannableStringBuilder = new SpannableStringBuilder(editable.toString());
        AnonymousClass2Jd.C(editable, spannableStringBuilder, clsArr);
        return spannableStringBuilder;
    }

    /* renamed from: G */
    public final LinkedHashMap m28116G() {
        AnonymousClass5cl anonymousClass5cl = this;
        Set A = this.f67428a.m26873A();
        AnonymousClass5TL anonymousClass5TL = this.f67428a;
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < anonymousClass5TL.f64414N.size(); i++) {
            sparseArray.put(anonymousClass5TL.f64414N.keyAt(i), anonymousClass5TL.f64414N.valueAt(i));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        anonymousClass5cl.f67415N.C(new AnonymousClass4Pi(anonymousClass5cl, A, sparseArray, linkedHashMap, new Matrix()));
        return linkedHashMap;
    }

    public final void Gl() {
        this.f67452y = this.f67423V;
        m28121L();
        m28131V(AnonymousClass4Pk.EYEDROPPER_COLOR_PICKER_ACTIVE);
    }

    /* renamed from: H */
    public final AnonymousClass2VC m28117H() {
        for (AnonymousClass2VC anonymousClass2VC : this.f67415N.F(AnonymousClass2VC.class)) {
            if (AnonymousClass2G6.G(anonymousClass2VC)) {
                return anonymousClass2VC;
            }
        }
        return null;
    }

    /* renamed from: H */
    public static AnonymousClass3FR m28084H(AnonymousClass5cl anonymousClass5cl) {
        return anonymousClass5cl.f67408G.E();
    }

    /* renamed from: I */
    public static float m28085I(AnonymousClass5cl anonymousClass5cl) {
        return (float) AnonymousClass0dh.C((double) anonymousClass5cl.LB.getCurrentRatio(), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, 12.0d, 64.0d);
    }

    /* renamed from: I */
    public final List m28118I() {
        if ((this.f67403B.size() > 0 ? 1 : null) == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (int i = 0; i < this.f67403B.size(); i++) {
            arrayList.add(this.f67403B.valueAt(i));
        }
        return arrayList;
    }

    public final void Il(int i) {
        if (this.f67413L != null) {
            m28130U(i);
            Object obj = this.f67413L.f31514M;
            AnonymousClass2Jh[] anonymousClass2JhArr = (AnonymousClass2Jh[]) AnonymousClass2Jd.E(obj, AnonymousClass2Jh.class);
            int i2 = 0;
            if (anonymousClass2JhArr.length > 0) {
                while (i2 < anonymousClass2JhArr.length) {
                    AnonymousClass2Jh anonymousClass2Jh = anonymousClass2JhArr[i2];
                    anonymousClass2Jh.f28878E.setColor(i);
                    anonymousClass2Jh.f28877D = true;
                    i2++;
                }
            } else {
                AnonymousClass5cl.m28093Q(this, obj, 0, 0);
            }
            this.f67413L.D();
        }
    }

    public final void Ix(AnonymousClass4Pq anonymousClass4Pq, long j) {
        this.DB.Ix(anonymousClass4Pq, j);
    }

    /* renamed from: J */
    public final boolean m28119J() {
        for (AnonymousClass2bu anonymousClass2bu : this.f67415N.F(AnonymousClass2bu.class)) {
            AnonymousClass2K5 B = AnonymousClass2K7.B(anonymousClass2bu.f31514M);
            if (B != null && B.f28935F) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m28086J(AnonymousClass5cl anonymousClass5cl, AnonymousClass1lB anonymousClass1lB) {
        AnonymousClass5cl.m28081E(anonymousClass5cl);
        String mimeType = anonymousClass1lB.f22448B.FL().getMimeType(0);
        if (AnonymousClass4Mp.B(anonymousClass5cl.f67408G.B()) && "image/gif".equals(mimeType)) {
            Uri KK = anonymousClass1lB.f22448B.KK();
            AnonymousClass295.D(anonymousClass5cl.f67411J).A(KK.toString(), AnonymousClass295.f26656H, new AnonymousClass4PX(anonymousClass5cl, anonymousClass1lB, KK));
        } else {
            AnonymousClass0GG.B(AnonymousClass0Fx.B(), new AnonymousClass4PZ(anonymousClass5cl, anonymousClass1lB.f22448B.KK(), anonymousClass1lB), 2000230109);
        }
        return true;
    }

    public final boolean JY() {
        return !this.f67430c.m27003B(AnonymousClass4Tu.f54460B) && (this.f67430c.m27003B(AnonymousClass4Tu.f54463E) || !((Boolean) AnonymousClass09e.f1097C.H(this.f67444q)).booleanValue());
    }

    /* renamed from: K */
    public final void m28120K() {
        for (AnonymousClass2VC D : this.f67415N.F(AnonymousClass2VC.class)) {
            D.D(true);
        }
    }

    /* renamed from: K */
    public static void m28087K(AnonymousClass5cl anonymousClass5cl) {
        if (AnonymousClass0HV.D(anonymousClass5cl.f67444q).f2646B.getInt("story_drawable_trash_can_usage_count", 0) >= 2) {
            anonymousClass5cl.f67415N.setTrashCanLabelEnabled(false);
        }
    }

    /* renamed from: L */
    public static void m28088L(AnonymousClass5cl anonymousClass5cl, Class cls) {
        for (AnonymousClass163 anonymousClass163 : anonymousClass5cl.f67415N.F(cls)) {
            if (anonymousClass163.A()) {
                anonymousClass5cl.f67415N.J(anonymousClass163);
            }
        }
    }

    /* renamed from: L */
    public final boolean m28121L() {
        if (this.f67423V == AnonymousClass4Pk.SCRUBBING_FOR_REGION_TRACKING) {
            return this.f67446s.D();
        }
        if (!this.EB.f64622D.m26952C()) {
            if (this.f67407F.hasFocus()) {
                this.f67407F.clearFocus();
                return true;
            } else if (!this.f67404C.m26765C()) {
                this.f67431d.A();
                return false;
            }
        }
        return true;
    }

    public final void LDA(AnonymousClass2Jf anonymousClass2Jf) {
        this.HB.remove(this.f67413L);
        this.f67439l.B(false);
    }

    public final long LL() {
        return this.f67443p;
    }

    /* renamed from: M */
    public static void m28089M(AnonymousClass5cl anonymousClass5cl, char c, String str, Object obj) {
        CharSequence text = anonymousClass5cl.f67407F.getText();
        int selectionEnd = anonymousClass5cl.f67407F.getSelectionEnd();
        int i = selectionEnd - 1;
        while (i >= 0) {
            if (text.charAt(i) == c) {
                break;
            }
            i--;
        }
        i = -1;
        if (i != -1) {
            Object anonymousClass2VQ;
            anonymousClass5cl.f67407F.clearComposingText();
            if (obj instanceof AnonymousClass0Ci) {
                anonymousClass2VQ = new AnonymousClass2VQ(anonymousClass5cl.f67407F.getResources(), (AnonymousClass0Ci) obj);
            } else if (obj instanceof Hashtag) {
                anonymousClass2VQ = new AnonymousClass2VP(anonymousClass5cl.f67407F.getResources(), (Hashtag) obj);
            } else {
                throw new UnsupportedOperationException("Unknown tag type");
            }
            int length = (str.length() + i) + 1;
            CharSequence spannableStringBuilder = new SpannableStringBuilder(text);
            for (Object removeSpan : (AnonymousClass288[]) spannableStringBuilder.getSpans(i, selectionEnd, AnonymousClass288.class)) {
                spannableStringBuilder.removeSpan(removeSpan);
            }
            int i2 = i + 1;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" ");
            spannableStringBuilder.replace(i2, selectionEnd, stringBuilder.toString());
            spannableStringBuilder.setSpan(anonymousClass2VQ, i, length, 33);
            anonymousClass5cl.f67407F.setText(spannableStringBuilder);
            anonymousClass5cl.f67407F.setSelection(length + 1);
            AnonymousClass4UU anonymousClass4UU = anonymousClass5cl.f67439l;
            anonymousClass4UU.f54595C.post(anonymousClass4UU.f54598F);
        }
    }

    /* renamed from: M */
    public final void m28122M(Editable editable, Paint paint) {
        if (!TextUtils.isEmpty(editable)) {
            List asList = Arrays.asList(new String[]{"hashtag_sticker_vibrant", "hashtag_sticker_subtle", "hashtag_sticker_rainbow"});
            Context context = this.f67411J;
            int width = this.f67415N.getWidth();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.contextual_sticker_padding);
            Spannable spannableString = new SpannableString(editable.toString());
            AnonymousClass3GE.D(spannableString, context.getResources(), dimensionPixelSize, AnonymousClass27E.f26114D);
            AnonymousClass2eD B = AnonymousClass4QU.B(context, width, dimensionPixelSize, paint.getTextSize(), spannableString);
            Spannable spannableString2 = new SpannableString(editable.toString());
            Resources resources = context.getResources();
            AnonymousClass3GE.C(spannableString2, resources, dimensionPixelSize);
            AnonymousClass2eD B2 = AnonymousClass4QU.B(context, width, dimensionPixelSize, paint.getTextSize(), spannableString2);
            spannableString2 = new SpannableString(editable.toString());
            AnonymousClass3GE.B(spannableString2, resources, dimensionPixelSize);
            AnonymousClass2eD B3 = AnonymousClass4QU.B(context, width, dimensionPixelSize, paint.getTextSize(), spannableString2);
            Drawable anonymousClass2VC = new AnonymousClass2VC(context, new Drawable[]{B, B2, B3});
            AnonymousClass2Lb anonymousClass2Lb = new AnonymousClass2Lb();
            anonymousClass2Lb.f29352B = true;
            anonymousClass2Lb.f29354D = 8.0f;
            anonymousClass2Lb.f29364N = "TextOverlayController";
            m28127R(asList, anonymousClass2VC, anonymousClass2Lb.A());
        }
    }

    /* renamed from: N */
    public final void m28123N(int i) {
        if (this.f67423V == AnonymousClass4Pk.EDITING_TEXT) {
            if (this.CB == 0 && i > 0) {
                AnonymousClass14H.E(true, new View[]{this.f67409H, this.f67410I, this.f67416O});
                this.f67418Q.m26902H(true);
                AnonymousClass5cl.m28092P(this, false, true);
            } else if (this.CB > 0 && i == 0) {
                this.f67418Q.m26901G(true);
                AnonymousClass14H.H(true, new View[]{this.f67409H, this.f67410I, this.f67416O});
                AnonymousClass5cl.m28092P(this, true, true);
            }
            this.CB = i;
        }
    }

    /* renamed from: N */
    public static void m28090N(AnonymousClass5cl anonymousClass5cl, int i) {
        anonymousClass5cl.LB.setColour(i);
        EyedropperColorPickerTool eyedropperColorPickerTool = anonymousClass5cl.f67416O;
        if (eyedropperColorPickerTool != null) {
            eyedropperColorPickerTool.setColor(i);
        }
    }

    public final void NDA() {
        EditText editText = this.f67407F;
        AnonymousClass2Jy.D(editText.getContext(), editText.getText());
        AnonymousClass2bu anonymousClass2bu = this.f67413L;
        if (anonymousClass2bu != null) {
            AnonymousClass2Jy.D(this.f67411J, anonymousClass2bu.f31514M);
        }
        m28108f(false);
        AnonymousClass2Jy.B(this.f67407F);
        anonymousClass2bu = this.f67413L;
        if (anonymousClass2bu != null) {
            AnonymousClass2Jy.C(anonymousClass2bu);
        }
        m28109g();
    }

    /* renamed from: O */
    public static void m28091O(AnonymousClass5cl anonymousClass5cl) {
        anonymousClass5cl.f67412K = -1;
        EyedropperColorPickerTool eyedropperColorPickerTool = anonymousClass5cl.f67416O;
        if (eyedropperColorPickerTool != null) {
            eyedropperColorPickerTool.setColor(anonymousClass5cl.f67412K);
        }
        anonymousClass5cl.f67409H.setAdapter(anonymousClass5cl.f67449v);
    }

    /* renamed from: O */
    public final void m28124O(Intent intent) {
        Product product = intent != null ? (Product) intent.getParcelableExtra("selected_product") : null;
        if (product == null) {
            return;
        }
        if (this.f67423V == AnonymousClass4Pk.PICKING_ASSET) {
            this.f67436i.C(new AnonymousClass3EK(product));
            if (!((Boolean) AnonymousClass09e.f1097C.H(this.f67444q)).booleanValue()) {
                this.f67426Y.A(product, null, -1, this.f67415N);
            }
        }
    }

    public final void ODA(AnonymousClass2K5 anonymousClass2K5, AnonymousClass4UY anonymousClass4UY) {
        AnonymousClass0HV.D(this.f67444q).hA(anonymousClass2K5.f28931B);
        this.f67420S = anonymousClass2K5.f28936G;
        AnonymousClass5cl.m28096T(this, true);
        m28105c(false);
        m28106d(false);
        m28108f(false);
        AnonymousClass2K5 A = this.f67442o.A();
        int E = A.f28943N.E(this.f67411J);
        int D = A.f28943N.D(this.f67411J);
        ConstrainedEditText constrainedEditText = this.f67407F;
        constrainedEditText.setPadding(D, constrainedEditText.getPaddingTop(), D, this.f67407F.getPaddingBottom());
        AnonymousClass2bu anonymousClass2bu = this.f67413L;
        if (anonymousClass2bu != null) {
            anonymousClass2bu.F(E);
            AnonymousClass5cl.m28094R(this);
        }
        if (anonymousClass4UY == AnonymousClass4UY.FORMAT_CHANGE) {
            Editable text = this.f67407F.getText();
            Context context = this.f67411J;
            E = this.f67412K;
            Class[] clsArr = new Class[1];
            D = 0;
            clsArr[0] = AnonymousClass2Jq.class;
            AnonymousClass2Jd.G(text, clsArr);
            AnonymousClass2Js[] anonymousClass2JsArr = (AnonymousClass2Js[]) AnonymousClass2Jd.E(text, AnonymousClass2Js.class);
            if (anonymousClass2JsArr.length == 0) {
                text.setSpan(new AnonymousClass2Js(context, anonymousClass2K5, E), 0, text.length(), 18);
            } else {
                int length = anonymousClass2JsArr.length;
                while (D < length) {
                    anonymousClass2JsArr[D].A(anonymousClass2K5);
                    D++;
                }
            }
            this.f67438k.D(anonymousClass2K5.f28938I);
            this.f67439l.A(AnonymousClass2Jg.OFF, true);
            m28107e();
            m28109g();
            if (this.f67413L != null) {
                this.f67415N.J(this.f67413L);
            }
        }
    }

    public final void Om(AnonymousClass4Pq anonymousClass4Pq, boolean z, int i) {
        anonymousClass4Pq.B();
        if (z) {
            m28132W();
        } else {
            AnonymousClass5cl.m28084H(this).dB = true;
            int activeDrawableId = this.f67415N.getActiveDrawableId();
            if (activeDrawableId != -1) {
                Drawable G = this.f67415N.G(activeDrawableId);
                AnonymousClass2Li D = this.f67415N.D(activeDrawableId);
                AnonymousClass0OA MP = this.f67445r.MP();
                AnonymousClass5TL anonymousClass5TL = this.f67428a;
                AnonymousClass5L7 anonymousClass5L7 = this.f67453z;
                int duration = MP.bC.getDuration();
                anonymousClass5TL.f64420T = i;
                anonymousClass5TL.f64402B = duration;
                float f = ((float) anonymousClass5TL.f64420T) / ((float) anonymousClass5TL.f64402B);
                anonymousClass5TL.f64417Q = f;
                anonymousClass5TL.f64405E = 1.0f - f;
                anonymousClass5TL.f64404D = 0.0f;
                anonymousClass5TL.f64416P = 0.0f;
                Context context = anonymousClass5TL.f64421U.getContext();
                anonymousClass5TL.f64411K = new AnonymousClass4QA(context, context.getString(C0164R.string.pin_sticker_processing));
                anonymousClass5TL.f64411K.show();
                anonymousClass5TL.f64409I.Ow(anonymousClass5TL, activeDrawableId, i, new AnonymousClass4OR(anonymousClass5TL, i, duration, activeDrawableId, G, D, anonymousClass5L7));
                this.f67415N.L(activeDrawableId, 1);
            }
        }
        this.DB.Om(anonymousClass4Pq, z, i);
    }

    /* renamed from: P */
    public final void m28125P(AnonymousClass1IS anonymousClass1IS) {
        m28131V(AnonymousClass4Pk.AVAILABLE);
        AnonymousClass5cl.m28091O(this);
        Drawable anonymousClass2GR = new AnonymousClass2GR(this.f67411J);
        anonymousClass2GR.B(anonymousClass1IS);
        AnonymousClass2Lb anonymousClass2Lb = new AnonymousClass2Lb();
        anonymousClass2Lb.f29352B = true;
        anonymousClass2Lb.f29354D = 1.5f;
        anonymousClass2Lb.f29355E = 0.25f;
        anonymousClass2Lb.f29364N = "TextOverlayController";
        m28127R(AnonymousClass27l.f26352N.A(), anonymousClass2GR, anonymousClass2Lb.A());
    }

    /* renamed from: P */
    public static void m28092P(AnonymousClass5cl anonymousClass5cl, boolean z, boolean z2) {
        anonymousClass5cl.AB = z;
        AnonymousClass5cl.m28096T(anonymousClass5cl, z2);
    }

    public final void PBA(AnonymousClass4Pq anonymousClass4Pq) {
        this.f67415N.setTrashCanEnabled(false);
        m28131V(AnonymousClass4Pk.SCRUBBING_FOR_REGION_TRACKING);
        this.DB.PBA(anonymousClass4Pq);
    }

    /* renamed from: Q */
    public final void m28126Q(int i, AnonymousClass2Fd anonymousClass2Fd) {
        if (!this.f67415N.H(i)) {
            return;
        }
        if (anonymousClass2Fd != null) {
            this.f67415N.O(i, true);
            InteractiveDrawableContainer interactiveDrawableContainer = this.f67415N;
            InteractiveDrawableContainer.F(InteractiveDrawableContainer.C(interactiveDrawableContainer, i), anonymousClass2Fd.f28076B, anonymousClass2Fd.f28077C);
            this.f67415N.Q(i, anonymousClass2Fd.f28086L);
            return;
        }
        this.f67415N.O(i, false);
    }

    /* renamed from: Q */
    public static void m28093Q(AnonymousClass5cl anonymousClass5cl, Spannable spannable, int i, int i2) {
        Context context = anonymousClass5cl.f67411J;
        int i3 = anonymousClass5cl.f67412K;
        if (i >= 0 && i2 >= 0) {
            if (i < i2) {
                AnonymousClass2Jt.B(context, spannable, i, i2, i3);
                AnonymousClass5cl.m28090N(anonymousClass5cl, anonymousClass5cl.f67412K);
            }
        }
        Class[] clsArr = new Class[1];
        int i4 = 0;
        clsArr[0] = AnonymousClass2Js.class;
        AnonymousClass2Jd.G(spannable, clsArr);
        AnonymousClass2Jz[] anonymousClass2JzArr = (AnonymousClass2Jz[]) AnonymousClass2Jd.E(spannable, AnonymousClass2Jz.class);
        int length = anonymousClass2JzArr.length;
        int i5 = 0;
        while (i4 < length) {
            AnonymousClass2Jz anonymousClass2Jz = anonymousClass2JzArr[i4];
            int spanStart = spannable.getSpanStart(anonymousClass2Jz);
            int spanEnd = spannable.getSpanEnd(anonymousClass2Jz);
            anonymousClass2Jz.LNA(i3);
            AnonymousClass2Jt.B(context, spannable, spanStart, spanEnd, AnonymousClass26h.C(i3));
            if (i5 <= spanStart) {
                AnonymousClass2Jt.B(context, spannable, i5, spanStart, i3);
            }
            i4++;
            i5 = spanEnd;
        }
        int length2 = spannable.length();
        if (i5 <= length2) {
            AnonymousClass2Jt.B(context, spannable, i5, length2, i3);
        }
        AnonymousClass5cl.m28090N(anonymousClass5cl, anonymousClass5cl.f67412K);
    }

    public final void Qs() {
        AnonymousClass2VC H = m28117H();
        if (H == null) {
            this.f67424W.m26960E();
            this.f67424W.UHA();
            return;
        }
        this.f67424W.m26959D(H);
    }

    /* renamed from: R */
    public final int m28127R(List list, Drawable drawable, AnonymousClass2Lc anonymousClass2Lc) {
        return m28128S(list, drawable, anonymousClass2Lc, null);
    }

    /* renamed from: R */
    public static void m28094R(AnonymousClass5cl anonymousClass5cl) {
        AnonymousClass2Jf anonymousClass2Jf = anonymousClass5cl.f67438k.f54587B;
        anonymousClass5cl.f67413L.E(anonymousClass2Jf.B());
        for (AnonymousClass288 anonymousClass288 : (AnonymousClass288[]) AnonymousClass2Jd.E(anonymousClass5cl.f67413L.f31514M, AnonymousClass288.class)) {
            anonymousClass288.f26476D = anonymousClass2Jf;
        }
        int activeDrawableId = anonymousClass5cl.f67415N.getActiveDrawableId();
        if (activeDrawableId != -1) {
            float f;
            AnonymousClass2Li D = anonymousClass5cl.f67415N.D(activeDrawableId);
            PointF pointF = (PointF) anonymousClass5cl.HB.get(anonymousClass5cl.f67413L);
            float f2 = 0.0f;
            Object obj = 1;
            if (pointF != null) {
                float f3;
                if (D == null) {
                    f3 = 0.0f;
                } else {
                    f3 = D.f29389G;
                }
                if (D == null) {
                    f = 0.0f;
                } else {
                    f = D.f29390H;
                }
                if (pointF.x != f3 || pointF.y != r3) {
                    obj = null;
                }
            }
            if (obj != null) {
                Rect bounds = anonymousClass5cl.f67413L.getBounds();
                float width = (float) bounds.width();
                f = bounds.exactCenterY();
                switch (AnonymousClass4Pa.f53764G[anonymousClass2Jf.ordinal()]) {
                    case 1:
                        f2 = ((float) (anonymousClass5cl.f67415N.getLeft() + anonymousClass5cl.f67407F.getPaddingLeft())) + (width / 2.0f);
                        break;
                    case 2:
                        f2 = (float) ((anonymousClass5cl.f67415N.getLeft() / 2) + (anonymousClass5cl.f67415N.getRight() / 2));
                        break;
                    case 3:
                        f2 = ((float) (anonymousClass5cl.f67415N.getRight() - anonymousClass5cl.f67407F.getPaddingRight())) - (width / 2.0f);
                        break;
                    default:
                        break;
                }
                InteractiveDrawableContainer.F(InteractiveDrawableContainer.C(anonymousClass5cl.f67415N, activeDrawableId), f2, f);
                AnonymousClass2Li D2 = anonymousClass5cl.f67415N.D(activeDrawableId);
                anonymousClass5cl.HB.put(anonymousClass5cl.f67413L, new PointF(D2.f29389G, D2.f29390H));
            }
        }
    }

    /* renamed from: S */
    public final int m28128S(List list, Drawable drawable, AnonymousClass2Lc anonymousClass2Lc, Map map) {
        this.f67436i.C(new AnonymousClass3EZ());
        AnonymousClass5cl.m28078B(this, drawable);
        if (!list.isEmpty()) {
            AnonymousClass281.B(this.f67444q).WZ((String) list.get(0), map);
        }
        if (drawable instanceof AnonymousClass25m) {
            AnonymousClass25m anonymousClass25m = (AnonymousClass25m) drawable;
            if (anonymousClass25m.uX()) {
                anonymousClass25m.pB(new AnonymousClass4PR(this, anonymousClass25m, drawable));
            }
        }
        if (drawable instanceof AnonymousClass2VC) {
            AnonymousClass2VC anonymousClass2VC = (AnonymousClass2VC) drawable;
            AnonymousClass0Cm anonymousClass0Cm = this.f67444q;
            if (this.f67429b) {
                Object obj = (anonymousClass2VC.f31024G || !anonymousClass2VC.f31019B.A()) ? null : 1;
                if (obj != null) {
                    anonymousClass2VC.f31021D.f26292C = true;
                }
            }
            anonymousClass2VC.f31021D.f26291B = true;
            anonymousClass2VC.H();
            for (int i = 0; i < anonymousClass2VC.f31020C.size(); i++) {
                if (anonymousClass2VC.f31020C.get(i) instanceof AnonymousClass27g) {
                    ((AnonymousClass27g) anonymousClass2VC.f31020C.get(i)).vx(anonymousClass0Cm);
                }
            }
        }
        if (drawable instanceof AnonymousClass2GR) {
            AnonymousClass27v anonymousClass27v = ((AnonymousClass2GR) drawable).f28278L;
            anonymousClass27v.f26446D = System.currentTimeMillis();
            anonymousClass27v.invalidateSelf();
        }
        int A = this.f67415N.A(drawable, anonymousClass2Lc);
        AnonymousClass2ER anonymousClass2ER = new AnonymousClass2ER();
        anonymousClass2ER.f27859C = list;
        if (AnonymousClass3G3.C(drawable)) {
            anonymousClass2ER.f27858B = AnonymousClass2EQ.ANIMATED_STICKERS;
            AnonymousClass25j D = AnonymousClass3G3.D(drawable);
            D.vMA(new File(AnonymousClass3nk.C(this.f67411J).getAbsolutePath(), Integer.toHexString(D.tM().hashCode())).getAbsolutePath());
        } else {
            anonymousClass2ER.f27858B = AnonymousClass2EQ.STATIC_STICKERS;
        }
        this.f67403B.put(A, anonymousClass2ER);
        this.f67430c.m27000C(drawable);
        return A;
    }

    /* renamed from: S */
    public static void m28095S(AnonymousClass5cl anonymousClass5cl) {
        int activeDrawableId = anonymousClass5cl.f67415N.getActiveDrawableId();
        if (activeDrawableId != -1) {
            AnonymousClass2Li D = anonymousClass5cl.f67415N.D(activeDrawableId);
            Float f = (Float) anonymousClass5cl.JB.get(anonymousClass5cl.f67413L);
            Object obj = 1;
            if (D != null) {
                if (f != null) {
                    if (D.f29394L != f.floatValue()) {
                        obj = null;
                    }
                }
            }
            if (obj != null) {
                anonymousClass5cl.f67442o.A();
                float min = Math.min(1.0f, ((float) AnonymousClass2KE.B(anonymousClass5cl.f67411J)) / ((float) anonymousClass5cl.f67413L.getIntrinsicHeight()));
                AnonymousClass2cS C = InteractiveDrawableContainer.C(anonymousClass5cl.f67415N, activeDrawableId);
                if (C != null) {
                    C.L(min);
                }
                anonymousClass5cl.JB.put(anonymousClass5cl.f67413L, Float.valueOf(min));
            }
        }
    }

    public final /* bridge */ /* synthetic */ boolean SB(Object obj) {
        return m28110A((AnonymousClass3AM) obj);
    }

    public final void Sp(int i, boolean z) {
        int i2 = z ? -i : 0;
        this.f67407F.Sp(i, z);
        ConstrainedEditText constrainedEditText = this.f67407F;
        int height = this.f67442o.f54612D.getHeight();
        int height2 = this.f67416O.getHeight();
        constrainedEditText.f28828D = height;
        constrainedEditText.f28827C = height2;
        ConstrainedEditText.B(constrainedEditText);
        float f = (float) i2;
        this.LB.setTranslationY(f);
        this.f67409H.setTranslationY(f);
        this.f67410I.setTranslationY(f);
        if (m28100X()) {
            this.LB.setTranslationY((float) (((this.f67447t.getHeight() - i) / 2) - (this.LB.getTop() + (this.LB.getHeight() / 2))));
            this.f67416O.setTranslationY(f);
        } else {
            this.LB.setTranslationY(0.0f);
            this.f67416O.setTranslationY(0.0f);
        }
        RecyclerView recyclerView = this.f67437j;
        if (recyclerView != null) {
            recyclerView.setTranslationY(f);
        }
        AnonymousClass5TZ anonymousClass5TZ = this.f67418Q;
        if (anonymousClass5TZ != null) {
            anonymousClass5TZ.Sp(i, z);
        }
    }

    public final void Ss() {
        AnonymousClass5Tq anonymousClass5Tq = this.f67424W;
        if (anonymousClass5Tq != null) {
            anonymousClass5Tq.IHA();
        }
    }

    /* renamed from: T */
    public final void m28129T() {
        if (this.f67413L != null) {
            this.f67413L.setVisible(false, false);
        }
        AnonymousClass5cl.m28104b(this.f67407F.getText(), true);
        AnonymousClass14H.H(false, new View[]{this.f67406E});
        this.f67407F.requestFocus();
    }

    /* renamed from: T */
    public static void m28096T(AnonymousClass5cl anonymousClass5cl, boolean z) {
        if (anonymousClass5cl.AB && anonymousClass5cl.f67420S) {
            AnonymousClass14H.H(z, new View[]{anonymousClass5cl.LB});
            return;
        }
        AnonymousClass14H.E(z, new View[]{anonymousClass5cl.LB});
    }

    public final void Tk(AnonymousClass2Hj anonymousClass2Hj, Drawable drawable) {
        this.f67436i.C(new AnonymousClass3Ds());
        AnonymousClass5cl.m28078B(this, drawable);
        AnonymousClass2Lb anonymousClass2Lb = new AnonymousClass2Lb();
        anonymousClass2Lb.f29352B = true;
        anonymousClass2Lb.f29354D = 30.0f;
        anonymousClass2Lb.f29364N = "TextOverlayController";
        int A = this.f67415N.A(drawable, anonymousClass2Lb.A());
        AnonymousClass2ER anonymousClass2ER = new AnonymousClass2ER();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < anonymousClass2Hj.f28577D.length(); i++) {
            stringBuilder.append("\\u");
            stringBuilder.append(Integer.toHexString(anonymousClass2Hj.f28577D.charAt(i)));
        }
        List arrayList = new ArrayList();
        arrayList.add(stringBuilder.toString());
        anonymousClass2ER.f27859C = arrayList;
        anonymousClass2ER.f27858B = AnonymousClass2EQ.EMOJIS;
        this.f67403B.put(A, anonymousClass2ER);
        this.GB.C(new AnonymousClass2VF(anonymousClass2Hj));
    }

    public final void Ty(Drawable drawable, float f) {
        if (drawable instanceof AnonymousClass2bu) {
            boolean z = f >= 0.425f && f <= 5.0f;
            AnonymousClass2bu anonymousClass2bu = (AnonymousClass2bu) drawable;
            if ((z ^ 1) != this.IB.contains(drawable)) {
                if (z) {
                    this.IB.remove(drawable);
                } else {
                    this.IB.add(drawable);
                }
                Spannable spannableStringBuilder = new SpannableStringBuilder(anonymousClass2bu.f31514M);
                AnonymousClass5cl.m28104b(spannableStringBuilder, z);
                anonymousClass2bu.H(spannableStringBuilder);
                anonymousClass2bu.P();
            }
        }
    }

    /* renamed from: U */
    private AnonymousClass2VC m28097U() {
        for (AnonymousClass2VC anonymousClass2VC : this.f67415N.F(AnonymousClass2VC.class)) {
            if (anonymousClass2VC.C(AnonymousClass2eD.class)) {
                return anonymousClass2VC;
            }
        }
        return null;
    }

    /* renamed from: U */
    public final void m28130U(int i) {
        this.f67412K = i;
        if (this.f67423V == AnonymousClass4Pk.EDITING_TEXT) {
            int selectionStart = this.f67407F.getSelectionStart();
            int selectionEnd = this.f67407F.getSelectionEnd();
            AnonymousClass5cl.m28093Q(this, this.f67407F.getText(), selectionStart, selectionEnd);
            this.f67407F.setSelection(selectionStart, selectionEnd);
        } else if (this.f67423V == AnonymousClass4Pk.EDITING_SLIDER) {
            AnonymousClass5UT anonymousClass5UT = this.f67435h;
            anonymousClass5UT.f64882O = this.f67412K;
            AnonymousClass5UT.m27014K(anonymousClass5UT);
        } else if (this.f67423V == AnonymousClass4Pk.EDITING_QUESTION) {
            this.f67427Z.A(this.f67412K);
        } else if (this.f67423V == AnonymousClass4Pk.EDITING_PRODUCT) {
            this.f67425X.m26997B(this.f67412K);
        }
        this.f67439l.f54596D = i;
        if (!this.f67407F.hasSelection()) {
            this.f67439l.B(true);
        }
        EyedropperColorPickerTool eyedropperColorPickerTool = this.f67416O;
        if (eyedropperColorPickerTool != null) {
            eyedropperColorPickerTool.setColor(i);
        }
    }

    /* renamed from: V */
    private static Map m28098V(Drawable drawable) {
        if (drawable instanceof AnonymousClass2VC) {
            AnonymousClass2VC anonymousClass2VC = (AnonymousClass2VC) drawable;
            if (anonymousClass2VC.C(AnonymousClass166.class)) {
                return AnonymousClass4Tm.C(((AnonymousClass166) anonymousClass2VC.B(AnonymousClass166.class).get(0)).B());
            }
            if (AnonymousClass2G6.G(anonymousClass2VC)) {
                return AnonymousClass3DS.B(AnonymousClass2G6.C(anonymousClass2VC));
            }
        }
        return null;
    }

    /* renamed from: V */
    public final void m28131V(AnonymousClass4Pk anonymousClass4Pk) {
        AnonymousClass4Pk anonymousClass4Pk2 = anonymousClass4Pk;
        if (this.f67423V != anonymousClass4Pk2) {
            boolean X = m28100X();
            AnonymousClass4Pk anonymousClass4Pk3 = r0.f67423V;
            r0.f67423V = anonymousClass4Pk2;
            switch (AnonymousClass4Pa.f53762E[r0.f67423V.ordinal()]) {
                case 1:
                    r0.BB.D(r0);
                    AnonymousClass5TL anonymousClass5TL = r0.f67428a;
                    Handler handler = anonymousClass5TL.f64407G;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        anonymousClass5TL.f64407G.sendEmptyMessage(10);
                        anonymousClass5TL.f64407G.getLooper().quitSafely();
                        anonymousClass5TL.f64407G = null;
                    }
                    anonymousClass5TL.f64408H.f53568B = null;
                    anonymousClass5TL.f64422V.removeCallbacksAndMessages(null);
                    anonymousClass5TL.f64414N.clear();
                    anonymousClass5TL.f64409I.Pw();
                    AnonymousClass4QA anonymousClass4QA = anonymousClass5TL.f64411K;
                    if (anonymousClass4QA != null) {
                        anonymousClass4QA.dismiss();
                        anonymousClass5TL.f64411K = null;
                    }
                    r0.f67431d.A();
                    InteractiveDrawableContainer interactiveDrawableContainer = r0.f67415N;
                    AnonymousClass0XB anonymousClass4PO = new AnonymousClass4PO(r0);
                    Iterator it = interactiveDrawableContainer.f31644D.iterator();
                    while (it.hasNext()) {
                        AnonymousClass2cS anonymousClass2cS = (AnonymousClass2cS) it.next();
                        if (anonymousClass4PO.apply(anonymousClass2cS.f31635W)) {
                            it.remove();
                            for (AnonymousClass2Lh aw : interactiveDrawableContainer.f31647G) {
                                aw.aw(anonymousClass2cS.f31620H, anonymousClass2cS.f31616D, false);
                            }
                        }
                    }
                    r0.f67415N.K(r0);
                    ConstrainedEditText constrainedEditText = r0.f67407F;
                    constrainedEditText.setText(JsonProperty.USE_DEFAULT_NAME);
                    constrainedEditText.setTextColor(-1);
                    constrainedEditText.setGravity(17);
                    r0.f67438k.D(AnonymousClass2Jf.CENTER);
                    m28130U(-1);
                    r0.f67439l.A(AnonymousClass2Jg.OFF, true);
                    AnonymousClass5cl.m28090N(r0, r0.f67412K);
                    AnonymousClass5cl.m28080D(r0);
                    r0.IB.clear();
                    r0.f67404C.f64077i = false;
                    AnonymousClass5Se anonymousClass5Se = r0.f67404C;
                    if (anonymousClass5Se.f64055M != null) {
                        anonymousClass5Se.f64046D.setBackground(null);
                        anonymousClass5Se.f64055M.B();
                        anonymousClass5Se.f64055M = null;
                    }
                    AnonymousClass4J9 anonymousClass4J9 = anonymousClass5Se.f64044B;
                    if (anonymousClass4J9 != null) {
                        anonymousClass4J9.B();
                    }
                    r0.f67403B.clear();
                    AnonymousClass14H.E(false, new View[]{r0.f67415N, r0.f67416O});
                    r0.f67415N.removeCallbacks(r0.f67414M);
                    r0.f67414M = null;
                    break;
                case 2:
                    AnonymousClass5cl.m28084H(r0).E();
                    r0.BB.A(r0);
                    r0.f67415N.B(r0);
                    r0.f67415N.setTouchEnabled(true);
                    r0.f67407F.setFocusableInTouchMode(true);
                    AnonymousClass14H.E(false, new View[]{r0.f67406E, r0.f67409H, r0.f67410I, r0.f67416O});
                    AnonymousClass5cl.m28092P(r0, false, false);
                    r0.f67438k.A(false);
                    AnonymousClass14H.E(false, new View[]{r0.f67439l.f54597E});
                    r0.f67441n.A(false);
                    AnonymousClass14H.E(false, new View[]{r0.f67442o.f54612D});
                    if (r0.f67437j != null) {
                        AnonymousClass14H.E(false, new View[]{r0.f67437j});
                    }
                    AnonymousClass14H.E(false, new View[]{r0.f67450w});
                    AnonymousClass5TZ anonymousClass5TZ = r0.f67418Q;
                    if (anonymousClass5TZ != null) {
                        anonymousClass5TZ.m26901G(false);
                    }
                    AnonymousClass14H.H(false, new View[]{r0.f67407F, r0.f67415N});
                    r0.f67415N.setTrashCanEnabled(true);
                    r0.f67415N.setLongPressEnabled(r0.f67429b);
                    break;
                case 3:
                    r0.LB.setCollapsedIcon(r0.KB);
                    AnonymousClass5cl.m28084H(r0).lB.A();
                    r0.f67415N.setTouchEnabled(false);
                    r0.LB.setStrokeWidthButtonShowing(false);
                    AnonymousClass14H.H(true, new View[]{r0.f67409H, r0.f67410I, r0.f67450w, r0.f67416O});
                    AnonymousClass5cl.m28092P(r0, true, true);
                    AnonymousClass4UZ anonymousClass4UZ = r0.f67442o;
                    AnonymousClass2bu anonymousClass2bu = r0.f67413L;
                    if (anonymousClass2bu != null) {
                        AnonymousClass2K5 B = AnonymousClass2K7.B(anonymousClass2bu.f31514M);
                        Object obj = 1;
                        int i = 0;
                        if ((B != null ? 1 : null) == null || !anonymousClass4UZ.f54613E.contains(B)) {
                            obj = null;
                        }
                        if (obj != null) {
                            i = anonymousClass4UZ.f54613E.indexOf(B);
                        }
                        anonymousClass4UZ.f54610B = i;
                        AnonymousClass4UZ.B(anonymousClass4UZ);
                        anonymousClass4UZ.f54611C.ODA(anonymousClass4UZ.A(), AnonymousClass4UY.EDIT_EXISTING_TEXT);
                    }
                    r0.f67442o.B(true);
                    if (r0.f67407F.getText().toString().isEmpty()) {
                        m28130U(-1);
                    }
                    r0.LB.setOnValueChangedListener(r0);
                    if (r0.f67413L == null) {
                        r0.LB.setCurrentRatio((float) AnonymousClass0dh.C(40.0d, 12.0d, 64.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d));
                    } else {
                        r0.LB.setCurrentRatio((float) AnonymousClass0dh.C((double) (r0.f67413L.B() / r0.f67411J.getResources().getDisplayMetrics().scaledDensity), 12.0d, 64.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d));
                    }
                    m28105c(true);
                    m28106d(true);
                    m28107e();
                    m28108f(true);
                    AnonymousClass5TZ anonymousClass5TZ2 = r0.f67418Q;
                    if (anonymousClass5TZ2 != null) {
                        anonymousClass5TZ2.m26902H(false);
                        break;
                    }
                    break;
                case 4:
                    if (anonymousClass4Pk3 == AnonymousClass4Pk.HIDDEN) {
                        r0.BB.A(r0);
                        if (!AnonymousClass0mE.I(r0.f67415N)) {
                            r0.f67415N.setVisibility(4);
                            break;
                        }
                    }
                    break;
                case 5:
                case 6:
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                case 8:
                case 9:
                case 10:
                case 11:
                    AnonymousClass14H.E(false, new View[]{r0.f67407F});
                    AnonymousClass14H.H(true, new View[]{r0.f67450w});
                    break;
                case 12:
                    AnonymousClass5cl.m28084H(r0).E();
                    r0.f67415N.setTouchEnabled(false);
                    break;
                default:
                    break;
            }
            AnonymousClass4Lr anonymousClass4Lr;
            if (m28100X() && !X) {
                r0.DB.m27820N(r0);
                anonymousClass4Lr = r0.f67451x;
                if (anonymousClass4Lr != null) {
                    anonymousClass4Lr.A(r0);
                    r0.LB.A();
                }
            } else if (!m28100X() && X) {
                r0.DB.m27819M(r0);
                anonymousClass4Lr = r0.f67451x;
                if (anonymousClass4Lr != null) {
                    anonymousClass4Lr.f53120J.remove(r0);
                }
            }
        }
    }

    /* renamed from: W */
    private static float m28099W(AnonymousClass27l anonymousClass27l) {
        int i = AnonymousClass4Pa.f53761D[anonymousClass27l.f26359E.ordinal()];
        if (i != 1) {
            return i != 15 ? -1.0f : 2.75f;
        } else {
            return 2.5f;
        }
    }

    /* renamed from: W */
    public final void m28132W() {
        AnonymousClass4Pq anonymousClass4Pq = this.f67446s;
        if (anonymousClass4Pq != null) {
            if (this.f67429b) {
                anonymousClass4Pq.C();
                m28131V(AnonymousClass4Pk.AVAILABLE);
                this.f67415N.setTrashCanEnabled(true);
                this.f67415N.C(new AnonymousClass4PV(this));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void WBA(Object obj, Object obj2, Object obj3) {
        AnonymousClass3AM anonymousClass3AM = (AnonymousClass3AM) obj2;
        if (AnonymousClass4Pa.f53759B[((AnonymousClass3AM) obj).ordinal()] == 1) {
            if (this.f67436i.f5584B == AnonymousClass3AM.MEDIA_EDIT) {
                m28131V(AnonymousClass4Pk.AVAILABLE);
            } else if (this.f67436i.f5584B == AnonymousClass3AM.CAPTURE) {
                m28131V(AnonymousClass4Pk.HIDDEN);
            }
        }
        switch (anonymousClass3AM.ordinal()) {
            case 4:
                AnonymousClass5cl.m28081E(this);
                return;
            case 5:
                if (obj3 instanceof AnonymousClass3Eb) {
                    this.f67413L = ((AnonymousClass3Eb) obj3).f39343B;
                } else {
                    AnonymousClass5cl.m28080D(this);
                }
                if (this.f67413L != null) {
                    this.f67407F.setText(this.f67413L.f31514M);
                    this.f67438k.D(AnonymousClass2Jf.B(this.f67413L.f31503B));
                } else {
                    this.f67407F.setText(JsonProperty.USE_DEFAULT_NAME);
                    this.f67438k.D(this.f67442o.A().f28938I);
                }
                m28129T();
                return;
            case 14:
                m28120K();
                m28131V(AnonymousClass4Pk.PICKING_ASSET);
                return;
            default:
                return;
        }
    }

    public final void WFA(float f, float f2) {
        m28107e();
        AnonymousClass4UU anonymousClass4UU = this.f67439l;
        anonymousClass4UU.f54595C.post(anonymousClass4UU.f54598F);
    }

    public final void Wq(int i, Drawable drawable) {
        if (this.f67429b) {
            int i2;
            Object obj;
            Object obj2 = null;
            if (!(drawable instanceof AnonymousClass163)) {
                if (drawable instanceof AnonymousClass2VC) {
                    AnonymousClass2VC anonymousClass2VC = (AnonymousClass2VC) drawable;
                    if (!anonymousClass2VC.C(AnonymousClass166.class)) {
                        if (anonymousClass2VC.A() instanceof AnonymousClass2bS) {
                            i2 = ((AnonymousClass2bS) anonymousClass2VC.A()).f31404E ^ 1;
                            obj = i == this.f67431d.f54499I ? 1 : null;
                            if (i2 != 0 && obj == null) {
                                obj2 = 1;
                            }
                            if (obj2 == null) {
                                AnonymousClass5cl.m28084H(this).cB = true;
                                AnonymousClass0HV.D(this.f67444q).f2646B.edit().putBoolean("has_used_region_tracking_v2", true).apply();
                                this.f67446s.E();
                                this.f67415N.C(new AnonymousClass4PT(this, i));
                            }
                        }
                    }
                }
                i2 = 1;
                if (i == this.f67431d.f54499I) {
                }
                obj2 = 1;
                if (obj2 == null) {
                    AnonymousClass5cl.m28084H(this).cB = true;
                    AnonymousClass0HV.D(this.f67444q).f2646B.edit().putBoolean("has_used_region_tracking_v2", true).apply();
                    this.f67446s.E();
                    this.f67415N.C(new AnonymousClass4PT(this, i));
                }
            }
            i2 = 0;
            if (i == this.f67431d.f54499I) {
            }
            obj2 = 1;
            if (obj2 == null) {
                AnonymousClass5cl.m28084H(this).cB = true;
                AnonymousClass0HV.D(this.f67444q).f2646B.edit().putBoolean("has_used_region_tracking_v2", true).apply();
                this.f67446s.E();
                this.f67415N.C(new AnonymousClass4PT(this, i));
            }
        }
    }

    /* renamed from: X */
    public final void m28133X() {
        AnonymousClass5cl.m28084H(this).f39500Z = m28114E().f39423B.isEmpty() ^ 1;
        boolean z = false;
        while (true) {
            boolean z2 = false;
            for (AnonymousClass2bu C : this.f67415N.F(AnonymousClass2bu.class)) {
                AnonymousClass2Jg C2 = AnonymousClass2Ji.C(C);
                if (!z) {
                    if (C2 != AnonymousClass2Jg.FROST) {
                        z = false;
                        if (!z2 || C2 == AnonymousClass2Jg.ON) {
                            z2 = true;
                        }
                    }
                }
                z = true;
                if (z2) {
                }
                z2 = true;
            }
            AnonymousClass5cl.m28084H(this).f39501a = z;
            AnonymousClass5cl.m28084H(this).f39502b = z2;
            return;
        }
    }

    /* renamed from: X */
    private boolean m28100X() {
        if (this.f67423V != null) {
            switch (this.f67423V.ordinal()) {
                case 2:
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case ParserMinimalBase.INT_CR /*13*/:
                case 14:
                    return true;
                default:
                    break;
            }
        }
        return false;
    }

    /* renamed from: Y */
    private void m28101Y() {
        for (AnonymousClass162 anonymousClass162 : this.f67415N.F(AnonymousClass162.class)) {
            if (!anonymousClass162.f14421U) {
                break;
            }
        }
        AnonymousClass162 anonymousClass1622 = null;
        AnonymousClass5cl.m28088L(this, AnonymousClass162.class);
        this.f67436i.C(new AnonymousClass3ED(anonymousClass1622));
    }

    /* renamed from: Z */
    private void m28102Z(AnonymousClass2GR anonymousClass2GR) {
        AnonymousClass5cl.m28088L(this, AnonymousClass2GR.class);
        this.f67436i.C(new AnonymousClass3EL(anonymousClass2GR.f28277K));
    }

    public final void ZBA(AnonymousClass27l anonymousClass27l) {
        if (this.f67404C.m26764B()) {
            AnonymousClass3FR H = AnonymousClass5cl.m28084H(this);
            H.aB.add(((AnonymousClass27n) anonymousClass27l.f26360F.get(0)).f26370G);
        }
    }

    /* renamed from: a */
    private void m28103a(AnonymousClass2Gd anonymousClass2Gd) {
        AnonymousClass5cl.m28088L(this, AnonymousClass2Gd.class);
        if (anonymousClass2Gd == null) {
            this.f67436i.C(new AnonymousClass3EY());
        } else {
            this.f67436i.C(new AnonymousClass3EY(anonymousClass2Gd.f28377F));
        }
    }

    public final void aBA(AnonymousClass27l anonymousClass27l, Drawable drawable) {
        AnonymousClass2Lb anonymousClass2Lb = new AnonymousClass2Lb();
        anonymousClass2Lb.f29352B = true;
        m28112C(anonymousClass27l, drawable, anonymousClass2Lb);
    }

    public final void aw(int i, Drawable drawable, boolean z) {
        String str;
        if (drawable instanceof AnonymousClass2bu) {
            this.HB.remove(drawable);
            if (drawable == this.f67413L) {
                AnonymousClass5cl.m28080D(this);
            }
            AnonymousClass5cl.m28084H(this).f39500Z = m28114E().f39423B.isEmpty() ^ 1;
            str = null;
        } else {
            AnonymousClass2ER anonymousClass2ER = (AnonymousClass2ER) this.f67403B.get(i);
            str = anonymousClass2ER != null ? anonymousClass2ER.A() : null;
            this.f67403B.remove(i);
        }
        if (this.f67431d.f54499I == i) {
            this.f67431d.A();
        } else if (AnonymousClass2G6.G(drawable)) {
            AnonymousClass5Tq anonymousClass5Tq = this.f67424W;
            if (AnonymousClass0LQ.B(drawable, anonymousClass5Tq.f64635C)) {
                anonymousClass5Tq.m26960E();
            }
            if (z) {
                AnonymousClass3FJ A = this.f67408G.A();
                if (A.f39427C == AnonymousClass3FK.VIDEO) {
                    A.f39428D.f44637X = null;
                }
            }
        }
        if (z) {
            AnonymousClass281.B(this.f67444q).oa(str, AnonymousClass5cl.m28098V(drawable));
            if (this.f67415N.f31653M) {
                AnonymousClass0HV D = AnonymousClass0HV.D(this.f67444q);
                String str2 = "story_drawable_trash_can_usage_count";
                D.f2646B.edit().putInt(str2, D.f2646B.getInt(str2, 0) + 1).apply();
                AnonymousClass5cl.m28087K(this);
            }
        }
        AnonymousClass5UG anonymousClass5UG = this.f67430c;
        if (AnonymousClass2G6.G(drawable)) {
            anonymousClass5UG.f64859B.f54455E = false;
        } else if (AnonymousClass4Tm.E(drawable)) {
            AnonymousClass4Ts anonymousClass4Ts = anonymousClass5UG.f64859B;
            int i2 = anonymousClass4Ts.f54459I;
            if (i2 > 0) {
                anonymousClass4Ts.f54459I = i2 - 1;
            }
        } else if (AnonymousClass5UG.m27001D(drawable)) {
            anonymousClass5UG.f64859B.f54453C = false;
        } else if (AnonymousClass5UG.m27000C(drawable)) {
            anonymousClass5UG.f64859B.f54454D = false;
        }
        AnonymousClass5UG.m26999B(anonymousClass5UG);
    }

    /* renamed from: b */
    private static void m28104b(Editable editable, boolean z) {
        for (AnonymousClass288 anonymousClass288 : (AnonymousClass288[]) AnonymousClass2Jd.E(editable, AnonymousClass288.class)) {
            anonymousClass288.f26475C = z;
        }
    }

    public final void bAA(int i, Drawable drawable) {
        if (this.f67431d.f54499I == i) {
            AnonymousClass4U3 anonymousClass4U3 = this.f67431d;
            anonymousClass4U3.f54501K = (anonymousClass4U3.f54501K + 1) % anonymousClass4U3.f54497G.size();
            AnonymousClass4U3.D(anonymousClass4U3);
        } else if ((drawable instanceof AnonymousClass2bu) && !(drawable instanceof AnonymousClass2eC) && this.f67423V != AnonymousClass4Pk.SCRUBBING_FOR_REGION_TRACKING) {
            this.f67436i.C(new AnonymousClass3Eb((AnonymousClass2bu) drawable));
        } else if (drawable instanceof AnonymousClass162) {
            m28101Y();
        } else if (drawable instanceof AnonymousClass2GR) {
            m28102Z((AnonymousClass2GR) drawable);
        } else if (drawable instanceof AnonymousClass2Gd) {
            m28103a((AnonymousClass2Gd) drawable);
        } else if (drawable instanceof AnonymousClass2VC) {
            AnonymousClass2VC anonymousClass2VC = (AnonymousClass2VC) drawable;
            anonymousClass2VC.E();
            ((AnonymousClass2ER) this.f67403B.get(i)).f27860D = anonymousClass2VC.f31023F;
        }
    }

    /* renamed from: c */
    private void m28105c(boolean z) {
        if (this.f67442o.A().f28932C) {
            AnonymousClass4UQ anonymousClass4UQ = this.f67438k;
            AnonymousClass14H.H(z, new View[]{anonymousClass4UQ.f54588C});
            return;
        }
        this.f67438k.A(z);
    }

    public final void cAA(int i, Drawable drawable) {
        if (this.f67423V != AnonymousClass4Pk.SCRUBBING_FOR_REGION_TRACKING) {
            if (drawable instanceof AnonymousClass2VC) {
                ((AnonymousClass2VC) drawable).D(true);
            }
            this.f67436i.C(new AnonymousClass3EX());
        }
    }

    /* renamed from: d */
    private void m28106d(boolean z) {
        if (this.f67442o.A().f28933D) {
            AnonymousClass14H.H(z, new View[]{this.f67439l.f54597E});
            this.f67439l.B(false);
            return;
        }
        AnonymousClass14H.E(z, new View[]{this.f67439l.f54597E});
    }

    /* renamed from: e */
    private void m28107e() {
        AnonymousClass2K5 A = this.f67442o.A();
        if (A.f28936G) {
            this.f67407F.setTextSize(AnonymousClass5cl.m28085I(this));
        } else {
            this.f67407F.setTextSize(0, (float) A.f28943N.A(this.f67411J));
        }
        AnonymousClass2bu anonymousClass2bu = this.f67413L;
        if (anonymousClass2bu != null) {
            anonymousClass2bu.G(A.f28943N.B(this.f67411J, this.f67407F.getTextSize()), A.f28943N.F(this.f67411J, this.f67407F.getTextSize()));
        }
    }

    /* renamed from: f */
    private void m28108f(boolean z) {
        if (this.f67442o.A().f28934E) {
            AnonymousClass14H.H(z, new View[]{this.f67441n.f54605B});
            this.f67441n.B(AnonymousClass2Jy.E(this.f67407F));
            return;
        }
        this.f67441n.A(z);
    }

    /* renamed from: g */
    private void m28109g() {
        AnonymousClass2Jp anonymousClass2Jp = this.f67442o.A().f28940K[0];
        AnonymousClass2Jy.F(anonymousClass2Jp.f28891E, this.f67407F.getText());
        if (this.f67413L != null) {
            AnonymousClass2Jy.F(anonymousClass2Jp.f28891E, this.f67413L.f31514M);
        }
    }

    public final void gd(AnonymousClass27h anonymousClass27h, Drawable drawable) {
        switch (anonymousClass27h.eT().ordinal()) {
            case 0:
                aBA(anonymousClass27h.JS(), drawable);
                return;
            case 1:
                Tk(anonymousClass27h.ZL(), drawable);
                return;
            default:
                throw new UnsupportedOperationException("Unknown AssetItem type");
        }
    }

    public final void ny(Drawable drawable, float f, float f2) {
        m28131V(AnonymousClass4Pk.DRAGGING_ASSET);
    }

    public final void uj(int i, Drawable drawable) {
        if (this.f67428a.m26875C(i)) {
            AnonymousClass5cl.m28084H(this).bB = true;
            if (!AnonymousClass3G3.C(drawable)) {
                this.f67415N.L(i, 0);
            }
        }
        if (drawable instanceof AnonymousClass2VC) {
            ((AnonymousClass2VC) drawable).D(true);
        }
    }

    public final void xm(AnonymousClass2Fo anonymousClass2Fo, Drawable drawable, List list) {
        int i = 0;
        for (AnonymousClass2VC B : this.f67415N.F(AnonymousClass2VC.class)) {
            List B2 = B.B(AnonymousClass2bS.class);
            if (!B2.isEmpty()) {
                if (((AnonymousClass2bS) B2.get(0)).f31402C == anonymousClass2Fo) {
                    AnonymousClass0IG.C(this.f67411J, C0164R.string.friends_sticker_already_added_message);
                    return;
                }
                i++;
                if (i >= 5) {
                    AnonymousClass0IG.C(this.f67411J, C0164R.string.friends_sticker_max_stickers_per_story_message);
                    return;
                }
            }
        }
        AnonymousClass2Lb anonymousClass2Lb = new AnonymousClass2Lb();
        anonymousClass2Lb.f29352B = true;
        anonymousClass2Lb.f29364N = "TextOverlayController";
        m28127R(list, drawable, anonymousClass2Lb.A());
    }

    public final void xy(AnonymousClass4Pq anonymousClass4Pq, float f, int i) {
        this.f67415N.post(new AnonymousClass4PU(this, i));
    }

    public final boolean zX() {
        return this.f67430c.m27003B(AnonymousClass4Tu.f54468J) && this.f67430c.m27003B(AnonymousClass4Tu.f54462D);
    }
}
