package X;

import java.io.DataInputStream;
import java.io.IOException;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.0B3 */
public final class AnonymousClass0B3 extends AnonymousClass08H {
    public AnonymousClass0B3(AnonymousClass082 anonymousClass082, int i) {
        super(anonymousClass082, i);
    }

    /* renamed from: C */
    public final Object m763C(DataInputStream dataInputStream) {
        switch (this.f883C.f793C.ordinal()) {
            case 0:
                if ("MQIsdp".equals(m499B(dataInputStream))) {
                    byte readByte = dataInputStream.readByte();
                    int readUnsignedByte = dataInputStream.readUnsignedByte();
                    this.f882B -= 2;
                    return new AnonymousClass081(readByte, (readUnsignedByte & 128) == 128, (readUnsignedByte & 64) == 64, (readUnsignedByte & 4) == 4, (readUnsignedByte & 32) == 32, (readUnsignedByte & 24) >> 3, (readUnsignedByte & 2) == 2, m498A(dataInputStream));
                }
                dataInputStream.close();
                throw new IOException("Invalid input - missing header");
            case 1:
                dataInputStream.readUnsignedByte();
                byte readByte2 = dataInputStream.readByte();
                this.f882B -= 2;
                return new AnonymousClass07y(readByte2);
            case 2:
                return new AnonymousClass08C(m499B(dataInputStream), this.f883C.f794D > 0 ? m498A(dataInputStream) : -1);
            case 3:
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
            case 8:
            case 9:
            case 10:
                return new AnonymousClass084(m498A(dataInputStream));
            default:
                return null;
        }
    }
}
