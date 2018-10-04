package X;

import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.List;
import java.util.UUID;

/* renamed from: X.4pd */
public final class AnonymousClass4pd implements AnonymousClass0nn {
    /* renamed from: B */
    public boolean f57729B = false;
    /* renamed from: C */
    public long f57730C = System.currentTimeMillis();
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass5XX f57731D;
    /* renamed from: E */
    public final /* synthetic */ boolean f57732E;
    /* renamed from: F */
    public final /* synthetic */ boolean f57733F;
    /* renamed from: G */
    public final /* synthetic */ boolean f57734G;
    /* renamed from: H */
    public final /* synthetic */ int f57735H;
    /* renamed from: I */
    public final /* synthetic */ boolean f57736I;

    public final void Hr(AnonymousClass0fq anonymousClass0fq) {
    }

    public final void Jr() {
    }

    public AnonymousClass4pd(AnonymousClass5XX anonymousClass5XX, boolean z, boolean z2, boolean z3, int i, boolean z4) {
        this.f57731D = anonymousClass5XX;
        this.f57732E = z;
        this.f57733F = z2;
        this.f57734G = z3;
        this.f57735H = i;
        this.f57736I = z4;
    }

    public final void Gr(AnonymousClass0Q6 anonymousClass0Q6) {
        if (!this.f57731D.f65907V) {
            AnonymousClass4pE.m25158K(this.f57731D, System.currentTimeMillis() - this.f57730C, false);
            this.f57731D.f65907V = true;
        }
        this.f57731D.f65892G.m25168B(this.f57735H);
        if (this.f57731D.isResumed()) {
            Toast.makeText(this.f57731D.getActivity(), C0164R.string.could_not_refresh_feed, 0).show();
        }
        AnonymousClass0rF.B(this.f57731D.f65887B, 2055273908);
    }

    public final void Ir() {
        ((RefreshableListView) this.f57731D.getListViewSafe()).setIsLoading(false);
        AnonymousClass2IF.B(false, this.f57731D.getView());
    }

    public final /* bridge */ /* synthetic */ void Kr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass0SE anonymousClass0SE = (AnonymousClass0SE) anonymousClass0Pn;
        if (!this.f57729B) {
            this.f57729B = true;
            int i = 0;
            if (this.f57732E) {
                if (!this.f57733F) {
                    this.f57731D.f65904S = UUID.randomUUID().toString();
                }
                this.f57731D.f65894I = false;
            }
            if (!this.f57731D.f65907V) {
                AnonymousClass4pE.m25158K(this.f57731D, System.currentTimeMillis() - this.f57730C, true);
                this.f57731D.f65907V = true;
            }
            String str = this.f57734G ? "prefetch" : anonymousClass0SE.F() ? "cache" : "network";
            this.f57731D.f65892G.m25167A(this.f57735H, str);
            if (this.f57732E) {
                if (anonymousClass0SE.F() && this.f57736I) {
                    AnonymousClass1Se.B(this.f57731D.getContext(), anonymousClass0SE.f4870C);
                }
                this.f57731D.f65887B.m27374G();
                this.f57731D.f65899N.clear();
                if (this.f57731D.getView() != null) {
                    AnonymousClass0Ig anonymousClass0Ig = this.f57731D;
                    anonymousClass0Ig.getListView().post(new AnonymousClass4pg(anonymousClass0Ig));
                }
            }
            if (!this.f57732E) {
                i = this.f57731D.f65887B.getCount();
            }
            AnonymousClass5XL anonymousClass5XL = this.f57731D.f65887B;
            anonymousClass5XL.f65794C.YB(anonymousClass0SE.f4871D, anonymousClass0SE.oO());
            AnonymousClass5XL.m27372H(anonymousClass5XL);
            this.f57731D.f65896K.m25182B(this.f57735H, i, this.f57731D.f65887B.getCount());
            this.f57731D.f65891F.A(this.f57731D.f65887B.f65813V, anonymousClass0SE.f4871D, this.f57732E);
            this.f57731D.f65897L.A();
            List list = this.f57731D.f65887B.f65806O;
            if (this.f57732E && !list.isEmpty()) {
                this.f57731D.f65895J = true;
                AnonymousClass5XX anonymousClass5XX = this.f57731D;
                long j = this.f57730C;
                anonymousClass5XX.f65901P = new AnonymousClass0op(list, anonymousClass5XX.f65905T);
                anonymousClass5XX.f65900O.D(System.currentTimeMillis() - j, anonymousClass5XX.f65901P, false);
            }
            if (this.f57732E) {
                AnonymousClass1eu.B(this.f57731D.f65905T).C();
            }
        } else if (!anonymousClass0SE.F()) {
            this.f57731D.f65891F.A(AnonymousClass0nS.GRID, anonymousClass0SE.f4871D, this.f57732E);
        }
    }

    public final void Lr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass0SE anonymousClass0SE = (AnonymousClass0SE) anonymousClass0Pn;
    }
}
