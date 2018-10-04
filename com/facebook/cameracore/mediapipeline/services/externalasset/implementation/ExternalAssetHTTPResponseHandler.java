package com.facebook.cameracore.mediapipeline.services.externalasset.implementation;

import com.facebook.cameracore.mediapipeline.services.externalasset.interfaces.ExternalAssetResponse;
import com.facebook.common.dextricks.DexStore;
import com.facebook.native_bridge.NativeDataPromise;
import java.io.InputStream;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ResponseHandler;

public class ExternalAssetHTTPResponseHandler implements ResponseHandler {
    /* renamed from: B */
    private final NativeDataPromise f33065B;

    public ExternalAssetHTTPResponseHandler(NativeDataPromise nativeDataPromise) {
        this.f33065B = nativeDataPromise;
    }

    /* renamed from: A */
    public final Void m17001A(HttpResponse httpResponse) {
        try {
            StatusLine statusLine = httpResponse.getStatusLine();
            if (statusLine.getStatusCode() != 200) {
                this.f33065B.setException(statusLine.getReasonPhrase());
            } else {
                ExternalAssetResponse externalAssetResponse;
                InputStream content = httpResponse.getEntity().getContent();
                byte[] bArr = new byte[DexStore.LOAD_RESULT_MIXED_MODE];
                while (true) {
                    int read = content.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        break;
                    }
                    externalAssetResponse = new ExternalAssetResponse();
                    externalAssetResponse.buffer = bArr;
                    externalAssetResponse.length = read;
                    this.f33065B.setValue(externalAssetResponse);
                }
                externalAssetResponse = new ExternalAssetResponse();
                externalAssetResponse.completed = true;
                this.f33065B.setValue(externalAssetResponse);
            }
        } catch (Exception e) {
            this.f33065B.setException(e.toString());
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
        return m17001A(httpResponse);
    }
}
