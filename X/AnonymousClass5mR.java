package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.nestablerecyclerview.NestableRecyclerView;

/* renamed from: X.5mR */
public final class AnonymousClass5mR {
    /* renamed from: B */
    public final View f68886B;
    /* renamed from: C */
    public final View f68887C;
    /* renamed from: D */
    public final TextView f68888D;
    /* renamed from: E */
    public final TextView f68889E;
    /* renamed from: F */
    public AnonymousClass41I f68890F;
    /* renamed from: G */
    public final NestableRecyclerView f68891G;

    public AnonymousClass5mR(View view) {
        this.f68891G = (NestableRecyclerView) view.findViewById(C0164R.id.highlights_reel_tray_recycler_view);
        this.f68887C = view.findViewById(C0164R.id.tray_header_container);
        this.f68889E = (TextView) view.findViewById(C0164R.id.tray_header);
        this.f68888D = (TextView) view.findViewById(C0164R.id.tray_subtitle);
        this.f68886B = view.findViewById(C0164R.id.tray_header_caret);
    }
}
