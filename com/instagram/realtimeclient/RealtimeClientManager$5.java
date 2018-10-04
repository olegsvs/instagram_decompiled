package com.instagram.realtimeclient;

public class RealtimeClientManager$5 {
    public final /* synthetic */ RealtimeClientManager this$0;
    public final /* synthetic */ boolean val$isSkywalkerCommand;
    public final /* synthetic */ String val$payload;
    public final /* synthetic */ long val$sendingTime;
    public final /* synthetic */ String val$topicName;

    public RealtimeClientManager$5(RealtimeClientManager realtimeClientManager, String str, String str2, boolean z, long j) {
        this.this$0 = realtimeClientManager;
        this.val$topicName = str;
        this.val$payload = str2;
        this.val$isSkywalkerCommand = z;
        this.val$sendingTime = j;
    }

    public void onFailure() {
        synchronized (this.this$0.mObservers) {
            for (RealtimeClientManager$Observer onSendMessage : this.this$0.mObservers) {
                onSendMessage.onSendMessage(this.val$topicName, this.val$payload, RealtimeConstants.SEND_FAIL, this.val$isSkywalkerCommand, Long.valueOf(System.currentTimeMillis() - this.val$sendingTime));
            }
        }
    }

    public void onSuccess() {
        synchronized (this.this$0.mObservers) {
            for (RealtimeClientManager$Observer onSendMessage : this.this$0.mObservers) {
                onSendMessage.onSendMessage(this.val$topicName, this.val$payload, RealtimeConstants.SEND_SUCCESS, this.val$isSkywalkerCommand, Long.valueOf(System.currentTimeMillis() - this.val$sendingTime));
            }
        }
    }
}
