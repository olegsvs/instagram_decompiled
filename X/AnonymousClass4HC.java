package X;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import java.io.File;

/* renamed from: X.4HC */
public final class AnonymousClass4HC {
    /* renamed from: B */
    public static void m23732B(AnonymousClass4HB anonymousClass4HB, AnonymousClass0OA anonymousClass0OA, float f) {
        anonymousClass4HB.f52301B.setAspectRatio(f);
        anonymousClass4HB.f52302C.setUrl(Uri.fromFile(new File(anonymousClass0OA.DB)).toString());
        AnonymousClass3Hd.m19255B(new AnonymousClass3Cf(), anonymousClass4HB.f52301B, null, null);
    }

    /* renamed from: C */
    public static View m23733C(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.layout_photo_preview, viewGroup, false);
        inflate.setTag(new AnonymousClass4HB(inflate));
        return inflate;
    }
}
