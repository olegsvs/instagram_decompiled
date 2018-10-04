package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Adapter;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.mediaactions.MediaActionsView;
import java.lang.ref.WeakReference;

/* renamed from: X.0pT */
public final class AnonymousClass0pT {
    /* renamed from: B */
    public final AnonymousClass0jZ f10626B;
    /* renamed from: C */
    public final boolean f10627C;
    /* renamed from: D */
    public final Context f10628D;
    /* renamed from: E */
    public final AnonymousClass0kG f10629E;
    /* renamed from: F */
    public final AnonymousClass0Cm f10630F;
    /* renamed from: G */
    private final AnonymousClass0jw f10631G;
    /* renamed from: H */
    private final boolean f10632H;
    /* renamed from: I */
    private final boolean f10633I;
    /* renamed from: J */
    private final AnonymousClass0Ci f10634J;

    public AnonymousClass0pT(Context context, AnonymousClass0jZ anonymousClass0jZ, AnonymousClass0kG anonymousClass0kG, AnonymousClass0Cm anonymousClass0Cm, boolean z) {
        this(context, anonymousClass0jZ, anonymousClass0kG, anonymousClass0Cm, z, false);
    }

    public AnonymousClass0pT(Context context, AnonymousClass0jZ anonymousClass0jZ, AnonymousClass0kG anonymousClass0kG, AnonymousClass0Cm anonymousClass0Cm, boolean z, boolean z2) {
        this(context, anonymousClass0jZ, anonymousClass0kG, anonymousClass0Cm, z, z2, null);
    }

    public AnonymousClass0pT(Context context, AnonymousClass0jZ anonymousClass0jZ, AnonymousClass0kG anonymousClass0kG, AnonymousClass0Cm anonymousClass0Cm, boolean z, boolean z2, AnonymousClass0jw anonymousClass0jw) {
        this.f10628D = context;
        this.f10626B = anonymousClass0jZ;
        this.f10629E = anonymousClass0kG;
        this.f10630F = anonymousClass0Cm;
        this.f10634J = anonymousClass0Cm.m1037B();
        this.f10633I = z;
        this.f10632H = z2;
        this.f10631G = anonymousClass0jw;
        this.f10627C = ((Boolean) AnonymousClass0CC.HE.m846H(anonymousClass0Cm)).booleanValue();
    }

