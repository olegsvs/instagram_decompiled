package X;

import android.content.Context;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0kZ */
public final class AnonymousClass0kZ {
    /* renamed from: B */
    public List f9313B;
    /* renamed from: C */
    public AnonymousClass0jx f9314C;
    /* renamed from: D */
    public AnonymousClass0kV f9315D;
    /* renamed from: E */
    public AnonymousClass0ka f9316E;
    /* renamed from: F */
    public AnonymousClass0jU f9317F;
    /* renamed from: G */
    public AnonymousClass0jf f9318G;
    /* renamed from: H */
    public AnonymousClass0jg f9319H;
    /* renamed from: I */
    public AnonymousClass0jZ f9320I;
    /* renamed from: J */
    public Hashtag f9321J;
    /* renamed from: K */
    public AnonymousClass0kY f9322K;
    /* renamed from: L */
    public AnonymousClass0jY f9323L;
    /* renamed from: M */
    public boolean f9324M;
    /* renamed from: N */
    public AnonymousClass0jr f9325N;
    /* renamed from: O */
    public AnonymousClass0jC f9326O;
    /* renamed from: P */
    public AnonymousClass0kB f9327P;
    /* renamed from: Q */
    public AnonymousClass0jj f9328Q;
    /* renamed from: R */
    public AnonymousClass0hq f9329R;
    /* renamed from: S */
    public AnonymousClass0jS f9330S;
    /* renamed from: T */
    public AnonymousClass0is f9331T;
    /* renamed from: U */
    public boolean f9332U = true;
    /* renamed from: V */
    public AnonymousClass3kj f9333V;
    /* renamed from: W */
    private final AnonymousClass0iC f9334W;
    /* renamed from: X */
    private final Context f9335X;
    /* renamed from: Y */
    private final AnonymousClass0IU f9336Y;
    /* renamed from: Z */
    private final AnonymousClass0PZ f9337Z;
    /* renamed from: a */
    private final AnonymousClass0Ie f9338a;
    /* renamed from: b */
    private AnonymousClass0Ci f9339b;
    /* renamed from: c */
    private AnonymousClass0Cm f9340c;

    public AnonymousClass0kZ(Context context, AnonymousClass0Ie anonymousClass0Ie, AnonymousClass0IU anonymousClass0IU, AnonymousClass0iC anonymousClass0iC, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0Cm anonymousClass0Cm) {
        this.f9335X = context;
        this.f9338a = anonymousClass0Ie;
        this.f9336Y = anonymousClass0IU;
        this.f9334W = anonymousClass0iC;
        this.f9337Z = anonymousClass0PZ;
        this.f9340c = anonymousClass0Cm;
        this.f9339b = anonymousClass0Cm.m1037B();
    }

