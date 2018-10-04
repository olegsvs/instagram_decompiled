package X;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.switchbutton.IgSwitch;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Sa */
public final class AnonymousClass0Sa {
    /* renamed from: B */
    public final Context f4931B;
    /* renamed from: C */
    public Dialog f4932C;
    /* renamed from: D */
    public final AnonymousClass0Fz f4933D;
    /* renamed from: E */
    public final AtomicInteger f4934E = new AtomicInteger();
    /* renamed from: F */
    public IgSwitch f4935F;
    /* renamed from: G */
    public final AnonymousClass0Cm f4936G;
    /* renamed from: H */
    public final boolean f4937H;

    public AnonymousClass0Sa(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Fz anonymousClass0Fz) {
        this.f4931B = context;
        this.f4936G = anonymousClass0Cm;
        this.f4933D = anonymousClass0Fz;
        this.f4937H = ((Boolean) AnonymousClass0CC.fl.m846H(this.f4936G)).booleanValue();
    }

    /* renamed from: B */
    public static View m4358B(AnonymousClass0Sa anonymousClass0Sa, ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(anonymousClass0Sa.f4931B).inflate(C0164R.layout.row_menu_item, viewGroup, false);
        inflate.setPadding(0, 0, 0, 0);
        ((TextView) inflate.findViewById(C0164R.id.row_simple_text_textview)).setText(i);
        viewGroup.addView(inflate);
        return inflate;
    }
}
