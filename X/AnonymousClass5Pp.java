package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.C0164R;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* renamed from: X.5Pp */
public final class AnonymousClass5Pp extends BaseAdapter {
    /* renamed from: B */
    public List f63175B = new ArrayList();
    /* renamed from: C */
    private final Context f63176C;

    public final long getItemId(int i) {
        return (long) i;
    }

    public AnonymousClass5Pp(Context context) {
        this.f63176C = context;
    }

    public final int getCount() {
        return this.f63175B.size();
    }

    public final Object getItem(int i) {
        return this.f63175B.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f63176C).inflate(C0164R.layout.former_username_list_row, viewGroup, false);
        inflate.setTag(new AnonymousClass5Pq((TextView) inflate.findViewById(C0164R.id.username), (TextView) inflate.findViewById(C0164R.id.time)));
        AnonymousClass5Pq anonymousClass5Pq = (AnonymousClass5Pq) inflate.getTag();
        AnonymousClass5Q8 anonymousClass5Q8 = (AnonymousClass5Q8) this.f63175B.get(i);
        anonymousClass5Pq.f63178C.setText(anonymousClass5Q8.f63220C);
        Date date = new Date(anonymousClass5Q8.f63219B * 1000);
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        CharSequence stringBuilder = new StringBuilder(new DateFormatSymbols().getMonths()[instance.get(2)]);
        stringBuilder.append(" ");
        stringBuilder.append(instance.get(5));
        stringBuilder.append(", ");
        stringBuilder.append(instance.get(1));
        anonymousClass5Pq.f63177B.setText(stringBuilder);
        return inflate;
    }
}
