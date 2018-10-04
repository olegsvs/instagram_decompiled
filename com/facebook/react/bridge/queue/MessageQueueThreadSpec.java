package com.facebook.react.bridge.queue;

public final class MessageQueueThreadSpec {
    private static final MessageQueueThreadSpec MAIN_UI_SPEC = new MessageQueueThreadSpec(ThreadType.MAIN_UI, "main_ui");
    private final String mName;
    private final long mStackSize;
    private final ThreadType mThreadType;

    public enum ThreadType {
        MAIN_UI,
        NEW_BACKGROUND
    }

    private MessageQueueThreadSpec(ThreadType threadType, String str) {
        this(threadType, str, 0);
    }

    private MessageQueueThreadSpec(ThreadType threadType, String str, long j) {
        this.mThreadType = threadType;
        this.mName = str;
        this.mStackSize = j;
    }

    public final String getName() {
        return this.mName;
    }

    public final long getStackSize() {
        return this.mStackSize;
    }

    public final ThreadType getThreadType() {
        return this.mThreadType;
    }

    public static MessageQueueThreadSpec mainThreadSpec() {
        return MAIN_UI_SPEC;
    }

    public static MessageQueueThreadSpec newBackgroundThreadSpec(String str) {
        return new MessageQueueThreadSpec(ThreadType.NEW_BACKGROUND, str);
    }

    public static MessageQueueThreadSpec newBackgroundThreadSpec(String str, long j) {
        return new MessageQueueThreadSpec(ThreadType.NEW_BACKGROUND, str, j);
    }
}
