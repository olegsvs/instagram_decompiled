package X;

import com.instagram.explore.model.ExploreTopicCluster;

/* renamed from: X.4pJ */
public final class AnonymousClass4pJ {
    /* renamed from: B */
    public static void m25172B(AnonymousClass0NN anonymousClass0NN, ExploreTopicCluster exploreTopicCluster) {
        anonymousClass0NN.F("topic_cluster_id", exploreTopicCluster.f17581G);
        anonymousClass0NN.F("topic_cluster_title", exploreTopicCluster.f17587M);
        anonymousClass0NN.F("topic_cluster_type", exploreTopicCluster.f17588N.A());
        anonymousClass0NN.F("topic_cluster_debug_info", exploreTopicCluster.f17578D);
    }

    /* renamed from: C */
    public static void m25173C(AnonymousClass0db anonymousClass0db, ExploreTopicCluster exploreTopicCluster) {
        anonymousClass0db.G("topic_cluster_id", exploreTopicCluster.f17581G);
        anonymousClass0db.G("topic_cluster_title", exploreTopicCluster.f17587M);
        anonymousClass0db.G("topic_cluster_type", exploreTopicCluster.f17588N.A());
        anonymousClass0db.G("topic_cluster_debug_info", exploreTopicCluster.f17578D);
    }

    /* renamed from: D */
    public static AnonymousClass0NN m25174D(AnonymousClass0EE anonymousClass0EE, String str, String str2, ExploreTopicCluster exploreTopicCluster, String str3, int i) {
        anonymousClass0EE = AnonymousClass0NN.B(str, anonymousClass0EE).F("session_id", str2).F("hashtag_name", str3).B("position", i);
        AnonymousClass4pJ.m25172B(anonymousClass0EE, exploreTopicCluster);
        return anonymousClass0EE;
    }
}
