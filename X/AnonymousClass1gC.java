package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.1gC */
public final class AnonymousClass1gC implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1fo f21310B;

    public AnonymousClass1gC(AnonymousClass1fo anonymousClass1fo) {
        this.f21310B = anonymousClass1fo;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.m5863M(this, 717391358);
        AnonymousClass1fo anonymousClass1fo = this.f21310B;
        AnonymousClass0Ie anonymousClass0Ie = anonymousClass1fo.f21259I;
        AnonymousClass0Cn anonymousClass0Cn = anonymousClass1fo.f21270T;
        String id = anonymousClass1fo.f21253C.pT().getId();
        AnonymousClass2zD anonymousClass2zD = AnonymousClass2zD.f36638D;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Ie.schedule(anonymousClass0Pt.m3943L("friendships/%s/%s/feed/", anonymousClass2zD.A(), id).m3935D(MemoryDumpUploadJob.EXTRA_USER_ID, id).m3944M(AnonymousClass11j.class).m3945N().m3939H());
        anonymousClass1fo.f21253C.pT().AB = null;
        anonymousClass1fo.f21259I.m6711K(true);
        anonymousClass1fo.f21259I.m6704D(false, anonymousClass1fo.f21253C.EQ());
        AnonymousClass0cQ.m5862L(this, -1408514635, M);
    }
}
