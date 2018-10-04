package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.31Z */
public final class AnonymousClass31Z implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1gn f37097B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5pB f37098C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass32F f37099D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Ci f37100E;

    public AnonymousClass31Z(AnonymousClass1gn anonymousClass1gn, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass32F anonymousClass32F, AnonymousClass5pB anonymousClass5pB) {
        this.f37097B = anonymousClass1gn;
        this.f37100E = anonymousClass0Ci;
        this.f37099D = anonymousClass32F;
        this.f37098C = anonymousClass5pB;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass1gn anonymousClass1gn = this.f37097B;
        AnonymousClass0Ci anonymousClass0Ci = this.f37100E;
        AnonymousClass32F anonymousClass32F = this.f37099D;
        AnonymousClass5pB anonymousClass5pB = this.f37098C;
        AnonymousClass0IP anonymousClass0IP = anonymousClass1gn.f21436E;
        AnonymousClass0GA B = AnonymousClass1YE.B(anonymousClass1gn.f21437F, anonymousClass1gn.f21434C, anonymousClass32F, new ArrayList(), Collections.singletonList(anonymousClass0Ci.getId()));
        B.f2849B = new AnonymousClass31V(anonymousClass1gn, anonymousClass5pB, anonymousClass0Ci);
        anonymousClass0IP.schedule(B);
    }
}
