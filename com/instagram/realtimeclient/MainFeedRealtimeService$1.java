package com.instagram.realtimeclient;

import X.AnonymousClass3QW;

public class MainFeedRealtimeService$1 implements Runnable {
    public final /* synthetic */ MainFeedRealtimeService this$0;
    public final /* synthetic */ AnonymousClass3QW val$feedBackMedia;

    public MainFeedRealtimeService$1(MainFeedRealtimeService mainFeedRealtimeService, AnonymousClass3QW anonymousClass3QW) {
        this.this$0 = mainFeedRealtimeService;
        this.val$feedBackMedia = anonymousClass3QW;
    }

    public void run() {
        MainFeedRealtimeService.updateMedia(this.this$0, this.val$feedBackMedia);
    }
}
