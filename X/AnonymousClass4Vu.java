package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.MediaSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4Vu */
public final class AnonymousClass4Vu extends AnonymousClass0TA {
    /* renamed from: B */
    public final Set f54781B = new HashSet();
    /* renamed from: C */
    public final Context f54782C;
    /* renamed from: D */
    public final AnonymousClass0PJ f54783D;
    /* renamed from: E */
    public final AnonymousClass0Cm f54784E;

    public final int getViewTypeCount() {
        return 3;
    }

    public AnonymousClass4Vu(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0PJ anonymousClass0PJ) {
        this.f54782C = context;
        this.f54784E = anonymousClass0Cm;
        this.f54783D = anonymousClass0PJ;
    }

    /* renamed from: B */
    private static View m24394B(int i, ViewGroup viewGroup, CreationSession creationSession) {
        if (i == 0) {
            i = new AnonymousClass4H5(creationSession);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.layout_album_preview, viewGroup, false);
            inflate.setTag(new AnonymousClass4Vt(inflate, i));
            return inflate;
        } else if (i == 1) {
            return AnonymousClass4HC.m23733C(viewGroup);
        } else {
            return AnonymousClass4HE.m23735C(viewGroup);
        }
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Object obj3 = obj;
        int I = AnonymousClass0cQ.I(this, -372447327);
        CreationSession creationSession = (CreationSession) obj3;
        int i2 = i;
        if (view == null) {
            view = AnonymousClass4Vu.m24394B(i2, viewGroup, creationSession);
        }
        int I2 = AnonymousClass0cQ.I(r3, 2055338910);
        if (i == 0) {
            AnonymousClass4Vt anonymousClass4Vt = (AnonymousClass4Vt) view.getTag();
            AnonymousClass0Cm anonymousClass0Cm = r3.f54784E;
            Context context = r3.f54782C;
            AnonymousClass0PJ anonymousClass0PJ = r3.f54783D;
            Set set = r3.f54781B;
            anonymousClass4Vt.f54779B.setPageSpacing(0.0f);
            anonymousClass4Vt.f54779B.A(new AnonymousClass4Vs(anonymousClass4Vt, set, creationSession, anonymousClass0Cm, context, anonymousClass0PJ));
            AnonymousClass4Vt.m24393B(anonymousClass4Vt, 0, creationSession, anonymousClass0Cm, context, anonymousClass0PJ, set);
        } else if (i2 == 1) {
            AnonymousClass0OA LP = r3.f54783D.LP(((MediaSession) creationSession.m18972I().get(0)).m18991B());
            AnonymousClass4HB anonymousClass4HB = (AnonymousClass4HB) view.getTag();
            int width = LP.I().width();
            int height = LP.I().height();
            AnonymousClass4HC.m23732B(anonymousClass4HB, LP, LP.f3830r % 180 == 0 ? ((float) width) / ((float) height) : ((float) height) / ((float) width));
        } else {
            AnonymousClass0OA LP2 = r3.f54783D.LP(((MediaSession) creationSession.m18972I().get(0)).m18991B());
            AnonymousClass4HD anonymousClass4HD = (AnonymousClass4HD) view.getTag();
            r3.f54781B.remove(anonymousClass4HD.f52303B);
            r3.f54781B.add(AnonymousClass4HE.m23734B(anonymousClass4HD, LP2, LP2.f3795I, r3.f54782C, r3.f54784E));
        }
        AnonymousClass0cQ.H(r3, -667994412, I2);
        AnonymousClass0cQ.H(r3, 1015174383, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        CreationSession creationSession = (CreationSession) obj;
        Void voidR = (Void) obj2;
        if (creationSession.m18980Q()) {
            anonymousClass0p9.A(0);
        } else if (((MediaSession) creationSession.m18972I().get(0)).f38977C == AnonymousClass3CD.PHOTO) {
            anonymousClass0p9.A(1);
        } else {
            anonymousClass0p9.A(2);
        }
    }
}
