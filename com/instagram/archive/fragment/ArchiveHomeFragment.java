package com.instagram.archive.fragment;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0HV;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IT;
import X.AnonymousClass0JK;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass0eb;
import X.AnonymousClass30Y;
import X.AnonymousClass30z;
import X.AnonymousClass48W;
import X.AnonymousClass48X;
import X.AnonymousClass48a;
import X.AnonymousClass48b;
import X.AnonymousClass48c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.ui.widget.base.TriangleSpinner;
import java.util.ArrayList;
import java.util.List;

public class ArchiveHomeFragment extends AnonymousClass0IJ implements AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass48c f50743B;
    /* renamed from: C */
    public CharSequence[] f50744C;
    /* renamed from: D */
    public AnonymousClass0Cm f50745D;
    /* renamed from: E */
    private boolean f50746E;
    /* renamed from: F */
    private AnonymousClass0IL f50747F;
    /* renamed from: G */
    private AnonymousClass0IL f50748G;
    /* renamed from: H */
    private boolean f50749H;
    /* renamed from: I */
    private AnonymousClass0IL f50750I;
    public View mCalendarActionBarButton;

    /* renamed from: B */
    public static void m23407B(ArchiveHomeFragment archiveHomeFragment) {
        AnonymousClass0IL anonymousClass0IL;
        if (archiveHomeFragment.f50743B == AnonymousClass48c.STORY) {
            if (archiveHomeFragment.f50750I == null) {
                Bundle arguments = archiveHomeFragment.getArguments();
                arguments.putString("IgSessionManager.USER_ID", archiveHomeFragment.f50745D.f1759C);
                arguments.putSerializable("highlight_management_source", AnonymousClass30z.ARCHIVE);
                if (archiveHomeFragment.f50746E) {
                    AnonymousClass0JK.f2907B.C();
                    AnonymousClass0IL archiveReelTabbedFragment = new ArchiveReelTabbedFragment();
                    archiveReelTabbedFragment.setArguments(arguments);
                    archiveHomeFragment.f50750I = archiveReelTabbedFragment;
                } else {
                    archiveHomeFragment.f50750I = AnonymousClass0JK.f2907B.C().A(arguments);
                }
            }
            anonymousClass0IL = archiveHomeFragment.f50750I;
        } else if (archiveHomeFragment.f50743B == AnonymousClass48c.POSTS) {
            if (archiveHomeFragment.f50747F == null) {
                AnonymousClass0JK.f2907B.C();
                r3 = archiveHomeFragment.f50745D.f1759C;
                anonymousClass0IL = new AnonymousClass48W();
                r1 = new Bundle();
                r1.putString("IgSessionManager.USER_ID", r3);
                anonymousClass0IL.setArguments(r1);
                archiveHomeFragment.f50747F = anonymousClass0IL;
            }
            anonymousClass0IL = archiveHomeFragment.f50747F;
        } else if (archiveHomeFragment.f50743B == AnonymousClass48c.PRIVATE_HIGHLIGHTS) {
            if (archiveHomeFragment.f50748G == null) {
                AnonymousClass0JK.f2907B.C();
                r3 = archiveHomeFragment.f50745D.f1759C;
                anonymousClass0IL = new ArchivePrivateHighlightsFragment();
                r1 = new Bundle();
                r1.putString("IgSessionManager.USER_ID", r3);
                anonymousClass0IL.setArguments(r1);
                archiveHomeFragment.f50748G = anonymousClass0IL;
            }
            anonymousClass0IL = archiveHomeFragment.f50748G;
        } else {
            anonymousClass0IL = null;
        }
        archiveHomeFragment.getChildFragmentManager().B().M(C0164R.id.archive_home_fragment_container, anonymousClass0IL).F();
        if (archiveHomeFragment.f50749H) {
            AnonymousClass0eT.E(archiveHomeFragment.getActivity()).l(archiveHomeFragment.f50743B == AnonymousClass48c.POSTS);
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        this.mCalendarActionBarButton = null;
        TriangleSpinner triangleSpinner = (TriangleSpinner) anonymousClass0eT.X(C0164R.layout.archive_home_action_bar_title, 0, 0).findViewById(C0164R.id.drop_down);
        List arrayList = new ArrayList();
        arrayList.add(AnonymousClass48c.STORY);
        arrayList.add(AnonymousClass48c.POSTS);
        if (((Boolean) AnonymousClass0CC.kY.H(this.f50745D)).booleanValue()) {
            arrayList.add(AnonymousClass48c.PRIVATE_HIGHLIGHTS);
        }
        triangleSpinner.setAdapter(new AnonymousClass48a(this, arrayList));
        triangleSpinner.setOnItemSelectedListener(new AnonymousClass48b(this, arrayList));
        triangleSpinner.setSelection(arrayList.indexOf(this.f50743B));
        anonymousClass0eT.n(true);
        anonymousClass0eT.F(AnonymousClass0eb.OVERFLOW, new AnonymousClass48X(this));
    }

    public final String getModuleName() {
        return this.f50743B.f50757C;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 2050385586);
        super.onCreate(bundle);
        AnonymousClass30Y.m18168B();
        AnonymousClass0Cm G = AnonymousClass0Ce.G(getArguments());
        this.f50745D = G;
        this.f50743B = AnonymousClass48c.m23408B(AnonymousClass0HV.D(G).f2646B.getString("sticky_archive_home_mode", null));
        boolean booleanValue = ((Boolean) AnonymousClass0CC.Df.H(this.f50745D)).booleanValue();
        this.f50746E = booleanValue;
        this.f50749H = booleanValue;
        AnonymousClass0cQ.G(this, 644233110, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1307781194);
        View inflate = layoutInflater.inflate(C0164R.layout.archive_home_fragment, viewGroup, false);
        AnonymousClass0cQ.G(this, 44997564, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 451334250);
        super.onDestroyView();
        ArchiveHomeFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, -293445653, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m23407B(this);
    }
}
