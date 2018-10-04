package X;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.4d9 */
public final class AnonymousClass4d9 extends AnonymousClass0IJ implements AnonymousClass3ih, AnonymousClass0IS {
    /* renamed from: B */
    public AnonymousClass5Vn f55815B;
    /* renamed from: C */
    public int f55816C;
    /* renamed from: D */
    private AnonymousClass4im f55817D;
    /* renamed from: E */
    private AnonymousClass0Cm f55818E;
    /* renamed from: F */
    private String f55819F;

    public final void Tp() {
    }

    public final void Up(int i) {
    }

    public final void We() {
    }

    public final void Xe(int i, int i2) {
    }

    public final String getModuleName() {
        return "direct_video_call_add_users_sheet";
    }

    public final boolean nW() {
        return true;
    }

    public final int FK() {
        return this.f55816C;
    }

    public final float PW() {
        return AnonymousClass0bz.f6937R;
    }

    public final boolean VY() {
        AnonymousClass5Vn anonymousClass5Vn = this.f55815B;
        if (anonymousClass5Vn != null) {
            Object obj;
            AnonymousClass5Vo anonymousClass5Vo = anonymousClass5Vn.f65427C;
            RecyclerView recyclerView = anonymousClass5Vo.f65430D;
            if (!(recyclerView == null || recyclerView.getChildCount() == 0)) {
                if (anonymousClass5Vo.f65430D.computeVerticalScrollOffset() != 0) {
                    obj = null;
                    if (obj != null) {
                        return false;
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                return false;
            }
        }
        return true;
    }

    public final View oS() {
        return getView();
    }

    public final boolean onBackPressed() {
        if (getView() != null) {
            AnonymousClass0Nm.N(getView());
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1833183937);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f55818E = AnonymousClass0Ce.G(arguments);
        this.f55819F = arguments.getString("DirectVideoCallAddUsersFragment.video_call_id");
        this.f55817D = new AnonymousClass4im(new AnonymousClass5Vm(this));
        AnonymousClass0cQ.G(this, 1880739064, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -389965042);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_direct_video_call_add_users, viewGroup, false);
        AnonymousClass0cQ.G(this, 475943502, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -92403245);
        super.onDestroyView();
        AnonymousClass5Vn anonymousClass5Vn = this.f55815B;
        anonymousClass5Vn.f65427C.f65428B = null;
        anonymousClass5Vn.f65427C.f65431E = null;
        anonymousClass5Vn.f65426B.m24610A(null);
        this.f55815B = null;
        AnonymousClass0cQ.G(this, 1275003465, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1861304251);
        super.onPause();
        AnonymousClass4im anonymousClass4im = this.f55817D;
        if (anonymousClass4im != null) {
            anonymousClass4im.m24857G();
        }
        AnonymousClass0cQ.G(this, 574520141, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -623767101);
        super.onResume();
        AnonymousClass0cQ.G(this, 537163911, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, -585399472);
        super.onStart();
        AnonymousClass0CC.AI.E(this.f55818E);
        AnonymousClass0cQ.G(this, 551599558, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass5Vo anonymousClass5Vo = new AnonymousClass5Vo(this.f55818E, this.f55817D, (RecyclerView) view.findViewById(C0164R.id.add_users_recycler_view));
        AnonymousClass0Cm anonymousClass0Cm = this.f55818E;
        Context context = getContext();
        AnonymousClass0IP anonymousClass0Px = new AnonymousClass0Px(getContext(), getLoaderManager());
        this.f55815B = new AnonymousClass5Vn(anonymousClass5Vo, new AnonymousClass4dA(this, anonymousClass0Cm, AnonymousClass1T2.B(context, anonymousClass0Cm, anonymousClass0Px, this, "coefficient_direct_recipients_ranking_variant_2", false, "reshare"), AnonymousClass0Uc.B(anonymousClass0Cm), this.f55819F));
    }
}
