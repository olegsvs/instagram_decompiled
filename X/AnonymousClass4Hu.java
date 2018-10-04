package X;

import android.content.Context;
import java.io.File;
import java.util.List;

/* renamed from: X.4Hu */
public final class AnonymousClass4Hu extends AnonymousClass17n {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5ST f52396B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0OA f52397C;
    /* renamed from: D */
    public final /* synthetic */ List f52398D;
    /* renamed from: E */
    public final /* synthetic */ int f52399E;
    /* renamed from: F */
    public final /* synthetic */ int f52400F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass0OA f52401G;

    public AnonymousClass4Hu(AnonymousClass5ST anonymousClass5ST, AnonymousClass0OA anonymousClass0OA, int i, int i2, AnonymousClass0OA anonymousClass0OA2, List list) {
        this.f52396B = anonymousClass5ST;
        this.f52401G = anonymousClass0OA;
        this.f52400F = i;
        this.f52399E = i2;
        this.f52397C = anonymousClass0OA2;
        this.f52398D = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        File F = AnonymousClass2NO.m15325F(this.f52396B.getContext());
        Context context = this.f52396B.getContext();
        AnonymousClass0OA anonymousClass0OA = this.f52401G;
        int i = this.f52400F;
        AnonymousClass3Id.m19304D(context, anonymousClass0OA, F, i, this.f52399E, AnonymousClass2Mq.m15252G(i));
        this.f52401G.DB = F.getAbsolutePath();
        return null;
    }

    public final void onFinish() {
        super.onFinish();
        AnonymousClass5ST.R(this.f52396B, this.f52397C, this.f52398D);
    }
}
