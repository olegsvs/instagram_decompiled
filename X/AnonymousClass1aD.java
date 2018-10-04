package X;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: X.1aD */
public final class AnonymousClass1aD implements ListAdapter {
    /* renamed from: F */
    private static final String f20313F = "QuickPromotionDebugSlotItemAdapter";
    /* renamed from: B */
    public final Comparator f20314B = new AnonymousClass5r3(this);
    /* renamed from: C */
    public final DataSetObservable f20315C = new DataSetObservable();
    /* renamed from: D */
    public final List f20316D = new ArrayList();
    /* renamed from: E */
    private final Context f20317E;

    public final boolean areAllItemsEnabled() {
        return true;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public AnonymousClass1aD(Context context) {
        this.f20317E = context;
    }

    public final int getCount() {
        return this.f20316D.size();
    }

    public final Object getItem(int i) {
        return this.f20316D.size() > i ? (AnonymousClass5qx) this.f20316D.get(i) : null;
    }

    public final long getItemId(int i) {
        AnonymousClass5qx anonymousClass5qx = (AnonymousClass5qx) getItem(i);
        return anonymousClass5qx != null ? (long) anonymousClass5qx.f69374D.ordinal() : -1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass5r4 anonymousClass5r4;
        if (view == null) {
            view = LayoutInflater.from(this.f20317E).inflate(C0164R.layout.quick_promotion_slot_item, viewGroup, false);
            anonymousClass5r4 = new AnonymousClass5r4();
            anonymousClass5r4.f69395D = (TextView) view.findViewById(C0164R.id.qp_slot_item_header);
            anonymousClass5r4.f69393B = (TextView) view.findViewById(C0164R.id.qp_slot_item_message);
            anonymousClass5r4.f69394C = (TextView) view.findViewById(C0164R.id.qp_qualified_promotion_count);
            view.setTag(anonymousClass5r4);
        } else {
            anonymousClass5r4 = (AnonymousClass5r4) view.getTag();
        }
        AnonymousClass5qx anonymousClass5qx = (AnonymousClass5qx) getItem(i);
        if (anonymousClass5qx != null) {
            CharSequence spannableStringBuilder = new SpannableStringBuilder();
            Map map = anonymousClass5qx.f69372B;
            int i2 = 0;
            for (Entry entry : anonymousClass5qx.f69373C.entrySet()) {
                AnonymousClass0o3 A = ((AnonymousClass0o2) entry.getKey()).m7674A();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\n");
                stringBuilder.append(A.name().toLowerCase());
                stringBuilder.append("\n");
                CharSequence spannableString = new SpannableString(stringBuilder.toString());
                spannableString.setSpan(new AnonymousClass0yF(), 0, stringBuilder.length(), 0);
                spannableStringBuilder.append(spannableString);
                List<AnonymousClass19A> list = (List) entry.getValue();
                if (list != null) {
                    if (!list.isEmpty()) {
                        for (AnonymousClass19A anonymousClass19A : list) {
                            AnonymousClass19C anonymousClass19C = anonymousClass19A.f15084C;
                            if (anonymousClass19C == null) {
                                AnonymousClass0Dc.m1243F(f20313F, "Should not happen: Edge contains no node!");
                                spannableStringBuilder.append("No node for edge ").append(anonymousClass19A.toString());
                            } else {
                                spannableStringBuilder.append("\"").append(((AnonymousClass0ok) anonymousClass19C.f15088C.get(0)).f10343I.f11230B).append("\" ");
                                Set<AnonymousClass19F> set = (Set) map.get(anonymousClass19A);
                                if (set != null) {
                                    if (!set.isEmpty()) {
                                        for (AnonymousClass19F A2 : set) {
                                            spannableStringBuilder.append("is not qualified. ").append(A2.m9660A());
                                        }
                                        spannableStringBuilder.append("\n");
                                    }
                                }
                                spannableStringBuilder.append(" is qualified.\n");
                                i2++;
                            }
                        }
                    }
                }
                spannableStringBuilder.append("No QPs\n");
            }
            anonymousClass5r4.f69395D.setText(anonymousClass5qx.f69374D.name().replace('_', ' '));
            anonymousClass5r4.f69394C.setText(String.format("%d qualified promotion(s)", new Object[]{Integer.valueOf(i2)}));
            anonymousClass5r4.f69393B.setText(spannableStringBuilder);
            return view;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to get an item at position ");
        stringBuilder.append(i);
        throw new RuntimeException(stringBuilder.toString());
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }

    public final boolean isEnabled(int i) {
        return getItem(i) != null;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f20315C.registerObserver(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f20315C.unregisterObserver(dataSetObserver);
    }
}
