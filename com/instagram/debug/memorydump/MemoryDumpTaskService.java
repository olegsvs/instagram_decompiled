package com.instagram.debug.memorydump;

import X.AnonymousClass1FJ;
import com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat;

public class MemoryDumpTaskService extends GcmTaskServiceCompat {
    public AnonymousClass1FJ getRunJobLogic() {
        return new MemoryDumpUploadJob(getApplicationContext());
    }
}