    /* renamed from: A */
    public final void m7861A(AnonymousClass0q2 anonymousClass0q2, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, int i, AnonymousClass0EE anonymousClass0EE, AnonymousClass0jC anonymousClass0jC, boolean z) {
        AnonymousClass0q2 anonymousClass0q22 = anonymousClass0q2;
        anonymousClass0q22.f10846E.m8664A();
        AnonymousClass0m3 anonymousClass0m32 = anonymousClass0m3;
        if (!(anonymousClass0q22.f10849H == null || anonymousClass0q22.f10849H == anonymousClass0m32)) {
            anonymousClass0q22.f10849H.m7457J(anonymousClass0q22);
            anonymousClass0q22.f10849H.m7471X(anonymousClass0q22.f10846E);
            anonymousClass0q22.f10849H.m7472Y(anonymousClass0q22.f10848G.f12002B);
        }
        anonymousClass0q22.f10849H = anonymousClass0m32;
        AnonymousClass0P7 anonymousClass0P72 = anonymousClass0P7;
        anonymousClass0q22.f10847F = anonymousClass0P72;
        anonymousClass0q22.f10849H.m7448A(anonymousClass0q22);
        anonymousClass0q22.f10849H.m7451D(anonymousClass0q22.f10846E);
        AnonymousClass0zI.m8680B(anonymousClass0q22.f10848G, anonymousClass0P72, anonymousClass0m32, this.f10630F);
        if (anonymousClass0m32.f9673H != anonymousClass0m32.f9672G) {
            anonymousClass0m32.m7461N(anonymousClass0m32.f9672G);
        }
        Object obj = anonymousClass0q22.f10844C;
        AnonymousClass0jw anonymousClass0jw = r4.f10631G;
        if (obj != null) {
            AnonymousClass0zf anonymousClass0zf;
            if (!(obj.f13074H == null || obj.f13074H == anonymousClass0m32)) {
                obj.f13074H.m7457J(obj);
                AnonymousClass0m3 anonymousClass0m33 = obj.f13074H;
                if (anonymousClass0m33.f9674I == obj) {
                    anonymousClass0m33.f9674I = null;
                    AnonymousClass0vN anonymousClass0vN = anonymousClass0m33.f9675J;
                    if (anonymousClass0vN != null) {
                        anonymousClass0vN.f12064H = anonymousClass0m33.f9674I;
                    }
                }
                AnonymousClass0m3 anonymousClass0m34 = obj.f13074H;
                WeakReference weakReference = anonymousClass0m34.FB;
                if (weakReference != null && weakReference.get() == obj) {
                    anonymousClass0m34.m7456I(null);
                }
            }
            obj.f13074H = anonymousClass0m32;
            obj.f13074H.m7448A(obj);
            obj.f13074H.f9685T = true;
            obj.f13072F = anonymousClass0P72.m3761Q();
            obj.f13071E = anonymousClass0jw;
            if (obj.f13073G != null) {
                obj.m8697A().setVisibility(8);
            }
            if (obj.f13068B == null) {
                View inflate = obj.f13070D.inflate();
                obj.f13068B = (ViewGroup) inflate.findViewById(C0164R.id.carousel_bumping_text_indicator_row);
                obj.f13069C = (TextView) inflate.findViewById(C0164R.id.carousel_bumping_text_indicator);
            }
            obj.f13068B.setVisibility(0);
            obj.f13069C.setText(AnonymousClass0zd.m8700B(anonymousClass0m32.f9673H, obj.f13072F));
            obj.f13074H.m7456I(obj);
            AnonymousClass0ze anonymousClass0ze = obj.f13074H.GB;
            if (anonymousClass0ze == null) {
                anonymousClass0zf = AnonymousClass0zf.STOPPED;
            } else {
                anonymousClass0zf = anonymousClass0ze.f13107G;
            }
            if (anonymousClass0zf == AnonymousClass0zf.VISIBLE_DELAY) {
                obj.f13068B.setAlpha(1.0f);
            }
        }
        AnonymousClass0zC.m8676C(anonymousClass0q22.f10845D, anonymousClass0P72, anonymousClass0m32, r4.f10628D, r4.f10629E);
        AnonymousClass0zE.m8677B(anonymousClass0q22.f10843B, anonymousClass0P72, r4.f10634J, r4.f10629E);
        anonymousClass0q22.f10851J.m8081B();
        Adapter adapter = null;
        int i2 = i;
        if (anonymousClass0q22.f10851J.getAdapter() != null && (anonymousClass0q22.f10851J.getAdapter() instanceof AnonymousClass0zb)) {
            AnonymousClass0zb anonymousClass0zb = (AnonymousClass0zb) anonymousClass0q22.f10851J.getAdapter();
            if (anonymousClass0zb.f13080F == anonymousClass0P72) {
                anonymousClass0zb.m8699A(anonymousClass0m32, i2, r4.f10626B, anonymousClass0q22.f10848G, anonymousClass0q22.f10850I, r4.f10629E, r4.f10630F);
                adapter = anonymousClass0zb;
            }
        }
        i = anonymousClass0EE;
        if (adapter == null) {
            Context context = r4.f10628D;
            AnonymousClass0jZ anonymousClass0jZ = r4.f10626B;
            AnonymousClass0vI anonymousClass0vI = anonymousClass0q22.f10848G;
            AnonymousClass40Q anonymousClass40Q = anonymousClass0q22.f10850I;
            AnonymousClass0kG anonymousClass0kG = r4.f10629E;
            AnonymousClass0Cm anonymousClass0Cm = r4.f10630F;
            AnonymousClass0vI anonymousClass0vI2 = anonymousClass0vI;
            AnonymousClass0jZ anonymousClass0jZ2 = anonymousClass0jZ;
            adapter = new AnonymousClass0zb(context, anonymousClass0P72, anonymousClass0m32, i2, anonymousClass0jZ2, anonymousClass0vI2, anonymousClass40Q, anonymousClass0kG, anonymousClass0Cm, r4.f10633I, i, anonymousClass0jC, r4.f10632H);
        }
        anonymousClass0P7 = ((Boolean) AnonymousClass0CC.DE.m846H(r4.f10630F)).booleanValue();
        if (anonymousClass0P7 != null) {
            anonymousClass0q22.f10851J.setExtraBufferSize(0);
            int i3 = anonymousClass0m32.f9673H + 1;
            if (i3 < anonymousClass0P72.m3761Q()) {
                AnonymousClass0RJ D = AnonymousClass0Gs.f2431j.m1908D(anonymousClass0P72.m3763S(i3).m3794x(anonymousClass0q22.f10851J.getContext()));
                D.f4645P = i.getModuleName();
                D.m4148B();
            }
        } else if (AnonymousClass0cW.m5886I(r4.f10630F)) {
            anonymousClass0q22.f10851J.setExtraBufferSize(0);
        }
        anonymousClass0q22.f10851J.setAdapter(adapter);
        if (anonymousClass0m32.f9689X) {
            anonymousClass0q22.f10851J.m8084E((float) anonymousClass0m32.f9673H);
        } else {
            anonymousClass0q22.f10851J.m8086G(anonymousClass0m32.f9673H);
        }
        anonymousClass0q22.f10851J.setOverScrollOnEdgeItems(false);
        anonymousClass0q22.f10851J.m8080A(new AnonymousClass0zc(r4, anonymousClass0P72, anonymousClass0q22, anonymousClass0m32, adapter, i2, z, anonymousClass0P7, i));
    }

    /* renamed from: B */
    public final View m7862B(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.row_feed_carousel_media_group, viewGroup, false);
        AnonymousClass0q2 anonymousClass0q2 = new AnonymousClass0q2();
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0164R.id.carousel_media_group);
        anonymousClass0q2.f10846E = (LikeActionView) inflate.findViewById(C0164R.id.like_heart);
        MediaActionsView mediaActionsView = (MediaActionsView) inflate.findViewById(C0164R.id.row_carousel_media_actions);
        anonymousClass0q2.f10850I = AnonymousClass3OK.C(inflate);
        anonymousClass0q2.f10848G = new AnonymousClass0vI((ViewStub) inflate.findViewById(C0164R.id.media_indicator_view_stub), anonymousClass0q2.f10850I);
        anonymousClass0q2.f10851J = (ReboundViewPager) inflate.findViewById(C0164R.id.carousel_viewpager);
        anonymousClass0q2.f10844C = new AnonymousClass0za((ViewStub) inflate.findViewById(C0164R.id.carousel_in_feed_text_indicator_stub), (ViewStub) inflate.findViewById(C0164R.id.carousel_in_feed_bumping_text_indicator_stub), this.f10627C);
        anonymousClass0q2.f10845D = new AnonymousClass0zB((ViewStub) inflate.findViewById(C0164R.id.save_to_collection_upsell_view_stub));
        anonymousClass0q2.f10843B = new AnonymousClass0zD((ViewStub) inflate.findViewById(C0164R.id.branded_content_violation_banner));
        anonymousClass0q2.f10851J.setPageSpacing(0.0f);
        inflate.setTag(anonymousClass0q2);
        return inflate;
    }
}
