package X;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.PhotoSession;

/* renamed from: X.4YM */
public final class AnonymousClass4YM implements AnonymousClass0PR {
    /* renamed from: B */
    public final /* synthetic */ Context f55136B;
    /* renamed from: C */
    public final /* synthetic */ CreationSession f55137C;
    /* renamed from: D */
    public final /* synthetic */ boolean f55138D;

    public AnonymousClass4YM(Context context, CreationSession creationSession, boolean z) {
        this.f55136B = context;
        this.f55137C = creationSession;
        this.f55138D = z;
    }

    public final void GE() {
        FragmentActivity fragmentActivity = (FragmentActivity) this.f55136B;
        if (!AnonymousClass0cJ.E(fragmentActivity.D())) {
            return;
        }
        if (this.f55137C.f38951E == AnonymousClass0g0.PROFILE_PHOTO) {
            String K = this.f55137C.m18974K();
            String J = this.f55137C.m18973J();
            Intent intent = new Intent(K);
            intent.putExtra(AnonymousClass2Mg.f29573B, J);
            fragmentActivity.setResult(-1, intent);
            fragmentActivity.finish();
        } else if (this.f55138D) {
            PhotoSession D = this.f55137C.m18967D();
            D.f38987J = D.f38982E.m22015D();
            AnonymousClass3HZ.m19251B(new AnonymousClass3zR());
        } else {
            AnonymousClass3HZ.m19251B(new AnonymousClass3zb());
        }
    }
}
