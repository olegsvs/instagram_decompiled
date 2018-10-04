package com.facebook.proxygen;

import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.methods.HttpUriRequest;

public class HTTPRequestHandler {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final int MAX_BUFFER_COUNT = 20;
    private static final int SMALL_REQUESTS_BODY_BUFFER_SIZE = 4096;
    private ArrayList mBodyBuffersPool = new ArrayList(20);
    private JniHandler mDelegate;
    private HandlerInterface mHandlerInterface = new HandlerInterface();
    private boolean mIsCanceled;

    public class HandlerInterface implements com.facebook.proxygen.utils.RequestDefragmentingOutputStream.HandlerInterface {
        public boolean sendBody(byte[] bArr, int i, int i2) {
            return HTTPRequestHandler.sendBody(HTTPRequestHandler.this, bArr, i, i2);
        }

        public boolean sendEOM() {
            return HTTPRequestHandler.sendEOM(HTTPRequestHandler.this);
        }

        public boolean sendHeaders(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
            return HTTPRequestHandler.this.sendHeaders((HttpUriRequest) httpEntityEnclosingRequest);
        }

        public boolean sendRequestWithBodyAndEom(HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr, int i, int i2) {
            return HTTPRequestHandler.this.sendHeadersWithBodyAndEom((HttpUriRequest) httpEntityEnclosingRequest, bArr, i, i2);
        }
    }

    private synchronized byte[] acquireBodyBuffer() {
        byte[] bArr;
        if (this.mBodyBuffersPool.isEmpty()) {
            bArr = new byte[4096];
        } else {
            bArr = (byte[]) this.mBodyBuffersPool.remove(this.mBodyBuffersPool.size() - 1);
        }
        return bArr;
    }

    public void cancel() {
        JniHandler jniHandler = this.mDelegate;
        if (jniHandler != null) {
            jniHandler.cancel();
            this.mIsCanceled = true;
            this.mDelegate = null;
        }
    }

    public void changePriority(int i) {
        JniHandler jniHandler = this.mDelegate;
        if (jniHandler != null) {
            jniHandler.changePriority(i);
        }
    }

    public void execute(HttpUriRequest httpUriRequest) {
        if (sendHeaders(httpUriRequest)) {
            sendRequestBody(httpUriRequest);
            sendEOM(this);
        }
    }

    public void executeWithDefragmentation(HttpUriRequest httpUriRequest) {
        if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
            HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest) httpUriRequest;
            if (httpEntityEnclosingRequest.getEntity() != null) {
                HttpEntity entity = httpEntityEnclosingRequest.getEntity();
                byte[] acquireBodyBuffer = acquireBodyBuffer();
                try {
                    OutputStream requestDefragmentingOutputStream = new RequestDefragmentingOutputStream(this.mHandlerInterface, httpEntityEnclosingRequest, acquireBodyBuffer);
                    entity.writeTo(requestDefragmentingOutputStream);
                    requestDefragmentingOutputStream.writeEomIfNecessary();
                    return;
                } finally {
                    releaseBodyBuffer(acquireBodyBuffer);
                }
            }
        }
        sendHeadersWithBodyAndEom(httpUriRequest, EMPTY_BYTE_ARRAY, 0, 0);
    }

    private boolean isChunkedRequest(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        Header firstHeader = httpEntityEnclosingRequest.getFirstHeader("Transfer-Encoding");
        return firstHeader != null && "chunked".equalsIgnoreCase(firstHeader.getValue());
    }

    private void processEntityRequest(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        HttpEntity entity = httpEntityEnclosingRequest.getEntity();
        if (entity != null) {
            OutputStream hTTPRequestHandler$CloseSuppressingOutputStream = new HTTPRequestHandler$CloseSuppressingOutputStream(new HTTPRequestHandler$AndroidBufferedOutputStream(new HTTPRequestHandler$LigerBodyOutputStream(this)));
            try {
                entity.writeTo(hTTPRequestHandler$CloseSuppressingOutputStream);
                hTTPRequestHandler$CloseSuppressingOutputStream.flush();
            } finally {
                hTTPRequestHandler$CloseSuppressingOutputStream.reallyClose();
            }
        }
    }

    private synchronized void releaseBodyBuffer(byte[] bArr) {
        if (this.mBodyBuffersPool.size() != 20) {
            this.mBodyBuffersPool.add(bArr);
        }
    }

    public static boolean sendBody(HTTPRequestHandler hTTPRequestHandler, byte[] bArr, int i, int i2) {
        JniHandler jniHandler = hTTPRequestHandler.mDelegate;
        if (jniHandler != null) {
            return jniHandler.sendBody(bArr, i, i2);
        }
        return hTTPRequestHandler.mIsCanceled;
    }

    public static boolean sendEOM(HTTPRequestHandler hTTPRequestHandler) {
        JniHandler jniHandler = hTTPRequestHandler.mDelegate;
        if (jniHandler != null) {
            return jniHandler.sendEOM();
        }
        return hTTPRequestHandler.mIsCanceled;
    }

    public boolean sendHeaders(HttpUriRequest httpUriRequest) {
        JniHandler jniHandler = this.mDelegate;
        if (jniHandler != null) {
            return jniHandler.sendHeaders(httpUriRequest);
        }
        return this.mIsCanceled;
    }

    public boolean sendHeadersWithBodyAndEom(HttpUriRequest httpUriRequest, byte[] bArr, int i, int i2) {
        JniHandler jniHandler = this.mDelegate;
        if (jniHandler != null) {
            return jniHandler.sendRequestWithBodyAndEom(httpUriRequest, bArr, i, i2);
        }
        return this.mIsCanceled;
    }

    public void sendRequestBody(org.apache.http.client.methods.HttpUriRequest r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = r2 instanceof org.apache.http.HttpEntityEnclosingRequest;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r2 = (org.apache.http.HttpEntityEnclosingRequest) r2;	 Catch:{ HTTPRequestHandler$LigerNetworkException -> 0x0010, IOException -> 0x000b }
        r1.processEntityRequest(r2);	 Catch:{ HTTPRequestHandler$LigerNetworkException -> 0x0010, IOException -> 0x000b }
        goto L_0x0004;	 Catch:{ HTTPRequestHandler$LigerNetworkException -> 0x0010, IOException -> 0x000b }
    L_0x000b:
        r0 = move-exception;
        r1.cancel();
        throw r0;
    L_0x0010:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.proxygen.HTTPRequestHandler.sendRequestBody(org.apache.http.client.methods.HttpUriRequest):void");
    }

    public void setDelegate(JniHandler jniHandler) {
        this.mDelegate = jniHandler;
    }
}
