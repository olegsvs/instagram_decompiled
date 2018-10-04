package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.Inflater;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.0B1 */
public final class AnonymousClass0B1 extends AnonymousClass08H {
    /* renamed from: B */
    public final int f1323B;
    /* renamed from: C */
    public final Object f1324C;

    public AnonymousClass0B1(AnonymousClass082 anonymousClass082, Object obj, int i, int i2) {
        super(anonymousClass082, i);
        this.f1324C = obj;
        this.f1323B = i2;
    }

    /* renamed from: C */
    public final Object m762C(DataInputStream dataInputStream) {
        String B;
        int i;
        switch (this.f883C.f793C.ordinal()) {
            case 0:
                String B2;
                String B3;
                AnonymousClass080 B4;
                AnonymousClass081 anonymousClass081 = (AnonymousClass081) this.f1324C;
                B = m499B(dataInputStream);
                String str = null;
                if (anonymousClass081.f789G) {
                    B2 = m499B(dataInputStream);
                    B3 = m499B(dataInputStream);
                } else {
                    B2 = null;
                    B3 = null;
                }
                if (this.f882B > 0) {
                    B4 = anonymousClass081.f786D ? AnonymousClass080.m483B(m499B(dataInputStream)) : null;
                    if (anonymousClass081.f785C) {
                        str = m499B(dataInputStream);
                    }
                } else {
                    B4 = null;
                }
                return new AnonymousClass07z(B, B2, B3, B4, str, Collections.emptyList());
            case 1:
                return AnonymousClass07x.m482B(this.f882B > 0 ? m499B(dataInputStream) : null);
            case 2:
                Object obj = new byte[this.f882B];
                dataInputStream.readFully(obj);
                this.f882B = 0;
                i = this.f1323B;
                if (1 == i || (2 == i && !this.f883C.f796F)) {
                    Inflater inflater = new Inflater();
                    inflater.setInput(obj, 0, obj.length);
                    int length = obj.length * 2;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
                    byte[] bArr = new byte[length];
                    while (!inflater.finished()) {
                        byteArrayOutputStream.write(bArr, 0, inflater.inflate(bArr, 0, length));
                    }
                    byteArrayOutputStream.close();
                    inflater.end();
                    obj = byteArrayOutputStream.toByteArray();
                }
                return obj;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                List arrayList = new ArrayList();
                while (this.f882B > 0) {
                    B = m499B(dataInputStream);
                    i = dataInputStream.readUnsignedByte();
                    this.f882B--;
                    arrayList.add(new SubscribeTopic(B, i));
                }
                return new AnonymousClass08E(arrayList);
            case 8:
                List arrayList2 = new ArrayList();
                while (this.f882B > 0) {
                    i = dataInputStream.readUnsignedByte() & -4;
                    this.f882B--;
                    arrayList2.add(Integer.valueOf(i));
                }
                return new AnonymousClass08D(arrayList2);
            case 9:
                List arrayList3 = new ArrayList();
                while (this.f882B > 0) {
                    arrayList3.add(m499B(dataInputStream));
                }
                return new AnonymousClass08G(arrayList3);
            default:
                return null;
        }
    }
}
