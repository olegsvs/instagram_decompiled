package X;

import android.content.Context;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.60s */
public final class AnonymousClass60s extends AnonymousClass0Rq {
    /* renamed from: B */
    public Map f70892B;
    /* renamed from: C */
    public boolean f70893C;
    /* renamed from: D */
    public final AnonymousClass5EY f70894D;
    /* renamed from: E */
    public List f70895E = new ArrayList();
    /* renamed from: F */
    private final Context f70896F;
    /* renamed from: G */
    private final AnonymousClass5EX f70897G;
    /* renamed from: H */
    private final AnonymousClass3iw f70898H;
    /* renamed from: I */
    private final AnonymousClass5ED f70899I;

    public AnonymousClass60s(Context context, AnonymousClass3eF anonymousClass3eF) {
        this.f70896F = context;
        this.f70897G = new AnonymousClass5EX(context);
        this.f70894D = new AnonymousClass5EY();
        this.f70899I = new AnonymousClass5ED(context, anonymousClass3eF, false);
        this.f70898H = new AnonymousClass3iw(context);
        this.f70892B = new HashMap();
        D(new AnonymousClass0TB[]{this.f70897G, this.f70899I, this.f70898H});
    }

    /* renamed from: B */
    public static void m28767B(AnonymousClass60s anonymousClass60s) {
        anonymousClass60s.C();
        if (!anonymousClass60s.f70894D.m26029A()) {
            anonymousClass60s.B(null, anonymousClass60s.f70894D, anonymousClass60s.f70897G);
        } else if (anonymousClass60s.f70893C) {
            if (anonymousClass60s.f70895E.isEmpty()) {
                anonymousClass60s.A(anonymousClass60s.f70896F.getResources().getString(C0164R.string.no_places_found), anonymousClass60s.f70898H);
            } else {
                for (int i = 0; i < anonymousClass60s.f70895E.size(); i++) {
                    AnonymousClass1Ak anonymousClass1Ak = (AnonymousClass1Ak) anonymousClass60s.f70895E.get(i);
                    String B = anonymousClass1Ak.B();
                    AnonymousClass3du anonymousClass3du = (AnonymousClass3du) anonymousClass60s.f70892B.get(B);
                    if (anonymousClass3du == null) {
                        anonymousClass3du = new AnonymousClass3du();
                        anonymousClass60s.f70892B.put(B, anonymousClass3du);
                    }
                    anonymousClass3du.f42934B = i;
                    anonymousClass60s.B(anonymousClass1Ak, anonymousClass3du, anonymousClass60s.f70899I);
                }
            }
        }
        anonymousClass60s.E();
    }

    /* renamed from: F */
    public final List m28768F() {
        List arrayList = new ArrayList();
        for (AnonymousClass1Ak A : this.f70895E) {
            arrayList.add(A.A());
        }
        return arrayList;
    }
}
