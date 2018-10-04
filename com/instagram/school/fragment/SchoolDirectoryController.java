package com.instagram.school.fragment;

import X.AnonymousClass0Cm;
import X.AnonymousClass0HV;
import X.AnonymousClass0Iu;
import X.AnonymousClass0Ow;
import X.AnonymousClass0VA;
import X.AnonymousClass0iW;
import X.AnonymousClass0ip;
import X.AnonymousClass0mS;
import X.AnonymousClass1LP;
import X.AnonymousClass5zi;
import X.AnonymousClass606;
import X.AnonymousClass607;
import X.AnonymousClass608;
import X.AnonymousClass60D;
import X.AnonymousClass6F9;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.List;

public class SchoolDirectoryController extends AnonymousClass0VA implements AnonymousClass0mS {
    /* renamed from: B */
    public int f70762B;
    /* renamed from: C */
    public final AnonymousClass6F9 f70763C;
    /* renamed from: D */
    public AnonymousClass0Ow f70764D;
    /* renamed from: E */
    public AnonymousClass0Iu f70765E;
    /* renamed from: F */
    public final AnonymousClass5zi f70766F;
    /* renamed from: G */
    public final long f70767G;
    /* renamed from: H */
    public final AnonymousClass0iW f70768H;
    /* renamed from: I */
    public TypeaheadHeader f70769I;
    /* renamed from: J */
    public int f70770J;
    /* renamed from: K */
    public final AnonymousClass0Cm f70771K;
    /* renamed from: L */
    private boolean f70772L = true;
    /* renamed from: M */
    private boolean f70773M;
    /* renamed from: N */
    private AnonymousClass60D f70774N;
    /* renamed from: O */
    private View f70775O;
    public View mContainer;
    public FixedTabBar mFixedTabBar;
    public ViewPager mFragmentPager;
    public View mProgressBar;

    public SchoolDirectoryController(AnonymousClass6F9 anonymousClass6F9, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0iW anonymousClass0iW, AnonymousClass5zi anonymousClass5zi, boolean z) {
        this.f70771K = anonymousClass0Cm;
        this.f70767G = anonymousClass0Cm.B().DC.E();
        this.f70763C = anonymousClass6F9;
        this.f70768H = anonymousClass0iW;
        this.f70773M = z;
        this.f70766F = anonymousClass5zi;
        this.f70764D = AnonymousClass0Ow.D(this.f70766F.f70709C.keySet());
    }

    /* renamed from: A */
    public final void m28744A(boolean z) {
        if (z) {
            this.mFixedTabBar.setVisibility(0);
            this.mFragmentPager.setVisibility(0);
            return;
        }
        this.mFixedTabBar.setVisibility(4);
        this.mFragmentPager.setVisibility(4);
    }

    /* renamed from: B */
    public static void m28742B(SchoolDirectoryController schoolDirectoryController) {
        schoolDirectoryController.f70764D = AnonymousClass0Ow.D(schoolDirectoryController.f70766F.f70709C.keySet());
        List arrayList = new ArrayList();
        int size = schoolDirectoryController.f70764D.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(AnonymousClass1LP.C((String) schoolDirectoryController.f70764D.get(i)));
        }
        schoolDirectoryController.mFixedTabBar.setTabs(arrayList);
        schoolDirectoryController.mFixedTabBar.A(schoolDirectoryController.f70762B);
        schoolDirectoryController.f70774N = new AnonymousClass60D(schoolDirectoryController.f70763C.getChildFragmentManager(), schoolDirectoryController.f70771K, schoolDirectoryController.f70764D);
        schoolDirectoryController.mFragmentPager.setAdapter(schoolDirectoryController.f70774N);
        schoolDirectoryController.mProgressBar.setVisibility(8);
        schoolDirectoryController.mContainer.setVisibility(0);
        String str = schoolDirectoryController.f70771K.B().DC.f29495C;
        if (schoolDirectoryController.f70773M) {
            schoolDirectoryController.m28743C(str);
            String F = schoolDirectoryController.f70771K.B().DC.F();
            Toast.makeText(schoolDirectoryController.f70763C.getContext().getApplicationContext(), schoolDirectoryController.f70763C.getString(C0164R.string.school_directory_just_joined_toast, new Object[]{F}), 0).show();
            schoolDirectoryController.f70773M = false;
        } else if (schoolDirectoryController.f70772L) {
            String string = AnonymousClass0HV.D(schoolDirectoryController.f70771K).f2646B.getString("school_directory_last_visit_tab_key", null);
            if (string != null) {
                str = string;
            }
            schoolDirectoryController.m28743C(str);
            schoolDirectoryController.f70772L = false;
        }
    }

    /* renamed from: C */
    private void m28743C(String str) {
        if (this.f70764D.contains(str)) {
            hPA(this.f70764D.indexOf(str));
        } else {
            hPA(this.f70764D.size() - 1);
        }
    }

    public final void PGA(View view, Bundle bundle) {
        super.PGA(view, bundle);
        this.f70775O = view.findViewById(C0164R.id.school_directory_header_group);
        this.f70769I = (TypeaheadHeader) view.findViewById(C0164R.id.typeahead_header);
        this.mContainer = view.findViewById(C0164R.id.school_directory_container);
        this.mFixedTabBar = (FixedTabBar) view.findViewById(C0164R.id.fixed_tabbar_view);
        this.mFragmentPager = (ViewPager) view.findViewById(C0164R.id.view_pager);
        this.mProgressBar = view.findViewById(C0164R.id.listview_progressbar);
        this.f70768H.f8780H = 0.0f;
        this.f70769I.post(new AnonymousClass606(this, AnonymousClass0ip.B(this.f70763C.getContext())));
        this.mProgressBar.setVisibility(0);
        this.mFragmentPager.B(new AnonymousClass608(this));
        this.mFragmentPager.B(this.mFixedTabBar);
        this.mFixedTabBar.setDelegate(this);
    }

    public final void ei() {
        if (!this.f70764D.isEmpty()) {
            AnonymousClass0HV.D(this.f70771K).MA((String) this.f70764D.get(this.f70762B));
        }
        super.ei();
    }

    public final void gi() {
        AnonymousClass0Iu anonymousClass0Iu = this.f70765E;
        if (anonymousClass0Iu != null) {
            anonymousClass0Iu.A();
        }
        SchoolDirectoryControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void gx() {
        this.f70768H.D((float) this.f70770J, new AnonymousClass607(this), new View[]{this.f70775O});
    }

    public final void hPA(int i) {
        this.mFragmentPager.setCurrentItem(i);
        this.f70762B = i;
    }
}
