package com.instagram.debug.quickexperiment;

import X.AnonymousClass09g;
import X.AnonymousClass0CE;
import X.AnonymousClass0CP;
import X.AnonymousClass0CR;
import X.AnonymousClass0IS;
import X.AnonymousClass0IT;
import X.AnonymousClass0IZ;
import X.AnonymousClass0TM;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass2If;
import X.AnonymousClass2JC;
import X.AnonymousClass2bo;
import X.AnonymousClass3kY;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ListView;
import com.android.internal.util.Predicate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuickExperimentCategoriesFragment extends AnonymousClass0TM implements AnonymousClass0IS, AnonymousClass0IT, AnonymousClass3kY {
    private final List mCategoryList = new ArrayList();
    private final Predicate mSearchExperimentsPredicate = new C00121();
    public String mSearchQuery = JsonProperty.USE_DEFAULT_NAME;
    public TypeaheadHeader mTypeaheadHeader;

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment$1 */
    public class C00121 implements Predicate {
        public boolean apply(AnonymousClass0CE anonymousClass0CE) {
            if (!QuickExperimentHelper.getNiceUniverseName(anonymousClass0CE.f1495F).contains(QuickExperimentCategoriesFragment.this.mSearchQuery)) {
                if (!anonymousClass0CE.f1493D.replace("_", " ").contains(QuickExperimentCategoriesFragment.this.mSearchQuery)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment$3 */
    public class C00143 implements Comparator {
        public int compare(AnonymousClass0CE anonymousClass0CE, AnonymousClass0CE anonymousClass0CE2) {
            AnonymousClass0CP anonymousClass0CP = anonymousClass0CE.f1495F;
            AnonymousClass0CP anonymousClass0CP2 = anonymousClass0CE2.f1495F;
            if (!anonymousClass0CP.m906A().equals(anonymousClass0CP2.m906A())) {
                return anonymousClass0CP.m906A().compareTo(anonymousClass0CP2.m906A());
            }
            if (anonymousClass0CP.m908C().equalsIgnoreCase(anonymousClass0CP2.m908C())) {
                return anonymousClass0CE.f1493D.compareTo(anonymousClass0CE2.f1493D);
            }
            return anonymousClass0CP.m908C().compareTo(anonymousClass0CP2.m908C());
        }
    }

    public String getModuleName() {
        return "quick_experiment_categories";
    }

    public void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.m6352a("Quick Experiment Categories");
        anonymousClass0eT.m6365n(true);
    }

    public boolean onBackPressed() {
        TypeaheadHeader typeaheadHeader = this.mTypeaheadHeader;
        if (typeaheadHeader != null) {
            typeaheadHeader.A();
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, -1385822779);
        super.onCreate(bundle);
        for (final AnonymousClass0CR anonymousClass0CR : AnonymousClass0CR.values()) {
            this.mCategoryList.add(new AnonymousClass2bo(anonymousClass0CR.f1630B, new OnClickListener() {
                public void onClick(View view) {
                    int M = AnonymousClass0cQ.m5863M(this, -1676939041);
                    if (QuickExperimentCategoriesFragment.this.mTypeaheadHeader != null) {
                        QuickExperimentCategoriesFragment.this.mTypeaheadHeader.A();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt(QuickExperimentEditFragment.ARGUMENT_CATEGORY, anonymousClass0CR.ordinal());
                    new AnonymousClass0IZ(QuickExperimentCategoriesFragment.this.getActivity()).m2312F(new QuickExperimentEditFragment(), bundle).m2308B();
                    AnonymousClass0cQ.m5862L(this, 382652183, M);
                }
            }));
        }
        setItems(this.mCategoryList);
        AnonymousClass0cQ.m5857G(this, 1858468086, F);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, 2004937361);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ListView listView = (ListView) onCreateView.findViewById(16908298);
        TypeaheadHeader typeaheadHeader = new TypeaheadHeader(getContext());
        this.mTypeaheadHeader = typeaheadHeader;
        typeaheadHeader.setDelegate(this);
        this.mTypeaheadHeader.E(this.mSearchQuery);
        this.mTypeaheadHeader.D("Search Quick Experiments");
        listView.addHeaderView(this.mTypeaheadHeader);
        listView.setOnScrollListener(this.mTypeaheadHeader);
        AnonymousClass0cQ.m5857G(this, -167464067, F);
        return onCreateView;
    }

    public void searchTextChanged(String str) {
        this.mSearchQuery = str;
        if (TextUtils.isEmpty(str)) {
            setItems(this.mCategoryList);
            return;
        }
        List arrayList = new ArrayList();
        for (AnonymousClass0CE anonymousClass0CE : AnonymousClass09g.m629B()) {
            if (this.mSearchExperimentsPredicate.apply(anonymousClass0CE)) {
                arrayList.add(anonymousClass0CE);
            }
        }
        Collections.sort(arrayList, new C00143());
        QuickExperimentHelper.setupMenuItems(arrayList, getContext(), (AnonymousClass2JC) getListAdapter(), true);
    }

    public void setItems(List list) {
        Collection arrayList = new ArrayList();
        arrayList.add(new AnonymousClass2If("Recent Items"));
        arrayList.addAll(QuickExperimentHelper.getMenuItems(RecentQuickExperimentManager.getRecentExperimentParameters(), getContext(), (AnonymousClass2JC) getListAdapter(), false));
        arrayList.add(new AnonymousClass2If("Quick Experiment Categories"));
        arrayList.addAll(list);
        super.setItems(arrayList);
    }
}
