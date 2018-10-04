package X;

import android.text.TextUtils;
import com.facebook.cameracore.assets.model.ARRequestAsset;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.3rL */
public final class AnonymousClass3rL {
    /* renamed from: A */
    public final Object m20935A(List list) {
        AnonymousClass2gy anonymousClass2gy = new AnonymousClass2gy();
        List<AnonymousClass2gz> arrayList = new ArrayList();
        for (AnonymousClass2gz anonymousClass2gz : list) {
            ARRequestAsset aRRequestAsset = anonymousClass2gz.f32469C;
            File file = anonymousClass2gz.f32468B;
            if (aRRequestAsset.m16916C() == AnonymousClass2h2.EFFECT) {
                String A = aRRequestAsset.m16914A();
                String B = aRRequestAsset.m16915B();
                Object absolutePath = file.getAbsolutePath();
                Object anonymousClass2h7 = (TextUtils.isEmpty(absolutePath) || A == null) ? null : new AnonymousClass2h7(A, B, aRRequestAsset.f32486E.f32459E, absolutePath);
                anonymousClass2gy.f32466B.add(anonymousClass2h7);
            } else if (aRRequestAsset.m16916C() != AnonymousClass2h2.SUPPORT) {
                return null;
            } else {
                arrayList.add(anonymousClass2gz);
            }
        }
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Map hashMap3 = new HashMap();
        Map hashMap4 = new HashMap();
        Map hashMap5 = new HashMap();
        list = new HashMap();
        for (AnonymousClass2gz anonymousClass2gz2 : arrayList) {
            String str = anonymousClass2gz2.f32469C.f32486E.f32459E;
            String path = anonymousClass2gz2.f32468B.getPath();
            AnonymousClass2h9 B2 = anonymousClass2gz2.f32469C.f32486E.m16909B();
            switch (B2.ordinal()) {
                case 0:
                    break;
                case 1:
                    hashMap.put(str, path);
                    break;
                case 2:
                    hashMap2.put(str, path);
                    break;
                case 3:
                    hashMap3.put(str, path);
                    break;
                case 4:
                    hashMap4.put(str, path);
                    break;
                case 5:
                    hashMap5.put(str, path);
                    break;
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                    list.put(str, path);
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Got unsupported type: ");
                    stringBuilder.append(B2);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        anonymousClass2gy.f32467C = new AnonymousClass2h8(hashMap, hashMap2, hashMap3, hashMap4, hashMap5, list);
        return anonymousClass2gy;
    }
}
