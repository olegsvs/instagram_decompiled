package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0EH */
public final class AnonymousClass0EH {
    /* renamed from: B */
    private static final ArrayList f1961B;

    static {
        r6 = new AnonymousClass0bX[39];
        String str = "es";
        r6[9] = new AnonymousClass0bX("es-ES", C0164R.string.no_translate_language_es_es, C0164R.string.language_es_es, new Locale(str, "ES"));
        r6[10] = new AnonymousClass0bX("es-LA", C0164R.string.no_translate_language_es_la, C0164R.string.language_es_la, new Locale(str, "LA"));
        r6[11] = new AnonymousClass0bX("fa-IR", C0164R.string.no_translate_language_fa_ir, C0164R.string.language_fa_ir, new Locale("fa", "IR"));
        r6[12] = new AnonymousClass0bX("fi-FI", C0164R.string.no_translate_language_fi_fi, C0164R.string.language_fi_fi, new Locale("fi", "FI"));
        r6[13] = new AnonymousClass0bX("fr-CA", C0164R.string.no_translate_language_fr_ca, C0164R.string.language_fr_ca, new Locale("fr", "CA"));
        r6[14] = new AnonymousClass0bX("fr-FR", C0164R.string.no_translate_language_fr_fr, C0164R.string.language_fr_fr, Locale.FRANCE);
        r6[15] = new AnonymousClass0bX("hr-HR", C0164R.string.no_translate_language_hr_hr, C0164R.string.language_hr_hr, new Locale("hr", "HR"));
        r6[16] = new AnonymousClass0bX("hu-HU", C0164R.string.no_translate_language_hu_hu, C0164R.string.language_hu_hu, new Locale("hu", "HU"));
        r6[17] = new AnonymousClass0bX("id-ID", C0164R.string.no_translate_language_id_id, C0164R.string.language_id_id, new Locale("id", "ID"));
        r6[18] = new AnonymousClass0bX("he-IL", C0164R.string.no_translate_language_he_il, C0164R.string.language_he_il, new Locale("he", "IL"));
        r6[19] = new AnonymousClass0bX("it-IT", C0164R.string.no_translate_language_it_it, C0164R.string.language_it_it, Locale.ITALY);
        r6[20] = new AnonymousClass0bX("ja-JP", C0164R.string.no_translate_language_ja_jp, C0164R.string.language_ja_jp, Locale.JAPAN);
        r6[21] = new AnonymousClass0bX("ko-KR", C0164R.string.no_translate_language_ko_kr, C0164R.string.language_ko_kr, Locale.KOREA);
        r6[22] = new AnonymousClass0bX("ms-MY", C0164R.string.no_translate_language_ms_my, C0164R.string.language_ms_my, new Locale("ms", "MY"));
        r6[23] = new AnonymousClass0bX("nb-NO", C0164R.string.no_translate_language_nb_no, C0164R.string.language_nb_no, new Locale("nb", "NO"));
        r6[24] = new AnonymousClass0bX("nl-NL", C0164R.string.no_translate_language_nl_nl, C0164R.string.language_nl_nl, new Locale("nl", "NL"));
        r6[25] = new AnonymousClass0bX("pl-PL", C0164R.string.no_translate_language_pl_pl, C0164R.string.language_pl_pl, new Locale("pl", "PL"));
        str = "pt";
        r6[26] = new AnonymousClass0bX("pt-BR", C0164R.string.no_translate_language_pt_br, C0164R.string.language_pt_br, new Locale(str, "BR"));
        r6[27] = new AnonymousClass0bX("pt-PT", C0164R.string.no_translate_language_pt_pt, C0164R.string.language_pt_pt, new Locale(str, "PT"));
        r6[28] = new AnonymousClass0bX("ro-RO", C0164R.string.no_translate_language_ro_ro, C0164R.string.language_ro_ro, new Locale("ro", "RO"));
        r6[29] = new AnonymousClass0bX("ru-RU", C0164R.string.no_translate_language_ru_ru, C0164R.string.language_ru_ru, new Locale("ru", "RU"));
        r6[30] = new AnonymousClass0bX("sv-SE", C0164R.string.no_translate_language_sv_se, C0164R.string.language_sv_se, new Locale("sv", "SE"));
        r6[31] = new AnonymousClass0bX("sk-SK", C0164R.string.no_translate_language_sk_sk, C0164R.string.language_sk_sk, new Locale("sk", "SK"));
        r6[32] = new AnonymousClass0bX("th-TH", C0164R.string.no_translate_language_th_th, C0164R.string.language_th_th, new Locale("th", "TH"));
        r6[33] = new AnonymousClass0bX("tl-PH", C0164R.string.no_translate_language_tl_ph, C0164R.string.language_tl_ph, new Locale("tl", "PH"));
        r6[34] = new AnonymousClass0bX("tr-TR", C0164R.string.no_translate_language_tr_tr, C0164R.string.language_tr_tr, new Locale("tr", "TR"));
        r6[35] = new AnonymousClass0bX("uk-UA", C0164R.string.no_translate_language_uk_ua, C0164R.string.language_uk_ua, new Locale("uk", "UA"));
        r6[36] = new AnonymousClass0bX("vi-VN", C0164R.string.no_translate_language_vi_vn, C0164R.string.language_vi_vn, new Locale("vi", "VN"));
        r6[37] = new AnonymousClass0bX("zh-CN", C0164R.string.no_translate_language_zh_cn, C0164R.string.language_zh_cn, Locale.SIMPLIFIED_CHINESE);
        r6[38] = new AnonymousClass0bX("zh-TW", C0164R.string.no_translate_language_zh_tw, C0164R.string.language_zh_tw, Locale.TAIWAN);
        f1961B = new ArrayList(Arrays.asList(r6));
    }

