package X;

import android.location.Location;
import com.facebook.common.stringformat.StringFormatUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.5Yi */
public final class AnonymousClass5Yi {
    /* renamed from: B */
    public AnonymousClass0P7 f66288B;
    /* renamed from: C */
    public AnonymousClass0MI f66289C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass4yc f66290D;

    public AnonymousClass5Yi(AnonymousClass4yc anonymousClass4yc) {
        this.f66290D = anonymousClass4yc;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final java.lang.String m27560A() {
        /*
        r3 = this;
        r0 = r3.f66290D;
        r0 = r0.f58997D;
        r0 = r0.B();
        r2 = 0;
        if (r0 == 0) goto L_0x0018;
    L_0x000b:
        r1 = 0;
        r0 = r3.f66290D;
        r0 = r0.f58998E;
        r0 = r0.ordinal();
        switch(r0) {
            case 0: goto L_0x0018;
            case 1: goto L_0x001d;
            case 2: goto L_0x0018;
            case 3: goto L_0x0019;
            default: goto L_0x0017;
        };
    L_0x0017:
        goto L_0x0020;
    L_0x0018:
        return r2;
    L_0x0019:
        r1 = 2131691714; // 0x7f0f08c2 float:1.9012508E38 double:1.0531956434E-314;
        goto L_0x0020;
    L_0x001d:
        r1 = 2131693100; // 0x7f0f0e2c float:1.9015319E38 double:1.053196328E-314;
    L_0x0020:
        r0 = r3.f66290D;
        r0 = r0.getContext();
        r0 = r0.getString(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5Yi.A():java.lang.String");
    }

    /* renamed from: B */
    public final AnonymousClass3Sh m27561B() {
        String str = null;
        if ("facebook_events".equals(this.f66290D.f59012S.f6707D)) {
            return null;
        }
        String str2;
        AnonymousClass0MI anonymousClass0MI;
        AnonymousClass0P7 anonymousClass0P7;
        String B;
        boolean F;
        boolean z;
        if (this.f66290D.f59001H != null) {
            if (this.f66290D.f59001H.f41417C != null) {
                str2 = this.f66290D.f59001H.f41417C;
                anonymousClass0MI = this.f66289C;
                anonymousClass0P7 = this.f66288B;
                B = AnonymousClass5Yi.m27559B(this);
                if (this.f66290D.f59001H == null) {
                    str = this.f66290D.f59001H.f41418D;
                }
                F = this.f66290D.f59001H != null ? true : this.f66290D.f59001H.F();
                if (this.f66290D.f59001H != null) {
                    z = false;
                } else {
                    z = AnonymousClass3Sp.B(this.f66290D.f59001H);
                }
                return new AnonymousClass3Sh(anonymousClass0MI, anonymousClass0P7, str2, B, str, F, z);
            }
        }
        str2 = this.f66290D.f59012S.f6716M;
        anonymousClass0MI = this.f66289C;
        anonymousClass0P7 = this.f66288B;
        B = AnonymousClass5Yi.m27559B(this);
        if (this.f66290D.f59001H == null) {
            str = this.f66290D.f59001H.f41418D;
        }
        if (this.f66290D.f59001H != null) {
        }
        if (this.f66290D.f59001H != null) {
            z = AnonymousClass3Sp.B(this.f66290D.f59001H);
        } else {
            z = false;
        }
        return new AnonymousClass3Sh(anonymousClass0MI, anonymousClass0P7, str2, B, str, F, z);
    }

    /* renamed from: B */
    private static String m27559B(AnonymousClass5Yi anonymousClass5Yi) {
        if (!(!AnonymousClass0JI.isLocationPermitted(anonymousClass5Yi.f66290D.getContext()) || AnonymousClass0JI.getInstance() == null || anonymousClass5Yi.f66290D.f59012S == null || anonymousClass5Yi.f66290D.f59012S.f6713J == null)) {
            if (anonymousClass5Yi.f66290D.f59012S.f6714K != null) {
                Location lastLocation = AnonymousClass0JI.getInstance().getLastLocation();
                if (lastLocation != null) {
                    String stringBuilder;
                    float[] fArr = new float[1];
                    Location.distanceBetween(lastLocation.getLatitude(), lastLocation.getLongitude(), anonymousClass5Yi.f66290D.f59012S.f6713J.doubleValue(), anonymousClass5Yi.f66290D.f59012S.f6714K.doubleValue(), fArr);
                    String country = anonymousClass5Yi.f66290D.getContext().getResources().getConfiguration().locale.getCountry();
                    String str = "km";
                    int i = 0;
                    float f = fArr[0] / 1000.0f;
                    double d = 32.2d;
                    String[] strArr = AnonymousClass4yc.f58993d;
                    int length = strArr.length;
                    while (i < length) {
                        if (country.equals(strArr[i])) {
                            f *= 0.6213712f;
                            str = "mi";
                            d = 20.0d;
                            break;
                        }
                        i++;
                    }
                    StringBuilder stringBuilder2;
                    if (((double) f) > d) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(StringFormatUtil.formatStrLocaleSafe("%d", Integer.valueOf((int) f)));
                        stringBuilder2.append(str);
                        stringBuilder = stringBuilder2.toString();
                    } else {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(StringFormatUtil.formatStrLocaleSafe("%.1f ", Float.valueOf(f)));
                        stringBuilder2.append(str);
                        stringBuilder = stringBuilder2.toString();
                    }
                    return stringBuilder;
                }
            }
        }
        return JsonProperty.USE_DEFAULT_NAME;
    }
}
