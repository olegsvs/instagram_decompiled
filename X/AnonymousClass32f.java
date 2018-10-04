package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.32f */
public final class AnonymousClass32f implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass32g f37245B;
    /* renamed from: C */
    public final /* synthetic */ File f37246C;

    public AnonymousClass32f(AnonymousClass32g anonymousClass32g, File file) {
        this.f37245B = anonymousClass32g;
        this.f37246C = file;
    }

    public final void run() {
        if (((Integer) AnonymousClass0CC.PL.H(this.f37245B.f37247B.f21101I)).intValue() == 1) {
            AnonymousClass0PH anonymousClass0PH = this.f37245B.f37247B.f21094B;
            Parcelable fromFile = Uri.fromFile(this.f37246C);
            AnonymousClass0g0 anonymousClass0g0 = AnonymousClass0g0.PROFILE_PHOTO;
            AnonymousClass2NY.m15349C(AnonymousClass0g1.PROFILE);
            Intent C = AnonymousClass0EM.f1972B.C(anonymousClass0PH.f4058C);
            C.putExtra("isCrop", true);
            C.putExtra("CropFragment.imageUri", fromFile);
            C.putExtra("captureType", anonymousClass0g0.ordinal());
            C.putExtra("captureConfig", new AnonymousClass1Kx(anonymousClass0g0).A());
            C.putExtra("IgSessionManager.USER_ID", anonymousClass0PH.f4059D.getId());
            anonymousClass0PH.f4057B.jUA(C, 10001);
        } else if (((Integer) AnonymousClass0CC.PL.H(this.f37245B.f37247B.f21101I)).intValue() == 2) {
            AnonymousClass1fF.D(this.f37245B.f37247B, Uri.fromFile(this.f37246C));
        } else {
            throw new UnsupportedOperationException("External load type not supported");
        }
    }
}
