package X;

import android.widget.Toast;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1QA */
public final class AnonymousClass1QA implements AnonymousClass0nn {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0SW f18322B;
    /* renamed from: C */
    public final /* synthetic */ boolean f18323C;

    public final void Hr(AnonymousClass0fq anonymousClass0fq) {
    }

    public final void Ir() {
    }

    public AnonymousClass1QA(AnonymousClass0SW anonymousClass0SW, boolean z) {
        this.f18322B = anonymousClass0SW;
        this.f18323C = z;
    }

    public final void Gr(AnonymousClass0Q6 anonymousClass0Q6) {
        if (this.f18322B.isResumed()) {
            Toast.makeText(this.f18322B.getActivity(), C0164R.string.could_not_refresh_feed, 0).show();
        }
        this.f18322B.f4922B.m11453G();
        AnonymousClass0SW.m4346C(this.f18322B);
    }

    public final void Jr() {
        AnonymousClass0SW.m4346C(this.f18322B);
    }

    public final /* bridge */ /* synthetic */ void Kr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass1Rs anonymousClass1Rs;
        AnonymousClass64B anonymousClass64B = (AnonymousClass64B) anonymousClass0Pn;
        List arrayList = new ArrayList();
        for (AnonymousClass0Pm H : Collections.unmodifiableList(anonymousClass64B.f71418C)) {
            arrayList.add(AnonymousClass0Jd.f2931B.mo639M(this.f18322B.f4924D).m3089H(H));
        }
        for (AnonymousClass19j I : Collections.unmodifiableList(anonymousClass64B.f71419D)) {
            arrayList.add(AnonymousClass0Jd.f2931B.mo639M(this.f18322B.f4924D).m3090I(I));
        }
        Collections.sort(arrayList, new AnonymousClass645(this, anonymousClass64B));
        if (this.f18323C) {
            anonymousClass1Rs = this.f18322B.f4922B;
            anonymousClass1Rs.f18653D.m7392D();
            anonymousClass1Rs.f18652C.clear();
            anonymousClass1Rs.m11453G();
            if (this.f18322B.getView() != null) {
                AnonymousClass0Ig anonymousClass0Ig = this.f18322B;
                anonymousClass0Ig.getListView().post(new AnonymousClass644(anonymousClass0Ig));
            }
        }
        anonymousClass1Rs = this.f18322B.f4922B;
        anonymousClass1Rs.f18653D.m7391B(arrayList);
        anonymousClass1Rs.m11453G();
        AnonymousClass0SW.m4346C(this.f18322B);
    }

    public final void Lr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass64B anonymousClass64B = (AnonymousClass64B) anonymousClass0Pn;
    }
}
