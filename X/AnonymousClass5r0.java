package X;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5r0 */
public final class AnonymousClass5r0 extends AnonymousClass0oo {
    /* renamed from: B */
    public TextView f69379B;
    /* renamed from: C */
    public TextView f69380C;
    /* renamed from: D */
    public TextView f69381D;
    /* renamed from: E */
    public View f69382E;
    /* renamed from: F */
    public TextView f69383F;
    /* renamed from: G */
    public TextView f69384G;
    /* renamed from: H */
    public TextView f69385H;
    /* renamed from: I */
    public TextView f69386I;
    /* renamed from: J */
    public View f69387J;

    public AnonymousClass5r0(View view) {
        super(view);
        this.f69386I = (TextView) view.findViewById(C0164R.id.qp_item_title);
        this.f69381D = (TextView) view.findViewById(C0164R.id.qp_item_id_value);
        this.f69384G = (TextView) view.findViewById(C0164R.id.qp_item_surface_value);
        this.f69379B = (TextView) view.findViewById(C0164R.id.qp_item_content_value);
        this.f69380C = (TextView) view.findViewById(C0164R.id.qp_item_duration_value);
        this.f69385H = (TextView) view.findViewById(C0164R.id.qp_item_surface_info_value);
        this.f69383F = (TextView) view.findViewById(C0164R.id.qp_item_qualification_value);
        this.f69382E = view.findViewById(C0164R.id.qp_item_preview_button);
        this.f69387J = view.findViewById(C0164R.id.qp_item_tooltip_disclaimer);
    }

    /* renamed from: B */
    public static String m28554B(String str) {
        return !TextUtils.isEmpty(str) ? str : "[Not set]";
    }

    /* renamed from: C */
    public static String m28555C(Context context, Long l) {
        if (l == null) {
            return "[Not set]";
        }
        return DateUtils.formatDateTime(context, TimeUnit.SECONDS.toMillis(l.longValue()), 17);
    }
}
