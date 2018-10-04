package org.webrtc;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.nio.ByteBuffer;

public class DataChannel {
    private final long nativeDataChannel;
    private long nativeObserver;

    public class Buffer {
        public final boolean binary;
        public final ByteBuffer data;

        public Buffer(ByteBuffer byteBuffer, boolean z) {
            this.data = byteBuffer;
            this.binary = z;
        }
    }

    public class Init {
        public int id = -1;
        public int maxRetransmitTimeMs = -1;
        public int maxRetransmits = -1;
        public boolean negotiated = false;
        public boolean ordered = true;
        public String protocol = JsonProperty.USE_DEFAULT_NAME;

        public int getId() {
            return this.id;
        }

        public int getMaxRetransmitTimeMs() {
            return this.maxRetransmitTimeMs;
        }

        public int getMaxRetransmits() {
            return this.maxRetransmits;
        }

        public boolean getNegotiated() {
            return this.negotiated;
        }

        public boolean getOrdered() {
            return this.ordered;
        }

        public String getProtocol() {
            return this.protocol;
        }
    }

    public interface Observer {
        void onBufferedAmountChange(long j);

        void onMessage(Buffer buffer);

        void onStateChange();
    }

    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        public static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    private native long nativeBufferedAmount();

    private native void nativeClose();

    private native int nativeId();

    private native String nativeLabel();

    private native long nativeRegisterObserver(Observer observer);

    private native boolean nativeSend(byte[] bArr, boolean z);

    private native State nativeState();

    private native void nativeUnregisterObserver(long j);

    public DataChannel(long j) {
        this.nativeDataChannel = j;
    }

    public long bufferedAmount() {
        return nativeBufferedAmount();
    }

    public void close() {
        nativeClose();
    }

    public void dispose() {
        JniCommon.nativeReleaseRef(this.nativeDataChannel);
    }

    public long getNativeDataChannel() {
        return this.nativeDataChannel;
    }

    public int id() {
        return nativeId();
    }

    public String label() {
        return nativeLabel();
    }

    public void registerObserver(Observer observer) {
        long j = this.nativeObserver;
        if (j != 0) {
            nativeUnregisterObserver(j);
        }
        this.nativeObserver = nativeRegisterObserver(observer);
    }

    public boolean send(Buffer buffer) {
        byte[] bArr = new byte[buffer.data.remaining()];
        buffer.data.get(bArr);
        return nativeSend(bArr, buffer.binary);
    }

    public State state() {
        return nativeState();
    }

    public void unregisterObserver() {
        nativeUnregisterObserver(this.nativeObserver);
    }
}
