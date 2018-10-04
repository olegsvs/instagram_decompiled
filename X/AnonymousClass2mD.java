package X;

import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProvider;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2mD */
public final class AnonymousClass2mD {
    /* renamed from: B */
    public boolean f33790B = false;
    /* renamed from: C */
    public int f33791C;
    /* renamed from: D */
    public AnonymousClass1xs f33792D;
    /* renamed from: E */
    public final Set f33793E;
    /* renamed from: F */
    public boolean f33794F;
    /* renamed from: G */
    private final AnonymousClass2mI f33795G;

    public AnonymousClass2mD(AnonymousClass2mI anonymousClass2mI, AnonymousClass3xr anonymousClass3xr) {
        this.f33795G = anonymousClass2mI;
        this.f33793E = new HashSet();
        m17156A(new AnonymousClass3sc(this));
    }

    /* renamed from: A */
    public final void m17156A(AnonymousClass2mQ anonymousClass2mQ) {
        if (anonymousClass2mQ != null) {
            synchronized (this.f33793E) {
                this.f33793E.add(anonymousClass2mQ);
            }
            this.f33794F = true;
        }
    }

    /* renamed from: B */
    public static int m17155B(AnonymousClass2mD anonymousClass2mD) {
        FaceTrackerDataProvider faceTrackerDataProvider = anonymousClass2mD.f33795G.m17162A().getFaceTrackerDataProvider();
        if (faceTrackerDataProvider == null) {
            return -2;
        }
        if (faceTrackerDataProvider.isFaceTrackerReady()) {
            return AnonymousClass2mI.m17161B(anonymousClass2mD.f33795G).getFacesCount();
        }
        return -1;
    }
}
