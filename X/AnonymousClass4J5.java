package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.4J5 */
public final class AnonymousClass4J5 extends AnonymousClass16a {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4J6 f52603B;
    /* renamed from: C */
    public final /* synthetic */ Context f52604C;
    /* renamed from: D */
    public final /* synthetic */ Resources f52605D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Cm f52606E;

    public AnonymousClass4J5(AnonymousClass4J6 anonymousClass4J6, AnonymousClass0Cm anonymousClass0Cm, Resources resources, Context context) {
        this.f52603B = anonymousClass4J6;
        this.f52606E = anonymousClass0Cm;
        this.f52605D = resources;
        this.f52604C = context;
    }

    public final void Xq(View view) {
        if (this.f52603B.f52612G.YV()) {
            AnonymousClass4Ia anonymousClass4Ia = new AnonymousClass4Ia(this.f52603B.f52614I, this.f52605D.getDimensionPixelSize(C0164R.dimen.emoji_icon_size), this.f52603B.f52612G.ZL(), new AnonymousClass5SX(this));
        }
    }

    public final boolean yCA(View view) {
        Drawable B;
        Context context = this.f52603B.f52614I.getContext();
        if (this.f52603B.f52612G.eT() == AnonymousClass27i.EMOJI) {
            B = AnonymousClass4J6.m23816B(context, this.f52603B.f52612G.ZL());
        } else {
            B = AnonymousClass4Jl.m23841B(context, this.f52606E, this.f52603B.f52612G.JS(), this.f52603B.f52608C);
        }
        this.f52603B.f52608C.gd(this.f52603B.f52612G, B);
        return true;
    }
}
