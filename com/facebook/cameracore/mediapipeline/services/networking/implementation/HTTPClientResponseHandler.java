package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import com.facebook.cameracore.mediapipeline.services.networking.interfaces.HTTPResponse;
import com.facebook.common.dextricks.DexStore;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

public class HTTPClientResponseHandler implements ResponseHandler {
    public final Object handleResponse(HttpResponse httpResponse) {
        HTTPResponse hTTPResponse = new HTTPResponse();
        hTTPResponse.statusCode = httpResponse.getStatusLine().getStatusCode();
        InputStream content = httpResponse.getEntity().getContent();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[DexStore.LOAD_RESULT_MIXED_MODE];
        while (true) {
            int read = content.read(bArr, 0, bArr.length);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                hTTPResponse.content = byteArrayOutputStream.toByteArray();
                return hTTPResponse;
            }
        }
    }
}
