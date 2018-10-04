package X;

import android.widget.Toast;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5qt */
public final class AnonymousClass5qt extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5qu f69362B;
    /* renamed from: C */
    public final /* synthetic */ File f69363C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0TD f69364D;

    public AnonymousClass5qt(AnonymousClass5qu anonymousClass5qu, AnonymousClass0TD anonymousClass0TD, File file) {
        this.f69362B = anonymousClass5qu;
        this.f69364D = anonymousClass0TD;
        this.f69363C = file;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -114407932);
        Toast.makeText(this.f69362B.getContext(), "Error loading QPs", 0).show();
        AnonymousClass0cQ.H(this, -1554761518, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2 = obj;
        int I = AnonymousClass0cQ.I(this, 747636130);
        AnonymousClass199 anonymousClass199 = (AnonymousClass199) obj2;
        int I2 = AnonymousClass0cQ.I(this, -186183560);
        long F = AnonymousClass5qG.m28538F(this.f69362B.f69367D, AnonymousClass0oA.C(this.f69362B.f69367D, this.f69364D));
        AnonymousClass0T6 anonymousClass0T6 = this.f69362B.f69366C;
        AnonymousClass0TD anonymousClass0TD = this.f69364D;
        AnonymousClass0Cm anonymousClass0Cm = this.f69362B.f69367D;
        Map hashMap = new HashMap();
        for (AnonymousClass0o2 anonymousClass0o2 : AnonymousClass0TF.C(anonymousClass0TD)) {
            if (anonymousClass199.F(anonymousClass0o2) != null) {
                long toSeconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                List<AnonymousClass19A> F2 = anonymousClass199.F(anonymousClass0o2);
                if (!(F2 == null || F2.isEmpty())) {
                    for (AnonymousClass19A anonymousClass19A : F2) {
                        Set A = anonymousClass0T6.A(anonymousClass19A, anonymousClass0o2, toSeconds, F, anonymousClass0Cm);
                        if (A != null) {
                            hashMap.put(anonymousClass19A, A);
                        }
                    }
                }
            }
        }
        AnonymousClass0TD anonymousClass0TD2 = r3.f69364D;
        Map hashMap2 = new HashMap();
        for (AnonymousClass0o2 anonymousClass0o22 : AnonymousClass0TF.C(anonymousClass0TD2)) {
            Object F3 = anonymousClass199.F(anonymousClass0o22);
            if (F3 == null) {
                F3 = Collections.emptyList();
            }
            hashMap2.put(anonymousClass0o22, F3);
        }
        AnonymousClass1aD anonymousClass1aD = r3.f69362B.f69365B;
        AnonymousClass5qx anonymousClass5qx = new AnonymousClass5qx(anonymousClass199, r3.f69363C, hashMap, hashMap2, r3.f69364D);
        anonymousClass1aD.f20316D.remove(anonymousClass5qx);
        anonymousClass1aD.f20316D.add(anonymousClass5qx);
        Collections.sort(anonymousClass1aD.f20316D, anonymousClass1aD.f20314B);
        if (anonymousClass1aD.f20316D.isEmpty()) {
            anonymousClass1aD.f20315C.notifyInvalidated();
        } else {
            anonymousClass1aD.f20315C.notifyChanged();
        }
        AnonymousClass0cQ.H(r3, -773446381, I2);
        AnonymousClass0cQ.H(r3, -725936610, I);
    }
}
