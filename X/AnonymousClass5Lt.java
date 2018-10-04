package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.5Lt */
public final class AnonymousClass5Lt extends AnonymousClass0t7 {
    /* renamed from: B */
    public final /* synthetic */ String f62467B;
    /* renamed from: C */
    public final /* synthetic */ TextView f62468C;
    /* renamed from: D */
    public final /* synthetic */ Context f62469D;
    /* renamed from: E */
    public final /* synthetic */ CharSequence f62470E;
    /* renamed from: F */
    public final /* synthetic */ Resources f62471F;
    /* renamed from: G */
    public final /* synthetic */ boolean f62472G;

    public AnonymousClass5Lt(boolean z, int i, TextView textView, String str, CharSequence charSequence, Resources resources, Context context, boolean z2) {
        this.f62468C = textView;
        this.f62467B = str;
        this.f62470E = charSequence;
        this.f62471F = resources;
        this.f62469D = context;
        this.f62472G = z2;
        super(z, i);
    }

    public final void onClick(View view) {
        AnonymousClass5Lx.m26313D(this.f62468C, this.f62467B, this.f62470E, this.f62471F, this.f62469D, this.f62472G ^ 1);
    }
}
