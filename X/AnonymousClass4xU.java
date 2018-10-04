package X;

import android.support.v7.widget.RecyclerView;

/* renamed from: X.4xU */
public final class AnonymousClass4xU extends AnonymousClass0Gv {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Yb f58850B;

    public AnonymousClass4xU(AnonymousClass5Yb anonymousClass5Yb) {
        this.f58850B = anonymousClass5Yb;
    }

    /* renamed from: B */
    public final void m25488B(RecyclerView recyclerView, int i, int i2) {
        if (this.f58850B.m27547B()) {
            AnonymousClass4xd.m25489B(this.f58850B.f66223I, this.f58850B.f66221G, this.f58850B.f66236V);
        }
        AnonymousClass0n8 anonymousClass0n8 = this.f58850B.f66226L.f58843C;
        if (i > 0) {
            int cA = this.f58850B.f66223I.cA();
            int a = this.f58850B.f66223I.a();
            if (anonymousClass0n8 != null && a - cA < 5 && anonymousClass0n8.L()) {
                AnonymousClass5Yb.m27536B(this.f58850B, anonymousClass0n8);
            }
        }
    }
}
