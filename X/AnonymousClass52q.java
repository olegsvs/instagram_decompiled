package X;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.List;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.52q */
public final class AnonymousClass52q {
    /* renamed from: B */
    public static void m25623B(Context context, AnonymousClass0Cm anonymousClass0Cm, View view, AnonymousClass0XM anonymousClass0XM, AnonymousClass0Pg anonymousClass0Pg) {
        View C;
        AnonymousClass0lg anonymousClass0lg = anonymousClass0XM.f6156J;
        LinearLayout linearLayout = (LinearLayout) view;
        if (((AnonymousClass52p) linearLayout.getTag()).f59522B != anonymousClass0XM.f6156J) {
            C = AnonymousClass52q.m25624C(context, anonymousClass0XM);
            AnonymousClass52q.m25626E(C, linearLayout, anonymousClass0XM.f6156J);
        } else {
            C = linearLayout.getChildAt(0);
        }
        int C2;
        Object obj;
        switch (anonymousClass0lg.ordinal()) {
            case 1:
                AnonymousClass1Us.B(context, anonymousClass0XM, C, anonymousClass0Pg);
                return;
            case 2:
            case 3:
            case 4:
                AnonymousClass3UO anonymousClass3UO = (AnonymousClass3UO) anonymousClass0XM.f6154H;
                AnonymousClass52b anonymousClass52b = (AnonymousClass52b) C.getTag();
                switch (anonymousClass0XM.f6156J.ordinal()) {
                    case 2:
                        anonymousClass52b.f59478D.setImageResource(C0164R.drawable.share_facebook);
                        break;
                    case 4:
                        anonymousClass52b.f59478D.setImageResource(C0164R.drawable.people_contacts);
                        break;
                    default:
                        break;
                }
                C2 = AnonymousClass0Ca.C(context, C0164R.color.blue_7);
                int C3 = AnonymousClass0Ca.C(context, C0164R.color.blue_5);
                anonymousClass52b.f59478D.getDrawable().mutate().setColorFilter(AnonymousClass0ca.B(C2));
                anonymousClass52b.f59481G.setText(anonymousClass3UO.B());
                anonymousClass52b.f59480F.setText(anonymousClass3UO.f41600C);
                anonymousClass52b.f59476B.getBackground().mutate().setColorFilter(AnonymousClass0ca.B(C3));
                anonymousClass52b.f59476B.setTextColor(C3);
                anonymousClass52b.f59476B.setText(anonymousClass3UO.f41599B.toUpperCase(AnonymousClass0EH.E()));
                anonymousClass52b.f59479E.setOnClickListener(new AnonymousClass52Z(anonymousClass0Pg, anonymousClass0XM));
                anonymousClass52b.f59477C.setOnClickListener(new AnonymousClass52a(anonymousClass0Pg, anonymousClass0XM));
                return;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                if (!"v3".equalsIgnoreCase(((AnonymousClass0lz) anonymousClass0XM.f6154H).f9651N)) {
                    if (!"v2".equalsIgnoreCase(((AnonymousClass0lz) anonymousClass0XM.f6154H).f9651N)) {
                        LayoutParams layoutParams;
                        LinearLayout.LayoutParams layoutParams2;
                        int dimensionPixelSize;
                        float f;
                        AnonymousClass52n.m25620C(context, anonymousClass0XM, C, anonymousClass0Pg);
                        AnonymousClass52m anonymousClass52m = (AnonymousClass52m) C.getTag();
                        String str = ((AnonymousClass0lz) anonymousClass0XM.f6154H).f9644G;
                        if (TextUtils.isEmpty(str)) {
                            str = "bottom";
                        }
                        int hashCode = str.hashCode();
                        if (hashCode != -1383228885) {
                            if (hashCode == 108511772) {
                                if (str.equals("right")) {
                                    obj = null;
                                    switch (obj) {
                                        case null:
                                            anonymousClass52m.f59515L.setGravity(16);
                                            layoutParams = (LayoutParams) anonymousClass52m.f59520Q.getLayoutParams();
                                            layoutParams.addRule(0, C0164R.id.button_group);
                                            anonymousClass52m.f59520Q.setLayoutParams(layoutParams);
                                            layoutParams = (LayoutParams) anonymousClass52m.f59518O.getLayoutParams();
                                            layoutParams.addRule(0, C0164R.id.button_group);
                                            anonymousClass52m.f59518O.setLayoutParams(layoutParams);
                                            layoutParams = (LayoutParams) anonymousClass52m.f59508E.getLayoutParams();
                                            layoutParams.addRule(3, 0);
                                            layoutParams.addRule(11);
                                            layoutParams.addRule(15);
                                            layoutParams.width = -2;
                                            anonymousClass52m.f59508E.setLayoutParams(layoutParams);
                                            layoutParams2 = (LinearLayout.LayoutParams) anonymousClass52m.f59517N.getLayoutParams();
                                            layoutParams2.topMargin = 0;
                                            anonymousClass52m.f59517N.setLayoutParams(layoutParams2);
                                            layoutParams2 = (LinearLayout.LayoutParams) anonymousClass52m.f59516M.getLayoutParams();
                                            layoutParams2.topMargin = 0;
                                            anonymousClass52m.f59516M.setLayoutParams(layoutParams2);
                                            AnonymousClass0Nm.f(anonymousClass52m.f59508E, 0);
                                            C2 = context.getResources().getDimensionPixelSize(C0164R.dimen.font_medium);
                                            dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.megaphone_button_padding_large);
                                            break;
                                        case 1:
                                            anonymousClass52m.f59515L.setGravity(0);
                                            layoutParams = (LayoutParams) anonymousClass52m.f59520Q.getLayoutParams();
                                            layoutParams.addRule(0, 0);
                                            anonymousClass52m.f59520Q.setLayoutParams(layoutParams);
                                            layoutParams = (LayoutParams) anonymousClass52m.f59518O.getLayoutParams();
                                            layoutParams.addRule(0, 0);
                                            anonymousClass52m.f59518O.setLayoutParams(layoutParams);
                                            layoutParams = (LayoutParams) anonymousClass52m.f59508E.getLayoutParams();
                                            layoutParams.addRule(3, C0164R.id.message);
                                            layoutParams.addRule(11, 0);
                                            layoutParams.addRule(15, 0);
                                            layoutParams.width = -1;
                                            anonymousClass52m.f59508E.setLayoutParams(layoutParams);
                                            C2 = context.getResources().getDimensionPixelSize(C0164R.dimen.megaphone_icon_margin_top);
                                            layoutParams2 = (LinearLayout.LayoutParams) anonymousClass52m.f59517N.getLayoutParams();
                                            layoutParams2.topMargin = C2;
                                            anonymousClass52m.f59517N.setLayoutParams(layoutParams2);
                                            layoutParams2 = (LinearLayout.LayoutParams) anonymousClass52m.f59516M.getLayoutParams();
                                            layoutParams2.topMargin = C2;
                                            anonymousClass52m.f59516M.setLayoutParams(layoutParams2);
                                            AnonymousClass0Nm.f(anonymousClass52m.f59508E, context.getResources().getDimensionPixelSize(C0164R.dimen.row_text_padding));
                                            C2 = context.getResources().getDimensionPixelSize(C0164R.dimen.font_small);
                                            dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.connect_button_padding);
                                            break;
                                        default:
                                            dimensionPixelSize = -1;
                                            C2 = -1;
                                            break;
                                    }
                                    if (C2 != -1) {
                                        f = (float) C2;
                                        anonymousClass52m.f59511H.setTextSize(0, f);
                                        anonymousClass52m.f59513J.setTextSize(0, f);
                                    }
                                    if (dimensionPixelSize != -1) {
                                        anonymousClass52m.f59511H.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                                        anonymousClass52m.f59513J.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                                    }
                                    return;
                                }
                            }
                        } else if (str.equals("bottom")) {
                            obj = 1;
                            switch (obj) {
                                case null:
                                    anonymousClass52m.f59515L.setGravity(16);
                                    layoutParams = (LayoutParams) anonymousClass52m.f59520Q.getLayoutParams();
                                    layoutParams.addRule(0, C0164R.id.button_group);
                                    anonymousClass52m.f59520Q.setLayoutParams(layoutParams);
                                    layoutParams = (LayoutParams) anonymousClass52m.f59518O.getLayoutParams();
                                    layoutParams.addRule(0, C0164R.id.button_group);
                                    anonymousClass52m.f59518O.setLayoutParams(layoutParams);
                                    layoutParams = (LayoutParams) anonymousClass52m.f59508E.getLayoutParams();
                                    layoutParams.addRule(3, 0);
                                    layoutParams.addRule(11);
                                    layoutParams.addRule(15);
                                    layoutParams.width = -2;
                                    anonymousClass52m.f59508E.setLayoutParams(layoutParams);
                                    layoutParams2 = (LinearLayout.LayoutParams) anonymousClass52m.f59517N.getLayoutParams();
                                    layoutParams2.topMargin = 0;
                                    anonymousClass52m.f59517N.setLayoutParams(layoutParams2);
                                    layoutParams2 = (LinearLayout.LayoutParams) anonymousClass52m.f59516M.getLayoutParams();
                                    layoutParams2.topMargin = 0;
                                    anonymousClass52m.f59516M.setLayoutParams(layoutParams2);
                                    AnonymousClass0Nm.f(anonymousClass52m.f59508E, 0);
                                    C2 = context.getResources().getDimensionPixelSize(C0164R.dimen.font_medium);
                                    dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.megaphone_button_padding_large);
                                    break;
                                case 1:
                                    anonymousClass52m.f59515L.setGravity(0);
                                    layoutParams = (LayoutParams) anonymousClass52m.f59520Q.getLayoutParams();
                                    layoutParams.addRule(0, 0);
                                    anonymousClass52m.f59520Q.setLayoutParams(layoutParams);
                                    layoutParams = (LayoutParams) anonymousClass52m.f59518O.getLayoutParams();
                                    layoutParams.addRule(0, 0);
                                    anonymousClass52m.f59518O.setLayoutParams(layoutParams);
                                    layoutParams = (LayoutParams) anonymousClass52m.f59508E.getLayoutParams();
                                    layoutParams.addRule(3, C0164R.id.message);
                                    layoutParams.addRule(11, 0);
                                    layoutParams.addRule(15, 0);
                                    layoutParams.width = -1;
                                    anonymousClass52m.f59508E.setLayoutParams(layoutParams);
                                    C2 = context.getResources().getDimensionPixelSize(C0164R.dimen.megaphone_icon_margin_top);
                                    layoutParams2 = (LinearLayout.LayoutParams) anonymousClass52m.f59517N.getLayoutParams();
                                    layoutParams2.topMargin = C2;
                                    anonymousClass52m.f59517N.setLayoutParams(layoutParams2);
                                    layoutParams2 = (LinearLayout.LayoutParams) anonymousClass52m.f59516M.getLayoutParams();
                                    layoutParams2.topMargin = C2;
                                    anonymousClass52m.f59516M.setLayoutParams(layoutParams2);
                                    AnonymousClass0Nm.f(anonymousClass52m.f59508E, context.getResources().getDimensionPixelSize(C0164R.dimen.row_text_padding));
                                    C2 = context.getResources().getDimensionPixelSize(C0164R.dimen.font_small);
                                    dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.connect_button_padding);
                                    break;
                                default:
                                    dimensionPixelSize = -1;
                                    C2 = -1;
                                    break;
                            }
                            if (C2 != -1) {
                                f = (float) C2;
                                anonymousClass52m.f59511H.setTextSize(0, f);
                                anonymousClass52m.f59513J.setTextSize(0, f);
                            }
                            if (dimensionPixelSize != -1) {
                                anonymousClass52m.f59511H.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                                anonymousClass52m.f59513J.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                            }
                            return;
                        }
                        obj = -1;
                        switch (obj) {
                            case null:
                                anonymousClass52m.f59515L.setGravity(16);
                                layoutParams = (LayoutParams) anonymousClass52m.f59520Q.getLayoutParams();
                                layoutParams.addRule(0, C0164R.id.button_group);
                                anonymousClass52m.f59520Q.setLayoutParams(layoutParams);
                                layoutParams = (LayoutParams) anonymousClass52m.f59518O.getLayoutParams();
                                layoutParams.addRule(0, C0164R.id.button_group);
                                anonymousClass52m.f59518O.setLayoutParams(layoutParams);
                                layoutParams = (LayoutParams) anonymousClass52m.f59508E.getLayoutParams();
                                layoutParams.addRule(3, 0);
                                layoutParams.addRule(11);
                                layoutParams.addRule(15);
                                layoutParams.width = -2;
                                anonymousClass52m.f59508E.setLayoutParams(layoutParams);
                                layoutParams2 = (LinearLayout.LayoutParams) anonymousClass52m.f59517N.getLayoutParams();
                                layoutParams2.topMargin = 0;
                                anonymousClass52m.f59517N.setLayoutParams(layoutParams2);
                                layoutParams2 = (LinearLayout.LayoutParams) anonymousClass52m.f59516M.getLayoutParams();
                                layoutParams2.topMargin = 0;
                                anonymousClass52m.f59516M.setLayoutParams(layoutParams2);
                                AnonymousClass0Nm.f(anonymousClass52m.f59508E, 0);
                                C2 = context.getResources().getDimensionPixelSize(C0164R.dimen.font_medium);
                                dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.megaphone_button_padding_large);
                                break;
                            case 1:
                                anonymousClass52m.f59515L.setGravity(0);
                                layoutParams = (LayoutParams) anonymousClass52m.f59520Q.getLayoutParams();
                                layoutParams.addRule(0, 0);
                                anonymousClass52m.f59520Q.setLayoutParams(layoutParams);
                                layoutParams = (LayoutParams) anonymousClass52m.f59518O.getLayoutParams();
                                layoutParams.addRule(0, 0);
                                anonymousClass52m.f59518O.setLayoutParams(layoutParams);
                                layoutParams = (LayoutParams) anonymousClass52m.f59508E.getLayoutParams();
                                layoutParams.addRule(3, C0164R.id.message);
                                layoutParams.addRule(11, 0);
                                layoutParams.addRule(15, 0);
                                layoutParams.width = -1;
                                anonymousClass52m.f59508E.setLayoutParams(layoutParams);
                                C2 = context.getResources().getDimensionPixelSize(C0164R.dimen.megaphone_icon_margin_top);
                                layoutParams2 = (LinearLayout.LayoutParams) anonymousClass52m.f59517N.getLayoutParams();
                                layoutParams2.topMargin = C2;
                                anonymousClass52m.f59517N.setLayoutParams(layoutParams2);
                                layoutParams2 = (LinearLayout.LayoutParams) anonymousClass52m.f59516M.getLayoutParams();
                                layoutParams2.topMargin = C2;
                                anonymousClass52m.f59516M.setLayoutParams(layoutParams2);
                                AnonymousClass0Nm.f(anonymousClass52m.f59508E, context.getResources().getDimensionPixelSize(C0164R.dimen.row_text_padding));
                                C2 = context.getResources().getDimensionPixelSize(C0164R.dimen.font_small);
                                dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.connect_button_padding);
                                break;
                            default:
                                dimensionPixelSize = -1;
                                C2 = -1;
                                break;
                        }
                        if (C2 != -1) {
                            f = (float) C2;
                            anonymousClass52m.f59511H.setTextSize(0, f);
                            anonymousClass52m.f59513J.setTextSize(0, f);
                        }
                        if (dimensionPixelSize != -1) {
                            anonymousClass52m.f59511H.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                            anonymousClass52m.f59513J.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                        }
                        return;
                    }
                }
                AnonymousClass52n.m25620C(context, anonymousClass0XM, C, anonymousClass0Pg);
                return;
            case 10:
                AnonymousClass40v anonymousClass40v = (AnonymousClass40v) anonymousClass0XM.f6154H;
                if (!anonymousClass40v.f48363B.isEmpty()) {
                    AnonymousClass3Kj anonymousClass3Kj = new AnonymousClass3Kj(anonymousClass0Cm, context);
                    if (!anonymousClass3Kj.f40218B && anonymousClass3Kj.f40219C == null) {
                        anonymousClass3Kj.f40218B = true;
                        AnonymousClass0GA D = AnonymousClass1fh.D(anonymousClass3Kj.f40220D);
                        D.f2849B = new AnonymousClass3Ki(anonymousClass3Kj);
                        AnonymousClass0Ix.D(D);
                    }
                    AnonymousClass52X anonymousClass52X = (AnonymousClass52X) C.getTag();
                    List list = anonymousClass40v.f48363B;
                    AnonymousClass3Kk anonymousClass3Kk = (AnonymousClass3Kk) list.get(0);
                    boolean A = anonymousClass3Kj.A(anonymousClass3Kk.f40222B);
                    AnonymousClass0nJ anonymousClass0nJ = (AnonymousClass52U) anonymousClass52X.f59468F.getAdapter();
                    if (anonymousClass0nJ == null) {
                        anonymousClass0nJ = new AnonymousClass52U(context, list, anonymousClass0Pg, anonymousClass3Kj);
                    }
                    obj = 1;
                    if (list.size() != 1) {
                        obj = null;
                    }
                    if (obj != null) {
                        TextView textView;
                        anonymousClass52X.f59468F.setVisibility(8);
                        anonymousClass52X.f59467E.setUrl(anonymousClass3Kk.f40226F);
                        anonymousClass52X.f59471I.setText(anonymousClass3Kk.f40228H);
                        anonymousClass52X.f59469G.setText(anonymousClass3Kk.f40227G);
                        anonymousClass52X.f59464B.setText(anonymousClass3Kk.f40223C);
                        anonymousClass52X.f59465C.setUrl(anonymousClass3Kk.f40224D);
                        anonymousClass52X.f59466D.setText(anonymousClass3Kk.f40225E);
                        anonymousClass52X.f59464B.setOnClickListener(new AnonymousClass52V(anonymousClass0Pg, anonymousClass3Kk));
                        AnonymousClass52Y.m25618B(anonymousClass52X);
                        int i = 8;
                        if (A) {
                            anonymousClass52X.f59465C.setVisibility(anonymousClass3Kk.f40224D == null ? 8 : 0);
                            textView = anonymousClass52X.f59466D;
                            if (anonymousClass3Kk.f40225E == null) {
                                textView.setVisibility(i);
                            }
                        } else {
                            anonymousClass52X.f59467E.setVisibility(anonymousClass3Kk.f40226F == null ? 8 : 0);
                            anonymousClass52X.f59471I.setVisibility(anonymousClass3Kk.f40228H == null ? 8 : 0);
                            anonymousClass52X.f59469G.setVisibility(anonymousClass3Kk.f40227G == null ? 8 : 0);
                            textView = anonymousClass52X.f59464B;
                            if (anonymousClass3Kk.f40223C == null) {
                                textView.setVisibility(i);
                            }
                        }
                        i = 0;
                        textView.setVisibility(i);
                    } else {
                        AnonymousClass52Y.m25618B(anonymousClass52X);
                        if (anonymousClass0nJ.f59459C.equals(list)) {
                            anonymousClass52X.f59468F.setAdapter(anonymousClass0nJ);
                        } else {
                            anonymousClass0nJ.f59459C = list;
                            anonymousClass0nJ.notifyDataSetChanged();
                        }
                        anonymousClass52X.f59468F.setVisibility(0);
                    }
                    if (!TextUtils.isEmpty(anonymousClass40v.B())) {
                        anonymousClass52X.f59470H.setText(anonymousClass40v.B());
                    }
                    return;
                }
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("no such megaphone type:");
                stringBuilder.append(anonymousClass0lg);
                throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    /* renamed from: C */
    public static View m25624C(Context context, AnonymousClass0XM anonymousClass0XM) {
        View inflate;
        switch (anonymousClass0XM.f6156J.ordinal()) {
            case 1:
                return AnonymousClass1Us.C(context);
            case 2:
            case 3:
            case 4:
                inflate = LayoutInflater.from(context).inflate(C0164R.layout.connect_megaphone, null);
                AnonymousClass52b anonymousClass52b = new AnonymousClass52b();
                anonymousClass52b.f59479E = inflate;
                anonymousClass52b.f59481G = (TextView) inflate.findViewById(C0164R.id.title);
                anonymousClass52b.f59480F = (TextView) inflate.findViewById(C0164R.id.subtitle);
                anonymousClass52b.f59476B = (TextView) inflate.findViewById(C0164R.id.button);
                anonymousClass52b.f59477C = inflate.findViewById(C0164R.id.dismiss_button);
                anonymousClass52b.f59478D = (ImageView) inflate.findViewById(C0164R.id.icon);
                inflate.setTag(anonymousClass52b);
                return inflate;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                if ("v3".equalsIgnoreCase(((AnonymousClass0lz) anonymousClass0XM.f6154H).f9651N)) {
                    return AnonymousClass52n.m25621D(context, C0164R.layout.generic_v3_megaphone);
                }
                if ("v2".equalsIgnoreCase(((AnonymousClass0lz) anonymousClass0XM.f6154H).f9651N)) {
                    return AnonymousClass52n.m25621D(context, C0164R.layout.profile_generic_megaphone);
                }
                return AnonymousClass52n.m25621D(context, C0164R.layout.mainfeed_generic_megaphone);
            case 10:
                inflate = LayoutInflater.from(context).inflate(C0164R.layout.activator_cards_carousel, null);
                AnonymousClass52X anonymousClass52X = new AnonymousClass52X();
                anonymousClass52X.f59468F = (RecyclerView) inflate.findViewById(C0164R.id.activator_cards_carousel_view);
                anonymousClass52X.f59470H = (TextView) inflate.findViewById(C0164R.id.activator_cards_carousel_title);
                anonymousClass52X.f59467E = (CircularImageView) inflate.findViewById(C0164R.id.activator_card_big_image);
                anonymousClass52X.f59471I = (TextView) inflate.findViewById(C0164R.id.activator_card_title);
                anonymousClass52X.f59469G = (TextView) inflate.findViewById(C0164R.id.activator_card_subtitle);
                anonymousClass52X.f59464B = (TextView) inflate.findViewById(C0164R.id.activators_row_single_card_primary_button);
                anonymousClass52X.f59465C = (CircularImageView) inflate.findViewById(C0164R.id.activator_card_confirmation_image);
                anonymousClass52X.f59466D = (TextView) inflate.findViewById(C0164R.id.activator_card_confirmation_message);
                inflate.setTag(anonymousClass52X);
                return inflate;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("no such megaphone type:");
                stringBuilder.append(anonymousClass0XM.f6156J);
                throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    /* renamed from: D */
    public static View m25625D(Context context, AnonymousClass0XM anonymousClass0XM) {
        return AnonymousClass52q.m25626E(AnonymousClass52q.m25624C(context, anonymousClass0XM), new LinearLayout(context), anonymousClass0XM.f6156J);
    }

    /* renamed from: E */
    public static View m25626E(View view, LinearLayout linearLayout, AnonymousClass0lg anonymousClass0lg) {
        linearLayout.removeAllViews();
        linearLayout.setOrientation(1);
        AnonymousClass52p anonymousClass52p = new AnonymousClass52p();
        anonymousClass52p.f59522B = anonymousClass0lg;
        linearLayout.setTag(anonymousClass52p);
        linearLayout.addView(view);
        return linearLayout;
    }
}
