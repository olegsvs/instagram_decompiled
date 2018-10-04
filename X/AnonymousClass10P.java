package X;

import android.support.v7.widget.RecyclerView;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.10P */
public final class AnonymousClass10P implements AnonymousClass3bF {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0hO f13257B;
    /* renamed from: C */
    public final /* synthetic */ String f13258C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass10H f13259D;
    /* renamed from: E */
    public final /* synthetic */ boolean f13260E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0MI f13261F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass0lG f13262G;
    /* renamed from: H */
    public final /* synthetic */ AnonymousClass0Qf f13263H;
    /* renamed from: I */
    public final /* synthetic */ long f13264I;

    public AnonymousClass10P(AnonymousClass0hO anonymousClass0hO, AnonymousClass0Qf anonymousClass0Qf, String str, long j, boolean z, AnonymousClass0MI anonymousClass0MI, AnonymousClass0lG anonymousClass0lG, AnonymousClass10H anonymousClass10H) {
        this.f13257B = anonymousClass0hO;
        this.f13263H = anonymousClass0Qf;
        this.f13258C = str;
        this.f13264I = j;
        this.f13260E = z;
        this.f13261F = anonymousClass0MI;
        this.f13262G = anonymousClass0lG;
        this.f13259D = anonymousClass10H;
    }

    public final void mx(String str) {
        if (this.f13257B.f8392H.isResumed()) {
            if (((AnonymousClass0Hl) AnonymousClass0hO.m6736C(this.f13257B)).VX()) {
                float A = ((Boolean) AnonymousClass0CC.pf.m846H(this.f13257B.f8404T)).booleanValue() ? this.f13257B.f8387C.m7165A() / ((float) AnonymousClass0Nm.m3430I(AnonymousClass0EV.f1977B)) : -1.0f;
                AnonymousClass1Q8 anonymousClass1Q8 = new AnonymousClass1Q8();
                AnonymousClass0ot anonymousClass0ot = this.f13257B.f8395K;
                List arrayList = new ArrayList();
                for (AnonymousClass0ov anonymousClass0ov : anonymousClass0ot.f10428J) {
                    arrayList.add(anonymousClass0ov.f10440D);
                }
                anonymousClass1Q8 = anonymousClass1Q8.m11328B(arrayList, str, this.f13257B.f8404T);
                anonymousClass1Q8.f18309M = this.f13263H;
                anonymousClass1Q8.f18316T = this.f13257B.f8399O.f10353G;
                anonymousClass1Q8.f18301E = A;
                anonymousClass1Q8.f18300D = this.f13258C;
                anonymousClass1Q8.f18317U = null;
                anonymousClass1Q8.f18315S = this.f13257B.f8399O.f10351E;
                anonymousClass1Q8.f18318V = this.f13264I;
                anonymousClass1Q8.f18319W = this.f13260E;
                boolean z = this.f13261F.m3129U() && ((Boolean) AnonymousClass0CC.Db.m846H(this.f13257B.f8404T)).booleanValue();
                anonymousClass1Q8.f18312P = z;
                if (((Boolean) AnonymousClass0CC.tg.m846H(this.f13257B.f8404T)).booleanValue()) {
                    AnonymousClass0hO anonymousClass0hO = this.f13257B;
                    AnonymousClass0lG anonymousClass0lG = this.f13262G;
                    RecyclerView recyclerView = anonymousClass0hO.f8402R;
                    anonymousClass0hO.f8388D = true;
                    if (anonymousClass0hO.f8389E == null) {
                        if (((Boolean) AnonymousClass0CC.Fh.m846H(anonymousClass0hO.f8404T)).booleanValue()) {
                            anonymousClass0hO.f8389E = new AnonymousClass41W(recyclerView, anonymousClass0hO, false);
                        } else {
                            anonymousClass0hO.f8389E = new AnonymousClass41V(recyclerView, anonymousClass0hO);
                        }
                    }
                    anonymousClass1Q8.f18308L = anonymousClass0hO.f8389E.f42593C;
                    anonymousClass1Q8.f18307K = anonymousClass0lG.f9469M;
                    AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(TransparentModalActivity.class, "reel_viewer", anonymousClass1Q8.m11327A(), anonymousClass0hO.f8392H.getActivity(), anonymousClass0hO.f8404T.f1759C);
                    anonymousClass0Sn.f5013B = ModalActivity.f5023D;
                    anonymousClass0Sn.m4403B(AnonymousClass0EV.f1977B);
                } else {
                    AnonymousClass0hO anonymousClass0hO2 = this.f13257B;
                    AnonymousClass0IL C = AnonymousClass0Jd.f2931B.mo634H().m4341C(anonymousClass1Q8.m11327A());
                    AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0hO2.f8392H.getActivity());
                    anonymousClass0IZ.f2754D = C;
                    anonymousClass0IZ.f2752B = "ReelViewerFragment.BACK_STACK_NAME";
                    anonymousClass0IZ.m2308B();
                }
                this.f13259D.xTA();
                return;
            }
        }
        onCancel();
    }

    public final void onCancel() {
        this.f13259D.xTA();
    }

    public final void yu(float f) {
        this.f13259D.eV();
    }
}
