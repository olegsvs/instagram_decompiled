package X;

import android.graphics.Rect;
import android.widget.Toast;
import com.facebook.C0164R;
import java.io.File;
import java.util.concurrent.ExecutionException;

/* renamed from: X.4Ka */
public final class AnonymousClass4Ka extends AnonymousClass3sw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0eB f52833B;

    public AnonymousClass4Ka(AnonymousClass0eB anonymousClass0eB) {
        this.f52833B = anonymousClass0eB;
    }

    /* renamed from: A */
    public final void mo5128A(Exception exception) {
        Object obj;
        this.f52833B.f7605S.m23919F();
        if (!(exception instanceof AnonymousClass2Pg)) {
            if (!(exception instanceof ExecutionException) || !(exception.getCause() instanceof AnonymousClass2Pg)) {
                obj = null;
                if (obj != null) {
                    Toast.makeText(this.f52833B.f7588B, C0164R.string.video_recorded_too_short, 0).show();
                }
                AnonymousClass5Td.C(this.f52833B.f7611Y.f7385Y.f64317I, true);
            }
        }
        obj = 1;
        if (obj != null) {
            Toast.makeText(this.f52833B.f7588B, C0164R.string.video_recorded_too_short, 0).show();
        }
        AnonymousClass5Td.C(this.f52833B.f7611Y.f7385Y.f64317I, true);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void mo5129B(Object obj) {
        String str = (String) obj;
        AnonymousClass4Ka anonymousClass4Ka = this;
        this.f52833B.f7605S.m23918C();
        if (this.f52833B.f7627o) {
            String str2;
            boolean z;
            AnonymousClass0eB.K(this.f52833B).XB = AnonymousClass3FO.CAMERA;
            File file = this.f52833B.hB;
            AnonymousClass2nq anonymousClass2nq = this.f52833B.iB;
            AnonymousClass2nA cameraFacing = this.f52833B.f7596J.getCameraFacing();
            Rect I = AnonymousClass3nk.m20691I(anonymousClass2nq.f34097D, anonymousClass2nq.f34096C);
            if (AnonymousClass2nA.FRONT.equals(cameraFacing)) {
                str2 = "front";
                z = true;
            } else {
                str2 = "back";
                z = false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            AnonymousClass3nn anonymousClass3nn = new AnonymousClass3nn(anonymousClass2nq.f34097D, anonymousClass2nq.f34096C, anonymousClass2nq.f34098E, str2, z, file, false, currentTimeMillis, currentTimeMillis, true);
            anonymousClass3nn.f44617D = anonymousClass2nq.f34095B;
            anonymousClass3nn.f44620G = I.left;
            anonymousClass3nn.f44622I = I.top;
            anonymousClass3nn.f44621H = I.right;
            anonymousClass3nn.f44619F = I.bottom;
            if (anonymousClass4Ka.f52833B.gB) {
                AnonymousClass0eB.W(anonymousClass4Ka.f52833B, anonymousClass3nn);
            }
            if (AnonymousClass3G8.m19170B()) {
                anonymousClass3nn.f44616C = AnonymousClass3nk.m20688F(anonymousClass3nn.m20698A());
            }
            if (anonymousClass4Ka.f52833B.f7605S.f52869C == AnonymousClass3DU.MUSIC) {
                anonymousClass3nn.f44637X = anonymousClass4Ka.f52833B.f7637y.f64587D.f64627C.A();
            }
            anonymousClass4Ka.f52833B.f7611Y.T(anonymousClass3nn);
            return;
        }
        this.f52833B.f7596J.mo5403W(false);
    }
}
