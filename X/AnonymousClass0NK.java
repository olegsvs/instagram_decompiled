package X;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/* renamed from: X.0NK */
public final class AnonymousClass0NK {
    /* renamed from: B */
    public final File f3545B;
    /* renamed from: C */
    public final File f3546C;
    /* renamed from: D */
    public final File f3547D;
    /* renamed from: E */
    private final Random f3548E = new Random();

    /* renamed from: B */
    public static long m3287B(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public AnonymousClass0NK(File file) {
        this.f3545B = file;
        this.f3547D = new File(file, "beacon_id.lock");
        this.f3546C = new File(file, "beacon_id");
    }

    /* renamed from: A */
    public final long m3290A() {
        try {
            long C;
            synchronized (this) {
                if (!(this.f3547D.exists() || this.f3546C.exists() || this.f3545B.exists())) {
                    if (!this.f3545B.mkdirs()) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Cannot create ");
                        stringBuilder.append(this.f3545B);
                        throw new IOException(stringBuilder.toString());
                    }
                }
                AnonymousClass1Jl anonymousClass1Jl = new AnonymousClass1Jl(this.f3547D);
                DataOutputStream dataOutputStream;
                try {
                    long D = AnonymousClass0NK.m3289D(this);
                    if (D == 0) {
                        C = AnonymousClass0NK.m3288C(this);
                    } else {
                        int i = (int) (D >> 32);
                        int i2 = (int) (D & -1);
                        if (i == Integer.MAX_VALUE) {
                            C = AnonymousClass0NK.m3288C(this);
                        } else {
                            C = AnonymousClass0NK.m3287B(i + 1, i2);
                        }
                    }
                    dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.f3546C), 16));
                    dataOutputStream.writeInt(1);
                    dataOutputStream.writeLong(C);
                    dataOutputStream.close();
                    anonymousClass1Jl.close();
                } catch (Throwable th) {
                    anonymousClass1Jl.close();
                }
            }
            return C;
        } catch (Throwable e) {
            AnonymousClass0Dc.m1256S("BeaconIdGenerator", e, "Failed to increment beacon id", new Object[0]);
            return AnonymousClass0NK.m3288C(this);
        }
    }

    /* renamed from: C */
    public static long m3288C(AnonymousClass0NK anonymousClass0NK) {
        return AnonymousClass0NK.m3287B(0, anonymousClass0NK.f3548E.nextInt());
    }

    /* renamed from: D */
    public static long m3289D(AnonymousClass0NK anonymousClass0NK) {
        if (!anonymousClass0NK.f3546C.exists()) {
            return 0;
        }
        DataInputStream dataInputStream;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(anonymousClass0NK.f3546C), 16));
            int readInt = dataInputStream.readInt();
            if (readInt == 1) {
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                return readLong;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected 1; got ");
            stringBuilder.append(readInt);
            throw new IOException(stringBuilder.toString());
        } catch (Throwable e) {
            AnonymousClass0Dc.m1256S("BeaconIdGenerator", e, "Failure reading beacon id file %s", anonymousClass0NK.f3546C);
            return 0;
        } catch (Throwable th) {
            dataInputStream.close();
        }
    }
}
