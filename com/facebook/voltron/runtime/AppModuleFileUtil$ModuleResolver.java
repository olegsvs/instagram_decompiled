package com.facebook.voltron.runtime;

import android.content.Context;

public class AppModuleFileUtil$ModuleResolver {
    private AppModuleFileUtil$ModuleResolver() {
    }

    /* renamed from: B */
    public static String m591B(String str, Context context) {
        context = context.getApplicationInfo().splitSourceDirs;
        if (context != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("split_");
            stringBuilder.append(str);
            stringBuilder.append(".apk");
            str = stringBuilder.toString();
            for (int i = 0; i < context.length; i++) {
                if (context[i].endsWith(str)) {
                    return context[i];
                }
            }
        }
        return null;
    }
}
