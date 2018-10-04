package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.0ss */
public final class AnonymousClass0ss {
    /* renamed from: B */
    public static void m8140B(AnonymousClass0st anonymousClass0st, AnonymousClass0mp anonymousClass0mp, AnonymousClass0mq anonymousClass0mq, AnonymousClass0j9 anonymousClass0j9, boolean z) {
        if (z) {
            anonymousClass0st.f11554C.setBackgroundColor(-1);
        }
        if (anonymousClass0mp.f9909E != null) {
            anonymousClass0st.m8142A().setUrl(anonymousClass0mp.f9909E);
            anonymousClass0st.m8142A().setVisibility(0);
        } else {
            AnonymousClass0Nm.m3436O(anonymousClass0st.f11555D);
        }
        anonymousClass0st.f11558G.setText(anonymousClass0mp.f9912H);
        anonymousClass0st.f11557F.setText(anonymousClass0mp.f9911G);
        anonymousClass0st.f11553B.setText(anonymousClass0mp.f9907C);
        anonymousClass0st.f11553B.setOnClickListener(new AnonymousClass1V5(anonymousClass0j9, anonymousClass0mp, anonymousClass0mq));
    }

    /* renamed from: C */
    public static View m8141C(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.simple_action, viewGroup, false);
        inflate.setTag(new AnonymousClass0st(inflate.findViewById(C0164R.id.simple_action_container), (TextView) inflate.findViewById(C0164R.id.sa_title), (TextView) inflate.findViewById(C0164R.id.sa_subtitle), (TextView) inflate.findViewById(C0164R.id.sa_button), (ViewStub) inflate.findViewById(C0164R.id.sa_icon_viewstub)));
        return inflate;
    }
}
