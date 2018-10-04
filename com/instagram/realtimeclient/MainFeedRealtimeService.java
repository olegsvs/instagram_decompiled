package com.instagram.realtimeclient;

import X.AnonymousClass0CC;
import X.AnonymousClass0Cm;
import X.AnonymousClass0G2;
import X.AnonymousClass0P7;
import X.AnonymousClass0Sy;
import X.AnonymousClass0m3;
import X.AnonymousClass107;
import X.AnonymousClass3QW;
import X.AnonymousClass3QZ;
import X.AnonymousClass3Qa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainFeedRealtimeService extends RealtimeEventHandler implements AnonymousClass0G2 {
    private static final String TAG = "MainFeedRealtimeService";
    private final Map mRealtimeSubscriptionsMap = new HashMap();
    private final boolean mSubscribeFeedbackLike;
    private final AnonymousClass0Cm mUserSession;
    private final Map mVisibleMediaStateItems = new HashMap();

    public void onUserSessionWillEnd(boolean z) {
    }

    private MainFeedRealtimeService(AnonymousClass0Cm anonymousClass0Cm) {
        this.mUserSession = anonymousClass0Cm;
        this.mSubscribeFeedbackLike = ((Boolean) AnonymousClass0CC.Fa.m846H(anonymousClass0Cm)).booleanValue();
    }

    public boolean canHandleRealtimeEvent(String str, String str2) {
        return RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) && GraphQLSubscriptionID.FEEDBACK_LIKE_SUBSCRIBE_QUERY_ID.equals(str2);
    }

    public static synchronized MainFeedRealtimeService getInstance(AnonymousClass0Cm anonymousClass0Cm) {
        MainFeedRealtimeService mainFeedRealtimeService;
        Class cls = MainFeedRealtimeService.class;
        synchronized (cls) {
            mainFeedRealtimeService = (MainFeedRealtimeService) anonymousClass0Cm.m1036A(cls);
            if (mainFeedRealtimeService == null) {
                mainFeedRealtimeService = new MainFeedRealtimeService(anonymousClass0Cm);
                anonymousClass0Cm.m1039D(cls, mainFeedRealtimeService);
            }
        }
        return mainFeedRealtimeService;
    }

    private final List getRealtimeSubscriptionsForMediaId(String str) {
        List arrayList = new ArrayList();
        if (this.mSubscribeFeedbackLike) {
            arrayList.add(RealtimeSubscription.getMediaFeedbackSubscription(str));
        }
        return arrayList;
    }

    public final void onFeedItemNoLongerVisible(AnonymousClass0P7 anonymousClass0P7) {
        String EA = anonymousClass0P7.EA();
        List list = (List) this.mRealtimeSubscriptionsMap.remove(EA);
        if (list != null) {
            if (!list.isEmpty()) {
                this.mVisibleMediaStateItems.remove(EA);
                RealtimeClientManager.getInstance(this.mUserSession).graphqlUnsubscribeCommand(list);
            }
        }
    }

    public final void onFeedItemVisible(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3) {
        String EA = anonymousClass0P7.EA();
        if (!this.mRealtimeSubscriptionsMap.containsKey(EA)) {
            List realtimeSubscriptionsForMediaId = getRealtimeSubscriptionsForMediaId(EA);
            if (realtimeSubscriptionsForMediaId != null && !realtimeSubscriptionsForMediaId.isEmpty()) {
                RealtimeClientManager.getInstance(this.mUserSession).graphqlSubscribeCommand(realtimeSubscriptionsForMediaId);
                this.mRealtimeSubscriptionsMap.put(EA, realtimeSubscriptionsForMediaId);
                this.mVisibleMediaStateItems.put(EA, new WeakReference(anonymousClass0m3));
            }
        }
    }

    public void onRealtimeEventPayload(String str, String str2, String str3) {
        try {
            AnonymousClass3QZ parseFromJson = AnonymousClass3Qa.parseFromJson(str3);
            if (parseFromJson != null && parseFromJson.f41158B != null && parseFromJson.f41158B.f41157B != null) {
                AnonymousClass0Sy.m4437F(new MainFeedRealtimeService$1(this, parseFromJson.f41158B.f41157B));
            }
        } catch (Throwable e) {
            throw new IllegalStateException("error parsing feedback like event from skywalker", e);
        }
    }

    public static void updateMedia(MainFeedRealtimeService mainFeedRealtimeService, AnonymousClass3QW anonymousClass3QW) {
        if (mainFeedRealtimeService.mRealtimeSubscriptionsMap.containsKey(anonymousClass3QW.f41154D)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(anonymousClass3QW.f41154D);
            stringBuilder.append("_");
            stringBuilder.append(anonymousClass3QW.f41156F.f41159B);
            AnonymousClass0P7 A = AnonymousClass107.f13182C.m8703A(stringBuilder.toString());
            if (A != null && !anonymousClass3QW.f41155E) {
                A.iB = anonymousClass3QW.f41153C.f41151B.intValue();
                A.f4037l = Integer.valueOf(anonymousClass3QW.f41152B.f41151B.intValue());
                String EA = A.EA();
                if (mainFeedRealtimeService.mVisibleMediaStateItems.containsKey(EA) && ((WeakReference) mainFeedRealtimeService.mVisibleMediaStateItems.get(EA)).get() != null) {
                    AnonymousClass0m3.m7447B((AnonymousClass0m3) ((WeakReference) mainFeedRealtimeService.mVisibleMediaStateItems.get(EA)).get(), 13);
                }
            }
        }
    }
}
