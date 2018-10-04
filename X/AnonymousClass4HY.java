package X;

import android.support.v7.widget.RecyclerView;
import com.instagram.common.gallery.Medium;

/* renamed from: X.4HY */
public final class AnonymousClass4HY implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5ST f52357B;
    /* renamed from: C */
    public final /* synthetic */ int f52358C;
    /* renamed from: D */
    public final /* synthetic */ int f52359D;

    public AnonymousClass4HY(AnonymousClass5ST anonymousClass5ST, int i, int i2) {
        this.f52357B = anonymousClass5ST;
        this.f52358C = i;
        this.f52359D = i2;
    }

    public final void run() {
        this.f52357B.f63924b.m18875E(this.f52358C);
        if (this.f52357B.getCurrentFolder().f38661B == this.f52358C) {
            AnonymousClass3B8 anonymousClass3B8 = this.f52357B.f63924b.f38669D;
            RecyclerView recyclerView = this.f52357B.f63917U;
            recyclerView.setAdapter(recyclerView.getAdapter());
            AnonymousClass5ST.K(this.f52357B);
            if (this.f52359D < anonymousClass3B8.f38662C.size() && !this.f52357B.f63918V.f52586L) {
                this.f52357B.f63924b.m18876F((Medium) anonymousClass3B8.m18863C().get(this.f52359D), true);
            }
        }
    }
}
