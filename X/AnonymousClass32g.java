package X;

import android.graphics.Bitmap;
import com.facebook.C0164R;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.io.File;

/* renamed from: X.32g */
public final class AnonymousClass32g extends AnonymousClass17n {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1fF f37247B;
    /* renamed from: C */
    public final /* synthetic */ int f37248C;

    public AnonymousClass32g(AnonymousClass1fF anonymousClass1fF, int i) {
        this.f37247B = anonymousClass1fF;
        this.f37248C = i;
    }

    /* renamed from: A */
    public final void m18277A(Exception exception) {
        AnonymousClass32T.m18269C(this.f37247B.f21095C.getContext(), C0164R.string.could_not_update_profile_picture);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m18278B(Object obj) {
        AnonymousClass0OR.D(AnonymousClass1fF.f21093K, new AnonymousClass32f(this, (File) obj), 1206991800);
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Bitmap B = AnonymousClass32Q.m18264B(this.f37247B.f21095C.getContext(), this.f37247B.f21101I, this.f37248C, null);
        File file = new File(this.f37247B.f21095C.getContext().getFilesDir(), "avatar_temp/");
        file.mkdirs();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(System.currentTimeMillis());
        stringBuilder.append(".jpg");
        File file2 = new File(file, stringBuilder.toString());
        Object obj = (B == null || !AnonymousClass0rm.R(B, file2)) ? null : 1;
        if (obj != null) {
            return file2;
        }
        throw new Exception();
    }

    public final void onFinish() {
        super.onFinish();
        AnonymousClass0OR.D(AnonymousClass1fF.f21093K, new AnonymousClass32e(this), 875442228);
    }

    public final void onStart() {
        super.onStart();
        new AnonymousClass2Hg().D(this.f37247B.f21096D, ReactProgressBarViewManager.PROP_PROGRESS);
    }
}