    /* renamed from: A */
    public final AnonymousClass0iP m7193A() {
        if (this.f9323L == null) {
            r0.f9323L = new AnonymousClass0jY();
        }
        if (r0.f9320I == null) {
            Context context = r0.f9335X;
            AnonymousClass0Cm anonymousClass0Cm = r0.f9340c;
            AnonymousClass0PZ anonymousClass0PZ = r0.f9337Z;
            AnonymousClass0iD anonymousClass0iD = r0.f9334W;
            AnonymousClass0jY anonymousClass0jY = r0.f9323L;
            AnonymousClass0hq anonymousClass0hq = r0.f9329R;
            r0.f9320I = new AnonymousClass0jZ(context, anonymousClass0Cm, anonymousClass0PZ, anonymousClass0iD, anonymousClass0jY, anonymousClass0hq != null ? anonymousClass0hq.kR() : null);
        }
        if (r0.f9318G == null) {
            r0.f9318G = new AnonymousClass0jf(r0.f9334W, r0.f9338a);
        }
        if (r0.f9319H == null) {
            r0.f9319H = new AnonymousClass0jg(r0.f9334W, r0.f9338a);
        }
        if (r0.f9333V == null) {
            r0.f9333V = new AnonymousClass3kj(r0.f9338a.getActivity(), r0.f9334W, r0.f9337Z);
        }
        if (r0.f9331T == null) {
            r0.f9331T = new AnonymousClass0is(r0.f9338a.getActivity(), r0.f9340c, r0.f9334W, r0.f9320I);
        }
        if (r0.f9325N == null) {
            r0.f9325N = new AnonymousClass0jr(r0.f9338a, r0.f9337Z, r0.f9334W, new AnonymousClass0w1(r0.f9335X, r0.f9340c, r0.f9337Z, r0.f9334W, r0.f9326O, r0.f9329R));
        }
        List arrayList = new ArrayList();
        arrayList.add(r0.f9325N);
        List<AnonymousClass0js> list = r0.f9313B;
        if (list != null) {
            for (AnonymousClass0js add : list) {
                arrayList.add(add);
            }
        }
        AnonymousClass0TK anonymousClass0TK = r0.f9326O;
        if (anonymousClass0TK != null) {
            r0.f9338a.registerLifecycleListener(anonymousClass0TK);
        }
        if (r0.f9317F == null) {
            r0.f9317F = new AnonymousClass0jU(r0.f9338a.getActivity(), new AnonymousClass0jW(r0.f9340c));
        }
        if (r0.f9328Q == null) {
            if ((r0.f9338a.getRootActivity() instanceof AnonymousClass0Hj) && ((AnonymousClass0Hj) r0.f9338a.getRootActivity()).nS() == 0) {
                AnonymousClass0IL anonymousClass0IL = r0.f9338a;
                r0.f9328Q = new AnonymousClass0ji(anonymousClass0IL, (AnonymousClass0Hw) anonymousClass0IL.getRootActivity());
            } else {
                r0.f9328Q = new AnonymousClass0y5();
            }
        }
        if (r0.f9327P == null) {
            r0.f9327P = new AnonymousClass41e(r0.f9338a.getActivity(), r0.f9329R, r0.f9337Z, r0.f9340c, r0.f9328Q);
        }
        if (r0.f9315D == null) {
            r0.f9315D = new AnonymousClass0kV(r0.f9338a.getActivity(), r0.f9340c);
        }
        if (r0.f9322K == null) {
            r0.f9322K = AnonymousClass0kX.m7192B(r0.f9338a, r0.f9337Z, r0.f9329R, null, r0.f9340c);
        }
        if (r0.f9314C == null) {
            AnonymousClass0Ie anonymousClass0Ie = r0.f9338a;
            AnonymousClass0IU anonymousClass0IU = r0.f9336Y;
            AnonymousClass0PZ anonymousClass0PZ2 = r0.f9337Z;
            AnonymousClass0iC anonymousClass0iC = r0.f9334W;
            AnonymousClass0jZ anonymousClass0jZ = r0.f9320I;
            AnonymousClass0jf anonymousClass0jf = r0.f9318G;
            AnonymousClass0jg anonymousClass0jg = r0.f9319H;
            AnonymousClass0jr anonymousClass0jr = r0.f9325N;
            AnonymousClass0jS anonymousClass0jS = r0.f9330S;
            AnonymousClass3kj anonymousClass3kj = r0.f9333V;
            AnonymousClass0Cm anonymousClass0Cm2 = r0.f9340c;
            AnonymousClass0hq anonymousClass0hq2 = r0.f9329R;
            AnonymousClass0jC anonymousClass0jC = r0.f9326O;
            AnonymousClass0jg anonymousClass0jg2 = anonymousClass0jg;
            AnonymousClass0jr anonymousClass0jr2 = anonymousClass0jr;
            AnonymousClass0Ie anonymousClass0Ie2 = anonymousClass0Ie;
            AnonymousClass0IU anonymousClass0IU2 = anonymousClass0IU;
            r0.f9314C = new AnonymousClass0ws(anonymousClass0Ie2, anonymousClass0IU2, anonymousClass0PZ2, anonymousClass0iC, anonymousClass0jZ, anonymousClass0jf, anonymousClass0jg2, anonymousClass0jr2, anonymousClass0jS, anonymousClass3kj, anonymousClass0Cm2, anonymousClass0hq2, anonymousClass0jC, r0.f9331T, r0.f9317F, r0.f9327P, r0.f9315D, AnonymousClass0jM.m7091B(r0.f9335X, anonymousClass0Cm2), AnonymousClass0kW.m7183E(r0.f9340c), r0.f9324M, r0.f9321J);
        }
        AnonymousClass0Cm anonymousClass0Cm3 = r0.f9340c;
        AnonymousClass0Ie anonymousClass0Ie3 = r0.f9338a;
        AnonymousClass0iC anonymousClass0iC2 = r0.f9334W;
        AnonymousClass0PZ anonymousClass0PZ3 = r0.f9337Z;
        return new AnonymousClass0iP(anonymousClass0Cm3, anonymousClass0Ie3, anonymousClass0iC2, anonymousClass0PZ3, r0.f9320I, r0.f9325N, arrayList, r0.f9318G, r0.f9319H, r0.f9330S, r0.f9333V, r0.f9331T, r0.f9328Q, r0.f9316E, r0.f9314C, r0.f9339b, anonymousClass0PZ3, AnonymousClass0kW.m7183E(anonymousClass0Cm3), r0.f9332U, r0.f9322K);
    }
}
