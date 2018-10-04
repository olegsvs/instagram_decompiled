package com.instagram.debug.devoptions.api;

import X.AnonymousClass0IL;

public abstract class DeveloperOptionsPlugin {
    private static DeveloperOptionsPlugin sInstance;

    public abstract AnonymousClass0IL getDeveloperOptionsFragment();

    public static DeveloperOptionsPlugin getInstance() {
        return sInstance;
    }

    public static void setInstance(DeveloperOptionsPlugin developerOptionsPlugin) {
        sInstance = developerOptionsPlugin;
    }
}
