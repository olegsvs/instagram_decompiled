package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

/* renamed from: X.0tB */
public final class AnonymousClass0tB implements OnItemClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0t9 f11608B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0jB f11609C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0t8 f11610D;
    /* renamed from: E */
    public final /* synthetic */ boolean f11611E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0mw f11612F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass0mu f11613G;
    /* renamed from: H */
    public final /* synthetic */ AnonymousClass0mt f11614H;

    public AnonymousClass0tB(AnonymousClass0mw anonymousClass0mw, boolean z, AnonymousClass0t9 anonymousClass0t9, AnonymousClass0t8 anonymousClass0t8, AnonymousClass0jB anonymousClass0jB, AnonymousClass0mt anonymousClass0mt, AnonymousClass0mu anonymousClass0mu) {
        this.f11612F = anonymousClass0mw;
        this.f11611E = z;
        this.f11608B = anonymousClass0t9;
        this.f11610D = anonymousClass0t8;
        this.f11609C = anonymousClass0jB;
        this.f11614H = anonymousClass0mt;
        this.f11613G = anonymousClass0mu;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass3QR anonymousClass3QR = (AnonymousClass3QR) this.f11612F.f9944H.get(i);
        anonymousClass3QR.f41147C ^= 1;
        if (this.f11611E) {
            boolean z;
            AnonymousClass0rF.m7947B(this.f11608B, -722982247);
            TextView textView = this.f11610D.f11598B;
            if (!anonymousClass3QR.f41147C) {
                if (!this.f11612F.m7575D()) {
                    z = false;
                    textView.setEnabled(z);
                    return;
                }
            }
            z = true;
            textView.setEnabled(z);
            return;
        }
        this.f11610D.f11601E.setVisibility(8);
        this.f11609C.Pm(this.f11614H, this.f11613G);
    }
}
