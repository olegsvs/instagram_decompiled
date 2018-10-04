package com.instagram.debug.memorydump;

import X.AnonymousClass1FJ;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;

public class MemoryDumpUploadJobService extends JobServiceCompat {
    public AnonymousClass1FJ getRunJobLogic() {
        return new MemoryDumpUploadJob(getApplicationContext());
    }
}
