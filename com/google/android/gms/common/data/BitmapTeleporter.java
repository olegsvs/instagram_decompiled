package com.google.android.gms.common.data;

import X.AnonymousClass1z7;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.io.Closeable;
import java.io.File;

public class BitmapTeleporter extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass1z7();
    /* renamed from: B */
    public ParcelFileDescriptor f24996B;
    /* renamed from: C */
    public File f24997C;
    /* renamed from: D */
    private Bitmap f24998D = null;
    /* renamed from: E */
    private int f24999E;
    /* renamed from: F */
    private int f25000F;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f24999E = i;
        this.f24996B = parcelFileDescriptor;
        this.f25000F = i2;
    }

    /* renamed from: B */
    private static void m14022B(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    public final void writeToParcel(android.os.Parcel r7, int r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = r6.f24996B;
        if (r0 != 0) goto L_0x006d;
    L_0x0004:
        r5 = r6.f24998D;
        r1 = r5.getRowBytes();
        r0 = r5.getHeight();
        r1 = r1 * r0;
        r0 = java.nio.ByteBuffer.allocate(r1);
        r5.copyPixelsToBuffer(r0);
        r4 = r0.array();
        r2 = r6.f24997C;
        if (r2 == 0) goto L_0x009d;
    L_0x001e:
        r1 = "teleporter";	 Catch:{ IOException -> 0x0094 }
        r0 = ".tmp";	 Catch:{ IOException -> 0x0094 }
        r2 = java.io.File.createTempFile(r1, r0, r2);	 Catch:{ IOException -> 0x0094 }
        r1 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x008c }
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x008c }
        r0 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;	 Catch:{ FileNotFoundException -> 0x008c }
        r0 = android.os.ParcelFileDescriptor.open(r2, r0);	 Catch:{ FileNotFoundException -> 0x008c }
        r6.f24996B = r0;	 Catch:{ FileNotFoundException -> 0x008c }
        r2.delete();
        r3 = new java.io.DataOutputStream;
        r3.<init>(r1);
        r0 = r4.length;	 Catch:{ IOException -> 0x0064 }
        r3.writeInt(r0);	 Catch:{ IOException -> 0x0064 }
        r0 = r5.getWidth();	 Catch:{ IOException -> 0x0064 }
        r3.writeInt(r0);	 Catch:{ IOException -> 0x0064 }
        r0 = r5.getHeight();	 Catch:{ IOException -> 0x0064 }
        r3.writeInt(r0);	 Catch:{ IOException -> 0x0064 }
        r0 = r5.getConfig();	 Catch:{ IOException -> 0x0064 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0064 }
        r3.writeUTF(r0);	 Catch:{ IOException -> 0x0064 }
        r3.write(r4);	 Catch:{ IOException -> 0x0064 }
        m14022B(r3);
        goto L_0x006d;
    L_0x005f:
        r0 = move-exception;
        m14022B(r3);
        throw r0;
    L_0x0064:
        r2 = move-exception;
        r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x005f }
        r0 = "Could not write into unlinked file";	 Catch:{ all -> 0x005f }
        r1.<init>(r0, r2);	 Catch:{ all -> 0x005f }
        throw r1;	 Catch:{ all -> 0x005f }
    L_0x006d:
        r1 = 1;
        r8 = r8 | r1;
        r3 = X.AnonymousClass1zC.m14073U(r7);
        r0 = r6.f24999E;
        X.AnonymousClass1zC.m14071S(r7, r1, r0);
        r2 = 2;
        r1 = r6.f24996B;
        r0 = 0;
        X.AnonymousClass1zC.m14059G(r7, r2, r1, r8, r0);
        r1 = 3;
        r0 = r6.f25000F;
        X.AnonymousClass1zC.m14071S(r7, r1, r0);
        X.AnonymousClass1zC.m14054B(r7, r3);
        r0 = 0;
        r6.f24996B = r0;
        return;
    L_0x008c:
        r1 = new java.lang.IllegalStateException;
        r0 = "Temporary file is somehow already deleted";
        r1.<init>(r0);
        throw r1;
    L_0x0094:
        r2 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r0 = "Could not create temporary file";
        r1.<init>(r0, r2);
        throw r1;
    L_0x009d:
        r1 = new java.lang.IllegalStateException;
        r0 = "setTempDir() must be called before writing this object to a parcel";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.BitmapTeleporter.writeToParcel(android.os.Parcel, int):void");
    }
}
