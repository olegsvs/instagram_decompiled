package X;

import android.content.Context;
import android.widget.BaseAdapter;
import com.facebook.C0164R;
import com.instagram.ui.widget.base.TriangleSpinner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.53N */
public final class AnonymousClass53N implements AnonymousClass1gL, AnonymousClass1gM {
    /* renamed from: B */
    public AnonymousClass53P f59603B;
    /* renamed from: C */
    public AnonymousClass53C f59604C;
    /* renamed from: D */
    public final AnonymousClass0Cm f59605D;
    /* renamed from: E */
    private final AnonymousClass0IL f59606E;

    public final void Bg() {
    }

    public final void qf() {
    }

    public final void rf(AnonymousClass4qb anonymousClass4qb) {
    }

    public final void vf(AnonymousClass0Ci anonymousClass0Ci) {
    }

    public AnonymousClass53N(AnonymousClass0IL anonymousClass0IL, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE) {
        this.f59606E = anonymousClass0IL;
        this.f59605D = anonymousClass0Cm;
        if (((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.eG)).booleanValue()) {
            this.f59603B = new AnonymousClass53P(anonymousClass0IL, anonymousClass0Cm, this);
        }
    }

    /* renamed from: A */
    public final boolean m25641A(AnonymousClass0eT anonymousClass0eT) {
        AnonymousClass53N anonymousClass53N = this;
        if (this.f59606E.isAdded()) {
            Object obj = 1;
            if (AnonymousClass0Cd.f1698B.H().size() <= 1 || !((Boolean) AnonymousClass0CC.dG.G()).booleanValue()) {
                obj = null;
            }
            if (obj != null) {
                List arrayList = new ArrayList(AnonymousClass0Cd.f1698B.H());
                TriangleSpinner triangleSpinner = (TriangleSpinner) anonymousClass0eT.X(C0164R.layout.multiple_accounts_spinner, 0, 0).findViewById(C0164R.id.spinner);
                triangleSpinner.setPopupBackgroundResource(C0164R.drawable.fb_bridge_shadow);
                triangleSpinner.setDropDownWidth(this.f59606E.getContext().getResources().getDisplayMetrics().widthPixels);
                anonymousClass53N.f59604C = new AnonymousClass53C(this.f59606E.getActivity(), anonymousClass53N, arrayList, this.f59605D, true, true);
                AnonymousClass53P anonymousClass53P = anonymousClass53N.f59603B;
                if (anonymousClass53P != null) {
                    anonymousClass53P.m25643A();
                }
                triangleSpinner.setOnTouchListener(new AnonymousClass53M(anonymousClass53N));
                triangleSpinner.setAdapter(anonymousClass53N.f59604C);
                triangleSpinner.setOnItemSelectedListener(anonymousClass53N.f59604C);
                return true;
            }
        }
        return false;
    }

    public final void CWA(Map map) {
        BaseAdapter baseAdapter = this.f59604C;
        if (baseAdapter != null) {
            Collection E = AnonymousClass0IF.E(map);
            baseAdapter.f59570F.clear();
            baseAdapter.f59570F.addAll(E);
            AnonymousClass0rF.B(baseAdapter, 216008795);
        }
    }

    public final void Hg(AnonymousClass0Ci anonymousClass0Ci) {
        Context context = this.f59606E.getContext();
        AnonymousClass0IF.F(context, this.f59605D, anonymousClass0Ci, "direct_inbox", AnonymousClass0V7.B(context, 0));
    }
}
