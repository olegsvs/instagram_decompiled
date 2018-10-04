package com.facebook.profilo.logger;

import com.facebook.common.dextricks.classid.ClassId;

public final class ClassLoadLogger {
    /* renamed from: B */
    public static int m76B(int i, Class cls, int i2) {
        if (!ClassId.sInitialized) {
            return -1;
        }
        return Logger.writeEntry(i, 89, i2, 0, ClassId.getClassId(cls));
    }

    /* renamed from: C */
    public static int m77C(int i, int i2) {
        if (ClassId.sInitialized) {
            return Logger.writeEntry(i, 90, i2, 0);
        }
        return -1;
    }

    /* renamed from: D */
    public static int m78D(int i, int i2) {
        if (ClassId.sInitialized) {
            return Logger.writeEntry(i, 88, i2, 0);
        }
        return -1;
    }
}
