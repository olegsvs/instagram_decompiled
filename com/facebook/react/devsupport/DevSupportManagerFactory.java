package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import java.util.Map;

public final class DevSupportManagerFactory {
    public static DevSupportManager create(Context context, ReactInstanceManagerDevHelper reactInstanceManagerDevHelper, String str, boolean z, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i, Map map) {
        if (!z) {
            return new DisabledDevSupportManager();
        }
        try {
            StringBuilder stringBuilder = new StringBuilder("com.facebook.react.devsupport");
            stringBuilder.append(".");
            stringBuilder.append("DevSupportManagerImpl");
            return (DevSupportManager) Class.forName(stringBuilder.toString()).getConstructor(new Class[]{Context.class, ReactInstanceManagerDevHelper.class, String.class, Boolean.TYPE, RedBoxHandler.class, DevBundleDownloadListener.class, Integer.TYPE, Map.class}).newInstance(new Object[]{context, reactInstanceManagerDevHelper, str, Boolean.valueOf(true), redBoxHandler, devBundleDownloadListener, Integer.valueOf(i), map});
        } catch (Throwable e) {
            throw new RuntimeException("Requested enabled DevSupportManager, but DevSupportManagerImpl class was not found or could not be created", e);
        }
    }
}
