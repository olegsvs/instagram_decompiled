package X;

import android.content.Context;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.4Gz */
public final class AnonymousClass4Gz implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ MediaCaptureActivity f52254B;

    public AnonymousClass4Gz(MediaCaptureActivity mediaCaptureActivity) {
        this.f52254B = mediaCaptureActivity;
    }

    public final void run() {
        MediaCaptureActivity mediaCaptureActivity;
        if (this.f52254B.f4070H.f38949C != null) {
            mediaCaptureActivity = this.f52254B;
            if (PendingMediaStore.C().A(mediaCaptureActivity.f4070H.f38949C).iC != AnonymousClass0OC.DRAFT) {
                mediaCaptureActivity.My();
            } else {
                mediaCaptureActivity.Dc();
            }
            return;
        }
        AnonymousClass0OA A = PendingMediaStore.C().A(this.f52254B.f4070H.m18973J());
        if (A.s()) {
            mediaCaptureActivity = this.f52254B;
            A.SC = mediaCaptureActivity.f4070H.m18968E().f39002P;
            A.f3795I = mediaCaptureActivity.f4070H.m18966C();
            AnonymousClass0GK.L(A);
            if (A.DB == null) {
                AnonymousClass0F4.f2058E.C(new AnonymousClass3IG(A.UB, true));
            } else {
                mediaCaptureActivity.Dc();
            }
            return;
        }
        Context context = this.f52254B;
        if (!A.NB || A.SC == null || A.DB == null) {
            AnonymousClass3Gu anonymousClass3zI = new AnonymousClass3zI(context, context.VK().m18967D(), context.f4065C, new AnonymousClass4Gx(context, A), context.VK().f38950D, context.VK().f38961O);
            boolean z = true;
            AnonymousClass3Gv[] anonymousClass3GvArr = new AnonymousClass3Gv[]{AnonymousClass3Gv.UPLOAD};
            AnonymousClass3zH gQ = context.gQ(context.VK().m18974K());
            Object obj = (gQ == null || !gQ.m21868E(anonymousClass3zI, context.f4070H.m18969F(), anonymousClass3GvArr)) ? null : 1;
            if (obj != null) {
                context.f4065C.m19016B(AnonymousClass3Cc.PROCESSING);
                return;
            }
            Toast.makeText(context, C0164R.string.unable_to_save_image, 0).show();
            boolean z2 = gQ != null;
            boolean z3 = context.f4070H.m18969F() != null;
            boolean z4 = A.DB != null;
            if (A.SC == null) {
                z = false;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Has ImageRenderer: ");
            stringBuilder.append(z2);
            stringBuilder.append(" Has FilterGroup: ");
            stringBuilder.append(z3);
            stringBuilder.append(" Has ImageFilePath: ");
            stringBuilder.append(z4);
            stringBuilder.append(" Has Original photo: ");
            stringBuilder.append(z);
            AnonymousClass0Gn.H("MediaCaptureActivity_SaveDraftFailure", stringBuilder.toString());
            return;
        }
        context.rE();
        context.Dc();
    }
}
