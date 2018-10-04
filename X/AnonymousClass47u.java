package X;

import android.util.Pair;
import java.nio.ByteBuffer;

/* renamed from: X.47u */
public final class AnonymousClass47u {
    /* renamed from: B */
    public static int m23356B(int i) {
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException("Error parsing SPS!");
    }

    /* renamed from: C */
    public static Pair m23357C(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        if (byteBuffer.get() == (byte) 0) {
            byteBuffer.getShort();
        } else {
            byteBuffer.get();
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.flip();
        ByteBuffer slice = byteBuffer.slice();
        int i = 0;
        while (i < slice.limit() - 4) {
            if (slice.get(i) == (byte) 0 && slice.get(i + 1) == (byte) 0) {
                int i2 = i + 2;
                if (slice.get(i2) == (byte) 0 || slice.get(i2) == (byte) 1) {
                    slice.position(i);
                    ByteBuffer slice2 = slice.slice();
                    slice.flip();
                    return Pair.create(AnonymousClass47t.m23354B(duplicate, slice), slice2);
                }
            }
            i++;
        }
        AnonymousClass1Cy.H(duplicate, "Couldn't find SPS Nalu header!");
        return Pair.create(AnonymousClass47t.m23354B(duplicate, slice), ByteBuffer.allocateDirect(0));
    }
}
