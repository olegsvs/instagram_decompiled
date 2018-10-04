package X;

import com.instagram.explore.model.ExploreTopicCluster;

/* renamed from: X.4pI */
public final class AnonymousClass4pI implements AnonymousClass0gl {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1ML f57675B;
    /* renamed from: C */
    public final /* synthetic */ ExploreTopicCluster f57676C;

    public AnonymousClass4pI(AnonymousClass1ML anonymousClass1ML, ExploreTopicCluster exploreTopicCluster) {
        this.f57675B = anonymousClass1ML;
        this.f57676C = exploreTopicCluster;
    }

    public final void iB(AnonymousClass0NN anonymousClass0NN) {
        String str = this.f57675B.f17598D;
        ExploreTopicCluster exploreTopicCluster = this.f57676C;
        int i = this.f57675B.f17597C;
        AnonymousClass4pJ.m25172B(anonymousClass0NN, exploreTopicCluster);
        anonymousClass0NN.F("topic_cluster_session_id", str);
        anonymousClass0NN.B("topic_nav_order", i);
    }
}
