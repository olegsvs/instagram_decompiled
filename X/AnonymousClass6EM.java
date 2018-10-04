package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.facebook.C0164R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6EM */
public final class AnonymousClass6EM extends AnonymousClass0Ie implements AnonymousClass0gg {
    /* renamed from: B */
    public AnonymousClass5pi f73184B;
    /* renamed from: C */
    public AnonymousClass0Cm f73185C;

    public final String getModuleName() {
        return "side_tray_profile";
    }

    public final Map GIA() {
        return AnonymousClass3lj.B(new HashMap(), this.f73185C.B());
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -123991922);
        super.onCreate(bundle);
        this.f73185C = AnonymousClass0Ce.G(getArguments());
        ListAdapter anonymousClass5pi = new AnonymousClass5pi(this.f73185C, this);
        this.f73184B = anonymousClass5pi;
        setListAdapter(anonymousClass5pi);
        AnonymousClass0cQ.G(this, 763898070, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1087623193);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_profile_slideout_tray, viewGroup, false);
        AnonymousClass0cQ.G(this, 1040458213, F);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(C0164R.id.menu_settings_row).setOnClickListener(new AnonymousClass5pp(this));
    }
}
