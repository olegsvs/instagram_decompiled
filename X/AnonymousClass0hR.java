package X;

import android.content.Context;
import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: X.0hR */
public final class AnonymousClass0hR {
    /* renamed from: B */
    public static AnonymousClass0Iu m6746B(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ny anonymousClass0Ny, boolean z, boolean z2) {
        String str = "archive/reel/day_shells/";
        String str2 = "include_cover";
        String str3 = "include_suggested_highlights";
        AnonymousClass0Qu anonymousClass0Qu = new AnonymousClass0Qu();
        anonymousClass0Qu.m4077H(str2, z ? "1" : "0");
        anonymousClass0Qu.m4077H(str3, Boolean.toString(z2));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("v1:");
        stringBuilder.append(str);
        String E = anonymousClass0Qu.m4074E(stringBuilder.toString());
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = str;
        anonymousClass0Pt = anonymousClass0Pt.m3935D(str2, z ? "1" : "0").m3936E(str3, z2);
        anonymousClass0Pt.f4220D = anonymousClass0Ny;
        anonymousClass0Pt.f4219C = E;
        return anonymousClass0Pt.m3944M(AnonymousClass30N.class).m3939H();
    }

    /* renamed from: C */
    public static AnonymousClass0Iu m6747C(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass30z anonymousClass30z, Set set, String str, String str2, String str3, List list, String str4) {
        JSONArray jSONArray = new JSONArray();
        for (String put : set) {
            jSONArray.put(put);
        }
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "highlights/create_reel/";
        AnonymousClass0Pt D = anonymousClass0Pt.m3935D("creation_id", String.valueOf(System.currentTimeMillis())).m3935D("source", anonymousClass30z.f36895B).m3935D("media_ids", jSONArray.toString()).m3935D(DialogModule.KEY_TITLE, str);
        AnonymousClass0RF.m4129C(D, anonymousClass0Cm);
        AnonymousClass0hR.m6752H(D, str2, str3, list);
        if (str4 != null) {
            D.m3935D("suggested_reel_id", str4);
        }
        return D.m3944M(AnonymousClass30T.class).m3945N().m3939H();
    }

    /* renamed from: D */
    public static AnonymousClass0Iu m6748D(AnonymousClass0Cm anonymousClass0Cm, String str, AnonymousClass0Ny anonymousClass0Ny, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("highlights/");
        stringBuilder.append(str);
        stringBuilder.append("/highlights_tray/");
        String stringBuilder2 = stringBuilder.toString();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = stringBuilder2;
        anonymousClass0Pt.f4220D = anonymousClass0Ny;
        anonymousClass0Pt.f4219C = stringBuilder2;
        anonymousClass0Pt.m3944M(AnonymousClass3Ux.class);
        AnonymousClass0RF.m4129C(anonymousClass0Pt, anonymousClass0Cm);
        return anonymousClass0Pt.m3939H();
    }

