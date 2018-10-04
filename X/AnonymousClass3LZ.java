package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

/* renamed from: X.3LZ */
public final class AnonymousClass3LZ {
    /* renamed from: B */
    private final Activity f40361B;
    /* renamed from: C */
    private final Handler f40362C = new Handler(Looper.getMainLooper());
    /* renamed from: D */
    private AnonymousClass3La f40363D;

    public AnonymousClass3LZ(Activity activity) {
        this.f40361B = activity;
    }

    /* renamed from: A */
    public final void m19437A(TextView textView, String str, int i, AnonymousClass0ui anonymousClass0ui, AnonymousClass178 anonymousClass178, AnonymousClass177 anonymousClass177, boolean z) {
        AnonymousClass3La anonymousClass3La = this.f40363D;
        if (anonymousClass3La != null) {
            if (!anonymousClass3La.f40364B) {
                AnonymousClass0OR.G(this.f40362C, this.f40363D, 336188680);
            } else {
                return;
            }
        }
        this.f40363D = new AnonymousClass3La(textView, this.f40361B, str, i, anonymousClass0ui, anonymousClass178, anonymousClass177, z);
        AnonymousClass0OR.F(this.f40362C, this.f40363D, 1000, -632696620);
    }
}
