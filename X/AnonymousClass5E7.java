package X;

import android.os.FileObserver;

/* renamed from: X.5E7 */
public final class AnonymousClass5E7 extends FileObserver {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5E8 f61389B;

    public AnonymousClass5E7(AnonymousClass5E8 anonymousClass5E8, String str) {
        this.f61389B = anonymousClass5E8;
        super(str);
    }

    public final void onEvent(int i, String str) {
        if ((i == 256 || i == 32) && str != null) {
            AnonymousClass0Sy.G(new AnonymousClass5E6(this, str));
        }
    }
}
