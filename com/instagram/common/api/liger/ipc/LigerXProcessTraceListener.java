package com.instagram.common.api.liger.ipc;

import android.os.IInterface;
import java.util.Map;

public interface LigerXProcessTraceListener extends IInterface {
    void onTraceEvents(Map map);
}
