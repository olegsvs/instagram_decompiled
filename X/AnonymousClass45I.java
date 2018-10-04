package X;

import android.media.MediaCodec.CryptoException;
import android.view.Surface;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;

/* renamed from: X.45I */
public final class AnonymousClass45I implements AnonymousClass3tt, AnonymousClass3to, AnonymousClass2sC, AnonymousClass3u3 {
    /* renamed from: B */
    private final AnonymousClass2pd f49746B;

    public final void Ai(CryptoException cryptoException) {
    }

    public final void Ek(int i, long j) {
    }

    public final void Ri(AnonymousClass2qZ anonymousClass2qZ) {
    }

    public final void td(AnonymousClass2qx anonymousClass2qx) {
    }

    public final void ud(int i, long j, long j2) {
    }

    public final void vd(AnonymousClass2qz anonymousClass2qz) {
    }

    public AnonymousClass45I(AnonymousClass2pd anonymousClass2pd) {
        this.f49746B = anonymousClass2pd;
    }

    public final void Ak(Surface surface) {
        AnonymousClass2pR.m17342B(this.f49746B, "Surface is drawn", new Object[0]);
        this.f49746B.f34601p = surface;
        this.f49746B.f34596k.zj();
    }

    public final void Ck() {
        AnonymousClass2pR.m17342B(this.f49746B, "DRM keys loaded", new Object[0]);
    }

    public final void Dk(Exception exception) {
        AnonymousClass2pR.m17345E(this.f49746B, exception, "DRM error", new Object[0]);
    }

    public final void Dq(int i, long j, int i2, int i3, AnonymousClass2rO anonymousClass2rO, long j2, long j3, long j4) {
        AnonymousClass2pR.m17342B(this.f49746B, "ChunkLoad started: sourceId=%d, length=%d, mediaStartTimeMs=%d, mediaEndTimeMs=%d", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
    }

    public final void HGA(int i, int i2, int i3, float f) {
        AnonymousClass2pR.m17342B(this.f49746B, "onVideoSizeChanged w=%d h=%d unapplieddRotation=%d pixelWHRatio=%f", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f));
        this.f49746B.f34596k.GGA(i, i2);
    }

    public final void Nj(int i, AnonymousClass2rO anonymousClass2rO, int i2, long j, String str) {
        ParcelableFormat parcelableFormat;
        AnonymousClass45I anonymousClass45I = this;
        AnonymousClass2rO anonymousClass2rO2 = anonymousClass2rO;
        if (!(anonymousClass2rO == null || anonymousClass2rO2.f35070S == null)) {
            AnonymousClass2pR.m17342B(anonymousClass45I.f49746B, "Format: %s, bitrate: %d kbps, w: %d, h: %d", anonymousClass2rO2.f35070S, Integer.valueOf(anonymousClass2rO2.f35055D / JsonMappingException.MAX_REFS_TO_LIST), Integer.valueOf(anonymousClass2rO2.f35071T), Integer.valueOf(anonymousClass2rO2.f35067P));
        }
        if (anonymousClass2rO == null) {
            parcelableFormat = null;
        } else {
            String str2 = anonymousClass2rO2.f35068Q;
            j = anonymousClass2rO2.f35070S;
            i2 = anonymousClass2rO2.f35071T;
            int i3 = anonymousClass2rO2.f35067P;
            float f = anonymousClass2rO2.f35066O;
            int i4 = anonymousClass2rO2.f35053B;
            int i5 = anonymousClass2rO2.f35054C;
            int i6 = anonymousClass2rO2.f35055D;
            String str3 = anonymousClass2rO2.f35069R;
            String str4 = anonymousClass2rO2.f35056E;
            String str5 = anonymousClass2rO2.f35065N;
            String str6 = anonymousClass2rO2.f35063L;
            int i7 = i4;
            int i8 = i5;
            int i9 = i6;
            String str7 = str2;
            String str8 = j;
            i4 = i2;
            ParcelableFormat parcelableFormat2 = new ParcelableFormat(str7, str8, i4, i3, f, i7, i8, i9, str3, str4, str5, str6, anonymousClass2rO2.f35064M, anonymousClass2rO2.f35059H, anonymousClass2rO2.f35060I, anonymousClass2rO2.f35061J, anonymousClass2rO2.f35058G, anonymousClass2rO2.f35057F, anonymousClass2rO2.f35062K);
        }
        AnonymousClass2rg anonymousClass2rg = anonymousClass45I.f49746B.f34563D;
        anonymousClass45I.f49746B.f34596k.Qj(parcelableFormat, str, anonymousClass2rg != null ? anonymousClass2rg.sK() : null);
    }

    public final void Ti(String str, boolean z, long j, long j2) {
        AnonymousClass2pR.m17342B(this.f49746B, "onDecoderInitialized name:%s, duration:%d", str, Long.valueOf(j2));
        this.f49746B.f34596k.Si(str, z, j2);
    }

    public final void mp(int i, long j, String str) {
        AnonymousClass2pR.m17342B(this.f49746B, "ChunkLoad cancelled: sourceId=%d, bytesLoaded=%d, loaderLogInfo=%s", Integer.valueOf(i), Long.valueOf(j), str);
    }

    public final void rEA(int i, long j, long j2) {
        AnonymousClass2pR.m17342B(this.f49746B, "ChunkLoad upstream discarded: sourceId=%d, mediaStartTimeMs=%d, mediaEndTimeMs=%d", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2));
    }

    public final void sp(int i, long j, int i2, int i3, AnonymousClass2rO anonymousClass2rO, long j2, long j3, long j4, long j5, String str) {
        AnonymousClass2pR.m17342B(this.f49746B, "ChunkLoad completed: sourceId=%d, mediaStartTimeMs=%d, mediaEndTimeMs=%d, elapsedMs=%d, durationMs=%d, loaderLogInfo=%s", Integer.valueOf(i), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), str);
    }

    public final void yp(int i, IOException iOException, long j, long j2, String str) {
        AnonymousClass2pR.m17342B(this.f49746B, "ChunkLoad error: sourceId=%d, message=%s, loaderLogInfo=%s", Integer.valueOf(i), iOException.getMessage(), str);
    }
}
