package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.List;

/* renamed from: X.15d */
public final class AnonymousClass15d {
    /* renamed from: B */
    public static final AnonymousClass0e5 f14333B = AnonymousClass0e5.m6188B(5.0d, 10.0d);

    /* renamed from: B */
    public static void m9325B(AnonymousClass15I anonymousClass15I, AnonymousClass0P7 anonymousClass0P7, List list, AnonymousClass0QI anonymousClass0QI, float f, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci) {
        if (list == null) {
            return;
        }
        if (!list.isEmpty()) {
            AnonymousClass0ZF D = AnonymousClass1dZ.m12221D(list);
            if (D != null) {
                AnonymousClass160 A = D.m5343A();
                if (anonymousClass15I.f14252B == null) {
                    ViewGroup viewGroup = (ViewGroup) anonymousClass15I.f14258H.inflate();
                    anonymousClass15I.f14252B = viewGroup;
                    anonymousClass15I.f14255E = (ImageView) viewGroup.findViewById(C0164R.id.poll_image_view);
                    anonymousClass15I.f14262L = anonymousClass15I.f14252B.findViewById(C0164R.id.touch_views_container);
                    anonymousClass15I.f14254D = anonymousClass15I.f14252B.findViewById(C0164R.id.first_option_touch_view);
                    anonymousClass15I.f14261K = anonymousClass15I.f14252B.findViewById(C0164R.id.second_option_touch_view);
                    anonymousClass15I.f14253C = anonymousClass15I.m9301A(anonymousClass15I.f14254D);
                    anonymousClass15I.f14260J = anonymousClass15I.m9301A(anonymousClass15I.f14261K);
                }
                anonymousClass15I.f14256F = D;
                anonymousClass15I.f14252B.setVisibility(0);
                anonymousClass15I.f14257G = anonymousClass0P7;
                anonymousClass15I.f14263M = anonymousClass0QI;
                List list2 = A.f14398E;
                AnonymousClass1Ay anonymousClass1Ay = (AnonymousClass1Ay) list2.get(0);
                AnonymousClass1Ay anonymousClass1Ay2 = (AnonymousClass1Ay) list2.get(1);
                Context context = anonymousClass15I.f14255E.getContext();
                AnonymousClass27V anonymousClass27V = new AnonymousClass27V(context, anonymousClass1Ay.f15351D, anonymousClass1Ay2.f15351D, AnonymousClass0Nm.m3423B(context, anonymousClass1Ay.f15350C), AnonymousClass0Nm.m3423B(context, anonymousClass1Ay2.f15350C));
                anonymousClass27V.f26265C = A.f14395B;
                if (A.f14396C) {
                    anonymousClass27V.f26268F = A.f14397D;
                    anonymousClass27V.f26273K = true;
                }
                boolean z = anonymousClass0P7.eY() && !TextUtils.isEmpty(A.f14399F);
                if (z) {
                    if (anonymousClass15I.f14259I == null) {
                        anonymousClass15I.f14259I = (TextView) ((ViewStub) anonymousClass15I.f14252B.findViewById(C0164R.id.reel_poll_question_text_stub)).inflate();
                    }
                    AnonymousClass5BW.D(anonymousClass15I.f14259I);
                    anonymousClass15I.f14259I.setText(A.f14399F);
                    anonymousClass15I.f14259I.setVisibility(0);
                } else {
                    AnonymousClass0Nm.m3436O(anonymousClass15I.f14259I);
                }
                Drawable anonymousClass162 = new AnonymousClass162(anonymousClass27V);
                anonymousClass15I.f14255E.setImageDrawable(anonymousClass162);
                anonymousClass15I.f14253C.m9102E();
                anonymousClass15I.f14260J.m9102E();
                AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
                Integer Q = AnonymousClass0f2.m6474B(anonymousClass0Cm2).m6482Q(A);
                anonymousClass162.f14423W = Q;
                anonymousClass162.invalidateSelf();
                anonymousClass162.m9359B(AnonymousClass161.m9349D(anonymousClass0Cm2, A));
                if (A.f14400G && Q == null) {
                    anonymousClass15I.f14253C.m9103F(true);
                    anonymousClass15I.f14260J.m9103F(true);
                } else {
                    anonymousClass15I.f14253C.m9103F(false);
                    anonymousClass15I.f14260J.m9103F(false);
                    anonymousClass162.f14422V.m5767L((double) 2);
                }
                float f2 = f;
                if (AnonymousClass0mE.m7519I(anonymousClass15I.f14252B)) {
                    AnonymousClass15d.m9327D(anonymousClass15I, f2, D, z);
                } else {
                    AnonymousClass0Nm.m3442U(anonymousClass15I.f14252B, new AnonymousClass5Cm(anonymousClass15I, f2, D, z));
                }
                if (!anonymousClass0Cm2.m1037B().equals(anonymousClass0Ci) || anonymousClass0P7.eY()) {
                    anonymousClass15I.f14252B.setOnClickListener(null);
                } else {
                    anonymousClass15I.f14252B.setOnClickListener(new AnonymousClass1ZQ(anonymousClass15I));
                }
            }
        }
    }

