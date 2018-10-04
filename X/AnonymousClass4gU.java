package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.facebook.C0164R;

/* renamed from: X.4gU */
public final class AnonymousClass4gU {
    /* renamed from: B */
    public static AnonymousClass4gT m24759B(Context context) {
        Context context2 = context;
        Context context3 = context2;
        ColorStateList valueOf = ColorStateList.valueOf(AnonymousClass0Ca.C(context2, AnonymousClass0G5.F(context2, C0164R.attr.textColorPrimary)));
        int C = AnonymousClass0Ca.C(context2, AnonymousClass0G5.F(context2, C0164R.attr.textColorSecondary));
        int i = C;
        ColorStateList valueOf2 = ColorStateList.valueOf(C);
        Drawable E = AnonymousClass0Ca.E(context2, C0164R.drawable.rounded_bubble_background_white);
        Drawable E2 = AnonymousClass0Ca.E(context2, C0164R.drawable.rounded_bubble_background_grey);
        Drawable E3 = AnonymousClass0Ca.E(context2, C0164R.drawable.unified_inbox_message_mask);
        Drawable E4 = AnonymousClass0Ca.E(context2, C0164R.drawable.unified_inbox_my_message_mask);
        context = AnonymousClass0Ca.E(context2, C0164R.drawable.direct_expired_tombstone_text_background);
        Context context4 = context;
        int C2 = AnonymousClass0Ca.C(context2, C0164R.color.grey_2);
        int i2 = C2;
        int C3 = AnonymousClass0Ca.C(context2, AnonymousClass0G5.F(context2, C0164R.attr.textColorRegularLink));
        int i3 = C3;
        int i4 = C3;
        int i5 = C3;
        int i6 = C3;
        int i7 = C3;
        int i8 = i7;
        int i9 = i7;
        int i10 = i7;
        int i11 = i7;
        int C4 = AnonymousClass0Ca.C(context2, AnonymousClass0G5.F(context2, C0164R.attr.feedLikeActiveColor));
        int i12 = C4;
        ColorStateList valueOf3 = ColorStateList.valueOf(AnonymousClass0Ca.C(context2, C0164R.color.grey_3));
        int C5 = AnonymousClass0Ca.C(context2, C0164R.color.grey_2);
        return new AnonymousClass4gT(new AnonymousClass4gS(context3, valueOf, valueOf2, i, valueOf3, C5, i7, i8, i9, i10, i11, i12, i2, E2, E4, context4), new AnonymousClass4gS(context2, valueOf, valueOf2, C, valueOf3, C5, C3, i3, i4, i5, i6, C4, C2, E, E3, context), false);
    }

    /* renamed from: C */
    public static AnonymousClass4gT m24760C(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass4gQ anonymousClass4gQ) {
        Context context2 = context;
        if (!AnonymousClass0EF.I(context2)) {
            return AnonymousClass4gU.m24759B(context2);
        }
        AnonymousClass4gQ anonymousClass4gQ2 = anonymousClass4gQ;
        if (anonymousClass4gQ != null && anonymousClass4gQ2.f56241B && ((Boolean) AnonymousClass0CC.CG.H(anonymousClass0Cm)).booleanValue()) {
            Context context3 = context2;
            ColorStateList valueOf = ColorStateList.valueOf(-1);
            ColorStateList valueOf2 = ColorStateList.valueOf(AnonymousClass0Ca.C(context2, AnonymousClass0G5.F(context2, C0164R.attr.textColorPrimary)));
            ColorStateList valueOf3 = ColorStateList.valueOf(-1);
            int C = AnonymousClass0Ca.C(context2, AnonymousClass0G5.F(context2, C0164R.attr.textColorSecondary));
            ColorStateList valueOf4 = ColorStateList.valueOf(C);
            int C2 = AnonymousClass0Ca.C(context2, C0164R.color.white_20_transparent);
            int C3 = AnonymousClass0Ca.C(context2, C0164R.color.white_80_transparent);
            int i = C3;
            int i2 = C3;
            int i3 = C3;
            int i4 = C3;
            int C4 = AnonymousClass0Ca.C(context2, C0164R.color.white);
            ColorStateList valueOf5 = ColorStateList.valueOf(-1);
            int C5 = AnonymousClass0Ca.C(context2, C0164R.color.grey_2);
            int C6 = AnonymousClass0Ca.C(context2, AnonymousClass0G5.F(context2, C0164R.attr.textColorRegularLink));
            int i5 = C6;
            int i6 = C6;
            int i7 = C6;
            int C7 = AnonymousClass0Ca.C(context2, AnonymousClass0G5.F(context2, C0164R.attr.feedLikeActiveColor));
            ColorStateList valueOf6 = ColorStateList.valueOf(AnonymousClass0Ca.C(context2, C0164R.color.grey_3));
            int C8 = AnonymousClass0Ca.C(context2, C0164R.color.grey_2);
            Drawable E = AnonymousClass0Ca.E(context2, C0164R.drawable.rounded_bubble_background_direct_app_primary);
            context = AnonymousClass0Ca.E(context2, C0164R.drawable.rounded_bubble_background_white);
            anonymousClass0Cm = AnonymousClass0Ca.E(context2, C0164R.drawable.unified_inbox_message_mask_no_border);
            AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
            anonymousClass4gQ = AnonymousClass0Ca.E(context2, C0164R.drawable.direct_expired_tombstone_text_background);
            AnonymousClass4gS anonymousClass4gS = r2;
            AnonymousClass4gS anonymousClass4gS2 = new AnonymousClass4gS(context3, valueOf, valueOf3, i2, valueOf5, -1, C3, i, i3, i4, C3, C4, C2, E, anonymousClass0Cm2, AnonymousClass0Ca.E(context2, C0164R.drawable.direct_expired_tombstone_text_background_white));
            return new AnonymousClass4gT(anonymousClass4gS, new AnonymousClass4gS(context2, valueOf2, valueOf4, C, valueOf6, C8, C6, i5, i6, i7, C6, C7, C5, context, anonymousClass0Cm, anonymousClass4gQ), true);
        }
        AnonymousClass4gT B = AnonymousClass4gU.m24759B(context2);
        return new AnonymousClass4gT(B.f56263B, B.f56264C, true);
    }
}
