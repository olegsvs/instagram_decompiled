package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.explore.model.ExploreTopicCluster;

/* renamed from: X.4q6 */
public final class AnonymousClass4q6 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1MC f57775B;
    /* renamed from: C */
    public final /* synthetic */ ExploreTopicCluster f57776C;

    public AnonymousClass4q6(AnonymousClass1MC anonymousClass1MC, ExploreTopicCluster exploreTopicCluster) {
        this.f57775B = anonymousClass1MC;
        this.f57776C = exploreTopicCluster;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        i = this.f57775B;
        dialogInterface = this.f57776C;
        if (dialogInterface.f17582H) {
            AnonymousClass1MH.B(i.f17541P, dialogInterface, false);
        } else {
            AnonymousClass1MH.B(i.f17541P, dialogInterface, true);
        }
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(i.f17542Q);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "discover/topic_channel_mute/";
        AnonymousClass0Ix.D(anonymousClass0Pt.D("topic_cluster_id", dialogInterface.f17581G).D("topic_cluster_name", dialogInterface.f17585K).E("is_muted", dialogInterface.f17582H).M(AnonymousClass0Pv.class).H());
    }
}