    /* renamed from: E */
    public static AnonymousClass0Iu m6749E(AnonymousClass0Cm anonymousClass0Cm, String str, AnonymousClass30z anonymousClass30z, Set set, Set set2, String str2, String str3, String str4, List list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : set) {
            jSONArray.put(put);
        }
        JSONArray jSONArray2 = new JSONArray();
        for (String put2 : set2) {
            jSONArray2.put(put2);
        }
        String E = AnonymousClass0IE.m2137E("highlights/%s/edit_reel/", str);
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = E;
        AnonymousClass0Pt D = anonymousClass0Pt.m3935D("source", anonymousClass30z.f36895B).m3935D("added_media_ids", jSONArray.toString()).m3935D("removed_media_ids", jSONArray2.toString());
        if (str2 != null) {
            D.m3935D(DialogModule.KEY_TITLE, str2);
        }
        AnonymousClass0RF.m4129C(D, anonymousClass0Cm);
        AnonymousClass0hR.m6752H(D, str3, str4, list);
        return D.m3944M(AnonymousClass30T.class).m3945N().m3939H();
    }

    /* renamed from: F */
    public static AnonymousClass0Iu m6750F(AnonymousClass0Cm anonymousClass0Cm, boolean z, boolean z2, AnonymousClass0Iw anonymousClass0Iw) {
        String A;
        AnonymousClass0Ci B = anonymousClass0Cm.m1037B();
        AnonymousClass0Lt X = B.m1007X();
        Object obj = ((z2 || X == AnonymousClass0Lt.UNSET) && !z) ? 1 : null;
        B.CC = z ? AnonymousClass0Lt.ON : AnonymousClass0Lt.OFF;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "users/set_reel_settings/";
        String str = "reel_auto_archive";
        if (z) {
            A = AnonymousClass0Lt.ON.m3036A();
        } else {
            A = AnonymousClass0Lt.OFF.m3036A();
        }
        anonymousClass0Pt = anonymousClass0Pt.m3935D(str, A);
        if (obj != null) {
            anonymousClass0Pt.m3935D("check_pending_archive", "1");
        }
        AnonymousClass0Iu H = anonymousClass0Pt.m3944M(AnonymousClass0Pv.class).m3945N().m3939H();
        H.f2849B = new AnonymousClass1Uk(anonymousClass0Iw, B, X);
        return H;
    }

    /* renamed from: G */
    public static void m6751G(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0yh anonymousClass0yh, Context context, AnonymousClass0IU anonymousClass0IU) {
        String str = anonymousClass0yh == AnonymousClass0yh.ARCHIVED ? "media/%s/only_me/" : "media/%s/undo_only_me/";
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = AnonymousClass0IE.m2137E(str, anonymousClass0P7.getId());
        AnonymousClass0GA H = anonymousClass0Pt.m3935D("media_id", anonymousClass0P7.getId()).m3944M(AnonymousClass0Pv.class).m3945N().m3939H();
        H.f2849B = new AnonymousClass30G(anonymousClass0IU, anonymousClass0P7, anonymousClass0yh, context);
        AnonymousClass114.m8781E(anonymousClass0IU);
        AnonymousClass0Ix.m2382B().schedule(H);
    }

    /* renamed from: H */
    private static void m6752H(AnonymousClass0Pt anonymousClass0Pt, String str, String str2, List list) {
        boolean z;
        Writer stringWriter;
        JsonGenerator createGenerator;
        if (str != null) {
            if (str2 != null) {
                z = false;
                AnonymousClass0LH.m2931I(z, "Cover media id and cover upload id cannot both be set");
                if (str == null || str2 != null) {
                    stringWriter = new StringWriter();
                    createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
                    createGenerator.writeStartObject();
                    if (str == null) {
                        createGenerator.writeStringField("media_id", str);
                    } else {
                        createGenerator.writeStringField("upload_id", str2);
                    }
                    if (list != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("[");
                        stringBuilder.append(AnonymousClass0RR.m4156B(',').m4158A(list));
                        stringBuilder.append("]");
                        createGenerator.writeStringField("crop_rect", stringBuilder.toString());
                    }
                    createGenerator.writeEndObject();
                    createGenerator.close();
                    anonymousClass0Pt.m3935D("cover", stringWriter.toString());
                }
                return;
            }
        }
        z = true;
        AnonymousClass0LH.m2931I(z, "Cover media id and cover upload id cannot both be set");
        if (str == null) {
        }
        stringWriter = new StringWriter();
        try {
            createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartObject();
            if (str == null) {
                createGenerator.writeStringField("upload_id", str2);
            } else {
                createGenerator.writeStringField("media_id", str);
            }
            if (list != null) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("[");
                stringBuilder2.append(AnonymousClass0RR.m4156B(',').m4158A(list));
                stringBuilder2.append("]");
                createGenerator.writeStringField("crop_rect", stringBuilder2.toString());
            }
            createGenerator.writeEndObject();
            createGenerator.close();
            anonymousClass0Pt.m3935D("cover", stringWriter.toString());
        } catch (Throwable e) {
            AnonymousClass0Gn.m1878E("ArchiveApiUtil", "Unable to add highlights cover image data", e);
        }
    }
}
