package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.153 */
public final class AnonymousClass153 implements AnonymousClass14c, AnonymousClass14d {
    public TextView AB;
    /* renamed from: B */
    public final View f14153B;
    public final ViewStub BB;
    /* renamed from: C */
    public final TextView f14154C;
    public final Drawable CB;
    /* renamed from: D */
    public final View f14155D;
    public final int DB;
    /* renamed from: E */
    public View f14156E;
    /* renamed from: F */
    public TextView f14157F;
    /* renamed from: G */
    public final ViewStub f14158G;
    /* renamed from: H */
    public final View f14159H;
    /* renamed from: I */
    public final View f14160I;
    /* renamed from: J */
    public AnonymousClass15y f14161J;
    /* renamed from: K */
    public TextView f14162K;
    /* renamed from: L */
    public ViewStub f14163L;
    /* renamed from: M */
    public final TextView f14164M;
    /* renamed from: N */
    public View f14165N;
    /* renamed from: O */
    public final AnonymousClass0ct f14166O;
    /* renamed from: P */
    public TextView f14167P;
    /* renamed from: Q */
    public Drawable f14168Q;
    /* renamed from: R */
    public final int f14169R;
    /* renamed from: S */
    public View f14170S;
    /* renamed from: T */
    public final ViewStub f14171T;
    /* renamed from: U */
    public TextView f14172U;
    /* renamed from: V */
    public final View f14173V;
    /* renamed from: W */
    public final int f14174W;
    /* renamed from: X */
    public final int f14175X;
    /* renamed from: Y */
    public View f14176Y;
    /* renamed from: Z */
    public TextView f14177Z;
    /* renamed from: a */
    public final ViewStub f14178a;
    /* renamed from: b */
    public AnonymousClass15E f14179b;
    /* renamed from: c */
    public final View f14180c;
    /* renamed from: d */
    public final TextView f14181d;
    /* renamed from: e */
    public final View f14182e;
    /* renamed from: f */
    public final Drawable f14183f;
    /* renamed from: g */
    public final int f14184g;
    /* renamed from: h */
    public AnonymousClass0Pj f14185h;
    /* renamed from: i */
    public AnonymousClass14s f14186i;
    /* renamed from: j */
    public AnonymousClass5DZ f14187j;
    /* renamed from: k */
    public final View f14188k;
    /* renamed from: l */
    public View f14189l;
    /* renamed from: m */
    public final ViewStub f14190m;
    /* renamed from: n */
    public View f14191n;
    /* renamed from: o */
    public final ViewStub f14192o;
    /* renamed from: p */
    public final Resources f14193p = this.f14173V.getResources();
    /* renamed from: q */
    public final View f14194q;
    /* renamed from: r */
    public View f14195r;
    /* renamed from: s */
    public final ViewStub f14196s;
    /* renamed from: t */
    public final View f14197t;
    /* renamed from: u */
    public final View f14198u;
    /* renamed from: v */
    public final View f14199v;
    /* renamed from: w */
    public final View f14200w;
    /* renamed from: x */
    public final int f14201x;
    /* renamed from: y */
    public ImageView f14202y;
    /* renamed from: z */
    public View f14203z;

