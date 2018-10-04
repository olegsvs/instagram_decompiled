package X;

import android.os.Bundle;
import com.instagram.explore.model.ExploreTopicCluster;
import com.instagram.model.explore.ExploreChainingItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Ic */
public final class AnonymousClass0Ic {
    /* renamed from: A */
    public final AnonymousClass0IL m2319A(ExploreChainingItem exploreChainingItem, String str, String str2, boolean z, ExploreTopicCluster exploreTopicCluster) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ExploreChainingFeedFragment.ARGUMENT_EXPLORE_CHAINING_ITEM", exploreChainingItem);
        bundle.putString("ExploreChainingFeedFragment.ARGUMENT_ENTRY_POINT", str);
        bundle.putString("ExploreChainingFeedFragment.ARGUMENT_SESSION_ID", str2);
        bundle.putBoolean("ExploreChainingFeedFragment.ARGUMENT_HAS_SEEN_POST_CHAINING", z);
        if (exploreTopicCluster != null) {
            bundle.putParcelable("ExploreChainingFeedFragment.ARGUMENT_EXPLORE_TOPIC_CLUSTER", exploreTopicCluster);
        }
        AnonymousClass0IL anonymousClass4pU = new AnonymousClass4pU();
        anonymousClass4pU.setArguments(bundle);
        return anonymousClass4pU;
    }

    /* renamed from: B */
    public final AnonymousClass0IL m2320B() {
        Object obj = (AnonymousClass0E6.m1319E(AnonymousClass0CS.f1648S) || !((Boolean) AnonymousClass0CC.iK.m845G()).booleanValue()) ? null : 1;
        if (obj != null) {
            return new AnonymousClass1MC();
        }
        return new AnonymousClass5XX();
    }

    /* renamed from: C */
    public final AnonymousClass0IL m2321C(String str, boolean z, ArrayList arrayList, List list) {
        AnonymousClass0IL anonymousClass1Xa;
        if (((Boolean) AnonymousClass0CC.mS.m914G()).booleanValue()) {
            anonymousClass1Xa = new AnonymousClass1Xa();
        } else {
            anonymousClass1Xa = new AnonymousClass4yc();
        }
        Bundle bundle = new Bundle();
        bundle.putString("LocationFeedFragment.ARGUMENT_LOCATION_VENUE_ID", str);
        bundle.putBoolean("LocationFeedFragment.ARGUMENT_IS_EXPLORE_ATTRIBUTION_VISIBLE", z);
        bundle.putParcelableArrayList("LocationFeedFragment.ARGUMENT_VISITED_ITEMS", arrayList);
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList2 = new ArrayList();
            for (AnonymousClass1dN NO : list) {
                arrayList2.add(NO.NO());
            }
            bundle.putStringArrayList("LocationFeedFragment.ARGUMENT_FORCED_MEDIA_ID_LIST", arrayList2);
        }
        anonymousClass1Xa.setArguments(bundle);
        return anonymousClass1Xa;
    }

    /* renamed from: D */
    public final AnonymousClass0IL m2322D(String str, boolean z, List list) {
        return m2321C(str, z, new ArrayList(), list);
    }
}
