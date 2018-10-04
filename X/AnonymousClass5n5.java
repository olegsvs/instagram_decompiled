package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.follow.chaining.FollowChainingButton;
import com.instagram.user.follow.FollowButton;
import java.util.List;

/* renamed from: X.5n5 */
public final class AnonymousClass5n5 {
    /* renamed from: B */
    public static boolean m28437B(List list) {
        return (list == null || list.isEmpty() != null) ? null : true;
    }

    /* renamed from: C */
    public static void m28438C(AnonymousClass5n4 anonymousClass5n4, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci, boolean z, AnonymousClass3P8 anonymousClass3P8, List list, AnonymousClass0la anonymousClass0la, Context context, AnonymousClass0EE anonymousClass0EE, AnonymousClass1fo anonymousClass1fo, boolean z2, boolean z3, AnonymousClass0P7 anonymousClass0P7) {
        AnonymousClass5n4 anonymousClass5n42 = anonymousClass5n4;
        View view = anonymousClass5n4.f68982K;
        if (view != null) {
            view.setVisibility(8);
        }
        AnonymousClass0Ci anonymousClass0Ci2 = anonymousClass0Ci;
        Context context2 = context;
        if (anonymousClass0Ci != null) {
            anonymousClass5n4.f68984M.setText(AnonymousClass3nt.B(anonymousClass0Ci.hB));
            anonymousClass5n4.f68977F.setText(AnonymousClass3nt.C(anonymousClass0Ci.f1752u));
            anonymousClass5n4.f68979H.setText(AnonymousClass3nt.B(anonymousClass0Ci.f1753v));
            AnonymousClass1fo anonymousClass1fo2 = anonymousClass1fo;
            if (z) {
                anonymousClass5n42.f68985N.setOnClickListener(new AnonymousClass5n0(anonymousClass1fo2));
                anonymousClass5n42.f68976E.setOnClickListener(new AnonymousClass5n1(anonymousClass1fo2));
                anonymousClass5n42.f68978G.setOnClickListener(new AnonymousClass5n2(anonymousClass1fo2));
            }
            anonymousClass5n42.f68975D.setVisibility(8);
            anonymousClass5n42.f68975D.setOnClickListener(null);
            anonymousClass5n42.f68973B.setVisibility(8);
            anonymousClass5n42.f68973B.setOnClickListener(null);
            AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
            Object obj = (!AnonymousClass0Cd.f1698B.N() || AnonymousClass0Co.D(anonymousClass0Cm, anonymousClass0Ci)) ? null : 1;
            if (obj != null) {
                FollowButton followButton = anonymousClass5n42.f68975D;
                followButton.setShouldShowFollowBack(true);
                followButton.setVisibility(0);
                followButton.setFollowButtonSize(AnonymousClass5n5.m28439D(anonymousClass0Cm, anonymousClass0Ci) ? AnonymousClass19U.CONDENSED : AnonymousClass19U.FULL);
                LayoutParams layoutParams = (LayoutParams) followButton.getLayoutParams();
                if (AnonymousClass5n5.m28439D(anonymousClass0Cm, anonymousClass0Ci)) {
                    layoutParams.width = context2.getResources().getDimensionPixelSize(C0164R.dimen.follow_button_condensed_width);
                    layoutParams.weight = 0.0f;
                } else {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                }
                followButton.setLayoutParams(layoutParams);
                followButton.B(anonymousClass0Cm2, anonymousClass0Ci2, anonymousClass1fo2, anonymousClass0P7, null, false);
                if (AnonymousClass5n5.m28439D(anonymousClass0Cm2, anonymousClass0Ci2)) {
                    anonymousClass5n42.m28435A().setVisibility(0);
                    anonymousClass5n42.m28435A().setOnClickListener(new AnonymousClass5mz(anonymousClass1fo2));
                } else {
                    AnonymousClass0Nm.O(anonymousClass5n42.f68980I);
                }
                OnClickListener onClickListener = null;
                AnonymousClass3P8 anonymousClass3P82 = anonymousClass3P8;
                List list2 = list;
                if (z3) {
                    Object obj2;
                    AnonymousClass0Lq Q;
                    FollowChainingButton followChainingButton;
                    boolean z4;
                    if (!anonymousClass0Ci2.e()) {
                        if (!AnonymousClass5n5.m28437B(list2)) {
                            obj2 = null;
                            if (obj2 != null) {
                                Q = AnonymousClass0er.B(anonymousClass0Cm2).Q(anonymousClass0Ci2);
                                anonymousClass5n42.f68973B.setVisibility(0);
                                followChainingButton = anonymousClass5n42.f68973B;
                                if (Q != AnonymousClass0Lq.FollowStatusFollowing) {
                                    if (Q == AnonymousClass0Lq.FollowStatusRequested) {
                                        z4 = false;
                                        followChainingButton.A(anonymousClass3P82, z4);
                                        followChainingButton = anonymousClass5n42.f68973B;
                                        if (anonymousClass3P82 != AnonymousClass3P8.Loading) {
                                            onClickListener = new AnonymousClass5mx(anonymousClass1fo2);
                                        }
                                        followChainingButton.setOnClickListener(onClickListener);
                                        if (!z3 && anonymousClass3P82 == AnonymousClass3P8.Open && AnonymousClass5n5.m28437B(list2)) {
                                            if (anonymousClass5n42.f68988Q.getChildCount() == 0) {
                                                anonymousClass5n42.f68988Q.addView(AnonymousClass3PH.C(context2, anonymousClass5n42.f68988Q, anonymousClass5n42.f68973B, anonymousClass0la));
                                            }
                                            AnonymousClass3PH.B(context2, anonymousClass0Cm2, (AnonymousClass3PG) anonymousClass5n42.f68988Q.getChildAt(0).getTag(), new AnonymousClass45q(anonymousClass0Cm2, anonymousClass0EE, anonymousClass1fo2, anonymousClass0Ci2.getId(), AnonymousClass3mP.PROFILE, false), list2, null, null, null, null, null);
                                            anonymousClass5n42.f68988Q.setVisibility(0);
                                        } else {
                                            anonymousClass5n42.f68988Q.setVisibility(8);
                                        }
                                        return;
                                    }
                                }
                                z4 = true;
                                followChainingButton.A(anonymousClass3P82, z4);
                                followChainingButton = anonymousClass5n42.f68973B;
                                if (anonymousClass3P82 != AnonymousClass3P8.Loading) {
                                    onClickListener = new AnonymousClass5mx(anonymousClass1fo2);
                                }
                                followChainingButton.setOnClickListener(onClickListener);
                                if (!z3) {
                                }
                                anonymousClass5n42.f68988Q.setVisibility(8);
                                return;
                            }
                        }
                    }
                    obj2 = 1;
                    if (obj2 != null) {
                        Q = AnonymousClass0er.B(anonymousClass0Cm2).Q(anonymousClass0Ci2);
                        anonymousClass5n42.f68973B.setVisibility(0);
                        followChainingButton = anonymousClass5n42.f68973B;
                        if (Q != AnonymousClass0Lq.FollowStatusFollowing) {
                            if (Q == AnonymousClass0Lq.FollowStatusRequested) {
                                z4 = false;
                                followChainingButton.A(anonymousClass3P82, z4);
                                followChainingButton = anonymousClass5n42.f68973B;
                                if (anonymousClass3P82 != AnonymousClass3P8.Loading) {
                                    onClickListener = new AnonymousClass5mx(anonymousClass1fo2);
                                }
                                followChainingButton.setOnClickListener(onClickListener);
                                if (!z3) {
                                }
                                anonymousClass5n42.f68988Q.setVisibility(8);
                                return;
                            }
                        }
                        z4 = true;
                        followChainingButton.A(anonymousClass3P82, z4);
                        followChainingButton = anonymousClass5n42.f68973B;
                        if (anonymousClass3P82 != AnonymousClass3P8.Loading) {
                            onClickListener = new AnonymousClass5mx(anonymousClass1fo2);
                        }
                        followChainingButton.setOnClickListener(onClickListener);
                        if (!z3) {
                        }
                        anonymousClass5n42.f68988Q.setVisibility(8);
                        return;
                    }
                }
                anonymousClass5n42.f68973B.setVisibility(8);
                anonymousClass5n42.f68973B.setOnClickListener(null);
                if (!z3) {
                }
                anonymousClass5n42.f68988Q.setVisibility(8);
                return;
            }
            if (anonymousClass0Ci.i()) {
                if (anonymousClass5n42.f68986O == null) {
                    anonymousClass5n42.f68986O = (TitleTextView) anonymousClass5n42.f68987P.inflate();
                }
                if (((Boolean) AnonymousClass0CC.rZ.H(anonymousClass0Cm)).booleanValue()) {
                    anonymousClass5n42.f68986O.setText(anonymousClass5n42.f68989R.getContext().getString(C0164R.string.promotions));
                }
                TitleTextView titleTextView = anonymousClass5n42.f68986O;
                titleTextView.setVisibility(0);
                titleTextView.setOnClickListener(new AnonymousClass5n3(anonymousClass0Cm, anonymousClass1fo2));
            }
            TextView textView = anonymousClass5n42.f68974C;
            textView.setVisibility(0);
            String str = null;
            if (anonymousClass0Ci.s()) {
                int C = AnonymousClass0Ca.C(context2, C0164R.color.orange_5);
                Drawable E = AnonymousClass0Ca.E(context2, C0164R.drawable.exclamation_tintable);
                E.setColorFilter(AnonymousClass0ca.B(C));
                textView.setCompoundDrawablesWithIntrinsicBounds(null, null, E, null);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            if (anonymousClass0Ci.i()) {
                str = "profile_header_button";
            }
            textView.setOnClickListener(new AnonymousClass5my(anonymousClass1fo2, str));
            return;
        }
        CharSequence charSequence = "-";
        anonymousClass5n4.f68984M.setText(charSequence);
        anonymousClass5n4.f68977F.setText(charSequence);
        anonymousClass5n4.f68979H.setText(charSequence);
        if (z2) {
            anonymousClass5n4.m28436B().setVisibility(0);
            anonymousClass5n4.m28436B().getBackground().setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(context2, C0164R.color.grey_5)));
        }
    }

    /* renamed from: D */
    public static boolean m28439D(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci) {
        return AnonymousClass0er.B(anonymousClass0Cm).Q(anonymousClass0Ci).equals(AnonymousClass0Lq.FollowStatusFollowing);
    }
}
