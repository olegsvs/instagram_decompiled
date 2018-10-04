package X;

import android.media.MediaCodec.BufferInfo;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.42Y */
public final class AnonymousClass42Y implements AnonymousClass3ou {
    /* renamed from: B */
    private final List f48778B = new ArrayList();

    public final void FXA(AnonymousClass3ot anonymousClass3ot) {
        for (Pair pair : this.f48778B) {
            anonymousClass3ot.GXA(((ByteBuffer) pair.first).asReadOnlyBuffer(), (BufferInfo) pair.second);
        }
    }

    public final void dD(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        if (((bufferInfo.flags & 2) != 0 ? 1 : null) != null) {
            BufferInfo bufferInfo2 = new BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.limit());
            allocateDirect.put(byteBuffer.asReadOnlyBuffer());
            this.f48778B.add(new Pair(allocateDirect, bufferInfo2));
        }
    }
}
