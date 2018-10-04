package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.2Iu */
public final class AnonymousClass2Iu {
    /* renamed from: B */
    public static void m14992B(View view, AnonymousClass2IV anonymousClass2IV) {
        AnonymousClass2It anonymousClass2It = (AnonymousClass2It) view.getTag();
        anonymousClass2It.f28760C.setVisibility(8);
        if (anonymousClass2IV.f28691F != null) {
            view.setOnClickListener(anonymousClass2IV.f28691F);
        } else {
            view.setClickable(false);
        }
        if (anonymousClass2IV.f28692G != null) {
            anonymousClass2It.f28762E.setText(anonymousClass2IV.f28692G);
        } else {
            anonymousClass2It.f28762E.setText(anonymousClass2IV.f28693H);
        }
        if (anonymousClass2IV.f28687B != null) {
            anonymousClass2It.f28761D.setText(anonymousClass2IV.f28687B);
        } else {
            anonymousClass2It.f28761D.setText(anonymousClass2IV.f28688C);
        }
        if (!anonymousClass2IV.f28690E) {
            if (anonymousClass2IV.f28687B != null) {
                anonymousClass2It.f28761D.setText(view.getResources().getString(C0164R.string.invite_new_facebook_freinds, new Object[]{anonymousClass2IV.f28687B}));
            } else {
                anonymousClass2It.f28761D.setText(view.getResources().getString(C0164R.string.invite_new_facebook_freinds, new Object[]{view.getResources().getString(anonymousClass2IV.f28688C)}));
            }
        }
        anonymousClass2It.f28759B.setVisibility(anonymousClass2IV.f28690E ? 8 : 0);
        anonymousClass2It.f28761D.setPadding(view.getResources().getDimensionPixelSize(C0164R.dimen.row_text_padding), 0, view.getResources().getDimensionPixelSize(C0164R.dimen.row_padding), 0);
        if (!anonymousClass2IV.f28690E) {
            if (anonymousClass2It.f28759B.getVisibility() != 0) {
                anonymousClass2It.f28761D.setVisibility(8);
                AnonymousClass1nn.m13176B(anonymousClass2It.f28762E, anonymousClass2IV.f28689D, null, null, null);
                anonymousClass2It.f28762E.setCompoundDrawablePadding((int) AnonymousClass0Nm.C(view.getContext(), 8));
            }
        }
        anonymousClass2It.f28761D.setVisibility(0);
        AnonymousClass1nn.m13176B(anonymousClass2It.f28762E, anonymousClass2IV.f28689D, null, null, null);
        anonymousClass2It.f28762E.setCompoundDrawablePadding((int) AnonymousClass0Nm.C(view.getContext(), 8));
    }

    /* renamed from: C */
    public static View m14993C(Context context, ViewGroup viewGroup) {
        context = LayoutInflater.from(context).inflate(C0164R.layout.row_badge_item, viewGroup, false);
        AnonymousClass2It anonymousClass2It = new AnonymousClass2It();
        anonymousClass2It.f28762E = (TextView) context.findViewById(C0164R.id.title);
        anonymousClass2It.f28759B = (TextView) context.findViewById(C0164R.id.badge);
        anonymousClass2It.f28761D = (TextView) context.findViewById(C0164R.id.badge_lowpri);
        anonymousClass2It.f28760C = context.findViewById(C0164R.id.row_divider);
        context.getPaddingLeft();
        context.setTag(anonymousClass2It);
        return context;
    }
}
