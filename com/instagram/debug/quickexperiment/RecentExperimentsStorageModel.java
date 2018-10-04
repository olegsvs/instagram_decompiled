package com.instagram.debug.quickexperiment;

import X.AnonymousClass09g;
import X.AnonymousClass0CE;
import java.util.ArrayList;
import java.util.List;

public class RecentExperimentsStorageModel {
    public List recentExperimentParameterNames;
    public List recentExperimentParameters;
    public List recentUniverseNames;

    public RecentExperimentsStorageModel(List list) {
        this.recentExperimentParameterNames = new ArrayList();
        this.recentUniverseNames = new ArrayList();
        for (AnonymousClass0CE anonymousClass0CE : list) {
            this.recentExperimentParameterNames.add(anonymousClass0CE.f1493D);
            this.recentUniverseNames.add(anonymousClass0CE.f1495F.m908C());
        }
    }

    public List getRecentExperimentParameters() {
        return new ArrayList(this.recentExperimentParameters);
    }

    public RecentExperimentsStorageModel postprocess() {
        this.recentExperimentParameters = new ArrayList();
        for (int i = 0; i < this.recentExperimentParameterNames.size(); i++) {
            String str = (String) this.recentExperimentParameterNames.get(i);
            String str2 = (String) this.recentUniverseNames.get(i);
            for (AnonymousClass0CE anonymousClass0CE : AnonymousClass09g.m629B()) {
                if (str.equals(anonymousClass0CE.f1493D) && str2.equals(anonymousClass0CE.f1495F.m908C())) {
                    this.recentExperimentParameters.add(anonymousClass0CE);
                }
            }
        }
        return this;
    }
}
