package X;

import android.os.Bundle;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.4zs */
public final class AnonymousClass4zs extends AnonymousClass0TM implements AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass0Cm f59177B;

    public final String getModuleName() {
        return "manage_saved_login";
    }

    /* renamed from: B */
    public static void m25556B(AnonymousClass4zs anonymousClass4zs) {
        Collection arrayList = new ArrayList();
        String str = anonymousClass4zs.f59177B.f1759C;
        arrayList.add(new AnonymousClass1To(C0164R.string.save_login_info_switch_text, AnonymousClass0dp.B().G(str), new AnonymousClass4zo(anonymousClass4zs), new AnonymousClass4zp(anonymousClass4zs, str)));
        arrayList.add(new AnonymousClass2JP(anonymousClass4zs.getString(C0164R.string.save_login_info_switch_description)));
        anonymousClass4zs.setItems(arrayList);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.h(C0164R.string.manage_saved_login);
        anonymousClass0eT.n(true);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -7482423);
        super.onCreate(bundle);
        this.f59177B = AnonymousClass0Ce.G(getArguments());
        AnonymousClass0cQ.G(this, 541545386, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1210327061);
        super.onResume();
        AnonymousClass4zs.m25556B(this);
        AnonymousClass0cQ.G(this, 691635260, F);
    }
}
