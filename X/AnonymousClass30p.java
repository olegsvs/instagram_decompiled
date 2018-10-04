package X;

import android.app.Activity;
import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: X.30p */
public final class AnonymousClass30p implements OnGlobalLayoutListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass30q f36866B;
    /* renamed from: C */
    public final /* synthetic */ Activity f36867C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0lG f36868D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Qf f36869E;
    /* renamed from: F */
    public final /* synthetic */ View f36870F;

    public AnonymousClass30p(AnonymousClass30q anonymousClass30q, View view, Activity activity, AnonymousClass0lG anonymousClass0lG, AnonymousClass0Qf anonymousClass0Qf) {
        this.f36866B = anonymousClass30q;
        this.f36870F = view;
        this.f36867C = activity;
        this.f36868D = anonymousClass0lG;
        this.f36869E = anonymousClass0Qf;
    }

    public final void onGlobalLayout() {
        RecyclerView recyclerView = (RecyclerView) this.f36870F.findViewById(this.f36866B.f36871B);
        if (recyclerView == null) {
            int J = AnonymousClass0Nm.J(this.f36867C);
            int I = AnonymousClass0Nm.I(this.f36867C);
            this.f36868D.D(null, new RectF(0.0f, (float) I, (float) J, (float) (I * 2)), null);
            return;
        }
        this.f36868D.A(recyclerView, null, this.f36869E);
    }
}
