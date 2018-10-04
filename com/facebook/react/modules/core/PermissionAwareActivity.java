package com.facebook.react.modules.core;

public interface PermissionAwareActivity {
    void requestPermissions(String[] strArr, int i, PermissionListener permissionListener);

    boolean shouldShowRequestPermissionRationale(String str);
}
