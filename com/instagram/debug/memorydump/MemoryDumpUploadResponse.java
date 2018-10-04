package com.instagram.debug.memorydump;

import X.AnonymousClass0Po;

public class MemoryDumpUploadResponse extends AnonymousClass0Po {
    public boolean success;

    public boolean isOk() {
        return super.isOk() && this.success;
    }
}
