package X;

import com.facebook.fbuploader.fbmediauploader.serialization.JsonField;
import java.util.List;

/* renamed from: X.1uV */
public final class AnonymousClass1uV {
    @JsonField(name = "endInvoked")
    /* renamed from: B */
    public boolean f24016B;
    @JsonField(name = "segments")
    /* renamed from: C */
    public List f24017C;
    @JsonField(name = "startInvoked")
    /* renamed from: D */
    public boolean f24018D;
    @JsonField(name = "streamId")
    /* renamed from: E */
    public String f24019E;
    @JsonField(name = "transferredSegments")
    /* renamed from: F */
    public List f24020F;
    @JsonField(name = "uploadJobResult")
    /* renamed from: G */
    public AnonymousClass1uW f24021G;

    public AnonymousClass1uV(boolean z, boolean z2, String str, AnonymousClass1uW anonymousClass1uW, List list, List list2) {
        this.f24018D = z;
        this.f24016B = z2;
        this.f24019E = str;
        this.f24021G = anonymousClass1uW;
        this.f24017C = list;
        this.f24020F = list2;
    }
}
