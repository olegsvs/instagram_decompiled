package com.instagram.realtimeclient;

public class MainRealtimeEventHandler$3 implements Runnable {
    public final /* synthetic */ MainRealtimeEventHandler this$0;
    public final /* synthetic */ RealtimeEvent val$patchEvent;
    public final /* synthetic */ String val$topic;

    public MainRealtimeEventHandler$3(MainRealtimeEventHandler mainRealtimeEventHandler, RealtimeEvent realtimeEvent, String str) {
        this.this$0 = mainRealtimeEventHandler;
        this.val$patchEvent = realtimeEvent;
        this.val$topic = str;
    }

    public void run() {
        for (RealtimeOperation realtimeOperation : this.val$patchEvent.operations) {
            if (this.this$0.mStore.patchStoreWithOperation(realtimeOperation)) {
                MainRealtimeEventHandler.handleOperation(this.this$0, realtimeOperation);
                MainRealtimeEventHandler.logOperation(this.this$0, realtimeOperation, this.val$topic);
            }
        }
    }
}
