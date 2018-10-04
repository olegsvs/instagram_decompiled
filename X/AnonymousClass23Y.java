package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;

/* renamed from: X.23Y */
public final class AnonymousClass23Y implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0NY f25508B;

    public AnonymousClass23Y(AnonymousClass0NY anonymousClass0NY) {
        this.f25508B = anonymousClass0NY;
    }

    public final void run() {
        ArrayList arrayList;
        AnonymousClass0NY anonymousClass0NY = this.f25508B;
        synchronized (anonymousClass0NY) {
            arrayList = anonymousClass0NY.f3587C;
            anonymousClass0NY.f3587C = new ArrayList();
            int i = 0;
            anonymousClass0NY.f3586B = false;
        }
        int size = arrayList.size();
        while (i < size) {
            AnonymousClass1w1 anonymousClass1w1 = (AnonymousClass1w1) arrayList.get(i);
            if (anonymousClass1w1 instanceof AnonymousClass2Rr) {
                AnonymousClass2Rr anonymousClass2Rr = (AnonymousClass2Rr) anonymousClass1w1;
                String str = null;
                AnonymousClass0NN F = AnonymousClass0NN.B("phoneid_sync_stats", null).F("src_pkg", anonymousClass2Rr.f24318B).F("status", anonymousClass2Rr.m13814B()).B(TraceFieldType.Duration, anonymousClass2Rr.m13813A()).F("sync_medium", anonymousClass2Rr.f30516D);
                String str2 = "prev_phone_id";
                if (anonymousClass2Rr.f30515C != null) {
                    str = anonymousClass2Rr.f30515C.toString();
                }
                F = F.F(str2, str);
                if (anonymousClass2Rr.f30514B != null) {
                    F.F("phone_id", anonymousClass2Rr.f30514B.toString());
                }
                anonymousClass2Rr.toString();
                F.R();
            }
            i++;
        }
    }
}
