package com.facebook.react.bridge.queue;

import X.AnonymousClass0LR;
import android.os.Build.VERSION;

public final class ReactQueueConfigurationSpec {
    private final MessageQueueThreadSpec mJSQueueThreadSpec;
    private final MessageQueueThreadSpec mNativeModulesQueueThreadSpec;

    public final class Builder {
        private MessageQueueThreadSpec mJSQueueSpec;
        private MessageQueueThreadSpec mNativeModulesQueueSpec;

        public final ReactQueueConfigurationSpec build() {
            return new ReactQueueConfigurationSpec((MessageQueueThreadSpec) AnonymousClass0LR.D(this.mNativeModulesQueueSpec), (MessageQueueThreadSpec) AnonymousClass0LR.D(this.mJSQueueSpec));
        }

        public final Builder setJSQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            AnonymousClass0LR.C(this.mJSQueueSpec == null, "Setting JS queue multiple times!");
            this.mJSQueueSpec = messageQueueThreadSpec;
            return this;
        }

        public final Builder setNativeModulesQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            AnonymousClass0LR.C(this.mNativeModulesQueueSpec == null, "Setting native modules queue spec multiple times!");
            this.mNativeModulesQueueSpec = messageQueueThreadSpec;
            return this;
        }
    }

    public ReactQueueConfigurationSpec(MessageQueueThreadSpec messageQueueThreadSpec, MessageQueueThreadSpec messageQueueThreadSpec2) {
        this.mNativeModulesQueueThreadSpec = messageQueueThreadSpec;
        this.mJSQueueThreadSpec = messageQueueThreadSpec2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReactQueueConfigurationSpec createDefault() {
        MessageQueueThreadSpec newBackgroundThreadSpec;
        if (VERSION.SDK_INT < 21) {
            newBackgroundThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules", 2000000);
        } else {
            newBackgroundThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules");
        }
        return builder().setJSQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("js")).setNativeModulesQueueThreadSpec(newBackgroundThreadSpec).build();
    }

    public final MessageQueueThreadSpec getJSQueueThreadSpec() {
        return this.mJSQueueThreadSpec;
    }

    public final MessageQueueThreadSpec getNativeModulesQueueThreadSpec() {
        return this.mNativeModulesQueueThreadSpec;
    }
}