    public AnonymousClass153(ViewGroup viewGroup) {
        this.f14173V = viewGroup;
        this.DB = AnonymousClass0Ca.m937C(viewGroup.getContext(), C0164R.color.white_80_transparent);
        Drawable mutate = AnonymousClass0Ca.m939E(viewGroup.getContext(), C0164R.drawable.viewers_icon).mutate();
        this.CB = mutate;
        mutate.setColorFilter(AnonymousClass0ca.m5921B(AnonymousClass0Ca.m937C(this.f14173V.getContext(), C0164R.color.white)));
        this.f14183f = AnonymousClass0Ca.m939E(this.f14173V.getContext(), C0164R.drawable.story_message_composer_background).mutate();
        this.f14184g = this.f14193p.getDimensionPixelOffset(C0164R.dimen.reel_reply_composer_margin);
        this.f14169R = this.f14193p.getDimensionPixelSize(C0164R.dimen.facepile_item_size);
        this.f14175X = this.f14193p.getDimensionPixelSize(C0164R.dimen.labeled_items_horizontal_padding);
        this.f14174W = this.f14193p.getDimensionPixelSize(C0164R.dimen.labeled_items_bottom_margin);
        this.f14193p.getDimensionPixelSize(C0164R.dimen.labeled_items_max_width);
        this.f14201x = this.f14193p.getDimensionPixelSize(C0164R.dimen.toolbar_long_text_edge_padding);
        AnonymousClass0Ca.m939E(viewGroup.getContext(), C0164R.drawable.highlights_icon).setColorFilter(AnonymousClass0ca.m5921B(-1));
        this.f14155D = viewGroup.findViewById(C0164R.id.toolbar_actions_container);
        this.f14200w = viewGroup.findViewById(C0164R.id.toolbar);
        this.f14159H = viewGroup.findViewById(C0164R.id.toolbar_buttons_container);
        this.f14180c = viewGroup.findViewById(C0164R.id.toolbar_menu_button);
        this.f14181d = (TextView) viewGroup.findViewById(C0164R.id.toolbar_menu_button_label);
        this.f14153B = viewGroup.findViewById(C0164R.id.action_button);
        this.f14154C = (TextView) viewGroup.findViewById(C0164R.id.action_button_label);
        this.f14194q = viewGroup.findViewById(C0164R.id.toolbar_spinner);
        this.f14160I = viewGroup.findViewById(C0164R.id.message_composer_camera_button_container);
        TextView textView = (TextView) viewGroup.findViewById(C0164R.id.toolbar_text);
        this.f14164M = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f14199v = viewGroup.findViewById(C0164R.id.toolbar_text_container);
        this.f14197t = viewGroup.findViewById(C0164R.id.toolbar_chevron);
        this.f14182e = viewGroup.findViewById(C0164R.id.message_composer_background);
        this.f14188k = viewGroup.findViewById(C0164R.id.toolbar_reply_side_button);
        this.f14198u = viewGroup.findViewById(C0164R.id.toolbar_chevron_fill);
        this.f14190m = (ViewStub) viewGroup.findViewById(C0164R.id.toolbar_reshare_button_on_left_stub);
        this.f14192o = (ViewStub) viewGroup.findViewById(C0164R.id.toolbar_reshare_button_on_right_stub);
        this.f14171T = (ViewStub) viewGroup.findViewById(C0164R.id.toolbar_highlights_button_stub);
        this.f14196s = (ViewStub) viewGroup.findViewById(C0164R.id.story_feedback_button_viewstub);
        this.f14166O = new AnonymousClass0ct((ViewStub) viewGroup.findViewById(C0164R.id.toolbar_facebook_share_button_stub));
        this.BB = (ViewStub) viewGroup.findViewById(C0164R.id.viewers_facepile_button_stub);
        this.f14158G = (ViewStub) viewGroup.findViewById(C0164R.id.toolbar_archive_share_button_stub);
        this.f14178a = (ViewStub) viewGroup.findViewById(C0164R.id.toolbar_live_camera_pivot_button_stub);
        this.f14163L = (ViewStub) viewGroup.findViewById(C0164R.id.context_description_viewstub);
    }

    /* renamed from: A */
    public final TextView m9285A() {
        if (this.f14162K == null) {
            this.f14162K = (TextView) this.f14163L.inflate();
        }
        return this.f14162K;
    }

    /* renamed from: B */
    public final void m9286B() {
        View view = this.f14189l;
        if (view != null) {
            view.setVisibility(8);
            this.f14189l.setOnClickListener(null);
        }
    }

    /* renamed from: C */
    public final void m9287C() {
        View view = this.f14191n;
        if (view != null) {
            view.setVisibility(8);
            this.f14191n.setOnClickListener(null);
        }
    }

    /* renamed from: D */
    public final void m9288D(AnonymousClass14t anonymousClass14t, AnonymousClass14s anonymousClass14s) {
        int i = 0;
        Object obj = (anonymousClass14t.f14103H.m3134Z() || anonymousClass14s.f14080H || anonymousClass14s.f14077E) ? null : 1;
        View view = this.f14173V;
        if (obj == null) {
            i = 8;
        }
        view.setVisibility(i);
        AnonymousClass15E anonymousClass15E = this.f14179b;
        if (anonymousClass15E != null) {
            anonymousClass15E.f14224B.EB.setVisibility(obj != null ? 0 : 8);
        }
    }

    public final AnonymousClass15y VJ() {
        if (this.f14161J == null) {
            this.f14161J = new AnonymousClass15y(this.f14199v, this.f14197t, this.f14198u, this.f14186i, m9285A(), this.f14164M);
        }
        return this.f14161J;
    }

    public final void tv(AnonymousClass14s anonymousClass14s, int i) {
        if (5 == i) {
            VJ().m9340A();
            this.f14199v.setVisibility(8);
        }
    }
}
