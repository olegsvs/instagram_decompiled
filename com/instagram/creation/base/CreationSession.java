package com.instagram.creation.base;

import X.AnonymousClass0CC;
import X.AnonymousClass0OA;
import X.AnonymousClass0PJ;
import X.AnonymousClass0g0;
import X.AnonymousClass1Qp;
import X.AnonymousClass1Qs;
import X.AnonymousClass3CA;
import X.AnonymousClass3CD;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.instagram.filterkit.filter.IgFilterGroup;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.people.PeopleTag;
import com.instagram.pendingmedia.model.PendingRecipient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class CreationSession implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3CA();
    /* renamed from: B */
    public float f38948B;
    /* renamed from: C */
    public String f38949C;
    /* renamed from: D */
    public MediaCaptureConfig f38950D;
    /* renamed from: E */
    public AnonymousClass0g0 f38951E;
    /* renamed from: F */
    public AnonymousClass1Qp f38952F;
    /* renamed from: G */
    public MediaSession f38953G;
    /* renamed from: H */
    public int f38954H;
    /* renamed from: I */
    public final HashMap f38955I;
    /* renamed from: J */
    public boolean f38956J;
    /* renamed from: K */
    public boolean f38957K;
    /* renamed from: L */
    public LocationSignalPackage f38958L;
    /* renamed from: M */
    public String f38959M;
    /* renamed from: N */
    public List f38960N = new ArrayList();
    /* renamed from: O */
    public int f38961O;
    /* renamed from: P */
    public ArrayList f38962P;
    /* renamed from: Q */
    public Bitmap f38963Q;
    /* renamed from: R */
    public Rect f38964R;
    /* renamed from: S */
    public final List f38965S;
    /* renamed from: T */
    public final HashMap f38966T;
    /* renamed from: U */
    public AnonymousClass1Qp f38967U;
    /* renamed from: V */
    private DirectThreadKey f38968V;
    /* renamed from: W */
    private ArrayList f38969W;

    public final int describeContents() {
        return 0;
    }

    public CreationSession() {
        ArrayList arrayList = new ArrayList();
        this.f38962P = new ArrayList();
        this.f38969W = new ArrayList();
        this.f38965S = new ArrayList();
        this.f38955I = new HashMap();
        this.f38966T = new HashMap();
        this.f38948B = 1.0f;
        m18965B();
        this.f38967U = ((Boolean) AnonymousClass0CC.rV.G()).booleanValue() ? AnonymousClass1Qp.RECTANGULAR : AnonymousClass1Qp.SQUARE;
    }

    public CreationSession(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f38962P = new ArrayList();
        this.f38969W = new ArrayList();
        this.f38965S = new ArrayList();
        this.f38955I = new HashMap();
        this.f38966T = new HashMap();
        this.f38948B = 1.0f;
        this.f38951E = AnonymousClass0g0.values()[parcel.readInt()];
        this.f38950D = (MediaCaptureConfig) parcel.readParcelable(MediaCaptureConfig.class.getClassLoader());
        this.f38961O = parcel.readInt();
        this.f38962P = parcel.createTypedArrayList(PeopleTag.CREATOR);
        boolean z = true;
        this.f38952F = parcel.readByte() == (byte) 1 ? AnonymousClass1Qp.RECTANGULAR : AnonymousClass1Qp.SQUARE;
        this.f38967U = parcel.readByte() == (byte) 1 ? AnonymousClass1Qp.RECTANGULAR : AnonymousClass1Qp.SQUARE;
        this.f38954H = parcel.readInt();
        this.f38968V = (DirectThreadKey) parcel.readParcelable(DirectThreadKey.class.getClassLoader());
        this.f38969W = parcel.createTypedArrayList(PendingRecipient.CREATOR);
        this.f38960N = parcel.createTypedArrayList(MediaSession.CREATOR);
        int readInt = parcel.readInt();
        this.f38953G = readInt != -1 ? (MediaSession) this.f38960N.get(readInt) : null;
        this.f38959M = parcel.readString();
        if (parcel.readByte() != (byte) 1) {
            z = false;
        }
        this.f38957K = z;
        this.f38949C = parcel.readString();
        this.f38948B = parcel.readFloat();
        int readInt2 = parcel.readInt();
        for (int i = 0; i < readInt2; i++) {
            this.f38966T.put(parcel.readString(), parcel.readString());
        }
    }

    /* renamed from: A */
    public final CreationSession m18964A(String str, boolean z) {
        MediaSession mediaSession;
        if (z) {
            VideoSession videoSession = new VideoSession();
            videoSession.f39002P = str;
            mediaSession = new MediaSession(videoSession);
        } else {
            PhotoSession photoSession = new PhotoSession();
            photoSession.f38986I = str;
            mediaSession = new MediaSession(photoSession);
        }
        this.f38960N.add(mediaSession);
        this.f38953G = mediaSession;
        if (!(this.f38955I.isEmpty() || this.f38955I.containsKey(str))) {
            this.f38956J = true;
        }
        return this;
    }

    /* renamed from: B */
    public final void m18965B() {
        this.f38961O = -1;
        m18987X(null, null);
        this.f38960N.clear();
        this.f38953G = null;
        this.f38956J = false;
        this.f38962P.clear();
        this.f38952F = this.f38967U;
        this.f38954H = 0;
        this.f38957K = false;
        this.f38959M = null;
        m18983T(null);
        this.f38948B = 0.0f;
        this.f38956J = false;
    }

    /* renamed from: C */
    public final float m18966C() {
        return m18968E().f38988B;
    }

    /* renamed from: D */
    public final PhotoSession m18967D() {
        return this.f38953G.f38976B;
    }

    /* renamed from: E */
    public final VideoSession m18968E() {
        return this.f38953G.f38978D;
    }

    /* renamed from: F */
    public final IgFilterGroup m18969F() {
        return m18967D().f38982E;
    }

    /* renamed from: G */
    public final Location m18970G() {
        MediaSession mediaSession = this.f38953G;
        if (mediaSession == null) {
            return null;
        }
        Location location;
        if (mediaSession.f38977C == AnonymousClass3CD.PHOTO) {
            location = mediaSession.f38976B.f38983F;
        } else {
            location = mediaSession.f38978D.f38994H;
        }
        return location;
    }

    /* renamed from: H */
    public final AnonymousClass1Qs m18971H(String str) {
        for (AnonymousClass1Qs anonymousClass1Qs : this.f38965S) {
            if (anonymousClass1Qs.f18482H.equals(str)) {
                return anonymousClass1Qs;
            }
        }
        return null;
    }

    /* renamed from: I */
    public final List m18972I() {
        return Collections.unmodifiableList(this.f38960N);
    }

    /* renamed from: J */
    public final String m18973J() {
        MediaSession mediaSession = this.f38953G;
        return mediaSession != null ? mediaSession.m18991B() : null;
    }

    /* renamed from: K */
    public final String m18974K() {
        return m18967D().f38986I;
    }

    /* renamed from: L */
    public final PhotoSession m18975L(String str) {
        for (MediaSession mediaSession : this.f38960N) {
            if (mediaSession.f38977C == AnonymousClass3CD.PHOTO && mediaSession.f38976B.f38986I.equals(str)) {
                return mediaSession.f38976B;
            }
        }
        return null;
    }

    /* renamed from: M */
    public final List m18976M() {
        List arrayList = new ArrayList();
        for (MediaSession mediaSession : this.f38960N) {
            if (mediaSession.f38977C == AnonymousClass3CD.PHOTO) {
                arrayList.add(mediaSession.f38976B);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: N */
    public final List m18977N() {
        List arrayList = new ArrayList();
        for (MediaSession mediaSession : this.f38960N) {
            if (mediaSession.f38977C == AnonymousClass3CD.VIDEO) {
                arrayList.add(mediaSession.f38978D);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: O */
    public final boolean m18978O() {
        for (MediaSession mediaSession : this.f38960N) {
            if (mediaSession.f38977C == AnonymousClass3CD.PHOTO) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public final boolean m18979P() {
        for (MediaSession mediaSession : this.f38960N) {
            if (mediaSession.f38977C == AnonymousClass3CD.VIDEO) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Q */
    public final boolean m18980Q() {
        return this.f38949C != null;
    }

    /* renamed from: R */
    public final boolean m18981R() {
        MediaSession mediaSession = this.f38953G;
        return mediaSession != null && mediaSession.f38977C == AnonymousClass3CD.PHOTO;
    }

    /* renamed from: S */
    public final void m18982S(AnonymousClass0PJ anonymousClass0PJ) {
        this.f38965S.clear();
        for (MediaSession mediaSession : this.f38960N) {
            AnonymousClass1Qs anonymousClass1Qs = new AnonymousClass1Qs();
            String B = mediaSession.m18991B();
            anonymousClass1Qs.f18482H = B;
            anonymousClass1Qs.f18481G = mediaSession;
            if (mediaSession.f38977C == AnonymousClass3CD.PHOTO) {
                anonymousClass1Qs.f18479E = mediaSession.f38976B.f38982E.m22015D();
            } else if (mediaSession.f38977C == AnonymousClass3CD.VIDEO) {
                AnonymousClass0OA LP = anonymousClass0PJ.LP(B);
                anonymousClass1Qs.f18483I = LP.AD;
                anonymousClass1Qs.f18478D = LP.f3815c;
                anonymousClass1Qs.f18477C = LP.bC.f17220Q;
                anonymousClass1Qs.f18476B = LP.bC.f17209F;
                anonymousClass1Qs.f18480F = LP.hB;
            }
            this.f38965S.add(anonymousClass1Qs);
        }
        this.f38956J = false;
    }

    /* renamed from: T */
    public final void m18983T(String str) {
        this.f38960N.clear();
        this.f38953G = null;
        this.f38956J = false;
        this.f38949C = str;
    }

    /* renamed from: U */
    public final void m18984U(float f) {
        m18968E().f38988B = f;
    }

    /* renamed from: V */
    public final CreationSession m18985V(Location location) {
        MediaSession mediaSession = this.f38953G;
        if (mediaSession.f38977C == AnonymousClass3CD.PHOTO) {
            mediaSession.f38976B.f38983F = location;
        } else {
            mediaSession.f38978D.f38994H = location;
        }
        return this;
    }

    /* renamed from: W */
    public final CreationSession m18986W(String str) {
        MediaSession mediaSession = this.f38953G;
        if (mediaSession.f38977C == AnonymousClass3CD.PHOTO) {
            mediaSession.f38976B.f38985H = str;
        } else {
            mediaSession.f38978D.f39000N = str;
        }
        return this;
    }

    /* renamed from: X */
    public final CreationSession m18987X(Bitmap bitmap, Rect rect) {
        this.f38963Q = bitmap;
        this.f38964R = rect;
        return this;
    }

    /* renamed from: Y */
    public final CreationSession m18988Y(String str) {
        MediaSession mediaSession = this.f38953G;
        if (mediaSession != null) {
            this.f38960N.remove(mediaSession);
            this.f38953G = null;
        }
        m18964A(str, false);
        return this;
    }

    /* renamed from: Z */
    public final CreationSession m18989Z(String str) {
        MediaSession mediaSession = this.f38953G;
        if (mediaSession != null) {
            this.f38960N.remove(mediaSession);
            this.f38953G = null;
        }
        m18964A(str, true);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f38951E.ordinal());
        parcel.writeParcelable(this.f38950D, i);
        parcel.writeInt(this.f38961O);
        parcel.writeTypedList(this.f38962P);
        AnonymousClass1Qp anonymousClass1Qp = this.f38952F;
        AnonymousClass1Qp anonymousClass1Qp2 = AnonymousClass1Qp.RECTANGULAR;
        int i2 = 1;
        parcel.writeByte((byte) (anonymousClass1Qp == anonymousClass1Qp2 ? 1 : 0));
        if (this.f38967U != anonymousClass1Qp2) {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
        parcel.writeInt(this.f38954H);
        parcel.writeParcelable(this.f38968V, i);
        parcel.writeTypedList(this.f38969W);
        parcel.writeTypedList(this.f38960N);
        MediaSession mediaSession = this.f38953G;
        parcel.writeInt(mediaSession != null ? this.f38960N.indexOf(mediaSession) : -1);
        parcel.writeString(this.f38959M);
        parcel.writeByte((byte) this.f38957K);
        parcel.writeString(this.f38949C);
        parcel.writeFloat(this.f38948B);
        parcel.writeInt(this.f38966T.size());
        for (Entry entry : this.f38966T.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
