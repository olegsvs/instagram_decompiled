package com.instagram.realtimeclient;

public class MainRealtimeEventHandler$2 implements Runnable {
    public final /* synthetic */ MainRealtimeEventHandler this$0;
    public final /* synthetic */ RealtimeEvent val$realtimeEvent;

    public MainRealtimeEventHandler$2(MainRealtimeEventHandler mainRealtimeEventHandler, RealtimeEvent realtimeEvent) {
        this.this$0 = mainRealtimeEventHandler;
        this.val$realtimeEvent = realtimeEvent;
    }

    public void run() {
        switch (this.val$realtimeEvent.action.ordinal()) {
            case 0:
                MainRealtimeEventHandler.onAckEvent(this.this$0, this.val$realtimeEvent.payload.clientRequestId != null ? this.val$realtimeEvent.payload.clientRequestId : this.val$realtimeEvent.payload.clientContext, this.val$realtimeEvent.getStatusCode(), this.val$realtimeEvent.payload.message, this.val$realtimeEvent.payload.threadId, this.val$realtimeEvent.payload.itemId, this.val$realtimeEvent.payload.timestamp, this.val$realtimeEvent.payload.ttlMs);
                return;
            case 1:
                return;
            default:
                return;
        }
    }
}
