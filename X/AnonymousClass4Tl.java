package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Tl */
public final class AnonymousClass4Tl {
    /* renamed from: B */
    public final Context f54418B;
    /* renamed from: C */
    public int f54419C;
    /* renamed from: D */
    public final AnonymousClass5UD f54420D;
    /* renamed from: E */
    public String f54421E;
    /* renamed from: F */
    public final AnonymousClass5UF f54422F = new AnonymousClass5UF(this);
    /* renamed from: G */
    public List f54423G;
    /* renamed from: H */
    public final ViewGroup f54424H;
    /* renamed from: I */
    private final TextView f54425I;

    public AnonymousClass4Tl(Context context, AnonymousClass5UD anonymousClass5UD, View view) {
        this.f54418B = context;
        this.f54420D = anonymousClass5UD;
        this.f54424H = (ViewGroup) view.findViewById(C0164R.id.product_sticker_tokens_container);
        this.f54425I = (TextView) view.findViewById(C0164R.id.product_sticker_tokens_title);
        this.f54423G = new ArrayList();
    }

    /* renamed from: B */
    public static void m24309B(AnonymousClass4Tl anonymousClass4Tl, int i) {
        Object obj = 1;
        Object obj2 = anonymousClass4Tl.f54419C == anonymousClass4Tl.f54423G.size() ? 1 : null;
        Object obj3 = anonymousClass4Tl.f54419C == 0 ? 1 : null;
        anonymousClass4Tl.f54419C += i;
        Object obj4 = anonymousClass4Tl.f54419C == anonymousClass4Tl.f54423G.size() ? 1 : null;
        if (anonymousClass4Tl.f54419C != 0) {
            obj = null;
        }
        if (obj4 != null) {
            anonymousClass4Tl.f54425I.setText(C0164R.string.product_sticker_tokens_title_remove);
        } else if (obj != null) {
            anonymousClass4Tl.f54425I.setText(C0164R.string.product_sticker_tokens_title_add);
        } else if (obj2 != null || obj3 != null) {
            anonymousClass4Tl.f54425I.setText(C0164R.string.product_sticker_tokens_title_add_remove);
        }
    }
}
