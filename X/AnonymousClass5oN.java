package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.C0164R;

/* renamed from: X.5oN */
public final class AnonymousClass5oN extends AnonymousClass0IJ implements AnonymousClass0IT {
    /* renamed from: B */
    public EditText f69098B;
    /* renamed from: C */
    public final Handler f69099C = new Handler(Looper.getMainLooper());
    /* renamed from: D */
    public boolean f69100D;
    /* renamed from: E */
    public AnonymousClass0Cm f69101E;
    /* renamed from: F */
    private boolean f69102F;
    /* renamed from: G */
    private int f69103G;

    public final String getModuleName() {
        return "change_email";
    }

    /* renamed from: B */
    private void m28468B(int i) {
        if (Z() instanceof AnonymousClass0Hj) {
            ((AnonymousClass0Hj) Z()).CSA(i);
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.g(C0164R.string.change_email, new AnonymousClass5oK(this));
        anonymousClass0eT.Y(this.f69100D);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1603205366);
        super.onCreate(bundle);
        this.f69101E = AnonymousClass0Ce.G(getArguments());
        AnonymousClass0cQ.G(this, 1388817163, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 553942326);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_change_email, viewGroup, false);
        EditText editText = (EditText) inflate.findViewById(C0164R.id.current_email);
        this.f69098B = editText;
        editText.setText(getArguments().getString("email"));
        AnonymousClass0cQ.G(this, 327600579, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1789857438);
        super.onDestroyView();
        this.f69098B = null;
        AnonymousClass0cQ.G(this, -731046530, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 2084273863);
        super.onPause();
        getActivity().setRequestedOrientation(this.f69103G);
        Z().getWindow().setSoftInputMode(48);
        AnonymousClass0Nm.N(getView());
        AnonymousClass0cQ.G(this, 1472302734, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1452149132);
        super.onResume();
        this.f69103G = getActivity().getRequestedOrientation();
        getActivity().setRequestedOrientation(-1);
        Z().getWindow().setSoftInputMode(16);
        if (!this.f69102F) {
            this.f69098B.requestFocus();
            AnonymousClass0Nm.k(this.f69098B);
            this.f69102F = true;
        }
        AnonymousClass0cQ.G(this, -1484911572, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, 408432274);
        super.onStart();
        m28468B(8);
        AnonymousClass0cQ.G(this, -1104412843, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, 1721149853);
        super.onStop();
        m28468B(0);
        AnonymousClass0cQ.G(this, -1604745066, F);
    }
}
