package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.110 */
public final class AnonymousClass110 extends Handler {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0kn f13354B;

    public AnonymousClass110(AnonymousClass0kn anonymousClass0kn) {
        this.f13354B = anonymousClass0kn;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            switch (i) {
                case 2:
                    this.f13354B.f9373H = true;
                    return;
                case 3:
                    if (this.f13354B.f9367B.hasWindowFocus()) {
                        AnonymousClass0PY anonymousClass0PY = this.f13354B.f9371F;
                        Object obj = 1;
                        if (anonymousClass0PY != null) {
                            if (anonymousClass0PY.f4088K.f8706B.m7143B()) {
                                obj = null;
                            }
                        }
                        if (obj != null) {
                            AnonymousClass0kn anonymousClass0kn = this.f13354B;
                            anonymousClass0kn.m7216A(anonymousClass0kn.f9375J);
                            return;
                        }
                    }
                    AnonymousClass0kn.m7214E(this.f13354B);
                    return;
                case 4:
                    this.f13354B.f9378M.setCanceledOnTouchOutside(true);
                    return;
                default:
                    return;
            }
        } else if (this.f13354B.f9369D != null) {
            this.f13354B.f9369D.dismiss();
        }
    }
}
