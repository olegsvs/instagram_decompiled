package X;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.facebook.C0164R;
import java.util.List;

/* renamed from: X.53I */
public final class AnonymousClass53I extends AnonymousClass1Pn {
    /* renamed from: B */
    public AnonymousClass5YJ f59593B;
    /* renamed from: C */
    private int f59594C;
    /* renamed from: D */
    private AnonymousClass0Cm f59595D;

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1827977920);
        super.onCreate(bundle);
        this.f59595D = AnonymousClass0Ce.G(getArguments());
        this.f59594C = getArguments().getInt("arg_selected_account_color", AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5));
        AnonymousClass0cQ.G(this, 1330034488, F);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        List H = AnonymousClass0Cd.f1698B.H();
        boolean B = AnonymousClass0IF.B();
        View recyclerView = new RecyclerView(getContext());
        AnonymousClass0la anonymousClass0rr = new AnonymousClass0rr(getContext(), 1, false);
        anonymousClass0rr.f9543B = true;
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(anonymousClass0rr);
        recyclerView.setAdapter(new AnonymousClass53H(getContext(), this.f59595D, H, B, this.f59594C, new AnonymousClass5ZE(this)));
        return new AnonymousClass0Sb(getContext()).T(recyclerView).E(true).F(true).C();
    }
}
