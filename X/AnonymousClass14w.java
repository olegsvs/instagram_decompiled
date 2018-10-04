package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.14w */
public final class AnonymousClass14w {
    /* renamed from: B */
    public static void m9266B(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass14p anonymousClass14p, AnonymousClass14t anonymousClass14t, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass14s anonymousClass14s, int i, int i2, boolean z, AnonymousClass0QM anonymousClass0QM, AnonymousClass0Qf anonymousClass0Qf, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass14w.m9270F(anonymousClass0Cm, anonymousClass14p, anonymousClass14t, anonymousClass0Pj, anonymousClass14s, i, i2, z, anonymousClass0QM, anonymousClass0Qf, anonymousClass0EE.getModuleName());
        anonymousClass0QM.yAA(anonymousClass14p, anonymousClass14t, anonymousClass0Pj);
    }

    /* renamed from: C */
    public static void m9267C(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass14p anonymousClass14p, AnonymousClass14t anonymousClass14t, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass0Qf anonymousClass0Qf, int i, int i2, boolean z) {
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        AnonymousClass14w.m9270F(anonymousClass0Cm, anonymousClass14p, anonymousClass14t, anonymousClass0Pj, new AnonymousClass14s(), i3, i4, z2, new AnonymousClass150(), anonymousClass0Qf, "reel_animator");
    }

