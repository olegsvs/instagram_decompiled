package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.53C */
public final class AnonymousClass53C extends BaseAdapter implements OnItemSelectedListener {
    /* renamed from: B */
    public final Activity f59566B;
    /* renamed from: C */
    public AnonymousClass4qe f59567C;
    /* renamed from: D */
    public final AnonymousClass1gL f59568D;
    /* renamed from: E */
    public int f59569E;
    /* renamed from: F */
    public final List f59570F;
    /* renamed from: G */
    public AnonymousClass0Ci f59571G = this.f59572H;
    /* renamed from: H */
    public final AnonymousClass0Ci f59572H;
    /* renamed from: I */
    public final AnonymousClass0Cm f59573I;
    /* renamed from: J */
    private final boolean f59574J;
    /* renamed from: K */
    private final boolean f59575K;

    public final long getItemId(int i) {
        return (long) i;
    }

    public AnonymousClass53C(Activity activity, AnonymousClass1gL anonymousClass1gL, List list, AnonymousClass0Cm anonymousClass0Cm, boolean z, boolean z2) {
        this.f59566B = activity;
        this.f59568D = anonymousClass1gL;
        this.f59570F = list;
        this.f59573I = anonymousClass0Cm;
        this.f59572H = anonymousClass0Cm.B();
        this.f59574J = z;
        this.f59575K = z2;
    }

    /* renamed from: B */
    public static void m25631B(AnonymousClass53C anonymousClass53C, View view, boolean z) {
        Context context = view.getContext();
        if (!z) {
            if (AnonymousClass0yJ.B(anonymousClass53C.f59573I)) {
                view.setBackgroundColor(AnonymousClass0Ca.C(context, C0164R.color.grey_0));
                return;
            }
        }
        view.setBackgroundColor(AnonymousClass0Ca.C(context, C0164R.color.white));
    }

    /* renamed from: C */
    public static void m25632C(AnonymousClass538 anonymousClass538, int i, boolean z, boolean z2) {
        CharSequence string;
        int i2 = 8;
        AnonymousClass0Nm.i(anonymousClass538.f59545G, 8);
        anonymousClass538.f59542D.setVisibility(8);
        anonymousClass538 = z2 ? anonymousClass538.f59544F : anonymousClass538.f59543E;
        if (i > 0) {
            i2 = 0;
        }
        anonymousClass538.setVisibility(i2);
        if (!z || i <= 9) {
            string = anonymousClass538.getResources().getString(C0164R.string.notification_count, new Object[]{Integer.valueOf(i)});
        } else {
            string = anonymousClass538.getResources().getString(C0164R.string.notification_count_9_plus);
        }
        anonymousClass538.setText(string);
    }

    /* renamed from: D */
    public static AnonymousClass53B m25633D(AnonymousClass53C anonymousClass53C, int i) {
        anonymousClass53C = anonymousClass53C.f59570F.size();
        if (i < anonymousClass53C) {
            return AnonymousClass53B.INSTAGRAM_LOGGED_IN_USER_DROPDOWN;
        }
        if (i > anonymousClass53C + 1) {
            return AnonymousClass53B.FAMILY_ACCOUNT_DROPDOWN;
        }
        if (i == anonymousClass53C) {
            return AnonymousClass53B.ADD_ACCOUNT_DROPDOWN;
        }
        return AnonymousClass53B.HEADER_DROPDOWN;
    }