    /* renamed from: B */
    public static boolean m1372B() {
        if (!Locale.GERMANY.getCountry().equalsIgnoreCase(AnonymousClass0EH.m1375E().getCountry())) {
            if (!Locale.GERMANY.getCountry().equalsIgnoreCase(AnonymousClass0EH.m1377G().getCountry())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public static String m1373C() {
        return AnonymousClass1Ia.m10659B(AnonymousClass0EH.m1375E());
    }

    /* renamed from: D */
    public static String m1374D(Context context) {
        AnonymousClass0bX L = AnonymousClass0EH.m1382L(AnonymousClass0FH.f2099C.m1534F());
        if (L == null) {
            return context.getResources().getConfiguration().locale.getDisplayName();
        }
        return context.getString(L.f6806E);
    }

    /* renamed from: E */
    public static Locale m1375E() {
        AnonymousClass0bX L = AnonymousClass0EH.m1382L(AnonymousClass0FH.f2099C.m1534F());
        if (L == null) {
            return Locale.getDefault();
        }
        return L.f6805D;
    }

    /* renamed from: F */
    public static AnonymousClass0bX m1376F() {
        Locale G = AnonymousClass0EH.m1377G();
        return new AnonymousClass0bX(G.toString(), C0164R.string.language_device, C0164R.string.language_device, G);
    }

    /* renamed from: G */
    public static Locale m1377G() {
        return Resources.getSystem().getConfiguration().locale;
    }

    /* renamed from: H */
    public static List m1378H() {
        return new ArrayList(f1961B);
    }

    /* renamed from: I */
    public static boolean m1379I() {
        return AnonymousClass0FH.f2099C.m1534F() == null;
    }

    /* renamed from: J */
    public static void m1380J(Resources resources) {
        if (VERSION.SDK_INT > 24) {
            AnonymousClass0EH.m1381K(resources);
        }
    }

    /* renamed from: K */
    public static void m1381K(Resources resources) {
        String F = AnonymousClass0FH.f2099C.m1534F();
        Configuration configuration = new Configuration(resources.getConfiguration());
        if (((Boolean) AnonymousClass0CC.gF.m845G()).booleanValue() && F == null) {
            F = AnonymousClass0EH.m1377G().getLanguage();
        }
        if (TextUtils.isEmpty(F)) {
            configuration.setLayoutDirection(configuration.locale);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            AnonymousClass0bY.f6807B = null;
            return;
        }
        if (F.contains("-")) {
            configuration.locale = new Locale(F.substring(0, 2), F.substring(3));
        } else {
            configuration.locale = new Locale(F);
        }
        Locale.setDefault(configuration.locale);
        configuration.setLayoutDirection(configuration.locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        AnonymousClass0bY.f6807B = F;
    }

    /* renamed from: L */
    private static AnonymousClass0bX m1382L(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (AnonymousClass0bX anonymousClass0bX : AnonymousClass0EH.m1378H()) {
                if (anonymousClass0bX.f6803B.equals(str)) {
                    return anonymousClass0bX;
                }
            }
        }
        return null;
    }
}
