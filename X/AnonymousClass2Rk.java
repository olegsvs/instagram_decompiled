package X;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.facebook.login.LoginClient$Request;

/* renamed from: X.2Rk */
public final class AnonymousClass2Rk extends AnonymousClass0IK {
    /* renamed from: B */
    public String f30502B;
    /* renamed from: C */
    private String f30503C;
    /* renamed from: D */
    private AnonymousClass2Rj f30504D;

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AnonymousClass2Rj anonymousClass2Rj = this.f30504D;
        if (AnonymousClass2Rj.m15751C(anonymousClass2Rj) != null) {
            AnonymousClass2Rj.m15751C(anonymousClass2Rj).onActivityResult(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1782361083);
        super.onCreate(bundle);
        this.f30503C = getActivity().getCallingPackage();
        LoginClient$Request loginClient$Request = (LoginClient$Request) getActivity().getIntent().getExtras().getParcelable("Request");
        int i = -1;
        if (bundle != null) {
            i = bundle.getInt("HandlerIndex", -1);
            loginClient$Request = (LoginClient$Request) bundle.getParcelable("Request");
        }
        this.f30504D = new AnonymousClass2Rj(this, loginClient$Request, i);
        this.f30502B = loginClient$Request.f24263F;
        AnonymousClass0cQ.G(this, 147861859, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1612693680);
        View inflate = layoutInflater.inflate(C0164R.layout.com_facebook_login_fragment, viewGroup, false);
        AnonymousClass0cQ.G(this, 317660332, F);
        return inflate;
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 583866848);
        super.onPause();
        getActivity().findViewById(C0164R.id.com_facebook_login_activity_progress_bar).setVisibility(8);
        AnonymousClass0cQ.G(this, 1736606090, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 832481579);
        super.onResume();
        if (this.f30503C == null) {
            Log.e("LoginFragment", "Cannot call LoginActivity with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            getActivity().finish();
            AnonymousClass0cQ.G(this, -1425557433, F);
            return;
        }
        AnonymousClass2Rj anonymousClass2Rj = this.f30504D;
        if (anonymousClass2Rj.f30497C == -1) {
            anonymousClass2Rj.m15752D();
        }
        AnonymousClass0cQ.G(this, -1297547174, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("Request", this.f30504D.f30499E);
        bundle.putInt("HandlerIndex", this.f30504D.f30497C);
    }
}