    /* renamed from: D */
    public static SpannableStringBuilder m9268D(AnonymousClass0Pj anonymousClass0Pj, AnonymousClass14s anonymousClass14s, AnonymousClass0QM anonymousClass0QM, Context context, AnonymousClass0Cm anonymousClass0Cm) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (anonymousClass0Pj.m3862L() != null) {
            CharSequence spannableString = new SpannableString(anonymousClass0Pj.m3856F());
            spannableString.setSpan(new ForegroundColorSpan(-1), 0, spannableString.length(), 0);
            spannableString.setSpan(new AnonymousClass0yF(), 0, spannableString.length(), 0);
            spannableStringBuilder.append(anonymousClass0Pj.m3871U());
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append(spannableString);
            spannableStringBuilder.setSpan(new AnonymousClass1ZJ(anonymousClass0QM, anonymousClass0Pj), 0, spannableStringBuilder.length(), 0);
        } else {
            spannableStringBuilder.append(anonymousClass0Pj.m3871U());
        }
        if (AnonymousClass3gB.C(anonymousClass0Pj, ((Double) AnonymousClass0CC.Ah.m846H(anonymousClass0Cm)).doubleValue())) {
            spannableStringBuilder.append(" • ");
            if (anonymousClass14s.f14096X) {
                spannableStringBuilder.append(AnonymousClass0dw.m6137E((long) (anonymousClass14s.f14074B - (anonymousClass14s.f14074B * anonymousClass14s.f14090R))));
            } else {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.reel_play_icon_size);
                Drawable E = AnonymousClass0Ca.m939E(context, C0164R.drawable.play_icon);
                E.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                spannableStringBuilder.append("  ");
                spannableStringBuilder.setSpan(new AnonymousClass2JU(E), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append("  ");
                spannableStringBuilder.append(context.getString(C0164R.string.enable_long_video_label));
                spannableStringBuilder.setSpan(new AnonymousClass5Dr(anonymousClass14s, anonymousClass0QM, anonymousClass0Pj), 0, spannableStringBuilder.length(), 0);
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: E */
    public static View m9269E(Context context, ViewGroup viewGroup, AnonymousClass0p8 anonymousClass0p8, AnonymousClass0ag anonymousClass0ag, AnonymousClass0Cm anonymousClass0Cm) {
        LayoutInflater from = LayoutInflater.from(context);
        context = null;
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(C0164R.layout.layout_sponsored_reel_item, viewGroup, false);
        AnonymousClass14p anonymousClass14p = new AnonymousClass14p(viewGroup2);
        anonymousClass14p.f14032N.setShowNoSpaceProgressBar(((Boolean) AnonymousClass0CC.ff.m846H(anonymousClass0Cm)).booleanValue());
        viewGroup = anonymousClass14p.f14032N;
        if (!AnonymousClass0e8.m6200D(anonymousClass14p.f14032N.getContext()) && ((Boolean) AnonymousClass0CC.df.m846H(anonymousClass0Cm)).booleanValue()) {
            context = true;
        }
        viewGroup.m9284C(context, ((Integer) AnonymousClass0CC.ef.m846H(anonymousClass0Cm)).intValue(), ((Integer) AnonymousClass0CC.cf.m846H(anonymousClass0Cm)).intValue());
        if (anonymousClass0p8 != null) {
            anonymousClass14p.f14022D.setImageRenderer(anonymousClass0p8);
        }
        if (anonymousClass0ag != null) {
            anonymousClass14p.f14022D.setProgressiveImageConfig(anonymousClass0ag);
        }
        viewGroup2.setTag(anonymousClass14p);
        return viewGroup2;
    }

    /* renamed from: F */
    private static void m9270F(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass14p anonymousClass14p, AnonymousClass14t anonymousClass14t, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass14s anonymousClass14s, int i, int i2, boolean z, AnonymousClass0QM anonymousClass0QM, AnonymousClass0Qf anonymousClass0Qf, String str) {
        boolean z2;
        int i3;
        View view;
        AnonymousClass14p anonymousClass14p2 = anonymousClass14p;
        anonymousClass14p2.f14021C.setVisibility(4);
        anonymousClass14p2.f14047c.setVisibility(8);
        AnonymousClass14t anonymousClass14t2 = anonymousClass14t;
        anonymousClass14p2.f14037S = anonymousClass14t2;
        AnonymousClass0QM anonymousClass0QM2 = anonymousClass0QM;
        anonymousClass14p2.f14024F = anonymousClass0QM2;
        anonymousClass14p2.f14036R.setListener(anonymousClass0QM2);
        anonymousClass14p2.f14036R.m9300A(0.0f, null);
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        anonymousClass14p2.f14046b = anonymousClass0Cm2;
        AnonymousClass14s anonymousClass14s2 = anonymousClass14s;
        if (!(anonymousClass14p2.f14034P == null || anonymousClass14p2.f14034P == anonymousClass14s2)) {
            anonymousClass14p2.f14034P.m9234B(anonymousClass14p2);
        }
        if (anonymousClass14p2.f14031M.f14252B != null) {
            anonymousClass14p2.f14031M.f14252B.setVisibility(8);
        }
        anonymousClass14p2.f14049e.m5931D(AnonymousClass0gV.m6626B(anonymousClass0Cm2).ET().m6668B("ig_zero_rating_data_banner") ? 0 : 8);
        AnonymousClass0Pj anonymousClass0Pj2 = anonymousClass0Pj;
        if (anonymousClass0Pj2.f4138J == null) {
            anonymousClass14p2.f14020B.setVisibility(8);
        } else {
            anonymousClass14p2.f14020B.setVisibility(0);
            AnonymousClass0Qf anonymousClass0Qf2 = anonymousClass0Qf;
            Resources resources = anonymousClass14p2.f14042X.getResources();
            AnonymousClass0Zc H = anonymousClass14p2.f14037S.m9245H();
            z2 = true;
            Object obj = (H.gT() == AnonymousClass0Zd.USER && anonymousClass0Pj2.f4138J.equals(H.pT()) && anonymousClass0Pj2.m3888l() && anonymousClass0Pj2.f4134F.MA().m1029t()) ? 1 : null;
            if (obj != null) {
                anonymousClass14p2.f14042X.setText(anonymousClass0Pj2.f4134F.LA());
            } else {
                obj = (anonymousClass0Pj2.f4137I == AnonymousClass17B.MEDIA && anonymousClass0Pj2.f4134F.DB()) ? 1 : null;
                if (obj != null) {
                    anonymousClass14p2.f14042X.setText(anonymousClass0Pj2.f4134F.m3752H());
                } else if (AnonymousClass0Gk.m1867S(anonymousClass0Pj2.f4134F)) {
                    anonymousClass14p2.f14042X.setText(anonymousClass0Pj2.f4134F.MA().m1003T());
                } else {
                    anonymousClass14p2.f14042X.setText(H.getName());
                }
            }
            if (H.gT() != AnonymousClass0Zd.USER || !H.pT().m1030u() || !anonymousClass0Qf2.m4040C()) {
                z2 = false;
            }
            AnonymousClass15G.m9297E(anonymousClass14p2.f14042X, z2, 0, resources.getDimensionPixelSize(C0164R.dimen.reel_username_right_offset), -1);
            anonymousClass14p2.f14040V.setOnClickListener(new AnonymousClass5Do(anonymousClass0QM2, anonymousClass14p2, anonymousClass0Pj2));
            if (anonymousClass0Pj2.m3886j()) {
                anonymousClass14p2.f14039U.setVisibility(8);
            } else if (anonymousClass0Qf2.m4041D()) {
                anonymousClass14p2.f14039U.setMovementMethod(LinkMovementMethod.getInstance());
                i3 = 0;
                anonymousClass14p2.f14039U.setHighlightColor(0);
                anonymousClass14p2.f14039U.setText(AnonymousClass14w.m9268D(anonymousClass0Pj2, anonymousClass14s2, anonymousClass0QM2, anonymousClass14p2.f14039U.getContext(), anonymousClass14p2.f14046b));
                if (((Boolean) AnonymousClass0CC.wg.m845G()).booleanValue() && anonymousClass14p2.f14037S.m9244G().size() == 1) {
                    TextView textView = anonymousClass14p2.f14039U;
                    if (!anonymousClass14s2.f14091S) {
                        i3 = 8;
                    }
                    textView.setVisibility(i3);
                } else {
                    anonymousClass14p2.f14039U.setVisibility(0);
                }
            }
            anonymousClass14p2.f14029K.setSource(anonymousClass0Qf2.m4038A());
            anonymousClass14p2.f14029K.setUrl(anonymousClass14t2.m9239B());
            anonymousClass14p2.f14029K.setOnClickListener(new AnonymousClass5Dp(anonymousClass0QM2, anonymousClass14p2, anonymousClass0Pj2));
        }
        AnonymousClass5Ca anonymousClass5Ca = anonymousClass14p2.f14038T;
        MediaFrameLayout mediaFrameLayout = anonymousClass14p2.f14026H;
        View view2 = anonymousClass14p2.f14022D;
        View rS = anonymousClass14p2.rS();
        AnonymousClass0MI anonymousClass0MI = anonymousClass14t2.f14103H;
        AnonymousClass0Pj anonymousClass0Pj3 = anonymousClass0Pj2;
        MediaFrameLayout mediaFrameLayout2 = mediaFrameLayout;
        boolean equals = anonymousClass0Pj2.equals(anonymousClass5Ca.f61113F);
        anonymousClass5Ca.f61113F = anonymousClass0Pj2;
        if (!equals) {
            mediaFrameLayout.setTranslationY(0.0f);
            mediaFrameLayout.setAspectRatio(-1.0f);
            view = anonymousClass5Ca.f61109B;
            if (view != null) {
                view.setVisibility(8);
            }
            TextView textView2 = anonymousClass5Ca.f61115H;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            anonymousClass5Ca.f61111D = null;
            anonymousClass5Ca.f61112E = null;
            if (anonymousClass0Pj3.m3854D() >= 0.79f) {
                int i4;
                AnonymousClass3aj anonymousClass3aj;
                int i5;
                Drawable gradientDrawable;
                MediaFrameLayout mediaFrameLayout3;
                ClickableSpan anonymousClass5CV;
                ClickableSpan anonymousClass5CW;
                int dimensionPixelSize;
                int dimensionPixelSize2;
                View view3;
                View view4;
                AnonymousClass5BV anonymousClass5BV;
                double doubleValue;
                boolean booleanValue;
                int intValue;
                Context context;
                AnonymousClass0P7 anonymousClass0P7;
                AnonymousClass0P7 anonymousClass0P72;
                AnonymousClass0SK anonymousClass0SK;
                Context context2;
                int L;
                int C;
                int i6;
                float f;
                double d;
                int i7;
                AnonymousClass0qI anonymousClass0qI;
                AnonymousClass0qJ A;
                Layout E;
                int C2;
                boolean z3;
                CharSequence charSequence;
                Context context3;
                float f2;
                int i8;
                AnonymousClass0qJ anonymousClass0qJ;
                Layout C3;
                int i9;
                int D;
                int lineCount;
                float f3;
                Layout G;
                CharSequence text;
                int D2;
                int C4;
                AnonymousClass59B anonymousClass59B;
                AnonymousClass5Ce anonymousClass5Ce;
                AnonymousClass1R9 anonymousClass1R9;
                LayoutParams layoutParams;
                ValueAnimator ofInt;
                float f4;
                Context context4 = mediaFrameLayout.getContext();
                int J = AnonymousClass0Nm.m3431J(context4);
                int L2 = (int) (((float) J) / anonymousClass0Pj2.f4134F.m3756L());
                int I = AnonymousClass0Nm.m3430I(context4);
                int dimensionPixelSize3 = context4.getResources().getDimensionPixelSize(C0164R.dimen.sponsored_reel_landscape_top_bottom_padding);
                if (!anonymousClass0Pj3.m3882f()) {
                    if (!anonymousClass0Pj3.m3877a()) {
                        i4 = dimensionPixelSize3;
                        if (anonymousClass0Pj3.m3862L() != null) {
                            i4 += context4.getResources().getDimensionPixelSize(C0164R.dimen.sponsored_political_ad_banner_height);
                        }
                        if ((anonymousClass14s2.f14082J == null ? 1 : null) == null) {
                            anonymousClass14s2.f14082J = new AnonymousClass3aj();
                        }
                        anonymousClass3aj = anonymousClass14s2.f14082J;
                        anonymousClass3aj.f42496Q = anonymousClass5Ca;
                        anonymousClass5Ca.f61112E = anonymousClass3aj;
                        anonymousClass3aj.f42497R = I;
                        i5 = I - L2;
                        if (i5 >= i4 + dimensionPixelSize3) {
                            if (anonymousClass5Ca.f61109B == null) {
                                anonymousClass5Ca.f61109B = anonymousClass5Ca.f61110C.inflate();
                            }
                            anonymousClass5Ca.f61109B.setVisibility(0);
                            gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{Color.parseColor(anonymousClass0Pj2.f4134F.m3790t()), Color.parseColor(anonymousClass0Pj2.f4134F.m3789s())});
                            gradientDrawable.setCornerRadius(0.0f);
                            anonymousClass5Ca.f61109B.setBackground(gradientDrawable);
                            mediaFrameLayout3 = mediaFrameLayout2;
                            mediaFrameLayout3.setAspectRatio(anonymousClass0Pj3.m3854D());
                            anonymousClass3aj.f42497R = L2;
                            anonymousClass3aj.f42498S = J;
                            anonymousClass3aj.f42499T = AnonymousClass0Nm.m3428G(context4).density;
                            anonymousClass3aj.f42500U = I;
                            anonymousClass3aj.f42501V = J;
                            anonymousClass3aj.f42495P = false;
                            if (anonymousClass0Pj2.f4134F.SA()) {
                                mediaFrameLayout3.setTranslationY((float) (i5 / 2));
                            } else {
                                anonymousClass5CV = new AnonymousClass5CV(anonymousClass0QM2, anonymousClass0MI, anonymousClass0Pj2, anonymousClass3aj, anonymousClass5Ca);
                                anonymousClass5CW = new AnonymousClass5CW(anonymousClass0QM2, anonymousClass0MI, anonymousClass0Pj2, anonymousClass3aj, anonymousClass5Ca);
                                dimensionPixelSize = context4.getResources().getDimensionPixelSize(C0164R.dimen.sponsored_reel_landscape_block_padding);
                                dimensionPixelSize2 = context4.getResources().getDimensionPixelSize(C0164R.dimen.sponsored_reel_landscape_text_padding);
                                if (anonymousClass5Ca.f61115H == null) {
                                    anonymousClass5Ca.f61115H = (TextView) anonymousClass5Ca.f61116I.inflate();
                                    anonymousClass5Ca.f61114G = new AnonymousClass5Ce(anonymousClass5Ca.f61115H);
                                }
                                anonymousClass5Ca.f61115H.setVisibility(0);
                                i3 = (int) (((float) ((int) AnonymousClass0Nm.m3424C(anonymousClass5Ca.f61115H.getContext(), anonymousClass0Pj2.f4134F.f4028c.f4912f.intValue()))) * 0.12f);
                                view3 = anonymousClass5Ca.f61115H;
                                AnonymousClass5BW.D(view3);
                                AnonymousClass2KB.B(view3, (float) dimensionPixelSize2);
                                view3.setGravity(8388611);
                                AnonymousClass0Nm.m3453f(view3, i3);
                                AnonymousClass0Nm.m3448a(view3, i3);
                                AnonymousClass0Nm.m3449b(view3, dimensionPixelSize2);
                                AnonymousClass0Nm.m3451d(view3, dimensionPixelSize2);
                                if (VERSION.SDK_INT >= 23) {
                                    view3.setBreakStrategy(0);
                                }
                                view3.setTextSize(1, (float) anonymousClass0Pj2.f4134F.f4028c.f4912f.intValue());
                                view3.setTextColor(Color.parseColor(anonymousClass0Pj2.f4134F.f4028c.f4911e));
                                view3.setHighlightColor(0);
                                anonymousClass5Ca.f61115H.setOnTouchListener(new AnonymousClass5CZ(new GestureDetector(anonymousClass5Ca.f61115H.getContext(), new AnonymousClass5CY(anonymousClass5Ca, anonymousClass0QM2, new AnonymousClass15k(anonymousClass5Ca.f61115H.getContext()), anonymousClass0MI, anonymousClass0Pj2)), anonymousClass5Ca, anonymousClass0QM2));
                                if (AnonymousClass3OP.f40741B == null) {
                                    AnonymousClass3OP.f40741B = new AnonymousClass3OP();
                                }
                                view3.setMovementMethod(AnonymousClass3OP.f40741B);
                                view4 = anonymousClass5Ca.f61115H;
                                anonymousClass5BV = new AnonymousClass5BV(anonymousClass0QM2, rS, view2, anonymousClass0Pj2);
                                doubleValue = ((Double) AnonymousClass0CC.zg.m846H(anonymousClass0Cm2)).doubleValue();
                                booleanValue = ((Boolean) AnonymousClass0CC.xg.m846H(anonymousClass0Cm2)).booleanValue();
                                intValue = ((Integer) AnonymousClass0CC.yg.m846H(anonymousClass0Cm2)).intValue();
                                context = view4.getContext();
                                anonymousClass0P7 = anonymousClass0Pj2.f4134F;
                                anonymousClass0P72 = anonymousClass0P7;
                                anonymousClass0SK = anonymousClass0P7.f4028c;
                                context2 = context;
                                L2 = AnonymousClass0Nm.m3431J(context2);
                                i3 = AnonymousClass0Nm.m3430I(context2);
                                L = (int) (((float) L2) / anonymousClass0P72.m3756L());
                                L2 -= dimensionPixelSize2 * 2;
                                C = (int) AnonymousClass0Nm.m3424C(context, anonymousClass0SK.f4912f.intValue());
                                i6 = C;
                                f = ((float) C) * 0.12f;
                                d = (double) i3;
                                Double.isNaN(d);
                                J = (int) (d * doubleValue);
                                i7 = i3 - i4;
                                C = ((i7 - dimensionPixelSize3) - dimensionPixelSize) - L;
                                dimensionPixelSize2 = ((i3 - dimensionPixelSize3) - i4) - (dimensionPixelSize * 4);
                                anonymousClass0qI = new AnonymousClass0qI();
                                anonymousClass0qI.f10899E = view4.getPaint();
                                anonymousClass0qI.f10900F = L2;
                                anonymousClass0qI.f10896B = false;
                                A = anonymousClass0qI.m7924A();
                                E = AnonymousClass59C.E(i6, A, anonymousClass0SK, new SpannableStringBuilder(anonymousClass0SK.f4910d));
                                f *= 2.0f;
                                C2 = AnonymousClass2Jb.C(E) + Math.round(f);
                                z3 = true;
                                charSequence = null;
                                if (anonymousClass0P72.m3756L() > 1.0f) {
                                    context3 = context;
                                    if ((C - C2) / 2 >= dimensionPixelSize || ((booleanValue || AnonymousClass2Jb.C(E) > J) && (!booleanValue || E.getLineCount() > intValue))) {
                                        f2 = ((float) (C - (dimensionPixelSize * 2))) - f;
                                        dimensionPixelSize3 += dimensionPixelSize;
                                        i8 = i6;
                                        anonymousClass0qJ = A;
                                        C3 = AnonymousClass59C.C(i8, context3, anonymousClass0qJ, anonymousClass0SK, anonymousClass5CW);
                                        charSequence = C3.getText();
                                        i9 = L2 / 2;
                                        D = i9 - (AnonymousClass2Jb.D(C3) / 2);
                                        if (AnonymousClass2Jb.C(C3) + Math.round(f) > dimensionPixelSize2) {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            dimensionPixelSize2 = Math.round(f) + AnonymousClass2Jb.C(C3);
                                        }
                                        lineCount = C3.getLineCount();
                                        i3 = ((float) dimensionPixelSize2) > f2 ? (dimensionPixelSize3 + L) + ((C - dimensionPixelSize2) / 2) : ((i3 - dimensionPixelSize2) - dimensionPixelSize) - i4;
                                        f3 = (float) J;
                                        J = i6;
                                        G = AnonymousClass59C.G(i8, C3, anonymousClass0qJ, anonymousClass0SK, f2, context3, anonymousClass5CV, f3, booleanValue, intValue);
                                        text = G.getText();
                                        C = C < AnonymousClass2Jb.C(G) ? C - AnonymousClass2Jb.C(G) : 0;
                                        D2 = AnonymousClass2Jb.D(G);
                                        i9 -= D2 / 2;
                                        C4 = AnonymousClass2Jb.C(G) + Math.round(f);
                                        if (AnonymousClass59C.D(G, f2) != 0) {
                                            i7 = (i7 - dimensionPixelSize) - AnonymousClass2Jb.C(G);
                                        } else {
                                            i7 = (dimensionPixelSize3 + L) + (C / 2);
                                        }
                                        L = i7;
                                        anonymousClass59B = new AnonymousClass59B(dimensionPixelSize3, i9, L, C4, D2, D, i3, dimensionPixelSize2, (int) AnonymousClass0Nm.m3440S(context, (float) J), AnonymousClass59C.B(charSequence, Color.parseColor(anonymousClass0SK.f4911e), anonymousClass5BV), AnonymousClass59C.B(text, Color.parseColor(anonymousClass0SK.f4911e), anonymousClass5BV), z3, G.getLineCount(), lineCount);
                                        anonymousClass5Ce = anonymousClass5Ca.f61114G;
                                        anonymousClass1R9 = new AnonymousClass1R9(anonymousClass3aj, anonymousClass5Ca);
                                        C = anonymousClass59B.f60549F - anonymousClass59B.f60555L;
                                        J = anonymousClass59B.f60549F;
                                        L2 = anonymousClass59B.f60545B;
                                        I = anonymousClass59B.f60552I;
                                        layoutParams = (LayoutParams) anonymousClass5Ce.f61126C.getLayoutParams();
                                        ofInt = ValueAnimator.ofInt(new int[]{0, -C});
                                        anonymousClass5Ce.f61127D = ofInt;
                                        ofInt.setDuration(200).addUpdateListener(new AnonymousClass5Cc(anonymousClass5Ce, J, layoutParams, L2));
                                        anonymousClass5Ce.f61127D.addListener(new AnonymousClass5Cd(anonymousClass5Ce, anonymousClass1R9, layoutParams, I));
                                        anonymousClass5Ca.f61111D = anonymousClass59B;
                                        AnonymousClass5Cb.B(anonymousClass5Ca, anonymousClass3aj.f42481B);
                                        mediaFrameLayout2.setTranslationY((float) anonymousClass59B.f60558O);
                                    } else {
                                        J = AnonymousClass59C.F(context3, A, anonymousClass0P72.f4028c, C - (dimensionPixelSize * 2), J, booleanValue, intValue);
                                        float f5 = (float) J;
                                        A.f10904E.setTextSize(f5);
                                        view4.setTextSize(0, f5);
                                        G = AnonymousClass59C.E(J, A, anonymousClass0P72.f4028c, new SpannableStringBuilder(anonymousClass0SK.f4910d));
                                        f5 *= 0.12f;
                                        dimensionPixelSize2 = (int) f5;
                                        AnonymousClass0Nm.m3453f(view4, dimensionPixelSize2);
                                        AnonymousClass0Nm.m3448a(view4, dimensionPixelSize2);
                                        D2 = AnonymousClass2Jb.D(G);
                                        C4 = AnonymousClass2Jb.C(G) + Math.round(f5 * 2.0f);
                                        i9 = (L2 / 2) - (D2 / 2);
                                        dimensionPixelSize3 += dimensionPixelSize;
                                        L = (dimensionPixelSize3 + L) + ((C - C4) / 2);
                                        text = G.getText();
                                        D = 0;
                                        i3 = 0;
                                        dimensionPixelSize2 = 0;
                                        z3 = false;
                                        lineCount = 0;
                                    }
                                } else if ((C - C2) / 3 >= dimensionPixelSize || ((booleanValue || AnonymousClass2Jb.C(E) > J) && (!booleanValue || E.getLineCount() > intValue))) {
                                    f2 = ((float) (C - (dimensionPixelSize * 3))) - f;
                                    i8 = i6;
                                    anonymousClass0qJ = A;
                                    C3 = AnonymousClass59C.C(i8, context, anonymousClass0qJ, anonymousClass0SK, anonymousClass5CW);
                                    charSequence = C3.getText();
                                    i9 = L2 / 2;
                                    D = i9 - (AnonymousClass2Jb.D(C3) / 2);
                                    if (AnonymousClass2Jb.C(C3) + Math.round(f) > dimensionPixelSize2) {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        dimensionPixelSize2 = Math.round(f) + AnonymousClass2Jb.C(C3);
                                    }
                                    lineCount = C3.getLineCount();
                                    i3 = ((i3 - dimensionPixelSize2) - dimensionPixelSize) - i4;
                                    f3 = (float) J;
                                    J = i6;
                                    context3 = context;
                                    f4 = f2;
                                    L2 = 0;
                                    G = AnonymousClass59C.G(i8, C3, anonymousClass0qJ, anonymousClass0SK, f2, context, anonymousClass5CV, f3, booleanValue, intValue);
                                    text = G.getText();
                                    if (C >= AnonymousClass2Jb.C(G)) {
                                        L2 = C - AnonymousClass2Jb.C(G);
                                    }
                                    dimensionPixelSize3 += dimensionPixelSize;
                                    L2 /= 3;
                                    I = dimensionPixelSize3 + L2;
                                    i7 = AnonymousClass59C.D(G, f4) != 0 ? (i7 - dimensionPixelSize) - AnonymousClass2Jb.C(G) : (I + L) + L2;
                                    D2 = AnonymousClass2Jb.D(G);
                                    i9 -= D2 / 2;
                                    C4 = AnonymousClass2Jb.C(G) + Math.round(f);
                                    if (((float) dimensionPixelSize2) > f4) {
                                        i5 = (C - dimensionPixelSize2) / 3;
                                        dimensionPixelSize3 += i5;
                                        i7 = dimensionPixelSize3 + L;
                                        i3 = i7 + i5;
                                        i7 += ((C - i5) - C4) / 2;
                                    } else {
                                        dimensionPixelSize3 = I;
                                    }
                                    L = i7;
                                } else {
                                    J = AnonymousClass59C.F(context, A, anonymousClass0P72.f4028c, C - (dimensionPixelSize * 3), J, booleanValue, intValue);
                                    float f6 = (float) J;
                                    A.f10904E.setTextSize(f6);
                                    view4.setTextSize(0, f6);
                                    G = AnonymousClass59C.E(J, A, anonymousClass0P72.f4028c, new SpannableStringBuilder(anonymousClass0SK.f4910d));
                                    f6 *= 0.12f;
                                    i3 = (int) f6;
                                    AnonymousClass0Nm.m3453f(view4, i3);
                                    AnonymousClass0Nm.m3448a(view4, i3);
                                    C4 = AnonymousClass2Jb.C(G) + Math.round(f6 * 2.0f);
                                    D2 = AnonymousClass2Jb.D(G);
                                    i9 = (L2 / 2) - (D2 / 2);
                                    C = (C - C4) / 3;
                                    dimensionPixelSize3 = (dimensionPixelSize3 + dimensionPixelSize) + C;
                                    L = (L + dimensionPixelSize3) + C;
                                    text = G.getText();
                                    D = 0;
                                    i3 = 0;
                                    dimensionPixelSize2 = 0;
                                    z3 = false;
                                    lineCount = 0;
                                    anonymousClass59B = new AnonymousClass59B(dimensionPixelSize3, i9, L, C4, D2, D, i3, dimensionPixelSize2, (int) AnonymousClass0Nm.m3440S(context, (float) J), AnonymousClass59C.B(charSequence, Color.parseColor(anonymousClass0SK.f4911e), anonymousClass5BV), AnonymousClass59C.B(text, Color.parseColor(anonymousClass0SK.f4911e), anonymousClass5BV), z3, G.getLineCount(), lineCount);
                                    anonymousClass5Ce = anonymousClass5Ca.f61114G;
                                    anonymousClass1R9 = new AnonymousClass1R9(anonymousClass3aj, anonymousClass5Ca);
                                    C = anonymousClass59B.f60549F - anonymousClass59B.f60555L;
                                    J = anonymousClass59B.f60549F;
                                    L2 = anonymousClass59B.f60545B;
                                    I = anonymousClass59B.f60552I;
                                    layoutParams = (LayoutParams) anonymousClass5Ce.f61126C.getLayoutParams();
                                    ofInt = ValueAnimator.ofInt(new int[]{0, -C});
                                    anonymousClass5Ce.f61127D = ofInt;
                                    ofInt.setDuration(200).addUpdateListener(new AnonymousClass5Cc(anonymousClass5Ce, J, layoutParams, L2));
                                    anonymousClass5Ce.f61127D.addListener(new AnonymousClass5Cd(anonymousClass5Ce, anonymousClass1R9, layoutParams, I));
                                    anonymousClass5Ca.f61111D = anonymousClass59B;
                                    AnonymousClass5Cb.B(anonymousClass5Ca, anonymousClass3aj.f42481B);
                                    mediaFrameLayout2.setTranslationY((float) anonymousClass59B.f60558O);
                                }
                                context = context3;
                                anonymousClass59B = new AnonymousClass59B(dimensionPixelSize3, i9, L, C4, D2, D, i3, dimensionPixelSize2, (int) AnonymousClass0Nm.m3440S(context, (float) J), AnonymousClass59C.B(charSequence, Color.parseColor(anonymousClass0SK.f4911e), anonymousClass5BV), AnonymousClass59C.B(text, Color.parseColor(anonymousClass0SK.f4911e), anonymousClass5BV), z3, G.getLineCount(), lineCount);
                                anonymousClass5Ce = anonymousClass5Ca.f61114G;
                                anonymousClass1R9 = new AnonymousClass1R9(anonymousClass3aj, anonymousClass5Ca);
                                C = anonymousClass59B.f60549F - anonymousClass59B.f60555L;
                                J = anonymousClass59B.f60549F;
                                L2 = anonymousClass59B.f60545B;
                                I = anonymousClass59B.f60552I;
                                layoutParams = (LayoutParams) anonymousClass5Ce.f61126C.getLayoutParams();
                                ofInt = ValueAnimator.ofInt(new int[]{0, -C});
                                anonymousClass5Ce.f61127D = ofInt;
                                ofInt.setDuration(200).addUpdateListener(new AnonymousClass5Cc(anonymousClass5Ce, J, layoutParams, L2));
                                anonymousClass5Ce.f61127D.addListener(new AnonymousClass5Cd(anonymousClass5Ce, anonymousClass1R9, layoutParams, I));
                                anonymousClass5Ca.f61111D = anonymousClass59B;
                                AnonymousClass5Cb.B(anonymousClass5Ca, anonymousClass3aj.f42481B);
                                mediaFrameLayout2.setTranslationY((float) anonymousClass59B.f60558O);
                            }
                        }
                    }
                }
                i4 = context4.getResources().getDimensionPixelSize(C0164R.dimen.sponsored_reel_landscape_bottom_padding_with_cta);
                if (anonymousClass0Pj3.m3862L() != null) {
                    i4 += context4.getResources().getDimensionPixelSize(C0164R.dimen.sponsored_political_ad_banner_height);
                }
                if (anonymousClass14s2.f14082J == null) {
                }
                if ((anonymousClass14s2.f14082J == null ? 1 : null) == null) {
                    anonymousClass14s2.f14082J = new AnonymousClass3aj();
                }
                anonymousClass3aj = anonymousClass14s2.f14082J;
                anonymousClass3aj.f42496Q = anonymousClass5Ca;
                anonymousClass5Ca.f61112E = anonymousClass3aj;
                anonymousClass3aj.f42497R = I;
                i5 = I - L2;
                if (i5 >= i4 + dimensionPixelSize3) {
                    if (anonymousClass5Ca.f61109B == null) {
                        anonymousClass5Ca.f61109B = anonymousClass5Ca.f61110C.inflate();
                    }
                    anonymousClass5Ca.f61109B.setVisibility(0);
                    gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{Color.parseColor(anonymousClass0Pj2.f4134F.m3790t()), Color.parseColor(anonymousClass0Pj2.f4134F.m3789s())});
                    gradientDrawable.setCornerRadius(0.0f);
                    anonymousClass5Ca.f61109B.setBackground(gradientDrawable);
                    mediaFrameLayout3 = mediaFrameLayout2;
                    mediaFrameLayout3.setAspectRatio(anonymousClass0Pj3.m3854D());
                    anonymousClass3aj.f42497R = L2;
                    anonymousClass3aj.f42498S = J;
                    anonymousClass3aj.f42499T = AnonymousClass0Nm.m3428G(context4).density;
                    anonymousClass3aj.f42500U = I;
                    anonymousClass3aj.f42501V = J;
                    anonymousClass3aj.f42495P = false;
                    if (anonymousClass0Pj2.f4134F.SA()) {
                        mediaFrameLayout3.setTranslationY((float) (i5 / 2));
                    } else {
                        anonymousClass5CV = new AnonymousClass5CV(anonymousClass0QM2, anonymousClass0MI, anonymousClass0Pj2, anonymousClass3aj, anonymousClass5Ca);
                        anonymousClass5CW = new AnonymousClass5CW(anonymousClass0QM2, anonymousClass0MI, anonymousClass0Pj2, anonymousClass3aj, anonymousClass5Ca);
                        dimensionPixelSize = context4.getResources().getDimensionPixelSize(C0164R.dimen.sponsored_reel_landscape_block_padding);
                        dimensionPixelSize2 = context4.getResources().getDimensionPixelSize(C0164R.dimen.sponsored_reel_landscape_text_padding);
                        if (anonymousClass5Ca.f61115H == null) {
                            anonymousClass5Ca.f61115H = (TextView) anonymousClass5Ca.f61116I.inflate();
                            anonymousClass5Ca.f61114G = new AnonymousClass5Ce(anonymousClass5Ca.f61115H);
                        }
                        anonymousClass5Ca.f61115H.setVisibility(0);
                        i3 = (int) (((float) ((int) AnonymousClass0Nm.m3424C(anonymousClass5Ca.f61115H.getContext(), anonymousClass0Pj2.f4134F.f4028c.f4912f.intValue()))) * 0.12f);
                        view3 = anonymousClass5Ca.f61115H;
                        AnonymousClass5BW.D(view3);
                        AnonymousClass2KB.B(view3, (float) dimensionPixelSize2);
                        view3.setGravity(8388611);
                        AnonymousClass0Nm.m3453f(view3, i3);
                        AnonymousClass0Nm.m3448a(view3, i3);
                        AnonymousClass0Nm.m3449b(view3, dimensionPixelSize2);
                        AnonymousClass0Nm.m3451d(view3, dimensionPixelSize2);
                        if (VERSION.SDK_INT >= 23) {
                            view3.setBreakStrategy(0);
                        }
                        view3.setTextSize(1, (float) anonymousClass0Pj2.f4134F.f4028c.f4912f.intValue());
                        view3.setTextColor(Color.parseColor(anonymousClass0Pj2.f4134F.f4028c.f4911e));
                        view3.setHighlightColor(0);
                        anonymousClass5Ca.f61115H.setOnTouchListener(new AnonymousClass5CZ(new GestureDetector(anonymousClass5Ca.f61115H.getContext(), new AnonymousClass5CY(anonymousClass5Ca, anonymousClass0QM2, new AnonymousClass15k(anonymousClass5Ca.f61115H.getContext()), anonymousClass0MI, anonymousClass0Pj2)), anonymousClass5Ca, anonymousClass0QM2));
                        if (AnonymousClass3OP.f40741B == null) {
                            AnonymousClass3OP.f40741B = new AnonymousClass3OP();
                        }
                        view3.setMovementMethod(AnonymousClass3OP.f40741B);
                        view4 = anonymousClass5Ca.f61115H;
                        anonymousClass5BV = new AnonymousClass5BV(anonymousClass0QM2, rS, view2, anonymousClass0Pj2);
                        doubleValue = ((Double) AnonymousClass0CC.zg.m846H(anonymousClass0Cm2)).doubleValue();
                        booleanValue = ((Boolean) AnonymousClass0CC.xg.m846H(anonymousClass0Cm2)).booleanValue();
                        intValue = ((Integer) AnonymousClass0CC.yg.m846H(anonymousClass0Cm2)).intValue();
                        context = view4.getContext();
                        anonymousClass0P7 = anonymousClass0Pj2.f4134F;
                        anonymousClass0P72 = anonymousClass0P7;
                        anonymousClass0SK = anonymousClass0P7.f4028c;
                        context2 = context;
                        L2 = AnonymousClass0Nm.m3431J(context2);
                        i3 = AnonymousClass0Nm.m3430I(context2);
                        L = (int) (((float) L2) / anonymousClass0P72.m3756L());
                        L2 -= dimensionPixelSize2 * 2;
                        C = (int) AnonymousClass0Nm.m3424C(context, anonymousClass0SK.f4912f.intValue());
                        i6 = C;
                        f = ((float) C) * 0.12f;
                        d = (double) i3;
                        Double.isNaN(d);
                        J = (int) (d * doubleValue);
                        i7 = i3 - i4;
                        C = ((i7 - dimensionPixelSize3) - dimensionPixelSize) - L;
                        dimensionPixelSize2 = ((i3 - dimensionPixelSize3) - i4) - (dimensionPixelSize * 4);
                        anonymousClass0qI = new AnonymousClass0qI();
                        anonymousClass0qI.f10899E = view4.getPaint();
                        anonymousClass0qI.f10900F = L2;
                        anonymousClass0qI.f10896B = false;
                        A = anonymousClass0qI.m7924A();
                        E = AnonymousClass59C.E(i6, A, anonymousClass0SK, new SpannableStringBuilder(anonymousClass0SK.f4910d));
                        f *= 2.0f;
                        C2 = AnonymousClass2Jb.C(E) + Math.round(f);
                        z3 = true;
                        charSequence = null;
                        if (anonymousClass0P72.m3756L() > 1.0f) {
                            context3 = context;
                            if ((C - C2) / 2 >= dimensionPixelSize) {
                            }
                            f2 = ((float) (C - (dimensionPixelSize * 2))) - f;
                            dimensionPixelSize3 += dimensionPixelSize;
                            i8 = i6;
                            anonymousClass0qJ = A;
                            C3 = AnonymousClass59C.C(i8, context3, anonymousClass0qJ, anonymousClass0SK, anonymousClass5CW);
                            charSequence = C3.getText();
                            i9 = L2 / 2;
                            D = i9 - (AnonymousClass2Jb.D(C3) / 2);
                            if (AnonymousClass2Jb.C(C3) + Math.round(f) > dimensionPixelSize2) {
                                z3 = false;
                            }
                            if (z3) {
                                dimensionPixelSize2 = Math.round(f) + AnonymousClass2Jb.C(C3);
                            }
                            lineCount = C3.getLineCount();
                            if (((float) dimensionPixelSize2) > f2) {
                            }
                            f3 = (float) J;
                            J = i6;
                            G = AnonymousClass59C.G(i8, C3, anonymousClass0qJ, anonymousClass0SK, f2, context3, anonymousClass5CV, f3, booleanValue, intValue);
                            text = G.getText();
                            if (C < AnonymousClass2Jb.C(G)) {
                            }
                            D2 = AnonymousClass2Jb.D(G);
                            i9 -= D2 / 2;
                            C4 = AnonymousClass2Jb.C(G) + Math.round(f);
                            if (AnonymousClass59C.D(G, f2) != 0) {
                                i7 = (dimensionPixelSize3 + L) + (C / 2);
                            } else {
                                i7 = (i7 - dimensionPixelSize) - AnonymousClass2Jb.C(G);
                            }
                            L = i7;
                            anonymousClass59B = new AnonymousClass59B(dimensionPixelSize3, i9, L, C4, D2, D, i3, dimensionPixelSize2, (int) AnonymousClass0Nm.m3440S(context, (float) J), AnonymousClass59C.B(charSequence, Color.parseColor(anonymousClass0SK.f4911e), anonymousClass5BV), AnonymousClass59C.B(text, Color.parseColor(anonymousClass0SK.f4911e), anonymousClass5BV), z3, G.getLineCount(), lineCount);
                            anonymousClass5Ce = anonymousClass5Ca.f61114G;
                            anonymousClass1R9 = new AnonymousClass1R9(anonymousClass3aj, anonymousClass5Ca);
                            C = anonymousClass59B.f60549F - anonymousClass59B.f60555L;
                            J = anonymousClass59B.f60549F;
                            L2 = anonymousClass59B.f60545B;
                            I = anonymousClass59B.f60552I;
                            layoutParams = (LayoutParams) anonymousClass5Ce.f61126C.getLayoutParams();
                            ofInt = ValueAnimator.ofInt(new int[]{0, -C});
                            anonymousClass5Ce.f61127D = ofInt;
                            ofInt.setDuration(200).addUpdateListener(new AnonymousClass5Cc(anonymousClass5Ce, J, layoutParams, L2));
                            anonymousClass5Ce.f61127D.addListener(new AnonymousClass5Cd(anonymousClass5Ce, anonymousClass1R9, layoutParams, I));
                            anonymousClass5Ca.f61111D = anonymousClass59B;
                            AnonymousClass5Cb.B(anonymousClass5Ca, anonymousClass3aj.f42481B);
                            mediaFrameLayout2.setTranslationY((float) anonymousClass59B.f60558O);
                        } else {
                            if ((C - C2) / 3 >= dimensionPixelSize) {
                            }
                            f2 = ((float) (C - (dimensionPixelSize * 3))) - f;
                            i8 = i6;
                            anonymousClass0qJ = A;
                            C3 = AnonymousClass59C.C(i8, context, anonymousClass0qJ, anonymousClass0SK, anonymousClass5CW);
                            charSequence = C3.getText();
                            i9 = L2 / 2;
                            D = i9 - (AnonymousClass2Jb.D(C3) / 2);
                            if (AnonymousClass2Jb.C(C3) + Math.round(f) > dimensionPixelSize2) {
                                z3 = false;
                            }
                            if (z3) {
                                dimensionPixelSize2 = Math.round(f) + AnonymousClass2Jb.C(C3);
                            }
                            lineCount = C3.getLineCount();
                            i3 = ((i3 - dimensionPixelSize2) - dimensionPixelSize) - i4;
                            f3 = (float) J;
                            J = i6;
                            context3 = context;
                            f4 = f2;
                            L2 = 0;
                            G = AnonymousClass59C.G(i8, C3, anonymousClass0qJ, anonymousClass0SK, f2, context, anonymousClass5CV, f3, booleanValue, intValue);
                            text = G.getText();
                            if (C >= AnonymousClass2Jb.C(G)) {
                                L2 = C - AnonymousClass2Jb.C(G);
                            }
                            dimensionPixelSize3 += dimensionPixelSize;
                            L2 /= 3;
                            I = dimensionPixelSize3 + L2;
                            if (AnonymousClass59C.D(G, f4) != 0) {
                            }
                            D2 = AnonymousClass2Jb.D(G);
                            i9 -= D2 / 2;
                            C4 = AnonymousClass2Jb.C(G) + Math.round(f);
                            if (((float) dimensionPixelSize2) > f4) {
                                dimensionPixelSize3 = I;
                            } else {
                                i5 = (C - dimensionPixelSize2) / 3;
                                dimensionPixelSize3 += i5;
                                i7 = dimensionPixelSize3 + L;
                                i3 = i7 + i5;
                                i7 += ((C - i5) - C4) / 2;
                            }
                            L = i7;
                        }
                        context = context3;
                        anonymousClass59B = new AnonymousClass59B(dimensionPixelSize3, i9, L, C4, D2, D, i3, dimensionPixelSize2, (int) AnonymousClass0Nm.m3440S(context, (float) J), AnonymousClass59C.B(charSequence, Color.parseColor(anonymousClass0SK.f4911e), anonymousClass5BV), AnonymousClass59C.B(text, Color.parseColor(anonymousClass0SK.f4911e), anonymousClass5BV), z3, G.getLineCount(), lineCount);
                        anonymousClass5Ce = anonymousClass5Ca.f61114G;
                        anonymousClass1R9 = new AnonymousClass1R9(anonymousClass3aj, anonymousClass5Ca);
                        C = anonymousClass59B.f60549F - anonymousClass59B.f60555L;
                        J = anonymousClass59B.f60549F;
                        L2 = anonymousClass59B.f60545B;
                        I = anonymousClass59B.f60552I;
                        layoutParams = (LayoutParams) anonymousClass5Ce.f61126C.getLayoutParams();
                        ofInt = ValueAnimator.ofInt(new int[]{0, -C});
                        anonymousClass5Ce.f61127D = ofInt;
                        ofInt.setDuration(200).addUpdateListener(new AnonymousClass5Cc(anonymousClass5Ce, J, layoutParams, L2));
                        anonymousClass5Ce.f61127D.addListener(new AnonymousClass5Cd(anonymousClass5Ce, anonymousClass1R9, layoutParams, I));
                        anonymousClass5Ca.f61111D = anonymousClass59B;
                        AnonymousClass5Cb.B(anonymousClass5Ca, anonymousClass3aj.f42481B);
                        mediaFrameLayout2.setTranslationY((float) anonymousClass59B.f60558O);
                    }
                }
            }
        }
        if (anonymousClass0Pj2.m3886j()) {
            anonymousClass14p2.f14033O = null;
            anonymousClass14p2.f14034P = null;
            anonymousClass14p2.f14022D.setVisibility(0);
            anonymousClass14p2.f14022D.m7587D();
            anonymousClass14p2.f14032N.setProgress(0.0f);
            anonymousClass14p2.f14032N.setVisibility(8);
        } else {
            boolean equals2 = anonymousClass0Pj2.equals(anonymousClass14p2.f14033O);
            anonymousClass14p2.f14033O = anonymousClass0Pj2;
            anonymousClass14s2.m9233A(anonymousClass14p2);
            anonymousClass14p2.f14034P = anonymousClass14s2;
            Context context5 = anonymousClass14p2.f14022D.getContext();
            AnonymousClass0vS.m8330D(anonymousClass14p2.f14027I);
            if ((anonymousClass14s2.f14082J != null ? 1 : null) != null) {
                anonymousClass14p2.f14027I.f12071B = (int) (((float) ((int) (((float) AnonymousClass0Nm.m3431J(context5)) / anonymousClass0Pj2.f4134F.m3756L()))) * 0.15f);
            } else {
                anonymousClass14p2.f14027I.f12071B = (anonymousClass0Pj2.m3882f() ? context5.getResources().getDimensionPixelSize(C0164R.dimen.sponsored_reel_landscape_bottom_padding_with_cta) : 0) + (anonymousClass0Pj2.m3862L() != null ? context5.getResources().getDimensionPixelSize(C0164R.dimen.sponsored_political_ad_banner_height) : 0);
            }
            anonymousClass14p2.f14022D.setVisibility(0);
            if (equals2) {
                anonymousClass0QM2.XGA(true, anonymousClass0Pj2, anonymousClass14s2);
            } else {
                anonymousClass14s2.f14078F = false;
                anonymousClass14p2.f14022D.setMiniPreviewPayload(anonymousClass0Pj2.m3860J());
                String str2 = str;
                anonymousClass14p2.f14022D.m7588E(C0164R.id.listener_id_for_reel_image_load, new AnonymousClass5Dq(anonymousClass0Pj2, str2, anonymousClass14s2, anonymousClass0QM2));
                anonymousClass14p2.f14022D.setSource(str2);
                if (anonymousClass0Pj2.m3888l()) {
                    AnonymousClass3pJ.D(anonymousClass0Pj2.f4134F, str2);
                }
                if (anonymousClass0Pj2.m3888l() && anonymousClass0Pj2.f4134F.YA()) {
                    anonymousClass14p2.f14022D.setUrl(anonymousClass0Pj2.f4134F.mB.toString());
                } else if (anonymousClass0Pj2.m3888l()) {
                    anonymousClass14p2.f14022D.setUrlWithFallback(anonymousClass0Pj2.m3869S(context5), anonymousClass0Pj2.m3873W(), str2);
                } else {
                    anonymousClass14p2.f14022D.setUrl(anonymousClass0Pj2.m3869S(context5));
                }
            }
            anonymousClass0QM2.VGA(anonymousClass0Pj2);
            anonymousClass14p2.f14036R.m9300A(anonymousClass0Pj2.m3854D(), anonymousClass0Pj2.m3863M());
            if (anonymousClass0Pj2.m3888l()) {
                AnonymousClass15d.m9326C(anonymousClass14p2.f14031M, anonymousClass0Pj2, anonymousClass0QM2, anonymousClass0Cm2);
                AnonymousClass5Ck anonymousClass5Ck = anonymousClass14p2.f14030L;
                if (anonymousClass0Pj2.eY() && anonymousClass0Qf.m4041D() && anonymousClass0Pj2.m3862L() != null) {
                    if (anonymousClass5Ck.f61139C == null) {
                        ViewGroup viewGroup = (ViewGroup) anonymousClass5Ck.f61138B.inflate();
                        anonymousClass5Ck.f61139C = viewGroup;
                        anonymousClass5Ck.f61140D = (TextView) viewGroup.findViewById(C0164R.id.banner_text);
                    }
                    anonymousClass5Ck.f61139C.setVisibility(0);
                    CharSequence spannableString = new SpannableString(anonymousClass0Pj2.m3862L());
                    spannableString.setSpan(new AnonymousClass0yF(), 0, spannableString.length(), 0);
                    anonymousClass5Ck.f61140D.setText(spannableString);
                    anonymousClass5Ck.f61139C.setOnClickListener(new AnonymousClass1R8(anonymousClass0QM2, anonymousClass0Pj2));
                } else {
                    AnonymousClass0Nm.m3436O(anonymousClass5Ck.f61139C);
                }
            }
            anonymousClass14p2.f14032N.setSegments(i);
            anonymousClass14p2.f14032N.m9283B(i2, false, anonymousClass14t2.m9242E());
            anonymousClass14p2.f14032N.setVisibility(0);
        }
        boolean z4 = true;
        if (anonymousClass14p2.f14037S.m9251N()) {
            anonymousClass14p2.f14025G.setVisibility(0);
            anonymousClass14p2.f14022D.setEnableProgressBar(false);
        } else {
            anonymousClass14p2.f14025G.setVisibility(8);
            anonymousClass14p2.f14022D.setEnableProgressBar(true);
        }
        if (((Boolean) AnonymousClass0CC.Cg.m846H(anonymousClass0Cm2)).booleanValue()) {
            if (anonymousClass0Pj2.f4138J != null) {
                if (anonymousClass0Pj2.m3894r()) {
                    if (!anonymousClass0Pj2.f4135G.m3565K()) {
                    }
                }
                anonymousClass14p2.f14044Z.setVisibility(z4 ? 0 : 8);
                anonymousClass14p2.f14044Z.setOnClickListener(new AnonymousClass5Dm(anonymousClass0QM2, anonymousClass14t2, anonymousClass0Pj2));
            }
            z4 = false;
            if (z4) {
            }
            anonymousClass14p2.f14044Z.setVisibility(z4 ? 0 : 8);
            anonymousClass14p2.f14044Z.setOnClickListener(new AnonymousClass5Dm(anonymousClass0QM2, anonymousClass14t2, anonymousClass0Pj2));
        } else {
            anonymousClass14p2.f14044Z.setVisibility(8);
        }
        AnonymousClass156 anonymousClass156 = anonymousClass14p2.f14043Y;
        z2 = anonymousClass0Pj2.m3882f();
        OnClickListener anonymousClass5Ds = new AnonymousClass5Ds(z2, anonymousClass0QM2, anonymousClass0Pj2);
        if (!(anonymousClass156.f14212H == null || anonymousClass156.f14212H == anonymousClass14s2)) {
            anonymousClass156.f14212H.m9234B(anonymousClass156);
        }
        anonymousClass156.f14212H = anonymousClass14s2;
        if (anonymousClass0Pj2.m3886j()) {
            AnonymousClass5Dv.B(anonymousClass156);
        } else {
            spannableString = anonymousClass0Pj2.f4134F.lB;
            AnonymousClass5Dv.B(anonymousClass156);
            anonymousClass156.f14210F.setVisibility(0);
            anonymousClass156.f14212H = anonymousClass14s2;
            anonymousClass14s2.m9233A(anonymousClass156);
            Context context6 = anonymousClass156.f14209E.getContext();
            if (z2) {
                AnonymousClass0w7.m8417D(context6);
                boolean booleanValue2 = ((Boolean) AnonymousClass0CC.f1466c.m845G()).booleanValue();
                String str3 = (String) AnonymousClass0CC.f1465b.m845G();
                anonymousClass156.f14209E.setOnClickListener(anonymousClass5Ds);
                anonymousClass156.f14215K.setOnClickListener(anonymousClass5Ds);
                anonymousClass156.f14216L.setOnClickListener(anonymousClass5Ds);
                anonymousClass156.f14209E.setText(spannableString);
                anonymousClass156.f14209E.setTextColor(-1);
                anonymousClass156.f14209E.setVisibility(0);
                if (booleanValue2) {
                    anonymousClass156.m9289A().setVisibility(0);
                    anonymousClass156.m9289A().setOnClickListener(anonymousClass5Ds);
                    anonymousClass156.m9289A().setText(AnonymousClass3gB.B(anonymousClass0Pj2, context6, str3));
                    if (anonymousClass14s2.f14076D) {
                        anonymousClass156.VJ().m9342C();
                    }
                }
                if (anonymousClass14s2.f14076D) {
                    anonymousClass156.f14215K.setVisibility(8);
                    anonymousClass156.f14216L.setVisibility(0);
                } else {
                    anonymousClass156.f14215K.setVisibility(0);
                }
                if (anonymousClass156.VJ().f14377J == AnonymousClass1Za.HIDDEN) {
                    anonymousClass156.f14217M.setVisibility(8);
                }
            }
        }
        int i10 = 0;
        Object obj2 = anonymousClass0Pj2.f4138J != null ? 1 : null;
        if (((Boolean) AnonymousClass0CC.Cg.m846H(anonymousClass0Cm2)).booleanValue()) {
            anonymousClass156.f14211G.setVisibility(8);
        } else {
            view = anonymousClass156.f14211G;
            if (obj2 == null) {
                i10 = 8;
            }
            view.setVisibility(i10);
            anonymousClass156.f14211G.setOnClickListener(new AnonymousClass5Dt(anonymousClass0QM2, anonymousClass14t2, anonymousClass0Pj2));
        }
        if (anonymousClass14t2.f14103H.f3370C && anonymousClass0Pj2.m3888l()) {
            OnClickListener anonymousClass5Du = new AnonymousClass5Du(anonymousClass0QM2, anonymousClass0Pj2);
            if (anonymousClass156.f14213I == null) {
                anonymousClass156.f14213I = anonymousClass156.f14214J.inflate();
            }
            anonymousClass156.f14213I.setVisibility(0);
            anonymousClass156.f14213I.setOnClickListener(anonymousClass5Du);
        } else {
            View view5 = anonymousClass156.f14213I;
            if (view5 != null) {
                view5.setVisibility(8);
                anonymousClass156.f14213I.setOnClickListener(null);
            }
        }
        if (!anonymousClass0Pj2.m3887k(anonymousClass0Cm2) || anonymousClass14s2.f14079G) {
            anonymousClass14p2.f14048d.m5931D(8);
            return;
        }
        anonymousClass14p2.f14048d.m5931D(0);
        ((ImageView) anonymousClass14p2.f14048d.m5928A()).setOnClickListener(new AnonymousClass5Dn(anonymousClass14p2, anonymousClass14s2, anonymousClass0QM2, anonymousClass14t2, anonymousClass0Pj2));
    }
}
