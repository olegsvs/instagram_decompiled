package X;

import android.graphics.BitmapFactory;
import android.net.Uri;
import com.instagram.common.gallery.Draft;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.24l */
public final class AnonymousClass24l implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass24o f25653B;
    /* renamed from: C */
    public final /* synthetic */ Draft f25654C;
    /* renamed from: D */
    public final /* synthetic */ WeakReference f25655D;

    public AnonymousClass24l(AnonymousClass24o anonymousClass24o, Draft draft, WeakReference weakReference) {
        this.f25653B = anonymousClass24o;
        this.f25654C = draft;
        this.f25655D = weakReference;
    }

    public final void run() {
        AnonymousClass0RL anonymousClass0RL = this.f25653B;
        Draft draft = this.f25654C;
        WeakReference weakReference = this.f25655D;
        AnonymousClass24n anonymousClass24n = (AnonymousClass24n) weakReference.get();
        if (anonymousClass24n != null && anonymousClass24n.qX(draft)) {
            AnonymousClass0RJ D;
            AnonymousClass0RJ C;
            BitmapFactory.decodeFile(draft.f30890B, anonymousClass0RL.f25658B);
            int i = anonymousClass0RL.f25658B.outWidth;
            int i2 = anonymousClass0RL.f25658B.outHeight;
            int i3 = 1;
            while (true) {
                int i4 = i / i3;
                int i5 = anonymousClass0RL.f25659C;
                if (i4 <= i5 || i2 / i3 <= i5) {
                    D = AnonymousClass0Gs.f2431j.D(Uri.fromFile(new File(draft.f30890B)).toString());
                    D.f4635F = false;
                    D.f4646Q = new AnonymousClass24m(draft, weakReference);
                    C = D.C(anonymousClass0RL);
                    C.f4636G = i3;
                    C.B();
                } else {
                    i3 *= 2;
                }
            }
            D = AnonymousClass0Gs.f2431j.D(Uri.fromFile(new File(draft.f30890B)).toString());
            D.f4635F = false;
            D.f4646Q = new AnonymousClass24m(draft, weakReference);
            C = D.C(anonymousClass0RL);
            C.f4636G = i3;
            C.B();
        }
    }
}