    /* renamed from: E */
    public static View m25634E(AnonymousClass53C anonymousClass53C, View view, ViewGroup viewGroup) {
        if (view != null && (view.getTag() instanceof AnonymousClass538)) {
            return view;
        }
        view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.spinner_dropdown_numeric_row, viewGroup, false);
        AnonymousClass538 anonymousClass538 = new AnonymousClass538();
        anonymousClass538.f59551M = (CircularImageView) view.findViewById(C0164R.id.row_user_imageview);
        anonymousClass538.f59540B = (IgImageView) view.findViewById(C0164R.id.row_account_icon_imageview);
        anonymousClass538.f59553O = (TextView) view.findViewById(C0164R.id.row_user_textview);
        anonymousClass538.f59546H = (ImageView) view.findViewById(C0164R.id.check);
        anonymousClass538.f59545G = view.findViewById(C0164R.id.account_badge);
        anonymousClass538.f59543E = (TextView) view.findViewById(C0164R.id.notification_count);
        anonymousClass538.f59544F = (TextView) view.findViewById(C0164R.id.notification_count_avatar);
        anonymousClass538.f59542D = (TextView) view.findViewById(C0164R.id.notification_action);
        anonymousClass538.f59552N = view.findViewById(C0164R.id.login_button);
        anonymousClass538.f59541C = view.findViewById(C0164R.id.audience_button_container);
        anonymousClass538.f59550L = (TextView) view.findViewById(C0164R.id.followers_button);
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(anonymousClass538.f59550L);
        anonymousClass15z.f14385E = new AnonymousClass535(anonymousClass53C);
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14393M = true;
        anonymousClass15z.A();
        anonymousClass538.f59547I = (TextView) view.findViewById(C0164R.id.close_friends_button);
        anonymousClass15z = new AnonymousClass15z(anonymousClass538.f59547I);
        anonymousClass15z.f14385E = new AnonymousClass536(anonymousClass53C);
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14393M = true;
        anonymousClass15z.A();
        anonymousClass538.f59548J = view;
        anonymousClass538.f59549K = view.findViewById(C0164R.id.divider);
        view.setTag(anonymousClass538);
        return view;
    }

    /* renamed from: F */
    public static View m25635F(ViewGroup viewGroup, int i, int i2, View view) {
        if (view != null && (view.getTag() instanceof AnonymousClass53A)) {
            return view;
        }
        view = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        AnonymousClass53A anonymousClass53A = new AnonymousClass53A();
        anonymousClass53A.f59559D = view;
        anonymousClass53A.f59560E = (TextView) view.findViewById(i2);
        anonymousClass53A.f59557B = (TextView) view.findViewById(C0164R.id.notification_count);
        anonymousClass53A.f59558C = view.findViewById(C0164R.id.account_badge);
        view.setTag(anonymousClass53A);
        return view;
    }

    /* renamed from: G */
    private static int m25636G(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            if (((AnonymousClass0Ci) list.get(i)).getId().equals(str)) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: H */
    private static void m25637H(String str, List list, AdapterView adapterView, int i) {
        str = AnonymousClass53C.m25636G(str, list);
        if (i != str) {
            adapterView.setSelection(str);
        }
    }

    public final int getCount() {
        int size = this.f59570F.size() + this.f59575K;
        AnonymousClass4qe anonymousClass4qe = this.f59567C;
        int B = anonymousClass4qe != null ? anonymousClass4qe.m25199B() : 0;
        if (B > 0) {
            B++;
        }
        return size + B;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        int i2;
        switch (AnonymousClass53C.m25633D(this, i).ordinal()) {
            case 0:
                AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) getItem(i);
                view = AnonymousClass53C.m25634E(this, view, viewGroup2);
                AnonymousClass538 anonymousClass538 = (AnonymousClass538) view.getTag();
                Context context = anonymousClass538.f59553O.getContext();
                CharSequence uT = anonymousClass0Ci.uT();
                String DQ = anonymousClass0Ci.DQ();
                anonymousClass538.f59553O.setText(uT);
                anonymousClass538.f59551M.setStrokeAlpha(51);
                if (DQ != null) {
                    anonymousClass538.f59551M.setUrl(DQ);
                } else {
                    anonymousClass538.f59551M.setImageDrawable(AnonymousClass0Ca.E(anonymousClass538.f59551M.getContext(), C0164R.drawable.profile_anonymous_user));
                }
                anonymousClass538.f59551M.setVisibility(0);
                anonymousClass538.f59540B.setVisibility(8);
                anonymousClass538.f59552N.setVisibility(8);
                boolean equals = anonymousClass0Ci.equals(this.f59571G);
                if (equals) {
                    Drawable mutate = AnonymousClass0Ca.E(context, C0164R.drawable.circle_check).mutate();
                    mutate.setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(context, C0164R.color.blue_5)));
                    anonymousClass538.f59546H.setImageDrawable(mutate);
                    anonymousClass538.f59546H.setVisibility(0);
                    AnonymousClass0Nm.i(anonymousClass538.f59545G, 8);
                    anonymousClass538.f59543E.setVisibility(8);
                    anonymousClass538.f59544F.setVisibility(8);
                    anonymousClass538.f59542D.setVisibility(8);
                    if (AnonymousClass0yJ.B(this.f59573I)) {
                        int i3;
                        if (anonymousClass0Ci.f1752u == null) {
                            i3 = 0;
                        } else {
                            i3 = anonymousClass0Ci.f1752u.intValue();
                        }
                        if (anonymousClass0Ci.f1717L == null) {
                            i2 = 0;
                        } else {
                            i2 = anonymousClass0Ci.f1717L.intValue();
                        }
                        anonymousClass538.f59541C.setVisibility(0);
                        anonymousClass538.f59550L.setText(context.getResources().getQuantityString(C0164R.plurals.followers_button, i3, new Object[]{Integer.valueOf(i3)}));
                        anonymousClass538.f59547I.setText(context.getResources().getQuantityString(C0164R.plurals.close_friends_button, i2, new Object[]{Integer.valueOf(i2)}));
                    } else {
                        anonymousClass538.f59541C.setVisibility(8);
                    }
                } else {
                    anonymousClass538.f59541C.setVisibility(8);
                    AnonymousClass53C.m25632C(anonymousClass538, anonymousClass0Ci.f1715J, false, AnonymousClass0yJ.B(this.f59573I));
                    if (AnonymousClass0yJ.B(this.f59573I)) {
                        Drawable mutate2 = AnonymousClass0Ca.E(context, C0164R.drawable.unchecked).mutate();
                        mutate2.setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(context, C0164R.color.grey_3)));
                        anonymousClass538.f59546H.setImageDrawable(mutate2);
                        anonymousClass538.f59546H.setVisibility(0);
                    } else {
                        anonymousClass538.f59546H.setVisibility(8);
                    }
                }
                AnonymousClass53C.m25631B(this, anonymousClass538.f59548J, equals);
                if (AnonymousClass0yJ.B(this.f59573I)) {
                    anonymousClass538.f59549K.setVisibility(0);
                    return view;
                }
                anonymousClass538.f59549K.setVisibility(8);
                return view;
            case 1:
                view = AnonymousClass53C.m25634E(this, view, viewGroup2);
                AnonymousClass538 anonymousClass5382 = (AnonymousClass538) view.getTag();
                anonymousClass5382.f59553O.setText(C0164R.string.add_account);
                anonymousClass5382.f59551M.setImageDrawable(AnonymousClass0Ca.E(anonymousClass5382.f59548J.getContext(), C0164R.drawable.plus_small));
                anonymousClass5382.f59551M.setStrokeAlpha(0);
                anonymousClass5382.f59546H.setVisibility(8);
                anonymousClass5382.f59551M.setVisibility(0);
                anonymousClass5382.f59552N.setVisibility(8);
                anonymousClass5382.f59541C.setVisibility(8);
                AnonymousClass53C.m25631B(this, anonymousClass5382.f59548J, false);
                return view;
            case 2:
                view = AnonymousClass53C.m25635F(viewGroup2, C0164R.layout.header_dropdown_row, C0164R.id.row_header_textview, view);
                AnonymousClass53A anonymousClass53A = (AnonymousClass53A) view.getTag();
                anonymousClass53A.f59560E.setText(viewGroup2.getContext().getString(this.f59569E));
                AnonymousClass53C.m25631B(this, anonymousClass53A.f59559D, false);
                return view;
            case 3:
                int indexOf;
                AnonymousClass4qb anonymousClass4qb = (AnonymousClass4qb) getItem(i);
                view = AnonymousClass53C.m25634E(this, view, viewGroup2);
                AnonymousClass538 anonymousClass5383 = (AnonymousClass538) view.getTag();
                boolean equals2 = AnonymousClass1Q3.AVATAR.equals(anonymousClass4qb.f57841K);
                if (equals2) {
                    i2 = C0164R.string.app_connected_format;
                    if (TextUtils.isEmpty(anonymousClass4qb.f57840J)) {
                        anonymousClass5383.f59551M.A();
                    } else {
                        anonymousClass5383.f59551M.setUrl(anonymousClass4qb.f57840J);
                    }
                    anonymousClass5383.f59551M.setVisibility(0);
                    anonymousClass5383.f59540B.setVisibility(8);
                    AnonymousClass53C.m25632C(anonymousClass5383, anonymousClass4qb.m25195A().intValue(), true, false);
                } else {
                    i2 = (TextUtils.isEmpty(anonymousClass4qb.f57836F) && TextUtils.isEmpty(anonymousClass4qb.f57842L)) ? C0164R.string.app_unconnected_no_context_format : C0164R.string.app_unconnected_format;
                    anonymousClass5383.f59551M.setVisibility(8);
                    anonymousClass5383.f59540B.setVisibility(0);
                    if (TextUtils.isEmpty(anonymousClass4qb.f57837G)) {
                        anonymousClass5383.f59540B.setImageDrawable(null);
                    } else {
                        anonymousClass5383.f59540B.setUrl(anonymousClass4qb.f57837G);
                    }
                    AnonymousClass0Nm.i(anonymousClass5383.f59545G, 8);
                    AnonymousClass0Nm.i(anonymousClass5383.f59543E, 8);
                    AnonymousClass0Nm.i(anonymousClass5383.f59544F, 8);
                    if (anonymousClass4qb.m25195A().intValue() > 0) {
                        AnonymousClass53C.m25632C(anonymousClass5383, anonymousClass4qb.m25195A().intValue(), true, false);
                    } else if (TextUtils.isEmpty(anonymousClass4qb.f57832B) || !((Boolean) AnonymousClass0CC.UL.H(this.f59573I)).booleanValue()) {
                        anonymousClass5383.f59542D.setVisibility(8);
                    } else {
                        anonymousClass5383.f59542D.setVisibility(0);
                        anonymousClass5383.f59542D.setText(anonymousClass4qb.f57832B);
                    }
                }
                Context context2 = anonymousClass5383.f59553O.getContext();
                CharSequence spannableStringBuilder = new SpannableStringBuilder(context2.getString(i2, new Object[]{anonymousClass4qb.f57833C, anonymousClass4qb.f57836F, anonymousClass4qb.f57842L}));
                if (equals2) {
                    indexOf = spannableStringBuilder.toString().indexOf(anonymousClass4qb.f57833C);
                } else {
                    indexOf = spannableStringBuilder.toString().indexOf(anonymousClass4qb.f57842L);
                }
                spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass0Ca.C(context2, C0164R.color.grey_5)), indexOf, spannableStringBuilder.length(), 18);
                anonymousClass5383.f59553O.setText(spannableStringBuilder);
                anonymousClass5383.f59546H.setVisibility(8);
                anonymousClass5383.f59552N.setVisibility(8);
                anonymousClass5383.f59541C.setVisibility(8);
                AnonymousClass53C.m25631B(this, anonymousClass5383.f59548J, false);
                return view;
            default:
                return view;
        }
    }

    public final Object getItem(int i) {
        Object obj = null;
        switch (AnonymousClass537.f59539B[AnonymousClass53C.m25633D(this, i).ordinal()]) {
            case 1:
                return this.f59570F.get(i);
            case 2:
                AnonymousClass4qe anonymousClass4qe = this.f59567C;
                if (anonymousClass4qe != null) {
                    obj = anonymousClass4qe.m25198A(i - (this.f59570F.size() + 2));
                    break;
                }
                break;
        }
        return obj;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View F = AnonymousClass53C.m25635F(viewGroup, C0164R.layout.badged_spinner_row, C0164R.id.row_user_textview, view);
        AnonymousClass53A anonymousClass53A = (AnonymousClass53A) F.getTag();
        F.setClickable(false);
        if (i < this.f59570F.size()) {
            anonymousClass53A.f59560E.setText(((AnonymousClass0Ci) this.f59570F.get(i)).uT());
            viewGroup = null;
            for (AnonymousClass0Ci anonymousClass0Ci : this.f59570F) {
                if (!anonymousClass0Ci.equals(this.f59572H)) {
                    viewGroup += anonymousClass0Ci.f1715J;
                }
            }
            AnonymousClass4qe anonymousClass4qe = this.f59567C;
            if (anonymousClass4qe != null && anonymousClass4qe.f57853D) {
                for (int B = this.f59567C.m25199B() - 1; B >= 0; B--) {
                    if (this.f59567C.m25198A(B) != null) {
                        viewGroup += this.f59567C.m25198A(B).m25195A().intValue();
                    }
                }
            }
            int i2 = viewGroup > null ? 0 : 8;
            if (("numeric".equals(AnonymousClass0E6.C(AnonymousClass0CC.RL)) ? AnonymousClass539.NUMERIC : AnonymousClass539.DOT) == AnonymousClass539.NUMERIC) {
                CharSequence string;
                if (viewGroup <= 9) {
                    string = anonymousClass53A.f59557B.getContext().getString(C0164R.string.notification_count, new Object[]{Integer.valueOf(viewGroup)});
                } else {
                    string = anonymousClass53A.f59557B.getContext().getString(C0164R.string.notification_count_9_plus);
                }
                anonymousClass53A.f59557B.setText(string);
                anonymousClass53A.f59557B.setVisibility(i2);
                anonymousClass53A.f59558C.setVisibility(8);
            } else {
                anonymousClass53A.f59557B.setVisibility(8);
                anonymousClass53A.f59558C.setVisibility(i2);
            }
        }
        return F;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        switch (AnonymousClass53C.m25633D(this, i).ordinal()) {
            case 0:
                AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) getItem(i);
                if (anonymousClass0Ci.equals(this.f59572H)) {
                    this.f59568D.vf(anonymousClass0Ci);
                    AnonymousClass3VD.D(AnonymousClass3VD.f41732C, "action_click_current_user", i);
                    AnonymousClass3VD.C();
                } else {
                    this.f59568D.Hg(anonymousClass0Ci);
                    AnonymousClass3VD.D(AnonymousClass3VD.f41732C, "action_click_logged_in_user", i);
                    AnonymousClass3VD.C();
                }
                this.f59571G = anonymousClass0Ci;
                break;
            case 1:
                AnonymousClass0IF.G(this.f59566B, this.f59573I, null, false);
                AnonymousClass3VD.D(AnonymousClass3VD.f41732C, "action_click_add_account", i);
                AnonymousClass3VD.C();
                break;
            case 2:
                AnonymousClass3VD.D(AnonymousClass3VD.f41732C, "action_click_header", i);
                AnonymousClass3VD.C();
                break;
            case 3:
                this.f59568D.rf((AnonymousClass4qb) getItem(i));
                AnonymousClass3VD.D(AnonymousClass3VD.f41732C, "action_click_family_account", i);
                AnonymousClass3VD.C();
                break;
            default:
                break;
        }
        if (this.f59574J) {
            AnonymousClass53C.m25637H(this.f59572H.getId(), this.f59570F, adapterView, i);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        if (this.f59574J) {
            AnonymousClass53C.m25637H(this.f59572H.getId(), this.f59570F, adapterView, adapterView.getSelectedItemPosition());
        }
    }
}
