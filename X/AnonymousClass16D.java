package X;

import android.content.Context;
import com.facebook.common.dextricks.DexStore;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.16D */
public final class AnonymousClass16D {
    /* renamed from: B */
    private final File f14500B;

    public AnonymousClass16D(Context context, String str, AnonymousClass169 anonymousClass169) {
        if (str == null) {
            str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        }
        File file = new File(context.getDir("funnel_backup", 0), str);
        file.mkdirs();
        this.f14500B = new File(file, "backup_for_all");
    }

    /* renamed from: A */
    public final synchronized Map m9379A() {
        Map hashMap = new HashMap();
        if (r6.f14500B.exists()) {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(r6.f14500B), DexStore.LOAD_RESULT_MIXED_MODE));
            try {
                if (dataInputStream.readByte() != (byte) 1) {
                    AnonymousClass0Dc.m1245H("FunnelBackupStorageFileImpl", "Expected version %d, found version %d", Byte.valueOf((byte) 1), Byte.valueOf(dataInputStream.readByte()));
                } else {
                    int readInt = dataInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        String readUTF = dataInputStream.readUTF();
                        AnonymousClass1I9 anonymousClass1I9 = new AnonymousClass1I9();
                        Object obj = null;
                        while (obj == null) {
                            short readShort = dataInputStream.readShort();
                            int i2;
                            switch (readShort) {
                                case (short) 1:
                                    anonymousClass1I9.f16830D = AnonymousClass168.m9377C(dataInputStream.readUTF());
                                    break;
                                case (short) 2:
                                    anonymousClass1I9.f16831E = dataInputStream.readLong();
                                    break;
                                case (short) 3:
                                    anonymousClass1I9.f16834H = dataInputStream.readInt();
                                    break;
                                case (short) 4:
                                    anonymousClass1I9.f16829C = dataInputStream.readLong();
                                    break;
                                case (short) 5:
                                    anonymousClass1I9.f16832F = dataInputStream.readLong();
                                    break;
                                case (short) 6:
                                    int readInt2 = dataInputStream.readInt();
                                    List arrayList = new ArrayList(readInt2);
                                    for (i2 = 0; i2 < readInt2; i2++) {
                                        arrayList.add(dataInputStream.readUTF());
                                    }
                                    anonymousClass1I9.f16835I = arrayList;
                                    break;
                                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                                    int readInt3 = dataInputStream.readInt();
                                    List arrayList2 = new ArrayList(readInt3);
                                    for (int i3 = 0; i3 < readInt3; i3++) {
                                        Object obj2 = null;
                                        String str = null;
                                        String str2 = null;
                                        String str3 = null;
                                        i2 = 0;
                                        while (obj2 == null) {
                                            short readShort2 = dataInputStream.readShort();
                                            switch (readShort2) {
                                                case (short) 701:
                                                    str = dataInputStream.readUTF();
                                                    break;
                                                case (short) 702:
                                                    i2 = dataInputStream.readInt();
                                                    break;
                                                case (short) 703:
                                                    str2 = dataInputStream.readUTF();
                                                    break;
                                                case (short) 704:
                                                    str3 = dataInputStream.readUTF();
                                                    break;
                                                case (short) 705:
                                                    obj2 = 1;
                                                    break;
                                                default:
                                                    StringBuilder stringBuilder = new StringBuilder();
                                                    stringBuilder.append("Unsupported type ");
                                                    stringBuilder.append(readShort2);
                                                    stringBuilder.append(" while loading funnels");
                                                    throw new IllegalStateException(stringBuilder.toString());
                                            }
                                        }
                                        arrayList2.add(new AnonymousClass1IA(str, i2, str2, str3));
                                    }
                                    anonymousClass1I9.f16828B = arrayList2;
                                    break;
                                case (short) 9:
                                    obj = 1;
                                    break;
                                default:
                                    StringBuilder stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append("Unsupported type ");
                                    stringBuilder2.append(readShort);
                                    stringBuilder2.append(" while loading funnels");
                                    throw new IllegalStateException(stringBuilder2.toString());
                            }
                        }
                        AnonymousClass1IB anonymousClass1IB = new AnonymousClass1IB(anonymousClass1I9);
                        if (anonymousClass1IB.f16843D != null) {
                            hashMap.put(readUTF, anonymousClass1IB);
                        } else {
                            AnonymousClass0Dc.m1259V("FunnelBackupStorageFileImpl", "Parsed funnel instance with null FunnelDefinition for key: %s", readUTF);
                        }
                    }
                    dataInputStream.close();
                    Integer.valueOf(hashMap.size());
                }
            } finally {
                dataInputStream.close();
            }
        }
        return hashMap;
    }

    /* renamed from: B */
    public final void m9380B(Map map) {
        if (map.isEmpty()) {
            this.f14500B.delete();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f14500B.getName());
        stringBuilder.append(".");
        File createTempFile = File.createTempFile(stringBuilder.toString(), ".tmp", this.f14500B.getParentFile());
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile), DexStore.LOAD_RESULT_MIXED_MODE));
        dataOutputStream.writeByte(1);
        dataOutputStream.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            dataOutputStream.writeUTF((String) entry.getKey());
            AnonymousClass1IB anonymousClass1IB = (AnonymousClass1IB) entry.getValue();
            dataOutputStream.writeShort(1);
            dataOutputStream.writeUTF(anonymousClass1IB.f16843D.f7570G);
            dataOutputStream.writeShort(2);
            dataOutputStream.writeLong(anonymousClass1IB.f16844E);
            dataOutputStream.writeShort(3);
            dataOutputStream.writeInt(anonymousClass1IB.f16847H);
            dataOutputStream.writeShort(4);
            dataOutputStream.writeLong(anonymousClass1IB.f16842C);
            dataOutputStream.writeShort(5);
            dataOutputStream.writeLong(anonymousClass1IB.f16845F);
            List<String> list = anonymousClass1IB.f16848I;
            if (list != null) {
                dataOutputStream.writeShort(6);
                dataOutputStream.writeInt(list.size());
                for (String writeUTF : list) {
                    String writeUTF2;
                    dataOutputStream.writeUTF(writeUTF2);
                }
            }
            List<AnonymousClass1IA> list2 = anonymousClass1IB.f16841B;
            if (list2 != null) {
                dataOutputStream.writeShort(7);
                dataOutputStream.writeInt(list2.size());
                for (AnonymousClass1IA anonymousClass1IA : list2) {
                    dataOutputStream.writeShort(701);
                    dataOutputStream.writeUTF(anonymousClass1IA.f16836B);
                    dataOutputStream.writeShort(702);
                    dataOutputStream.writeInt(anonymousClass1IA.f16839E);
                    if (anonymousClass1IA.f16840F != null) {
                        dataOutputStream.writeShort(703);
                        dataOutputStream.writeUTF(anonymousClass1IA.f16840F);
                    }
                    if (anonymousClass1IA.f16837C != null) {
                        dataOutputStream.writeShort(704);
                        AnonymousClass1ug anonymousClass1ug = anonymousClass1IA.f16837C;
                        synchronized (anonymousClass1ug) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append('{');
                            Object obj = 1;
                            for (Entry entry2 : anonymousClass1ug.f24041B.entrySet()) {
                                if (obj == null) {
                                    stringBuilder2.append(',');
                                }
                                String str = (String) entry2.getKey();
                                stringBuilder2.append('\"');
                                stringBuilder2.append(str);
                                stringBuilder2.append('\"');
                                stringBuilder2.append(':');
                                if (entry2.getValue() instanceof String) {
                                    str = (String) entry2.getValue();
                                    stringBuilder2.append('\"');
                                    stringBuilder2.append(str);
                                    stringBuilder2.append('\"');
                                } else {
                                    stringBuilder2.append(entry2.getValue());
                                }
                                obj = null;
                            }
                            stringBuilder2.append('}');
                            writeUTF2 = stringBuilder2.toString();
                            try {
                            } catch (Throwable th) {
                                dataOutputStream.close();
                            }
                        }
                        dataOutputStream.writeUTF(writeUTF2);
                    } else if (anonymousClass1IA.f16838D != null) {
                        dataOutputStream.writeShort(704);
                        dataOutputStream.writeUTF(anonymousClass1IA.f16838D);
                    }
                    dataOutputStream.writeShort(705);
                }
                continue;
            }
            dataOutputStream.writeShort(9);
        }
        dataOutputStream.close();
        synchronized (this) {
            if (createTempFile.renameTo(this.f14500B)) {
            } else {
                createTempFile.delete();
                throw new IOException("Failed to replace the current preference file!");
            }
        }
        Integer.valueOf(map.size());
    }
}
