package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.2zm */
public final class AnonymousClass2zm extends AnonymousClass0oo {
    /* renamed from: B */
    public ImageView f36711B;
    /* renamed from: C */
    public final AnonymousClass13K f36712C;
    /* renamed from: D */
    public AnonymousClass0MI f36713D;
    /* renamed from: E */
    public AnonymousClass15J f36714E;
    /* renamed from: F */
    public TextView f36715F;
    /* renamed from: G */
    public String f36716G;

    public AnonymousClass2zm(View view, int i, int i2) {
        super(view);
        this.f36715F = (TextView) view.findViewById(C0164R.id.text_view);
        this.f36711B = (ImageView) view.findViewById(C0164R.id.image_view);
        view.getLayoutParams().width = i;
        view.getLayoutParams().height = i;
        this.f36711B.getLayoutParams().height = i2;
        this.f36711B.getLayoutParams().width = i2;
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(view);
        anonymousClass15z.f14389I = 0.85f;
        anonymousClass15z.f14386F = true;
        anonymousClass15z.f14393M = true;
        anonymousClass15z.f14385E = new AnonymousClass2zl(this);
        this.f36712C = anonymousClass15z.A();
    }
}
