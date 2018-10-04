package com.google.android.gms.dynamic;

import X.AnonymousClass0cQ;
import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper.zza;
import java.lang.reflect.Field;

public final class zzn extends zza {
    /* renamed from: B */
    private final Object f15988B;

    public zzn(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, -1715589948);
        this.f15988B = obj;
        AnonymousClass0cQ.m5858H(this, 1017234403, I);
    }

    /* renamed from: B */
    public static Object m10306B(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof zzn) {
            return ((zzn) iObjectWrapper).f15988B;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            i = declaredFields.length;
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("Unexpected number of IObjectWrapper declared fields: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        } else {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        }
    }
}
