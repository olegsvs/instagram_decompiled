package X;

import android.content.Context;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.0Xa */
public final class AnonymousClass0Xa {
    /* renamed from: B */
    public static boolean m5250B(AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0Tw anonymousClass0Tw, AnonymousClass0Tz anonymousClass0Tz) {
        boolean z = false;
        for (DirectThreadKey C : anonymousClass0Tz.f5321D) {
            z |= AnonymousClass0Xa.m5251C(anonymousClass0Ci, anonymousClass0Tw, anonymousClass0Tz, C);
        }
        return z;
    }

    /* renamed from: C */
    public static boolean m5251C(AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0Tw anonymousClass0Tw, AnonymousClass0Tz anonymousClass0Tz, DirectThreadKey directThreadKey) {
        AnonymousClass0WH S = anonymousClass0Tw.m4621S(directThreadKey);
        if (S != null) {
            AnonymousClass0W7 L = S.m5075L(anonymousClass0Tz.mo1289F(), anonymousClass0Tz.f5319B);
            if (L == null || L.f5885O == null) {
                Object obj;
                if ((L != null ? 1 : null) == null) {
                    L = AnonymousClass0W7.m4992C(anonymousClass0Ci, anonymousClass0Tz.mo1289F(), anonymousClass0Tz.mo1288E(), anonymousClass0Tz.f5320C, anonymousClass0Tz.f5322E, anonymousClass0Tz.f5319B);
                    L.f5894X = anonymousClass0Tz.f5324C;
                }
                String str = anonymousClass0Tz.f5325D;
                int hashCode = str.hashCode();
                if (hashCode != -948696717) {
                    if (hashCode != 1501196714) {
                        if (hashCode == 1885454214) {
                            if (str.equals("upload_failed_transient")) {
                                obj = 1;
                                switch (obj) {
                                    case null:
                                        L.m5029e(AnonymousClass0VM.UPLOADING);
                                        break;
                                    case 1:
                                        L.m5029e(AnonymousClass0VM.UPLOAD_FAILED);
                                        break;
                                    case 2:
                                        L.m5029e(AnonymousClass0VM.WILL_NOT_UPLOAD);
                                        break;
                                    default:
                                        break;
                                }
                                anonymousClass0Tw.m4637i(directThreadKey);
                                anonymousClass0Tw.m4607E(directThreadKey, L);
                                return true;
                            }
                        }
                    } else if (str.equals("upload_failed_permanent")) {
                        obj = 2;
                        switch (obj) {
                            case null:
                                L.m5029e(AnonymousClass0VM.UPLOADING);
                                break;
                            case 1:
                                L.m5029e(AnonymousClass0VM.UPLOAD_FAILED);
                                break;
                            case 2:
                                L.m5029e(AnonymousClass0VM.WILL_NOT_UPLOAD);
                                break;
                            default:
                                break;
                        }
                        anonymousClass0Tw.m4637i(directThreadKey);
                        anonymousClass0Tw.m4607E(directThreadKey, L);
                        return true;
                    }
                } else if (str.equals("queued")) {
                    obj = null;
                    switch (obj) {
                        case null:
                            L.m5029e(AnonymousClass0VM.UPLOADING);
                            break;
                        case 1:
                            L.m5029e(AnonymousClass0VM.UPLOAD_FAILED);
                            break;
                        case 2:
                            L.m5029e(AnonymousClass0VM.WILL_NOT_UPLOAD);
                            break;
                        default:
                            break;
                    }
                    anonymousClass0Tw.m4637i(directThreadKey);
                    anonymousClass0Tw.m4607E(directThreadKey, L);
                    return true;
                }
                obj = -1;
                switch (obj) {
                    case null:
                        L.m5029e(AnonymousClass0VM.UPLOADING);
                        break;
                    case 1:
                        L.m5029e(AnonymousClass0VM.UPLOAD_FAILED);
                        break;
                    case 2:
                        L.m5029e(AnonymousClass0VM.WILL_NOT_UPLOAD);
                        break;
                    default:
                        break;
                }
                anonymousClass0Tw.m4637i(directThreadKey);
                anonymousClass0Tw.m4607E(directThreadKey, L);
                return true;
            }
        } else if (!"upload_failed_permanent".equals(anonymousClass0Tz.f5325D)) {
            if (!"upload_failed_transient".equals(anonymousClass0Tz.f5325D)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public static AnonymousClass0W7 m5252D(AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0Tw anonymousClass0Tw, DirectThreadKey directThreadKey, AnonymousClass0V0 anonymousClass0V0, String str, Object obj) {
        AnonymousClass0WH S = anonymousClass0Tw.m4621S(directThreadKey);
        AnonymousClass0V0 anonymousClass0V02 = anonymousClass0V0;
        if (S != null) {
            AnonymousClass0W7 L = S.m5075L(anonymousClass0V0, str);
            if (L != null) {
                return L;
            }
        }
        return AnonymousClass0W7.m4992C(anonymousClass0Ci, anonymousClass0V02, obj, null, null, str);
    }

    /* renamed from: E */
    public static void m5253E(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Tw anonymousClass0Tw, AnonymousClass0Tz anonymousClass0Tz, AnonymousClass0VN anonymousClass0VN) {
        List list = anonymousClass0Tz.f5321D;
        boolean z = true;
        if (list.size() != 1) {
            z = false;
        }
        AnonymousClass0LH.m2924B(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) list.get(0);
        AnonymousClass0V0 F = anonymousClass0Tz.mo1289F();
        String str = anonymousClass0Tz.f5319B;
        if (!AnonymousClass0Yo.m5316C(AnonymousClass0Tw.m4598C(anonymousClass0Cm), directThreadKey, F, str)) {
            if ((anonymousClass0VN.f5720D ^ 1) != 0) {
                AnonymousClass0Yo.m5317D(anonymousClass0Cm, list, F, str, anonymousClass0VN);
            } else {
                AnonymousClass0Yo.m5318E(anonymousClass0Cm, list, F, str);
            }
            AnonymousClass0Yp.m5321D(context, anonymousClass0Cm, directThreadKey, F);
            anonymousClass0Tw.m4638j(directThreadKey, false);
        }
    }

    /* renamed from: F */
    public static void m5254F(AnonymousClass0Tw anonymousClass0Tw, AnonymousClass0Tz anonymousClass0Tz) {
        for (DirectThreadKey m : anonymousClass0Tz.f5321D) {
            anonymousClass0Tw.m4641m(m, null, anonymousClass0Tz.f5319B);
        }
    }
}
