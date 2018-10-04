package com.instagram.archive.fragment;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0GA;
import X.AnonymousClass0IT;
import X.AnonymousClass0Ie;
import X.AnonymousClass0Ih;
import X.AnonymousClass0Ii;
import X.AnonymousClass0MI;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass0ib;
import X.AnonymousClass2zT;
import X.AnonymousClass3Uq;
import X.AnonymousClass3Ux;
import X.AnonymousClass3bG;
import X.AnonymousClass41P;
import X.AnonymousClass48d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.facebook.C0164R;
import java.util.UUID;

public class ArchivePrivateHighlightsFragment extends AnonymousClass0Ie implements AnonymousClass0Ih, AnonymousClass0Ii, AnonymousClass3bG, AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass2zT f50768B;
    /* renamed from: C */
    public String f50769C;
    /* renamed from: D */
    public AnonymousClass0Cm f50770D;
    public AnonymousClass41P mHideAnimationCoordinator;

    public final void Iw(AnonymousClass0MI anonymousClass0MI) {
    }

    public final void Jt() {
    }

    public final void Mm(AnonymousClass3Uq anonymousClass3Uq) {
    }

    public final String getModuleName() {
        return "archive_private_highlights";
    }

    public final void kv(AnonymousClass0MI anonymousClass0MI) {
    }

    public final boolean uX() {
        return false;
    }

    public final void wIA(boolean z) {
    }

    public final void zs() {
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.hidden_profile_title);
        anonymousClass0eT.n(true);
    }

    public final void oLA() {
        if (getView() != null) {
            AnonymousClass0ib.C(this, getListView());
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -2038898529);
        super.onCreate(bundle);
        this.f50770D = AnonymousClass0Ce.G(getArguments());
        ListAdapter anonymousClass2zT = new AnonymousClass2zT(this);
        this.f50768B = anonymousClass2zT;
        setListAdapter(anonymousClass2zT);
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f50770D);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "highlights/private/";
        AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass3Ux.class).N().H();
        H.f2849B = new AnonymousClass48d(this);
        schedule(H);
        this.f50769C = UUID.randomUUID().toString();
        AnonymousClass0cQ.G(this, 1563851157, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 2134141646);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_feed, viewGroup, false);
        AnonymousClass0cQ.G(this, -2105429753, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -2060976979);
        super.onDestroyView();
        ArchivePrivateHighlightsFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 1121217760, F);
    }
}
