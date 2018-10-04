package X;

import android.util.Base64;
import com.facebook.common.dextricks.DexStore;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.video.heroplayer.ipc.VideoLicenseListener;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.UUID;

/* renamed from: X.3sH */
public final class AnonymousClass3sH implements AnonymousClass2s9 {
    /* renamed from: B */
    private final AnonymousClass3tB f45641B;
    /* renamed from: C */
    private final String f45642C;

    public AnonymousClass3sH(String str, AnonymousClass3tB anonymousClass3tB) {
        this.f45642C = str;
        this.f45641B = anonymousClass3tB;
    }

    public final byte[] VH(UUID uuid, AnonymousClass2s3 anonymousClass2s3) {
        String encodeToString = Base64.encodeToString(anonymousClass2s3.uK(), 0);
        AnonymousClass3tB anonymousClass3tB = this.f45641B;
        String str = this.f45642C;
        VideoLicenseListener videoLicenseListener = (VideoLicenseListener) anonymousClass3tB.f46016B.get();
        if (videoLicenseListener != null) {
            try {
                str = videoLicenseListener.DU(str, encodeToString);
            } catch (Throwable e) {
                AnonymousClass1Gl.F(AnonymousClass3tB.f46015C, e, "Failed to get video license for %s", new Object[]{str});
            }
            if (str != null) {
                AnonymousClass1Gl.E(AnonymousClass2ku.f33316C, "Failed to get license for video %s", new Object[]{this.f45642C});
                return null;
            }
            AnonymousClass1Gl.C(AnonymousClass2ku.f33316C, "License for video %s is %s", new Object[]{this.f45642C, str});
            return Base64.decode(str, 0);
        }
        str = null;
        if (str != null) {
            AnonymousClass1Gl.C(AnonymousClass2ku.f33316C, "License for video %s is %s", new Object[]{this.f45642C, str});
            return Base64.decode(str, 0);
        }
        AnonymousClass1Gl.E(AnonymousClass2ku.f33316C, "Failed to get license for video %s", new Object[]{this.f45642C});
        return null;
    }

    public final byte[] WH(UUID uuid, AnonymousClass2s5 anonymousClass2s5) {
        Throwable th;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(anonymousClass2s5.BL());
        stringBuilder.append("&signedRequest=");
        stringBuilder.append(new String(anonymousClass2s5.uK()));
        try {
            anonymousClass2s5 = (HttpURLConnection) new URL(stringBuilder.toString()).openConnection();
            try {
                anonymousClass2s5.setRequestMethod(ReactWebViewManager.HTTP_METHOD_POST);
                anonymousClass2s5.setDoOutput(false);
                anonymousClass2s5.setDoInput(true);
                uuid = AnonymousClass1Ji.C(anonymousClass2s5, -1556763663);
                byte[] bArr = new byte[DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = uuid.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] toByteArray = byteArrayOutputStream.toByteArray();
                uuid.close();
                if (anonymousClass2s5 != null) {
                    anonymousClass2s5.disconnect();
                }
                return toByteArray;
            } catch (Throwable th2) {
                th = th2;
                if (anonymousClass2s5 != null) {
                    anonymousClass2s5.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            anonymousClass2s5 = null;
            if (anonymousClass2s5 != null) {
                anonymousClass2s5.disconnect();
            }
            throw th;
        }
    }
}
