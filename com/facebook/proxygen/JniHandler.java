package com.facebook.proxygen;

import com.facebook.proxygen.utils.Preconditions;
import org.apache.http.Header;
import org.apache.http.client.methods.HttpUriRequest;

public class JniHandler extends NativeHandleImpl implements HTTPTransportCallback, HTTPResponseHandler {
    private HTTPRequestHandler mRequestHandler;
    private HTTPResponseHandler mResponseHandler;
    private HTTPTransportCallback mTransportCallback;

    private native void cancelNative();

    private native void changePriorityNative(int i);

    private native void closeNative();

    private native boolean sendBodyNative(byte[] bArr, int i, int i2);

    private native boolean sendEOMNative();

    private native boolean sendHeadersNative(HttpUriRequest httpUriRequest);

    private native boolean sendRequestWithBodyAndEOMNative(HttpUriRequest httpUriRequest, byte[] bArr, int i, int i2);

    private native void setEnabledCallbackFlagNative(int i);

    public JniHandler(HTTPRequestHandler hTTPRequestHandler, HTTPResponseHandler hTTPResponseHandler) {
        this(hTTPRequestHandler, hTTPResponseHandler, null);
    }

    public JniHandler(HTTPRequestHandler hTTPRequestHandler, HTTPResponseHandler hTTPResponseHandler, HTTPTransportCallback hTTPTransportCallback) {
        Preconditions.checkNotNull(hTTPRequestHandler);
        Preconditions.checkNotNull(hTTPResponseHandler);
        this.mRequestHandler = hTTPRequestHandler;
        this.mResponseHandler = hTTPResponseHandler;
        this.mTransportCallback = hTTPTransportCallback;
        this.mRequestHandler.setDelegate(this);
    }

    public void bodyBytesGenerated(long j) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.bodyBytesGenerated(j);
        }
    }

    public void bodyBytesReceived(long j) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.bodyBytesReceived(j);
        }
    }

    public void cancel() {
        this.mRequestHandler.setDelegate(null);
        cancelNative();
    }

    public void changePriority(int i) {
        changePriorityNative(i);
    }

    public void finalize() {
        try {
            closeNative();
        } finally {
            super.finalize();
        }
    }

    public void firstByteFlushed() {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.firstByteFlushed();
        }
    }

    public void firstHeaderByteFlushed() {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.firstHeaderByteFlushed();
        }
    }

    public int getEnabledCallbackFlag() {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        return hTTPTransportCallback != null ? hTTPTransportCallback.getEnabledCallbackFlag() : 0;
    }

    public void headerBytesGenerated(long j, long j2) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.headerBytesGenerated(j, j2);
        }
    }

    public void headerBytesReceived(long j, long j2) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.headerBytesReceived(j, j2);
        }
    }

    public void lastByteAcked(long j) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.lastByteAcked(j);
        }
    }

    public void lastByteFlushed() {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.lastByteFlushed();
        }
    }

    public void onBody() {
        this.mResponseHandler.onBody();
    }

    public void onEOM() {
        this.mResponseHandler.onEOM();
        this.mRequestHandler.setDelegate(null);
    }

    public void onError(HTTPRequestError hTTPRequestError) {
        this.mResponseHandler.onError(hTTPRequestError);
        this.mRequestHandler.setDelegate(null);
    }

    public void onResponse(int i, String str, Header[] headerArr) {
        this.mResponseHandler.onResponse(i, str, headerArr);
    }

    public boolean sendBody(byte[] bArr, int i, int i2) {
        return sendBodyNative(bArr, i, i2);
    }

    public boolean sendEOM() {
        return sendEOMNative();
    }

    public boolean sendHeaders(HttpUriRequest httpUriRequest) {
        return sendHeadersNative(httpUriRequest);
    }

    public boolean sendRequestWithBodyAndEom(HttpUriRequest httpUriRequest, byte[] bArr, int i, int i2) {
        return sendRequestWithBodyAndEOMNative(httpUriRequest, bArr, i, i2);
    }
}
