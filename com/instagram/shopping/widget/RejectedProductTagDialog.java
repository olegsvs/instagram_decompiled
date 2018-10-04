package com.instagram.shopping.widget;

import X.AnonymousClass0Cm;
import X.AnonymousClass0LH;
import X.AnonymousClass0P7;
import X.AnonymousClass0PZ;
import X.AnonymousClass63X;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;
import com.instagram.model.shopping.ProductTag;
import com.instagram.reels.fragment.ReelViewerFragment;
import java.util.HashMap;
import java.util.List;

public final class RejectedProductTagDialog {
    /* renamed from: B */
    public final Context f5003B;
    /* renamed from: C */
    public ReelViewerFragment f5004C;
    /* renamed from: D */
    public Dialog f5005D;
    /* renamed from: E */
    public final AnonymousClass0PZ f5006E;
    /* renamed from: F */
    public final OnClickListener f5007F = new AnonymousClass63X(this);
    /* renamed from: G */
    public AnonymousClass0P7 f5008G;
    /* renamed from: H */
    public final CharSequence[] f5009H;
    /* renamed from: I */
    public String f5010I;
    /* renamed from: J */
    public final AnonymousClass0Cm f5011J;

    public RejectedProductTagDialog(Context context, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0Cm anonymousClass0Cm, String str) {
        this.f5006E = anonymousClass0PZ;
        this.f5003B = context;
        this.f5011J = anonymousClass0Cm;
        this.f5008G = anonymousClass0P7.JA();
        this.f5010I = str;
        this.f5009H = new CharSequence[]{m4392B(this), this.f5003B.getString(C0164R.string.learn_more), this.f5003B.getString(C0164R.string.ok)};
    }

    /* renamed from: B */
    public static String m4392B(RejectedProductTagDialog rejectedProductTagDialog) {
        return rejectedProductTagDialog.f5003B.getString(rejectedProductTagDialog.f5008G.eB ? C0164R.string.product_rejected_dialog_remove_sticker : C0164R.string.product_rejected_dialog_remove_tag);
    }

    /* renamed from: C */
    public static ProductTag m4393C(RejectedProductTagDialog rejectedProductTagDialog) {
        if (!rejectedProductTagDialog.f5008G.kA()) {
            return m4394D(rejectedProductTagDialog, rejectedProductTagDialog.f5008G.m3792v());
        }
        HashMap U = rejectedProductTagDialog.f5008G.m3765U();
        for (String str : U.keySet()) {
            ProductTag D = m4394D(rejectedProductTagDialog, (List) U.get(str));
            if (D != null) {
                return D;
            }
        }
        return null;
    }

    /* renamed from: D */
    private static ProductTag m4394D(RejectedProductTagDialog rejectedProductTagDialog, List list) {
        AnonymousClass0LH.m2927E(list);
        for (ProductTag productTag : list) {
            if (productTag.m9781A().equals(rejectedProductTagDialog.f5010I)) {
                return productTag;
            }
        }
        return null;
    }
}