    /* renamed from: C */
    public static void m9326C(AnonymousClass15I anonymousClass15I, AnonymousClass0Pj anonymousClass0Pj, AnonymousClass0QI anonymousClass0QI, AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass15d.m9325B(anonymousClass15I, anonymousClass0Pj.f4134F, anonymousClass0Pj.m3864N(AnonymousClass15c.POLLING), anonymousClass0QI, anonymousClass0Pj.m3854D(), anonymousClass0Cm, anonymousClass0Pj.f4138J);
    }

    /* renamed from: D */
    public static void m9327D(AnonymousClass15I anonymousClass15I, float f, AnonymousClass0ZF anonymousClass0ZF, boolean z) {
        ViewGroup viewGroup = (ViewGroup) anonymousClass15I.f14252B.getParent();
        AnonymousClass0ZF anonymousClass0ZF2 = anonymousClass0ZF;
        if (z) {
            View view = anonymousClass15I.f14252B;
            View view2 = anonymousClass15I.f14262L;
            View view3 = anonymousClass15I.f14259I;
            int width = viewGroup.getWidth();
            int height = viewGroup.getHeight();
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(C0164R.dimen.reel_poll_question_text_padding);
            LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
            int height2 = view.getHeight();
            if (layoutParams.bottomMargin <= 0) {
                height2 = view3.getHeight() + (view2.getHeight() + dimensionPixelSize);
                AnonymousClass0Nm.m3444W(view3, view2.getHeight() + dimensionPixelSize);
            }
            Rect rect = new Rect();
            AnonymousClass15n.m9337D(anonymousClass0ZF, width, height, f, rect);
            width = view2.getWidth();
            float width2 = ((float) rect.width()) / ((float) width);
            float height3 = (float) view2.getHeight();
            float height4 = ((float) rect.height()) / height3;
            float exactCenterX = rect.exactCenterX() - (((float) view.getWidth()) / 2.0f);
            float exactCenterY = rect.exactCenterY();
            float f2 = ((float) height2) - (height3 / 2.0f);
            exactCenterY -= f2;
            if (((int) exactCenterY) + height2 > height) {
                exactCenterY = (float) (height - height2);
            }
            view.setX(exactCenterX);
            view.setY(exactCenterY);
            view.setScaleX(width2);
            view.setScaleY(height4);
            view.setPivotX(((float) view.getWidth()) / 2.0f);
            view.setPivotY(f2);
            view.setRotation(anonymousClass0ZF.yQ() * 360.0f);
            return;
        }
        AnonymousClass1dZ.m12222E(anonymousClass15I.f14252B, anonymousClass0ZF2, viewGroup.getWidth(), viewGroup.getHeight(), f, null);
    }
}
