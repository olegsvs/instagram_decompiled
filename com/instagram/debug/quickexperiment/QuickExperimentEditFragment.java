package com.instagram.debug.quickexperiment;

import X.AnonymousClass09g;
import X.AnonymousClass0CE;
import X.AnonymousClass0CP;
import X.AnonymousClass0CR;
import X.AnonymousClass0IT;
import X.AnonymousClass0TM;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass2JC;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuickExperimentEditFragment extends AnonymousClass0TM implements AnonymousClass0IT {
    public static final String ARGUMENT_CATEGORY = "QuickExperimentEditFragment.CATEGORY";
    private AnonymousClass0CR mExperimentCategory;

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentEditFragment$1 */
    public class C00151 implements Comparator {
        public int compare(AnonymousClass0CE anonymousClass0CE, AnonymousClass0CE anonymousClass0CE2) {
            AnonymousClass0CP anonymousClass0CP = anonymousClass0CE.f1495F;
            AnonymousClass0CP anonymousClass0CP2 = anonymousClass0CE2.f1495F;
            if (!anonymousClass0CP.m908C().equalsIgnoreCase(anonymousClass0CP2.m908C())) {
                return anonymousClass0CP.m908C().compareTo(anonymousClass0CP2.m908C());
            }
            String str = "is_enabled";
            if (str.equals(anonymousClass0CE.f1493D)) {
                return -1;
            }
            if (str.equals(anonymousClass0CE2.f1493D)) {
                return 1;
            }
            return anonymousClass0CE.f1493D.compareTo(anonymousClass0CE2.f1493D);
        }
    }

    public String getModuleName() {
        return "quick_experiment_edit";
    }

    public void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Quick Experiments: ");
        stringBuilder.append(this.mExperimentCategory.f1630B);
        anonymousClass0eT.m6352a(stringBuilder.toString());
        anonymousClass0eT.m6365n(getFragmentManager().mo1456H() > 0);
    }

    public void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, 1234508333);
        super.onCreate(bundle);
        this.mExperimentCategory = AnonymousClass0CR.values()[getArguments().getInt(ARGUMENT_CATEGORY)];
        List arrayList = new ArrayList();
        for (AnonymousClass0CE anonymousClass0CE : AnonymousClass09g.m629B()) {
            if (anonymousClass0CE.f1495F.m906A() == this.mExperimentCategory) {
                arrayList.add(anonymousClass0CE);
            }
        }
        Collections.sort(arrayList, new C00151());
        QuickExperimentHelper.setupMenuItems(arrayList, getContext(), (AnonymousClass2JC) getListAdapter(), false);
        AnonymousClass0cQ.m5857G(this, 1802868018, F);
    }
}
