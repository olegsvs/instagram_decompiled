package X;

import com.instagram.explore.model.ExploreTopicCluster;

/* renamed from: X.4q0 */
public final class AnonymousClass4q0 implements AnonymousClass0gl {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1MV f57770B;

    public AnonymousClass4q0(AnonymousClass1MV anonymousClass1MV) {
        this.f57770B = anonymousClass1MV;
    }

    public final void iB(AnonymousClass0NN anonymousClass0NN) {
        AnonymousClass1MC anonymousClass1MC = (AnonymousClass1MC) this.f57770B.getParentFragment();
        String str = this.f57770B.f17690Q;
        ExploreTopicCluster exploreTopicCluster = this.f57770B.f17692S;
        int i = anonymousClass1MC.f17540O.f17597C;
        AnonymousClass4pJ.m25172B(anonymousClass0NN, exploreTopicCluster);
        anonymousClass0NN.F("topic_cluster_session_id", str);
        anonymousClass0NN.B("topic_nav_order", i);
    }
}
