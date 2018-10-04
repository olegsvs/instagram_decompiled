package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.53H */
public final class AnonymousClass53H extends AnonymousClass0nJ {
    /* renamed from: B */
    public final OnClickListener f59589B = new AnonymousClass53G(this);
    /* renamed from: C */
    public final AnonymousClass5ZE f59590C;
    /* renamed from: D */
    public int f59591D;
    /* renamed from: E */
    public final List f59592E;

    public AnonymousClass53H(Context context, AnonymousClass0Cm anonymousClass0Cm, List list, boolean z, int i, AnonymousClass5ZE anonymousClass5ZE) {
        this.f59591D = i;
        this.f59590C = anonymousClass5ZE;
        List arrayList = new ArrayList(5);
        this.f59592E = arrayList;
        arrayList.add(new AnonymousClass5ZF(anonymousClass0Cm.B(), true));
        for (AnonymousClass0Ci anonymousClass0Ci : list) {
            if (!anonymousClass0Cm.f1759C.equals(anonymousClass0Ci.getId())) {
                this.f59592E.add(new AnonymousClass5ZF(anonymousClass0Ci, false));
            }
        }
        if (z) {
            this.f59592E.add(new AnonymousClass53J(context.getString(C0164R.string.switch_account_item_add_account), 2));
        }
        this.f59592E.add(new AnonymousClass53J(context.getString(C0164R.string.switch_account_item_log_out_all), 3));
    }

    /* renamed from: B */
    public final int m25638B() {
        return this.f59592E.size();
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void m25639I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass1RZ anonymousClass1RZ = (AnonymousClass1RZ) anonymousClass0oo;
        AnonymousClass53J anonymousClass53J = (AnonymousClass53J) this.f59592E.get(i);
        TextView textView = (TextView) anonymousClass1RZ.f10370B;
        textView.setText(anonymousClass53J.f59596B);
        Context context = textView.getContext();
        switch (anonymousClass53J.f59597C) {
            case 0:
                textView.setTextColor(anonymousClass1RZ.f18609B);
                AnonymousClass1nn.B(textView, AnonymousClass0TJ.J(context, C0164R.drawable.check, anonymousClass1RZ.f18609B), null, null, null);
                return;
            case 1:
            case 2:
            case 3:
                textView.setTextColor(AnonymousClass0Ca.C(context, C0164R.color.grey_9));
                AnonymousClass1nn.B(textView, null, null, null, null);
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown viewtype: ");
                stringBuilder.append(anonymousClass53J.f59597C);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: J */
    public final /* bridge */ /* synthetic */ AnonymousClass0oo m25640J(ViewGroup viewGroup, int i) {
        AnonymousClass0oo anonymousClass1RZ = new AnonymousClass1RZ((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.layout_switch_account_item, viewGroup, false), this.f59591D);
        anonymousClass1RZ.f10370B.setOnClickListener(this.f59589B);
        return anonymousClass1RZ;
    }

    public final int getItemViewType(int i) {
        return ((AnonymousClass53J) this.f59592E.get(i)).f59597C;
    }
}
