package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: X.32q */
public final class AnonymousClass32q {
    /* renamed from: B */
    public boolean f37268B = false;
    /* renamed from: C */
    private final Activity f37269C;

    public AnonymousClass32q(Activity activity) {
        this.f37269C = activity;
    }

    /* renamed from: A */
    public final List m18283A(AnonymousClass0Cm anonymousClass0Cm, String str, BrandedContentTag brandedContentTag) {
        if (AnonymousClass32q.m18281B(this, anonymousClass0Cm, brandedContentTag)) {
            if (!TextUtils.isEmpty(str)) {
                String group;
                brandedContentTag = str.toLowerCase(Locale.getDefault());
                str = new HashSet();
                anonymousClass0Cm = AnonymousClass189.D(brandedContentTag);
                while (anonymousClass0Cm.find()) {
                    group = anonymousClass0Cm.group(1);
                    if (AnonymousClass23A.f25457B.contains(group)) {
                        str.add(group);
                    }
                }
                for (String group2 : AnonymousClass23A.f25458C) {
                    if (brandedContentTag.contains(group2)) {
                        str.add(group2);
                    }
                }
                return new ArrayList(str);
            }
        }
        return new ArrayList();
    }

    /* renamed from: B */
    public final List m18284B(AnonymousClass0Cm anonymousClass0Cm, List list, String str, BrandedContentTag brandedContentTag) {
        Object obj = (!AnonymousClass32q.m18281B(this, anonymousClass0Cm, brandedContentTag) || TextUtils.isEmpty(str) || AnonymousClass2G6.m14873F(list)) ? null : 1;
        if (obj == null) {
            return new ArrayList();
        }
        anonymousClass0Cm = new HashSet();
        for (AnonymousClass0ZF anonymousClass0ZF : list) {
            String stringBuilder;
            if (anonymousClass0ZF.f6315W == AnonymousClass15c.HASHTAG) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("#");
                stringBuilder2.append(anonymousClass0ZF.f6297E.f2793M.toLowerCase(Locale.getDefault()));
                stringBuilder = stringBuilder2.toString();
                if (AnonymousClass23A.f25459D.contains(stringBuilder)) {
                    anonymousClass0Cm.add(stringBuilder);
                }
            }
        }
        String toLowerCase = str.toLowerCase(Locale.getDefault());
        for (String stringBuilder3 : AnonymousClass23A.f25460E) {
            if (toLowerCase.contains(stringBuilder3)) {
                anonymousClass0Cm.add(stringBuilder3);
            }
        }
        return new ArrayList(anonymousClass0Cm);
    }

    /* renamed from: B */
    public static boolean m18281B(AnonymousClass32q anonymousClass32q, AnonymousClass0Cm anonymousClass0Cm, BrandedContentTag brandedContentTag) {
        return anonymousClass0Cm.B().H() && brandedContentTag == null && !anonymousClass32q.f37268B && ((Boolean) AnonymousClass0CC.XC.H(anonymousClass0Cm)).booleanValue();
    }

    /* renamed from: C */
    public static void m18282C(AnonymousClass32q anonymousClass32q, Context context, OnClickListener onClickListener, OnClickListener onClickListener2, int i) {
        anonymousClass32q.f37268B = true;
        new AnonymousClass0P2(context).V(C0164R.string.tagging_upsell_dialog_title).K(i).U(context.getString(C0164R.string.tagging_upsell_dialog_positive_action_button_text), onClickListener, true, AnonymousClass2Ca.BLUE_BOLD).N(C0164R.string.tagging_upsell_dialog_cancel_button_text, onClickListener2).A().show();
    }

    /* renamed from: C */
    public final void m18285C(View view) {
        Activity activity = this.f37269C;
        AnonymousClass173 C = new AnonymousClass173(activity, new AnonymousClass174(activity.getString(C0164R.string.branded_content_tagging_upsell_tooltip_text))).C(view);
        C.f14642H = AnonymousClass177.BELOW_ANCHOR;
        C.f14648N = AnonymousClass178.f14655F;
        C.f14636B = true;
        C.A().C();
    }
}
