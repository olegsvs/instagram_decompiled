package com.facebook.analytics2.logger;

public interface UploadJobInstrumentation {
    void recordUploadJobStart(int i, String str);

    void recordUploadJobStop(String str);
}
