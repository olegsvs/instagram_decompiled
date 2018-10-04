package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.facebook.C0164R;

/* renamed from: X.115 */
public final class AnonymousClass115 extends BaseAdapter implements ListAdapter {
    /* renamed from: B */
    public Context f13363B;
    /* renamed from: C */
    public AnonymousClass111 f13364C;

    public final long getItemId(int i) {
        return (long) i;
    }

    public AnonymousClass115(Context context, AnonymousClass111 anonymousClass111) {
        this.f13363B = context;
        this.f13364C = anonymousClass111;
    }

    /* renamed from: B */
    private View m8783B(int i, ViewGroup viewGroup) {
        switch (getItemViewType(i)) {
            case 0:
                return AnonymousClass3NT.B(this.f13363B, viewGroup, false);
            case 1:
                return AnonymousClass3NT.B(this.f13363B, viewGroup, true);
            default:
                throw new RuntimeException("No item view type found");
        }
    }

    public final int getCount() {
        return this.f13364C.f13355B.size();
    }

    public final Object getItem(int i) {
        return this.f13364C.f13355B.get(i);
    }

    public final int getItemViewType(int i) {
        return this.f13364C.m8774A() ? 0 : 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = m8783B(i, viewGroup);
        }
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0 || itemViewType == 1) {
            AnonymousClass3NS anonymousClass3NS = (AnonymousClass3NS) view.getTag();
            AnonymousClass111 anonymousClass111 = this.f13364C;
            AnonymousClass3MW anonymousClass3MW = (AnonymousClass3MW) anonymousClass111.f13355B.get(i);
            anonymousClass3NS.f40635C.setText(anonymousClass3MW.f40458D);
            int i2 = 1;
            if (i != anonymousClass111.f13355B.size() - 1) {
                i2 = 0;
            }
            anonymousClass3NS.f40635C.setBackgroundResource(i2 != 0 ? C0164R.drawable.dialog_row_bottom : C0164R.drawable.bg_simple_row);
            anonymousClass3NS.f40634B.setSelected(anonymousClass3MW.f40456B);
        }
        return view;
    }
}
