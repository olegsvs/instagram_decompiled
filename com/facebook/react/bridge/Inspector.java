package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

public class Inspector {
    private final HybridData mHybridData;

    public class LocalConnection {
        private final HybridData mHybridData;

        public native void disconnect();

        public native void sendMessage(String str);

        private LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }
    }

    public class Page {
        private final int mId;
        private final String mTitle;
        private final String mVM;

        private Page(int i, String str, String str2) {
            this.mId = i;
            this.mTitle = str;
            this.mVM = str2;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Page{mId=");
            stringBuilder.append(this.mId);
            stringBuilder.append(", mTitle='");
            stringBuilder.append(this.mTitle);
            stringBuilder.append('\'');
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public interface RemoteConnection {
        void onDisconnect();

        void onMessage(String str);
    }

    private native LocalConnection connectNative(int i, RemoteConnection remoteConnection);

    private native Page[] getPagesNative();

    private static native Inspector instance();

    static {
        ReactBridge.staticInit();
    }

    private Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
